package defpackage;

/* renamed from: aqvw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum aqvw implements auco {
    UNKNOWN_GROUP_EXTENSION(0),
    GDATA_COMPATIBILITY(1),
    IMPORT_DATA(2),
    PREFERRED_EMAIL(3),
    UNRECOGNIZED(-1);
    
    private final int f;

    private aqvw(int i) {
        this.f = i;
    }

    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.f;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(a());
    }
}
