package defpackage;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* renamed from: anhk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class anhk extends anhj implements ListIterator {
    private final int a;
    private int b;

    /* access modifiers changed from: protected */
    public abstract Object a(int i);

    @Deprecated
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final boolean hasNext() {
        return this.b < this.a;
    }

    public final boolean hasPrevious() {
        return this.b > 0;
    }

    public final Object next() {
        if (hasNext()) {
            int i = this.b;
            this.b = i + 1;
            return a(i);
        }
        throw new NoSuchElementException();
    }

    public final int nextIndex() {
        return this.b;
    }

    public final Object previous() {
        if (hasPrevious()) {
            int i = this.b - 1;
            this.b = i;
            return a(i);
        }
        throw new NoSuchElementException();
    }

    public final int previousIndex() {
        return this.b - 1;
    }

    @Deprecated
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }

    protected anhk(int i, int i2) {
        amrl.b(i2, i);
        this.a = i;
        this.b = i2;
    }
}
