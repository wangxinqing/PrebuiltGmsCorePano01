package defpackage;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;

/* renamed from: anaf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class anaf implements Map, Serializable {
    static final Map.Entry[] a = new Map.Entry[0];
    private transient anax b;
    private transient anax c;
    private transient amzn d;

    public static anab a(int i) {
        amxg.a(i, "expectedSize");
        return new anab(i);
    }

    public static anab h() {
        return new anab();
    }

    public anhj bn() {
        throw null;
    }

    public abstract boolean bo();

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    public abstract amzn d();

    /* renamed from: e */
    public amzn values() {
        amzn amzn = this.d;
        if (amzn != null) {
            return amzn;
        }
        amzn d2 = d();
        this.d = d2;
        return d2;
    }

    public boolean equals(Object obj) {
        return anet.b(this, obj);
    }

    public abstract anax f();

    public abstract anax g();

    public abstract Object get(Object obj);

    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    public final int hashCode() {
        return angm.a((Set) entrySet());
    }

    /* renamed from: i */
    public final anax entrySet() {
        anax anax = this.b;
        if (anax != null) {
            return anax;
        }
        anax g = g();
        this.b = g;
        return g;
    }

    public final boolean isEmpty() {
        return size() == 0;
    }

    /* renamed from: j */
    public anax keySet() {
        anax anax = this.c;
        if (anax != null) {
            return anax;
        }
        anax f = f();
        this.c = f;
        return f;
    }

    @Deprecated
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        return anet.b((Map) this);
    }

    /* access modifiers changed from: package-private */
    public Object writeReplace() {
        return new anae(this);
    }

    public static anaf a(Iterable iterable) {
        int i;
        if (iterable instanceof Collection) {
            i = ((Collection) iterable).size();
        } else {
            i = 4;
        }
        anab anab = new anab(i);
        anab.a(iterable);
        return anab.a();
    }

    public static anaf a(Object obj, Object obj2) {
        amxg.a(obj, obj2);
        return anfu.a(1, new Object[]{obj, obj2});
    }

    public static anaf a(Object obj, Object obj2, Object obj3, Object obj4) {
        amxg.a(obj, obj2);
        amxg.a(obj3, obj4);
        return anfu.a(2, new Object[]{obj, obj2, obj3, obj4});
    }

    public static anaf a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        amxg.a(obj, obj2);
        amxg.a(obj3, obj4);
        amxg.a(obj5, obj6);
        return anfu.a(3, new Object[]{obj, obj2, obj3, obj4, obj5, obj6});
    }

    public static anaf a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        amxg.a(obj, obj2);
        amxg.a(obj3, obj4);
        amxg.a(obj5, obj6);
        amxg.a(obj7, obj8);
        return anfu.a(4, new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8});
    }

    public static anaf a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10) {
        amxg.a(obj, obj2);
        amxg.a(obj3, obj4);
        amxg.a(obj5, obj6);
        amxg.a(obj7, obj8);
        amxg.a(obj9, obj10);
        return anfu.a(5, new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10});
    }

    public static anaf a(Map map) {
        if ((map instanceof anaf) && !(map instanceof SortedMap)) {
            anaf anaf = (anaf) map;
            if (!anaf.bo()) {
                return anaf;
            }
        }
        return a((Iterable) map.entrySet());
    }
}
