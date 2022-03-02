package com.google.android.ulr;

import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ApiTakeoutLocation extends jah {
    private static final TreeMap a;
    private final HashMap c = new HashMap();

    static {
        TreeMap treeMap = new TreeMap();
        a = treeMap;
        treeMap.put("accuracy", FastJsonResponse$Field.a("accuracy"));
        a.put("activitys", FastJsonResponse$Field.b("activitys", ApiActivityReading.class));
        a.put("altitude", FastJsonResponse$Field.a("altitude"));
        a.put("heading", FastJsonResponse$Field.a("heading"));
        a.put("latitudeE7", FastJsonResponse$Field.a("latitudeE7"));
        a.put("longitudeE7", FastJsonResponse$Field.a("longitudeE7"));
        a.put("timestampMs", FastJsonResponse$Field.b("timestampMs"));
        a.put("velocity", FastJsonResponse$Field.a("velocity"));
        a.put("verticalAccuracy", FastJsonResponse$Field.a("verticalAccuracy"));
    }

    public final Map a() {
        return a;
    }

    public ArrayList getActivitys() {
        return (ArrayList) this.c.get("activitys");
    }

    public final void a(String str, ArrayList arrayList) {
        this.c.put(str, arrayList);
    }

    /* access modifiers changed from: protected */
    public final boolean a(String str) {
        return this.c.containsKey(str);
    }
}
