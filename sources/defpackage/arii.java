package defpackage;

/* renamed from: arii  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum arii implements auco {
    DISABLE(0),
    ENABLE(1),
    QUERY(2),
    FLUSH(3),
    CONFIG(4),
    CONTEXT_SIGNAL(5);
    
    public final int g;

    private arii(int i) {
        this.g = i;
    }

    public static arii a(int i) {
        if (i == 0) {
            return DISABLE;
        }
        if (i == 1) {
            return ENABLE;
        }
        if (i == 2) {
            return QUERY;
        }
        if (i == 3) {
            return FLUSH;
        }
        if (i == 4) {
            return CONFIG;
        }
        if (i != 5) {
            return null;
        }
        return CONTEXT_SIGNAL;
    }

    public static aucq b() {
        return arih.a;
    }

    public final int a() {
        return this.g;
    }

    public final String toString() {
        return Integer.toString(this.g);
    }
}
