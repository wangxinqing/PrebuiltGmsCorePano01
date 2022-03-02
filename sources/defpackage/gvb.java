package defpackage;

import android.net.TrafficStats;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.Certificate;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.X509Certificate;
import java.util.Date;
import java.util.zip.GZIPOutputStream;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* renamed from: gvb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class gvb {
    private static final iwd c = gzk.a("AuthdNetTimeProvider");
    public int a;
    public int b;

    public final long a(HttpURLConnection httpURLConnection, gwr gwr, long j) {
        X509TrustManager x509TrustManager;
        try {
            TrustManagerFactory instance = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            instance.init((KeyStore) null);
            TrustManager[] trustManagers = instance.getTrustManagers();
            int length = trustManagers.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    x509TrustManager = null;
                    break;
                }
                TrustManager trustManager = trustManagers[i];
                if (trustManager instanceof X509TrustManager) {
                    x509TrustManager = (X509TrustManager) trustManager;
                    break;
                }
                i++;
            }
            if (x509TrustManager != null) {
                return a(httpURLConnection, x509TrustManager, gwr, j);
            }
            throw new IOException("No default X.509 TrustManager installed");
        } catch (KeyStoreException | NoSuchAlgorithmException e) {
            throw new IOException("Failed to obtain default X.509 TrustManager", e);
        }
    }

    /* access modifiers changed from: package-private */
    public final long a(HttpURLConnection httpURLConnection, X509TrustManager x509TrustManager, gwr gwr, long j) {
        gwr gwr2 = gwr;
        long j2 = j;
        if (gwr2.i) {
            izj.b(1032);
        } else {
            TrafficStats.setThreadStatsTag(1032);
        }
        gva gva = new gva(x509TrustManager);
        try {
            SSLContext instance = SSLContext.getInstance("TLS");
            instance.init((KeyManager[]) null, new TrustManager[]{gva}, (SecureRandom) null);
            SSLSocketFactory socketFactory = instance.getSocketFactory();
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection) httpURLConnection;
            httpsURLConnection.setSSLSocketFactory(socketFactory);
            httpsURLConnection.setConnectTimeout(this.a);
            httpsURLConnection.setReadTimeout(this.b);
            httpsURLConnection.setInstanceFollowRedirects(false);
            httpsURLConnection.setUseCaches(false);
            httpsURLConnection.setRequestMethod("POST");
            httpsURLConnection.setRequestProperty("Content-type", "application/x-protobuffer");
            httpsURLConnection.setRequestProperty("Content-encoding", "gzip");
            httpsURLConnection.setRequestProperty("Accept-encoding", "gzip");
            httpsURLConnection.setDoOutput(true);
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(httpsURLConnection.getOutputStream());
            aucd o = had.o.o();
            hac hac = hac.r;
            if (o.c) {
                o.c();
                o.c = false;
            }
            had had = (had) o.b;
            hac.getClass();
            had.b = hac;
            int i = had.a | 1;
            had.a = i;
            hag hag = gwr2.p;
            if (hag != null) {
                hag.getClass();
                had.l = hag;
                had.a = i | 2048;
                iwd iwd = c;
                Object[] objArr = new Object[2];
                int a2 = haf.a(hag.b);
                if (a2 == 0) {
                    a2 = 1;
                }
                objArr[0] = Integer.valueOf(a2 - 1);
                objArr[1] = Integer.valueOf(hag.c);
                iwd.c("Checkin reason type: %d attempt count: %d.", objArr);
            }
            aucd o2 = gzr.A.o();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            gzr gzr = (gzr) o2.b;
            had had2 = (had) o.i();
            had2.getClass();
            gzr.l = had2;
            gzr.a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            ((gzr) o2.i()).a(gZIPOutputStream);
            gZIPOutputStream.close();
            try {
                gzs a3 = gwa.a(gwr2, (HttpURLConnection) httpsURLConnection, httpsURLConnection.getResponseCode());
                if ((a3.a & 2) != 0) {
                    long j3 = a3.c;
                    c.b("Network time: %d", Long.valueOf(j3));
                    long j4 = Long.MAX_VALUE;
                    long j5 = Long.MIN_VALUE;
                    for (Certificate certificate : httpsURLConnection.getServerCertificates()) {
                        if (certificate instanceof X509Certificate) {
                            X509Certificate x509Certificate = (X509Certificate) certificate;
                            Date notBefore = x509Certificate.getNotBefore();
                            if (notBefore != null) {
                                long time = notBefore.getTime();
                                if (time > j5) {
                                    j5 = time;
                                }
                            }
                            Date notAfter = x509Certificate.getNotAfter();
                            if (notAfter != null) {
                                long time2 = notAfter.getTime();
                                if (time2 < j4) {
                                    j4 = time2;
                                }
                            }
                        }
                    }
                    if (j3 > j4) {
                        SSLHandshakeException sSLHandshakeException = new SSLHandshakeException("Server certificate chain invalid");
                        String valueOf = String.valueOf(new Date(j4));
                        String valueOf2 = String.valueOf(new Date(j3));
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 59 + String.valueOf(valueOf2).length());
                        sb.append("Server certificate chain expired. NotAfter: ");
                        sb.append(valueOf);
                        sb.append(", server time: ");
                        sb.append(valueOf2);
                        throw ((SSLHandshakeException) sSLHandshakeException.initCause(new CertificateExpiredException(sb.toString())));
                    } else if (j3 < j5) {
                        SSLHandshakeException sSLHandshakeException2 = new SSLHandshakeException("Server certificate chain invalid");
                        String valueOf3 = String.valueOf(new Date(j5));
                        String valueOf4 = String.valueOf(new Date(j3));
                        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf3).length() + 66 + String.valueOf(valueOf4).length());
                        sb2.append("Server certificate chain not yet valid. NotBefore: ");
                        sb2.append(valueOf3);
                        sb2.append(", server time: ");
                        sb2.append(valueOf4);
                        throw ((SSLHandshakeException) sSLHandshakeException2.initCause(new CertificateNotYetValidException(sb2.toString())));
                    } else if (j3 > j2) {
                        gwa.a((HttpURLConnection) httpsURLConnection);
                        return j3;
                    } else {
                        String valueOf5 = String.valueOf(new Date(j2));
                        String valueOf6 = String.valueOf(new Date(j3));
                        StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf5).length() + 72 + String.valueOf(valueOf6).length());
                        sb3.append("Timestamp returned by server is in the past. Known past: ");
                        sb3.append(valueOf5);
                        sb3.append(", server time: ");
                        sb3.append(valueOf6);
                        throw new IOException(sb3.toString());
                    }
                } else {
                    throw new IOException("No timestamp in checkin server response");
                }
            } finally {
                jlk.a(httpsURLConnection);
                izj.a();
            }
        } catch (KeyManagementException | NoSuchAlgorithmException e) {
            throw new IOException("Failed to initialize SSLContext", e);
        }
    }
}
