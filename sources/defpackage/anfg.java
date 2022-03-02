package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: anfg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class anfg implements Iterator {
    private final anfc a;
    private final Iterator b;
    private int c;
    private int d;
    private boolean e;
    private anfd f;

    public anfg(anfc anfc, Iterator it) {
        this.a = anfc;
        this.b = it;
    }

    public final boolean hasNext() {
        return this.c > 0 || this.b.hasNext();
    }

    public final Object next() {
        if (hasNext()) {
            int i = this.c;
            if (i == 0) {
                anfd anfd = (anfd) this.b.next();
                this.f = anfd;
                i = anfd.a();
                this.d = i;
            }
            this.c = i - 1;
            this.e = true;
            return this.f.a;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        amxg.a(this.e);
        if (this.d != 1) {
            this.a.remove(this.f.a);
        } else {
            this.b.remove();
        }
        this.d--;
        this.e = false;
    }
}
