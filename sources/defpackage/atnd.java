package defpackage;

/* renamed from: atnd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum atnd implements auco {
    UNKNOWN_ACCESS_TYPE(0),
    READ_ONLY(1),
    WRITE_ONLY(2),
    READ_WRITE(3),
    LISTEN_ONLY(4),
    INJECT_ONLY(5),
    LISTEN_WRITE(6),
    LISTEN_INJECT(7),
    READ_INJECT(8);
    
    public final int j;

    private atnd(int i) {
        this.j = i;
    }

    public static atnd a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_ACCESS_TYPE;
            case 1:
                return READ_ONLY;
            case 2:
                return WRITE_ONLY;
            case 3:
                return READ_WRITE;
            case 4:
                return LISTEN_ONLY;
            case 5:
                return INJECT_ONLY;
            case 6:
                return LISTEN_WRITE;
            case 7:
                return LISTEN_INJECT;
            case 8:
                return READ_INJECT;
            default:
                return null;
        }
    }

    public static aucq b() {
        return atnc.a;
    }

    public final int a() {
        return this.j;
    }

    public final String toString() {
        return Integer.toString(this.j);
    }
}
