package defpackage;

/* renamed from: atzo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum atzo implements auco {
    UNKNOWN_ID(0),
    DEVICE_INFO(7),
    DEVICE_INFO_DEVICE_LEVEL(9),
    LOCATION_HISTORY(2),
    LOCATION_REPORTING(15),
    VOICE_AND_AUDIO(5),
    WEB_AND_APP(1),
    SUPPL_WEB_AND_APP(8),
    SUPPL_WEB_AND_APP_DEVICE_LEVEL(10),
    YT_SEARCH_HISTORY(3),
    YT_WATCH_HISTORY(4);
    
    public final int l;

    private atzo(int i) {
        this.l = i;
    }

    public static atzo a(int i) {
        if (i == 0) {
            return UNKNOWN_ID;
        }
        if (i == 1) {
            return WEB_AND_APP;
        }
        if (i == 2) {
            return LOCATION_HISTORY;
        }
        if (i == 3) {
            return YT_SEARCH_HISTORY;
        }
        if (i == 4) {
            return YT_WATCH_HISTORY;
        }
        if (i == 5) {
            return VOICE_AND_AUDIO;
        }
        if (i == 15) {
            return LOCATION_REPORTING;
        }
        switch (i) {
            case 7:
                return DEVICE_INFO;
            case 8:
                return SUPPL_WEB_AND_APP;
            case 9:
                return DEVICE_INFO_DEVICE_LEVEL;
            case 10:
                return SUPPL_WEB_AND_APP_DEVICE_LEVEL;
            default:
                return null;
        }
    }

    public final int a() {
        return this.l;
    }

    public final String toString() {
        return Integer.toString(this.l);
    }
}
