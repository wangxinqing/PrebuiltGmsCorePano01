package defpackage;

/* renamed from: xjo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum xjo implements auco {
    UNSPECIFIED(0),
    CONTACT(1),
    GROUP(2),
    PHOTO(3),
    CONTACT_FIELD(4),
    PHOTO_HIGH_RES(5),
    PHOTO_LOW_RES(6);
    
    public final int h;

    private xjo(int i2) {
        this.h = i2;
    }

    public static xjo a(int i2) {
        switch (i2) {
            case 0:
                return UNSPECIFIED;
            case 1:
                return CONTACT;
            case 2:
                return GROUP;
            case 3:
                return PHOTO;
            case 4:
                return CONTACT_FIELD;
            case 5:
                return PHOTO_HIGH_RES;
            case 6:
                return PHOTO_LOW_RES;
            default:
                return null;
        }
    }

    public static aucq b() {
        return xjn.a;
    }

    public final int a() {
        return this.h;
    }

    public final String toString() {
        return Integer.toString(this.h);
    }
}
