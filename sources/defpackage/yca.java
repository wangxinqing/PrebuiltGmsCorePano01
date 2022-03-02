package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: yca  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class yca implements Iterable, Iterator {
    public final boolean hasNext() {
        return false;
    }

    public final Iterator iterator() {
        return this;
    }

    public final Object next() {
        throw new NoSuchElementException();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
