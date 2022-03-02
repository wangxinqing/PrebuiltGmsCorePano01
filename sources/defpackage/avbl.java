package defpackage;

/* renamed from: avbl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum avbl implements auco {
    FAST_PAIR_FEATURE_UNKNOWN(0),
    SILENCE_MODE(1),
    WIRELESS_CHARGING(2);
    
    public final int d;

    private avbl(int i) {
        this.d = i;
    }

    public static avbl a(int i) {
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
        return avbk.a;
    }

    public final int a() {
        return this.d;
    }

    public final String toString() {
        return Integer.toString(this.d);
    }
}
