package defpackage;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;

/* renamed from: amzf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class amzf extends AbstractMap implements Serializable, amxe {
    transient Object[] a;
    transient Object[] b;
    transient int c;
    transient int d;
    public transient int e;
    public transient int[] f;
    public transient amxe g;
    private transient int[] h;
    private transient int[] i;
    private transient int[] j;
    private transient int[] k;
    private transient int l;
    private transient int[] m;
    private transient Set n;
    private transient Set o;
    private transient Set p;

    public amzf() {
        c();
    }

    private final void a(int i2, int i3, int i4) {
        boolean z;
        if (i2 != -1) {
            z = true;
        } else {
            z = false;
        }
        amrl.a(z);
        f(i2, i3);
        g(i2, i4);
        c(this.m[i2], this.f[i2]);
        int i5 = this.c - 1;
        if (i5 != i2) {
            int i6 = this.m[i5];
            int i7 = this.f[i5];
            c(i6, i2);
            c(i2, i7);
            Object[] objArr = this.a;
            Object obj = objArr[i5];
            Object[] objArr2 = this.b;
            Object obj2 = objArr2[i5];
            objArr[i2] = obj;
            objArr2[i2] = obj2;
            int c2 = c(amzi.a(obj));
            int[] iArr = this.h;
            int i8 = iArr[c2];
            if (i8 == i5) {
                iArr[c2] = i2;
            } else {
                int i9 = i8;
                int i10 = this.j[i8];
                int i11 = i9;
                while (i10 != i5) {
                    int i12 = i10;
                    i10 = this.j[i10];
                    i11 = i12;
                }
                this.j[i11] = i2;
            }
            int[] iArr2 = this.j;
            iArr2[i2] = iArr2[i5];
            iArr2[i5] = -1;
            int c3 = c(amzi.a(obj2));
            int[] iArr3 = this.i;
            int i13 = iArr3[c3];
            if (i13 == i5) {
                iArr3[c3] = i2;
            } else {
                int i14 = i13;
                int i15 = this.k[i13];
                int i16 = i14;
                while (i15 != i5) {
                    int i17 = i15;
                    i15 = this.k[i15];
                    i16 = i17;
                }
                this.k[i16] = i2;
            }
            int[] iArr4 = this.k;
            iArr4[i2] = iArr4[i5];
            iArr4[i5] = -1;
        }
        Object[] objArr3 = this.a;
        int i18 = this.c - 1;
        objArr3[i18] = null;
        this.b[i18] = null;
        this.c = i18;
        this.d++;
    }

    private final void b(int i2) {
        int length = this.j.length;
        if (length < i2) {
            int a2 = amzm.a(length, i2);
            this.a = Arrays.copyOf(this.a, a2);
            this.b = Arrays.copyOf(this.b, a2);
            this.j = a(this.j, a2);
            this.k = a(this.k, a2);
            this.m = a(this.m, a2);
            this.f = a(this.f, a2);
        }
        if (this.h.length < i2) {
            int b2 = amzi.b(i2);
            this.h = a(b2);
            this.i = a(b2);
            for (int i3 = 0; i3 < this.c; i3++) {
                int c2 = c(amzi.a(this.a[i3]));
                int[] iArr = this.j;
                int[] iArr2 = this.h;
                iArr[i3] = iArr2[c2];
                iArr2[c2] = i3;
                int c3 = c(amzi.a(this.b[i3]));
                int[] iArr3 = this.k;
                int[] iArr4 = this.i;
                iArr3[i3] = iArr4[c3];
                iArr4[c3] = i3;
            }
        }
    }

    private final int c(int i2) {
        return i2 & (this.h.length - 1);
    }

    private final void d(int i2, int i3) {
        amrl.a(i2 != -1);
        int c2 = c(i3);
        int[] iArr = this.j;
        int[] iArr2 = this.h;
        iArr[i2] = iArr2[c2];
        iArr2[c2] = i2;
    }

    private final void e(int i2, int i3) {
        amrl.a(i2 != -1);
        int c2 = c(i3);
        int[] iArr = this.k;
        int[] iArr2 = this.i;
        iArr[i2] = iArr2[c2];
        iArr2[c2] = i2;
    }

    private final void f(int i2, int i3) {
        boolean z;
        if (i2 != -1) {
            z = true;
        } else {
            z = false;
        }
        amrl.a(z);
        int c2 = c(i3);
        int[] iArr = this.h;
        int i4 = iArr[c2];
        if (i4 == i2) {
            int[] iArr2 = this.j;
            iArr[c2] = iArr2[i2];
            iArr2[i2] = -1;
            return;
        }
        int i5 = i4;
        int i6 = this.j[i4];
        int i7 = i5;
        while (i6 != -1) {
            if (i6 != i2) {
                int i8 = i6;
                i6 = this.j[i6];
                i7 = i8;
            } else {
                int[] iArr3 = this.j;
                iArr3[i7] = iArr3[i2];
                iArr3[i2] = -1;
                return;
            }
        }
        String valueOf = String.valueOf(this.a[i2]);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 32);
        sb.append("Expected to find entry with key ");
        sb.append(valueOf);
        throw new AssertionError(sb.toString());
    }

    private final void g(int i2, int i3) {
        boolean z;
        if (i2 != -1) {
            z = true;
        } else {
            z = false;
        }
        amrl.a(z);
        int c2 = c(i3);
        int[] iArr = this.i;
        int i4 = iArr[c2];
        if (i4 == i2) {
            int[] iArr2 = this.k;
            iArr[c2] = iArr2[i2];
            iArr2[i2] = -1;
            return;
        }
        int i5 = i4;
        int i6 = this.k[i4];
        int i7 = i5;
        while (i6 != -1) {
            if (i6 != i2) {
                int i8 = i6;
                i6 = this.k[i6];
                i7 = i8;
            } else {
                int[] iArr3 = this.k;
                iArr3[i7] = iArr3[i2];
                iArr3[i2] = -1;
                return;
            }
        }
        String valueOf = String.valueOf(this.b[i2]);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 34);
        sb.append("Expected to find entry with value ");
        sb.append(valueOf);
        throw new AssertionError(sb.toString());
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        c();
        for (int i2 = 0; i2 < readInt; i2++) {
            put(objectInputStream.readObject(), objectInputStream.readObject());
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(this.c);
        for (Map.Entry entry : entrySet()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }

    public final void clear() {
        Arrays.fill(this.a, 0, this.c, (Object) null);
        Arrays.fill(this.b, 0, this.c, (Object) null);
        Arrays.fill(this.h, -1);
        Arrays.fill(this.i, -1);
        Arrays.fill(this.j, 0, this.c, -1);
        Arrays.fill(this.k, 0, this.c, -1);
        Arrays.fill(this.m, 0, this.c, -1);
        Arrays.fill(this.f, 0, this.c, -1);
        this.c = 0;
        this.e = -2;
        this.l = -2;
        this.d++;
    }

    public final boolean containsKey(Object obj) {
        return a(obj) != -1;
    }

    public final boolean containsValue(Object obj) {
        return b(obj) != -1;
    }

    public final Set entrySet() {
        Set set = this.p;
        if (set != null) {
            return set;
        }
        amyy amyy = new amyy(this);
        this.p = amyy;
        return amyy;
    }

    public final Object get(Object obj) {
        int a2 = a(obj);
        if (a2 != -1) {
            return this.b[a2];
        }
        return null;
    }

    public final Set keySet() {
        Set set = this.n;
        if (set != null) {
            return set;
        }
        amzb amzb = new amzb(this);
        this.n = amzb;
        return amzb;
    }

    public final Object remove(Object obj) {
        int a2 = amzi.a(obj);
        int a3 = a(obj, a2);
        if (a3 == -1) {
            return null;
        }
        Object obj2 = this.b[a3];
        a(a3, a2);
        return obj2;
    }

    public final int size() {
        return this.c;
    }

    private final void c(int i2, int i3) {
        if (i2 != -2) {
            this.f[i2] = i3;
        } else {
            this.e = i3;
        }
        if (i3 != -2) {
            this.m[i3] = i2;
        } else {
            this.l = i2;
        }
    }

    public final Object put(Object obj, Object obj2) {
        boolean z;
        int a2 = amzi.a(obj);
        int a3 = a(obj, a2);
        if (a3 != -1) {
            Object obj3 = this.b[a3];
            if (amqx.a(obj3, obj2)) {
                return obj2;
            }
            b(a3, obj2);
            return obj3;
        }
        int a4 = amzi.a(obj2);
        if (b(obj2, a4) == -1) {
            z = true;
        } else {
            z = false;
        }
        amrl.a(z, "Value already present: %s", obj2);
        b(this.c + 1);
        Object[] objArr = this.a;
        int i2 = this.c;
        objArr[i2] = obj;
        this.b[i2] = obj2;
        d(i2, a2);
        e(this.c, a4);
        c(this.l, this.c);
        c(this.c, -2);
        this.c++;
        this.d++;
        return null;
    }

    /* access modifiers changed from: package-private */
    public final void c() {
        amxg.a(16, "expectedSize");
        int b2 = amzi.b(16);
        this.c = 0;
        this.a = new Object[16];
        this.b = new Object[16];
        this.h = a(b2);
        this.i = a(b2);
        this.j = a(16);
        this.k = a(16);
        this.e = -2;
        this.l = -2;
        this.m = a(16);
        this.f = a(16);
    }

    /* access modifiers changed from: package-private */
    public final int b(Object obj) {
        return b(obj, amzi.a(obj));
    }

    /* access modifiers changed from: package-private */
    public final int b(Object obj, int i2) {
        return a(obj, i2, this.i, this.k, this.b);
    }

    /* renamed from: b */
    public final Set values() {
        Set set = this.o;
        if (set != null) {
            return set;
        }
        amzc amzc = new amzc(this);
        this.o = amzc;
        return amzc;
    }

    /* access modifiers changed from: package-private */
    public final void b(int i2, int i3) {
        a(i2, amzi.a(this.a[i2]), i3);
    }

    public final void b(int i2, Object obj) {
        boolean z;
        if (i2 != -1) {
            z = true;
        } else {
            z = false;
        }
        amrl.a(z);
        int a2 = amzi.a(obj);
        if (b(obj, a2) == -1) {
            g(i2, amzi.a(this.b[i2]));
            this.b[i2] = obj;
            e(i2, a2);
            return;
        }
        String valueOf = String.valueOf(obj);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 30);
        sb.append("Value already present in map: ");
        sb.append(valueOf);
        throw new IllegalArgumentException(sb.toString());
    }

    private static int[] a(int i2) {
        int[] iArr = new int[i2];
        Arrays.fill(iArr, -1);
        return iArr;
    }

    private static int[] a(int[] iArr, int i2) {
        int length = iArr.length;
        int[] copyOf = Arrays.copyOf(iArr, i2);
        Arrays.fill(copyOf, length, i2, -1);
        return copyOf;
    }

    /* access modifiers changed from: package-private */
    public final int a(Object obj) {
        return a(obj, amzi.a(obj));
    }

    /* access modifiers changed from: package-private */
    public final int a(Object obj, int i2) {
        return a(obj, i2, this.h, this.j, this.a);
    }

    /* access modifiers changed from: package-private */
    public final int a(Object obj, int i2, int[] iArr, int[] iArr2, Object[] objArr) {
        int i3 = iArr[c(i2)];
        while (i3 != -1) {
            if (amqx.a(objArr[i3], obj)) {
                return i3;
            }
            i3 = iArr2[i3];
        }
        return -1;
    }

    public final amxe a() {
        amxe amxe = this.g;
        if (amxe != null) {
            return amxe;
        }
        amyz amyz = new amyz(this);
        this.g = amyz;
        return amyz;
    }

    /* access modifiers changed from: package-private */
    public final Object a(Object obj, Object obj2) {
        boolean z;
        int a2 = amzi.a(obj);
        int b2 = b(obj, a2);
        if (b2 != -1) {
            Object obj3 = this.a[b2];
            if (amqx.a(obj3, obj2)) {
                return obj2;
            }
            a(b2, obj2);
            return obj3;
        }
        int i2 = this.l;
        int a3 = amzi.a(obj2);
        if (a(obj2, a3) == -1) {
            z = true;
        } else {
            z = false;
        }
        amrl.a(z, "Key already present: %s", obj2);
        b(this.c + 1);
        Object[] objArr = this.a;
        int i3 = this.c;
        objArr[i3] = obj2;
        this.b[i3] = obj;
        d(i3, a3);
        e(this.c, a2);
        int i4 = i2 != -2 ? this.f[i2] : this.e;
        c(i2, this.c);
        c(this.c, i4);
        this.c++;
        this.d++;
        return null;
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2, int i3) {
        a(i2, i3, amzi.a(this.b[i2]));
    }

    public final void a(int i2, Object obj) {
        boolean z;
        if (i2 != -1) {
            z = true;
        } else {
            z = false;
        }
        amrl.a(z);
        int a2 = a(obj, amzi.a(obj));
        int i3 = this.l;
        if (a2 == -1) {
            if (i3 == i2) {
                i3 = this.m[i2];
            } else if (i3 == this.c) {
                i3 = a2;
            }
            if (i2 == -2) {
                a2 = this.f[-2];
            } else if (this.c != -2) {
                a2 = -2;
            }
            c(this.m[i2], this.f[i2]);
            f(i2, amzi.a(this.a[i2]));
            this.a[i2] = obj;
            d(i2, amzi.a(obj));
            c(i3, i2);
            c(i2, a2);
            return;
        }
        String valueOf = String.valueOf(obj);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 28);
        sb.append("Key already present in map: ");
        sb.append(valueOf);
        throw new IllegalArgumentException(sb.toString());
    }
}
