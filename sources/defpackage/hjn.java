package defpackage;

import com.google.android.gms.auth.UserRecoverableAuthException;

/* renamed from: hjn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hjn {
    public static int a(int i) {
        if (i == 7) {
            return 513;
        }
        switch (i) {
            case 38500:
                return 1538;
            case 38501:
                return 257;
            default:
                return 1025;
        }
    }

    public static int b(int i) {
        if (i == 257) {
            return 101;
        }
        if (i == 258) {
            return 102;
        }
        if (i == 513) {
            return 105;
        }
        if (i == 769) {
            return 104;
        }
        if (i == 1025) {
            return 108;
        }
        if (i != 1281) {
            return i != 1282 ? 1 : 106;
        }
        return 107;
    }

    public static int a(eif eif) {
        return (!(eif instanceof UserRecoverableAuthException) || !gei.BAD_AUTHENTICATION.ac.equals(eif.getMessage())) ? 1281 : 1282;
    }

    public static int a(hiu hiu) {
        return !(hiu instanceof hix) ? 1025 : 769;
    }
}
