package defpackage;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* renamed from: amwi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
class amwi extends amwd implements SortedSet {
    final /* synthetic */ amwq c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public amwi(amwq amwq, SortedMap sortedMap) {
        super(amwq, sortedMap);
        this.c = amwq;
    }

    public SortedMap b() {
        return (SortedMap) this.d;
    }

    public final Comparator comparator() {
        return b().comparator();
    }

    public final Object first() {
        return b().firstKey();
    }

    public SortedSet headSet(Object obj) {
        return new amwi(this.c, b().headMap(obj));
    }

    public final Object last() {
        return b().lastKey();
    }

    public SortedSet subSet(Object obj, Object obj2) {
        return new amwi(this.c, b().subMap(obj, obj2));
    }

    public SortedSet tailSet(Object obj) {
        return new amwi(this.c, b().tailMap(obj));
    }
}
