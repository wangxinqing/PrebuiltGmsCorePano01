package defpackage;

import java.util.Iterator;
import java.util.NavigableSet;

/* renamed from: amwn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class amwn extends amwp implements NavigableSet {
    final /* synthetic */ amwq f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public amwn(amwq amwq, Object obj, NavigableSet navigableSet, amwk amwk) {
        super(amwq, obj, navigableSet, amwk);
        this.f = amwq;
    }

    private final NavigableSet a(NavigableSet navigableSet) {
        amwq amwq = this.f;
        Object obj = this.a;
        amwk amwk = this.c;
        if (amwk == null) {
            amwk = this;
        }
        return new amwn(amwq, obj, navigableSet, amwk);
    }

    public final Object ceiling(Object obj) {
        return e().ceiling(obj);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final NavigableSet e() {
        return (NavigableSet) super.e();
    }

    public final Iterator descendingIterator() {
        return new amwj(this, e().descendingIterator());
    }

    public final NavigableSet descendingSet() {
        return a(e().descendingSet());
    }

    public final Object floor(Object obj) {
        return e().floor(obj);
    }

    public final NavigableSet headSet(Object obj, boolean z) {
        return a(e().headSet(obj, z));
    }

    public final Object higher(Object obj) {
        return e().higher(obj);
    }

    public final Object lower(Object obj) {
        return e().lower(obj);
    }

    public final Object pollFirst() {
        return ance.e(iterator());
    }

    public final Object pollLast() {
        return ance.e(descendingIterator());
    }

    public final NavigableSet subSet(Object obj, boolean z, Object obj2, boolean z2) {
        return a(e().subSet(obj, z, obj2, z2));
    }

    public final NavigableSet tailSet(Object obj, boolean z) {
        return a(e().tailSet(obj, z));
    }
}
