package defpackage;

/* renamed from: atnu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum atnu implements auco {
    UNKNOWN_QUERY_FENCE_OPERATION_TYPE(0),
    ALL(1),
    KEYS(2);
    
    public final int d;

    private atnu(int i) {
        this.d = i;
    }

    public static atnu a(int i) {
        if (i == 0) {
            return UNKNOWN_QUERY_FENCE_OPERATION_TYPE;
        }
        if (i == 1) {
            return ALL;
        }
        if (i != 2) {
            return null;
        }
        return KEYS;
    }

    public static aucq b() {
        return atnt.a;
    }

    public final int a() {
        return this.d;
    }

    public final String toString() {
        return Integer.toString(this.d);
    }
}
