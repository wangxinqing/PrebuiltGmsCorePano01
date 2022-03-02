package defpackage;

import com.android.volley.toolbox.ImageRequest;

/* renamed from: rdp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rdp extends ibt {
    public static String g(int i) {
        switch (i) {
            case ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS:
                return "GEOFENCE_NOT_AVAILABLE";
            case 1001:
                return "GEOFENCE_TOO_MANY_GEOFENCES";
            case 1002:
                return "GEOFENCE_TOO_MANY_PENDING_INTENTS";
            case 1004:
                return "GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION";
            default:
                return ibt.a(i);
        }
    }
}
