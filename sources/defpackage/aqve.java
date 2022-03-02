package defpackage;

/* renamed from: aqve  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum aqve implements auco {
    CONSENT_TYPE_UNKNOWN(0),
    UDC(1),
    ASW(2),
    UNRECOGNIZED(-1);
    
    private final int e;

    private aqve(int i) {
        this.e = i;
    }

    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.e;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(a());
    }
}
