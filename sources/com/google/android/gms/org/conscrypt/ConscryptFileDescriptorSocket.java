package com.google.android.gms.org.conscrypt;

import com.google.android.gms.org.conscrypt.ExternalSession;
import com.google.android.gms.org.conscrypt.NativeCrypto;
import com.google.android.gms.org.conscrypt.NativeRef;
import com.google.android.gms.org.conscrypt.SSLParametersImpl;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketException;
import java.security.InvalidKeyException;
import java.security.Principal;
import java.security.PrivateKey;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.security.interfaces.ECKey;
import java.security.spec.ECParameterSpec;
import javax.crypto.SecretKey;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509KeyManager;
import javax.net.ssl.X509TrustManager;
import javax.security.auth.x500.X500Principal;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
class ConscryptFileDescriptorSocket extends OpenSSLSocketImpl implements NativeCrypto.SSLHandshakeCallbacks, SSLParametersImpl.AliasChooser, SSLParametersImpl.PSKCallbacks {
    private static final boolean DBG_STATE = false;
    private final ActiveSession activeSession;
    private OpenSSLKey channelIdPrivateKey;
    private SessionSnapshot closedSession;
    private final SSLSession externalSession = Platform.wrapSSLSession(new ExternalSession(new ExternalSession.Provider() {
        public ConscryptSession provideSession() {
            return ConscryptFileDescriptorSocket.this.provideSession();
        }
    }));
    private final Object guard = Platform.closeGuardGet();
    private int handshakeTimeoutMilliseconds = -1;
    private SSLInputStream is;
    private SSLOutputStream os;
    /* access modifiers changed from: private */
    public final NativeSsl ssl;
    private final SSLParametersImpl sslParameters;
    /* access modifiers changed from: private */
    public int state = 0;
    /* access modifiers changed from: private */
    public int writeTimeoutMilliseconds = 0;

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    class SSLInputStream extends InputStream {
        private final Object readLock = new Object();

        public SSLInputStream() {
        }

        public int available() {
            return ConscryptFileDescriptorSocket.this.ssl.getPendingReadableBytes();
        }

        public void awaitPendingOps() {
            synchronized (this.readLock) {
            }
        }

        public int read() {
            byte[] bArr = new byte[1];
            if (read(bArr, 0, 1) != -1) {
                return bArr[0] & 255;
            }
            return -1;
        }

        public int read(byte[] bArr, int i, int i2) {
            int read;
            Platform.blockGuardOnNetwork();
            ConscryptFileDescriptorSocket.this.checkOpen();
            ArrayUtils.checkOffsetAndCount(bArr.length, i, i2);
            if (i2 == 0) {
                return 0;
            }
            synchronized (this.readLock) {
                synchronized (ConscryptFileDescriptorSocket.this.ssl) {
                    if (ConscryptFileDescriptorSocket.this.state == 8) {
                        throw new SocketException("socket is closed");
                    }
                }
                read = ConscryptFileDescriptorSocket.this.ssl.read(Platform.getFileDescriptor(ConscryptFileDescriptorSocket.this.socket), bArr, i, i2, ConscryptFileDescriptorSocket.this.getSoTimeout());
                if (read == -1) {
                    synchronized (ConscryptFileDescriptorSocket.this.ssl) {
                        if (ConscryptFileDescriptorSocket.this.state == 8) {
                            throw new SocketException("socket is closed");
                        }
                    }
                }
            }
            return read;
        }
    }

    public ConscryptFileDescriptorSocket(SSLParametersImpl sSLParametersImpl) {
        this.sslParameters = sSLParametersImpl;
        this.ssl = newSsl(sSLParametersImpl, this);
        this.activeSession = new ActiveSession(this.ssl, sSLParametersImpl.getSessionContext());
    }

    private void assertReadableOrWriteableState() {
        int i = this.state;
        if (i != 5 && i != 4) {
            StringBuilder sb = new StringBuilder(26);
            sb.append("Invalid state: ");
            sb.append(i);
            throw new AssertionError(sb.toString());
        }
    }

    private ClientSessionContext clientSessionContext() {
        return this.sslParameters.getClientSessionContext();
    }

    private void closeUnderlyingSocket() {
        super.close();
    }

    private void free() {
        if (!this.ssl.isClosed()) {
            this.ssl.close();
            Platform.closeGuardClose(this.guard);
        }
    }

    private static NativeSsl newSsl(SSLParametersImpl sSLParametersImpl, ConscryptFileDescriptorSocket conscryptFileDescriptorSocket) {
        return NativeSsl.newInstance(sSLParametersImpl, conscryptFileDescriptorSocket, conscryptFileDescriptorSocket, conscryptFileDescriptorSocket);
    }

