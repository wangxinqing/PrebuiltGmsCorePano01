package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: amxn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
abstract class amxn implements Iterator {
    int b;
    int c;
    int d = -1;
    final /* synthetic */ amxr e;

    public amxn(amxr amxr) {
        this.e = amxr;
        amxr amxr2 = this.e;
        this.b = amxr2.f;
        this.c = amxr2.h();
    }

    private final void a() {
        if (this.e.f != this.b) {
            throw new ConcurrentModificationException();
        }
    }

    public abstract Object a(int i);

    public final boolean hasNext() {
        return this.c >= 0;
    }

    public final Object next() {
        a();
        if (hasNext()) {
            int i = this.c;
            this.d = i;
            Object a = a(i);
            this.c = this.e.e(this.c);
            return a;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        boolean z;
        a();
        if (this.d >= 0) {
            z = true;
        } else {
            z = false;
        }
        amxg.a(z);
        this.b += 32;
        amxr amxr = this.e;
        amxr.remove(amxr.d[this.d]);
        this.c = this.e.b(this.c, this.d);
        this.d = -1;
    }
}
