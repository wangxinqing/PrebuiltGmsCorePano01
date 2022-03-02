package defpackage;

/* renamed from: atsl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum atsl implements auco {
    UNKNOWN_DAY_PART(0),
    MORNING(1),
    AFTERNOON(2),
    EVENING(3),
    NIGHT(4);
    
    private final int f;

    private atsl(int i) {
        this.f = i;
    }

    public static atsl a(int i) {
        if (i == 0) {
            return UNKNOWN_DAY_PART;
        }
        if (i == 1) {
            return MORNING;
        }
        if (i == 2) {
            return AFTERNOON;
        }
        if (i == 3) {
            return EVENING;
        }
        if (i != 4) {
            return null;
        }
        return NIGHT;
    }

    public static aucq b() {
        return atsk.a;
    }

    public final int a() {
        return this.f;
    }

    public final String toString() {
        return Integer.toString(this.f);
    }
}
