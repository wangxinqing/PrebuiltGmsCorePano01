package defpackage;

/* renamed from: aolm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum aolm implements auco {
    NONE(0),
    APPS(1),
    CONTACTS(2),
    PHONES(3),
    EMAILS(4),
    POSTALS(5),
    SMS(6),
    UNRECOGNIZED(-1);
    
    private final int i;

    private aolm(int i2) {
        this.i = i2;
    }

    public static aolm a(int i2) {
        switch (i2) {
            case 0:
                return NONE;
            case 1:
                return APPS;
            case 2:
                return CONTACTS;
            case 3:
                return PHONES;
            case 4:
                return EMAILS;
            case 5:
                return POSTALS;
            case 6:
                return SMS;
            default:
                return null;
        }
    }

    public static aucq b() {
        return aoll.a;
    }

    public final String toString() {
        return Integer.toString(a());
    }

    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.i;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
