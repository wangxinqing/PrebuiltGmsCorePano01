package defpackage;

import java.util.Iterator;

/* renamed from: anap  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class anap extends anhj {
    final Iterator a = this.c.b.values().iterator();
    Iterator b = anby.a;
    final /* synthetic */ anau c;

    public anap(anau anau) {
        this.c = anau;
    }

    public final boolean hasNext() {
        return this.b.hasNext() || this.a.hasNext();
    }

    public final Object next() {
        if (!this.b.hasNext()) {
            this.b = ((amzn) this.a.next()).iterator();
        }
        return this.b.next();
    }
}
