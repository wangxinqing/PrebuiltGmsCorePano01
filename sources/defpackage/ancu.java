package defpackage;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* renamed from: ancu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ancu implements ListIterator {
    boolean a;
    final /* synthetic */ ListIterator b;
    final /* synthetic */ ancv c;

    public ancu(ancv ancv, ListIterator listIterator) {
        this.c = ancv;
        this.b = listIterator;
    }

    public final void add(Object obj) {
        this.b.add(obj);
        this.b.previous();
        this.a = false;
    }

    public final boolean hasNext() {
        return this.b.hasPrevious();
    }

    public final boolean hasPrevious() {
        return this.b.hasNext();
    }

    public final Object next() {
        if (hasNext()) {
            this.a = true;
            return this.b.previous();
        }
        throw new NoSuchElementException();
    }

    public final int nextIndex() {
        return this.c.a(this.b.nextIndex());
    }

    public final Object previous() {
        if (hasPrevious()) {
            this.a = true;
            return this.b.next();
        }
        throw new NoSuchElementException();
    }

    public final int previousIndex() {
        return nextIndex() - 1;
    }

    public final void remove() {
        amxg.a(this.a);
        this.b.remove();
        this.a = false;
    }

    public final void set(Object obj) {
        amrl.b(this.a);
        this.b.set(obj);
    }
}
