package com.google.android.ulr;

import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ApiDeviceSetting extends jah {
    private static final TreeMap a;

    static {
        TreeMap treeMap = new TreeMap();
        a = treeMap;
        treeMap.put("batterySaverEnabled", FastJsonResponse$Field.e("batterySaverEnabled"));
        a.put("batterySaverThreshold", FastJsonResponse$Field.a("batterySaverThreshold"));
        a.put("isGeoSupported", FastJsonResponse$Field.e("isGeoSupported"));
        a.put("isLocationEnabled", FastJsonResponse$Field.e("isLocationEnabled"));
        a.put("isLocationEnabledForGoogleApp", FastJsonResponse$Field.e("isLocationEnabledForGoogleApp"));
        a.put("isRunningRestrictedProfile", FastJsonResponse$Field.e("isRunningRestrictedProfile"));
        a.put("isSupportedFormFactor", FastJsonResponse$Field.e("isSupportedFormFactor"));
        a.put("locationBleScanEnabled", FastJsonResponse$Field.e("locationBleScanEnabled"));
        a.put("locationMode", FastJsonResponse$Field.f("locationMode"));
        a.put("locationWifiScanEnabled", FastJsonResponse$Field.e("locationWifiScanEnabled"));
    }

    public ApiDeviceSetting() {
    }

    public final Map a() {
        return a;
    }

    public ApiDeviceSetting(Boolean bool, Integer num, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, String str, Boolean bool8) {
        if (bool != null) {
            a("batterySaverEnabled", bool.booleanValue());
        }
        if (num != null) {
            a("batterySaverThreshold", num.intValue());
        }
        if (bool2 != null) {
            a("isGeoSupported", bool2.booleanValue());
        }
        a("isLocationEnabled", bool3.booleanValue());
        if (bool4 != null) {
            a("isLocationEnabledForGoogleApp", bool4.booleanValue());
        }
        if (bool5 != null) {
            a("isRunningRestrictedProfile", bool5.booleanValue());
        }
        if (bool6 != null) {
            a("isSupportedFormFactor", bool6.booleanValue());
        }
        if (bool7 != null) {
            a("locationBleScanEnabled", bool7.booleanValue());
        }
        if (str != null) {
            a("locationMode", str);
        }
        if (bool8 != null) {
            a("locationWifiScanEnabled", bool8.booleanValue());
        }
    }
}
