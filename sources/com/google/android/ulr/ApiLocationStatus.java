package com.google.android.ulr;

import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ApiLocationStatus extends jah {
    private static final TreeMap a;

    static {
        TreeMap treeMap = new TreeMap();
        a = treeMap;
        treeMap.put("cellStatus", FastJsonResponse$Field.f("cellStatus"));
        a.put("changed", FastJsonResponse$Field.e("changed"));
        a.put("wifiStatus", FastJsonResponse$Field.f("wifiStatus"));
    }

    public ApiLocationStatus() {
    }

    public final Map a() {
        return a;
    }

    public final String b() {
        return (String) this.b.get("cellStatus");
    }

    public final Boolean c() {
        return (Boolean) this.b.get("changed");
    }

    public final String d() {
        return (String) this.b.get("wifiStatus");
    }

    public ApiLocationStatus(String str, Boolean bool, String str2) {
        a("cellStatus", str);
        a("changed", bool.booleanValue());
        a("wifiStatus", str2);
    }
}
