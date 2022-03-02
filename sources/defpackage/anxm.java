package defpackage;

/* renamed from: anxm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum anxm implements auco {
    DEFAULT(0),
    COLOR_SHAPES(1),
    COLOR_SHAPES_AND_PIN(2),
    HEX_PIN(3),
    GOOGLE_HEX(4),
    OUT_OF_BAND(5);
    
    public final int g;

    private anxm(int i) {
        this.g = i;
    }

    public static anxm a(int i) {
        if (i == 0) {
            return DEFAULT;
        }
        if (i == 1) {
            return COLOR_SHAPES;
        }
        if (i == 2) {
            return COLOR_SHAPES_AND_PIN;
        }
        if (i == 3) {
            return HEX_PIN;
        }
        if (i == 4) {
            return GOOGLE_HEX;
        }
        if (i != 5) {
            return null;
        }
        return OUT_OF_BAND;
    }

    public static aucq b() {
        return anxl.a;
    }

    public final int a() {
        return this.g;
    }

    public final String toString() {
        return Integer.toString(this.g);
    }
}
