package defpackage;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

/* renamed from: amwj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
class amwj implements Iterator {
    final Iterator a;
    final Collection b = this.c.b;
    final /* synthetic */ amwk c;

    public amwj(amwk amwk) {
        this.c = amwk;
        Collection collection = amwk.b;
        this.a = collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        this.c.a();
        if (this.c.b != this.b) {
            throw new ConcurrentModificationException();
        }
    }

    public final boolean hasNext() {
        a();
        return this.a.hasNext();
    }

    public final Object next() {
        a();
        return this.a.next();
    }

    public final void remove() {
        this.a.remove();
        amwq.b(this.c.e);
        this.c.b();
    }

    public amwj(amwk amwk, Iterator it) {
        this.c = amwk;
        this.a = it;
    }
}
