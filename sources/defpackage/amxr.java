package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: amxr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class amxr extends AbstractMap implements Serializable {
    public static final Object a = new Object();
    public transient Object b;
    transient int[] c;
    transient Object[] d;
    transient Object[] e;
    public transient int f;
    public transient int g;
    private transient Set h;
    private transient Set i;
    private transient Collection j;

    public amxr() {
        b(3);
    }

    private final int a(int i2, int i3, int i4, int i5) {
        Object b2 = amxu.b(i3);
        int i6 = i3 - 1;
        if (i5 != 0) {
            amxu.a(b2, i4 & i6, i5 + 1);
        }
        Object obj = this.b;
        int[] iArr = this.c;
        for (int i7 = 0; i7 <= i2; i7++) {
            int a2 = amxu.a(obj, i7);
            while (a2 != 0) {
                int i8 = a2 - 1;
                int i9 = iArr[i8];
                int a3 = amxu.a(i9, i2) | i7;
                int i10 = a3 & i6;
                int a4 = amxu.a(b2, i10);
                amxu.a(b2, i10, a2);
                iArr[i8] = amxu.a(a3, a4, i6);
                a2 = i9 & i2;
            }
        }
        this.b = b2;
        f(i6);
        return i6;
    }

    private final void f(int i2) {
        this.f = amxu.a(this.f, 32 - Integer.numberOfLeadingZeros(i2), 31);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        if (readInt >= 0) {
            b(readInt);
            for (int i2 = 0; i2 < readInt; i2++) {
                put(objectInputStream.readObject(), objectInputStream.readObject());
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
        Iterator i2 = i();
        while (i2.hasNext()) {
            Map.Entry entry = (Map.Entry) i2.next();
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }

    public int b(int i2, int i3) {
        return i2 - 1;
    }

    /* access modifiers changed from: package-private */
    public final boolean b() {
        return this.b == null;
    }

    public int c() {
        amrl.b(b(), (Object) "Arrays already allocated");
        int i2 = this.f;
        int a2 = amxu.a(i2);
        this.b = amxu.b(a2);
        f(a2 - 1);
        this.c = new int[i2];
        this.d = new Object[i2];
        this.e = new Object[i2];
        return i2;
    }

    public void clear() {
        if (!b()) {
            g();
            Map d2 = d();
            if (d2 != null) {
                this.f = aoog.a(size(), 3, 1073741823);
                d2.clear();
                this.b = null;
                this.g = 0;
                return;
            }
            Arrays.fill(this.d, 0, this.g, (Object) null);
            Arrays.fill(this.e, 0, this.g, (Object) null);
            amxu.a(this.b);
            Arrays.fill(this.c, 0, this.g, 0);
            this.g = 0;
        }
    }

    public final boolean containsKey(Object obj) {
        Map d2 = d();
        return d2 == null ? a(obj) != -1 : d2.containsKey(obj);
    }

    public final boolean containsValue(Object obj) {
        Map d2 = d();
        if (d2 != null) {
            return d2.containsValue(obj);
        }
        for (int i2 = 0; i2 < this.g; i2++) {
            if (amqx.a(obj, this.e[i2])) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final Map d() {
        Object obj = this.b;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    public int e(int i2) {
        int i3 = i2 + 1;
        if (i3 >= this.g) {
            return -1;
        }
        return i3;
    }

    public final Set entrySet() {
        Set set = this.i;
        if (set != null) {
            return set;
        }
        amxm amxm = new amxm(this);
        this.i = amxm;
        return amxm;
    }

    public final int f() {
        return (1 << (this.f & 31)) - 1;
    }

    /* access modifiers changed from: package-private */
    public final void g() {
        this.f += 32;
    }

    public final Object get(Object obj) {
        Map d2 = d();
        if (d2 != null) {
            return d2.get(obj);
        }
        int a2 = a(obj);
        if (a2 != -1) {
            return this.e[a2];
        }
        return null;
    }

    public int h() {
        return isEmpty() ? -1 : 0;
    }

    /* access modifiers changed from: package-private */
    public final Iterator i() {
        Map d2 = d();
        if (d2 != null) {
            return d2.entrySet().iterator();
        }
        return new amxk(this);
    }

    public final boolean isEmpty() {
        return size() == 0;
    }

    public final Set keySet() {
        Set set = this.h;
        if (set != null) {
            return set;
        }
        amxo amxo = new amxo(this);
        this.h = amxo;
        return amxo;
    }

    public final Object put(Object obj, Object obj2) {
        int i2;
        int min;
        if (b()) {
            c();
        }
        Map d2 = d();
        if (d2 != null) {
            return d2.put(obj, obj2);
        }
        int[] iArr = this.c;
        Object[] objArr = this.d;
        Object[] objArr2 = this.e;
        int i3 = this.g;
        int i4 = i3 + 1;
        int a2 = amzi.a(obj);
        int f2 = f();
        int i5 = a2 & f2;
        int a3 = amxu.a(this.b, i5);
        if (a3 != 0) {
            int a4 = amxu.a(a2, f2);
            int i6 = 0;
            while (true) {
                int i7 = a3 - 1;
                int i8 = iArr[i7];
                if (amxu.a(i8, f2) == a4 && amqx.a(obj, objArr[i7])) {
                    Object obj3 = objArr2[i7];
                    objArr2[i7] = obj2;
                    return obj3;
                }
                int i9 = i8 & f2;
                i6++;
                if (i9 != 0) {
                    a3 = i9;
                } else if (i6 >= 9) {
                    return e().put(obj, obj2);
                } else {
                    if (i4 > f2) {
                        i2 = a(f2, amxu.c(f2), a2, i3);
                    } else {
                        iArr[i7] = amxu.a(i8, i4, f2);
                    }
                }
            }
            int length = this.c.length;
            if (i4 > length && (min = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) != length) {
                d(min);
            }
            a(i3, obj, obj2, a2, i2);
            this.g = i4;
            g();
            return null;
        } else if (i4 > f2) {
            i2 = a(f2, amxu.c(f2), a2, i3);
            int length2 = this.c.length;
            d(min);
            a(i3, obj, obj2, a2, i2);
            this.g = i4;
            g();
            return null;
        } else {
            amxu.a(this.b, i5, i4);
        }
        i2 = f2;
        int length22 = this.c.length;
        d(min);
        a(i3, obj, obj2, a2, i2);
        this.g = i4;
        g();
        return null;
    }

    public final Object remove(Object obj) {
        Map d2 = d();
        if (d2 != null) {
            return d2.remove(obj);
        }
        Object b2 = b(obj);
        if (b2 == a) {
            return null;
        }
        return b2;
    }

    public final int size() {
        Map d2 = d();
        return d2 == null ? this.g : d2.size();
    }

    public final Collection values() {
        Collection collection = this.j;
        if (collection != null) {
            return collection;
        }
        amxq amxq = new amxq(this);
        this.j = amxq;
        return amxq;
    }

    public amxr(int i2) {
        b(i2);
    }

    public final Object b(Object obj) {
        int f2;
        int a2;
        if (b() || (a2 = amxu.a(obj, (Object) null, f2, this.b, this.c, this.d, (Object[]) null)) == -1) {
            return a;
        }
        Object obj2 = this.e[a2];
        a(a2, (f2 = f()));
        this.g--;
        g();
        return obj2;
    }

    public void d(int i2) {
        this.c = Arrays.copyOf(this.c, i2);
        this.d = Arrays.copyOf(this.d, i2);
        this.e = Arrays.copyOf(this.e, i2);
    }

    public Map e() {
        Map c2 = c(f() + 1);
        int h2 = h();
        while (h2 >= 0) {
            c2.put(this.d[h2], this.e[h2]);
            h2 = e(h2);
        }
        this.b = c2;
        this.c = null;
        this.d = null;
        this.e = null;
        g();
        return c2;
    }

    public Map c(int i2) {
        return new LinkedHashMap(i2, 1.0f);
    }

    public static amxr a() {
        return new amxr();
    }

    public void b(int i2) {
        boolean z;
        if (i2 >= 0) {
            z = true;
        } else {
            z = false;
        }
        amrl.a(z, (Object) "Expected size must be >= 0");
        this.f = aoog.a(i2, 1, 1073741823);
    }

    public static amxr a(int i2) {
        return new amxr(i2);
    }

    public final int a(Object obj) {
        if (!b()) {
            int a2 = amzi.a(obj);
            int f2 = f();
            int a3 = amxu.a(this.b, a2 & f2);
            if (a3 != 0) {
                int a4 = amxu.a(a2, f2);
                do {
                    int i2 = a3 - 1;
                    int i3 = this.c[i2];
                    if (amxu.a(i3, f2) == a4 && amqx.a(obj, this.d[i2])) {
                        return i2;
                    }
                    a3 = i3 & f2;
                } while (a3 != 0);
            }
        }
        return -1;
    }

    public void a(int i2, int i3) {
        int size = size() - 1;
        if (i2 < size) {
            Object[] objArr = this.d;
            Object obj = objArr[size];
            objArr[i2] = obj;
            Object[] objArr2 = this.e;
            objArr2[i2] = objArr2[size];
            objArr[size] = null;
            objArr2[size] = null;
            int[] iArr = this.c;
            iArr[i2] = iArr[size];
            iArr[size] = 0;
            int a2 = amzi.a(obj) & i3;
            int a3 = amxu.a(this.b, a2);
            int i4 = size + 1;
            if (a3 != i4) {
                while (true) {
                    int i5 = a3 - 1;
                    int[] iArr2 = this.c;
                    int i6 = iArr2[i5];
                    int i7 = i6 & i3;
                    if (i7 != i4) {
                        a3 = i7;
                    } else {
                        iArr2[i5] = amxu.a(i6, i2 + 1, i3);
                        return;
                    }
                }
            } else {
                amxu.a(this.b, a2, i2 + 1);
            }
        } else {
            this.d[i2] = null;
            this.e[i2] = null;
            this.c[i2] = 0;
        }
    }

    public void a(int i2, Object obj, Object obj2, int i3, int i4) {
        this.c[i2] = amxu.a(i3, 0, i4);
        this.d[i2] = obj;
        this.e[i2] = obj2;
    }
}
