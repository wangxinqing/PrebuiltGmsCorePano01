package defpackage;

/* renamed from: atof  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum atof implements auco {
    UNKNOWN_UPDATE_INTEREST_OPERATION_TYPE(0),
    ADD(1),
    REMOVE(2);
    
    public final int d;

    private atof(int i) {
        this.d = i;
    }

    public static atof a(int i) {
        if (i == 0) {
            return UNKNOWN_UPDATE_INTEREST_OPERATION_TYPE;
        }
        if (i == 1) {
            return ADD;
        }
        if (i != 2) {
            return null;
        }
        return REMOVE;
    }

    public static aucq b() {
        return atoe.a;
    }

    public final int a() {
        return this.d;
    }

    public final String toString() {
        return Integer.toString(this.d);
    }
}
