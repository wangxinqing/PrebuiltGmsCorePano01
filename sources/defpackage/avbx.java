package defpackage;

/* renamed from: avbx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum avbx implements auco {
    NEARBY_TYPE_UNKNOWN(0),
    NEARBY_PROXIMITY_BEACON(1),
    NEARBY_PHYSICAL_WEB(2),
    NEARBY_CHROMECAST(3),
    NEARBY_WEAR(4),
    NEARBY_DEVICE(6),
    NEARBY_POPULAR_HERE(7);
    
    public final int h;

    private avbx(int i2) {
        this.h = i2;
    }

    public static avbx a(int i2) {
        if (i2 == 0) {
            return NEARBY_TYPE_UNKNOWN;
        }
        if (i2 == 1) {
            return NEARBY_PROXIMITY_BEACON;
        }
        if (i2 == 2) {
            return NEARBY_PHYSICAL_WEB;
        }
        if (i2 == 3) {
            return NEARBY_CHROMECAST;
        }
        if (i2 == 4) {
            return NEARBY_WEAR;
        }
        if (i2 == 6) {
            return NEARBY_DEVICE;
        }
        if (i2 != 7) {
            return null;
        }
        return NEARBY_POPULAR_HERE;
    }

    public static aucq b() {
        return avbw.a;
    }

    public final int a() {
        return this.h;
    }

    public final String toString() {
        return Integer.toString(this.h);
    }
}
