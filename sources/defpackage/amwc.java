package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: amwc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class amwc implements Iterator {
    Map.Entry a;
    final /* synthetic */ Iterator b;
    final /* synthetic */ amwd c;

    public amwc(amwd amwd, Iterator it) {
        this.c = amwd;
        this.b = it;
    }

    public final boolean hasNext() {
        return this.b.hasNext();
    }

    public final Object next() {
        Map.Entry entry = (Map.Entry) this.b.next();
        this.a = entry;
        return entry.getKey();
    }

    public final void remove() {
        amxg.a(this.a != null);
        Collection collection = (Collection) this.a.getValue();
        this.b.remove();
        amwq.b(this.c.a, collection.size());
        collection.clear();
        this.a = null;
    }
}
