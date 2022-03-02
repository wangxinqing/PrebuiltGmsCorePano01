package defpackage;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;

/* renamed from: amzn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class amzn extends AbstractCollection implements Serializable {
    private static final Object[] Du = new Object[0];

    public int a(Object[] objArr, int i) {
        anhj a = iterator();
        while (a.hasNext()) {
            objArr[i] = a.next();
            i++;
        }
        return i;
    }

    /* renamed from: a */
    public abstract anhj iterator();

    @Deprecated
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public Object[] b() {
        return null;
    }

    public int c() {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public abstract boolean contains(Object obj);

    public int d() {
        throw new UnsupportedOperationException();
    }

    public amzy e() {
        return !isEmpty() ? amzy.b(toArray()) : amzy.h();
    }

    public abstract boolean f();

    @Deprecated
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public final Object[] toArray() {
        return toArray(Du);
    }

    /* access modifiers changed from: package-private */
    public Object writeReplace() {
        return new amzw(toArray());
    }

    public final Object[] toArray(Object[] objArr) {
        amrl.a((Object) objArr);
        int size = size();
        int length = objArr.length;
        if (length < size) {
            Object[] b = b();
            if (b != null) {
                return Arrays.copyOfRange(b, c(), d(), objArr.getClass());
            }
            objArr = anfl.a(objArr, size);
        } else if (length > size) {
            objArr[size] = null;
        }
        a(objArr, 0);
        return objArr;
    }
}
