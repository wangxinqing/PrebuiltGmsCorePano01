package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: angt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class angt extends anhd {
    private static final long serialVersionUID = 0;

    public angt(Set set, Object obj) {
        super(set, obj);
    }

    public final boolean contains(Object obj) {
        boolean z;
        synchronized (this.g) {
            Set b = a();
            if (obj instanceof Map.Entry) {
                z = b.contains(anet.a((Map.Entry) obj));
            } else {
                z = false;
            }
        }
        return z;
    }

    public final boolean containsAll(Collection collection) {
        boolean a;
        synchronized (this.g) {
            a = amxi.a((Collection) a(), collection);
        }
        return a;
    }

    public final boolean equals(Object obj) {
        boolean a;
        if (obj == this) {
            return true;
        }
        synchronized (this.g) {
            a = angm.a(a(), obj);
        }
        return a;
    }

    public final Iterator iterator() {
        return new angs(this, super.iterator());
    }

    public final boolean remove(Object obj) {
        boolean z;
        synchronized (this.g) {
            Set b = a();
            if (obj instanceof Map.Entry) {
                z = b.remove(anet.a((Map.Entry) obj));
            } else {
                z = false;
            }
        }
        return z;
    }

    public final boolean removeAll(Collection collection) {
        boolean a;
        synchronized (this.g) {
            a = ance.a(a().iterator(), collection);
        }
        return a;
    }

    public final boolean retainAll(Collection collection) {
        boolean z;
        synchronized (this.g) {
            Iterator it = a().iterator();
            amrl.a((Object) collection);
            z = false;
            while (it.hasNext()) {
                if (!collection.contains(it.next())) {
                    it.remove();
                    z = true;
                }
            }
        }
        return z;
    }

    public final Object[] toArray() {
        Object[] objArr;
        synchronized (this.g) {
            Set b = a();
            objArr = new Object[b.size()];
            anfi.a((Iterable) b, objArr);
        }
        return objArr;
    }

    public final Object[] toArray(Object[] objArr) {
        synchronized (this.g) {
            Set b = a();
            int size = b.size();
            if (objArr.length < size) {
                objArr = anfl.a(objArr, size);
            }
            anfi.a((Iterable) b, objArr);
            if (objArr.length > size) {
                objArr[size] = null;
            }
        }
        return objArr;
    }
}
