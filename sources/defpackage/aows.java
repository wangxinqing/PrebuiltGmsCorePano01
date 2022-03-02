package defpackage;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;

/* renamed from: aows  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aows {
    public static String a(int i) {
        int i2 = i - 2;
        if (i2 == 1) {
            return "HmacSha1";
        }
        if (i2 == 3) {
            return "HmacSha256";
        }
        if (i2 == 4) {
            return "HmacSha512";
        }
        String valueOf = String.valueOf(Integer.toString(aoyp.a(i)));
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
        sb.append("hash unsupported for HMAC: ");
        sb.append(valueOf);
        throw new NoSuchAlgorithmException(sb.toString());
    }

    public static int b(int i) {
        int i2 = i - 2;
        if (i2 == 2) {
            return 1;
        }
        if (i2 == 3) {
            return 2;
        }
        if (i2 == 4) {
            return 3;
        }
        String valueOf = String.valueOf(aoyn.c(i));
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
        sb.append("unknown curve type: ");
        sb.append(valueOf);
        throw new GeneralSecurityException(sb.toString());
    }

    public static int c(int i) {
        int i2 = i - 2;
        int i3 = 1;
        if (i2 != 1) {
            i3 = 2;
            if (i2 != 2) {
                if (i2 == 3) {
                    return 3;
                }
                String valueOf = String.valueOf(Integer.toString(aoxy.a(i)));
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
                sb.append("unknown point format: ");
                sb.append(valueOf);
                throw new GeneralSecurityException(sb.toString());
            }
        }
        return i3;
    }

    public static void a(aoyg aoyg) {
        aoyj aoyj = aoyg.a;
        if (aoyj == null) {
            aoyj = aoyj.d;
        }
        int b = aoyn.b(aoyj.a);
        int i = 1;
        if (b == 0) {
            b = 1;
        }
        apcd.a(b(b));
        aoyj aoyj2 = aoyg.a;
        if (aoyj2 == null) {
            aoyj2 = aoyj.d;
        }
        int b2 = aoyp.b(aoyj2.b);
        if (b2 != 0) {
            i = b2;
        }
        a(i);
        int b3 = aoxy.b(aoyg.c);
        if (b3 != 0 && b3 == 2) {
            throw new GeneralSecurityException("unknown EC point format");
        }
        aoye aoye = aoyg.b;
        if (aoye == null) {
            aoye = aoye.b;
        }
        aoyw aoyw = aoye.a;
        if (aoyw == null) {
            aoyw = aoyw.d;
        }
        aovb.a(aoyw);
    }
}
