package defpackage;

import java.util.NoSuchElementException;

/* renamed from: pxj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class pxj implements pws {
    private final pws a;
    private final pws b;

    public pxj(pws pws, pws pws2) {
        iva.a((Object) pws);
        iva.a((Object) pws2);
        this.a = pws;
        this.b = pws2;
    }

    public final void close() {
        this.a.close();
        this.b.close();
    }

    public final boolean hasNext() {
        return this.a.hasNext() || this.b.hasNext();
    }

    public final Object next() {
        if (this.a.hasNext()) {
            return this.a.next();
        }
        if (this.b.hasNext()) {
            return this.b.next();
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
