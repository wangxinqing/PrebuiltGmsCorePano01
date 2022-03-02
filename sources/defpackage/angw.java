package defpackage;

import java.util.Collection;
import java.util.Iterator;

/* renamed from: angw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
class angw extends anhb implements Collection {
    private static final long serialVersionUID = 0;

    public angw(Collection collection, Object obj) {
        super(collection, obj);
    }

    public Collection a() {
        return (Collection) this.f;
    }

    public final boolean add(Object obj) {
        boolean add;
        synchronized (this.g) {
            add = a().add(obj);
        }
        return add;
    }

    public final boolean addAll(Collection collection) {
        boolean addAll;
        synchronized (this.g) {
            addAll = a().addAll(collection);
        }
        return addAll;
    }

    public final void clear() {
        synchronized (this.g) {
            a().clear();
        }
    }

    public boolean contains(Object obj) {
        boolean contains;
        synchronized (this.g) {
            contains = a().contains(obj);
        }
        return contains;
    }

    public boolean containsAll(Collection collection) {
        boolean containsAll;
        synchronized (this.g) {
            containsAll = a().containsAll(collection);
        }
        return containsAll;
    }

    public final boolean isEmpty() {
        boolean isEmpty;
        synchronized (this.g) {
            isEmpty = a().isEmpty();
        }
        return isEmpty;
    }

    public Iterator iterator() {
        return a().iterator();
    }

    public boolean remove(Object obj) {
        boolean remove;
        synchronized (this.g) {
            remove = a().remove(obj);
        }
        return remove;
    }

    public boolean removeAll(Collection collection) {
        boolean removeAll;
        synchronized (this.g) {
            removeAll = a().removeAll(collection);
        }
        return removeAll;
    }

    public boolean retainAll(Collection collection) {
        boolean retainAll;
        synchronized (this.g) {
            retainAll = a().retainAll(collection);
        }
        return retainAll;
    }

    public final int size() {
        int size;
        synchronized (this.g) {
            size = a().size();
        }
        return size;
    }

    public Object[] toArray() {
        Object[] array;
        synchronized (this.g) {
            array = a().toArray();
        }
        return array;
    }

    public Object[] toArray(Object[] objArr) {
        Object[] array;
        synchronized (this.g) {
            array = a().toArray(objArr);
        }
        return array;
    }
}
