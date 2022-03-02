package com.google.android.ulr;

import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ApiSensorData extends jah {
    private static final TreeMap a;
    private final HashMap c = new HashMap();

    static {
        TreeMap treeMap = new TreeMap();
        a = treeMap;
        treeMap.put("barometerDatas", FastJsonResponse$Field.b("barometerDatas", ApiBarometerData.class));
    }

    public ApiSensorData() {
    }

    public final Map a() {
        return a;
    }

    public ArrayList getBarometerDatas() {
        return (ArrayList) this.c.get("barometerDatas");
    }

    public final void a(String str, ArrayList arrayList) {
        this.c.put(str, arrayList);
    }

    public ApiSensorData(ArrayList arrayList) {
        a("barometerDatas", arrayList);
    }

    /* access modifiers changed from: protected */
    public final boolean a(String str) {
        return this.c.containsKey(str);
    }
}
