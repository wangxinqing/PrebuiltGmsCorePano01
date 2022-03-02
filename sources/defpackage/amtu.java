package defpackage;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.concurrent.ConcurrentMap;

/* renamed from: amtu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
abstract class amtu extends AbstractSet {
    final ConcurrentMap a;

    public amtu(ConcurrentMap concurrentMap) {
        this.a = concurrentMap;
    }

    public final void clear() {
        this.a.clear();
    }

    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    public final int size() {
        return this.a.size();
    }

    public final Object[] toArray() {
        return amvo.a((Collection) this).toArray();
    }

    public final Object[] toArray(Object[] objArr) {
        return amvo.a((Collection) this).toArray(objArr);
    }
}
