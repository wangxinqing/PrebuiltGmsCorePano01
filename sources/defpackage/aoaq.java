package defpackage;

/* renamed from: aoaq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum aoaq implements auco {
    INVALID_STATE(0),
    NOT_INITIALIZED(1),
    NO_GEOFENCE(2),
    DISABLED(3),
    HAS_GEOFENCE(4),
    UNAVAILABLE_ACTIVITY(5),
    UNKNOWN_ACTIVITY(6),
    STILL_ACTIVITY(7),
    WALKING_ACTIVITY(8),
    FAST_MOVING_ACTIVITY(9),
    BACKGROUND_USER(10),
    CHRE_GEOFENCING(11);
    
    public final int m;

    private aoaq(int i) {
        this.m = i;
    }

    public static aoaq a(int i) {
        switch (i) {
            case 0:
                return INVALID_STATE;
            case 1:
                return NOT_INITIALIZED;
            case 2:
                return NO_GEOFENCE;
            case 3:
                return DISABLED;
            case 4:
                return HAS_GEOFENCE;
            case 5:
                return UNAVAILABLE_ACTIVITY;
            case 6:
                return UNKNOWN_ACTIVITY;
            case 7:
                return STILL_ACTIVITY;
            case 8:
                return WALKING_ACTIVITY;
            case 9:
                return FAST_MOVING_ACTIVITY;
            case 10:
                return BACKGROUND_USER;
            case 11:
                return CHRE_GEOFENCING;
            default:
                return null;
        }
    }

    public static aucq b() {
        return aoap.a;
    }

    public final int a() {
        return this.m;
    }

    public final String toString() {
        return Integer.toString(this.m);
    }
}
