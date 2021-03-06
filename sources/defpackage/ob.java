package defpackage;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;

/* renamed from: ob  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ob implements Collection, Set {
    private static final int[] c = new int[0];
    private static final Object[] d = new Object[0];
    private static Object[] e;
    private static int f;
    private static Object[] g;
    private static int h;
    private static final Object i = new Object();
    private static final Object j = new Object();
    Object[] a;
    public int b;
    private int[] k;
    private oo l;

    public ob() {
        this(0);
    }

    private final int a() {
        int i2 = this.b;
        if (i2 == 0) {
            return -1;
        }
        int a2 = a(this.k, 0);
        if (a2 < 0 || this.a[a2] == null) {
            return a2;
        }
        int i3 = a2 + 1;
        while (i3 < i2 && this.k[i3] == 0) {
            if (this.a[i3] == null) {
                return i3;
            }
            i3++;
        }
        int i4 = a2 - 1;
        while (i4 >= 0 && this.k[i4] == 0) {
            if (this.a[i4] == null) {
                return i4;
            }
            i4--;
        }
        return i3 ^ -1;
    }

    private final void d(int i2) {
        if (i2 == 8) {
            synchronized (j) {
                if (g != null) {
                    Object[] objArr = g;
                    try {
                        this.a = objArr;
                        g = (Object[]) objArr[0];
                        int[] iArr = (int[]) objArr[1];
                        this.k = iArr;
                        if (iArr == null) {
                            System.out.println("ArraySet Found corrupt ArraySet cache: [0]=" + objArr[0] + " [1]=" + objArr[1]);
                            g = null;
                            h = 0;
                        } else {
                            objArr[1] = null;
                            objArr[0] = null;
                            h--;
                            return;
                        }
                    } catch (ClassCastException e2) {
                    }
                }
            }
        } else if (i2 == 4) {
            synchronized (i) {
                if (e != null) {
                    Object[] objArr2 = e;
                    try {
                        this.a = objArr2;
                        e = (Object[]) objArr2[0];
                        int[] iArr2 = (int[]) objArr2[1];
                        this.k = iArr2;
                        if (iArr2 == null) {
                            System.out.println("ArraySet Found corrupt ArraySet cache: [0]=" + objArr2[0] + " [1]=" + objArr2[1]);
                            e = null;
                            f = 0;
                        } else {
                            objArr2[1] = null;
                            objArr2[0] = null;
                            f--;
                            return;
                        }
                    } catch (ClassCastException e3) {
                    }
                }
            }
        }
        this.k = new int[i2];
        this.a = new Object[i2];
    }

    public final boolean add(Object obj) {
        int i2;
        int i3;
        int i4 = this.b;
        if (obj != null) {
            i3 = obj.hashCode();
            i2 = a(obj, i3);
        } else {
            i2 = a();
            i3 = 0;
        }
        if (i2 >= 0) {
            return false;
        }
        int i5 = i2 ^ -1;
        int[] iArr = this.k;
        int length = iArr.length;
        if (i4 >= length) {
            int i6 = 4;
            if (i4 >= 8) {
                i6 = (i4 >> 1) + i4;
            } else if (i4 >= 4) {
                i6 = 8;
            }
            Object[] objArr = this.a;
            d(i6);
            if (i4 == this.b) {
                int[] iArr2 = this.k;
                if (iArr2.length > 0) {
                    System.arraycopy(iArr, 0, iArr2, 0, length);
                    System.arraycopy(objArr, 0, this.a, 0, objArr.length);
                }
                a(iArr, objArr, i4);
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i5 < i4) {
            int[] iArr3 = this.k;
            int i7 = i5 + 1;
            int i8 = i4 - i5;
            System.arraycopy(iArr3, i5, iArr3, i7, i8);
            Object[] objArr2 = this.a;
            System.arraycopy(objArr2, i5, objArr2, i7, i8);
        }
        int i9 = this.b;
        if (i4 == i9) {
            int[] iArr4 = this.k;
            if (i5 < iArr4.length) {
                iArr4[i5] = i3;
                this.a[i5] = obj;
                this.b = i9 + 1;
                return true;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final boolean addAll(Collection collection) {
        a(this.b + collection.size());
        boolean z = false;
        for (Object add : collection) {
            z |= add(add);
        }
        return z;
    }

    public final Object b(int i2) {
        return this.a[i2];
    }

    public final void c(int i2) {
        int i3 = this.b;
        Object[] objArr = this.a;
        Object obj = objArr[i2];
        if (i3 <= 1) {
            clear();
            return;
        }
        int i4 = i3 - 1;
        int[] iArr = this.k;
        int length = iArr.length;
        int i5 = 8;
        if (length <= 8 || i3 >= length / 3) {
            if (i2 < i4) {
                int i6 = i2 + 1;
                int i7 = i4 - i2;
                System.arraycopy(iArr, i6, iArr, i2, i7);
                Object[] objArr2 = this.a;
                System.arraycopy(objArr2, i6, objArr2, i2, i7);
            }
            this.a[i4] = null;
        } else {
            if (i3 > 8) {
                i5 = i3 + (i3 >> 1);
            }
            d(i5);
            if (i2 > 0) {
                System.arraycopy(iArr, 0, this.k, 0, i2);
                System.arraycopy(objArr, 0, this.a, 0, i2);
            }
            if (i2 < i4) {
                int i8 = i2 + 1;
                int i9 = i4 - i2;
                System.arraycopy(iArr, i8, this.k, i2, i9);
                System.arraycopy(objArr, i8, this.a, i2, i9);
            }
        }
        if (i3 == this.b) {
            this.b = i4;
            return;
        }
        throw new ConcurrentModificationException();
    }

    public final void clear() {
        int i2 = this.b;
        if (i2 != 0) {
            int[] iArr = this.k;
            Object[] objArr = this.a;
            this.k = c;
            this.a = d;
            this.b = 0;
            a(iArr, objArr, i2);
        }
        if (this.b != 0) {
            throw new ConcurrentModificationException();
        }
    }

    public final boolean contains(Object obj) {
        return a(obj) >= 0;
    }

    public final boolean containsAll(Collection collection) {
        for (Object contains : collection) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (this.b == set.size()) {
                int i2 = 0;
                while (i2 < this.b) {
                    try {
                        if (!set.contains(b(i2))) {
                            return false;
                        }
                        i2++;
                    } catch (NullPointerException e2) {
                    } catch (ClassCastException e3) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int[] iArr = this.k;
        int i2 = this.b;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 += iArr[i4];
        }
        return i3;
    }

    public final boolean isEmpty() {
        return this.b <= 0;
    }

    public final Iterator iterator() {
        if (this.l == null) {
            this.l = new oa(this);
        }
        return this.l.d().iterator();
    }

    public final boolean remove(Object obj) {
        int a2 = a(obj);
        if (a2 < 0) {
            return false;
        }
        c(a2);
        return true;
    }

    public final boolean removeAll(Collection collection) {
        boolean z = false;
        for (Object remove : collection) {
            z |= remove(remove);
        }
        return z;
    }

    public final boolean retainAll(Collection collection) {
        boolean z = false;
        for (int i2 = this.b - 1; i2 >= 0; i2--) {
            if (!collection.contains(this.a[i2])) {
                c(i2);
                z = true;
            }
        }
        return z;
    }

    public final int size() {
        return this.b;
    }

    public final Object[] toArray() {
        int i2 = this.b;
        Object[] objArr = new Object[i2];
        System.arraycopy(this.a, 0, objArr, 0, i2);
        return objArr;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.b * 14);
        sb.append('{');
        for (int i2 = 0; i2 < this.b; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object b2 = b(i2);
            if (b2 != this) {
                sb.append(b2);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public ob(int i2) {
        if (i2 == 0) {
            this.k = c;
            this.a = d;
        } else {
            d(i2);
        }
        this.b = 0;
    }

    public final Object[] toArray(Object[] objArr) {
        if (objArr.length < this.b) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), this.b);
        }
        System.arraycopy(this.a, 0, objArr, 0, this.b);
        int length = objArr.length;
        int i2 = this.b;
        if (length > i2) {
            objArr[i2] = null;
        }
        return objArr;
    }

    public ob(Collection collection) {
        this();
        if (collection != null) {
            addAll(collection);
        }
    }

    private final int a(Object obj, int i2) {
        int i3 = this.b;
        if (i3 == 0) {
            return -1;
        }
        int a2 = a(this.k, i2);
        if (a2 < 0 || obj.equals(this.a[a2])) {
            return a2;
        }
        int i4 = a2 + 1;
        while (i4 < i3 && this.k[i4] == i2) {
            if (obj.equals(this.a[i4])) {
                return i4;
            }
            i4++;
        }
        int i5 = a2 - 1;
        while (i5 >= 0 && this.k[i5] == i2) {
            if (obj.equals(this.a[i5])) {
                return i5;
            }
            i5--;
        }
        return i4 ^ -1;
    }

    public ob(ob obVar) {
        this();
        if (obVar != null) {
            int i2 = obVar.b;
            a(this.b + i2);
            if (this.b != 0) {
                for (int i3 = 0; i3 < i2; i3++) {
                    add(obVar.b(i3));
                }
            } else if (i2 > 0) {
                System.arraycopy(obVar.k, 0, this.k, 0, i2);
                System.arraycopy(obVar.a, 0, this.a, 0, i2);
                if (this.b == 0) {
                    this.b = i2;
                    return;
                }
                throw new ConcurrentModificationException();
            }
        }
    }

    private final int a(int[] iArr, int i2) {
        try {
            return og.a(iArr, this.b, i2);
        } catch (ArrayIndexOutOfBoundsException e2) {
            throw new ConcurrentModificationException();
        }
    }

    private static void a(int[] iArr, Object[] objArr, int i2) {
        int length = iArr.length;
        if (length == 8) {
            synchronized (j) {
                if (h < 10) {
                    objArr[0] = g;
                    objArr[1] = iArr;
                    for (int i3 = i2 - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    g = objArr;
                    h++;
                }
            }
        } else if (length == 4) {
            synchronized (i) {
                if (f < 10) {
                    objArr[0] = e;
                    objArr[1] = iArr;
                    for (int i4 = i2 - 1; i4 >= 2; i4--) {
                        objArr[i4] = null;
                    }
                    e = objArr;
                    f++;
                }
            }
        }
    }

    public final int a(Object obj) {
        return obj != null ? a(obj, obj.hashCode()) : a();
    }

    public final void a(int i2) {
        int i3 = this.b;
        int[] iArr = this.k;
        if (iArr.length < i2) {
            Object[] objArr = this.a;
            d(i2);
            int i4 = this.b;
            if (i4 > 0) {
                System.arraycopy(iArr, 0, this.k, 0, i4);
                System.arraycopy(objArr, 0, this.a, 0, this.b);
            }
            a(iArr, objArr, this.b);
        }
        if (this.b != i3) {
            throw new ConcurrentModificationException();
        }
    }
}
