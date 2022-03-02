package defpackage;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;

/* renamed from: argu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class argu implements Collection {
    public boolean add(Object obj) {
        throw new UnsupportedOperationException("Abstract implementation does not support adds.");
    }

    public final boolean addAll(Collection collection) {
        boolean z = false;
        for (Object add : collection) {
            if (add(add)) {
                z = true;
            }
        }
        return z;
    }

    public boolean contains(Object obj) {
        argv e = iterator();
        while (e.hasNext()) {
            if (e.next().equals(obj)) {
                return true;
            }
        }
        return false;
    }

    public boolean containsAll(Collection collection) {
        for (Object contains : collection) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: e */
    public abstract argv iterator();

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Collection) {
            Collection collection = (Collection) obj;
            if (collection.size() == size()) {
                return containsAll(collection);
            }
        }
        return false;
    }

    public int hashCode() {
        argv e = iterator();
        int i = 0;
        while (e.hasNext()) {
            i += e.next().hashCode();
        }
        return i;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public boolean remove(Object obj) {
        argv e = iterator();
        while (e.hasNext()) {
            if (e.next().equals(obj)) {
                e.remove();
                return true;
            }
        }
        return false;
    }

    public boolean removeAll(Collection collection) {
        boolean z = false;
        if (size() > collection.size()) {
            for (Object remove : collection) {
                if (remove(remove)) {
                    z = true;
                }
            }
        } else {
            argv e = iterator();
            while (e.hasNext()) {
                if (collection.contains(e.next())) {
                    e.remove();
                    z = true;
                }
            }
        }
        return z;
    }

    public boolean retainAll(Collection collection) {
        argv e = iterator();
        boolean z = false;
        while (e.hasNext()) {
            if (!collection.contains(e.next())) {
                e.remove();
                z = true;
            }
        }
        return z;
    }

    public abstract int size();

    public Object[] toArray() {
        return toArray(new Object[size()]);
    }

    public String toString() {
        if (isEmpty()) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        argv e = iterator();
        while (true) {
            Object next = e.next();
            if (next == this) {
                next = "(this Collection)";
            }
            sb.append(next);
            if (e.hasNext()) {
                sb.append(", ");
            } else {
                sb.append(']');
                return sb.toString();
            }
        }
    }

    public Object[] toArray(Object[] objArr) {
        int size = size();
        if (objArr.length < size) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), size);
        }
        try {
            argv e = iterator();
            int i = 0;
            while (e.hasNext()) {
                objArr[i] = e.next();
                i++;
            }
            Arrays.fill(objArr, i, objArr.length, (Object) null);
            return objArr;
        } catch (ClassCastException e2) {
            throw new ArrayStoreException(e2.getMessage());
        }
    }
}
