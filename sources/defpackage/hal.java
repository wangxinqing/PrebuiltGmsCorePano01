package defpackage;

/* renamed from: hal  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum hal implements auco {
    OTHER(1),
    PHONE(2),
    TABLET(3),
    TV(4),
    GLASS(5),
    CAR(6),
    WEARABLE(7),
    THINGS(8);
    
    public final int i;

    private hal(int i2) {
        this.i = i2;
    }

    public static hal a(int i2) {
        switch (i2) {
            case 1:
                return OTHER;
            case 2:
                return PHONE;
            case 3:
                return TABLET;
            case 4:
                return TV;
            case 5:
                return GLASS;
            case 6:
                return CAR;
            case 7:
                return WEARABLE;
            case 8:
                return THINGS;
            default:
                return null;
        }
    }

    public static aucq b() {
        return hak.a;
    }

    public final int a() {
        return this.i;
    }

    public final String toString() {
        return Integer.toString(this.i);
    }
}
