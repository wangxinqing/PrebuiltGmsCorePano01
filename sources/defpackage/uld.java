package defpackage;

import java.util.Locale;

/* renamed from: uld  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class uld {
    public static String a(int i) {
        String str;
        switch (i) {
            case 1:
                str = "SCAN_FAILED_ALREADY_STARTED";
                break;
            case 2:
                str = "SCAN_FAILED_APPLICATION_REGISTRATION_FAILED";
                break;
            case 3:
                str = "SCAN_FAILED_INTERNAL_ERROR";
                break;
            case 4:
                str = "SCAN_FAILED_FEATURE_UNSUPPORTED";
                break;
            case 5:
                str = "SCAN_FAILED_BLUETOOTH_DISABLED";
                break;
            case 6:
                str = "SCAN_FILTERS_NOT_ALLOWED_FOR_LOCATION";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        return String.format(Locale.ENGLISH, "[%d]%s", new Object[]{Integer.valueOf(i), str});
    }
}
