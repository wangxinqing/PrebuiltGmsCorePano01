package defpackage;

import java.util.Iterator;

/* renamed from: anhh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
abstract class anhh implements Iterator {
    final Iterator b;

    public anhh(Iterator it) {
        amrl.a((Object) it);
        this.b = it;
    }

    public abstract Object a(Object obj);

    public final boolean hasNext() {
        return this.b.hasNext();
    }

    public final Object next() {
        return a(this.b.next());
    }

    public final void remove() {
        this.b.remove();
    }
}
