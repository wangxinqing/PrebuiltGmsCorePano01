package com.google.android.ulr;

import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class WalletPlaceReportPayloadPlaceIdLikelihood extends jah {
    private static final TreeMap a;

    static {
        TreeMap treeMap = new TreeMap();
        a = treeMap;
        treeMap.put("likelihood", FastJsonResponse$Field.c("likelihood"));
        a.put("placeId", FastJsonResponse$Field.f("placeId"));
    }

    public final Map a() {
        return a;
    }

    public final Float b() {
        return (Float) this.b.get("likelihood");
    }

    public final String c() {
        return (String) this.b.get("placeId");
    }
}
