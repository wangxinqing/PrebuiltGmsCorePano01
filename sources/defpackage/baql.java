package defpackage;

/* renamed from: baql  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum baql implements auco {
    UNKNOWN(0),
    FOREGROUND_TO_BACKGROUND(1),
    BACKGROUND_TO_FOREGROUND(2),
    FOREGROUND_SERVICE_START(3),
    FOREGROUND_SERVICE_STOP(4),
    CUSTOM_MEASURE_START(5),
    CUSTOM_MEASURE_STOP(6);
    
    public final int h;

    private baql(int i2) {
        this.h = i2;
    }

    public static baql a(int i2) {
        switch (i2) {
            case 0:
                return UNKNOWN;
            case 1:
                return FOREGROUND_TO_BACKGROUND;
            case 2:
                return BACKGROUND_TO_FOREGROUND;
            case 3:
                return FOREGROUND_SERVICE_START;
            case 4:
                return FOREGROUND_SERVICE_STOP;
            case 5:
                return CUSTOM_MEASURE_START;
            case 6:
                return CUSTOM_MEASURE_STOP;
            default:
                return null;
        }
    }

    public static aucq b() {
        return baqk.a;
    }

    public final int a() {
        return this.h;
    }

    public final String toString() {
        return Integer.toString(this.h);
    }
}
