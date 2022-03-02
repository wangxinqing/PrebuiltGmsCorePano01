package com.google.android.ulr;

import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class GetApiTakeoutLocationsReply extends jah {
    private static final TreeMap a;
    private final HashMap c = new HashMap();

    static {
        TreeMap treeMap = new TreeMap();
        a = treeMap;
        treeMap.put("locations", FastJsonResponse$Field.b("locations", ApiTakeoutLocation.class));
        a.put("somePointsHidden", FastJsonResponse$Field.e("somePointsHidden"));
        a.put("somePointsTruncated", FastJsonResponse$Field.e("somePointsTruncated"));
    }

    public final Map a() {
        return a;
    }

    public ArrayList getLocations() {
        return (ArrayList) this.c.get("locations");
    }

    public final void a(String str, ArrayList arrayList) {
        this.c.put(str, arrayList);
    }

    /* access modifiers changed from: protected */
    public final boolean a(String str) {
        return this.c.containsKey(str);
    }
}
