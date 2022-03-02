package defpackage;

/* renamed from: attg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum attg implements auco {
    UNKNOWN_METER_TYPE(0),
    METERED(1),
    UNMETERED(2);
    
    public final int d;

    private attg(int i) {
        this.d = i;
    }

    public static attg a(int i) {
        if (i == 0) {
            return UNKNOWN_METER_TYPE;
        }
        if (i == 1) {
            return METERED;
        }
        if (i != 2) {
            return null;
        }
        return UNMETERED;
    }

    public static aucq b() {
        return attf.a;
    }

    public final int a() {
        return this.d;
    }

    public final String toString() {
        return Integer.toString(this.d);
    }
}
