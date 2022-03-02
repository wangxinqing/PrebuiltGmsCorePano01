package defpackage;

/* renamed from: arzo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class arzo {
    public static /* synthetic */ String a(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "UPGRADE_FAILURE" : "CLIENT_INTRODUCTION" : "SAFE_TO_CLOSE_PRIOR_CHANNEL" : "LAST_WRITE_TO_PRIOR_CHANNEL" : "UPGRADE_PATH_AVAILABLE" : "UNKNOWN_EVENT_TYPE";
    }

    public static int b(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i == 3) {
            return 4;
        }
        if (i != 4) {
            return i != 5 ? 0 : 6;
        }
        return 5;
    }
}
