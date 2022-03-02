package defpackage;

/* renamed from: avug  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum avug implements auco {
    NOOP(0),
    WIPE(1),
    LOCATE(2),
    RING(3),
    REMIND(4),
    LOCK(5),
    SITREP(6),
    AUTO_ENABLE_DEVICE_ADMIN(7),
    AUTO_DISABLE_DEVICE_ADMIN(8),
    ASSURE(9),
    STOP_RINGING(10),
    UNPAIR(11);
    
    public final int m;

    private avug(int i) {
        this.m = i;
    }

    public static avug a(int i) {
        switch (i) {
            case 0:
                return NOOP;
            case 1:
                return WIPE;
            case 2:
                return LOCATE;
            case 3:
                return RING;
            case 4:
                return REMIND;
            case 5:
                return LOCK;
            case 6:
                return SITREP;
            case 7:
                return AUTO_ENABLE_DEVICE_ADMIN;
            case 8:
                return AUTO_DISABLE_DEVICE_ADMIN;
            case 9:
                return ASSURE;
            case 10:
                return STOP_RINGING;
            case 11:
                return UNPAIR;
            default:
                return null;
        }
    }

    public static aucq b() {
        return avuf.a;
    }

    public final int a() {
        return this.m;
    }

    public final String toString() {
        return Integer.toString(this.m);
    }
}
