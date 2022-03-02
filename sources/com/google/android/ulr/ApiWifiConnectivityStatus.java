package com.google.android.ulr;

import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ApiWifiConnectivityStatus extends jah {
    private static final TreeMap a;

    static {
        TreeMap treeMap = new TreeMap();
        a = treeMap;
        treeMap.put("mac", FastJsonResponse$Field.b("mac"));
        a.put("wifiConnectionStatus", FastJsonResponse$Field.f("wifiConnectionStatus"));
    }

    public ApiWifiConnectivityStatus() {
    }

    public final Map a() {
        return a;
    }

    public final Long b() {
        return (Long) this.b.get("mac");
    }

    public final String c() {
        return (String) this.b.get("wifiConnectionStatus");
    }

    public ApiWifiConnectivityStatus(Long l, String str) {
        a("mac", l.longValue());
        a("wifiConnectionStatus", str);
    }
}
