package defpackage;

/* renamed from: arfu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum arfu implements auco {
    UNKNOWN_UI_CONTEXT(0),
    DRIVING_MODE(1),
    DRIVING_MODE_FRX_INTRO(2),
    DRIVING_MODE_FRX_SUCCESS(3),
    DRIVING_MODE_FRX_CHOOSE_BEHAVIOR(4),
    DRIVING_MODE_FRX_DND_ACCESS_REQUEST(5),
    DRIVING_MODE_FRX_DOWNLOAD(6),
    DRIVING_MODE_FRX_ERROR(7),
    DRIVING_MODE_FRX_AUTOLAUNCH_TRIGGER(8),
    DRIVING_MODE_FRX_GEARHEAD_SETUP(9);
    
    public final int k;

    private arfu(int i) {
        this.k = i;
    }

    public static arfu a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_UI_CONTEXT;
            case 1:
                return DRIVING_MODE;
            case 2:
                return DRIVING_MODE_FRX_INTRO;
            case 3:
                return DRIVING_MODE_FRX_SUCCESS;
            case 4:
                return DRIVING_MODE_FRX_CHOOSE_BEHAVIOR;
            case 5:
                return DRIVING_MODE_FRX_DND_ACCESS_REQUEST;
            case 6:
                return DRIVING_MODE_FRX_DOWNLOAD;
            case 7:
                return DRIVING_MODE_FRX_ERROR;
            case 8:
                return DRIVING_MODE_FRX_AUTOLAUNCH_TRIGGER;
            case 9:
                return DRIVING_MODE_FRX_GEARHEAD_SETUP;
            default:
                return null;
        }
    }

    public static aucq b() {
        return arft.a;
    }

    public final int a() {
        return this.k;
    }

    public final String toString() {
        return Integer.toString(this.k);
    }
}
