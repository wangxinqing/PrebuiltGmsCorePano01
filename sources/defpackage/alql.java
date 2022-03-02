package defpackage;

/* renamed from: alql  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class alql {
    public static /* synthetic */ String a(int i) {
        switch (i) {
            case 1:
                return "NEW";
            case 2:
                return "WAIT_FOR_HEADERS";
            case 3:
                return "WAIT_FOR_STAGE_1";
            case 4:
                return "WAIT_FOR_STAGE_2";
            case 5:
                return "WAIT_FOR_CLOSE";
            case 6:
                return "COMPLETED";
            default:
                return "null";
        }
    }

    public static int b(int i) {
        return i - 1;
    }
}
