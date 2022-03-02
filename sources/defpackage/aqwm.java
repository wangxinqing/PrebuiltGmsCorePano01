package defpackage;

/* renamed from: aqwm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum aqwm implements auco {
    UNKNOWN_PROFILE_STATE(0),
    ADMIN_BLOCKED(1),
    DELETED(2),
    CORE_ID(3),
    DASHER_ADMIN_DISABLED(4),
    USER_TO_USER_BLOCKED(5),
    UNRECOGNIZED(-1);
    
    private final int h;

    private aqwm(int i2) {
        this.h = i2;
    }

    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.h;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(a());
    }
}
