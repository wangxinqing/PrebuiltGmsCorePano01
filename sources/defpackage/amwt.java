package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: amwt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
abstract class amwt implements Iterator {
    int b = this.e.a.b();
    int c = -1;
    int d = this.e.a.d;
    final /* synthetic */ amwu e;

    public amwt(amwu amwu) {
        this.e = amwu;
    }

    private final void a() {
        if (this.e.a.d != this.d) {
            throw new ConcurrentModificationException();
        }
    }

    public abstract Object a(int i);

    public final boolean hasNext() {
        a();
        return this.b >= 0;
    }

    public final Object next() {
        if (hasNext()) {
            Object a = a(this.b);
            int i = this.b;
            this.c = i;
            this.b = this.e.a.b(i);
            return a;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        boolean z;
        a();
        if (this.c != -1) {
            z = true;
        } else {
            z = false;
        }
        amxg.a(z);
        amwu amwu = this.e;
        amwu.b -= (long) amwu.a.e(this.c);
        anfj anfj = this.e.a;
        this.b--;
        this.c = -1;
        this.d = anfj.d;
    }
}
