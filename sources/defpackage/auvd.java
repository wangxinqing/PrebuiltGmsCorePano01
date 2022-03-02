package defpackage;

import com.google.android.chimera.Service;
import org.chromium.net.UrlRequest;

/* renamed from: auvd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum auvd implements auco {
    COMMAND_UNKNOWN(0),
    MEDIUM_OVERRIDE(1),
    START_BEACON(2),
    STOP_BEACON(3),
    DELETE_4(4),
    START_LISTEN(5),
    STOP_LISTEN(6),
    REGISTER_TOKEN_OBSERVER_CALLBACK(7),
    REGISTER_TOKEN_ADVERTISER_CALLBACK(8),
    SAVE_CLIENT_OVERRIDES(9),
    RESTORE_CLIENT_OVERRIDES(10),
    CLEAR_OVERRIDES(11),
    GET_CONFIGURATION(12),
    SCHEDULE_PRESEEDED_TOKENS_ROTATION(13),
    CLEAR_CACHE(14),
    CLEAR_DIRECTIVES(15),
    REGISTER_NETWORK_CALLBACK(16),
    UNREGISTER_NETWORK_CALLBACK(17),
    UPDATE_CONFIGURATION(18),
    UNREGISTER_TOKEN_OBSERVER_CALLBACK(19),
    UNREGISTER_TOKEN_ADVERTISER_CALLBACK(20),
    REGISTER_CONFIGURATION_CALLBACK(21),
    UNREGISTER_CONFIGURATION_CALLBACK(22),
    REGISTER_GCM_CALLBACK(23),
    UNREGISTER_GCM_CALLBACK(24),
    REGISTER_OPERATION_CALLBACK(25),
    UNREGISTER_OPERATION_CALLBACK(26);
    
    public final int B;

    private auvd(int i) {
        this.B = i;
    }

    public static auvd a(int i) {
        switch (i) {
            case 0:
                return COMMAND_UNKNOWN;
            case 1:
                return MEDIUM_OVERRIDE;
            case 2:
                return START_BEACON;
            case 3:
                return STOP_BEACON;
            case 4:
                return DELETE_4;
            case 5:
                return START_LISTEN;
            case 6:
                return STOP_LISTEN;
            case 7:
                return REGISTER_TOKEN_OBSERVER_CALLBACK;
            case 8:
                return REGISTER_TOKEN_ADVERTISER_CALLBACK;
            case 9:
                return SAVE_CLIENT_OVERRIDES;
            case 10:
                return RESTORE_CLIENT_OVERRIDES;
            case 11:
                return CLEAR_OVERRIDES;
            case 12:
                return GET_CONFIGURATION;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /*13*/:
                return SCHEDULE_PRESEEDED_TOKENS_ROTATION;
            case UrlRequest.Status.READING_RESPONSE /*14*/:
                return CLEAR_CACHE;
            case Service.START_CONTINUATION_MASK:
                return CLEAR_DIRECTIVES;
            case 16:
                return REGISTER_NETWORK_CALLBACK;
            case 17:
                return UNREGISTER_NETWORK_CALLBACK;
            case 18:
                return UPDATE_CONFIGURATION;
            case 19:
                return UNREGISTER_TOKEN_OBSERVER_CALLBACK;
            case 20:
                return UNREGISTER_TOKEN_ADVERTISER_CALLBACK;
            case 21:
                return REGISTER_CONFIGURATION_CALLBACK;
            case 22:
                return UNREGISTER_CONFIGURATION_CALLBACK;
            case 23:
                return REGISTER_GCM_CALLBACK;
            case 24:
                return UNREGISTER_GCM_CALLBACK;
            case 25:
                return REGISTER_OPERATION_CALLBACK;
            case 26:
                return UNREGISTER_OPERATION_CALLBACK;
            default:
                return null;
        }
    }

    public static aucq b() {
        return auvc.a;
    }

    public final int a() {
        return this.B;
    }

    public final String toString() {
        return Integer.toString(this.B);
    }
}
