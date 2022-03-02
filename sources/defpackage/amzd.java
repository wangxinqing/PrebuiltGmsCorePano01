package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: amzd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class amzd implements Iterator {
    final /* synthetic */ amze a;
    private int b;
    private int c = -1;
    private int d;
    private int e;

    public amzd(amze amze) {
        this.a = amze;
        amzf amzf = this.a.b;
        this.b = amzf.e;
        this.d = amzf.d;
        this.e = amzf.c;
    }

    private final void a() {
        if (this.a.b.d != this.d) {
            throw new ConcurrentModificationException();
        }
    }

    public final boolean hasNext() {
        a();
        return this.b != -2 && this.e > 0;
    }

    public final Object next() {
        if (hasNext()) {
            Object a2 = this.a.a(this.b);
            int i = this.b;
            this.c = i;
            this.b = this.a.b.f[i];
            this.e--;
            return a2;
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
        amzf amzf = this.a.b;
        int i = this.c;
        amzf.a(i, amzi.a(amzf.a[i]));
        int i2 = this.b;
        amzf amzf2 = this.a.b;
        if (i2 == amzf2.c) {
            this.b = this.c;
        }
        this.c = -1;
        this.d = amzf2.d;
    }
}
