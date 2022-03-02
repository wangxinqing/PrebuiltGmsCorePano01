package defpackage;

/* renamed from: avbj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class avbj {
    public static /* synthetic */ String a(int i) {
        return i != 1 ? i != 101 ? i != 201 ? i != 301 ? i != 401 ? i != 501 ? i != 601 ? i != 701 ? "null" : "EVALUATION_AMAZING" : "EVALUATION_GREAT" : "EVALUATION_GOOD" : "EVALUATION_OK" : "EVALUATION_NEUTRAL" : "EVALUATION_POOR" : "EVALUATION_BAD" : "EVALUATION_UNKNOWN";
    }

    public static int b(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 100) {
            return 101;
        }
        if (i == 200) {
            return 201;
        }
        if (i == 300) {
            return 301;
        }
        if (i == 400) {
            return 401;
        }
        if (i == 500) {
            return 501;
        }
        if (i != 600) {
            return i != 700 ? 0 : 701;
        }
        return 601;
    }
}
