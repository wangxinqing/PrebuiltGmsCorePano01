package defpackage;

/* renamed from: wvo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum wvo implements auco {
    UNKNOWN_OPERATION(0),
    INSERT(1),
    UPDATE(2),
    REMOVE(3),
    BULK_INSERT(4);
    
    private final int f;

    private wvo(int i) {
        this.f = i;
    }

    public static wvo a(int i) {
        if (i == 0) {
            return UNKNOWN_OPERATION;
        }
        if (i == 1) {
            return INSERT;
        }
        if (i == 2) {
            return UPDATE;
        }
        if (i == 3) {
            return REMOVE;
        }
        if (i != 4) {
            return null;
        }
        return BULK_INSERT;
    }

    public static aucq b() {
        return wvn.a;
    }

    public final int a() {
        return this.f;
    }

    public final String toString() {
        return Integer.toString(this.f);
    }
}
