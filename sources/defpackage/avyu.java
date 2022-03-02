package defpackage;

import java.util.Arrays;
import javax.net.ssl.SSLSocket;

/* renamed from: avyu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class avyu {
    public static final avyu a;
    public static final avyu b;
    public static final avyu c = new avyt(false).a();
    private static final avyp[] h = {avyp.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, avyp.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, avyp.TLS_DHE_RSA_WITH_AES_128_GCM_SHA256, avyp.TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA, avyp.TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA, avyp.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA, avyp.TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA, avyp.TLS_DHE_RSA_WITH_AES_128_CBC_SHA, avyp.TLS_DHE_RSA_WITH_AES_256_CBC_SHA, avyp.TLS_RSA_WITH_AES_128_GCM_SHA256, avyp.TLS_RSA_WITH_AES_128_CBC_SHA, avyp.TLS_RSA_WITH_AES_256_CBC_SHA, avyp.TLS_RSA_WITH_3DES_EDE_CBC_SHA};
    public final boolean d;
    public final boolean e;
    public final String[] f;
    public final String[] g;

    static {
        avyt avyt = new avyt(true);
        avyp[] avypArr = h;
        if (avyt.a) {
            String[] strArr = new String[avypArr.length];
            for (int i = 0; i < avypArr.length; i++) {
                strArr[i] = avypArr[i].aS;
            }
            avyt.a(strArr);
            avyt.a(avzp.TLS_1_2, avzp.TLS_1_1, avzp.TLS_1_0);
            avyt.b();
            a = avyt.a();
            avyt avyt2 = new avyt(a);
            avyt2.a(avzp.TLS_1_0);
            avyt2.b();
            b = avyt2.a();
            return;
        }
        throw new IllegalStateException("no cipher suites for cleartext connections");
    }

    public avyu(avyt avyt) {
        this.d = avyt.a;
        this.f = avyt.b;
        this.g = avyt.c;
        this.e = avyt.d;
    }

    private static boolean a(String[] strArr, String[] strArr2) {
        if (!(strArr2 == null || (r1 = strArr.length) == 0 || strArr2.length == 0)) {
            for (String a2 : strArr) {
                if (awaj.a(strArr2, a2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof avyu)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        avyu avyu = (avyu) obj;
        boolean z = this.d;
        if (z == avyu.d) {
            return !z || (Arrays.equals(this.f, avyu.f) && Arrays.equals(this.g, avyu.g) && this.e == avyu.e);
        }
        return false;
    }

    public final int hashCode() {
        if (this.d) {
            return ((((Arrays.hashCode(this.f) + 527) * 31) + Arrays.hashCode(this.g)) * 31) + (this.e ^ true ? 1 : 0);
        }
        return 17;
    }

    public final String toString() {
        String str;
        if (!this.d) {
            return "ConnectionSpec()";
        }
        String[] strArr = this.f;
        int i = 0;
        String str2 = "[all enabled]";
        if (strArr != null) {
            avyp[] avypArr = new avyp[strArr.length];
            int i2 = 0;
            while (true) {
                String[] strArr2 = this.f;
                if (i2 >= strArr2.length) {
                    break;
                }
                avypArr[i2] = avyp.b(strArr2[i2]);
                i2++;
            }
            str = awaj.a((Object[]) avypArr).toString();
        } else {
            str = str2;
        }
        String[] strArr3 = this.g;
        if (strArr3 != null) {
            avzp[] avzpArr = new avzp[strArr3.length];
            while (true) {
                String[] strArr4 = this.g;
                if (i >= strArr4.length) {
                    break;
                }
                avzpArr[i] = avzp.a(strArr4[i]);
                i++;
            }
            str2 = awaj.a((Object[]) avzpArr).toString();
        }
        boolean z = this.e;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 72 + String.valueOf(str2).length());
        sb.append("ConnectionSpec(cipherSuites=");
        sb.append(str);
        sb.append(", tlsVersions=");
        sb.append(str2);
        sb.append(", supportsTlsExtensions=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    public final boolean a(SSLSocket sSLSocket) {
        if (!this.d) {
            return false;
        }
        String[] strArr = this.g;
        if (strArr != null && !a(strArr, sSLSocket.getEnabledProtocols())) {
            return false;
        }
        String[] strArr2 = this.f;
        if (strArr2 == null || a(strArr2, sSLSocket.getEnabledCipherSuites())) {
            return true;
        }
        return false;
    }
}
