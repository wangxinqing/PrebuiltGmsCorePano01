package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: audr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class audr extends LinkedHashMap {
    public static final audr b;
    public boolean a = true;

    static {
        audr audr = new audr();
        b = audr;
        audr.b();
    }

    private audr() {
    }

    private static int a(Object obj) {
        if (obj instanceof byte[]) {
            return aucy.c((byte[]) obj);
        }
        if (!(obj instanceof auco)) {
            return obj.hashCode();
        }
        throw new UnsupportedOperationException();
    }

    public final void b() {
        this.a = false;
    }

    public final void c() {
        if (!this.a) {
            throw new UnsupportedOperationException();
        }
    }

    public final void clear() {
        c();
        super.clear();
    }

    public final Set entrySet() {
        return !isEmpty() ? super.entrySet() : Collections.emptySet();
    }

    public final boolean equals(Object obj) {
        boolean z;
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (this == map) {
            return true;
        }
        if (size() != map.size()) {
            return false;
        }
        for (Map.Entry entry : entrySet()) {
            if (!map.containsKey(entry.getKey())) {
                return false;
            }
            Object value = entry.getValue();
            Object obj2 = map.get(entry.getKey());
            if (!(value instanceof byte[]) || !(obj2 instanceof byte[])) {
                z = value.equals(obj2);
                continue;
            } else {
                z = Arrays.equals((byte[]) value, (byte[]) obj2);
                continue;
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }

    public final Object put(Object obj, Object obj2) {
        c();
        aucy.a(obj);
        aucy.a(obj2);
        return super.put(obj, obj2);
    }

    public final void putAll(Map map) {
        c();
        for (Object next : map.keySet()) {
            aucy.a(next);
            aucy.a(map.get(next));
        }
        super.putAll(map);
    }

    public final Object remove(Object obj) {
        c();
        return super.remove(obj);
    }

    private audr(Map map) {
        super(map);
    }

    public final int hashCode() {
        int i = 0;
        for (Map.Entry entry : entrySet()) {
            i += a(entry.getValue()) ^ a(entry.getKey());
        }
        return i;
    }

    public final audr a() {
        return !isEmpty() ? new audr(this) : new audr();
    }
}
