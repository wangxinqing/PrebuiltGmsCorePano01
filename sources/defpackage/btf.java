package defpackage;

/* renamed from: btf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class btf {
    public static boolean a(int i, atnd atnd) {
        if (i != 0) {
            if (i == 1) {
                atnd atnd2 = atnd.UNKNOWN_ACCESS_TYPE;
                int ordinal = atnd.ordinal();
                if (ordinal == 5 || ordinal == 7 || ordinal == 8) {
                    return true;
                }
                return b(atnd);
            } else if (i == 2) {
                return b(atnd);
            } else {
                if (i == 3) {
                    return a(atnd);
                }
                if (i != 4) {
                    ((anih) ((anih) bxk.a.b()).a("btf", "a", 38, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[AclPredicates] Unknown permission type: %s", i);
                    return false;
                }
            }
        }
        atnd atnd3 = atnd.UNKNOWN_ACCESS_TYPE;
        int ordinal2 = atnd.ordinal();
        if (ordinal2 == 4 || ordinal2 == 6 || ordinal2 == 7) {
            return true;
        }
        return a(atnd);
    }

    private static boolean b(atnd atnd) {
        atnd atnd2 = atnd.UNKNOWN_ACCESS_TYPE;
        int ordinal = atnd.ordinal();
        return ordinal == 2 || ordinal == 3 || ordinal == 6;
    }

    private static boolean a(atnd atnd) {
        atnd atnd2 = atnd.UNKNOWN_ACCESS_TYPE;
        int ordinal = atnd.ordinal();
        return ordinal == 1 || ordinal == 3 || ordinal == 8;
    }
}
