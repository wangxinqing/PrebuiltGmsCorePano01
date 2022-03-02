package com.google.android.ulr;

import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class DeleteApiLocationsRequest extends jah {
    private static final TreeMap a;
    private final HashMap c = new HashMap();

    static {
        TreeMap treeMap = new TreeMap();
        a = treeMap;
        treeMap.put("clientInfo", FastJsonResponse$Field.a("clientInfo", ApiClientInfo.class));
        a.put("firstTimestampMs", FastJsonResponse$Field.b("firstTimestampMs"));
        a.put("lastTimestampMs", FastJsonResponse$Field.b("lastTimestampMs"));
        a.put("settingsLastKnownTimestampMs", FastJsonResponse$Field.b("settingsLastKnownTimestampMs"));
    }

    public DeleteApiLocationsRequest() {
    }

    public final Map a() {
        return a;
    }

    /* access modifiers changed from: protected */
    public final boolean b(String str) {
        return this.c.containsKey(str);
    }

    public ApiClientInfo getClientInfo() {
        return (ApiClientInfo) this.c.get("clientInfo");
    }

    public final void a(String str, jag jag) {
        this.c.put(str, jag);
    }

    public DeleteApiLocationsRequest(ApiClientInfo apiClientInfo) {
        a("clientInfo", (jag) apiClientInfo);
    }
}
