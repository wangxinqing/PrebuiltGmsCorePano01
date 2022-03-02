package defpackage;

import java.util.Iterator;

/* renamed from: alyt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class alyt implements Iterator {
    int a = 0;
    final /* synthetic */ alyu b;

    public alyt(alyu alyu) {
        this.b = alyu;
    }

    public final boolean hasNext() {
        return this.a < this.b.b;
    }

    public final Object next() {
        Object[] objArr = this.b.a;
        int i = this.a;
        this.a = i + 1;
        return objArr[i];
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
