package defpackage;

import com.google.android.cast.JGCastService;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;

/* renamed from: anax  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class anax extends amzn implements Set {
    private transient amzy a;

    public static anax a(int i, Object... objArr) {
        if (i == 0) {
            return anfv.a;
        }
        if (i == 1) {
            return a(objArr[0]);
        }
        int b = b(i);
        Object[] objArr2 = new Object[b];
        int i2 = b - 1;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            Object obj = objArr[i5];
            anfi.a(obj, i5);
            int hashCode = obj.hashCode();
            int a2 = amzi.a(hashCode);
            while (true) {
                int i6 = a2 & i2;
                Object obj2 = objArr2[i6];
                if (obj2 != null) {
                    if (obj2.equals(obj)) {
                        break;
                    }
                    a2++;
                } else {
                    objArr[i4] = obj;
                    objArr2[i6] = obj;
                    i3 += hashCode;
                    i4++;
                    break;
                }
            }
        }
        Arrays.fill(objArr, i4, i, (Object) null);
        if (i4 == 1) {
            return new angn(objArr[0], i3);
        }
        if (b(i4) < b / 2) {
            return a(i4, objArr);
        }
        return new anfv(a(i4, objArr.length) ? Arrays.copyOf(objArr, i4) : objArr, i3, objArr2, i2, i4);
    }

    public static boolean a(int i, int i2) {
        return i < (i2 >> 1) + (i2 >> 2);
    }

    static int b(int i) {
        boolean z;
        double d;
        int max = Math.max(i, 2);
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1);
            do {
                highestOneBit += highestOneBit;
                d = (double) highestOneBit;
                Double.isNaN(d);
            } while (d * 0.7d < ((double) max));
            return highestOneBit;
        }
        if (max < 1073741824) {
            z = true;
        } else {
            z = false;
        }
        amrl.a(z, (Object) "collection too large");
        return JGCastService.FLAG_PRIVATE_DISPLAY;
    }

    public static anav c(int i) {
        amxg.a(i, "expectedSize");
        return new anav(i);
    }

    public static anav j() {
        return new anav();
    }

    /* renamed from: a */
    public abstract anhj iterator();

    public amzy e() {
        amzy amzy = this.a;
        if (amzy != null) {
            return amzy;
        }
        amzy i = i();
        this.a = i;
        return i;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof anax) || !g() || !((anax) obj).g() || hashCode() == obj.hashCode()) {
            return angm.a((Set) this, obj);
        }
        return false;
    }

    public boolean g() {
        return false;
    }

    public int hashCode() {
        return angm.a((Set) this);
    }

    public amzy i() {
        return amzy.b(toArray());
    }

    /* access modifiers changed from: package-private */
    public Object writeReplace() {
        return new anaw(toArray());
    }

    public static anax a(Iterable iterable) {
        if (iterable instanceof Collection) {
            return a((Collection) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return anfv.a;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return a(next);
        }
        anav anav = new anav();
        anav.b(next);
        amrl.a((Object) it);
        while (it.hasNext()) {
            anav.b(it.next());
        }
        return anav.a();
    }

    public static anax a(Object obj) {
        return new angn(obj);
    }

    public static anax a(Object obj, Object obj2) {
        return a(2, obj, obj2);
    }

    public static anax a(Object obj, Object obj2, Object obj3) {
        return a(3, obj, obj2, obj3);
    }

    public static anax a(Object obj, Object obj2, Object obj3, Object obj4) {
        return a(4, obj, obj2, obj3, obj4);
    }

    public static anax a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return a(5, obj, obj2, obj3, obj4, obj5);
    }

    @SafeVarargs
    public static anax a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object... objArr) {
        amrl.a(true, (Object) "the total number of elements must fit in an int");
        int length = objArr.length;
        int i = length + 6;
        Object[] objArr2 = new Object[i];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        System.arraycopy(objArr, 0, objArr2, 6, length);
        return a(i, objArr2);
    }

    public static anax a(Collection collection) {
        if ((collection instanceof anax) && !(collection instanceof SortedSet)) {
            anax anax = (anax) collection;
            if (!anax.f()) {
                return anax;
            }
        }
        Object[] array = collection.toArray();
        return a(array.length, array);
    }

    public static anax a(Object[] objArr) {
        int length = objArr.length;
        if (length == 0) {
            return anfv.a;
        }
        if (length != 1) {
            return a(length, (Object[]) objArr.clone());
        }
        return a(objArr[0]);
    }
}
