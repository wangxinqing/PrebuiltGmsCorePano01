package defpackage;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* renamed from: amwh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
class amwh extends amwa implements SortedMap {
    SortedSet d;
    final /* synthetic */ amwq e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public amwh(amwq amwq, SortedMap sortedMap) {
        super(amwq, sortedMap);
        this.e = amwq;
    }

    public final Comparator comparator() {
        return g().comparator();
    }

    /* renamed from: e */
    public SortedSet h() {
        return new amwi(this.e, g());
    }

    /* renamed from: f */
    public SortedSet keySet() {
        SortedSet sortedSet = this.d;
        if (sortedSet != null) {
            return sortedSet;
        }
        SortedSet e2 = h();
        this.d = e2;
        return e2;
    }

    public final Object firstKey() {
        return g().firstKey();
    }

    public SortedMap g() {
        return (SortedMap) this.a;
    }

    public SortedMap headMap(Object obj) {
        return new amwh(this.e, g().headMap(obj));
    }

    public final Object lastKey() {
        return g().lastKey();
    }

    public SortedMap subMap(Object obj, Object obj2) {
        return new amwh(this.e, g().subMap(obj, obj2));
    }

    public SortedMap tailMap(Object obj) {
        return new amwh(this.e, g().tailMap(obj));
    }
}
