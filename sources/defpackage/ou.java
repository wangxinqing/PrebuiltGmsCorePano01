package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* renamed from: ou  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ou {
    static Object[] b;
    static int c;
    static Object[] d;
    static int e;
    int[] f;
    Object[] g;
    public int h;

    public ou() {
        this.f = og.a;
        this.g = og.c;
        this.h = 0;
    }

    private static int a(int[] iArr, int i, int i2) {
        try {
            return og.a(iArr, i, i2);
        } catch (ArrayIndexOutOfBoundsException e2) {
            throw new ConcurrentModificationException();
        }
    }

    private final void e(int i) {
        Class<ou> cls = ou.class;
        if (i == 8) {
            synchronized (cls) {
                if (d != null) {
                    Object[] objArr = d;
                    this.g = objArr;
                    d = (Object[]) objArr[0];
                    this.f = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    e--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (cls) {
                if (b != null) {
                    Object[] objArr2 = b;
                    this.g = objArr2;
                    b = (Object[]) objArr2[0];
                    this.f = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    c--;
                    return;
                }
            }
        }
        this.f = new int[i];
        this.g = new Object[(i + i)];
    }

    /* access modifiers changed from: package-private */
    public final int b(Object obj) {
        int i = this.h;
        int i2 = i + i;
        Object[] objArr = this.g;
        if (obj == null) {
            for (int i3 = 1; i3 < i2; i3 += 2) {
                if (objArr[i3] == null) {
                    return i3 >> 1;
                }
            }
            return -1;
        }
        for (int i4 = 1; i4 < i2; i4 += 2) {
            if (obj.equals(objArr[i4])) {
                return i4 >> 1;
            }
        }
        return -1;
    }

    public final Object c(int i) {
        return this.g[i + i + 1];
    }

    public final void clear() {
        int i = this.h;
        if (i > 0) {
            int[] iArr = this.f;
            Object[] objArr = this.g;
            this.f = og.a;
            this.g = og.c;
            this.h = 0;
            a(iArr, objArr, i);
        }
        if (this.h > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public final boolean containsKey(Object obj) {
        return a(obj) >= 0;
    }

    public final boolean containsValue(Object obj) {
        return b(obj) >= 0;
    }

    public final Object d(int i) {
        Object[] objArr = this.g;
        int i2 = i + i;
        Object obj = objArr[i2 + 1];
        int i3 = this.h;
        int i4 = 0;
        if (i3 <= 1) {
            a(this.f, objArr, i3);
            this.f = og.a;
            this.g = og.c;
        } else {
            int i5 = i3 - 1;
            int[] iArr = this.f;
            int length = iArr.length;
            int i6 = 8;
            if (length <= 8 || i3 >= length / 3) {
                if (i < i5) {
                    int i7 = i + 1;
                    int i8 = i5 - i;
                    System.arraycopy(iArr, i7, iArr, i, i8);
                    Object[] objArr2 = this.g;
                    System.arraycopy(objArr2, i7 + i7, objArr2, i2, i8 + i8);
                }
                Object[] objArr3 = this.g;
                int i9 = i5 + i5;
                objArr3[i9] = null;
                objArr3[i9 + 1] = null;
            } else {
                if (i3 > 8) {
                    i6 = i3 + (i3 >> 1);
                }
                e(i6);
                if (i3 == this.h) {
                    if (i > 0) {
                        System.arraycopy(iArr, 0, this.f, 0, i);
                        System.arraycopy(objArr, 0, this.g, 0, i2);
                    }
                    if (i < i5) {
                        int i10 = i + 1;
                        int i11 = i5 - i;
                        System.arraycopy(iArr, i10, this.f, i, i11);
                        System.arraycopy(objArr, i10 + i10, this.g, i2, i11 + i11);
                    }
                } else {
                    throw new ConcurrentModificationException();
                }
            }
            i4 = i5;
        }
        if (i3 == this.h) {
            this.h = i4;
            return obj;
        }
        throw new ConcurrentModificationException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ou) {
            ou ouVar = (ou) obj;
            if (this.h != ouVar.h) {
                return false;
            }
            int i = 0;
            while (i < this.h) {
                try {
                    Object b2 = b(i);
                    Object c2 = c(i);
                    Object obj2 = ouVar.get(b2);
                    if (c2 != null) {
                        if (!c2.equals(obj2)) {
                            return false;
                        }
                    } else if (obj2 != null || !ouVar.containsKey(b2)) {
                        return false;
                    }
                    i++;
                } catch (NullPointerException e2) {
                    return false;
                } catch (ClassCastException e3) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this.h == map.size()) {
                int i2 = 0;
                while (i2 < this.h) {
                    try {
                        Object b3 = b(i2);
                        Object c3 = c(i2);
                        Object obj3 = map.get(b3);
                        if (c3 != null) {
                            if (!c3.equals(obj3)) {
                                return false;
                            }
                        } else if (obj3 != null || !map.containsKey(b3)) {
                            return false;
                        }
                        i2++;
                    } catch (NullPointerException e4) {
                    } catch (ClassCastException e5) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final Object get(Object obj) {
        return getOrDefault(obj, (Object) null);
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int a = a(obj);
        return a >= 0 ? this.g[a + a + 1] : obj2;
    }

    public final int hashCode() {
        int[] iArr = this.f;
        Object[] objArr = this.g;
        int i = this.h;
        int i2 = 1;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            i4 += (obj != null ? obj.hashCode() : 0) ^ iArr[i3];
            i3++;
            i2 += 2;
        }
        return i4;
    }

    public final boolean isEmpty() {
        return this.h <= 0;
    }

    public final Object put(Object obj, Object obj2) {
        int i;
        int i2;
        int i3 = this.h;
        if (obj != null) {
            i2 = obj.hashCode();
            i = a(obj, i2);
        } else {
            i = a();
            i2 = 0;
        }
        if (i >= 0) {
            int i4 = i + i + 1;
            Object[] objArr = this.g;
            Object obj3 = objArr[i4];
            objArr[i4] = obj2;
            return obj3;
        }
        int i5 = i ^ -1;
        int[] iArr = this.f;
        int length = iArr.length;
        if (i3 >= length) {
            int i6 = 4;
            if (i3 >= 8) {
                i6 = (i3 >> 1) + i3;
            } else if (i3 >= 4) {
                i6 = 8;
            }
            Object[] objArr2 = this.g;
            e(i6);
            if (i3 == this.h) {
                int[] iArr2 = this.f;
                if (iArr2.length > 0) {
                    System.arraycopy(iArr, 0, iArr2, 0, length);
                    System.arraycopy(objArr2, 0, this.g, 0, objArr2.length);
                }
                a(iArr, objArr2, i3);
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i5 < i3) {
            int[] iArr3 = this.f;
            int i7 = i5 + 1;
            System.arraycopy(iArr3, i5, iArr3, i7, i3 - i5);
            Object[] objArr3 = this.g;
            int i8 = this.h - i5;
            System.arraycopy(objArr3, i5 + i5, objArr3, i7 + i7, i8 + i8);
        }
        int i9 = this.h;
        if (i3 == i9) {
            int[] iArr4 = this.f;
            if (i5 < iArr4.length) {
                iArr4[i5] = i2;
                Object[] objArr4 = this.g;
                int i10 = i5 + i5;
                objArr4[i10] = obj;
                objArr4[i10 + 1] = obj2;
                this.h = i9 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 == null ? put(obj, obj2) : obj3;
    }

    public final Object remove(Object obj) {
        int a = a(obj);
        if (a >= 0) {
            return d(a);
        }
        return null;
    }

    public final Object replace(Object obj, Object obj2) {
        int a = a(obj);
        if (a >= 0) {
            return a(a, obj2);
        }
        return null;
    }

    public final int size() {
        return this.h;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.h * 28);
        sb.append('{');
        for (int i = 0; i < this.h; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            Object b2 = b(i);
            if (b2 != this) {
                sb.append(b2);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object c2 = c(i);
            if (c2 != this) {
                sb.append(c2);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public ou(int i) {
        if (i == 0) {
            this.f = og.a;
            this.g = og.c;
        } else {
            e(i);
        }
        this.h = 0;
    }

    private static void a(int[] iArr, Object[] objArr, int i) {
        Class<ou> cls = ou.class;
        int length = iArr.length;
        if (length == 8) {
            synchronized (cls) {
                if (e < 10) {
                    objArr[0] = d;
                    objArr[1] = iArr;
                    for (int i2 = (i + i) - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    d = objArr;
                    e++;
                }
            }
        } else if (length == 4) {
            synchronized (cls) {
                if (c < 10) {
                    objArr[0] = b;
                    objArr[1] = iArr;
                    for (int i3 = (i + i) - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    b = objArr;
                    c++;
                }
            }
        }
    }

    public final Object b(int i) {
        return this.g[i + i];
    }

    public final boolean remove(Object obj, Object obj2) {
        int a = a(obj);
        if (a < 0) {
            return false;
        }
        Object c2 = c(a);
        if (obj2 != c2 && (obj2 == null || !obj2.equals(c2))) {
            return false;
        }
        d(a);
        return true;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int a = a(obj);
        if (a < 0) {
            return false;
        }
        Object c2 = c(a);
        if (c2 != obj2 && (obj2 == null || !obj2.equals(c2))) {
            return false;
        }
        a(a, obj3);
        return true;
    }

    /* access modifiers changed from: package-private */
    public final int a() {
        int i = this.h;
        if (i == 0) {
            return -1;
        }
        int a = a(this.f, i, 0);
        if (a < 0 || this.g[a + a] == null) {
            return a;
        }
        int i2 = a + 1;
        while (i2 < i && this.f[i2] == 0) {
            if (this.g[i2 + i2] == null) {
                return i2;
            }
            i2++;
        }
        int i3 = a - 1;
        while (i3 >= 0 && this.f[i3] == 0) {
            if (this.g[i3 + i3] == null) {
                return i3;
            }
            i3--;
        }
        return i2 ^ -1;
    }

    public final int a(Object obj) {
        return obj != null ? a(obj, obj.hashCode()) : a();
    }

    /* access modifiers changed from: package-private */
    public final int a(Object obj, int i) {
        int i2 = this.h;
        if (i2 == 0) {
            return -1;
        }
        int a = a(this.f, i2, i);
        if (a < 0 || obj.equals(this.g[a + a])) {
            return a;
        }
        int i3 = a + 1;
        while (i3 < i2 && this.f[i3] == i) {
            if (obj.equals(this.g[i3 + i3])) {
                return i3;
            }
            i3++;
        }
        int i4 = a - 1;
        while (i4 >= 0 && this.f[i4] == i) {
            if (obj.equals(this.g[i4 + i4])) {
                return i4;
            }
            i4--;
        }
        return i3 ^ -1;
    }

    public final Object a(int i, Object obj) {
        int i2 = i + i + 1;
        Object[] objArr = this.g;
        Object obj2 = objArr[i2];
        objArr[i2] = obj;
        return obj2;
    }

    public final void a(int i) {
        int i2 = this.h;
        int[] iArr = this.f;
        if (iArr.length < i) {
            Object[] objArr = this.g;
            e(i);
            if (this.h > 0) {
                System.arraycopy(iArr, 0, this.f, 0, i2);
                System.arraycopy(objArr, 0, this.g, 0, i2 + i2);
            }
            a(iArr, objArr, i2);
        }
        if (this.h != i2) {
            throw new ConcurrentModificationException();
        }
    }

    public final void a(ou ouVar) {
        int i = ouVar.h;
        a(this.h + i);
        if (this.h != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                put(ouVar.b(i2), ouVar.c(i2));
            }
        } else if (i > 0) {
            System.arraycopy(ouVar.f, 0, this.f, 0, i);
            System.arraycopy(ouVar.g, 0, this.g, 0, i + i);
            this.h = i;
        }
    }
}
