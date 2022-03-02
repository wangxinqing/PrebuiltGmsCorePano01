package defpackage;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: anbz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class anbz implements Iterator {
    private Iterator a;
    private Iterator b = anby.a;
    private Iterator c;
    private Deque d;

    public anbz(Iterator it) {
        amrl.a((Object) it);
        this.c = it;
    }

    public final boolean hasNext() {
        Iterator it;
        while (true) {
            Iterator it2 = this.b;
            amrl.a((Object) it2);
            if (it2.hasNext()) {
                return true;
            }
            while (true) {
                Iterator it3 = this.c;
                it = null;
                if (it3 == null || !it3.hasNext()) {
                    Deque deque = this.d;
                    if (deque == null || deque.isEmpty()) {
                        break;
                    }
                    this.c = (Iterator) this.d.removeFirst();
                } else {
                    it = this.c;
                    break;
                }
            }
            this.c = it;
            if (it == null) {
                return false;
            }
            Iterator it4 = (Iterator) it.next();
            this.b = it4;
            if (it4 instanceof anbz) {
                anbz anbz = (anbz) it4;
                this.b = anbz.b;
                if (this.d == null) {
                    this.d = new ArrayDeque();
                }
                this.d.addFirst(this.c);
                if (anbz.d != null) {
                    while (!anbz.d.isEmpty()) {
                        this.d.addFirst((Iterator) anbz.d.removeLast());
                    }
                }
                this.c = anbz.c;
            }
        }
    }

    public final Object next() {
        if (hasNext()) {
            Iterator it = this.b;
            this.a = it;
            return it.next();
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        amxg.a(this.a != null);
        this.a.remove();
        this.a = null;
    }
}
