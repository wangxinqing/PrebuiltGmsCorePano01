package defpackage;

import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* renamed from: anfk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class anfk implements Comparator {
    protected anfk() {
    }

    public static anfk a(Comparator comparator) {
        return comparator instanceof anfk ? (anfk) comparator : new amxw(comparator);
    }

    public Object b(Iterable iterable) {
        return b(iterable.iterator());
    }

    public abstract int compare(Object obj, Object obj2);

    public anfk a() {
        return new anfy(this);
    }

    public Object b(Object obj, Object obj2) {
        return compare(obj, obj2) >= 0 ? obj : obj2;
    }

    public final anfk a(amqy amqy) {
        return new amxf(amqy, this);
    }

    public Object b(Iterator it) {
        Object next = it.next();
        while (it.hasNext()) {
            next = b(next, it.next());
        }
        return next;
    }

    public Object a(Iterable iterable) {
        return a(iterable.iterator());
    }

    public Object a(Object obj, Object obj2) {
        return compare(obj, obj2) <= 0 ? obj : obj2;
    }

    public Object a(Iterator it) {
        Object next = it.next();
        while (it.hasNext()) {
            next = a(next, it.next());
        }
        return next;
    }

    public final List a(Iterable iterable, int i) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            long j = (long) i;
            if (((long) collection.size()) <= j + j) {
                Object[] array = collection.toArray();
                Arrays.sort(array, this);
                if (array.length > i) {
                    array = Arrays.copyOf(array, i);
                }
                return Collections.unmodifiableList(Arrays.asList(array));
            }
        }
        Iterator it = iterable.iterator();
        amrl.a((Object) it);
        amxg.a(i, "k");
        if (i == 0 || !it.hasNext()) {
            return Collections.emptyList();
        }
        if (i >= 1073741823) {
            ArrayList a = anda.a(it);
            Collections.sort(a, this);
            if (a.size() > i) {
                a.subList(i, a.size()).clear();
            }
            a.trimToSize();
            return Collections.unmodifiableList(a);
        }
        anhg anhg = new anhg(this, i);
        while (true) {
            int i2 = 0;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            int i3 = anhg.a;
            if (i3 != 0) {
                int i4 = anhg.d;
                if (i4 == 0) {
                    anhg.c[0] = next;
                    anhg.e = next;
                    anhg.d = 1;
                } else if (i4 < i3) {
                    Object[] objArr = anhg.c;
                    anhg.d = i4 + 1;
                    objArr[i4] = next;
                    if (anhg.b.compare(next, anhg.e) > 0) {
                        anhg.e = next;
                    }
                } else if (anhg.b.compare(next, anhg.e) < 0) {
                    Object[] objArr2 = anhg.c;
                    int i5 = anhg.d;
                    int i6 = i5 + 1;
                    anhg.d = i6;
                    objArr2[i5] = next;
                    int i7 = anhg.a;
                    int i8 = i7 + i7;
                    if (i6 == i8) {
                        int i9 = i8 - 1;
                        int a2 = aons.a(i9, RoundingMode.CEILING) * 3;
                        int i10 = 0;
                        int i11 = 0;
                        while (true) {
                            if (i2 >= i9) {
                                break;
                            }
                            int i12 = ((i2 + i9) + 1) >>> 1;
                            Object[] objArr3 = anhg.c;
                            Object obj = objArr3[i12];
                            objArr3[i12] = objArr3[i9];
                            int i13 = i2;
                            int i14 = i13;
                            while (i13 < i9) {
                                if (anhg.b.compare(anhg.c[i13], obj) < 0) {
                                    Object[] objArr4 = anhg.c;
                                    Object obj2 = objArr4[i14];
                                    objArr4[i14] = objArr4[i13];
                                    objArr4[i13] = obj2;
                                    i14++;
                                }
                                i13++;
                            }
                            Object[] objArr5 = anhg.c;
                            objArr5[i9] = objArr5[i14];
                            objArr5[i14] = obj;
                            int i15 = anhg.a;
                            if (i14 <= i15) {
                                if (i14 >= i15) {
                                    break;
                                }
                                i2 = Math.max(i14, i2 + 1);
                                i10 = i14;
                            } else {
                                i9 = i14 - 1;
                            }
                            i11++;
                            if (i11 >= a2) {
                                Arrays.sort(anhg.c, i2, i9, anhg.b);
                                break;
                            }
                        }
                        anhg.d = anhg.a;
                        anhg.e = anhg.c[i10];
                        for (int i16 = i10 + 1; i16 < anhg.a; i16++) {
                            if (anhg.b.compare(anhg.c[i16], anhg.e) > 0) {
                                anhg.e = anhg.c[i16];
                            }
                        }
                    }
                }
            }
        }
        Arrays.sort(anhg.c, 0, anhg.d, anhg.b);
        int i17 = anhg.d;
        int i18 = anhg.a;
        if (i17 > i18) {
            Object[] objArr6 = anhg.c;
            Arrays.fill(objArr6, i18, objArr6.length, (Object) null);
            i17 = anhg.a;
            anhg.d = i17;
            anhg.e = anhg.c[i17 - 1];
        }
        return Collections.unmodifiableList(Arrays.asList(Arrays.copyOf(anhg.c, i17)));
    }
}
