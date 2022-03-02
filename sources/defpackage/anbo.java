package defpackage;

import java.util.Iterator;

/* renamed from: anbo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class anbo implements Iterator {
    boolean a = true;
    final /* synthetic */ Iterator b;

    public anbo(Iterator it) {
        this.b = it;
    }

    public final boolean hasNext() {
        return this.b.hasNext();
    }

    public final Object next() {
        Object next = this.b.next();
        this.a = false;
        return next;
    }

    public final void remove() {
        amxg.a(!this.a);
        this.b.remove();
    }
}
