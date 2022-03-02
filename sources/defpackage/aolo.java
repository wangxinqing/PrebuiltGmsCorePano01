package defpackage;

/* renamed from: aolo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum aolo implements auco {
    QUERY(0),
    QUERY_UNIVERSAL(1),
    SUGGEST(2),
    UNRECOGNIZED(-1);
    
    private final int e;

    private aolo(int i) {
        this.e = i;
    }

    public static aolo a(int i) {
        if (i == 0) {
            return QUERY;
        }
        if (i == 1) {
            return QUERY_UNIVERSAL;
        }
        if (i != 2) {
            return null;
        }
        return SUGGEST;
    }

    public static aucq b() {
        return aoln.a;
    }

    public final String toString() {
        return Integer.toString(a());
    }

    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.e;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
