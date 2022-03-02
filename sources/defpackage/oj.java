package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: oj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class oj implements Iterator {
    final int a;
    int b;
    int c;
    boolean d = false;
    final /* synthetic */ oo e;

    public oj(oo ooVar, int i) {
        this.e = ooVar;
        this.a = i;
        this.b = ooVar.a();
    }

    public final boolean hasNext() {
        return this.c < this.b;
    }

    public final Object next() {
        if (hasNext()) {
            Object a2 = this.e.a(this.c, this.a);
            this.c++;
            this.d = true;
            return a2;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        if (this.d) {
            int i = this.c - 1;
            this.c = i;
            this.b--;
            this.d = false;
            this.e.a(i);
            return;
        }
        throw new IllegalStateException();
    }
}
