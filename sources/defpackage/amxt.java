package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: amxt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class amxt extends AbstractSet implements Serializable {
    transient Object[] a;
    public transient int b;
    private transient Object c;
    private transient int[] d;
    private transient int e;

    public amxt() {
        b(3);
    }

    private final int a(int i, int i2, int i3, int i4) {
        Object b2 = amxu.b(i2);
        int i5 = i2 - 1;
        if (i4 != 0) {
            amxu.a(b2, i3 & i5, i4 + 1);
        }
        Object obj = this.c;
        int[] iArr = this.d;
        for (int i6 = 0; i6 <= i; i6++) {
            int a2 = amxu.a(obj, i6);
            while (a2 != 0) {
                int i7 = a2 - 1;
                int i8 = iArr[i7];
                int a3 = amxu.a(i8, i) | i6;
                int i9 = a3 & i5;
                int a4 = amxu.a(b2, i9);
                amxu.a(b2, i9, a2);
                iArr[i7] = amxu.a(a3, a4, i5);
                a2 = i8 & i;
            }
        }
        this.c = b2;
        d(i5);
        return i5;
    }

    private final void d(int i) {
        this.b = amxu.a(this.b, 32 - Integer.numberOfLeadingZeros(i), 31);
    }

    private final int e() {
        return (1 << (this.b & 31)) - 1;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        if (readInt >= 0) {
            b(readInt);
            for (int i = 0; i < readInt; i++) {
                add(objectInputStream.readObject());
            }
            return;
        }
        StringBuilder sb = new StringBuilder(25);
        sb.append("Invalid size: ");
        sb.append(readInt);
        throw new InvalidObjectException(sb.toString());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        Iterator it = iterator();
        while (it.hasNext()) {
            objectOutputStream.writeObject(it.next());
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean a() {
        return this.c == null;
    }

    public final boolean add(Object obj) {
        int min;
        if (a()) {
            amrl.b(a(), (Object) "Arrays already allocated");
            int i = this.b;
            int a2 = amxu.a(i);
            this.c = amxu.b(a2);
            d(a2 - 1);
            this.d = new int[i];
            this.a = new Object[i];
        }
        Set b2 = b();
        if (b2 != null) {
            return b2.add(obj);
        }
        int[] iArr = this.d;
        Object[] objArr = this.a;
        int i2 = this.e;
        int i3 = i2 + 1;
        int a3 = amzi.a(obj);
        int e2 = e();
        int i4 = a3 & e2;
        int a4 = amxu.a(this.c, i4);
        if (a4 != 0) {
            int a5 = amxu.a(a3, e2);
            int i5 = 0;
            while (true) {
                int i6 = a4 - 1;
                int i7 = iArr[i6];
                if (amxu.a(i7, e2) == a5 && amqx.a(obj, objArr[i6])) {
                    return false;
                }
                int i8 = i7 & e2;
                i5++;
                if (i8 != 0) {
                    a4 = i8;
                } else if (i5 >= 9) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet(e() + 1, 1.0f);
                    int d2 = d();
                    while (d2 >= 0) {
                        linkedHashSet.add(this.a[d2]);
                        d2 = c(d2);
                    }
                    this.c = linkedHashSet;
                    this.d = null;
                    this.a = null;
                    c();
                    return linkedHashSet.add(obj);
                } else if (i3 > e2) {
                    e2 = a(e2, amxu.c(e2), a3, i2);
                } else {
                    iArr[i6] = amxu.a(i7, i3, e2);
                }
            }
        } else if (i3 > e2) {
            e2 = a(e2, amxu.c(e2), a3, i2);
        } else {
            amxu.a(this.c, i4, i3);
        }
        int length = this.d.length;
        if (i3 > length && (min = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) != length) {
            this.d = Arrays.copyOf(this.d, min);
            this.a = Arrays.copyOf(this.a, min);
        }
        this.d[i2] = amxu.a(a3, 0, e2);
        this.a[i2] = obj;
        this.e = i3;
        c();
        return true;
    }

    /* access modifiers changed from: package-private */
    public final Set b() {
        Object obj = this.c;
        if (obj instanceof Set) {
            return (Set) obj;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final int c(int i) {
        int i2 = i + 1;
        if (i2 >= this.e) {
            return -1;
        }
        return i2;
    }

    /* access modifiers changed from: package-private */
    public final void c() {
        this.b += 32;
    }

    public final void clear() {
        if (!a()) {
            c();
            Set b2 = b();
            if (b2 != null) {
                this.b = aoog.a(size(), 3, 1073741823);
                b2.clear();
                this.c = null;
                this.e = 0;
                return;
            }
            Arrays.fill(this.a, 0, this.e, (Object) null);
            amxu.a(this.c);
            Arrays.fill(this.d, 0, this.e, 0);
            this.e = 0;
        }
    }

    public final boolean contains(Object obj) {
        if (!a()) {
            Set b2 = b();
            if (b2 != null) {
                return b2.contains(obj);
            }
            int a2 = amzi.a(obj);
            int e2 = e();
            int a3 = amxu.a(this.c, a2 & e2);
            if (a3 != 0) {
                int a4 = amxu.a(a2, e2);
                do {
                    int i = a3 - 1;
                    int i2 = this.d[i];
                    if (amxu.a(i2, e2) == a4 && amqx.a(obj, this.a[i])) {
                        return true;
                    }
                    a3 = i2 & e2;
                } while (a3 != 0);
            }
        }
        return false;
    }

    public final boolean isEmpty() {
        return size() == 0;
    }

    public final Iterator iterator() {
        Set b2 = b();
        if (b2 != null) {
            return b2.iterator();
        }
        return new amxs(this);
    }

    public final boolean remove(Object obj) {
        int i;
        int[] iArr;
        int i2;
        if (!a()) {
            Set b2 = b();
            if (b2 != null) {
                return b2.remove(obj);
            }
            int e2 = e();
            int a2 = amxu.a(obj, (Object) null, e2, this.c, this.d, this.a, (Object[]) null);
            if (a2 != -1) {
                int size = size() - 1;
                if (a2 < size) {
                    Object[] objArr = this.a;
                    Object obj2 = objArr[size];
                    objArr[a2] = obj2;
                    objArr[size] = null;
                    int[] iArr2 = this.d;
                    iArr2[a2] = iArr2[size];
                    iArr2[size] = 0;
                    int a3 = amzi.a(obj2) & e2;
                    int a4 = amxu.a(this.c, a3);
                    int i3 = size + 1;
                    if (a4 == i3) {
                        amxu.a(this.c, a3, a2 + 1);
                    } else {
                        while (true) {
                            i = a4 - 1;
                            iArr = this.d;
                            i2 = iArr[i];
                            int i4 = i2 & e2;
                            if (i4 == i3) {
                                break;
                            }
                            a4 = i4;
                        }
                        iArr[i] = amxu.a(i2, a2 + 1, e2);
                    }
                } else {
                    this.a[a2] = null;
                    this.d[a2] = 0;
                }
                this.e--;
                c();
                return true;
            }
        }
        return false;
    }

    public final int size() {
        Set b2 = b();
        return b2 == null ? this.e : b2.size();
    }

    public final Object[] toArray() {
        if (a()) {
            return new Object[0];
        }
        Set b2 = b();
        return b2 == null ? Arrays.copyOf(this.a, this.e) : b2.toArray();
    }

    public amxt(int i) {
        b(i);
    }

    /* access modifiers changed from: package-private */
    public final void b(int i) {
        amrl.a(true, (Object) "Expected size must be >= 0");
        this.b = aoog.a(i, 1, 1073741823);
    }

    /* access modifiers changed from: package-private */
    public final int d() {
        return isEmpty() ? -1 : 0;
    }

    public final Object[] toArray(Object[] objArr) {
        if (a()) {
            if (objArr.length > 0) {
                objArr[0] = null;
            }
            return objArr;
        }
        Set b2 = b();
        if (b2 != null) {
            return b2.toArray(objArr);
        }
        Object[] objArr2 = this.a;
        int i = this.e;
        amrl.a(0, i, objArr2.length);
        int length = objArr.length;
        if (length < i) {
            objArr = anfl.a(objArr, i);
        } else if (length > i) {
            objArr[i] = null;
        }
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return objArr;
    }

    public static amxt a(int i) {
        return new amxt(i);
    }
}
