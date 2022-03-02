package com.google.android.ulr;

import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class VisibleNetwork extends jah {
    private static final TreeMap a;
    private final HashMap c = new HashMap();

    static {
        TreeMap treeMap = new TreeMap();
        a = treeMap;
        treeMap.put("cell", FastJsonResponse$Field.a("cell", VisibleNetworkCell.class));
        a.put("connected", FastJsonResponse$Field.e("connected"));
        a.put("timestampMs", FastJsonResponse$Field.b("timestampMs"));
        a.put("wifi", FastJsonResponse$Field.a("wifi", VisibleNetworkWiFi.class));
    }

    public final Map a() {
        return a;
    }

    public final Boolean b() {
        return (Boolean) this.b.get("connected");
    }

    public final Long c() {
        return (Long) this.b.get("timestampMs");
    }

    public VisibleNetworkCell getCell() {
        return (VisibleNetworkCell) this.c.get("cell");
    }

    public VisibleNetworkWiFi getWifi() {
        return (VisibleNetworkWiFi) this.c.get("wifi");
    }

    public final void a(String str, jag jag) {
        this.c.put(str, jag);
    }

    /* access modifiers changed from: protected */
    public final boolean b(String str) {
        return this.c.containsKey(str);
    }
}
