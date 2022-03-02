package defpackage;

import com.google.android.gms.common.api.Status;

@Deprecated
/* renamed from: ris  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ris extends ibt {
    public static Status b(int i, String str) {
        iva.a((Object) str);
        return new Status(i, str);
    }

    public static String g(int i) {
        if (i == 9051) {
            return "PLACE_ALIAS_NOT_FOUND";
        }
        if (i == 9150) {
            return "PLACEFENCING_NOT_AVAILABLE";
        }
        if (i == 9101) {
            return "PLACE_PROXIMITY_UNKNOWN";
        }
        if (i == 9102) {
            return "NEARBY_ALERTS_NOT_AVAILABLE";
        }
        if (i == 9201) {
            return "PLACES_API_PERSONALIZED_DATA_ACCESS_APPROVED";
        }
        if (i == 9202) {
            return "PLACES_API_PERSONALIZED_DATA_ACCESS_REJECTED";
        }
        switch (i) {
            case 9000:
                return "PLACES_API_QUOTA_FAILED";
            case 9001:
                return "PLACES_API_USAGE_LIMIT_EXCEEDED";
            case 9002:
                return "PLACES_API_KEY_INVALID";
            case 9003:
                return "PLACES_API_ACCESS_NOT_CONFIGURED";
            case 9004:
                return "PLACES_API_INVALID_ARGUMENT";
            case 9005:
                return "PLACES_API_RATE_LIMIT_EXCEEDED";
            case 9006:
                return "PLACES_API_DEVICE_RATE_LIMIT_EXCEEDED";
            case 9007:
                return "PLACES_API_KEY_EXPIRED";
            case 9008:
                return "PLACES_API_INVALID_APP";
            case 9009:
                return "INSUFFICIENT_LOCATION_PERMISSION_FOR_BACKGROUND_PLACES";
            default:
                return ibt.a(i);
        }
    }

    public static Status h(int i) {
        return b(i, g(i));
    }
}
