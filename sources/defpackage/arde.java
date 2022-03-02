package defpackage;

/* renamed from: arde  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum arde implements auco {
    SENSOR_TYPE_UNSPECIFIED(0),
    SENSOR_TYPE_ACCELEROMETER_MPS2(1),
    SENSOR_TYPE_GYROSCOPE_RPS(2),
    SENSOR_TYPE_MAGNETOMETER_UT(3),
    SENSOR_TYPE_IMU_TEMPERATURE_C(4),
    SENSOR_TYPE_BAROMETER_HPA(5),
    SENSOR_TYPE_WIFI_M(6),
    SENSOR_TYPE_VELOCITY_MPS(7),
    SENSOR_TYPE_POSITION_M(8),
    UNRECOGNIZED(-1);
    
    private final int k;

    private arde(int i) {
        this.k = i;
    }

    public static arde a(int i) {
        switch (i) {
            case 0:
                return SENSOR_TYPE_UNSPECIFIED;
            case 1:
                return SENSOR_TYPE_ACCELEROMETER_MPS2;
            case 2:
                return SENSOR_TYPE_GYROSCOPE_RPS;
            case 3:
                return SENSOR_TYPE_MAGNETOMETER_UT;
            case 4:
                return SENSOR_TYPE_IMU_TEMPERATURE_C;
            case 5:
                return SENSOR_TYPE_BAROMETER_HPA;
            case 6:
                return SENSOR_TYPE_WIFI_M;
            case 7:
                return SENSOR_TYPE_VELOCITY_MPS;
            case 8:
                return SENSOR_TYPE_POSITION_M;
            default:
                return null;
        }
    }

    public final String toString() {
        return Integer.toString(a());
    }

    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.k;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
