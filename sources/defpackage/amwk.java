package defpackage;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* renamed from: amwk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
class amwk extends AbstractCollection {
    final Object a;
    Collection b;
    final amwk c;
    final Collection d;
    final /* synthetic */ amwq e;

    public amwk(amwq amwq, Object obj, Collection collection, amwk amwk) {
        this.e = amwq;
        this.a = obj;
        this.b = collection;
        this.c = amwk;
        this.d = amwk != null ? amwk.b : null;
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        Collection collection;
        amwk amwk = this.c;
        if (amwk != null) {
            amwk.a();
            if (this.c.b != this.d) {
                throw new ConcurrentModificationException();
            }
        } else if (this.b.isEmpty() && (collection = (Collection) this.e.a.get(this.a)) != null) {
            this.b = collection;
        }
    }

    public final boolean add(Object obj) {
        a();
        boolean isEmpty = this.b.isEmpty();
        boolean add = this.b.add(obj);
        if (!add) {
            return add;
        }
        amwq.a(this.e);
        if (!isEmpty) {
            return add;
        }
        c();
        return true;
    }

    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = this.b.addAll(collection);
        if (!addAll) {
            return addAll;
        }
        amwq.a(this.e, this.b.size() - size);
        if (size != 0) {
            return addAll;
        }
        c();
        return true;
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        amwk amwk = this.c;
        if (amwk != null) {
            amwk.b();
        } else if (this.b.isEmpty()) {
            this.e.a.remove(this.a);
        }
    }

    /* access modifiers changed from: package-private */
    public final void c() {
        amwk amwk = this.c;
        if (amwk == null) {
            this.e.a.put(this.a, this.b);
        } else {
            amwk.c();
        }
    }

    public final void clear() {
        int size = size();
        if (size != 0) {
            this.b.clear();
            amwq.b(this.e, size);
            b();
        }
    }

    public final boolean contains(Object obj) {
        a();
        return this.b.contains(obj);
    }

    public final boolean containsAll(Collection collection) {
        a();
        return this.b.containsAll(collection);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        a();
        return this.b.equals(obj);
    }

    public final int hashCode() {
        a();
        return this.b.hashCode();
    }

    public final Iterator iterator() {
        a();
        return new amwj(this);
    }

    public final boolean remove(Object obj) {
        a();
        boolean remove = this.b.remove(obj);
        if (remove) {
            amwq.b(this.e);
            b();
        }
        return remove;
    }

    public boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean removeAll = this.b.removeAll(collection);
        if (removeAll) {
            amwq.a(this.e, this.b.size() - size);
            b();
        }
        return removeAll;
    }

    public final boolean retainAll(Collection collection) {
        amrl.a((Object) collection);
        int size = size();
        boolean retainAll = this.b.retainAll(collection);
        if (retainAll) {
            amwq.a(this.e, this.b.size() - size);
            b();
        }
        return retainAll;
    }

    public final int size() {
        a();
        return this.b.size();
    }

    public final String toString() {
        a();
        return this.b.toString();
    }
}
