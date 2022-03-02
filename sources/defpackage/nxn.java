package defpackage;

import org.chromium.net.UrlRequest;

/* renamed from: nxn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum nxn implements auco {
    CAUSE_UNKNOWN(0),
    GOOGLE_HTTP_CLIENT(1),
    CLOUD_MESSAGE_SENT(2),
    CLOUD_MESSAGE_RECEIVED(3),
    ALARM_MANAGER(4),
    EXECUTION_CALLBACK(5),
    DEVICE_CHARGING(6),
    CLIENT_LIB(7),
    NETWORK_CONNECTED(8),
    CONTENT_URI_UPDATED(9),
    DOZE_MAINTENANCE_WINDOW(10),
    DOZE_LIGHT_MAINTENANCE_WINDOW(11),
    REACHABILITY_CHANGED(12),
    INVOKE_ALL(13),
    DEVICE_IDLE(14);
    
    public final int p;

    private nxn(int i) {
        this.p = i;
    }

    public static nxn a(int i) {
        switch (i) {
            case 0:
                return CAUSE_UNKNOWN;
            case 1:
                return GOOGLE_HTTP_CLIENT;
            case 2:
                return CLOUD_MESSAGE_SENT;
            case 3:
                return CLOUD_MESSAGE_RECEIVED;
            case 4:
                return ALARM_MANAGER;
            case 5:
                return EXECUTION_CALLBACK;
            case 6:
                return DEVICE_CHARGING;
            case 7:
                return CLIENT_LIB;
            case 8:
                return NETWORK_CONNECTED;
            case 9:
                return CONTENT_URI_UPDATED;
            case 10:
                return DOZE_MAINTENANCE_WINDOW;
            case 11:
                return DOZE_LIGHT_MAINTENANCE_WINDOW;
            case 12:
                return REACHABILITY_CHANGED;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /*13*/:
                return INVOKE_ALL;
            case UrlRequest.Status.READING_RESPONSE /*14*/:
                return DEVICE_IDLE;
            default:
                return null;
        }
    }

    public static aucq b() {
        return nxm.a;
    }

    public final int a() {
        return this.p;
    }

    public final String toString() {
        return Integer.toString(this.p);
    }
}
