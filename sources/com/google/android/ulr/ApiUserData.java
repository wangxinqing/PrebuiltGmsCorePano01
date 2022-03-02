package com.google.android.ulr;

import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ApiUserData extends jah {
    private static final TreeMap a;

    static {
        TreeMap treeMap = new TreeMap();
        a = treeMap;
        treeMap.put("dataBinary", FastJsonResponse$Field.f("dataBinary"));
        a.put("dataEncoded", FastJsonResponse$Field.f("dataEncoded"));
        a.put("dataType", FastJsonResponse$Field.f("dataType"));
        a.put("timestampMs", FastJsonResponse$Field.b("timestampMs"));
    }

    public ApiUserData() {
    }

    public final Map a() {
        return a;
    }

    public final String b() {
        return (String) this.b.get("dataBinary");
    }

    public final String c() {
        return (String) this.b.get("dataEncoded");
    }

    public final String d() {
        return (String) this.b.get("dataType");
    }

    public final Long e() {
        return (Long) this.b.get("timestampMs");
    }

    public ApiUserData(String str, String str2, Long l) {
        if (str != null) {
            a("dataEncoded", str);
        }
        if (str2 != null) {
            a("dataType", str2);
        }
        a("timestampMs", l.longValue());
    }
}
