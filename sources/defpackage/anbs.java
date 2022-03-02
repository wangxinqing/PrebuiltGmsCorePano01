package defpackage;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: anbs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class anbs {
    static amqy a() {
        return new anbl();
    }

    public static Iterable b(Iterable iterable, int i) {
        boolean z;
        amrl.a((Object) iterable);
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        amrl.a(z, (Object) "number to skip cannot be negative");
        return new anbp(iterable, i);
    }

    public static boolean c(Iterable iterable, amrm amrm) {
        amrl.a((Object) amrm);
        for (Object a : iterable) {
            if (!amrm.a(a)) {
                return false;
            }
        }
        return true;
    }

    public static amri d(Iterable iterable, amrm amrm) {
        Iterator it = iterable.iterator();
        amrl.a((Object) it);
        amrl.a((Object) amrm);
        while (it.hasNext()) {
            Object next = it.next();
            if (amrm.a(next)) {
                return amri.b(next);
            }
        }
        return ampu.a;
    }

    public static int e(Iterable iterable, amrm amrm) {
        return ance.b(iterable.iterator(), amrm);
    }

    private static Collection f(Iterable iterable) {
        return iterable instanceof Collection ? (Collection) iterable : anda.a(iterable.iterator());
    }

    public static Iterable a(Iterable iterable, amqy amqy) {
        amrl.a((Object) iterable);
        amrl.a((Object) amqy);
        return new anbn(iterable, amqy);
    }

    public static Object e(Iterable iterable) {
        return ance.g(iterable.iterator());
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.util.List, java.lang.Iterable] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void f(java.lang.Iterable r1, defpackage.amrm r2) {
        /*
            boolean r0 = r1 instanceof java.util.RandomAccess
            if (r0 == 0) goto L_0x0010
            boolean r0 = r1 instanceof java.util.List
            if (r0 != 0) goto L_0x0009
            goto L_0x0010
        L_0x0009:
            defpackage.amrl.a((java.lang.Object) r2)
            a((java.util.List) r1, (defpackage.amrm) r2)
            return
        L_0x0010:
            java.util.Iterator r1 = r1.iterator()
            defpackage.ance.c(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.anbs.f(java.lang.Iterable, amrm):void");
    }

    public static Iterable a(Iterable iterable, amrm amrm) {
        amrl.a((Object) iterable);
        amrl.a((Object) amrm);
        return new anbm(iterable, amrm);
    }

    public static Object b(Iterable iterable) {
        return ance.b(iterable.iterator());
    }

    public static Object[] c(Iterable iterable) {
        return f(iterable).toArray();
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.util.List, java.lang.Iterable] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object d(java.lang.Iterable r1) {
        /*
            boolean r0 = r1 instanceof java.util.List
            if (r0 == 0) goto L_0x0015
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x000f
            java.lang.Object r1 = a((java.util.List) r1)
            return r1
        L_0x000f:
            java.util.NoSuchElementException r1 = new java.util.NoSuchElementException
            r1.<init>()
            throw r1
        L_0x0015:
            java.util.Iterator r1 = r1.iterator()
            java.lang.Object r1 = defpackage.ance.d(r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.anbs.d(java.lang.Iterable):java.lang.Object");
    }

    public static Object a(Iterable iterable, int i) {
        amrl.a((Object) iterable);
        if (iterable instanceof List) {
            return ((List) iterable).get(i);
        }
        Iterator it = iterable.iterator();
        if (i >= 0) {
            int a = ance.a(it, i);
            if (it.hasNext()) {
                return it.next();
            }
            StringBuilder sb = new StringBuilder(91);
            sb.append("position (");
            sb.append(i);
            sb.append(") must be less than the number of elements that remained (");
            sb.append(a);
            sb.append(")");
            throw new IndexOutOfBoundsException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder(43);
        sb2.append("position (");
        sb2.append(i);
        sb2.append(") must not be negative");
        throw new IndexOutOfBoundsException(sb2.toString());
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.util.Collection, java.lang.Iterable] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object b(java.lang.Iterable r1, java.lang.Object r2) {
        /*
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L_0x0017
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0016
            boolean r0 = r1 instanceof java.util.List
            if (r0 != 0) goto L_0x000f
            goto L_0x0017
        L_0x000f:
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r1 = a((java.util.List) r1)
            return r1
        L_0x0016:
            return r2
        L_0x0017:
            java.util.Iterator r1 = r1.iterator()
            java.lang.Object r1 = defpackage.ance.b((java.util.Iterator) r1, (java.lang.Object) r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.anbs.b(java.lang.Iterable, java.lang.Object):java.lang.Object");
    }

    private static Object a(List list) {
        return list.get(list.size() - 1);
    }

    public static String a(Iterable iterable) {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        boolean z = true;
        for (Object append : iterable) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(append);
            z = false;
        }
        sb.append(']');
        return sb.toString();
    }

    public static boolean b(Iterable iterable, amrm amrm) {
        return ance.b(iterable.iterator(), amrm) != -1;
    }

    private static void a(List list, amrm amrm) {
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            Object obj = list.get(i2);
            if (!amrm.a(obj)) {
                if (i2 > i) {
                    try {
                        list.set(i, obj);
                    } catch (UnsupportedOperationException e) {
                        a(list, amrm, i, i2);
                        return;
                    } catch (IllegalArgumentException e2) {
                        a(list, amrm, i, i2);
                        return;
                    }
                }
                i++;
            }
        }
        list.subList(i, list.size()).clear();
    }

    private static void a(List list, amrm amrm, int i, int i2) {
        for (int size = list.size() - 1; size > i2; size--) {
            if (amrm.a(list.get(size))) {
                list.remove(size);
            }
        }
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            list.remove(i3);
        }
    }

    public static boolean a(Iterable iterable, Object obj) {
        return ance.a(iterable.iterator(), obj);
    }

    public static boolean a(Collection collection, Iterable iterable) {
        if (iterable instanceof Collection) {
            return collection.addAll((Collection) iterable);
        }
        amrl.a((Object) iterable);
        return ance.a(collection, iterable.iterator());
    }

    public static Object[] a(Iterable iterable, Class cls) {
        return a(iterable, (Object[]) Array.newInstance(cls, 0));
    }

    static Object[] a(Iterable iterable, Object[] objArr) {
        return f(iterable).toArray(objArr);
    }
}
