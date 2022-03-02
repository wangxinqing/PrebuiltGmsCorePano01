package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: edw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class edw implements Map {
    public int a = 0;
    private final HashMap b = new HashMap();
    private final HashMap c = new HashMap();

    private final int a() {
        int i = 0;
        while (this.b.values().contains(Integer.valueOf(i))) {
            i++;
        }
        return i;
    }

    public final void clear() {
        this.c.clear();
        this.b.clear();
        this.a = 0;
    }

    public final boolean containsKey(Object obj) {
        return this.c.containsKey(obj);
    }

    public final boolean containsValue(Object obj) {
        return this.c.containsValue(obj);
    }

    public final Set entrySet() {
        return this.c.entrySet();
    }

    public final Object get(Object obj) {
        return this.c.get(obj);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c, Integer.valueOf(this.a)});
    }

    public final boolean isEmpty() {
        return this.c.isEmpty();
    }

    public final Set keySet() {
        return this.c.keySet();
    }

    public final Object put(Object obj, Object obj2) {
        boolean containsKey = containsKey(obj);
        Object put = this.c.put(obj, obj2);
        if (!containsKey) {
            this.b.put(obj, Integer.valueOf(this.a));
        }
        this.a = a();
        return put;
    }

    public final void putAll(Map map) {
        for (Object next : map.keySet()) {
            put(next, map.get(next));
        }
    }

    public final Object remove(Object obj) {
        Object remove = this.c.remove(obj);
        this.b.remove(obj);
        this.a = a();
        return remove;
    }

    public final int size() {
        return this.c.size();
    }

    public final Collection values() {
        return this.c.values();
    }
}
