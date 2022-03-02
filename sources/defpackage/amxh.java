package defpackage;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: amxh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class amxh extends AbstractCollection {
    final Collection a;
    final amrm b;

    public amxh(Collection collection, amrm amrm) {
        this.a = collection;
        this.b = amrm;
    }

    public final boolean add(Object obj) {
        amrl.a(this.b.a(obj));
        return this.a.add(obj);
    }

    public final boolean addAll(Collection collection) {
        for (Object a2 : collection) {
            amrl.a(this.b.a(a2));
        }
        return this.a.addAll(collection);
    }

    public final void clear() {
        anbs.f(this.a, this.b);
    }

    public final boolean contains(Object obj) {
        if (amxi.a(this.a, obj)) {
            return this.b.a(obj);
        }
        return false;
    }

    public final boolean containsAll(Collection collection) {
        return amxi.a((Collection) this, collection);
    }

    public final boolean isEmpty() {
        return !anbs.b((Iterable) this.a, this.b);
    }

    public final Iterator iterator() {
        return ance.a(this.a.iterator(), this.b);
    }

    public final boolean remove(Object obj) {
        return contains(obj) && this.a.remove(obj);
    }

    public final boolean removeAll(Collection collection) {
        Iterator it = this.a.iterator();
        boolean z = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.b.a(next) && collection.contains(next)) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    public final boolean retainAll(Collection collection) {
        Iterator it = this.a.iterator();
        boolean z = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.b.a(next) && !collection.contains(next)) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    public final int size() {
        int i = 0;
        for (Object a2 : this.a) {
            if (this.b.a(a2)) {
                i++;
            }
        }
        return i;
    }

    public final Object[] toArray() {
        return anda.a(iterator()).toArray();
    }

    public final Object[] toArray(Object[] objArr) {
        return anda.a(iterator()).toArray(objArr);
    }
}