    /* access modifiers changed from: private */
    public ConscryptSession provideHandshakeSession() {
        ConscryptSession conscryptSession;
        synchronized (this.ssl) {
            int i = this.state;
            if (i >= 2) {
                if (i < 5) {
                    conscryptSession = this.activeSession;
                }
            }
            conscryptSession = SSLNullSession.getNullSession();
        }
        return conscryptSession;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0020, code lost:
        if (r3 == false) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0024, code lost:
        return r4.activeSession;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0029, code lost:
        return com.google.android.gms.org.conscrypt.SSLNullSession.getNullSession();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0033, code lost:
        return r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.gms.org.conscrypt.ConscryptSession provideSession() {
        /*
            r4 = this;
            com.google.android.gms.org.conscrypt.NativeSsl r0 = r4.ssl
            monitor-enter(r0)
            int r1 = r4.state     // Catch:{ all -> 0x0034 }
            r2 = 8
            if (r1 == r2) goto L_0x002a
            r2 = 5
            r3 = 1
            if (r1 < r2) goto L_0x000f
            r1 = 1
            goto L_0x0010
        L_0x000f:
            r1 = 0
        L_0x0010:
            if (r1 != 0) goto L_0x001e
            boolean r2 = r4.isConnected()     // Catch:{ IOException -> 0x001d }
            if (r2 != 0) goto L_0x0019
            goto L_0x001e
        L_0x0019:
            r4.waitForHandshake()     // Catch:{ IOException -> 0x001d }
            goto L_0x001f
        L_0x001d:
            r2 = move-exception
        L_0x001e:
            r3 = r1
        L_0x001f:
            monitor-exit(r0)     // Catch:{ all -> 0x0034 }
            if (r3 == 0) goto L_0x0025
            com.google.android.gms.org.conscrypt.ActiveSession r0 = r4.activeSession
            return r0
        L_0x0025:
            com.google.android.gms.org.conscrypt.ConscryptSession r0 = com.google.android.gms.org.conscrypt.SSLNullSession.getNullSession()
            return r0
        L_0x002a:
            com.google.android.gms.org.conscrypt.SessionSnapshot r1 = r4.closedSession     // Catch:{ all -> 0x0034 }
            if (r1 != 0) goto L_0x0032
            com.google.android.gms.org.conscrypt.ConscryptSession r1 = com.google.android.gms.org.conscrypt.SSLNullSession.getNullSession()     // Catch:{ all -> 0x0034 }
        L_0x0032:
            monitor-exit(r0)     // Catch:{ all -> 0x0034 }
            return r1
        L_0x0034:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0034 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.org.conscrypt.ConscryptFileDescriptorSocket.provideSession():com.google.android.gms.org.conscrypt.ConscryptSession");
    }

    private AbstractSessionContext sessionContext() {
        return this.sslParameters.getSessionContext();
    }

    private void shutdownAndFreeSslNative() {
        try {
            Platform.blockGuardOnNetwork();
            this.ssl.shutdown(Platform.getFileDescriptor(this.socket));
        } catch (IOException e) {
        } catch (Throwable th) {
            free();
            closeUnderlyingSocket();
            throw th;
        }
        free();
        closeUnderlyingSocket();
    }

    private void transitionTo(int i) {
        int i2;
        if (i == 8 && !this.ssl.isClosed() && (i2 = this.state) >= 2 && i2 < 8) {
            this.closedSession = new SessionSnapshot(this.activeSession);
        }
        this.state = i;
    }

    private void waitForHandshake() {
        startHandshake();
        synchronized (this.ssl) {
            while (true) {
                int i = this.state;
                if (i != 5 && i != 4) {
                    if (i != 8) {
                        try {
                            this.ssl.wait();
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                            throw new IOException("Interrupted waiting for handshake", e);
                        }
                    } else {
                        throw new SocketException("Socket is closed");
                    }
                }
            }
        }
    }

    public final String chooseClientAlias(X509KeyManager x509KeyManager, X500Principal[] x500PrincipalArr, String[] strArr) {
        return x509KeyManager.chooseClientAlias(strArr, x500PrincipalArr, this);
    }

    public final String chooseClientPSKIdentity(PSKKeyManager pSKKeyManager, String str) {
        return pSKKeyManager.chooseClientKeyIdentity(str, (Socket) this);
    }

    public final String chooseServerAlias(X509KeyManager x509KeyManager, String str) {
        return x509KeyManager.chooseServerAlias(str, (Principal[]) null, this);
    }

    public final String chooseServerPSKIdentityHint(PSKKeyManager pSKKeyManager) {
        return pSKKeyManager.chooseServerKeyIdentityHint((Socket) this);
    }

    public final void clientCertificateRequested(byte[] bArr, int[] iArr, byte[][] bArr2) {
        this.ssl.chooseClientCertificate(bArr, iArr, bArr2);
    }

    public final int clientPSKKeyRequested(String str, byte[] bArr, byte[] bArr2) {
        return this.ssl.clientPSKKeyRequested(str, bArr, bArr2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003a, code lost:
        if (r1 == null) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003d, code lost:
        if (r2 == null) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003f, code lost:
        r3.ssl.interrupt();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0044, code lost:
        if (r1 == null) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0046, code lost:
        r1.awaitPendingOps();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0049, code lost:
        if (r2 == null) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004b, code lost:
        r2.awaitPendingOps();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x004e, code lost:
        shutdownAndFreeSslNative();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0051, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void close() {
        /*
            r3 = this;
            com.google.android.gms.org.conscrypt.NativeSsl r0 = r3.ssl
            if (r0 == 0) goto L_0x0057
            monitor-enter(r0)
            int r1 = r3.state     // Catch:{ all -> 0x0054 }
            r2 = 8
            if (r1 == r2) goto L_0x0052
            r3.transitionTo(r2)     // Catch:{ all -> 0x0054 }
            if (r1 != 0) goto L_0x001d
            r3.free()     // Catch:{ all -> 0x0054 }
            r3.closeUnderlyingSocket()     // Catch:{ all -> 0x0054 }
            com.google.android.gms.org.conscrypt.NativeSsl r1 = r3.ssl     // Catch:{ all -> 0x0054 }
            r1.notifyAll()     // Catch:{ all -> 0x0054 }
            monitor-exit(r0)     // Catch:{ all -> 0x0054 }
            return
        L_0x001d:
            r2 = 5
            if (r1 != r2) goto L_0x0021
            goto L_0x0030
        L_0x0021:
            r2 = 4
            if (r1 == r2) goto L_0x0030
            com.google.android.gms.org.conscrypt.NativeSsl r1 = r3.ssl     // Catch:{ all -> 0x0054 }
            r1.interrupt()     // Catch:{ all -> 0x0054 }
            com.google.android.gms.org.conscrypt.NativeSsl r1 = r3.ssl     // Catch:{ all -> 0x0054 }
            r1.notifyAll()     // Catch:{ all -> 0x0054 }
            monitor-exit(r0)     // Catch:{ all -> 0x0054 }
            return
        L_0x0030:
            com.google.android.gms.org.conscrypt.NativeSsl r1 = r3.ssl     // Catch:{ all -> 0x0054 }
            r1.notifyAll()     // Catch:{ all -> 0x0054 }
            com.google.android.gms.org.conscrypt.ConscryptFileDescriptorSocket$SSLInputStream r1 = r3.is     // Catch:{ all -> 0x0054 }
            com.google.android.gms.org.conscrypt.ConscryptFileDescriptorSocket$SSLOutputStream r2 = r3.os     // Catch:{ all -> 0x0054 }
            monitor-exit(r0)     // Catch:{ all -> 0x0054 }
            if (r1 == 0) goto L_0x003d
            goto L_0x003f
        L_0x003d:
            if (r2 == 0) goto L_0x0044
        L_0x003f:
            com.google.android.gms.org.conscrypt.NativeSsl r0 = r3.ssl
            r0.interrupt()
        L_0x0044:
            if (r1 == 0) goto L_0x0049
            r1.awaitPendingOps()
        L_0x0049:
            if (r2 == 0) goto L_0x004e
            r2.awaitPendingOps()
        L_0x004e:
            r3.shutdownAndFreeSslNative()
            return
        L_0x0052:
            monitor-exit(r0)     // Catch:{ all -> 0x0054 }
            return
        L_0x0054:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0054 }
            throw r1
        L_0x0057:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.org.conscrypt.ConscryptFileDescriptorSocket.close():void");
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
    public final void finalize() {
        try {
            Object obj = this.guard;
            if (obj != null) {
                Platform.closeGuardWarnIfOpen(obj);
            }
            NativeSsl nativeSsl = this.ssl;
            if (nativeSsl != null) {
                synchronized (nativeSsl) {
                    transitionTo(8);
                }
            }
            super.finalize();
        } catch (Throwable th) {
            super.finalize();
            throw th;
        }
    }

    public final SSLSession getActiveSession() {
        return this.activeSession;
    }

    public final String getApplicationProtocol() {
        return SSLUtils.toProtocolString(this.ssl.getApplicationProtocol());
    }

    public final String[] getApplicationProtocols() {
        return this.sslParameters.getApplicationProtocols();
    }

    public final byte[] getChannelId() {
        if (!getUseClientMode()) {
            synchronized (this.ssl) {
                if (this.state != 5) {
                    throw new IllegalStateException("Channel ID is only available after handshake completes");
                }
            }
            return this.ssl.getTlsChannelId();
        }
        throw new IllegalStateException("Client mode");
    }

    public final boolean getEnableSessionCreation() {
        return this.sslParameters.getEnableSessionCreation();
    }

    public final String[] getEnabledCipherSuites() {
        return this.sslParameters.getEnabledCipherSuites();
    }

    public final String[] getEnabledProtocols() {
        return this.sslParameters.getEnabledProtocols();
    }

    public final String getHandshakeApplicationProtocol() {
        String str;
        synchronized (this.ssl) {
            int i = this.state;
            str = null;
            if (i >= 2 && i < 5) {
                str = getApplicationProtocol();
            }
        }
        return str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001c, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final javax.net.ssl.SSLSession getHandshakeSession() {
        /*
            r3 = this;
            com.google.android.gms.org.conscrypt.NativeSsl r0 = r3.ssl
            monitor-enter(r0)
            int r1 = r3.state     // Catch:{ all -> 0x001e }
            r2 = 2
            if (r1 < r2) goto L_0x001b
            r2 = 5
            if (r1 >= r2) goto L_0x001b
            com.google.android.gms.org.conscrypt.ExternalSession r1 = new com.google.android.gms.org.conscrypt.ExternalSession     // Catch:{ all -> 0x001e }
            com.google.android.gms.org.conscrypt.ConscryptFileDescriptorSocket$2 r2 = new com.google.android.gms.org.conscrypt.ConscryptFileDescriptorSocket$2     // Catch:{ all -> 0x001e }
            r2.<init>()     // Catch:{ all -> 0x001e }
            r1.<init>(r2)     // Catch:{ all -> 0x001e }
            javax.net.ssl.SSLSession r1 = com.google.android.gms.org.conscrypt.Platform.wrapSSLSession(r1)     // Catch:{ all -> 0x001e }
            monitor-exit(r0)     // Catch:{ all -> 0x001e }
            return r1
        L_0x001b:
            monitor-exit(r0)     // Catch:{ all -> 0x001e }
            r0 = 0
            return r0
        L_0x001e:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x001e }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.org.conscrypt.ConscryptFileDescriptorSocket.getHandshakeSession():javax.net.ssl.SSLSession");
    }

    public final InputStream getInputStream() {
        SSLInputStream sSLInputStream;
        checkOpen();
        synchronized (this.ssl) {
            if (this.state != 8) {
                if (this.is == null) {
                    this.is = new SSLInputStream();
                }
                sSLInputStream = this.is;
            } else {
                throw new SocketException("Socket is closed.");
            }
        }
        waitForHandshake();
        return sSLInputStream;
    }

    public final boolean getNeedClientAuth() {
        return this.sslParameters.getNeedClientAuth();
    }

    public final OutputStream getOutputStream() {
        SSLOutputStream sSLOutputStream;
        checkOpen();
        synchronized (this.ssl) {
            if (this.state != 8) {
                if (this.os == null) {
                    this.os = new SSLOutputStream();
                }
                sSLOutputStream = this.os;
            } else {
                throw new SocketException("Socket is closed.");
            }
        }
        waitForHandshake();
        return sSLOutputStream;
    }

    public final SecretKey getPSKKey(PSKKeyManager pSKKeyManager, String str, String str2) {
        return pSKKeyManager.getKey(str, str2, (Socket) this);
    }

    public final SSLParameters getSSLParameters() {
        SSLParameters sSLParameters = super.getSSLParameters();
        Platform.getSSLParameters(sSLParameters, this.sslParameters, (AbstractConscryptSocket) this);
        return sSLParameters;
    }

    public final SSLSession getSession() {
        return this.externalSession;
    }

    public final int getSoWriteTimeout() {
        return this.writeTimeoutMilliseconds;
    }

    public final String[] getSupportedCipherSuites() {
        return NativeCrypto.getSupportedCipherSuites();
    }

    public final String[] getSupportedProtocols() {
        return NativeCrypto.getSupportedProtocols();
    }

    public byte[] getTlsUnique() {
        return this.ssl.getTlsUnique();
    }

    public final boolean getUseClientMode() {
        return this.sslParameters.getUseClientMode();
    }

    public final boolean getWantClientAuth() {
        return this.sslParameters.getWantClientAuth();
    }

    public final void onNewSessionEstablished(long j) {
        try {
            NativeCrypto.SSL_SESSION_up_ref(j);
            sessionContext().cacheSession(NativeSslSession.newInstance(new NativeRef.SSL_SESSION(j), this.activeSession));
        } catch (Exception e) {
        }
    }

    public final void onSSLStateChange(int i, int i2) {
        if (i == 32) {
            synchronized (this.ssl) {
                if (this.state != 8) {
                    transitionTo(5);
                    notifyHandshakeCompletedListeners();
                    synchronized (this.ssl) {
                        this.ssl.notifyAll();
                    }
                }
            }
        }
    }

    public final int serverPSKKeyRequested(String str, String str2, byte[] bArr) {
        return this.ssl.serverPSKKeyRequested(str, str2, bArr);
    }

    public final long serverSessionRequested(byte[] bArr) {
        return 0;
    }

    public final void setApplicationProtocolSelector(ApplicationProtocolSelector applicationProtocolSelector) {
        ApplicationProtocolSelectorAdapter applicationProtocolSelectorAdapter;
        if (applicationProtocolSelector != null) {
            applicationProtocolSelectorAdapter = new ApplicationProtocolSelectorAdapter((SSLSocket) this, applicationProtocolSelector);
        } else {
            applicationProtocolSelectorAdapter = null;
        }
        setApplicationProtocolSelector(applicationProtocolSelectorAdapter);
    }

    public final void setApplicationProtocols(String[] strArr) {
        this.sslParameters.setApplicationProtocols(strArr);
    }

    public final void setChannelIdEnabled(boolean z) {
        if (!getUseClientMode()) {
            synchronized (this.ssl) {
                if (this.state != 0) {
                    throw new IllegalStateException("Could not enable/disable Channel ID after the initial handshake has begun.");
                }
            }
            this.sslParameters.channelIdEnabled = z;
            return;
        }
        throw new IllegalStateException("Client mode");
    }

    public final void setChannelIdPrivateKey(PrivateKey privateKey) {
        if (getUseClientMode()) {
            synchronized (this.ssl) {
                if (this.state != 0) {
                    throw new IllegalStateException("Could not change Channel ID private key after the initial handshake has begun.");
                }
            }
            ECParameterSpec eCParameterSpec = null;
            if (privateKey != null) {
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
            } else {
                this.sslParameters.channelIdEnabled = false;
                this.channelIdPrivateKey = null;
            }
        } else {
            throw new IllegalStateException("Server mode");
        }
    }

    public final void setEnableSessionCreation(boolean z) {
        this.sslParameters.setEnableSessionCreation(z);
    }

    public final void setEnabledCipherSuites(String[] strArr) {
        this.sslParameters.setEnabledCipherSuites(strArr);
    }

    public final void setEnabledProtocols(String[] strArr) {
        this.sslParameters.setEnabledProtocols(strArr);
    }

    public final void setHandshakeTimeout(int i) {
        this.handshakeTimeoutMilliseconds = i;
    }

    public final void setHostname(String str) {
        this.sslParameters.setUseSni(str != null);
        super.setHostname(str);
    }

    public final void setNeedClientAuth(boolean z) {
        this.sslParameters.setNeedClientAuth(z);
    }

    public final void setSSLParameters(SSLParameters sSLParameters) {
        super.setSSLParameters(sSLParameters);
        Platform.setSSLParameters(sSLParameters, this.sslParameters, (AbstractConscryptSocket) this);
    }

    public final void setSoWriteTimeout(int i) {
        this.writeTimeoutMilliseconds = i;
        Platform.setSocketWriteTimeout(this, (long) i);
    }

    public final void setUseClientMode(boolean z) {
        synchronized (this.ssl) {
            if (this.state != 0) {
                throw new IllegalArgumentException("Could not change the mode after the initial handshake has begun.");
            }
        }
        this.sslParameters.setUseClientMode(z);
    }

    public final void setUseSessionTickets(boolean z) {
        this.sslParameters.setUseSessionTickets(z);
    }

    public final void setWantClientAuth(boolean z) {
        this.sslParameters.setWantClientAuth(z);
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processExcHandler(RegionMaker.java:1043)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:975)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    public final void startHandshake() {
        /*
            r9 = this;
            r9.checkOpen()
            com.google.android.gms.org.conscrypt.NativeSsl r0 = r9.ssl
            monitor-enter(r0)
            int r1 = r9.state     // Catch:{ all -> 0x017d }
            if (r1 != 0) goto L_0x017b
            r1 = 2
            r9.transitionTo(r1)     // Catch:{ all -> 0x017d }
            monitor-exit(r0)     // Catch:{ all -> 0x017d }
            r0 = 1
            r2 = 8
            java.lang.Object r3 = r9.guard     // Catch:{ SSLProtocolException -> 0x0153, all -> 0x0151 }
            java.lang.String r4 = "close"
            com.google.android.gms.org.conscrypt.Platform.closeGuardOpen(r3, r4)     // Catch:{ SSLProtocolException -> 0x0153, all -> 0x0151 }
            com.google.android.gms.org.conscrypt.NativeSsl r3 = r9.ssl     // Catch:{ SSLProtocolException -> 0x0153, all -> 0x0151 }
            java.lang.String r4 = r9.getHostname()     // Catch:{ SSLProtocolException -> 0x0153, all -> 0x0151 }
            com.google.android.gms.org.conscrypt.OpenSSLKey r5 = r9.channelIdPrivateKey     // Catch:{ SSLProtocolException -> 0x0153, all -> 0x0151 }
            r3.initialize(r4, r5)     // Catch:{ SSLProtocolException -> 0x0153, all -> 0x0151 }
            boolean r3 = r9.getUseClientMode()     // Catch:{ SSLProtocolException -> 0x0153, all -> 0x0151 }
            if (r3 == 0) goto L_0x0044
            com.google.android.gms.org.conscrypt.ClientSessionContext r3 = r9.clientSessionContext()     // Catch:{ SSLProtocolException -> 0x0153, all -> 0x0151 }
            java.lang.String r4 = r9.getHostnameOrIP()     // Catch:{ SSLProtocolException -> 0x0153, all -> 0x0151 }
            int r5 = r9.getPort()     // Catch:{ SSLProtocolException -> 0x0153, all -> 0x0151 }
            com.google.android.gms.org.conscrypt.SSLParametersImpl r6 = r9.sslParameters     // Catch:{ SSLProtocolException -> 0x0153, all -> 0x0151 }
            com.google.android.gms.org.conscrypt.NativeSslSession r3 = r3.getCachedSession(r4, r5, r6)     // Catch:{ SSLProtocolException -> 0x0153, all -> 0x0151 }
            if (r3 != 0) goto L_0x003f
            goto L_0x0044
        L_0x003f:
            com.google.android.gms.org.conscrypt.NativeSsl r4 = r9.ssl     // Catch:{ SSLProtocolException -> 0x0153, all -> 0x0151 }
            r3.offerToResume(r4)     // Catch:{ SSLProtocolException -> 0x0153, all -> 0x0151 }
        L_0x0044:
            int r3 = r9.getSoTimeout()     // Catch:{ SSLProtocolException -> 0x0153, all -> 0x0151 }
            int r4 = r9.getSoWriteTimeout()     // Catch:{ SSLProtocolException -> 0x0153, all -> 0x0151 }
            int r5 = r9.handshakeTimeoutMilliseconds     // Catch:{ SSLProtocolException -> 0x0153, all -> 0x0151 }
            if (r5 < 0) goto L_0x0058
            r9.setSoTimeout(r5)     // Catch:{ SSLProtocolException -> 0x0153, all -> 0x0151 }
            int r5 = r9.handshakeTimeoutMilliseconds     // Catch:{ SSLProtocolException -> 0x0153, all -> 0x0151 }
            r9.setSoWriteTimeout(r5)     // Catch:{ SSLProtocolException -> 0x0153, all -> 0x0151 }
        L_0x0058:
            com.google.android.gms.org.conscrypt.NativeSsl r5 = r9.ssl     // Catch:{ SSLProtocolException -> 0x0153, all -> 0x0151 }
            monitor-enter(r5)     // Catch:{ SSLProtocolException -> 0x0153, all -> 0x0151 }
            int r6 = r9.state     // Catch:{ all -> 0x014e }
            if (r6 == r2) goto L_0x0138
            monitor-exit(r5)     // Catch:{ all -> 0x014e }
            r5 = 0
            com.google.android.gms.org.conscrypt.NativeSsl r6 = r9.ssl     // Catch:{ CertificateException -> 0x012a, SSLException -> 0x00ea }
            java.net.Socket r7 = r9.socket     // Catch:{ CertificateException -> 0x012a, SSLException -> 0x00ea }
            java.io.FileDescriptor r7 = com.google.android.gms.org.conscrypt.Platform.getFileDescriptor(r7)     // Catch:{ CertificateException -> 0x012a, SSLException -> 0x00ea }
            int r8 = r9.getSoTimeout()     // Catch:{ CertificateException -> 0x012a, SSLException -> 0x00ea }
            r6.doHandshake(r7, r8)     // Catch:{ CertificateException -> 0x012a, SSLException -> 0x00ea }
            com.google.android.gms.org.conscrypt.ActiveSession r6 = r9.activeSession     // Catch:{ CertificateException -> 0x012a, SSLException -> 0x00ea }
            java.lang.String r7 = r9.getHostnameOrIP()     // Catch:{ CertificateException -> 0x012a, SSLException -> 0x00ea }
            int r8 = r9.getPort()     // Catch:{ CertificateException -> 0x012a, SSLException -> 0x00ea }
            r6.onPeerCertificateAvailable(r7, r8)     // Catch:{ CertificateException -> 0x012a, SSLException -> 0x00ea }
            com.google.android.gms.org.conscrypt.NativeSsl r6 = r9.ssl     // Catch:{ SSLProtocolException -> 0x0153, all -> 0x0151 }
            monitor-enter(r6)     // Catch:{ SSLProtocolException -> 0x0153, all -> 0x0151 }
            int r7 = r9.state     // Catch:{ all -> 0x00e7 }
            if (r7 == r2) goto L_0x00d1
            monitor-exit(r6)     // Catch:{ all -> 0x00e7 }
            int r6 = r9.handshakeTimeoutMilliseconds     // Catch:{ SSLProtocolException -> 0x0153, all -> 0x0151 }
            if (r6 >= 0) goto L_0x008a
            goto L_0x0090
        L_0x008a:
            r9.setSoTimeout(r3)     // Catch:{ SSLProtocolException -> 0x0153, all -> 0x0151 }
            r9.setSoWriteTimeout(r4)     // Catch:{ SSLProtocolException -> 0x0153, all -> 0x0151 }
        L_0x0090:
            com.google.android.gms.org.conscrypt.NativeSsl r3 = r9.ssl     // Catch:{ SSLProtocolException -> 0x0153, all -> 0x0151 }
            monitor-enter(r3)     // Catch:{ SSLProtocolException -> 0x0153, all -> 0x0151 }
            int r4 = r9.state     // Catch:{ all -> 0x00c6 }
            if (r4 != r2) goto L_0x0098
            goto L_0x0099
        L_0x0098:
            r0 = 0
        L_0x0099:
            if (r4 == r1) goto L_0x00a0
            r1 = 5
            r9.transitionTo(r1)     // Catch:{ all -> 0x00c4 }
            goto L_0x00a4
        L_0x00a0:
            r1 = 4
            r9.transitionTo(r1)     // Catch:{ all -> 0x00c4 }
        L_0x00a4:
            if (r0 != 0) goto L_0x00ab
            com.google.android.gms.org.conscrypt.NativeSsl r1 = r9.ssl     // Catch:{ all -> 0x00c4 }
            r1.notifyAll()     // Catch:{ all -> 0x00c4 }
        L_0x00ab:
            monitor-exit(r3)     // Catch:{ all -> 0x00c4 }
            if (r0 == 0) goto L_0x00c3
            com.google.android.gms.org.conscrypt.NativeSsl r0 = r9.ssl
            monitor-enter(r0)
            r9.transitionTo(r2)     // Catch:{ all -> 0x00c0 }
            com.google.android.gms.org.conscrypt.NativeSsl r1 = r9.ssl     // Catch:{ all -> 0x00c0 }
            r1.notifyAll()     // Catch:{ all -> 0x00c0 }
            monitor-exit(r0)     // Catch:{ all -> 0x00c0 }
            r9.shutdownAndFreeSslNative()     // Catch:{ IOException -> 0x00be }
            return
        L_0x00be:
            r0 = move-exception
            return
        L_0x00c0:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00c0 }
            throw r1
        L_0x00c3:
            return
        L_0x00c4:
            r1 = move-exception
            goto L_0x00c7
        L_0x00c6:
            r1 = move-exception
        L_0x00c7:
            monitor-exit(r3)     // Catch:{ all -> 0x00cf }
            throw r1     // Catch:{ SSLProtocolException -> 0x00cc, all -> 0x00c9 }
        L_0x00c9:
            r1 = move-exception
            goto L_0x0163
        L_0x00cc:
            r1 = move-exception
            goto L_0x0154
        L_0x00cf:
            r1 = move-exception
            goto L_0x00c7
        L_0x00d1:
            monitor-exit(r6)     // Catch:{ all -> 0x00e7 }
            com.google.android.gms.org.conscrypt.NativeSsl r1 = r9.ssl
            monitor-enter(r1)
            r9.transitionTo(r2)     // Catch:{ all -> 0x00e4 }
            com.google.android.gms.org.conscrypt.NativeSsl r0 = r9.ssl     // Catch:{ all -> 0x00e4 }
            r0.notifyAll()     // Catch:{ all -> 0x00e4 }
            monitor-exit(r1)     // Catch:{ all -> 0x00e4 }
            r9.shutdownAndFreeSslNative()     // Catch:{ IOException -> 0x00e2 }
            return
        L_0x00e2:
            r0 = move-exception
            return
        L_0x00e4:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00e4 }
            throw r0
        L_0x00e7:
            r1 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x00e7 }
            throw r1     // Catch:{ SSLProtocolException -> 0x0153, all -> 0x0151 }
        L_0x00ea:
            r1 = move-exception
            com.google.android.gms.org.conscrypt.NativeSsl r3 = r9.ssl     // Catch:{ SSLProtocolException -> 0x0153, all -> 0x0151 }
            monitor-enter(r3)     // Catch:{ SSLProtocolException -> 0x0153, all -> 0x0151 }
            int r4 = r9.state     // Catch:{ all -> 0x0127 }
            if (r4 == r2) goto L_0x0111
            monitor-exit(r3)     // Catch:{ all -> 0x0127 }
            java.lang.String r3 = r1.getMessage()     // Catch:{ SSLProtocolException -> 0x0153, all -> 0x0151 }
            java.lang.String r4 = "unexpected CCS"
            boolean r3 = r3.contains(r4)     // Catch:{ SSLProtocolException -> 0x0153, all -> 0x0151 }
            if (r3 == 0) goto L_0x0110
            java.lang.Object[] r3 = new java.lang.Object[r0]     // Catch:{ SSLProtocolException -> 0x0153, all -> 0x0151 }
            java.lang.String r4 = r9.getHostnameOrIP()     // Catch:{ SSLProtocolException -> 0x0153, all -> 0x0151 }
            r3[r5] = r4     // Catch:{ SSLProtocolException -> 0x0153, all -> 0x0151 }
            java.lang.String r4 = "ssl_unexpected_ccs: host=%s"
            java.lang.String r3 = java.lang.String.format(r4, r3)     // Catch:{ SSLProtocolException -> 0x0153, all -> 0x0151 }
            com.google.android.gms.org.conscrypt.Platform.logEvent(r3)     // Catch:{ SSLProtocolException -> 0x0153, all -> 0x0151 }
        L_0x0110:
            throw r1     // Catch:{ SSLProtocolException -> 0x0153, all -> 0x0151 }
        L_0x0111:
            monitor-exit(r3)     // Catch:{ all -> 0x0127 }
            com.google.android.gms.org.conscrypt.NativeSsl r1 = r9.ssl
            monitor-enter(r1)
            r9.transitionTo(r2)     // Catch:{ all -> 0x0124 }
            com.google.android.gms.org.conscrypt.NativeSsl r0 = r9.ssl     // Catch:{ all -> 0x0124 }
            r0.notifyAll()     // Catch:{ all -> 0x0124 }
            monitor-exit(r1)     // Catch:{ all -> 0x0124 }
            r9.shutdownAndFreeSslNative()     // Catch:{ IOException -> 0x0122 }
            return
        L_0x0122:
            r0 = move-exception
            return
        L_0x0124:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0124 }
            throw r0
        L_0x0127:
            r1 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0127 }
            throw r1     // Catch:{ SSLProtocolException -> 0x0153, all -> 0x0151 }
        L_0x012a:
            r1 = move-exception
            javax.net.ssl.SSLHandshakeException r3 = new javax.net.ssl.SSLHandshakeException     // Catch:{ SSLProtocolException -> 0x0153, all -> 0x0151 }
            java.lang.String r4 = r1.getMessage()     // Catch:{ SSLProtocolException -> 0x0153, all -> 0x0151 }
            r3.<init>(r4)     // Catch:{ SSLProtocolException -> 0x0153, all -> 0x0151 }
            r3.initCause(r1)     // Catch:{ SSLProtocolException -> 0x0153, all -> 0x0151 }
            throw r3     // Catch:{ SSLProtocolException -> 0x0153, all -> 0x0151 }
        L_0x0138:
            monitor-exit(r5)     // Catch:{ all -> 0x014e }
            com.google.android.gms.org.conscrypt.NativeSsl r1 = r9.ssl
            monitor-enter(r1)
            r9.transitionTo(r2)     // Catch:{ all -> 0x014b }
            com.google.android.gms.org.conscrypt.NativeSsl r0 = r9.ssl     // Catch:{ all -> 0x014b }
            r0.notifyAll()     // Catch:{ all -> 0x014b }
            monitor-exit(r1)     // Catch:{ all -> 0x014b }
            r9.shutdownAndFreeSslNative()     // Catch:{ IOException -> 0x0149 }
            return
        L_0x0149:
            r0 = move-exception
            return
        L_0x014b:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x014b }
            throw r0
        L_0x014e:
            r1 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x014e }
            throw r1     // Catch:{ SSLProtocolException -> 0x0153, all -> 0x0151 }
        L_0x0151:
            r1 = move-exception
            goto L_0x0163
        L_0x0153:
            r1 = move-exception
        L_0x0154:
            javax.net.ssl.SSLHandshakeException r3 = new javax.net.ssl.SSLHandshakeException     // Catch:{ all -> 0x0162 }
            java.lang.String r4 = "Handshake failed"
            r3.<init>(r4)     // Catch:{ all -> 0x0162 }
            java.lang.Throwable r1 = r3.initCause(r1)     // Catch:{ all -> 0x0162 }
            javax.net.ssl.SSLHandshakeException r1 = (javax.net.ssl.SSLHandshakeException) r1     // Catch:{ all -> 0x0162 }
            throw r1     // Catch:{ all -> 0x0162 }
        L_0x0162:
            r1 = move-exception
        L_0x0163:
            if (r0 == 0) goto L_0x017a
            com.google.android.gms.org.conscrypt.NativeSsl r0 = r9.ssl
            monitor-enter(r0)
            r9.transitionTo(r2)     // Catch:{ all -> 0x0177 }
            com.google.android.gms.org.conscrypt.NativeSsl r2 = r9.ssl     // Catch:{ all -> 0x0177 }
            r2.notifyAll()     // Catch:{ all -> 0x0177 }
            monitor-exit(r0)     // Catch:{ all -> 0x0177 }
            r9.shutdownAndFreeSslNative()     // Catch:{ IOException -> 0x0175 }
            goto L_0x017a
        L_0x0175:
            r0 = move-exception
            goto L_0x017a
        L_0x0177:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0177 }
            throw r1
        L_0x017a:
            throw r1
        L_0x017b:
            monitor-exit(r0)     // Catch:{ all -> 0x017d }
            return
        L_0x017d:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x017d }
            goto L_0x0181
        L_0x0180:
            throw r1
        L_0x0181:
            goto L_0x0180
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.org.conscrypt.ConscryptFileDescriptorSocket.startHandshake():void");
    }

    public final void verifyCertificateChain(byte[][] bArr, String str) {
        if (bArr != null) {
            try {
                if (bArr.length != 0) {
                    X509Certificate[] decodeX509CertificateChain = SSLUtils.decodeX509CertificateChain(bArr);
                    X509TrustManager x509TrustManager = this.sslParameters.getX509TrustManager();
                    if (x509TrustManager != null) {
                        this.activeSession.onPeerCertificatesReceived(getHostnameOrIP(), getPort(), decodeX509CertificateChain);
                        if (!getUseClientMode()) {
                            Platform.checkClientTrusted(x509TrustManager, decodeX509CertificateChain, decodeX509CertificateChain[0].getPublicKey().getAlgorithm(), (AbstractConscryptSocket) this);
                            return;
                        } else {
                            Platform.checkServerTrusted(x509TrustManager, decodeX509CertificateChain, str, (AbstractConscryptSocket) this);
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

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    class SSLOutputStream extends OutputStream {
        private final Object writeLock = new Object();

        public SSLOutputStream() {
        }

        public void awaitPendingOps() {
            synchronized (this.writeLock) {
            }
        }

        public void write(int i) {
            write(new byte[]{(byte) (i & 255)});
        }

        public void write(byte[] bArr, int i, int i2) {
            Platform.blockGuardOnNetwork();
            ConscryptFileDescriptorSocket.this.checkOpen();
            ArrayUtils.checkOffsetAndCount(bArr.length, i, i2);
            if (i2 != 0) {
                synchronized (this.writeLock) {
                    synchronized (ConscryptFileDescriptorSocket.this.ssl) {
                        if (ConscryptFileDescriptorSocket.this.state == 8) {
                            throw new SocketException("socket is closed");
                        }
                    }
                    ConscryptFileDescriptorSocket.this.ssl.write(Platform.getFileDescriptor(ConscryptFileDescriptorSocket.this.socket), bArr, i, i2, ConscryptFileDescriptorSocket.this.writeTimeoutMilliseconds);
                    synchronized (ConscryptFileDescriptorSocket.this.ssl) {
                        if (ConscryptFileDescriptorSocket.this.state == 8) {
                            throw new SocketException("socket is closed");
                        }
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void setApplicationProtocolSelector(ApplicationProtocolSelectorAdapter applicationProtocolSelectorAdapter) {
        this.sslParameters.setApplicationProtocolSelector(applicationProtocolSelectorAdapter);
    }

    public ConscryptFileDescriptorSocket(String str, int i, SSLParametersImpl sSLParametersImpl) {
        super(str, i);
        this.sslParameters = sSLParametersImpl;
        this.ssl = newSsl(sSLParametersImpl, this);
        this.activeSession = new ActiveSession(this.ssl, sSLParametersImpl.getSessionContext());
    }

    public ConscryptFileDescriptorSocket(String str, int i, InetAddress inetAddress, int i2, SSLParametersImpl sSLParametersImpl) {
        super(str, i, inetAddress, i2);
        this.sslParameters = sSLParametersImpl;
        this.ssl = newSsl(sSLParametersImpl, this);
        this.activeSession = new ActiveSession(this.ssl, sSLParametersImpl.getSessionContext());
    }

    public ConscryptFileDescriptorSocket(InetAddress inetAddress, int i, SSLParametersImpl sSLParametersImpl) {
        super(inetAddress, i);
        this.sslParameters = sSLParametersImpl;
        this.ssl = newSsl(sSLParametersImpl, this);
        this.activeSession = new ActiveSession(this.ssl, sSLParametersImpl.getSessionContext());
    }

    public ConscryptFileDescriptorSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2, SSLParametersImpl sSLParametersImpl) {
        super(inetAddress, i, inetAddress2, i2);
        this.sslParameters = sSLParametersImpl;
        this.ssl = newSsl(sSLParametersImpl, this);
        this.activeSession = new ActiveSession(this.ssl, sSLParametersImpl.getSessionContext());
    }

    public ConscryptFileDescriptorSocket(Socket socket, String str, int i, boolean z, SSLParametersImpl sSLParametersImpl) {
        super(socket, str, i, z);
        this.sslParameters = sSLParametersImpl;
        this.ssl = newSsl(sSLParametersImpl, this);
        this.activeSession = new ActiveSession(this.ssl, sSLParametersImpl.getSessionContext());
    }
}
