package defpackage;

/* renamed from: avbe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum avbe implements auco {
    DISCOVERY_ATTACHMENT_TYPE_UNKNOWN(0),
    DISCOVERY_ATTACHMENT_TYPE_NORMAL(1),
    DISCOVERY_ATTACHMENT_TYPE_DEBUG(2);
    
    public final int d;

    private avbe(int i) {
        this.d = i;
    }

    public static avbe a(int i) {
        if (i == 0) {
            return DISCOVERY_ATTACHMENT_TYPE_UNKNOWN;
        }
        if (i == 1) {
            return DISCOVERY_ATTACHMENT_TYPE_NORMAL;
        }
        if (i != 2) {
            return null;
        }
        return DISCOVERY_ATTACHMENT_TYPE_DEBUG;
    }

    public static aucq b() {
        return avbd.a;
    }

    public final int a() {
        return this.d;
    }

    public final String toString() {
        return Integer.toString(this.d);
    }
}
