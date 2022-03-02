package defpackage;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: andy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class andy extends AbstractCollection {
    final /* synthetic */ anej a;

    public andy(anej anej) {
        this.a = anej;
    }

    public final void clear() {
        this.a.clear();
    }

    public final boolean contains(Object obj) {
        return this.a.containsValue(obj);
    }

    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    public final Iterator iterator() {
        return new andx(this.a);
    }

    public final int size() {
        return this.a.size();
    }

    public final Object[] toArray() {
        return anej.a((Collection) this).toArray();
    }

    public final Object[] toArray(Object[] objArr) {
        return anej.a((Collection) this).toArray(objArr);
    }
}
