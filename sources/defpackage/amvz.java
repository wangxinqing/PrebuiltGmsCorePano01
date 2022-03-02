package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: amvz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class amvz implements Iterator {
    final Iterator a = this.c.a.entrySet().iterator();
    Collection b;
    final /* synthetic */ amwa c;

    public amvz(amwa amwa) {
        this.c = amwa;
    }

    public final boolean hasNext() {
        return this.a.hasNext();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry) this.a.next();
        this.b = (Collection) entry.getValue();
        return this.c.a(entry);
    }

    public final void remove() {
        amxg.a(this.b != null);
        this.a.remove();
        amwq.b(this.c.b, this.b.size());
        this.b.clear();
        this.b = null;
    }
}
