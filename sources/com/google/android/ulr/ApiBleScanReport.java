package com.google.android.ulr;

import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ApiBleScanReport extends jah {
    private static final TreeMap a;
    private final HashMap c = new HashMap();

    static {
        TreeMap treeMap = new TreeMap();
        a = treeMap;
        treeMap.put("bleScans", FastJsonResponse$Field.b("bleScans", BleStrengthProto.class));
        a.put("bleSensorDatas", FastJsonResponse$Field.b("bleSensorDatas", BleSensorData.class));
    }

    public ApiBleScanReport() {
    }

    public final Map a() {
        return a;
    }

    public ArrayList getBleScans() {
        return (ArrayList) this.c.get("bleScans");
    }

    public ArrayList getBleSensorDatas() {
        return (ArrayList) this.c.get("bleSensorDatas");
    }

    public final void a(String str, ArrayList arrayList) {
        this.c.put(str, arrayList);
    }

    public ApiBleScanReport(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList != null) {
            a("bleScans", arrayList);
        }
        if (arrayList2 != null) {
            a("bleSensorDatas", arrayList2);
        }
    }

    /* access modifiers changed from: protected */
    public final boolean a(String str) {
        return this.c.containsKey(str);
    }
}
