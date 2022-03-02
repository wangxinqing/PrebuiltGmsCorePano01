package defpackage;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: anet  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class anet {
    public static anaf a(Iterable iterable, amqy amqy) {
        amrl.a((Object) amqy);
        anab h = anaf.h();
        for (Object next : iterable) {
            h.a(amqy.a(next), next);
        }
        try {
            return h.a();
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(String.valueOf(e.getMessage()).concat(". To index multiple values under a key, use Multimaps.index."));
        }
    }

    static int b(int i) {
        if (i < 3) {
            amxg.a(i, "expectedSize");
            return i + 1;
        } else if (i < 1073741824) {
            return (int) ((((float) i) / 0.75f) + 1.0f);
        } else {
            return Integer.MAX_VALUE;
        }
    }

    static Object b(Map.Entry entry) {
        if (entry != null) {
            return entry.getKey();
        }
        return null;
    }

    public static String b(Map map) {
        int size = map.size();
        amxg.a(size, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(((long) size) * 8, 1073741824));
        sb.append('{');
        boolean z = true;
        for (Map.Entry entry : map.entrySet()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z = false;
        }
        sb.append('}');
        return sb.toString();
    }

    public static anaf a(Map map) {
        if (map instanceof amzq) {
            return (amzq) map;
        }
        Iterator it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return anfu.b;
        }
        Map.Entry entry = (Map.Entry) it.next();
        Enum enumR = (Enum) entry.getKey();
        Object value = entry.getValue();
        amxg.a((Object) enumR, value);
        EnumMap enumMap = new EnumMap(enumR.getDeclaringClass());
        enumMap.put(enumR, value);
        while (it.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it.next();
            Enum enumR2 = (Enum) entry2.getKey();
            Object value2 = entry2.getValue();
            amxg.a((Object) enumR2, value2);
            enumMap.put(enumR2, value2);
        }
        int size = enumMap.size();
        if (size == 0) {
            return anfu.b;
        }
        if (size != 1) {
            return new amzq(enumMap);
        }
        Map.Entry entry3 = (Map.Entry) anbs.b(enumMap.entrySet());
        return anaf.a((Enum) entry3.getKey(), entry3.getValue());
    }

    public static TreeMap b() {
        return new TreeMap();
    }

    public static boolean b(Map map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    static Object a(Map map, Object obj) {
        amrl.a((Object) map);
        try {
            return map.get(obj);
        } catch (ClassCastException | NullPointerException e) {
            return null;
        }
    }

    public static HashMap a() {
        return new HashMap();
    }

    public static HashMap a(int i) {
        return new HashMap(b(i));
    }

    public static Map.Entry a(Object obj, Object obj2) {
        return new amzo(obj, obj2);
    }

    static Map.Entry a(Map.Entry entry) {
        amrl.a((Object) entry);
        return new anen(entry);
    }
}
