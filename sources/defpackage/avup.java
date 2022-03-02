package defpackage;

import org.chromium.net.UrlRequest;

/* renamed from: avup  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum avup implements auco {
    UNKNOWN(0),
    ACCOUNTS_CHANGED(1),
    CONNECTIVITY_CHANGED(2),
    DEVICE_ADMIN_DISABLED(3),
    DEVICE_ADMIN_ENABLED(4),
    DEVICE_ADMIN_UNCHANGED_AFTER_PROMPT(5),
    GMS_UPDATED(6),
    GMS_GCM_REGISTERED(7),
    SITREP_REMOTE_INSTRUCTION(8),
    DEVICE_ADMIN_ALREADY_ENABLED(9),
    DEVICE_ADMIN_NOT_ENABLED(10),
    RETRY_AFTER_SERVER_DELAY(11),
    ASSURE_REMOTE_INSTRUCTION(12),
    LOCKSCREEN_STATE_CHANGED(13);
    
    public final int o;

    private avup(int i) {
        this.o = i;
    }

    public static avup a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return ACCOUNTS_CHANGED;
            case 2:
                return CONNECTIVITY_CHANGED;
            case 3:
                return DEVICE_ADMIN_DISABLED;
            case 4:
                return DEVICE_ADMIN_ENABLED;
            case 5:
                return DEVICE_ADMIN_UNCHANGED_AFTER_PROMPT;
            case 6:
                return GMS_UPDATED;
            case 7:
                return GMS_GCM_REGISTERED;
            case 8:
                return SITREP_REMOTE_INSTRUCTION;
            case 9:
                return DEVICE_ADMIN_ALREADY_ENABLED;
            case 10:
                return DEVICE_ADMIN_NOT_ENABLED;
            case 11:
                return RETRY_AFTER_SERVER_DELAY;
            case 12:
                return ASSURE_REMOTE_INSTRUCTION;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /*13*/:
                return LOCKSCREEN_STATE_CHANGED;
            default:
                return null;
        }
    }

    public static aucq b() {
        return avuo.a;
    }

    public final int a() {
        return this.o;
    }

    public final String toString() {
        return Integer.toString(this.o);
    }
}
