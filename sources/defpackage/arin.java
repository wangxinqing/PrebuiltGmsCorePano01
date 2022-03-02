package defpackage;

/* renamed from: arin  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum arin implements auco {
    UNKNOWN(0),
    SAMPLE_TIMEOUT(1),
    TRANSITION_TIMEOUT(2),
    FLUSH(3),
    BUFFER_FULL(4),
    AUDIO_FUSION_TRANSITION(5);
    
    private final int g;

    private arin(int i) {
        this.g = i;
    }

    public static arin a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return SAMPLE_TIMEOUT;
        }
        if (i == 2) {
            return TRANSITION_TIMEOUT;
        }
        if (i == 3) {
            return FLUSH;
        }
        if (i == 4) {
            return BUFFER_FULL;
        }
        if (i != 5) {
            return null;
        }
        return AUDIO_FUSION_TRANSITION;
    }

    public static aucq b() {
        return arim.a;
    }

    public final int a() {
        return this.g;
    }

    public final String toString() {
        return Integer.toString(this.g);
    }
}
