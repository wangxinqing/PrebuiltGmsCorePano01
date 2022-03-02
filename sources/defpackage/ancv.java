package defpackage;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* renamed from: ancv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
class ancv extends AbstractList {
    public final List a;

    public ancv(List list) {
        amrl.a((Object) list);
        this.a = list;
    }

    private final int b(int i) {
        int size = size();
        amrl.a(i, size);
        return (size - 1) - i;
    }

    public final int a(int i) {
        int size = size();
        amrl.b(i, size);
        return size - i;
    }

    public final void add(int i, Object obj) {
        this.a.add(a(i), obj);
    }

    public final void clear() {
        this.a.clear();
    }

    public final Object get(int i) {
        return this.a.get(b(i));
    }

    public final Iterator iterator() {
        return listIterator();
    }

    public final ListIterator listIterator(int i) {
        return new ancu(this, this.a.listIterator(a(i)));
    }

    public final Object remove(int i) {
        return this.a.remove(b(i));
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        subList(i, i2).clear();
    }

    public final Object set(int i, Object obj) {
        return this.a.set(b(i), obj);
    }

    public final int size() {
        return this.a.size();
    }

    public final List subList(int i, int i2) {
        amrl.a(i, i2, size());
        return anda.a(this.a.subList(a(i2), a(i)));
    }
}
