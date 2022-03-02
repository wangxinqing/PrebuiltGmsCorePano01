package com.google.android.ulr;

import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class WalletPlaceReportPayloadInstoreTransactionDetails extends jah {
    private static final TreeMap a;

    static {
        TreeMap treeMap = new TreeMap();
        a = treeMap;
        treeMap.put("timestampMillis", FastJsonResponse$Field.b("timestampMillis"));
    }

    public final Map a() {
        return a;
    }

    public final Long b() {
        return (Long) this.b.get("timestampMillis");
    }
}
