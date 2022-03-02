package com.google.android.ulr;

import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ApiActivityExtraRow extends jah {
    private static final TreeMap a;

    static {
        TreeMap treeMap = new TreeMap();
        a = treeMap;
        treeMap.put("booleanVal", FastJsonResponse$Field.e("booleanVal"));
        a.put("doubleVal", FastJsonResponse$Field.d("doubleVal"));
        a.put("floatVal", FastJsonResponse$Field.c("floatVal"));
        a.put("intVal", FastJsonResponse$Field.a("intVal"));
        a.put("longVal", FastJsonResponse$Field.b("longVal"));
        a.put("name", FastJsonResponse$Field.f("name"));
        a.put("stringVal", FastJsonResponse$Field.f("stringVal"));
        a.put("type", FastJsonResponse$Field.f("type"));
    }

    public ApiActivityExtraRow() {
    }

    public final Map a() {
        return a;
    }

    public final Boolean b() {
        return (Boolean) this.b.get("booleanVal");
    }

    public final Double c() {
        return (Double) this.b.get("doubleVal");
    }

    public final Float d() {
        return (Float) this.b.get("floatVal");
    }

    public final Integer e() {
        return (Integer) this.b.get("intVal");
    }

    public final Long f() {
        return (Long) this.b.get("longVal");
    }

    public final String g() {
        return (String) this.b.get("name");
    }

    public final String h() {
        return (String) this.b.get("stringVal");
    }

    public final String i() {
        return (String) this.b.get("type");
    }

    public ApiActivityExtraRow(Boolean bool, Double d, Float f, Integer num, Long l, String str, String str2, String str3) {
        if (bool != null) {
            a("booleanVal", bool.booleanValue());
        }
        if (d != null) {
            a("doubleVal", d.doubleValue());
        }
        if (f != null) {
            a("floatVal", f.floatValue());
        }
        if (num != null) {
            a("intVal", num.intValue());
        }
        if (l != null) {
            a("longVal", l.longValue());
        }
        if (str != null) {
            a("name", str);
        }
        if (str2 != null) {
            a("stringVal", str2);
        }
        a("type", str3);
    }
}
