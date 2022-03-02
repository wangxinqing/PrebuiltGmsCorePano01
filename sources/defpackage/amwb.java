package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: amwb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
abstract class amwb implements Iterator {
    final Iterator a;
    Object b = null;
    Collection c = null;
    Iterator d = anca.a;
    final /* synthetic */ amwq e;

    public amwb(amwq amwq) {
        this.e = amwq;
        this.a = amwq.a.entrySet().iterator();
    }

    public abstract Object a(Object obj, Object obj2);

    public final boolean hasNext() {
        return this.a.hasNext() || this.d.hasNext();
    }

    public final Object next() {
        if (!this.d.hasNext()) {
            Map.Entry entry = (Map.Entry) this.a.next();
            this.b = entry.getKey();
            Collection collection = (Collection) entry.getValue();
            this.c = collection;
            this.d = collection.iterator();
        }
        return a(this.b, this.d.next());
    }

    public final void remove() {
        this.d.remove();
        if (this.c.isEmpty()) {
            this.a.remove();
        }
        amwq.b(this.e);
    }
}
