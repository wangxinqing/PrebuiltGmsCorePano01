package defpackage;

import java.util.ListIterator;

/* renamed from: anhi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
abstract class anhi extends anhh implements ListIterator {
    public anhi(ListIterator listIterator) {
        super(listIterator);
    }

    private final ListIterator a() {
        return (ListIterator) this.b;
    }

    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final boolean hasPrevious() {
        return a().hasPrevious();
    }

    public final int nextIndex() {
        return a().nextIndex();
    }

    public final Object previous() {
        return a(a().previous());
    }

    public final int previousIndex() {
        return a().previousIndex();
    }

    public void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
