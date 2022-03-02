package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: amxs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class amxs implements Iterator {
    int a;
    int b;
    int c = -1;
    final /* synthetic */ amxt d;

    public amxs(amxt amxt) {
        this.d = amxt;
        amxt amxt2 = this.d;
        this.a = amxt2.b;
        this.b = amxt2.d();
    }

    private final void a() {
        if (this.d.b != this.a) {
            throw new ConcurrentModificationException();
        }
    }

    public final boolean hasNext() {
        return this.b >= 0;
    }

    public final Object next() {
        a();
        if (hasNext()) {
            int i = this.b;
            this.c = i;
            amxt amxt = this.d;
            Object obj = amxt.a[i];
            this.b = amxt.c(i);
            return obj;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        boolean z;
        a();
        if (this.c >= 0) {
            z = true;
        } else {
            z = false;
        }
        amxg.a(z);
        this.a += 32;
        amxt amxt = this.d;
        amxt.remove(amxt.a[this.c]);
        this.b--;
        this.c = -1;
    }
}
