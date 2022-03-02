package defpackage;

/* renamed from: jxz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum jxz implements auco {
    NOT_SYNCED_MISSING_GCM_ID(1),
    NOT_SYNCED_BUT_READY_TO_SYNC(2),
    SYNCED(3);
    
    public final int d;

    private jxz(int i) {
        this.d = i;
    }

    public static jxz a(int i) {
        if (i == 1) {
            return NOT_SYNCED_MISSING_GCM_ID;
        }
        if (i == 2) {
            return NOT_SYNCED_BUT_READY_TO_SYNC;
        }
        if (i != 3) {
            return null;
        }
        return SYNCED;
    }

    public static aucq b() {
        return jxy.a;
    }

    public final int a() {
        return this.d;
    }

    public final String toString() {
        return Integer.toString(this.d);
    }
}
