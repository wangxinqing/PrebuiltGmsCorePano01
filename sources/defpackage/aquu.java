package defpackage;

/* renamed from: aquu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum aquu implements auco {
    PROFILE_JOIN_UNSPECIFIED(0),
    PHONE_JOIN(1),
    UNRECOGNIZED(-1);
    
    private final int d;

    private aquu(int i) {
        this.d = i;
    }

    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.d;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(a());
    }
}
