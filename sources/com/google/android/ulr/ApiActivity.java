package com.google.android.ulr;

import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ApiActivity extends jah {
    private static final TreeMap a;

    static {
        TreeMap treeMap = new TreeMap();
        a = treeMap;
        treeMap.put("confidence", FastJsonResponse$Field.a("confidence"));
        a.put("type", FastJsonResponse$Field.f("type"));
    }

    public ApiActivity() {
    }

    public final Map a() {
        return a;
    }

    public final Integer b() {
        return (Integer) this.b.get("confidence");
    }

    public final String c() {
        return (String) this.b.get("type");
    }

    public ApiActivity(Integer num, String str) {
        a("confidence", num.intValue());
        a("type", str);
    }
}
