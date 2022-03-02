package defpackage;

/* renamed from: basq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum basq implements auco {
    UNKNOWN(0),
    PRIMES_INITIALIZED(1),
    PRIMES_CRASH_MONITORING_INITIALIZED(2),
    PRIMES_FIRST_ACTIVITY_LAUNCHED(3),
    PRIMES_CUSTOM_LAUNCHED(4);
    
    public final int f;

    private basq(int i) {
        this.f = i;
    }

    public static basq a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return PRIMES_INITIALIZED;
        }
        if (i == 2) {
            return PRIMES_CRASH_MONITORING_INITIALIZED;
        }
        if (i == 3) {
            return PRIMES_FIRST_ACTIVITY_LAUNCHED;
        }
        if (i != 4) {
            return null;
        }
        return PRIMES_CUSTOM_LAUNCHED;
    }

    public static aucq b() {
        return basp.a;
    }

    public final int a() {
        return this.f;
    }

    public final String toString() {
        return Integer.toString(this.f);
    }
}
