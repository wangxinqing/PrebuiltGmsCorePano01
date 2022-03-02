package defpackage;

import java.util.Arrays;
import java.util.List;

/* renamed from: banj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class banj {
    public static final banj a;
    private static final banh[] f = {banh.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, banh.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, banh.TLS_DHE_RSA_WITH_AES_128_GCM_SHA256, banh.TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA, banh.TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA, banh.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA, banh.TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA, banh.TLS_DHE_RSA_WITH_AES_128_CBC_SHA, banh.TLS_DHE_DSS_WITH_AES_128_CBC_SHA, banh.TLS_DHE_RSA_WITH_AES_256_CBC_SHA, banh.TLS_RSA_WITH_AES_128_GCM_SHA256, banh.TLS_RSA_WITH_AES_128_CBC_SHA, banh.TLS_RSA_WITH_AES_256_CBC_SHA, banh.TLS_RSA_WITH_3DES_EDE_CBC_SHA};
    final boolean b;
    public final String[] c;
    public final String[] d;
    public final boolean e;

    static {
        bani bani = new bani(true);
        bani.a(f);
        bani.a(banw.TLS_1_2, banw.TLS_1_1, banw.TLS_1_0);
        bani.b();
        a = bani.a();
        bani bani2 = new bani(a);
        bani2.a(banw.TLS_1_0);
        bani2.b();
        bani2.a();
        new bani(false).a();
    }

    public banj(bani bani) {
        this.b = bani.a;
        this.c = bani.b;
        this.d = bani.c;
        this.e = bani.d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof banj)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        banj banj = (banj) obj;
        boolean z = this.b;
        if (z == banj.b) {
            return !z || (Arrays.equals(this.c, banj.c) && Arrays.equals(this.d, banj.d) && this.e == banj.e);
        }
        return false;
    }

    public final int hashCode() {
        if (this.b) {
            return ((((Arrays.hashCode(this.c) + 527) * 31) + Arrays.hashCode(this.d)) * 31) + (this.e ^ true ? 1 : 0);
        }
        return 17;
    }

    public final String toString() {
        List list;
        String str;
        if (!this.b) {
            return "ConnectionSpec()";
        }
        String[] strArr = this.c;
        int i = 0;
        if (strArr != null) {
            banh[] banhArr = new banh[strArr.length];
            int i2 = 0;
            while (true) {
                String[] strArr2 = this.c;
                if (i2 >= strArr2.length) {
                    break;
                }
                banhArr[i2] = banh.b(strArr2[i2]);
                i2++;
            }
            list = banx.a(banhArr);
        } else {
            list = null;
        }
        if (list != null) {
            str = list.toString();
        } else {
            str = "[use default]";
        }
        banw[] banwArr = new banw[this.d.length];
        while (true) {
            String[] strArr3 = this.d;
            if (i < strArr3.length) {
                banwArr[i] = banw.a(strArr3[i]);
                i++;
            } else {
                String valueOf = String.valueOf(banx.a(banwArr));
                boolean z = this.e;
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 72 + String.valueOf(valueOf).length());
                sb.append("ConnectionSpec(cipherSuites=");
                sb.append(str);
                sb.append(", tlsVersions=");
                sb.append(valueOf);
                sb.append(", supportsTlsExtensions=");
                sb.append(z);
                sb.append(")");
                return sb.toString();
            }
        }
    }
}
