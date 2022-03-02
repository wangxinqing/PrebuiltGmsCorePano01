package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;

/* renamed from: amwe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class amwe extends amwh implements NavigableMap {
    final /* synthetic */ amwq c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public amwe(amwq amwq, NavigableMap navigableMap) {
        super(amwq, navigableMap);
        this.c = amwq;
    }

    /* access modifiers changed from: package-private */
    public final Map.Entry a(Iterator it) {
        if (!it.hasNext()) {
            return null;
        }
        Map.Entry entry = (Map.Entry) it.next();
        Collection a = this.c.a();
        a.addAll((Collection) entry.getValue());
        it.remove();
        return anet.a(entry.getKey(), (Object) this.c.a(a));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final NavigableMap g() {
        return (NavigableMap) super.g();
    }

    /* renamed from: c */
    public final NavigableSet keySet() {
        return (NavigableSet) super.keySet();
    }

    public final Map.Entry ceilingEntry(Object obj) {
        Map.Entry ceilingEntry = g().ceilingEntry(obj);
        if (ceilingEntry != null) {
            return a(ceilingEntry);
        }
        return null;
    }

    public final Object ceilingKey(Object obj) {
        return g().ceilingKey(obj);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final NavigableSet h() {
        return new amwf(this.c, g());
    }

    public final NavigableSet descendingKeySet() {
        return ((amwe) descendingMap()).keySet();
    }

    public final NavigableMap descendingMap() {
        return new amwe(this.c, g().descendingMap());
    }

    public final Map.Entry firstEntry() {
        Map.Entry firstEntry = g().firstEntry();
        if (firstEntry != null) {
            return a(firstEntry);
        }
        return null;
    }

    public final Map.Entry floorEntry(Object obj) {
        Map.Entry floorEntry = g().floorEntry(obj);
        if (floorEntry != null) {
            return a(floorEntry);
        }
        return null;
    }

    public final Object floorKey(Object obj) {
        return g().floorKey(obj);
    }

    public final NavigableMap headMap(Object obj, boolean z) {
        return new amwe(this.c, g().headMap(obj, z));
    }

    public final Map.Entry higherEntry(Object obj) {
        Map.Entry higherEntry = g().higherEntry(obj);
        if (higherEntry != null) {
            return a(higherEntry);
        }
        return null;
    }

    public final Object higherKey(Object obj) {
        return g().higherKey(obj);
    }

    public final Map.Entry lastEntry() {
        Map.Entry lastEntry = g().lastEntry();
        if (lastEntry != null) {
            return a(lastEntry);
        }
        return null;
    }

    public final Map.Entry lowerEntry(Object obj) {
        Map.Entry lowerEntry = g().lowerEntry(obj);
        if (lowerEntry != null) {
            return a(lowerEntry);
        }
        return null;
    }

    public final Object lowerKey(Object obj) {
        return g().lowerKey(obj);
    }

    public final NavigableSet navigableKeySet() {
        return keySet();
    }

    public final Map.Entry pollFirstEntry() {
        return a(entrySet().iterator());
    }

    public final Map.Entry pollLastEntry() {
        return a(descendingMap().entrySet().iterator());
    }

    public final NavigableMap subMap(Object obj, boolean z, Object obj2, boolean z2) {
        return new amwe(this.c, g().subMap(obj, z, obj2, z2));
    }

    public final NavigableMap tailMap(Object obj, boolean z) {
        return new amwe(this.c, g().tailMap(obj, z));
    }

    public final /* bridge */ /* synthetic */ SortedMap headMap(Object obj) {
        return headMap(obj, false);
    }

    public final /* bridge */ /* synthetic */ SortedMap subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    public final /* bridge */ /* synthetic */ SortedMap tailMap(Object obj) {
        return tailMap(obj, true);
    }
}
