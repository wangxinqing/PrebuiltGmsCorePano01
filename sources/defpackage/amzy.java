package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: amzy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class amzy extends amzn implements List, RandomAccess {
    private static final anhk a = new amzu(anfp.a, 0);

    public static amzy a(Iterable iterable) {
        amrl.a((Object) iterable);
        if (iterable instanceof Collection) {
            return a((Collection) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return anfp.a;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return a(next);
        }
        amzt amzt = new amzt();
        amzt.c(next);
        amzt.a(it);
        return amzt.a();
    }

    public static amzt b(int i) {
        amxg.a(i, "expectedSize");
        return new amzt(i);
    }

    private static amzy c(Object... objArr) {
        anfi.a(objArr);
        return b(objArr);
    }

    public static amzy h() {
        return anfp.a;
    }

    public static amzt j() {
        return new amzt();
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Deprecated
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    public final amzy e() {
        return this;
    }

    public final boolean equals(Object obj) {
        return anda.a((List) this, obj);
    }

    public amzy g() {
        return size() > 1 ? new amzv(this) : this;
    }

    public final int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = (i * 31) + get(i2).hashCode();
        }
        return i;
    }

    /* renamed from: i */
    public final anhk listIterator() {
        return listIterator(0);
    }

    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (obj.equals(get(i))) {
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Deprecated
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    public Object writeReplace() {
        return new amzw(toArray());
    }

    static amzy b(Object[] objArr) {
        return b(objArr, objArr.length);
    }

    static amzy b(Object[] objArr, int i) {
        if (i != 0) {
            return new anfp(objArr, i);
        }
        return anfp.a;
    }

    public static amzy a(Object obj) {
        return c(obj);
    }

    public static amzy a(Object obj, Object obj2) {
        return c(obj, obj2);
    }

    public static amzy a(Object obj, Object obj2, Object obj3) {
        return c(obj, obj2, obj3);
    }

    public static amzy a(Object obj, Object obj2, Object obj3, Object obj4) {
        return c(obj, obj2, obj3, obj4);
    }

    public static amzy a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return c(obj, obj2, obj3, obj4, obj5);
    }

    public static amzy a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        return c(obj, obj2, obj3, obj4, obj5, obj6);
    }

    public static amzy a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        return c(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8);
    }

    public static amzy a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9) {
        return c(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9);
    }

    public static amzy a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10) {
        return c(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10);
    }

    @SafeVarargs
    public static amzy a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object... objArr) {
        Object[] objArr2 = objArr;
        amrl.a(true, (Object) "the total number of elements must fit in an int");
        int length = objArr2.length;
        Object[] objArr3 = new Object[(length + 12)];
        objArr3[0] = obj;
        objArr3[1] = obj2;
        objArr3[2] = obj3;
        objArr3[3] = obj4;
        objArr3[4] = obj5;
        objArr3[5] = obj6;
        objArr3[6] = obj7;
        objArr3[7] = obj8;
        objArr3[8] = obj9;
        objArr3[9] = obj10;
        objArr3[10] = obj11;
        objArr3[11] = obj12;
        System.arraycopy(objArr2, 0, objArr3, 12, length);
        return c(objArr3);
    }

    public static amzy a(Collection collection) {
        if (!(collection instanceof amzn)) {
            return c(collection.toArray());
        }
        amzy e = ((amzn) collection).e();
        return e.f() ? b(e.toArray()) : e;
    }

    public static amzy a(Comparator comparator, Iterable iterable) {
        amrl.a((Object) comparator);
        Object[] c = anbs.c(iterable);
        anfi.a(c);
        Arrays.sort(c, comparator);
        return b(c);
    }

    public static amzy a(Object[] objArr) {
        if (objArr.length != 0) {
            return c((Object[]) objArr.clone());
        }
        return anfp.a;
    }

    public int a(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    /* renamed from: a */
    public amzy subList(int i, int i2) {
        amrl.a(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        if (i3 != 0) {
            return new amzx(this, i, i3);
        }
        return anfp.a;
    }

    public final anhj a() {
        return listIterator();
    }

    /* renamed from: a */
    public final anhk listIterator(int i) {
        amrl.b(i, size());
        return !isEmpty() ? new amzu(this, i) : a;
    }
}
