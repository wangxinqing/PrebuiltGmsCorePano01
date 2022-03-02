package defpackage;

import java.util.Iterator;

/* renamed from: amqq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class amqq implements Iterator {
    final /* synthetic */ amqr a;
    private final Iterator b = this.a.a.iterator();

    public amqq(amqr amqr) {
        this.a = amqr;
    }

    public final boolean hasNext() {
        return this.b.hasNext();
    }

    public final Object next() {
        return this.a.b.d(this.b.next());
    }

    public final void remove() {
        this.b.remove();
    }
}
