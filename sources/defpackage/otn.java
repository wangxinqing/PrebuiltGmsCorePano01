package defpackage;

/* renamed from: otn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum otn implements auco {
    UNSET(0),
    DISABLED(1),
    ENABLED(2);
    
    public final int d;

    private otn(int i) {
        this.d = i;
    }

    public static otn a(int i) {
        if (i == 0) {
            return UNSET;
        }
        if (i == 1) {
            return DISABLED;
        }
        if (i != 2) {
            return null;
        }
        return ENABLED;
    }

    public static aucq b() {
        return otm.a;
    }

    public final int a() {
        return this.d;
    }

    public final String toString() {
        return Integer.toString(this.d);
    }
}
