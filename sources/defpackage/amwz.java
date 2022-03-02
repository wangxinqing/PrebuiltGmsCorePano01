package defpackage;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* renamed from: amwz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
abstract class amwz extends AbstractCollection implements anfc {
    private transient Set a;
    private transient Set b;

    public int a(Object obj, int i) {
        throw null;
    }

    public abstract Iterator a();

    public final boolean add(Object obj) {
        b(obj, 1);
        return true;
    }

    public abstract Iterator b();

    public void b(Object obj, int i) {
        throw null;
    }

    public abstract int c();

    public boolean c(Object obj, int i) {
        throw null;
    }

    public final boolean contains(Object obj) {
        return a(obj) > 0;
    }

    public final Set d() {
        Set set = this.a;
        if (set != null) {
            return set;
        }
        anfe anfe = new anfe(this);
        this.a = anfe;
        return anfe;
    }

    public final Set e() {
        Set set = this.b;
        if (set != null) {
            return set;
        }
        anff anff = new anff(this);
        this.b = anff;
        return anff;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof anfc) {
            anfc anfc = (anfc) obj;
            if (size() == anfc.size() && e().size() == anfc.e().size()) {
                for (anfd anfd : anfc.e()) {
                    if (a(anfd.a) != anfd.a()) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return e().hashCode();
    }

    public final boolean isEmpty() {
        return e().isEmpty();
    }

    public final boolean remove(Object obj) {
        return a(obj, 1) > 0;
    }

    public final String toString() {
        return e().toString();
    }

    public final boolean addAll(Collection collection) {
        amrl.a((Object) this);
        amrl.a((Object) collection);
        if (collection instanceof anfc) {
            anfc anfc = (anfc) collection;
            if (anfc instanceof amwu) {
                amwu amwu = (amwu) anfc;
                if (amwu.isEmpty()) {
                    return false;
                }
                amrl.a((Object) this);
                for (int b2 = amwu.a.b(); b2 >= 0; b2 = amwu.a.b(b2)) {
                    b(amwu.a.c(b2), amwu.a.d(b2));
                }
                return true;
            } else if (anfc.isEmpty()) {
                return false;
            } else {
                for (anfd anfd : anfc.e()) {
                    b(anfd.a, anfd.a());
                }
                return true;
            }
        } else if (collection.isEmpty()) {
            return false;
        } else {
            return ance.a((Collection) this, collection.iterator());
        }
    }

    public final boolean removeAll(Collection collection) {
        if (collection instanceof anfc) {
            collection = ((anfc) collection).d();
        }
        return d().removeAll(collection);
    }

    public final boolean retainAll(Collection collection) {
        amrl.a((Object) collection);
        if (collection instanceof anfc) {
            collection = ((anfc) collection).d();
        }
        return d().retainAll(collection);
    }
}
