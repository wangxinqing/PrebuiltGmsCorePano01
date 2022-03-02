package defpackage;

import com.google.android.gms.measurement.internal.EventParams;
import java.util.Iterator;

/* renamed from: spq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class spq implements Iterator {
    final Iterator a = this.b.a.keySet().iterator();
    final /* synthetic */ EventParams b;

    public spq(EventParams eventParams) {
        this.b = eventParams;
    }

    public final boolean hasNext() {
        return this.a.hasNext();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.a.next();
    }

    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }
}
