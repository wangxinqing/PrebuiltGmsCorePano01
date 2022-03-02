package defpackage;

import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;

/* renamed from: anbd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class anbd extends anbe implements NavigableMap {
    public static final /* synthetic */ int d = 0;
    private static final Comparator e = anfh.a;
    private static final anbd f = new anbd(anbh.a(anfh.a), amzy.h());
    private static final long serialVersionUID = 0;
    public final transient anfw b;
    public final transient amzy c;
    private transient anbd g;

    public anbd(anfw anfw, amzy amzy) {
        this(anfw, amzy, (anbd) null);
    }

    private final anbd a(int i, int i2) {
        if (i == 0 && i2 == size()) {
            return this;
        }
        if (i != i2) {
            return new anbd(this.b.b(i, i2), this.c.subList(i, i2));
        }
        return a(comparator());
    }

    public static anbb b() {
        return new anbb(anfh.a);
    }

    public final boolean bo() {
        return this.b.f() || this.c.f();
    }

    public final Map.Entry ceilingEntry(Object obj) {
        return tailMap(obj, true).firstEntry();
    }

    public final Object ceilingKey(Object obj) {
        return anet.b(ceilingEntry(obj));
    }

    public final Comparator comparator() {
        return this.b.a;
    }

    public final amzn d() {
        throw new AssertionError("should never be called");
    }

    public final /* bridge */ /* synthetic */ NavigableSet descendingKeySet() {
        return this.b.descendingSet();
    }

    public final /* bridge */ /* synthetic */ NavigableMap descendingMap() {
        anbd anbd = this.g;
        if (anbd != null) {
            return anbd;
        }
        if (isEmpty()) {
            return a(anfk.a(comparator()).a());
        }
        return new anbd((anfw) this.b.descendingSet(), this.c.g(), this);
    }

    public final amzn e() {
        return this.c;
    }

    public final /* bridge */ /* synthetic */ Set entrySet() {
        return entrySet();
    }

    public final anax f() {
        throw new AssertionError("should never be called");
    }

    public final Map.Entry firstEntry() {
        if (!isEmpty()) {
            return (Map.Entry) entrySet().e().get(0);
        }
        return null;
    }

    public final Object firstKey() {
        return this.b.first();
    }

    public final Map.Entry floorEntry(Object obj) {
        return headMap(obj, true).lastEntry();
    }

    public final Object floorKey(Object obj) {
        return anet.b(floorEntry(obj));
    }

    public final anax g() {
        if (!isEmpty()) {
            return new anba(this);
        }
        return anfv.a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000d, code lost:
        if (r4 >= 0) goto L_0x0012;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object get(java.lang.Object r4) {
        /*
            r3 = this;
            anfw r0 = r3.b
            r1 = -1
            if (r4 == 0) goto L_0x0011
            amzy r2 = r0.d     // Catch:{ ClassCastException -> 0x0010 }
            java.util.Comparator r0 = r0.a     // Catch:{ ClassCastException -> 0x0010 }
            int r4 = java.util.Collections.binarySearch(r2, r4, r0)     // Catch:{ ClassCastException -> 0x0010 }
            if (r4 < 0) goto L_0x0011
            goto L_0x0012
        L_0x0010:
            r4 = move-exception
        L_0x0011:
            r4 = -1
        L_0x0012:
            if (r4 == r1) goto L_0x001b
            amzy r0 = r3.c
            java.lang.Object r4 = r0.get(r4)
            return r4
        L_0x001b:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.anbd.get(java.lang.Object):java.lang.Object");
    }

    public final Map.Entry higherEntry(Object obj) {
        return tailMap(obj, false).firstEntry();
    }

    public final Object higherKey(Object obj) {
        return anet.b(higherEntry(obj));
    }

    public final /* bridge */ /* synthetic */ anax j() {
        return this.b;
    }

    public final /* bridge */ /* synthetic */ Set keySet() {
        return this.b;
    }

    public final Map.Entry lastEntry() {
        if (!isEmpty()) {
            return (Map.Entry) entrySet().e().get(size() - 1);
        }
        return null;
    }

    public final Object lastKey() {
        return this.b.last();
    }

    public final Map.Entry lowerEntry(Object obj) {
        return headMap(obj, false).lastEntry();
    }

    public final Object lowerKey(Object obj) {
        return anet.b(lowerEntry(obj));
    }

    public final /* bridge */ /* synthetic */ NavigableSet navigableKeySet() {
        return this.b;
    }

    @Deprecated
    public final Map.Entry pollFirstEntry() {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final Map.Entry pollLastEntry() {
        throw new UnsupportedOperationException();
    }

    public final int size() {
        return this.c.size();
    }

    public final /* bridge */ /* synthetic */ Collection values() {
        return this.c;
    }

    /* access modifiers changed from: package-private */
    public Object writeReplace() {
        return new anbc(this);
    }

    public anbd(anfw anfw, amzy amzy, anbd anbd) {
        this.b = anfw;
        this.c = amzy;
        this.g = anbd;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.anbd b(java.util.Map r9) {
        /*
            java.util.Comparator r0 = e
            boolean r1 = r9 instanceof java.util.SortedMap
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x001c
            r1 = r9
            java.util.SortedMap r1 = (java.util.SortedMap) r1
            java.util.Comparator r1 = r1.comparator()
            if (r1 == 0) goto L_0x0016
            boolean r1 = r0.equals(r1)
            goto L_0x001d
        L_0x0016:
            java.util.Comparator r1 = e
            if (r0 != r1) goto L_0x001c
            r1 = 1
            goto L_0x001d
        L_0x001c:
            r1 = 0
        L_0x001d:
            if (r1 != 0) goto L_0x0020
            goto L_0x002f
        L_0x0020:
            boolean r4 = r9 instanceof defpackage.anbd
            if (r4 == 0) goto L_0x002f
            r4 = r9
            anbd r4 = (defpackage.anbd) r4
            boolean r5 = r4.bo()
            if (r5 != 0) goto L_0x002f
            goto L_0x0104
        L_0x002f:
            java.util.Set r9 = r9.entrySet()
            java.util.Map$Entry[] r4 = a
            java.lang.Object[] r9 = defpackage.anbs.a((java.lang.Iterable) r9, (java.lang.Object[]) r4)
            java.util.Map$Entry[] r9 = (java.util.Map.Entry[]) r9
            int r4 = r9.length
            if (r4 == 0) goto L_0x0100
            if (r4 == r2) goto L_0x00ee
            java.lang.Object[] r5 = new java.lang.Object[r4]
            java.lang.Object[] r6 = new java.lang.Object[r4]
            if (r1 != 0) goto L_0x00c2
            anay r1 = new anay
            r1.<init>(r0)
            java.util.Arrays.sort(r9, r3, r4, r1)
            r1 = r9[r3]
            java.lang.Object r1 = r1.getKey()
            r5[r3] = r1
            r7 = r9[r3]
            java.lang.Object r7 = r7.getValue()
            r6[r3] = r7
            r3 = r5[r3]
            defpackage.amxg.a((java.lang.Object) r3, (java.lang.Object) r7)
        L_0x0063:
            if (r2 >= r4) goto L_0x00db
            r3 = r9[r2]
            java.lang.Object r3 = r3.getKey()
            r7 = r9[r2]
            java.lang.Object r7 = r7.getValue()
            defpackage.amxg.a((java.lang.Object) r3, (java.lang.Object) r7)
            r5[r2] = r3
            r6[r2] = r7
            int r1 = r0.compare(r1, r3)
            int r7 = r2 + -1
            r7 = r9[r7]
            r8 = r9[r2]
            if (r1 == 0) goto L_0x0088
            int r2 = r2 + 1
            r1 = r3
            goto L_0x0063
        L_0x0088:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r0 = java.lang.String.valueOf(r7)
            java.lang.String r1 = java.lang.String.valueOf(r8)
            java.lang.String r2 = java.lang.String.valueOf(r0)
            int r2 = r2.length()
            java.lang.String r3 = java.lang.String.valueOf(r1)
            int r3 = r3.length()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r2 = r2 + 37
            int r2 = r2 + r3
            r4.<init>(r2)
            java.lang.String r2 = "Multiple entries with same key: "
            r4.append(r2)
            r4.append(r0)
            java.lang.String r0 = " and "
            r4.append(r0)
            r4.append(r1)
            java.lang.String r0 = r4.toString()
            r9.<init>(r0)
            throw r9
        L_0x00c2:
        L_0x00c3:
            if (r3 >= r4) goto L_0x00db
            r1 = r9[r3]
            java.lang.Object r1 = r1.getKey()
            r2 = r9[r3]
            java.lang.Object r2 = r2.getValue()
            defpackage.amxg.a((java.lang.Object) r1, (java.lang.Object) r2)
            r5[r3] = r1
            r6[r3] = r2
            int r3 = r3 + 1
            goto L_0x00c3
        L_0x00db:
            anbd r4 = new anbd
            anfw r9 = new anfw
            amzy r1 = defpackage.amzy.b((java.lang.Object[]) r5)
            r9.<init>(r1, r0)
            amzy r0 = defpackage.amzy.b((java.lang.Object[]) r6)
            r4.<init>(r9, r0)
            goto L_0x0104
        L_0x00ee:
            r1 = r9[r3]
            java.lang.Object r1 = r1.getKey()
            r9 = r9[r3]
            java.lang.Object r9 = r9.getValue()
            anbd r4 = a(r0, r1, r9)
            goto L_0x0104
        L_0x0100:
            anbd r4 = a(r0)
        L_0x0104:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.anbd.b(java.util.Map):anbd");
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

    static anbd a(Comparator comparator) {
        return !anfh.a.equals(comparator) ? new anbd(anbh.a(comparator), amzy.h()) : f;
    }

    public static anbd a(Comparator comparator, Object obj, Object obj2) {
        amzy a = amzy.a(obj);
        amrl.a((Object) comparator);
        return new anbd(new anfw(a, comparator), amzy.a(obj2));
    }

    /* renamed from: a */
    public final anbd headMap(Object obj, boolean z) {
        anfw anfw = this.b;
        amrl.a(obj);
        return a(0, anfw.e(obj, z));
    }

    /* renamed from: a */
    public final anbd subMap(Object obj, boolean z, Object obj2, boolean z2) {
        boolean z3;
        amrl.a(obj);
        amrl.a(obj2);
        if (comparator().compare(obj, obj2) <= 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        amrl.a(z3, "expected fromKey <= toKey but %s > %s", obj, obj2);
        return headMap(obj2, z2).tailMap(obj, z);
    }

    /* renamed from: b */
    public final anbd tailMap(Object obj, boolean z) {
        anfw anfw = this.b;
        amrl.a(obj);
        return a(anfw.f(obj, z), size());
    }
}
