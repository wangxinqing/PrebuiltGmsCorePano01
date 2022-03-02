package defpackage;

/* renamed from: nxt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum nxt implements auco {
    AA_BUCKETING_EVENT_UNKNOWN(0),
    REDUCED_MESSAGE_PRIORITY(1),
    APP_WAS_IN_HIGH_USAGE_BUCKET(2),
    APP_WAS_WITHIN_QUOTA(3),
    SENT_PRIORITY_REDUCED_MESSAGE_ON_NEW_MESSAGE_RECEIVED(4);
    
    public final int f;

    private nxt(int i) {
        this.f = i;
    }

    public static nxt a(int i) {
        if (i == 0) {
            return AA_BUCKETING_EVENT_UNKNOWN;
        }
        if (i == 1) {
            return REDUCED_MESSAGE_PRIORITY;
        }
        if (i == 2) {
            return APP_WAS_IN_HIGH_USAGE_BUCKET;
        }
        if (i == 3) {
            return APP_WAS_WITHIN_QUOTA;
        }
        if (i != 4) {
            return null;
        }
        return SENT_PRIORITY_REDUCED_MESSAGE_ON_NEW_MESSAGE_RECEIVED;
    }

    public static aucq b() {
        return nxs.a;
    }

    public final int a() {
        return this.f;
    }

    public final String toString() {
        return Integer.toString(this.f);
    }
}
