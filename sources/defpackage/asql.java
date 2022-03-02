package defpackage;

/* renamed from: asql  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum asql implements auco {
    FAST_PAIR_FEATURE_UNKNOWN(0),
    SILENCE_MODE(1),
    WIRELESS_CHARGING(2),
    UNRECOGNIZED(-1);
    
    private final int e;

    private asql(int i) {
        this.e = i;
    }

    public static asql a(int i) {
        if (i == 0) {
            return FAST_PAIR_FEATURE_UNKNOWN;
        }
        if (i == 1) {
            return SILENCE_MODE;
        }
        if (i != 2) {
            return null;
        }
        return WIRELESS_CHARGING;
    }

    public static aucq b() {
        return asqk.a;
    }

    public final String toString() {
        return Integer.toString(a());
    }

    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.e;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
