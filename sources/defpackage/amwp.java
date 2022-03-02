package defpackage;

import java.util.Comparator;
import java.util.SortedSet;

/* renamed from: amwp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
class amwp extends amwk implements SortedSet {
    final /* synthetic */ amwq g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public amwp(amwq amwq, Object obj, SortedSet sortedSet, amwk amwk) {
        super(amwq, obj, sortedSet, amwk);
        this.g = amwq;
    }

    public final Comparator comparator() {
        return e().comparator();
    }

    public SortedSet e() {
        return (SortedSet) this.b;
    }

    public final Object first() {
        a();
        return e().first();
    }

    public final SortedSet headSet(Object obj) {
        a();
        amwq amwq = this.g;
        Object obj2 = this.a;
        SortedSet headSet = e().headSet(obj);
        amwk amwk = this.c;
        if (amwk == null) {
            amwk = this;
        }
        return new amwp(amwq, obj2, headSet, amwk);
    }

    public final Object last() {
        a();
        return e().last();
    }

    public final SortedSet subSet(Object obj, Object obj2) {
        a();
        amwq amwq = this.g;
        Object obj3 = this.a;
        SortedSet subSet = e().subSet(obj, obj2);
        amwk amwk = this.c;
        if (amwk == null) {
            amwk = this;
        }
        return new amwp(amwq, obj3, subSet, amwk);
    }

    public final SortedSet tailSet(Object obj) {
        a();
        amwq amwq = this.g;
        Object obj2 = this.a;
        SortedSet tailSet = e().tailSet(obj);
        amwk amwk = this.c;
        if (amwk == null) {
            amwk = this;
        }
        return new amwp(amwq, obj2, tailSet, amwk);
    }
}
