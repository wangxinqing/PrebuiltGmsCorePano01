package com.google.android.ulr;

import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ApiDeviceConnectivitySetting extends jah {
    private static final TreeMap a;

    static {
        TreeMap treeMap = new TreeMap();
        a = treeMap;
        treeMap.put("airplaneModeEnabled", FastJsonResponse$Field.e("airplaneModeEnabled"));
        a.put("dozeMode", FastJsonResponse$Field.e("dozeMode"));
        a.put("wifiEnabled", FastJsonResponse$Field.e("wifiEnabled"));
    }

    public ApiDeviceConnectivitySetting() {
    }

    public final Map a() {
        return a;
    }

    public final Boolean b() {
        return (Boolean) this.b.get("airplaneModeEnabled");
    }

    public final Boolean c() {
        return (Boolean) this.b.get("dozeMode");
    }

    public final Boolean d() {
        return (Boolean) this.b.get("wifiEnabled");
    }

    public ApiDeviceConnectivitySetting(Boolean bool, Boolean bool2, Boolean bool3) {
        if (bool != null) {
            a("airplaneModeEnabled", bool.booleanValue());
        }
        if (bool2 != null) {
            a("dozeMode", bool2.booleanValue());
        }
        if (bool3 != null) {
            a("wifiEnabled", bool3.booleanValue());
        }
    }
}
