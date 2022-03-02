package defpackage;

/* renamed from: kiq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kiq {
    private static final ith a = new ith("DownloadListenerUtils", "");

    public static boolean a(int i) {
        switch (i) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return true;
            default:
                return false;
        }
    }

    public static boolean b(int i) {
        return i == 2 || i == 3;
    }

    public static boolean c(int i) {
        return i == 3 || i == 6;
    }

    public static int d(int i) {
        switch (i) {
            case 4:
            case 5:
                return 8;
            case 6:
            case 8:
                return 7;
            case 7:
                return 1502;
            default:
                a.b("DownloadListenerUtils", "Not a valid state here: %s", Integer.valueOf(i));
                return 13;
        }
    }
}
