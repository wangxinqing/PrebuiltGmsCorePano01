package defpackage;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: auen  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class auen implements Iterator {
    private final ArrayDeque a;
    private auau b;

    public auen(auay auay) {
        if (auay instanceof auep) {
            auep auep = (auep) auay;
            ArrayDeque arrayDeque = new ArrayDeque(auep.g);
            this.a = arrayDeque;
            arrayDeque.push(auep);
            int i = auep.h;
            this.b = a(auep.e);
            return;
        }
        this.a = null;
        this.b = (auau) auay;
    }

    private final auau a(auay auay) {
        while (auay instanceof auep) {
            auep auep = (auep) auay;
            this.a.push(auep);
            int i = auep.h;
            auay = auep.e;
        }
        return (auau) auay;
    }

    public final boolean hasNext() {
        return this.b != null;
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public final auau next() {
        auau auau;
        auau auau2 = this.b;
        if (auau2 != null) {
            do {
                ArrayDeque arrayDeque = this.a;
                auau = null;
                if (arrayDeque == null || arrayDeque.isEmpty()) {
                    this.b = auau;
                } else {
                    int i = auep.h;
                    auau = a(((auep) this.a.pop()).f);
                }
            } while (auau.j());
            this.b = auau;
            return auau2;
        }
        throw new NoSuchElementException();
    }
}
