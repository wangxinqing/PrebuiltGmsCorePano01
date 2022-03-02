package defpackage;

import com.google.android.chimera.Service;
import org.chromium.net.UrlRequest;

/* renamed from: asnr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class asnr {
    public static /* synthetic */ String a(int i) {
        switch (i) {
            case 1:
                return "UNKNOWN_BANDWIDTH_UPGRADE_ERROR_STAGE";
            case 2:
                return "CLIENT_INTRODUCTION";
            case 3:
                return "NETWORK_AVAILABLE";
            case 4:
                return "LAST_WRITE_TO_PRIOR_CHANNEL";
            case 5:
                return "SAFE_TO_CLOSE_PRIOR_CHANNEL";
            case 6:
                return "SOCKET_CREATION";
            case 7:
                return "PRIOR_ENDPOINT_CHANNEL";
            case 8:
                return "UPGRADE_UNFINISHED";
            case 9:
                return "UPGRADE_SUCCESS";
            case 11:
                return "WIFI_START_HOTSPOT";
            case 12:
                return "WIFI_LISTEN_INCOMING";
            case UrlRequest.Status.WAITING_FOR_RESPONSE /*13*/:
                return "WIFI_CONNECT_TO_HOTSPOT";
            case UrlRequest.Status.READING_RESPONSE /*14*/:
                return "WIFI_LAN_LISTEN_INCOMING";
            case Service.START_CONTINUATION_MASK:
                return "WIFI_LAN_IP_ADDRESS";
            case 16:
                return "WIFI_LAN_SOCKET_CONNECTION";
            case 17:
                return "BLUETOOTH_LISTEN_INCOMING";
            case 18:
                return "BLUETOOTH_OBTAIN_MAC_ADDRESS";
            case 19:
                return "BLUETOOTH_CONNECT_OUTGOING";
            case 20:
                return "BLUETOOTH_PARSE_MAC_ADDRESS";
            case 21:
                return "WIFI_AWARE_LISTEN_INCOMING";
            case 22:
                return "WIFI_AWARE_PUBLISH";
            case 23:
                return "WIFI_AWARE_SUBSCRIBE";
            case 24:
                return "WIFI_AWARE_CONNECT_TO_NETWORK";
            case 25:
                return "WIFI_DIRECT_LISTEN_INCOMING";
            case 26:
                return "WIFI_DIRECT_CREATE_GROUP";
            case 27:
                return "WIFI_DIRECT_CONNECT_OUTGOING";
            default:
                return "null";
        }
    }
}
