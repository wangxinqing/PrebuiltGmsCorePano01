package defpackage;

import java.util.Iterator;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedSet;

/* renamed from: amwf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class amwf extends amwi implements NavigableSet {
    final /* synthetic */ amwq b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public amwf(amwq amwq, NavigableMap navigableMap) {
        super(amwq, navigableMap);
        this.b = amwq;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final NavigableMap b() {
        return (NavigableMap) super.b();
    }

    public final Object ceiling(Object obj) {
        return b().ceilingKey(obj);
    }

    public final Iterator descendingIterator() {
        return descendingSet().iterator();
    }

    public final NavigableSet descendingSet() {
        return new amwf(this.b, b().descendingMap());
    }

    public final Object floor(Object obj) {
        return b().floorKey(obj);
    }

    public final NavigableSet headSet(Object obj, boolean z) {
        return new amwf(this.b, b().headMap(obj, z));
    }

    public final Object higher(Object obj) {
        return b().higherKey(obj);
    }

    public final Object lower(Object obj) {
        return b().lowerKey(obj);
    }

    public final Object pollFirst() {
        return ance.e(iterator());
    }

    public final Object pollLast() {
        return ance.e(descendingIterator());
    }

    public final NavigableSet subSet(Object obj, boolean z, Object obj2, boolean z2) {
        return new amwf(this.b, b().subMap(obj, z, obj2, z2));
    }

    public final NavigableSet tailSet(Object obj, boolean z) {
        return new amwf(this.b, b().tailMap(obj, z));
    }

    public final /* bridge */ /* synthetic */ SortedSet headSet(Object obj) {
        return headSet(obj, false);
    }

    public final /* bridge */ /* synthetic */ SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    public final /* bridge */ /* synthetic */ SortedSet tailSet(Object obj) {
        return tailSet(obj, true);
    }
}
