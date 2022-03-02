package defpackage;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.ConcurrentMap;

/* renamed from: amvb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class amvb extends AbstractCollection {
    final /* synthetic */ amvo a;
    private final ConcurrentMap b;

    public amvb(amvo amvo, ConcurrentMap concurrentMap) {
        this.a = amvo;
        this.b = concurrentMap;
    }

    public final void clear() {
        this.b.clear();
    }

    public final boolean contains(Object obj) {
        return this.b.containsValue(obj);
    }

    public final boolean isEmpty() {
        return this.b.isEmpty();
    }

    public final Iterator iterator() {
        return new amuz(this.a);
    }

    public final int size() {
        return this.b.size();
    }

    public final Object[] toArray() {
        return amvo.a((Collection) this).toArray();
    }

    public final Object[] toArray(Object[] objArr) {
        return amvo.a((Collection) this).toArray(objArr);
    }
}
