package com.google.android.gms.org.conscrypt;

import com.google.android.gms.org.conscrypt.ExternalSession;
import com.google.android.gms.org.conscrypt.NativeCrypto;
import com.google.android.gms.org.conscrypt.NativeRef;
import com.google.android.gms.org.conscrypt.NativeSsl;
import com.google.android.gms.org.conscrypt.SSLParametersImpl;
import java.io.IOException;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.nio.ReadOnlyBufferException;
import java.security.InvalidKeyException;
import java.security.Principal;
import java.security.PrivateKey;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.security.interfaces.ECKey;
import java.security.spec.ECParameterSpec;
import javax.crypto.SecretKey;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLEngineResult;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSession;
import javax.net.ssl.X509ExtendedKeyManager;
import javax.net.ssl.X509KeyManager;
import javax.net.ssl.X509TrustManager;
import javax.security.auth.x500.X500Principal;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ConscryptEngine extends AbstractConscryptEngine implements NativeCrypto.SSLHandshakeCallbacks, SSLParametersImpl.AliasChooser, SSLParametersImpl.PSKCallbacks {
    private static final SSLEngineResult CLOSED_NOT_HANDSHAKING = new SSLEngineResult(SSLEngineResult.Status.CLOSED, SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING, 0, 0);
    private static final SSLEngineResult NEED_UNWRAP_CLOSED = new SSLEngineResult(SSLEngineResult.Status.CLOSED, SSLEngineResult.HandshakeStatus.NEED_UNWRAP, 0, 0);
    private static final SSLEngineResult NEED_UNWRAP_OK = new SSLEngineResult(SSLEngineResult.Status.OK, SSLEngineResult.HandshakeStatus.NEED_UNWRAP, 0, 0);
    private static final SSLEngineResult NEED_WRAP_CLOSED = new SSLEngineResult(SSLEngineResult.Status.CLOSED, SSLEngineResult.HandshakeStatus.NEED_WRAP, 0, 0);
    private static final SSLEngineResult NEED_WRAP_OK = new SSLEngineResult(SSLEngineResult.Status.OK, SSLEngineResult.HandshakeStatus.NEED_WRAP, 0, 0);
    private static BufferAllocator defaultBufferAllocator = null;
    private ActiveSession activeSession;
    private BufferAllocator bufferAllocator = defaultBufferAllocator;
    private OpenSSLKey channelIdPrivateKey;
    private SessionSnapshot closedSession;
    private final SSLSession externalSession = Platform.wrapSSLSession(new ExternalSession(new ExternalSession.Provider() {
        public ConscryptSession provideSession() {
            return ConscryptEngine.this.provideSession();
        }
    }));
    private boolean handshakeFinished;
    private HandshakeListener handshakeListener;
    private ByteBuffer lazyDirectBuffer;
    private int maxSealOverhead;
    private final NativeSsl.BioWrapper networkBio;
    private String peerHostname;
    private final PeerInfoProvider peerInfoProvider;
    private final ByteBuffer[] singleDstBuffer = new ByteBuffer[1];
    private final ByteBuffer[] singleSrcBuffer = new ByteBuffer[1];
    private final NativeSsl ssl;
    private final SSLParametersImpl sslParameters;
    private int state = 0;

    public ConscryptEngine(SSLParametersImpl sSLParametersImpl) {
        this.sslParameters = sSLParametersImpl;
        this.peerInfoProvider = PeerInfoProvider.nullProvider();
        NativeSsl newSsl = newSsl(sSLParametersImpl, this);
        this.ssl = newSsl;
        this.networkBio = newSsl.newBio();
    }

    private void beginHandshakeInternal() {
        int i = this.state;
        if (i == 0) {
            throw new IllegalStateException("Client/server mode must be set before handshake");
        } else if (i == 1) {
            transitionTo(2);
            try {
                this.ssl.initialize(getHostname(), this.channelIdPrivateKey);
                if (getUseClientMode()) {
                    NativeSslSession cachedSession = clientSessionContext().getCachedSession(getHostname(), getPeerPort(), this.sslParameters);
                    if (cachedSession != null) {
                        cachedSession.offerToResume(this.ssl);
                    }
                }
                this.maxSealOverhead = this.ssl.getMaxSealOverhead();
                handshake();
            } catch (IOException e) {
                if (e.getMessage().contains("unexpected CCS")) {
                    Platform.logEvent(String.format("ssl_unexpected_ccs: host=%s", new Object[]{getPeerHost()}));
                }
                throw SSLUtils.toSSLHandshakeException(e);
            } catch (Throwable th) {
                closeAndFreeResources();
                throw th;
            }
        } else if (i == 6 || i == 7 || i == 8) {
            throw new IllegalStateException("Engine has already been closed");
        }
    }

    private static int calcDstsLength(ByteBuffer[] byteBufferArr, int i, int i2) {
        boolean z;
        int i3 = 0;
        int i4 = 0;
        while (i3 < byteBufferArr.length) {
            ByteBuffer byteBuffer = byteBufferArr[i3];
            if (byteBuffer != null) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkArgument(z, "dsts[%d] is null", Integer.valueOf(i3));
            if (!byteBuffer.isReadOnly()) {
                if (i3 >= i && i3 < i + i2) {
                    i4 += byteBuffer.remaining();
                }
                i3++;
            } else {
                throw new ReadOnlyBufferException();
            }
        }
        return i4;
    }

    private static long calcSrcsLength(ByteBuffer[] byteBufferArr, int i, int i2) {
        long j = 0;
        while (i < i2) {
            ByteBuffer byteBuffer = byteBufferArr[i];
            if (byteBuffer != null) {
                j += (long) byteBuffer.remaining();
                i++;
            } else {
                StringBuilder sb = new StringBuilder(25);
                sb.append("srcs[");
                sb.append(i);
                sb.append("] is null");
                throw new IllegalArgumentException(sb.toString());
            }
        }
        return j;
    }

    private ClientSessionContext clientSessionContext() {
        return this.sslParameters.getClientSessionContext();
    }

    private void closeAll() {
        closeOutbound();
        closeInbound();
    }

    private void closeAndFreeResources() {
        transitionTo(8);
        if (!this.ssl.isClosed()) {
            this.ssl.close();
            this.networkBio.close();
        }
    }

    private SSLException convertException(Throwable th) {
        if ((th instanceof SSLHandshakeException) || !this.handshakeFinished) {
            return SSLUtils.toSSLHandshakeException(th);
        }
        return SSLUtils.toSSLException(th);
    }

    private long directByteBufferAddress(ByteBuffer byteBuffer, int i) {
        return NativeCrypto.getDirectBufferAddress(byteBuffer) + ((long) i);
    }

    private void finishHandshake() {
        this.handshakeFinished = true;
        HandshakeListener handshakeListener2 = this.handshakeListener;
        if (handshakeListener2 != null) {
            handshakeListener2.onHandshakeFinished();
        }
    }

    private void freeIfDone() {
        if (isInboundDone() && isOutboundDone()) {
            closeAndFreeResources();
        }
    }

    static BufferAllocator getDefaultBufferAllocator() {
        return defaultBufferAllocator;
    }

    private SSLEngineResult.Status getEngineStatus() {
        int i = this.state;
        if (i == 6 || i == 7 || i == 8) {
            return SSLEngineResult.Status.CLOSED;
        }
        return SSLEngineResult.Status.OK;
    }

    private SSLEngineResult.HandshakeStatus getHandshakeStatus(int i) {
        return this.handshakeFinished ? SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING : pendingStatus(i);
    }

    private SSLEngineResult.HandshakeStatus getHandshakeStatusInternal() {
        if (this.handshakeFinished) {
            return SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING;
        }
        int i = this.state;
        switch (i) {
            case 0:
            case 1:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING;
            case 2:
                return pendingStatus(pendingOutboundEncryptedBytes());
            case 3:
                return SSLEngineResult.HandshakeStatus.NEED_WRAP;
            default:
                StringBuilder sb = new StringBuilder(36);
                sb.append("Unexpected engine state: ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
        }
    }

    private ByteBuffer getOrCreateLazyDirectBuffer() {
        if (this.lazyDirectBuffer == null) {
            this.lazyDirectBuffer = ByteBuffer.allocateDirect(Math.max(16384, 16709));
        }
        this.lazyDirectBuffer.clear();
        return this.lazyDirectBuffer;
    }

    private SSLEngineResult.HandshakeStatus handshake() {
        try {
            int doHandshake = this.ssl.doHandshake();
            if (doHandshake == 2) {
                return pendingStatus(pendingOutboundEncryptedBytes());
            }
            if (doHandshake == 3) {
                return SSLEngineResult.HandshakeStatus.NEED_WRAP;
            }
            this.activeSession.onPeerCertificateAvailable(getPeerHost(), getPeerPort());
            finishHandshake();
            return SSLEngineResult.HandshakeStatus.FINISHED;
        } catch (SSLException e) {
            sendSSLShutdown();
            throw e;
        } catch (IOException e2) {
            sendSSLShutdown();
            throw e2;
        } catch (Exception e3) {
            throw SSLUtils.toSSLHandshakeException(e3);
        }
    }

    private boolean isHandshakeStarted() {
        int i = this.state;
        return (i == 0 || i == 1) ? false : true;
    }

    private SSLEngineResult.HandshakeStatus mayFinishHandshake(SSLEngineResult.HandshakeStatus handshakeStatus) {
        return (this.handshakeFinished || handshakeStatus != SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING) ? handshakeStatus : handshake();
    }

    private SSLEngineResult newResult(int i, int i2, SSLEngineResult.HandshakeStatus handshakeStatus) {
        SSLEngineResult.Status engineStatus = getEngineStatus();
        if (handshakeStatus != SSLEngineResult.HandshakeStatus.FINISHED) {
            handshakeStatus = getHandshakeStatusInternal();
        }
        return new SSLEngineResult(engineStatus, mayFinishHandshake(handshakeStatus), i, i2);
    }

    private static NativeSsl newSsl(SSLParametersImpl sSLParametersImpl, ConscryptEngine conscryptEngine) {
        try {
            return NativeSsl.newInstance(sSLParametersImpl, conscryptEngine, conscryptEngine, conscryptEngine);
        } catch (SSLException e) {
            throw new RuntimeException(e);
        }
    }

    private SSLException newSslExceptionWithMessage(String str) {
        if (!this.handshakeFinished) {
            return new SSLException(str);
        }
        return new SSLHandshakeException(str);
    }

    private int pendingInboundCleartextBytes() {
        return this.ssl.getPendingReadableBytes();
    }

    private static SSLEngineResult.HandshakeStatus pendingStatus(int i) {
        return i <= 0 ? SSLEngineResult.HandshakeStatus.NEED_UNWRAP : SSLEngineResult.HandshakeStatus.NEED_WRAP;
    }

    /* access modifiers changed from: private */
    public ConscryptSession provideHandshakeSession() {
        ConscryptSession conscryptSession;
        synchronized (this.ssl) {
            if (this.state == 2) {
                conscryptSession = this.activeSession;
            } else {
                conscryptSession = SSLNullSession.getNullSession();
            }
        }
        return conscryptSession;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0012, code lost:
        return r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.gms.org.conscrypt.ConscryptSession provideSession() {
        /*
            r3 = this;
            com.google.android.gms.org.conscrypt.NativeSsl r0 = r3.ssl
            monitor-enter(r0)
            int r1 = r3.state     // Catch:{ all -> 0x0020 }
            r2 = 8
            if (r1 != r2) goto L_0x0013
            com.google.android.gms.org.conscrypt.SessionSnapshot r1 = r3.closedSession     // Catch:{ all -> 0x0020 }
            if (r1 != 0) goto L_0x0011
            com.google.android.gms.org.conscrypt.ConscryptSession r1 = com.google.android.gms.org.conscrypt.SSLNullSession.getNullSession()     // Catch:{ all -> 0x0020 }
        L_0x0011:
            monitor-exit(r0)     // Catch:{ all -> 0x0020 }
            return r1
        L_0x0013:
            r2 = 3
            if (r1 < r2) goto L_0x001a
            com.google.android.gms.org.conscrypt.ActiveSession r1 = r3.activeSession     // Catch:{ all -> 0x0020 }
            monitor-exit(r0)     // Catch:{ all -> 0x0020 }
            return r1
        L_0x001a:
            com.google.android.gms.org.conscrypt.ConscryptSession r1 = com.google.android.gms.org.conscrypt.SSLNullSession.getNullSession()     // Catch:{ all -> 0x0020 }
            monitor-exit(r0)     // Catch:{ all -> 0x0020 }
            return r1
        L_0x0020:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0020 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.org.conscrypt.ConscryptEngine.provideSession():com.google.android.gms.org.conscrypt.ConscryptSession");
    }

    private int readEncryptedData(ByteBuffer byteBuffer, int i) {
        try {
            int position = byteBuffer.position();
            if (byteBuffer.remaining() < i) {
                return 0;
            }
            int min = Math.min(i, byteBuffer.limit() - position);
            if (!byteBuffer.isDirect()) {
                return readEncryptedDataHeap(byteBuffer, min);
            }
            int readEncryptedDataDirect = readEncryptedDataDirect(byteBuffer, position, min);
            if (readEncryptedDataDirect > 0) {
                byteBuffer.position(position + readEncryptedDataDirect);
            }
            return readEncryptedDataDirect;
        } catch (Exception e) {
            throw convertException(e);
        }
    }

    private int readEncryptedDataDirect(ByteBuffer byteBuffer, int i, int i2) {
        return this.networkBio.readDirectByteBuffer(directByteBufferAddress(byteBuffer, i), i2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0035  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int readEncryptedDataHeap(java.nio.ByteBuffer r5, int r6) {
        /*
            r4 = this;
            r0 = 0
            com.google.android.gms.org.conscrypt.BufferAllocator r1 = r4.bufferAllocator     // Catch:{ all -> 0x0032 }
            if (r1 == 0) goto L_0x000e
            com.google.android.gms.org.conscrypt.AllocatedBuffer r0 = r1.allocateDirectBuffer(r6)     // Catch:{ all -> 0x0032 }
            java.nio.ByteBuffer r1 = r0.nioBuffer()     // Catch:{ all -> 0x0030 }
            goto L_0x0012
        L_0x000e:
            java.nio.ByteBuffer r1 = r4.getOrCreateLazyDirectBuffer()     // Catch:{ all -> 0x0032 }
        L_0x0012:
            r2 = 0
            int r3 = r1.remaining()     // Catch:{ all -> 0x0030 }
            int r6 = java.lang.Math.min(r6, r3)     // Catch:{ all -> 0x0030 }
            int r6 = r4.readEncryptedDataDirect(r1, r2, r6)     // Catch:{ all -> 0x0030 }
            if (r6 <= 0) goto L_0x002a
            r1.position(r6)     // Catch:{ all -> 0x0030 }
            r1.flip()     // Catch:{ all -> 0x0030 }
            r5.put(r1)     // Catch:{ all -> 0x0030 }
        L_0x002a:
            if (r0 == 0) goto L_0x002f
            r0.release()
        L_0x002f:
            return r6
        L_0x0030:
            r5 = move-exception
            goto L_0x0033
        L_0x0032:
            r5 = move-exception
        L_0x0033:
            if (r0 == 0) goto L_0x0038
            r0.release()
        L_0x0038:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.org.conscrypt.ConscryptEngine.readEncryptedDataHeap(java.nio.ByteBuffer, int):int");
    }

    private SSLEngineResult readPendingBytesFromBIO(ByteBuffer byteBuffer, int i, int i2, SSLEngineResult.HandshakeStatus handshakeStatus) {
        try {
            int pendingOutboundEncryptedBytes = pendingOutboundEncryptedBytes();
            if (pendingOutboundEncryptedBytes <= 0) {
                return null;
            }
            if (byteBuffer.remaining() >= pendingOutboundEncryptedBytes) {
                int readEncryptedData = readEncryptedData(byteBuffer, pendingOutboundEncryptedBytes);
                if (readEncryptedData > 0) {
                    i2 += readEncryptedData;
                    pendingOutboundEncryptedBytes -= readEncryptedData;
                } else {
                    NativeCrypto.SSL_clear_error();
                }
                SSLEngineResult.Status engineStatus = getEngineStatus();
                if (handshakeStatus != SSLEngineResult.HandshakeStatus.FINISHED) {
                    handshakeStatus = getHandshakeStatus(pendingOutboundEncryptedBytes);
                }
                return new SSLEngineResult(engineStatus, mayFinishHandshake(handshakeStatus), i, i2);
            }
            SSLEngineResult.Status status = SSLEngineResult.Status.BUFFER_OVERFLOW;
            if (handshakeStatus != SSLEngineResult.HandshakeStatus.FINISHED) {
                handshakeStatus = getHandshakeStatus(pendingOutboundEncryptedBytes);
            }
            return new SSLEngineResult(status, mayFinishHandshake(handshakeStatus), i, i2);
        } catch (Exception e) {
            throw convertException(e);
        }
    }

    private int readPlaintextData(ByteBuffer byteBuffer) {
        try {
            int position = byteBuffer.position();
            int min = Math.min(16709, byteBuffer.limit() - position);
            if (!byteBuffer.isDirect()) {
                return readPlaintextDataHeap(byteBuffer, min);
            }
            int readPlaintextDataDirect = readPlaintextDataDirect(byteBuffer, position, min);
            if (readPlaintextDataDirect > 0) {
                byteBuffer.position(position + readPlaintextDataDirect);
            }
            return readPlaintextDataDirect;
        } catch (CertificateException e) {
            throw convertException(e);
        }
    }

    private int readPlaintextDataDirect(ByteBuffer byteBuffer, int i, int i2) {
        return this.ssl.readDirectByteBuffer(directByteBufferAddress(byteBuffer, i), i2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0035  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int readPlaintextDataHeap(java.nio.ByteBuffer r5, int r6) {
        /*
            r4 = this;
            r0 = 0
            com.google.android.gms.org.conscrypt.BufferAllocator r1 = r4.bufferAllocator     // Catch:{ all -> 0x0032 }
            if (r1 == 0) goto L_0x000e
            com.google.android.gms.org.conscrypt.AllocatedBuffer r0 = r1.allocateDirectBuffer(r6)     // Catch:{ all -> 0x0032 }
            java.nio.ByteBuffer r1 = r0.nioBuffer()     // Catch:{ all -> 0x0030 }
            goto L_0x0012
        L_0x000e:
            java.nio.ByteBuffer r1 = r4.getOrCreateLazyDirectBuffer()     // Catch:{ all -> 0x0032 }
        L_0x0012:
            r2 = 0
            int r3 = r1.remaining()     // Catch:{ all -> 0x0030 }
            int r6 = java.lang.Math.min(r6, r3)     // Catch:{ all -> 0x0030 }
            int r6 = r4.readPlaintextDataDirect(r1, r2, r6)     // Catch:{ all -> 0x0030 }
            if (r6 <= 0) goto L_0x002a
            r1.position(r6)     // Catch:{ all -> 0x0030 }
            r1.flip()     // Catch:{ all -> 0x0030 }
            r5.put(r1)     // Catch:{ all -> 0x0030 }
        L_0x002a:
            if (r0 == 0) goto L_0x002f
            r0.release()
        L_0x002f:
            return r6
        L_0x0030:
            r5 = move-exception
            goto L_0x0033
        L_0x0032:
            r5 = move-exception
        L_0x0033:
            if (r0 == 0) goto L_0x0038
            r0.release()
        L_0x0038:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.org.conscrypt.ConscryptEngine.readPlaintextDataHeap(java.nio.ByteBuffer, int):int");
    }

    private void resetSingleDstBuffer() {
        this.singleDstBuffer[0] = null;
    }

    private void resetSingleSrcBuffer() {
        this.singleSrcBuffer[0] = null;
    }

    private void sendSSLShutdown() {
        try {
            this.ssl.shutdown();
        } catch (IOException e) {
        }
    }

    private AbstractSessionContext sessionContext() {
        return this.sslParameters.getSessionContext();
    }

    static void setDefaultBufferAllocator(BufferAllocator bufferAllocator2) {
        defaultBufferAllocator = bufferAllocator2;
    }

    private ByteBuffer[] singleDstBuffer(ByteBuffer byteBuffer) {
        ByteBuffer[] byteBufferArr = this.singleDstBuffer;
        byteBufferArr[0] = byteBuffer;
        return byteBufferArr;
    }

    private ByteBuffer[] singleSrcBuffer(ByteBuffer byteBuffer) {
        ByteBuffer[] byteBufferArr = this.singleSrcBuffer;
        byteBufferArr[0] = byteBuffer;
        return byteBufferArr;
    }

    private void transitionTo(int i) {
        int i2;
        if (i == 2) {
            this.handshakeFinished = false;
            this.activeSession = new ActiveSession(this.ssl, this.sslParameters.getSessionContext());
        } else if (i == 8 && !this.ssl.isClosed() && (i2 = this.state) >= 2 && i2 < 8) {
            this.closedSession = new SessionSnapshot(this.activeSession);
        }
        this.state = i;
    }

    private int writeEncryptedData(ByteBuffer byteBuffer, int i) {
        int i2;
        try {
            int position = byteBuffer.position();
            if (!byteBuffer.isDirect()) {
                i2 = writeEncryptedDataHeap(byteBuffer, position, i);
            } else {
                i2 = writeEncryptedDataDirect(byteBuffer, position, i);
            }
            if (i2 > 0) {
                byteBuffer.position(position + i2);
            }
            return i2;
        } catch (IOException e) {
            throw new SSLException(e);
        }
    }

    private int writeEncryptedDataDirect(ByteBuffer byteBuffer, int i, int i2) {
        return this.networkBio.writeDirectByteBuffer(directByteBufferAddress(byteBuffer, i), i2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0045  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int writeEncryptedDataHeap(java.nio.ByteBuffer r5, int r6, int r7) {
        /*
            r4 = this;
            r0 = 0
            com.google.android.gms.org.conscrypt.BufferAllocator r1 = r4.bufferAllocator     // Catch:{ all -> 0x0042 }
            if (r1 == 0) goto L_0x000e
            com.google.android.gms.org.conscrypt.AllocatedBuffer r0 = r1.allocateDirectBuffer(r7)     // Catch:{ all -> 0x0042 }
            java.nio.ByteBuffer r1 = r0.nioBuffer()     // Catch:{ all -> 0x0040 }
            goto L_0x0012
        L_0x000e:
            java.nio.ByteBuffer r1 = r4.getOrCreateLazyDirectBuffer()     // Catch:{ all -> 0x0042 }
        L_0x0012:
            int r2 = r5.limit()     // Catch:{ all -> 0x0040 }
            int r3 = r2 - r6
            int r7 = java.lang.Math.min(r3, r7)     // Catch:{ all -> 0x0040 }
            int r3 = r1.remaining()     // Catch:{ all -> 0x0040 }
            int r7 = java.lang.Math.min(r7, r3)     // Catch:{ all -> 0x0040 }
            int r3 = r6 + r7
            r5.limit(r3)     // Catch:{ all -> 0x0040 }
            r1.put(r5)     // Catch:{ all -> 0x0040 }
            r5.limit(r2)     // Catch:{ all -> 0x0040 }
            r5.position(r6)     // Catch:{ all -> 0x0040 }
            r2 = 0
            int r7 = r4.writeEncryptedDataDirect(r1, r2, r7)     // Catch:{ all -> 0x0040 }
            r5.position(r6)     // Catch:{ all -> 0x0040 }
            if (r0 == 0) goto L_0x003f
            r0.release()
        L_0x003f:
            return r7
        L_0x0040:
            r5 = move-exception
            goto L_0x0043
        L_0x0042:
            r5 = move-exception
        L_0x0043:
            if (r0 == 0) goto L_0x0048
            r0.release()
        L_0x0048:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.org.conscrypt.ConscryptEngine.writeEncryptedDataHeap(java.nio.ByteBuffer, int, int):int");
    }

    private int writePlaintextData(ByteBuffer byteBuffer, int i) {
        int i2;
        try {
            int position = byteBuffer.position();
            if (!byteBuffer.isDirect()) {
                i2 = writePlaintextDataHeap(byteBuffer, position, i);
            } else {
                i2 = writePlaintextDataDirect(byteBuffer, position, i);
            }
            if (i2 > 0) {
                byteBuffer.position(position + i2);
            }
            return i2;
        } catch (Exception e) {
            throw convertException(e);
        }
    }

    private int writePlaintextDataDirect(ByteBuffer byteBuffer, int i, int i2) {
        return this.ssl.writeDirectByteBuffer(directByteBufferAddress(byteBuffer, i), i2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x003f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int writePlaintextDataHeap(java.nio.ByteBuffer r5, int r6, int r7) {
        /*
            r4 = this;
            r0 = 0
            com.google.android.gms.org.conscrypt.BufferAllocator r1 = r4.bufferAllocator     // Catch:{ all -> 0x003c }
            if (r1 == 0) goto L_0x000e
            com.google.android.gms.org.conscrypt.AllocatedBuffer r0 = r1.allocateDirectBuffer(r7)     // Catch:{ all -> 0x003c }
            java.nio.ByteBuffer r1 = r0.nioBuffer()     // Catch:{ all -> 0x003a }
            goto L_0x0012
        L_0x000e:
            java.nio.ByteBuffer r1 = r4.getOrCreateLazyDirectBuffer()     // Catch:{ all -> 0x003c }
        L_0x0012:
            int r2 = r5.limit()     // Catch:{ all -> 0x003a }
            int r3 = r1.remaining()     // Catch:{ all -> 0x003a }
            int r7 = java.lang.Math.min(r7, r3)     // Catch:{ all -> 0x003a }
            int r3 = r6 + r7
            r5.limit(r3)     // Catch:{ all -> 0x003a }
            r1.put(r5)     // Catch:{ all -> 0x003a }
            r1.flip()     // Catch:{ all -> 0x003a }
            r5.limit(r2)     // Catch:{ all -> 0x003a }
            r5.position(r6)     // Catch:{ all -> 0x003a }
            r5 = 0
            int r5 = r4.writePlaintextDataDirect(r1, r5, r7)     // Catch:{ all -> 0x003a }
            if (r0 == 0) goto L_0x0039
            r0.release()
        L_0x0039:
            return r5
        L_0x003a:
            r5 = move-exception
            goto L_0x003d
        L_0x003c:
            r5 = move-exception
        L_0x003d:
            if (r0 == 0) goto L_0x0042
            r0.release()
        L_0x0042:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.org.conscrypt.ConscryptEngine.writePlaintextDataHeap(java.nio.ByteBuffer, int, int):int");
    }

    public void beginHandshake() {
        synchronized (this.ssl) {
            beginHandshakeInternal();
        }
    }

    public String chooseClientAlias(X509KeyManager x509KeyManager, X500Principal[] x500PrincipalArr, String[] strArr) {
        if (x509KeyManager instanceof X509ExtendedKeyManager) {
            return ((X509ExtendedKeyManager) x509KeyManager).chooseEngineClientAlias(strArr, x500PrincipalArr, this);
        }
        return x509KeyManager.chooseClientAlias(strArr, x500PrincipalArr, (Socket) null);
    }

    public String chooseClientPSKIdentity(PSKKeyManager pSKKeyManager, String str) {
        return pSKKeyManager.chooseClientKeyIdentity(str, (SSLEngine) this);
    }

    public String chooseServerAlias(X509KeyManager x509KeyManager, String str) {
        if (x509KeyManager instanceof X509ExtendedKeyManager) {
            return ((X509ExtendedKeyManager) x509KeyManager).chooseEngineServerAlias(str, (Principal[]) null, this);
        }
        return x509KeyManager.chooseServerAlias(str, (Principal[]) null, (Socket) null);
    }

    public String chooseServerPSKIdentityHint(PSKKeyManager pSKKeyManager) {
        return pSKKeyManager.chooseServerKeyIdentityHint((SSLEngine) this);
    }

    public void clientCertificateRequested(byte[] bArr, int[] iArr, byte[][] bArr2) {
        this.ssl.chooseClientCertificate(bArr, iArr, bArr2);
    }

    public int clientPSKKeyRequested(String str, byte[] bArr, byte[] bArr2) {
        return this.ssl.clientPSKKeyRequested(str, bArr, bArr2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0027, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0029, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void closeInbound() {
        /*
            r5 = this;
            com.google.android.gms.org.conscrypt.NativeSsl r0 = r5.ssl
            monitor-enter(r0)
            int r1 = r5.state     // Catch:{ all -> 0x002a }
            r2 = 8
            if (r1 == r2) goto L_0x0028
            r3 = 6
            if (r1 == r3) goto L_0x0028
            boolean r1 = r5.isHandshakeStarted()     // Catch:{ all -> 0x002a }
            if (r1 == 0) goto L_0x0023
            int r1 = r5.state     // Catch:{ all -> 0x002a }
            r4 = 7
            if (r1 == r4) goto L_0x001b
            r5.transitionTo(r3)     // Catch:{ all -> 0x002a }
            goto L_0x001f
        L_0x001b:
            r5.transitionTo(r2)     // Catch:{ all -> 0x002a }
        L_0x001f:
            r5.freeIfDone()     // Catch:{ all -> 0x002a }
            goto L_0x0026
        L_0x0023:
            r5.closeAndFreeResources()     // Catch:{ all -> 0x002a }
        L_0x0026:
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            return
        L_0x0028:
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            return
        L_0x002a:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.org.conscrypt.ConscryptEngine.closeInbound():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002c, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void closeOutbound() {
        /*
            r5 = this;
            com.google.android.gms.org.conscrypt.NativeSsl r0 = r5.ssl
            monitor-enter(r0)
            int r1 = r5.state     // Catch:{ all -> 0x002d }
            r2 = 8
            if (r1 == r2) goto L_0x002b
            r3 = 7
            if (r1 == r3) goto L_0x002b
            boolean r1 = r5.isHandshakeStarted()     // Catch:{ all -> 0x002d }
            if (r1 == 0) goto L_0x0026
            int r1 = r5.state     // Catch:{ all -> 0x002d }
            r4 = 6
            if (r1 == r4) goto L_0x001b
            r5.transitionTo(r3)     // Catch:{ all -> 0x002d }
            goto L_0x001f
        L_0x001b:
            r5.transitionTo(r2)     // Catch:{ all -> 0x002d }
        L_0x001f:
            r5.sendSSLShutdown()     // Catch:{ all -> 0x002d }
            r5.freeIfDone()     // Catch:{ all -> 0x002d }
            goto L_0x0029
        L_0x0026:
            r5.closeAndFreeResources()     // Catch:{ all -> 0x002d }
        L_0x0029:
            monitor-exit(r0)     // Catch:{ all -> 0x002d }
            return
        L_0x002b:
            monitor-exit(r0)     // Catch:{ all -> 0x002d }
            return
        L_0x002d:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002d }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.org.conscrypt.ConscryptEngine.closeOutbound():void");
    }

    public byte[] exportKeyingMaterial(String str, byte[] bArr, int i) {
        synchronized (this.ssl) {
            int i2 = this.state;
            if (i2 < 3 || i2 == 8) {
                return null;
            }
            return this.ssl.exportKeyingMaterial(str, bArr, i);
        }
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        try {
            transitionTo(8);
        } finally {
            super.finalize();
        }
    }

    public String getApplicationProtocol() {
        return SSLUtils.toProtocolString(this.ssl.getApplicationProtocol());
    }

    public String[] getApplicationProtocols() {
        return this.sslParameters.getApplicationProtocols();
    }

    public byte[] getChannelId() {
        byte[] tlsChannelId;
        synchronized (this.ssl) {
            if (getUseClientMode()) {
                throw new IllegalStateException("Not allowed in client mode");
            } else if (!isHandshakeStarted()) {
                tlsChannelId = this.ssl.getTlsChannelId();
            } else {
                throw new IllegalStateException("Channel ID is only available after handshake completes");
            }
        }
        return tlsChannelId;
    }

    public Runnable getDelegatedTask() {
        return null;
    }

    public boolean getEnableSessionCreation() {
        return this.sslParameters.getEnableSessionCreation();
    }

    public String[] getEnabledCipherSuites() {
        return this.sslParameters.getEnabledCipherSuites();
    }

    public String[] getEnabledProtocols() {
        return this.sslParameters.getEnabledProtocols();
    }

    public String getHandshakeApplicationProtocol() {
        String applicationProtocol;
        synchronized (this.ssl) {
            applicationProtocol = this.state == 2 ? getApplicationProtocol() : null;
        }
        return applicationProtocol;
    }

    public String getHostname() {
        String str = this.peerHostname;
        return str == null ? this.peerInfoProvider.getHostname() : str;
    }

    public boolean getNeedClientAuth() {
        return this.sslParameters.getNeedClientAuth();
    }

    public SecretKey getPSKKey(PSKKeyManager pSKKeyManager, String str, String str2) {
        return pSKKeyManager.getKey(str, str2, (SSLEngine) this);
    }

    public String getPeerHost() {
        String str = this.peerHostname;
        return str == null ? this.peerInfoProvider.getHostnameOrIP() : str;
    }

    public int getPeerPort() {
        return this.peerInfoProvider.getPort();
    }

    public SSLParameters getSSLParameters() {
        SSLParameters sSLParameters = super.getSSLParameters();
        Platform.getSSLParameters(sSLParameters, this.sslParameters, this);
        return sSLParameters;
    }

    public SSLSession getSession() {
        return this.externalSession;
    }

    public String[] getSupportedCipherSuites() {
        return NativeCrypto.getSupportedCipherSuites();
    }

    public String[] getSupportedProtocols() {
        return NativeCrypto.getSupportedProtocols();
    }

    public byte[] getTlsUnique() {
        return this.ssl.getTlsUnique();
    }

    public boolean getUseClientMode() {
        return this.sslParameters.getUseClientMode();
    }

    public boolean getWantClientAuth() {
        return this.sslParameters.getWantClientAuth();
    }

    public SSLSession handshakeSession() {
        synchronized (this.ssl) {
            if (this.state != 2) {
                return null;
            }
            SSLSession wrapSSLSession = Platform.wrapSSLSession(new ExternalSession(new ExternalSession.Provider() {
                public ConscryptSession provideSession() {
                    return ConscryptEngine.this.provideHandshakeSession();
                }
            }));
            return wrapSSLSession;
        }
    }

    public boolean isInboundDone() {
        boolean z;
        synchronized (this.ssl) {
            int i = this.state;
            z = false;
            if (i != 8) {
                if (i != 6 && !this.ssl.wasShutdownReceived()) {
                }
            }
            if (pendingInboundCleartextBytes() == 0) {
                z = true;
            }
        }
        return z;
    }

    public boolean isOutboundDone() {
        boolean z;
        synchronized (this.ssl) {
            int i = this.state;
            z = false;
            if (i != 8) {
                if (i != 7 && !this.ssl.wasShutdownSent()) {
                }
            }
            if (pendingOutboundEncryptedBytes() == 0) {
                z = true;
            }
        }
        return z;
    }

    public int maxSealOverhead() {
        return this.maxSealOverhead;
    }

    public void onNewSessionEstablished(long j) {
        try {
            NativeCrypto.SSL_SESSION_up_ref(j);
            sessionContext().cacheSession(NativeSslSession.newInstance(new NativeRef.SSL_SESSION(j), this.activeSession));
        } catch (Exception e) {
        }
    }

    public void onSSLStateChange(int i, int i2) {
        synchronized (this.ssl) {
            if (i == 16) {
                transitionTo(2);
            } else if (i == 32) {
                int i3 = this.state;
                if (i3 != 2) {
                    if (i3 != 4) {
                        StringBuilder sb = new StringBuilder(45);
                        sb.append("Completed handshake while in mode ");
                        sb.append(i3);
                        throw new IllegalStateException(sb.toString());
                    }
                }
                transitionTo(3);
            }
        }
    }

    public int pendingOutboundEncryptedBytes() {
        return this.networkBio.getPendingWrittenBytes();
    }

    public int serverPSKKeyRequested(String str, String str2, byte[] bArr) {
        return this.ssl.serverPSKKeyRequested(str, str2, bArr);
    }

    public long serverSessionRequested(byte[] bArr) {
        return 0;
    }

    public void setApplicationProtocolSelector(ApplicationProtocolSelector applicationProtocolSelector) {
        ApplicationProtocolSelectorAdapter applicationProtocolSelectorAdapter;
        if (applicationProtocolSelector != null) {
            applicationProtocolSelectorAdapter = new ApplicationProtocolSelectorAdapter((SSLEngine) this, applicationProtocolSelector);
        } else {
            applicationProtocolSelectorAdapter = null;
        }
        setApplicationProtocolSelector(applicationProtocolSelectorAdapter);
    }

    public void setApplicationProtocols(String[] strArr) {
        this.sslParameters.setApplicationProtocols(strArr);
    }

    public void setBufferAllocator(BufferAllocator bufferAllocator2) {
        synchronized (this.ssl) {
            if (!isHandshakeStarted()) {
                this.bufferAllocator = bufferAllocator2;
            } else {
                throw new IllegalStateException("Could not set buffer allocator after the initial handshake has begun.");
            }
        }
    }

    public void setChannelIdEnabled(boolean z) {
        synchronized (this.ssl) {
            if (getUseClientMode()) {
                throw new IllegalStateException("Not allowed in client mode");
            } else if (!isHandshakeStarted()) {
                this.sslParameters.channelIdEnabled = z;
            } else {
                throw new IllegalStateException("Could not enable/disable Channel ID after the initial handshake has begun.");
            }
        }
    }

    public void setChannelIdPrivateKey(PrivateKey privateKey) {
        if (getUseClientMode()) {
            synchronized (this.ssl) {
                if (!isHandshakeStarted()) {
                    ECParameterSpec eCParameterSpec = null;
                    if (privateKey == null) {
                        this.sslParameters.channelIdEnabled = false;
                        this.channelIdPrivateKey = null;
                        return;
                    }
                    this.sslParameters.channelIdEnabled = true;
                    try {
                        if (privateKey instanceof ECKey) {
                            eCParameterSpec = ((ECKey) privateKey).getParams();
                        }
                        if (eCParameterSpec == null) {
                            eCParameterSpec = OpenSSLECGroupContext.getCurveByName("prime256v1").getECParameterSpec();
                        }
                        this.channelIdPrivateKey = OpenSSLKey.fromECPrivateKeyForTLSStackOnly(privateKey, eCParameterSpec);
                    } catch (InvalidKeyException e) {
                    }
                    return;
                }
                throw new IllegalStateException("Could not change Channel ID private key after the initial handshake has begun.");
            }
        }
        throw new IllegalStateException("Not allowed in server mode");
    }

    public void setEnableSessionCreation(boolean z) {
        this.sslParameters.setEnableSessionCreation(z);
    }

    public void setEnabledCipherSuites(String[] strArr) {
        this.sslParameters.setEnabledCipherSuites(strArr);
    }

    public void setEnabledProtocols(String[] strArr) {
        this.sslParameters.setEnabledProtocols(strArr);
    }

    public void setHandshakeListener(HandshakeListener handshakeListener2) {
        synchronized (this.ssl) {
            if (!isHandshakeStarted()) {
                this.handshakeListener = handshakeListener2;
            } else {
                throw new IllegalStateException("Handshake listener must be set before starting the handshake.");
            }
        }
    }

    public void setHostname(String str) {
        this.sslParameters.setUseSni(str != null);
        this.peerHostname = str;
    }

    public void setNeedClientAuth(boolean z) {
        this.sslParameters.setNeedClientAuth(z);
    }

    public void setSSLParameters(SSLParameters sSLParameters) {
        super.setSSLParameters(sSLParameters);
        Platform.setSSLParameters(sSLParameters, this.sslParameters, this);
    }

    public void setUseClientMode(boolean z) {
        synchronized (this.ssl) {
            if (!isHandshakeStarted()) {
                transitionTo(1);
                this.sslParameters.setUseClientMode(z);
            } else {
                int i = this.state;
                StringBuilder sb = new StringBuilder(57);
                sb.append("Can not change mode after handshake: state == ");
                sb.append(i);
                throw new IllegalArgumentException(sb.toString());
            }
        }
    }

    public void setUseSessionTickets(boolean z) {
        this.sslParameters.setUseSessionTickets(z);
    }

    public void setWantClientAuth(boolean z) {
        this.sslParameters.setWantClientAuth(z);
    }

    public SSLEngineResult unwrap(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        SSLEngineResult unwrap;
        synchronized (this.ssl) {
            try {
                unwrap = unwrap(singleSrcBuffer(byteBuffer), singleDstBuffer(byteBuffer2));
                resetSingleSrcBuffer();
                resetSingleDstBuffer();
            } catch (Throwable th) {
                resetSingleSrcBuffer();
                resetSingleDstBuffer();
                throw th;
            }
        }
        return unwrap;
    }

    public void verifyCertificateChain(byte[][] bArr, String str) {
        if (bArr != null) {
            try {
                if (bArr.length != 0) {
                    X509Certificate[] decodeX509CertificateChain = SSLUtils.decodeX509CertificateChain(bArr);
                    X509TrustManager x509TrustManager = this.sslParameters.getX509TrustManager();
                    if (x509TrustManager != null) {
                        this.activeSession.onPeerCertificatesReceived(getPeerHost(), getPeerPort(), decodeX509CertificateChain);
                        if (!getUseClientMode()) {
                            Platform.checkClientTrusted(x509TrustManager, decodeX509CertificateChain, decodeX509CertificateChain[0].getPublicKey().getAlgorithm(), this);
                            return;
                        } else {
                            Platform.checkServerTrusted(x509TrustManager, decodeX509CertificateChain, str, this);
                            return;
                        }
                    } else {
                        throw new CertificateException("No X.509 TrustManager");
                    }
                }
            } catch (CertificateException e) {
                throw e;
            } catch (Exception e2) {
                throw new CertificateException(e2);
            }
        }
        throw new CertificateException("Peer sent no certificate");
    }

    public SSLEngineResult wrap(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        SSLEngineResult wrap;
        synchronized (this.ssl) {
            try {
                wrap = wrap(singleSrcBuffer(byteBuffer), byteBuffer2);
                resetSingleSrcBuffer();
            } catch (Throwable th) {
                resetSingleSrcBuffer();
                throw th;
            }
        }
        return wrap;
    }

    public SSLEngineResult.HandshakeStatus getHandshakeStatus() {
        SSLEngineResult.HandshakeStatus handshakeStatusInternal;
        synchronized (this.ssl) {
            handshakeStatusInternal = getHandshakeStatusInternal();
        }
        return handshakeStatusInternal;
    }

    public void setApplicationProtocolSelector(ApplicationProtocolSelectorAdapter applicationProtocolSelectorAdapter) {
        this.sslParameters.setApplicationProtocolSelector(applicationProtocolSelectorAdapter);
    }

    public ConscryptEngine(SSLParametersImpl sSLParametersImpl, PeerInfoProvider peerInfoProvider2) {
        this.sslParameters = sSLParametersImpl;
        Preconditions.checkNotNull(peerInfoProvider2, "peerInfoProvider");
        this.peerInfoProvider = peerInfoProvider2;
        NativeSsl newSsl = newSsl(sSLParametersImpl, this);
        this.ssl = newSsl;
        this.networkBio = newSsl.newBio();
    }

    public SSLEngineResult unwrap(ByteBuffer byteBuffer, ByteBuffer[] byteBufferArr) {
        SSLEngineResult unwrap;
        synchronized (this.ssl) {
            try {
                unwrap = unwrap(singleSrcBuffer(byteBuffer), byteBufferArr);
                resetSingleSrcBuffer();
            } catch (Throwable th) {
                resetSingleSrcBuffer();
                throw th;
            }
        }
        return unwrap;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00c3, code lost:
        return r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x00d7, code lost:
        return r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x00ea, code lost:
        return r12;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public javax.net.ssl.SSLEngineResult wrap(java.nio.ByteBuffer[] r12, int r13, int r14, java.nio.ByteBuffer r15) {
        /*
            r11 = this;
            r0 = 1
            r1 = 0
            if (r12 == 0) goto L_0x0006
            r2 = 1
            goto L_0x0007
        L_0x0006:
            r2 = 0
        L_0x0007:
            java.lang.String r3 = "srcs is null"
            com.google.android.gms.org.conscrypt.Preconditions.checkArgument(r2, r3)
            if (r15 == 0) goto L_0x0010
            r2 = 1
            goto L_0x0011
        L_0x0010:
            r2 = 0
        L_0x0011:
            java.lang.String r3 = "dst is null"
            com.google.android.gms.org.conscrypt.Preconditions.checkArgument(r2, r3)
            int r14 = r14 + r13
            int r2 = r12.length
            com.google.android.gms.org.conscrypt.Preconditions.checkPositionIndexes(r13, r14, r2)
            boolean r2 = r15.isReadOnly()
            if (r2 != 0) goto L_0x0165
            com.google.android.gms.org.conscrypt.NativeSsl r2 = r11.ssl
            monitor-enter(r2)
            int r3 = r11.state     // Catch:{ all -> 0x0162 }
            if (r3 == 0) goto L_0x015a
            r4 = 8
            if (r3 == r0) goto L_0x004e
            r5 = 7
            if (r3 == r5) goto L_0x0033
            if (r3 == r4) goto L_0x0033
            goto L_0x0051
        L_0x0033:
            javax.net.ssl.SSLEngineResult$HandshakeStatus r12 = javax.net.ssl.SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING     // Catch:{ all -> 0x0162 }
            javax.net.ssl.SSLEngineResult r12 = r11.readPendingBytesFromBIO(r15, r1, r1, r12)     // Catch:{ all -> 0x0162 }
            if (r12 == 0) goto L_0x0041
            r11.freeIfDone()     // Catch:{ all -> 0x0162 }
            monitor-exit(r2)     // Catch:{ all -> 0x0162 }
            return r12
        L_0x0041:
            javax.net.ssl.SSLEngineResult r12 = new javax.net.ssl.SSLEngineResult     // Catch:{ all -> 0x0162 }
            javax.net.ssl.SSLEngineResult$Status r13 = javax.net.ssl.SSLEngineResult.Status.CLOSED     // Catch:{ all -> 0x0162 }
            javax.net.ssl.SSLEngineResult$HandshakeStatus r14 = r11.getHandshakeStatusInternal()     // Catch:{ all -> 0x0162 }
            r12.<init>(r13, r14, r1, r1)     // Catch:{ all -> 0x0162 }
            monitor-exit(r2)     // Catch:{ all -> 0x0162 }
            return r12
        L_0x004e:
            r11.beginHandshakeInternal()     // Catch:{ all -> 0x0162 }
        L_0x0051:
            javax.net.ssl.SSLEngineResult$HandshakeStatus r3 = javax.net.ssl.SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING     // Catch:{ all -> 0x0162 }
            boolean r5 = r11.handshakeFinished     // Catch:{ all -> 0x0162 }
            if (r5 != 0) goto L_0x006b
            javax.net.ssl.SSLEngineResult$HandshakeStatus r3 = r11.handshake()     // Catch:{ all -> 0x0162 }
            javax.net.ssl.SSLEngineResult$HandshakeStatus r5 = javax.net.ssl.SSLEngineResult.HandshakeStatus.NEED_UNWRAP     // Catch:{ all -> 0x0162 }
            if (r3 != r5) goto L_0x0063
            javax.net.ssl.SSLEngineResult r12 = NEED_UNWRAP_OK     // Catch:{ all -> 0x0162 }
            monitor-exit(r2)     // Catch:{ all -> 0x0162 }
            return r12
        L_0x0063:
            int r5 = r11.state     // Catch:{ all -> 0x0162 }
            if (r5 != r4) goto L_0x006b
            javax.net.ssl.SSLEngineResult r12 = NEED_UNWRAP_CLOSED     // Catch:{ all -> 0x0162 }
            monitor-exit(r2)     // Catch:{ all -> 0x0162 }
            return r12
        L_0x006b:
            r4 = r13
            r5 = 0
        L_0x006d:
            r6 = 16384(0x4000, float:2.2959E-41)
            if (r4 < r14) goto L_0x0124
            int r4 = r15.remaining()     // Catch:{ all -> 0x0162 }
            int r5 = com.google.android.gms.org.conscrypt.SSLUtils.calculateOutNetBufSize(r5)     // Catch:{ all -> 0x0162 }
            if (r4 < r5) goto L_0x0117
            r4 = 0
            r5 = 0
        L_0x007d:
            if (r13 >= r14) goto L_0x0104
            r7 = r12[r13]     // Catch:{ all -> 0x0162 }
            if (r7 == 0) goto L_0x0085
            r8 = 1
            goto L_0x0086
        L_0x0085:
            r8 = 0
        L_0x0086:
            java.lang.String r9 = "srcs[%d] is null"
            java.lang.Integer r10 = java.lang.Integer.valueOf(r13)     // Catch:{ all -> 0x0162 }
            com.google.android.gms.org.conscrypt.Preconditions.checkArgument(r8, r9, r10)     // Catch:{ all -> 0x0162 }
        L_0x008f:
            boolean r8 = r7.hasRemaining()     // Catch:{ all -> 0x0162 }
            if (r8 != 0) goto L_0x0098
            int r13 = r13 + 1
            goto L_0x007d
        L_0x0098:
            int r8 = r7.remaining()     // Catch:{ all -> 0x0162 }
            int r9 = 16384 - r5
            int r8 = java.lang.Math.min(r8, r9)     // Catch:{ all -> 0x0162 }
            int r8 = r11.writePlaintextData(r7, r8)     // Catch:{ all -> 0x0162 }
            if (r8 > 0) goto L_0x00eb
            com.google.android.gms.org.conscrypt.NativeSsl r12 = r11.ssl     // Catch:{ all -> 0x0162 }
            int r12 = r12.getError(r8)     // Catch:{ all -> 0x0162 }
            r13 = 2
            if (r12 == r13) goto L_0x00d8
            r13 = 3
            if (r12 == r13) goto L_0x00ce
            r13 = 6
            if (r12 != r13) goto L_0x00c4
            r11.closeAll()     // Catch:{ all -> 0x0162 }
            javax.net.ssl.SSLEngineResult r12 = r11.readPendingBytesFromBIO(r15, r5, r4, r3)     // Catch:{ all -> 0x0162 }
            if (r12 != 0) goto L_0x00c2
            javax.net.ssl.SSLEngineResult r12 = CLOSED_NOT_HANDSHAKING     // Catch:{ all -> 0x0162 }
        L_0x00c2:
            monitor-exit(r2)     // Catch:{ all -> 0x0162 }
            return r12
        L_0x00c4:
            r11.sendSSLShutdown()     // Catch:{ all -> 0x0162 }
            java.lang.String r12 = "SSL_write"
            javax.net.ssl.SSLException r12 = r11.newSslExceptionWithMessage(r12)     // Catch:{ all -> 0x0162 }
            throw r12     // Catch:{ all -> 0x0162 }
        L_0x00ce:
            javax.net.ssl.SSLEngineResult r12 = r11.readPendingBytesFromBIO(r15, r5, r4, r3)     // Catch:{ all -> 0x0162 }
            if (r12 != 0) goto L_0x00d6
            javax.net.ssl.SSLEngineResult r12 = NEED_WRAP_CLOSED     // Catch:{ all -> 0x0162 }
        L_0x00d6:
            monitor-exit(r2)     // Catch:{ all -> 0x0162 }
            return r12
        L_0x00d8:
            javax.net.ssl.SSLEngineResult r12 = r11.readPendingBytesFromBIO(r15, r5, r4, r3)     // Catch:{ all -> 0x0162 }
            if (r12 != 0) goto L_0x00e9
            javax.net.ssl.SSLEngineResult r12 = new javax.net.ssl.SSLEngineResult     // Catch:{ all -> 0x0162 }
            javax.net.ssl.SSLEngineResult$Status r13 = r11.getEngineStatus()     // Catch:{ all -> 0x0162 }
            javax.net.ssl.SSLEngineResult$HandshakeStatus r14 = javax.net.ssl.SSLEngineResult.HandshakeStatus.NEED_UNWRAP     // Catch:{ all -> 0x0162 }
            r12.<init>(r13, r14, r5, r4)     // Catch:{ all -> 0x0162 }
        L_0x00e9:
            monitor-exit(r2)     // Catch:{ all -> 0x0162 }
            return r12
        L_0x00eb:
            int r5 = r5 + r8
            javax.net.ssl.SSLEngineResult r8 = r11.readPendingBytesFromBIO(r15, r5, r4, r3)     // Catch:{ all -> 0x0162 }
            if (r8 == 0) goto L_0x0101
            javax.net.ssl.SSLEngineResult$Status r4 = r8.getStatus()     // Catch:{ all -> 0x0162 }
            javax.net.ssl.SSLEngineResult$Status r9 = javax.net.ssl.SSLEngineResult.Status.OK     // Catch:{ all -> 0x0162 }
            if (r4 != r9) goto L_0x00ff
            int r4 = r8.bytesProduced()     // Catch:{ all -> 0x0162 }
            goto L_0x0101
        L_0x00ff:
            monitor-exit(r2)     // Catch:{ all -> 0x0162 }
            return r8
        L_0x0101:
            if (r5 != r6) goto L_0x008f
            goto L_0x0105
        L_0x0104:
        L_0x0105:
            if (r5 == 0) goto L_0x0108
            goto L_0x0111
        L_0x0108:
            javax.net.ssl.SSLEngineResult r12 = r11.readPendingBytesFromBIO(r15, r1, r4, r3)     // Catch:{ all -> 0x0162 }
            if (r12 == 0) goto L_0x0111
            monitor-exit(r2)     // Catch:{ all -> 0x0162 }
            return r12
        L_0x0111:
            javax.net.ssl.SSLEngineResult r12 = r11.newResult(r5, r4, r3)     // Catch:{ all -> 0x0162 }
            monitor-exit(r2)     // Catch:{ all -> 0x0162 }
            return r12
        L_0x0117:
            javax.net.ssl.SSLEngineResult r12 = new javax.net.ssl.SSLEngineResult     // Catch:{ all -> 0x0162 }
            javax.net.ssl.SSLEngineResult$Status r13 = javax.net.ssl.SSLEngineResult.Status.BUFFER_OVERFLOW     // Catch:{ all -> 0x0162 }
            javax.net.ssl.SSLEngineResult$HandshakeStatus r14 = r11.getHandshakeStatusInternal()     // Catch:{ all -> 0x0162 }
            r12.<init>(r13, r14, r1, r1)     // Catch:{ all -> 0x0162 }
            monitor-exit(r2)     // Catch:{ all -> 0x0162 }
            return r12
        L_0x0124:
            r7 = r12[r4]     // Catch:{ all -> 0x0162 }
            if (r7 == 0) goto L_0x013c
            if (r5 != r6) goto L_0x012b
            goto L_0x0138
        L_0x012b:
            int r7 = r7.remaining()     // Catch:{ all -> 0x0162 }
            int r5 = r5 + r7
            if (r5 <= r6) goto L_0x0135
        L_0x0132:
            r5 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0138
        L_0x0135:
            if (r5 >= 0) goto L_0x0138
            goto L_0x0132
        L_0x0138:
            int r4 = r4 + 1
            goto L_0x006d
        L_0x013c:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0162 }
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ all -> 0x0162 }
            r14 = 25
            r13.<init>(r14)     // Catch:{ all -> 0x0162 }
            java.lang.String r14 = "srcs["
            r13.append(r14)     // Catch:{ all -> 0x0162 }
            r13.append(r4)     // Catch:{ all -> 0x0162 }
            java.lang.String r14 = "] is null"
            r13.append(r14)     // Catch:{ all -> 0x0162 }
            java.lang.String r13 = r13.toString()     // Catch:{ all -> 0x0162 }
            r12.<init>(r13)     // Catch:{ all -> 0x0162 }
            throw r12     // Catch:{ all -> 0x0162 }
        L_0x015a:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0162 }
            java.lang.String r13 = "Client/server mode must be set before calling wrap"
            r12.<init>(r13)     // Catch:{ all -> 0x0162 }
            throw r12     // Catch:{ all -> 0x0162 }
        L_0x0162:
            r12 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0162 }
            throw r12
        L_0x0165:
            java.nio.ReadOnlyBufferException r12 = new java.nio.ReadOnlyBufferException
            r12.<init>()
            goto L_0x016c
        L_0x016b:
            throw r12
        L_0x016c:
            goto L_0x016b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.org.conscrypt.ConscryptEngine.wrap(java.nio.ByteBuffer[], int, int, java.nio.ByteBuffer):javax.net.ssl.SSLEngineResult");
    }

    public ConscryptEngine(String str, int i, SSLParametersImpl sSLParametersImpl) {
        this.sslParameters = sSLParametersImpl;
        this.peerInfoProvider = PeerInfoProvider.forHostAndPort(str, i);
        NativeSsl newSsl = newSsl(sSLParametersImpl, this);
        this.ssl = newSsl;
        this.networkBio = newSsl.newBio();
    }

    public SSLEngineResult unwrap(ByteBuffer byteBuffer, ByteBuffer[] byteBufferArr, int i, int i2) {
        SSLEngineResult unwrap;
        synchronized (this.ssl) {
            try {
                unwrap = unwrap(singleSrcBuffer(byteBuffer), 0, 1, byteBufferArr, i, i2);
                resetSingleSrcBuffer();
            } catch (Throwable th) {
                resetSingleSrcBuffer();
                throw th;
            }
        }
        return unwrap;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0156, code lost:
        sendSSLShutdown();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x015d, code lost:
        throw convertException(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x015e, code lost:
        closeAll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0165, code lost:
        throw convertException(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x016d, code lost:
        sendSSLShutdown();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0174, code lost:
        throw convertException(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x00fa, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x00fc, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0100, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:77:0x00f3, B:84:0x0106] */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:77:0x00f3, B:91:0x0116] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00fa A[ExcHandler: IOException (r0v23 'e' java.io.IOException A[CUSTOM_DECLARE]), Splitter:B:77:0x00f3] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x00fc A[ExcHandler: EOFException (r0v21 'e' java.io.EOFException A[CUSTOM_DECLARE]), Splitter:B:77:0x00f3] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0100 A[ExcHandler: SSLException (r0v19 'e' javax.net.ssl.SSLException A[CUSTOM_DECLARE]), Splitter:B:77:0x00f3] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public javax.net.ssl.SSLEngineResult unwrap(java.nio.ByteBuffer[] r18, int r19, int r20, java.nio.ByteBuffer[] r21, int r22, int r23) {
        /*
            r17 = this;
            r1 = r17
            r0 = r18
            r2 = r19
            r3 = r21
            r4 = r22
            r5 = 1
            r6 = 0
            if (r0 == 0) goto L_0x0010
            r7 = 1
            goto L_0x0011
        L_0x0010:
            r7 = 0
        L_0x0011:
            java.lang.String r8 = "srcs is null"
            com.google.android.gms.org.conscrypt.Preconditions.checkArgument(r7, r8)
            if (r3 == 0) goto L_0x001a
            r7 = 1
            goto L_0x001b
        L_0x001a:
            r7 = 0
        L_0x001b:
            java.lang.String r8 = "dsts is null"
            com.google.android.gms.org.conscrypt.Preconditions.checkArgument(r7, r8)
            int r7 = r2 + r20
            int r8 = r0.length
            com.google.android.gms.org.conscrypt.Preconditions.checkPositionIndexes(r2, r7, r8)
            int r8 = r4 + r23
            int r9 = r3.length
            com.google.android.gms.org.conscrypt.Preconditions.checkPositionIndexes(r4, r8, r9)
            int r9 = calcDstsLength(r21, r22, r23)
            long r10 = calcSrcsLength(r0, r2, r7)
            com.google.android.gms.org.conscrypt.NativeSsl r12 = r1.ssl
            monitor-enter(r12)
            int r13 = r1.state     // Catch:{ all -> 0x01a4 }
            if (r13 == 0) goto L_0x019c
            r14 = 8
            if (r13 == r5) goto L_0x0056
            r5 = 6
            if (r13 == r5) goto L_0x0046
            if (r13 == r14) goto L_0x0046
            goto L_0x0059
        L_0x0046:
            r17.freeIfDone()     // Catch:{ all -> 0x01a4 }
            javax.net.ssl.SSLEngineResult r0 = new javax.net.ssl.SSLEngineResult     // Catch:{ all -> 0x01a4 }
            javax.net.ssl.SSLEngineResult$Status r2 = javax.net.ssl.SSLEngineResult.Status.CLOSED     // Catch:{ all -> 0x01a4 }
            javax.net.ssl.SSLEngineResult$HandshakeStatus r3 = r17.getHandshakeStatusInternal()     // Catch:{ all -> 0x01a4 }
            r0.<init>(r2, r3, r6, r6)     // Catch:{ all -> 0x01a4 }
            monitor-exit(r12)     // Catch:{ all -> 0x01a4 }
            return r0
        L_0x0056:
            r17.beginHandshakeInternal()     // Catch:{ all -> 0x01a4 }
        L_0x0059:
            javax.net.ssl.SSLEngineResult$HandshakeStatus r5 = javax.net.ssl.SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING     // Catch:{ all -> 0x01a4 }
            boolean r13 = r1.handshakeFinished     // Catch:{ all -> 0x01a4 }
            if (r13 != 0) goto L_0x0073
            javax.net.ssl.SSLEngineResult$HandshakeStatus r5 = r17.handshake()     // Catch:{ all -> 0x01a4 }
            javax.net.ssl.SSLEngineResult$HandshakeStatus r13 = javax.net.ssl.SSLEngineResult.HandshakeStatus.NEED_WRAP     // Catch:{ all -> 0x01a4 }
            if (r5 != r13) goto L_0x006b
            javax.net.ssl.SSLEngineResult r0 = NEED_WRAP_OK     // Catch:{ all -> 0x01a4 }
            monitor-exit(r12)     // Catch:{ all -> 0x01a4 }
            return r0
        L_0x006b:
            int r13 = r1.state     // Catch:{ all -> 0x01a4 }
            if (r13 != r14) goto L_0x0073
            javax.net.ssl.SSLEngineResult r0 = NEED_WRAP_CLOSED     // Catch:{ all -> 0x01a4 }
            monitor-exit(r12)     // Catch:{ all -> 0x01a4 }
            return r0
        L_0x0073:
            int r13 = r17.pendingInboundCleartextBytes()     // Catch:{ all -> 0x01a4 }
            r14 = 0
            int r16 = (r10 > r14 ? 1 : (r10 == r14 ? 0 : -1))
            if (r16 > 0) goto L_0x008e
            if (r13 > 0) goto L_0x008c
            javax.net.ssl.SSLEngineResult r0 = new javax.net.ssl.SSLEngineResult     // Catch:{ all -> 0x01a4 }
            javax.net.ssl.SSLEngineResult$Status r2 = javax.net.ssl.SSLEngineResult.Status.BUFFER_UNDERFLOW     // Catch:{ all -> 0x01a4 }
            javax.net.ssl.SSLEngineResult$HandshakeStatus r3 = r17.getHandshakeStatus()     // Catch:{ all -> 0x01a4 }
            r0.<init>(r2, r3, r6, r6)     // Catch:{ all -> 0x01a4 }
            monitor-exit(r12)     // Catch:{ all -> 0x01a4 }
            return r0
        L_0x008c:
            r13 = 0
            goto L_0x00c4
        L_0x008e:
            if (r13 > 0) goto L_0x00c3
            r13 = 5
            int r15 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1))
            if (r15 < 0) goto L_0x00b6
            int r13 = com.google.android.gms.org.conscrypt.SSLUtils.getEncryptedPacketLength(r18, r19)     // Catch:{ all -> 0x01a4 }
            if (r13 < 0) goto L_0x00ae
            long r14 = (long) r13     // Catch:{ all -> 0x01a4 }
            int r16 = (r10 > r14 ? 1 : (r10 == r14 ? 0 : -1))
            if (r16 >= 0) goto L_0x00c4
            javax.net.ssl.SSLEngineResult r0 = new javax.net.ssl.SSLEngineResult     // Catch:{ all -> 0x01a4 }
            javax.net.ssl.SSLEngineResult$Status r2 = javax.net.ssl.SSLEngineResult.Status.BUFFER_UNDERFLOW     // Catch:{ all -> 0x01a4 }
            javax.net.ssl.SSLEngineResult$HandshakeStatus r3 = r17.getHandshakeStatus()     // Catch:{ all -> 0x01a4 }
            r0.<init>(r2, r3, r6, r6)     // Catch:{ all -> 0x01a4 }
            monitor-exit(r12)     // Catch:{ all -> 0x01a4 }
            return r0
        L_0x00ae:
            javax.net.ssl.SSLException r0 = new javax.net.ssl.SSLException     // Catch:{ all -> 0x01a4 }
            java.lang.String r2 = "Unable to parse TLS packet header"
            r0.<init>(r2)     // Catch:{ all -> 0x01a4 }
            throw r0     // Catch:{ all -> 0x01a4 }
        L_0x00b6:
            javax.net.ssl.SSLEngineResult r0 = new javax.net.ssl.SSLEngineResult     // Catch:{ all -> 0x01a4 }
            javax.net.ssl.SSLEngineResult$Status r2 = javax.net.ssl.SSLEngineResult.Status.BUFFER_UNDERFLOW     // Catch:{ all -> 0x01a4 }
            javax.net.ssl.SSLEngineResult$HandshakeStatus r3 = r17.getHandshakeStatus()     // Catch:{ all -> 0x01a4 }
            r0.<init>(r2, r3, r6, r6)     // Catch:{ all -> 0x01a4 }
            monitor-exit(r12)     // Catch:{ all -> 0x01a4 }
            return r0
        L_0x00c3:
            r13 = 0
        L_0x00c4:
            if (r13 > 0) goto L_0x00c8
            r10 = 0
            goto L_0x00f1
        L_0x00c8:
            if (r2 >= r7) goto L_0x00f0
            r10 = 0
        L_0x00cb:
            r11 = r0[r2]     // Catch:{ all -> 0x01a4 }
            int r14 = r11.remaining()     // Catch:{ all -> 0x01a4 }
            if (r14 != 0) goto L_0x00d6
            int r2 = r2 + 1
            goto L_0x00e9
        L_0x00d6:
            int r15 = java.lang.Math.min(r13, r14)     // Catch:{ all -> 0x01a4 }
            int r11 = r1.writeEncryptedData(r11, r15)     // Catch:{ all -> 0x01a4 }
            if (r11 <= 0) goto L_0x00ec
            int r10 = r10 + r11
            int r13 = r13 - r11
            if (r13 != 0) goto L_0x00e5
        L_0x00e4:
            goto L_0x00f1
        L_0x00e5:
            if (r11 != r14) goto L_0x00e4
            int r2 = r2 + 1
        L_0x00e9:
            if (r2 >= r7) goto L_0x00f1
            goto L_0x00cb
        L_0x00ec:
            com.google.android.gms.org.conscrypt.NativeCrypto.SSL_clear_error()     // Catch:{ all -> 0x01a4 }
            goto L_0x00f1
        L_0x00f0:
            r10 = 0
        L_0x00f1:
            if (r9 > 0) goto L_0x0103
            com.google.android.gms.org.conscrypt.NativeSsl r0 = r1.ssl     // Catch:{ SSLException -> 0x0100, InterruptedIOException -> 0x00fe, EOFException -> 0x00fc, IOException -> 0x00fa }
            r0.forceRead()     // Catch:{ SSLException -> 0x0100, InterruptedIOException -> 0x00fe, EOFException -> 0x00fc, IOException -> 0x00fa }
            goto L_0x0175
        L_0x00fa:
            r0 = move-exception
            goto L_0x0156
        L_0x00fc:
            r0 = move-exception
            goto L_0x015e
        L_0x00fe:
            r0 = move-exception
            goto L_0x0167
        L_0x0100:
            r0 = move-exception
            goto L_0x016d
        L_0x0103:
        L_0x0104:
            if (r4 >= r8) goto L_0x0175
            r0 = r3[r4]     // Catch:{ SSLException -> 0x0100, InterruptedIOException -> 0x0166, EOFException -> 0x00fc, IOException -> 0x00fa }
            boolean r2 = r0.hasRemaining()     // Catch:{ SSLException -> 0x0100, InterruptedIOException -> 0x0166, EOFException -> 0x00fc, IOException -> 0x00fa }
            if (r2 != 0) goto L_0x010f
            goto L_0x011d
        L_0x010f:
            int r2 = r1.readPlaintextData(r0)     // Catch:{ SSLException -> 0x0100, InterruptedIOException -> 0x0166, EOFException -> 0x00fc, IOException -> 0x00fa }
            if (r2 <= 0) goto L_0x0122
            int r6 = r6 + r2
            boolean r0 = r0.hasRemaining()     // Catch:{ SSLException -> 0x0100, InterruptedIOException -> 0x0120, EOFException -> 0x00fc, IOException -> 0x00fa }
            if (r0 == 0) goto L_0x011d
            goto L_0x0175
        L_0x011d:
            int r4 = r4 + 1
            goto L_0x0104
        L_0x0120:
            r0 = move-exception
            goto L_0x0167
        L_0x0122:
            r0 = -6
            if (r2 == r0) goto L_0x013c
            r0 = -3
            if (r2 == r0) goto L_0x0136
            r0 = -2
            if (r2 != r0) goto L_0x012c
            goto L_0x0136
        L_0x012c:
            r17.sendSSLShutdown()     // Catch:{ SSLException -> 0x0100, InterruptedIOException -> 0x0166, EOFException -> 0x00fc, IOException -> 0x00fa }
            java.lang.String r0 = "SSL_read"
            javax.net.ssl.SSLException r0 = r1.newSslExceptionWithMessage(r0)     // Catch:{ SSLException -> 0x0100, InterruptedIOException -> 0x0166, EOFException -> 0x00fc, IOException -> 0x00fa }
            throw r0     // Catch:{ SSLException -> 0x0100, InterruptedIOException -> 0x0166, EOFException -> 0x00fc, IOException -> 0x00fa }
        L_0x0136:
            javax.net.ssl.SSLEngineResult r0 = r1.newResult(r10, r6, r5)     // Catch:{ SSLException -> 0x0100, InterruptedIOException -> 0x0166, EOFException -> 0x00fc, IOException -> 0x00fa }
            monitor-exit(r12)     // Catch:{ all -> 0x01a4 }
            return r0
        L_0x013c:
            r17.closeInbound()     // Catch:{ SSLException -> 0x0100, InterruptedIOException -> 0x0166, EOFException -> 0x00fc, IOException -> 0x00fa }
            r17.sendSSLShutdown()     // Catch:{ SSLException -> 0x0100, InterruptedIOException -> 0x0166, EOFException -> 0x00fc, IOException -> 0x00fa }
            javax.net.ssl.SSLEngineResult r0 = new javax.net.ssl.SSLEngineResult     // Catch:{ SSLException -> 0x0100, InterruptedIOException -> 0x0166, EOFException -> 0x00fc, IOException -> 0x00fa }
            javax.net.ssl.SSLEngineResult$Status r2 = javax.net.ssl.SSLEngineResult.Status.CLOSED     // Catch:{ SSLException -> 0x0100, InterruptedIOException -> 0x0166, EOFException -> 0x00fc, IOException -> 0x00fa }
            int r3 = r17.pendingOutboundEncryptedBytes()     // Catch:{ SSLException -> 0x0100, InterruptedIOException -> 0x0166, EOFException -> 0x00fc, IOException -> 0x00fa }
            if (r3 > 0) goto L_0x014f
            javax.net.ssl.SSLEngineResult$HandshakeStatus r3 = javax.net.ssl.SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING     // Catch:{ SSLException -> 0x0100, InterruptedIOException -> 0x0166, EOFException -> 0x00fc, IOException -> 0x00fa }
            goto L_0x0151
        L_0x014f:
            javax.net.ssl.SSLEngineResult$HandshakeStatus r3 = javax.net.ssl.SSLEngineResult.HandshakeStatus.NEED_WRAP     // Catch:{ SSLException -> 0x0100, InterruptedIOException -> 0x0166, EOFException -> 0x00fc, IOException -> 0x00fa }
        L_0x0151:
            r0.<init>(r2, r3, r10, r6)     // Catch:{ SSLException -> 0x0100, InterruptedIOException -> 0x0166, EOFException -> 0x00fc, IOException -> 0x00fa }
            monitor-exit(r12)     // Catch:{ all -> 0x01a4 }
            return r0
        L_0x0156:
            r17.sendSSLShutdown()     // Catch:{ all -> 0x01a4 }
            javax.net.ssl.SSLException r0 = r1.convertException(r0)     // Catch:{ all -> 0x01a4 }
            throw r0     // Catch:{ all -> 0x01a4 }
        L_0x015e:
            r17.closeAll()     // Catch:{ all -> 0x01a4 }
            javax.net.ssl.SSLException r0 = r1.convertException(r0)     // Catch:{ all -> 0x01a4 }
            throw r0     // Catch:{ all -> 0x01a4 }
        L_0x0166:
            r0 = move-exception
        L_0x0167:
            javax.net.ssl.SSLEngineResult r0 = r1.newResult(r10, r6, r5)     // Catch:{ all -> 0x01a4 }
            monitor-exit(r12)     // Catch:{ all -> 0x01a4 }
            return r0
        L_0x016d:
            r17.sendSSLShutdown()     // Catch:{ all -> 0x01a4 }
            javax.net.ssl.SSLException r0 = r1.convertException(r0)     // Catch:{ all -> 0x01a4 }
            throw r0     // Catch:{ all -> 0x01a4 }
        L_0x0175:
            boolean r0 = r1.handshakeFinished     // Catch:{ all -> 0x01a4 }
            if (r0 != 0) goto L_0x017a
            goto L_0x0196
        L_0x017a:
            int r0 = r17.pendingInboundCleartextBytes()     // Catch:{ all -> 0x01a4 }
            if (r0 <= 0) goto L_0x0196
            javax.net.ssl.SSLEngineResult r0 = new javax.net.ssl.SSLEngineResult     // Catch:{ all -> 0x01a4 }
            javax.net.ssl.SSLEngineResult$Status r2 = javax.net.ssl.SSLEngineResult.Status.BUFFER_OVERFLOW     // Catch:{ all -> 0x01a4 }
            javax.net.ssl.SSLEngineResult$HandshakeStatus r3 = javax.net.ssl.SSLEngineResult.HandshakeStatus.FINISHED     // Catch:{ all -> 0x01a4 }
            if (r5 != r3) goto L_0x0189
            goto L_0x018d
        L_0x0189:
            javax.net.ssl.SSLEngineResult$HandshakeStatus r5 = r17.getHandshakeStatusInternal()     // Catch:{ all -> 0x01a4 }
        L_0x018d:
            javax.net.ssl.SSLEngineResult$HandshakeStatus r3 = r1.mayFinishHandshake(r5)     // Catch:{ all -> 0x01a4 }
            r0.<init>(r2, r3, r10, r6)     // Catch:{ all -> 0x01a4 }
            monitor-exit(r12)     // Catch:{ all -> 0x01a4 }
            return r0
        L_0x0196:
            javax.net.ssl.SSLEngineResult r0 = r1.newResult(r10, r6, r5)     // Catch:{ all -> 0x01a4 }
            monitor-exit(r12)     // Catch:{ all -> 0x01a4 }
            return r0
        L_0x019c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x01a4 }
            java.lang.String r2 = "Client/server mode must be set before calling unwrap"
            r0.<init>(r2)     // Catch:{ all -> 0x01a4 }
            throw r0     // Catch:{ all -> 0x01a4 }
        L_0x01a4:
            r0 = move-exception
            monitor-exit(r12)     // Catch:{ all -> 0x01a4 }
            goto L_0x01a8
        L_0x01a7:
            throw r0
        L_0x01a8:
            goto L_0x01a7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.org.conscrypt.ConscryptEngine.unwrap(java.nio.ByteBuffer[], int, int, java.nio.ByteBuffer[], int, int):javax.net.ssl.SSLEngineResult");
    }

    public SSLEngineResult unwrap(ByteBuffer[] byteBufferArr, ByteBuffer[] byteBufferArr2) {
        boolean z = true;
        Preconditions.checkArgument(byteBufferArr != null, "srcs is null");
        if (byteBufferArr2 == null) {
            z = false;
        }
        Preconditions.checkArgument(z, "dsts is null");
        return unwrap(byteBufferArr, 0, byteBufferArr.length, byteBufferArr2, 0, byteBufferArr2.length);
    }
}
