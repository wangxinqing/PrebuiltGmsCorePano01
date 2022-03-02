package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: amwd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
class amwd extends aneq {
    final /* synthetic */ amwq a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public amwd(amwq amwq, Map map) {
        super(map);
        this.a = amwq;
    }

    public final void clear() {
        ance.f(iterator());
    }

    public final boolean containsAll(Collection collection) {
        return this.d.keySet().containsAll(collection);
    }

    public final boolean equals(Object obj) {
        return this == obj || this.d.keySet().equals(obj);
    }

    public final int hashCode() {
        return this.d.keySet().hashCode();
    }

    public final Iterator iterator() {
        return new amwc(this, this.d.entrySet().iterator());
    }

    public final boolean remove(Object obj) {
        Collection collection = (Collection) this.d.remove(obj);
        if (collection == null) {
            return false;
        }
        int size = collection.size();
        collection.clear();
        amwq.b(this.a, size);
        return size > 0;
    }
}
