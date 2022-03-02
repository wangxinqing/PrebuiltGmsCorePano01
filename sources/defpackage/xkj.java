package defpackage;

/* renamed from: xkj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum xkj implements auco {
    UNSPECIFIED(0),
    BEFORE_SYNC(1),
    AFTER_SYNC(2),
    BEFORE_PREPARE_TO_SYNC(3),
    BETWEEN_SYNC_DOWN_AND_SYNC_UP(4);
    
    public final int f;

    private xkj(int i) {
        this.f = i;
    }

    public static xkj a(int i) {
        if (i == 0) {
            return UNSPECIFIED;
        }
        if (i == 1) {
            return BEFORE_SYNC;
        }
        if (i == 2) {
            return AFTER_SYNC;
        }
        if (i == 3) {
            return BEFORE_PREPARE_TO_SYNC;
        }
        if (i != 4) {
            return null;
        }
        return BETWEEN_SYNC_DOWN_AND_SYNC_UP;
    }

    public static aucq b() {
        return xki.a;
    }

    public final int a() {
        return this.f;
    }

    public final String toString() {
        return Integer.toString(this.f);
    }
}
