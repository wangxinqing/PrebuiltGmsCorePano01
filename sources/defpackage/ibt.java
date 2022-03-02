package defpackage;

import com.google.android.chimera.Service;
import com.google.android.gms.common.api.Status;
import org.chromium.net.UrlRequest;

/* renamed from: ibt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ibt {
    public static Status a(int i, String str) {
        iva.a((Object) str);
        return new Status(i, str);
    }

    public static boolean b(int i) {
        return i >= 17600;
    }

    public static boolean c(int i) {
        return i <= 0;
    }

    public static boolean d(int i) {
        return i <= 0 || (i >= 21020 && i < 21039);
    }

    public static boolean e(int i) {
        return i > 0 && i <= 21019;
    }

    public static Status f(int i) {
        String str;
        switch (i) {
            case 26000:
                str = "USER_LOCATION_API_INVALID_ARGUMENT";
                break;
            case 26001:
                str = "USER_LOCATION_API_PERSONALIZATION_NOT_ALLOWED";
                break;
            case 26002:
                str = "USER_LOCATION_API_TOO_MANY_REQUESTS";
                break;
            default:
                str = a(i);
                break;
        }
        return new Status(i, str);
    }

    public static String a(int i) {
        switch (i) {
            case -1:
                return "SUCCESS_CACHE";
            case 0:
                return "SUCCESS";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 10:
                return "DEVELOPER_ERROR";
            case UrlRequest.Status.WAITING_FOR_RESPONSE /*13*/:
                return "ERROR";
            case UrlRequest.Status.READING_RESPONSE /*14*/:
                return "INTERRUPTED";
            case Service.START_CONTINUATION_MASK:
                return "TIMEOUT";
            case 16:
                return "CANCELED";
            case 17:
                return "API_NOT_CONNECTED";
            case 18:
                return "DEAD_CLIENT";
            default:
                StringBuilder sb = new StringBuilder(32);
                sb.append("unknown status code: ");
                sb.append(i);
                return sb.toString();
        }
    }
}
