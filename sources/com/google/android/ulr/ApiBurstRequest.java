package com.google.android.ulr;

import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ApiBurstRequest extends jah {
    private static final TreeMap a;

    static {
        TreeMap treeMap = new TreeMap();
        a = treeMap;
        treeMap.put("appSpecificKey", FastJsonResponse$Field.f("appSpecificKey"));
        a.put("durationMs", FastJsonResponse$Field.b("durationMs"));
        a.put("movingLatencyMs", FastJsonResponse$Field.b("movingLatencyMs"));
        a.put("reason", FastJsonResponse$Field.f("reason"));
        a.put("stationaryLatencyMs", FastJsonResponse$Field.b("stationaryLatencyMs"));
        a.put("timestampMs", FastJsonResponse$Field.b("timestampMs"));
    }

    public final Map a() {
        return a;
    }

    public final String b() {
        return (String) this.b.get("appSpecificKey");
    }

    public final Long c() {
        return (Long) this.b.get("durationMs");
    }

    public final Long d() {
        return (Long) this.b.get("movingLatencyMs");
    }

    public final String e() {
        return (String) this.b.get("reason");
    }

    public final Long f() {
        return (Long) this.b.get("stationaryLatencyMs");
    }

    public final Long g() {
        return (Long) this.b.get("timestampMs");
    }
}
