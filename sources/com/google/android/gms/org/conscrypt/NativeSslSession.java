package com.google.android.gms.org.conscrypt;

import com.google.android.gms.org.conscrypt.NativeRef;
import com.google.android.gms.org.conscrypt.SSLUtils;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.Principal;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSessionContext;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
abstract class NativeSslSession {
    /* access modifiers changed from: private */
    public static final Logger logger = Logger.getLogger(NativeSslSession.class.getName());

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    final class Impl extends NativeSslSession {
        private final String cipherSuite;
        private final AbstractSessionContext context;
        private final String host;
        private final X509Certificate[] peerCertificates;
        private final byte[] peerOcspStapledResponse;
        private final byte[] peerSignedCertificateTimestamp;
        private final int port;
        private final String protocol;
        private final NativeRef.SSL_SESSION ref;

        private Impl(AbstractSessionContext abstractSessionContext, NativeRef.SSL_SESSION ssl_session, String str, int i, X509Certificate[] x509CertificateArr, byte[] bArr, byte[] bArr2) {
            this.context = abstractSessionContext;
            this.host = str;
            this.port = i;
            this.peerCertificates = x509CertificateArr;
            this.peerOcspStapledResponse = bArr;
            this.peerSignedCertificateTimestamp = bArr2;
            this.protocol = NativeCrypto.SSL_SESSION_get_version(ssl_session.address);
            this.cipherSuite = NativeCrypto.cipherSuiteToJava(NativeCrypto.SSL_SESSION_cipher(ssl_session.address));
            this.ref = ssl_session;
        }

        /* access modifiers changed from: private */
        public long getCreationTime() {
            return NativeCrypto.SSL_SESSION_get_time(this.ref.address);
        }

        public String getCipherSuite() {
            return this.cipherSuite;
        }

        public byte[] getId() {
            return NativeCrypto.SSL_SESSION_session_id(this.ref.address);
        }

        public String getPeerHost() {
            return this.host;
        }

        /* access modifiers changed from: package-private */
        public byte[] getPeerOcspStapledResponse() {
            return this.peerOcspStapledResponse;
        }

        public int getPeerPort() {
            return this.port;
        }

        /* access modifiers changed from: package-private */
        public byte[] getPeerSignedCertificateTimestamp() {
            return this.peerSignedCertificateTimestamp;
        }

        public String getProtocol() {
            return this.protocol;
        }

        public boolean isSingleUse() {
            return NativeCrypto.SSL_SESSION_should_be_single_use(this.ref.address);
        }

        public boolean isValid() {
            return System.currentTimeMillis() - (Math.max(0, Math.min((long) this.context.getSessionTimeout(), NativeCrypto.SSL_SESSION_get_timeout(this.ref.address))) * 1000) < getCreationTime();
        }

        public void offerToResume(NativeSsl nativeSsl) {
            nativeSsl.offerToResumeSession(this.ref.address);
        }

        public byte[] toBytes() {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
                dataOutputStream.writeInt(SSLUtils.SessionType.OPEN_SSL_WITH_TLS_SCT.value);
                byte[] i2d_SSL_SESSION = NativeCrypto.i2d_SSL_SESSION(this.ref.address);
                dataOutputStream.writeInt(i2d_SSL_SESSION.length);
                dataOutputStream.write(i2d_SSL_SESSION);
                dataOutputStream.writeInt(this.peerCertificates.length);
                for (X509Certificate encoded : this.peerCertificates) {
                    byte[] encoded2 = encoded.getEncoded();
                    dataOutputStream.writeInt(encoded2.length);
                    dataOutputStream.write(encoded2);
                }
                if (this.peerOcspStapledResponse != null) {
                    dataOutputStream.writeInt(1);
                    dataOutputStream.writeInt(this.peerOcspStapledResponse.length);
                    dataOutputStream.write(this.peerOcspStapledResponse);
                } else {
                    dataOutputStream.writeInt(0);
                }
                byte[] bArr = this.peerSignedCertificateTimestamp;
                if (bArr != null) {
                    dataOutputStream.writeInt(bArr.length);
                    dataOutputStream.write(this.peerSignedCertificateTimestamp);
                } else {
                    dataOutputStream.writeInt(0);
                }
                return byteArrayOutputStream.toByteArray();
            } catch (IOException e) {
                NativeSslSession.logger.logp(Level.WARNING, "com.google.android.gms.org.conscrypt.NativeSslSession$Impl", "toBytes", "Failed to convert saved SSL Session: ", e);
                return null;
            } catch (CertificateEncodingException e2) {
                NativeSslSession.log(e2);
                return null;
            }
        }

