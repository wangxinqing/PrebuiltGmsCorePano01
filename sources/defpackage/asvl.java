package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: asvl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class asvl {
    private static final Set a = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"com.google.android.location.internal.action.ULR_BLE_SCAN_ALARM", "com.google.android.location.internal.action.ULR_BLE_STOP_NEARBY_ALARM", "com.google.android.location.internal.action.ULR_RESTART_BATCH_BLE_SCAN_ALARM", "com.google.android.location.internal.action.ULR_BAROMETER_READ_ALARM", "com.google.android.location.internal.action.GEOFENCER_AR_RESULT", "com.google.android.location.internal.action.GEOFENCER_LOCATION_RESULT", "com.google.android.location.internal.action.PLACES_GEOFENCE_RESULT", "com.google.android.location.internal.action.PLACES_REFRESH_USER_DATA_SUBSCRIPTION", "com.google.android.location.internal.action.ACTION_PLACES_PUBLISH_PLACE_UPDATE", "com.google.android.location.internal.action.FLP_AR_RESULT", "com.google.android.location.internal.action.FLP_LOW_POWER_LOCATION_RESULT", "com.google.android.location.internal.action.FLP_FULL_POWER_LOCATION_RESULT", "com.google.android.location.internal.action.ACTION_FLP_COMPUTE_WIFI_LOCATIONS_RESULT", "com.google.android.location.internal.action.AR_TRANSITION_RESULT"})));

    public static String a(String str) {
        if (str == null || !a.contains(str)) {
            return null;
        }
        return str.concat("_FORWARDED");
    }
}
