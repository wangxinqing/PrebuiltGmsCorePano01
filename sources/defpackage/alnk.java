package defpackage;

/* renamed from: alnk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum alnk implements auco {
    USER_ATTRIBUTE_NAME_UNSPECIFIED(0),
    EMAIL(1),
    DISPLAY_NAME(2),
    PROVIDER(3),
    PHOTO_URL(4),
    PASSWORD(5),
    RAW_USER_INFO(6);
    
    public final int h;

    private alnk(int i2) {
        this.h = i2;
    }

    public static alnk a(int i2) {
        switch (i2) {
            case 0:
                return USER_ATTRIBUTE_NAME_UNSPECIFIED;
            case 1:
                return EMAIL;
            case 2:
                return DISPLAY_NAME;
            case 3:
                return PROVIDER;
            case 4:
                return PHOTO_URL;
            case 5:
                return PASSWORD;
            case 6:
                return RAW_USER_INFO;
            default:
                return null;
        }
    }

    public static aucq b() {
        return alnj.a;
    }

    public final int a() {
        return this.h;
    }

    public final String toString() {
        return Integer.toString(this.h);
    }
}
