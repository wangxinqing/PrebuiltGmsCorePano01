package com.google.android.ulr;

import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ApiStepCountsEntry extends jah {
    private static final TreeMap a;

    static {
        TreeMap treeMap = new TreeMap();
        a = treeMap;
        treeMap.put("stepCountStatus", FastJsonResponse$Field.f("stepCountStatus"));
        a.put("stepCounts", FastJsonResponse$Field.a("stepCounts"));
    }

    public ApiStepCountsEntry() {
    }

    public final Map a() {
        return a;
    }

    public final String b() {
        return (String) this.b.get("stepCountStatus");
    }

    public final Integer c() {
        return (Integer) this.b.get("stepCounts");
    }

    public ApiStepCountsEntry(String str, Integer num) {
        a("stepCountStatus", str);
        a("stepCounts", num.intValue());
    }
}
