package defpackage;

import java.util.Iterator;

/* renamed from: aufi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aufi implements Iterator {
    final Iterator a = this.b.a.iterator();
    final /* synthetic */ aufj b;

    public aufi(aufj aufj) {
        this.b = aufj;
    }

    public final boolean hasNext() {
        return this.a.hasNext();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.a.next();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