        public SSLSession toSSLSession() {
            return new SSLSession() {
                public int getApplicationBufferSize() {
                    throw new UnsupportedOperationException();
                }

                public String getCipherSuite() {
                    return Impl.this.getCipherSuite();
                }

                public long getCreationTime() {
                    return Impl.this.getCreationTime();
                }

                public byte[] getId() {
                    return Impl.this.getId();
                }

                public long getLastAccessedTime() {
                    throw new UnsupportedOperationException();
                }

                public Certificate[] getLocalCertificates() {
                    throw new UnsupportedOperationException();
                }

                public Principal getLocalPrincipal() {
                    throw new UnsupportedOperationException();
                }

                public int getPacketBufferSize() {
                    throw new UnsupportedOperationException();
                }

                public javax.security.cert.X509Certificate[] getPeerCertificateChain() {
                    throw new UnsupportedOperationException();
                }

                public Certificate[] getPeerCertificates() {
                    throw new UnsupportedOperationException();
                }

                public String getPeerHost() {
                    return Impl.this.getPeerHost();
                }

                public int getPeerPort() {
                    return Impl.this.getPeerPort();
                }

                public Principal getPeerPrincipal() {
                    throw new UnsupportedOperationException();
                }

                public String getProtocol() {
                    return Impl.this.getProtocol();
                }

                public SSLSessionContext getSessionContext() {
                    throw new UnsupportedOperationException();
                }

                public Object getValue(String str) {
                    throw new UnsupportedOperationException();
                }

                public String[] getValueNames() {
                    throw new UnsupportedOperationException();
                }

                public void invalidate() {
                    throw new UnsupportedOperationException();
                }

                public boolean isValid() {
                    return Impl.this.isValid();
                }

                public void putValue(String str, Object obj) {
                    throw new UnsupportedOperationException();
                }

                public void removeValue(String str) {
                    throw new UnsupportedOperationException();
                }
            };
        }
    }

    private static void checkRemaining(ByteBuffer byteBuffer, int i) {
        if (i < 0) {
            StringBuilder sb = new StringBuilder(31);
            sb.append("Length is negative: ");
            sb.append(i);
            throw new IOException(sb.toString());
        } else if (i > byteBuffer.remaining()) {
            int remaining = byteBuffer.remaining();
            StringBuilder sb2 = new StringBuilder(66);
            sb2.append("Length of blob is longer than available: ");
            sb2.append(i);
            sb2.append(" > ");
            sb2.append(remaining);
            throw new IOException(sb2.toString());
        }
    }

    private static byte[] getOcspResponse(ConscryptSession conscryptSession) {
        List statusResponses = conscryptSession.getStatusResponses();
        if (statusResponses.size() > 0) {
            return (byte[]) statusResponses.get(0);
        }
        return null;
    }

    /* access modifiers changed from: private */
    public static void log(Throwable th) {
        logger.logp(Level.INFO, "com.google.android.gms.org.conscrypt.NativeSslSession", "log", "Error inflating SSL session: {0}", th.getMessage() == null ? th.getClass().getName() : th.getMessage());
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0097 A[Catch:{ Exception -> 0x003c, IOException -> 0x00ed, BufferUnderflowException -> 0x00e8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00ae A[Catch:{ Exception -> 0x003c, IOException -> 0x00ed, BufferUnderflowException -> 0x00e8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00b9 A[Catch:{ Exception -> 0x003c, IOException -> 0x00ed, BufferUnderflowException -> 0x00e8 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static com.google.android.gms.org.conscrypt.NativeSslSession newInstance(com.google.android.gms.org.conscrypt.AbstractSessionContext r14, byte[] r15, java.lang.String r16, int r17) {
        /*
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r15)
            r1 = 0
            int r2 = r0.getInt()     // Catch:{ IOException -> 0x00ed, BufferUnderflowException -> 0x00e8 }
            boolean r3 = com.google.android.gms.org.conscrypt.SSLUtils.SessionType.isSupportedType(r2)     // Catch:{ IOException -> 0x00ed, BufferUnderflowException -> 0x00e8 }
            if (r3 == 0) goto L_0x00cf
            int r3 = r0.getInt()     // Catch:{ IOException -> 0x00ed, BufferUnderflowException -> 0x00e8 }
            checkRemaining(r0, r3)     // Catch:{ IOException -> 0x00ed, BufferUnderflowException -> 0x00e8 }
            byte[] r3 = new byte[r3]     // Catch:{ IOException -> 0x00ed, BufferUnderflowException -> 0x00e8 }
            r0.get(r3)     // Catch:{ IOException -> 0x00ed, BufferUnderflowException -> 0x00e8 }
            int r4 = r0.getInt()     // Catch:{ IOException -> 0x00ed, BufferUnderflowException -> 0x00e8 }
            checkRemaining(r0, r4)     // Catch:{ IOException -> 0x00ed, BufferUnderflowException -> 0x00e8 }
            java.security.cert.X509Certificate[] r10 = new java.security.cert.X509Certificate[r4]     // Catch:{ IOException -> 0x00ed, BufferUnderflowException -> 0x00e8 }
            r5 = 0
        L_0x0025:
            if (r5 >= r4) goto L_0x005e
            int r6 = r0.getInt()     // Catch:{ IOException -> 0x00ed, BufferUnderflowException -> 0x00e8 }
            checkRemaining(r0, r6)     // Catch:{ IOException -> 0x00ed, BufferUnderflowException -> 0x00e8 }
            byte[] r6 = new byte[r6]     // Catch:{ IOException -> 0x00ed, BufferUnderflowException -> 0x00e8 }
            r0.get(r6)     // Catch:{ IOException -> 0x00ed, BufferUnderflowException -> 0x00e8 }
            com.google.android.gms.org.conscrypt.OpenSSLX509Certificate r6 = com.google.android.gms.org.conscrypt.OpenSSLX509Certificate.fromX509Der(r6)     // Catch:{ Exception -> 0x003c }
            r10[r5] = r6     // Catch:{ Exception -> 0x003c }
            int r5 = r5 + 1
            goto L_0x0025
        L_0x003c:
            r0 = move-exception
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException -> 0x00ed, BufferUnderflowException -> 0x00e8 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00ed, BufferUnderflowException -> 0x00e8 }
            r3 = 48
            r2.<init>(r3)     // Catch:{ IOException -> 0x00ed, BufferUnderflowException -> 0x00e8 }
            java.lang.String r3 = "Can not read certificate "
            r2.append(r3)     // Catch:{ IOException -> 0x00ed, BufferUnderflowException -> 0x00e8 }
            r2.append(r5)     // Catch:{ IOException -> 0x00ed, BufferUnderflowException -> 0x00e8 }
            java.lang.String r3 = "/"
            r2.append(r3)     // Catch:{ IOException -> 0x00ed, BufferUnderflowException -> 0x00e8 }
            r2.append(r4)     // Catch:{ IOException -> 0x00ed, BufferUnderflowException -> 0x00e8 }
            java.lang.String r2 = r2.toString()     // Catch:{ IOException -> 0x00ed, BufferUnderflowException -> 0x00e8 }
            r0.<init>(r2)     // Catch:{ IOException -> 0x00ed, BufferUnderflowException -> 0x00e8 }
            throw r0     // Catch:{ IOException -> 0x00ed, BufferUnderflowException -> 0x00e8 }
        L_0x005e:
            com.google.android.gms.org.conscrypt.SSLUtils$SessionType r4 = com.google.android.gms.org.conscrypt.SSLUtils.SessionType.OPEN_SSL_WITH_OCSP     // Catch:{ IOException -> 0x00ed, BufferUnderflowException -> 0x00e8 }
            int r4 = r4.value     // Catch:{ IOException -> 0x00ed, BufferUnderflowException -> 0x00e8 }
            if (r2 < r4) goto L_0x0090
            int r4 = r0.getInt()     // Catch:{ IOException -> 0x00ed, BufferUnderflowException -> 0x00e8 }
            checkRemaining(r0, r4)     // Catch:{ IOException -> 0x00ed, BufferUnderflowException -> 0x00e8 }
            if (r4 <= 0) goto L_0x0090
            int r5 = r0.getInt()     // Catch:{ IOException -> 0x00ed, BufferUnderflowException -> 0x00e8 }
            checkRemaining(r0, r5)     // Catch:{ IOException -> 0x00ed, BufferUnderflowException -> 0x00e8 }
            byte[] r5 = new byte[r5]     // Catch:{ IOException -> 0x00ed, BufferUnderflowException -> 0x00e8 }
            r0.get(r5)     // Catch:{ IOException -> 0x00ed, BufferUnderflowException -> 0x00e8 }
            r6 = 1
        L_0x007a:
            if (r6 >= r4) goto L_0x008e
            int r7 = r0.getInt()     // Catch:{ IOException -> 0x00ed, BufferUnderflowException -> 0x00e8 }
            checkRemaining(r0, r7)     // Catch:{ IOException -> 0x00ed, BufferUnderflowException -> 0x00e8 }
            int r8 = r0.position()     // Catch:{ IOException -> 0x00ed, BufferUnderflowException -> 0x00e8 }
            int r8 = r8 + r7
            r0.position(r8)     // Catch:{ IOException -> 0x00ed, BufferUnderflowException -> 0x00e8 }
            int r6 = r6 + 1
            goto L_0x007a
        L_0x008e:
            r11 = r5
            goto L_0x0091
        L_0x0090:
            r11 = r1
        L_0x0091:
            com.google.android.gms.org.conscrypt.SSLUtils$SessionType r4 = com.google.android.gms.org.conscrypt.SSLUtils.SessionType.OPEN_SSL_WITH_TLS_SCT     // Catch:{ IOException -> 0x00ed, BufferUnderflowException -> 0x00e8 }
            int r4 = r4.value     // Catch:{ IOException -> 0x00ed, BufferUnderflowException -> 0x00e8 }
            if (r2 != r4) goto L_0x00a7
            int r2 = r0.getInt()     // Catch:{ IOException -> 0x00ed, BufferUnderflowException -> 0x00e8 }
            checkRemaining(r0, r2)     // Catch:{ IOException -> 0x00ed, BufferUnderflowException -> 0x00e8 }
            if (r2 <= 0) goto L_0x00a7
            byte[] r2 = new byte[r2]     // Catch:{ IOException -> 0x00ed, BufferUnderflowException -> 0x00e8 }
            r0.get(r2)     // Catch:{ IOException -> 0x00ed, BufferUnderflowException -> 0x00e8 }
            r12 = r2
            goto L_0x00a8
        L_0x00a7:
            r12 = r1
        L_0x00a8:
            int r0 = r0.remaining()     // Catch:{ IOException -> 0x00ed, BufferUnderflowException -> 0x00e8 }
            if (r0 == 0) goto L_0x00b9
            java.lang.AssertionError r0 = new java.lang.AssertionError     // Catch:{ IOException -> 0x00ed, BufferUnderflowException -> 0x00e8 }
            java.lang.String r2 = "Read entire session, but data still remains; rejecting"
            r0.<init>(r2)     // Catch:{ IOException -> 0x00ed, BufferUnderflowException -> 0x00e8 }
            log(r0)     // Catch:{ IOException -> 0x00ed, BufferUnderflowException -> 0x00e8 }
            return r1
        L_0x00b9:
            com.google.android.gms.org.conscrypt.NativeRef$SSL_SESSION r7 = new com.google.android.gms.org.conscrypt.NativeRef$SSL_SESSION     // Catch:{ IOException -> 0x00ed, BufferUnderflowException -> 0x00e8 }
            long r2 = com.google.android.gms.org.conscrypt.NativeCrypto.d2i_SSL_SESSION(r3)     // Catch:{ IOException -> 0x00ed, BufferUnderflowException -> 0x00e8 }
            r7.<init>(r2)     // Catch:{ IOException -> 0x00ed, BufferUnderflowException -> 0x00e8 }
            com.google.android.gms.org.conscrypt.NativeSslSession$Impl r0 = new com.google.android.gms.org.conscrypt.NativeSslSession$Impl     // Catch:{ IOException -> 0x00ed, BufferUnderflowException -> 0x00e8 }
            r13 = 0
            r5 = r0
            r6 = r14
            r8 = r16
            r9 = r17
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)     // Catch:{ IOException -> 0x00ed, BufferUnderflowException -> 0x00e8 }
            return r0
        L_0x00cf:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException -> 0x00ed, BufferUnderflowException -> 0x00e8 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00ed, BufferUnderflowException -> 0x00e8 }
            r4 = 31
            r3.<init>(r4)     // Catch:{ IOException -> 0x00ed, BufferUnderflowException -> 0x00e8 }
            java.lang.String r4 = "Unexpected type ID: "
            r3.append(r4)     // Catch:{ IOException -> 0x00ed, BufferUnderflowException -> 0x00e8 }
            r3.append(r2)     // Catch:{ IOException -> 0x00ed, BufferUnderflowException -> 0x00e8 }
            java.lang.String r2 = r3.toString()     // Catch:{ IOException -> 0x00ed, BufferUnderflowException -> 0x00e8 }
            r0.<init>(r2)     // Catch:{ IOException -> 0x00ed, BufferUnderflowException -> 0x00e8 }
            throw r0     // Catch:{ IOException -> 0x00ed, BufferUnderflowException -> 0x00e8 }
        L_0x00e8:
            r0 = move-exception
            log(r0)
            return r1
        L_0x00ed:
            r0 = move-exception
            log(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.org.conscrypt.NativeSslSession.newInstance(com.google.android.gms.org.conscrypt.AbstractSessionContext, byte[], java.lang.String, int):com.google.android.gms.org.conscrypt.NativeSslSession");
    }

    public abstract String getCipherSuite();

    public abstract byte[] getId();

    public abstract String getPeerHost();

    /* access modifiers changed from: package-private */
    public abstract byte[] getPeerOcspStapledResponse();

    public abstract int getPeerPort();

    /* access modifiers changed from: package-private */
    public abstract byte[] getPeerSignedCertificateTimestamp();

    public abstract String getProtocol();

    public abstract boolean isSingleUse();

    public abstract boolean isValid();

    public abstract void offerToResume(NativeSsl nativeSsl);

    public abstract byte[] toBytes();

    public abstract SSLSession toSSLSession();

    static NativeSslSession newInstance(NativeRef.SSL_SESSION ssl_session, ConscryptSession conscryptSession) {
        AbstractSessionContext abstractSessionContext = (AbstractSessionContext) conscryptSession.getSessionContext();
        if (!(abstractSessionContext instanceof ClientSessionContext)) {
            return new Impl(abstractSessionContext, ssl_session, (String) null, -1, (X509Certificate[]) null, (byte[]) null, (byte[]) null);
        }
        return new Impl(abstractSessionContext, ssl_session, conscryptSession.getPeerHost(), conscryptSession.getPeerPort(), conscryptSession.getPeerCertificates(), getOcspResponse(conscryptSession), conscryptSession.getPeerSignedCertificateTimestamp());
    }
}
