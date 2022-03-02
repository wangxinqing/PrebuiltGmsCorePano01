package com.google.android.ulr;

import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ApiBatteryCondition extends jah {
    private static final TreeMap a;

    static {
        TreeMap treeMap = new TreeMap();
        a = treeMap;
        treeMap.put("charging", FastJsonResponse$Field.f("charging"));
        a.put("level", FastJsonResponse$Field.a("level"));
        a.put("scale", FastJsonResponse$Field.a("scale"));
        a.put("voltage", FastJsonResponse$Field.a("voltage"));
    }

    public ApiBatteryCondition() {
    }

    public final Map a() {
        return a;
    }

    public final String b() {
        return (String) this.b.get("charging");
    }

    public final Integer c() {
        return (Integer) this.b.get("level");
    }

    public final Integer d() {
        return (Integer) this.b.get("scale");
    }

    public final Integer e() {
        return (Integer) this.b.get("voltage");
    }

    public ApiBatteryCondition(String str, Integer num, Integer num2, Integer num3) {
        if (str != null) {
            a("charging", str);
        }
        a("level", num.intValue());
        a("scale", num2.intValue());
        a("voltage", num3.intValue());
    }
}
