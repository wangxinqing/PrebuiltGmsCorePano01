package com.google.android.ulr;

import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class FieldOfView extends jah {
    private static final TreeMap a;

    static {
        TreeMap treeMap = new TreeMap();
        a = treeMap;
        treeMap.put("fieldOfViewXDegrees", FastJsonResponse$Field.c("fieldOfViewXDegrees"));
        a.put("fieldOfViewYDegrees", FastJsonResponse$Field.c("fieldOfViewYDegrees"));
        a.put("screenWidthPixels", FastJsonResponse$Field.a("screenWidthPixels"));
    }

    public final Map a() {
        return a;
    }

    public final Float b() {
        return (Float) this.b.get("fieldOfViewXDegrees");
    }

    public final Float c() {
        return (Float) this.b.get("fieldOfViewYDegrees");
    }

    public final Integer d() {
        return (Integer) this.b.get("screenWidthPixels");
    }
}
