package defpackage;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: ancx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ancx extends AbstractList implements RandomAccess, Serializable {
    private static final long serialVersionUID = 0;
    final List a;
    final amqy b;

    public ancx(List list, amqy amqy) {
        amrl.a((Object) list);
        this.a = list;
        amrl.a((Object) amqy);
        this.b = amqy;
    }

    public final void clear() {
        this.a.clear();
    }

    public final Object get(int i) {
        return this.b.a(this.a.get(i));
    }

    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    public final Iterator iterator() {
        return listIterator();
    }

    public final ListIterator listIterator(int i) {
        return new ancw(this, this.a.listIterator(i));
    }

    public final Object remove(int i) {
        return this.b.a(this.a.remove(i));
    }

    public final int size() {
        return this.a.size();
    }
}
