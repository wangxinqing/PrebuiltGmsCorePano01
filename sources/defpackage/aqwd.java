package defpackage;

/* renamed from: aqwd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum aqwd implements auco {
    UNKNOWN_LIST_OPTION(0),
    INCLUDE_DELETED(1),
    INCLUDE_MEMBERSHIP_COUNT(2),
    GDATA_COMPATIBILITY_MODE(3),
    INCLUDE_SYNTHETIC_GROUPS(4),
    UNRECOGNIZED(-1);
    
    private final int g;

    private aqwd(int i) {
        this.g = i;
    }

    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.g;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(a());
    }
}
