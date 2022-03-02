package defpackage;

/* renamed from: avna  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum avna implements auco {
    UNKNOWN_PROMOTION_PLACEMENT(0),
    PROMOTION_PLACEMENT_TOP(1),
    PROMOTION_PLACEMENT_BOTTOM(2);
    
    public final int d;

    private avna(int i) {
        this.d = i;
    }

    public static avna a(int i) {
        if (i == 0) {
            return UNKNOWN_PROMOTION_PLACEMENT;
        }
        if (i == 1) {
            return PROMOTION_PLACEMENT_TOP;
        }
        if (i != 2) {
            return null;
        }
        return PROMOTION_PLACEMENT_BOTTOM;
    }

    public static aucq b() {
        return avmz.a;
    }

    public final int a() {
        return this.d;
    }

    public final String toString() {
        return Integer.toString(this.d);
    }
}
