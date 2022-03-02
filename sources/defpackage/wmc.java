package defpackage;

/* renamed from: wmc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum wmc implements auco {
    UNKNOWN(0),
    NONE(1),
    EXACT(2),
    SUBSTRING(3),
    HEURISTIC(4);
    
    public final int f;

    private wmc(int i) {
        this.f = i;
    }

    public static wmc a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return NONE;
        }
        if (i == 2) {
            return EXACT;
        }
        if (i == 3) {
            return SUBSTRING;
        }
        if (i != 4) {
            return null;
        }
        return HEURISTIC;
    }

    public final int a() {
        return this.f;
    }

    public final String toString() {
        return Integer.toString(this.f);
    }
}
