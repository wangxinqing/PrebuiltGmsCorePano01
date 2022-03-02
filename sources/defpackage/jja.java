package defpackage;

import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* renamed from: jja  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class jja implements ListIterator {
    final /* synthetic */ jjb a;
    private final int b;
    private long c;
    private int d;
    private int e = 0;

    public jja(jjb jjb) {
        this.a = jjb;
        this.b = jjb.h;
        this.c = jjb.i;
        this.d = jjb.c();
    }

    private final void a() {
        if (this.b != this.a.h) {
            throw new ConcurrentModificationException();
        }
    }

    public final /* bridge */ /* synthetic */ void add(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }

    public final boolean hasNext() {
        return this.e < this.a.g;
    }

    public final boolean hasPrevious() {
        return this.e > 0;
    }

    public final int nextIndex() {
        throw new UnsupportedOperationException();
    }

    public final int previousIndex() {
        throw new UnsupportedOperationException();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public final /* bridge */ /* synthetic */ void set(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        a();
        if (hasNext()) {
            int i = this.a.f[this.d];
            int d2 = jjb.d(i);
            long j = this.c + ((long) d2);
            do {
                this.c += (long) d2;
                int b2 = this.a.b(this.d);
                this.d = b2;
                this.e++;
                d2 = jjb.d(this.a.f[b2]);
            } while (d2 == jjb.e);
            return this.a.a(j * jjb.a, jjb.e(i), jjb.f(i));
        }
        throw new NoSuchElementException();
    }

    public final /* bridge */ /* synthetic */ Object previous() {
        a();
        while (hasPrevious()) {
            int c2 = this.a.c(this.d - 1);
            this.d = c2;
            this.e--;
            int i = this.a.f[c2];
            long j = this.c;
            int d2 = jjb.d(i);
            this.c -= (long) d2;
            if (d2 != jjb.e) {
                return this.a.a(j * jjb.a, jjb.e(i), jjb.f(i));
            }
        }
        throw new NoSuchElementException();
    }
}
