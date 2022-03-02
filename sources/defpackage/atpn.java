package defpackage;

/* renamed from: atpn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum atpn implements auco {
    UNKNOWN(0),
    NULL_PLACE_INFERENCE(1),
    PLACES_DID_CHANGE(2),
    NO_PLACE_RESULT_WITHIN_TIMEOUT_PERIOD(3),
    SCREEN_IS_OFF(4),
    EMPTY_PLACE_INFERENCE_WITHIN_TIMEOUT_PERIOD(5),
    SAME_PLACE_ON_CONSECUTIVE_SCREEN_ONS(6);
    
    public final int h;

    private atpn(int i2) {
        this.h = i2;
    }

    public static atpn a(int i2) {
        switch (i2) {
            case 0:
                return UNKNOWN;
            case 1:
                return NULL_PLACE_INFERENCE;
            case 2:
                return PLACES_DID_CHANGE;
            case 3:
                return NO_PLACE_RESULT_WITHIN_TIMEOUT_PERIOD;
            case 4:
                return SCREEN_IS_OFF;
            case 5:
                return EMPTY_PLACE_INFERENCE_WITHIN_TIMEOUT_PERIOD;
            case 6:
                return SAME_PLACE_ON_CONSECUTIVE_SCREEN_ONS;
            default:
                return null;
        }
    }

    public static aucq b() {
        return atpm.a;
    }

    public final int a() {
        return this.h;
    }

    public final String toString() {
        return Integer.toString(this.h);
    }
}
