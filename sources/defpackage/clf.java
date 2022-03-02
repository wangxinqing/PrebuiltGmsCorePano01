package defpackage;

import android.util.SparseArray;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: clf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class clf implements Iterator {
    private final SparseArray a;
    private final int b;
    private int c = 0;

    public clf(SparseArray sparseArray) {
        this.a = sparseArray;
        this.b = sparseArray.size();
    }

    public final boolean hasNext() {
        if (this.b == this.a.size()) {
            return this.c < this.b;
        }
        throw new ConcurrentModificationException();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        if (this.b != this.a.size()) {
            throw new ConcurrentModificationException();
        } else if (hasNext()) {
            int keyAt = this.a.keyAt(this.c);
            this.c++;
            return Integer.valueOf(keyAt);
        } else {
            throw new NoSuchElementException();
        }
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
