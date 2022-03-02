package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: ili  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ili implements Iterator {
    protected final ilh a;
    protected int b = -1;

    public ili(ilh ilh) {
        iva.a((Object) ilh);
        this.a = ilh;
    }

    public final boolean hasNext() {
        return this.b < this.a.a() + -1;
    }

    public final Object next() {
        if (hasNext()) {
            ilh ilh = this.a;
            int i = this.b + 1;
            this.b = i;
            return ilh.a(i);
        }
        int i2 = this.b;
        StringBuilder sb = new StringBuilder(46);
        sb.append("Cannot advance the iterator beyond ");
        sb.append(i2);
        throw new NoSuchElementException(sb.toString());
    }

    public final void remove() {
        throw new UnsupportedOperationException("Cannot remove elements from a DataBufferIterator");
    }
}
