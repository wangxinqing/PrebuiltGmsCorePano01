package com.google.android.ulr;

import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class RemoteDeviceInfo extends jah {
    private static final TreeMap a;

    static {
        TreeMap treeMap = new TreeMap();
        a = treeMap;
        treeMap.put("devicePrettyName", FastJsonResponse$Field.f("devicePrettyName"));
        a.put("deviceTag", FastJsonResponse$Field.a("deviceTag"));
        a.put("isRestricted", FastJsonResponse$Field.e("isRestricted"));
        a.put("lastModifiedTimestampMs", FastJsonResponse$Field.b("lastModifiedTimestampMs"));
        a.put("lastReportTimestampMs", FastJsonResponse$Field.b("lastReportTimestampMs"));
        a.put("reportingEnabled", FastJsonResponse$Field.e("reportingEnabled"));
    }

    public final Map a() {
        return a;
    }

    public final Boolean b() {
        return (Boolean) this.b.get("reportingEnabled");
    }
}
