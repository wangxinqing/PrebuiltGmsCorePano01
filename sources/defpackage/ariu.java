package defpackage;

/* renamed from: ariu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum ariu implements auco {
    INVALID_ACTIVITY(0),
    IN_VEHICLE(1),
    ON_BICYCLE(2),
    WALKING(3),
    RUNNING(4),
    STILL(5),
    INCONSISTENT(6),
    TILTING(7),
    IN_ROAD_VEHICLE(8),
    IN_RAIL_VEHICLE(9);
    
    public final int k;

    private ariu(int i) {
        this.k = i;
    }

    public static ariu a(int i) {
        switch (i) {
            case 0:
                return INVALID_ACTIVITY;
            case 1:
                return IN_VEHICLE;
            case 2:
                return ON_BICYCLE;
            case 3:
                return WALKING;
            case 4:
                return RUNNING;
            case 5:
                return STILL;
            case 6:
                return INCONSISTENT;
            case 7:
                return TILTING;
            case 8:
                return IN_ROAD_VEHICLE;
            case 9:
                return IN_RAIL_VEHICLE;
            default:
                return null;
        }
    }

    public static aucq b() {
        return arit.a;
    }

    public final int a() {
        return this.k;
    }

    public final String toString() {
        return Integer.toString(this.k);
    }
}
