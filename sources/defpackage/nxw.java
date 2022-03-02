package defpackage;

/* renamed from: nxw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum nxw implements auco {
    DOZE_QUEUE_EVENT_UNKNOWN(0),
    WRITTEN_TO_DOZE_QUEUE(1),
    SENT_ON_LEAVING_DOZE(2),
    SENT_ON_GMSCORE_RESTART(3);
    
    public final int e;

    private nxw(int i) {
        this.e = i;
    }

    public static nxw a(int i) {
        if (i == 0) {
            return DOZE_QUEUE_EVENT_UNKNOWN;
        }
        if (i == 1) {
            return WRITTEN_TO_DOZE_QUEUE;
        }
        if (i == 2) {
            return SENT_ON_LEAVING_DOZE;
        }
        if (i != 3) {
            return null;
        }
        return SENT_ON_GMSCORE_RESTART;
    }

    public static aucq b() {
        return nxv.a;
    }

    public final int a() {
        return this.e;
    }

    public final String toString() {
        return Integer.toString(this.e);
    }
}
