package defpackage;

/* renamed from: aplx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aplx {
    public static boolean a(int i) {
        return i > 0 && i <= 3;
    }

    public static boolean b(int i) {
        return a(i) && i != 1;
    }

    public static String c(int i) {
        if (i == 1) {
            return "IN_APP";
        }
        if (i == 2) {
            return "ON_DEVICE";
        }
        if (i == 3) {
            return "CROSS_DEVICE";
        }
        StringBuilder sb = new StringBuilder(21);
        sb.append("UNKNOWN - ");
        sb.append(i);
        return sb.toString();
    }
}
