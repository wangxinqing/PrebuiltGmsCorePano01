package defpackage;

/* renamed from: ahmn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum ahmn {
    IN_VEHICLE,
    ON_BICYCLE,
    ON_FOOT,
    WALKING,
    RUNNING,
    STILL,
    UNKNOWN,
    TILTING,
    INCONSISTENT,
    OFF_BODY,
    SLEEP,
    IN_ROAD_VEHICLE,
    IN_RAIL_VEHICLE,
    IN_TWO_WHEELER_VEHICLE,
    IN_FOUR_WHEELER_VEHICLE,
    IN_CAR,
    IN_BUS;

    public static ahmn a(String str) {
        return (ahmn) Enum.valueOf(ahmn.class, str);
    }
}
