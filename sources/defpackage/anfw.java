package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: anfw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class anfw extends anbh {
    static final anfw c = new anfw(amzy.h(), anfh.a);
    final transient amzy d;

    public anfw(amzy amzy, Comparator comparator) {
        super(comparator);
        this.d = amzy;
    }

    public final int a(Object[] objArr, int i) {
        return this.d.a(objArr, i);
    }

    public final anbh b(Object obj, boolean z, Object obj2, boolean z2) {
        return d(obj, z).c(obj2, z2);
    }

    public final int c() {
        return this.d.c();
    }

    public final Object ceiling(Object obj) {
        int f = f(obj, true);
        if (f != size()) {
            return this.d.get(f);
        }
        return null;
    }

    public final boolean contains(Object obj) {
        if (obj != null) {
            try {
                if (Collections.binarySearch(this.d, obj, this.a) >= 0) {
                    return true;
                }
            } catch (ClassCastException e) {
            }
        }
        return false;
    }

    public final boolean containsAll(Collection collection) {
        if (collection instanceof anfc) {
            collection = ((anfc) collection).d();
        }
        if (!angp.a(this.a, collection) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        anhj a = iterator();
        Iterator it = collection.iterator();
        if (a.hasNext()) {
            Object next = it.next();
            Object next2 = a.next();
            while (true) {
                try {
                    int b = b(next2, next);
                    if (b < 0) {
                        if (!a.hasNext()) {
                            return false;
                        }
                        next2 = a.next();
                    } else if (b != 0) {
                        return false;
                    } else {
                        if (!it.hasNext()) {
                            return true;
                        }
                        next = it.next();
                    }
                } catch (ClassCastException | NullPointerException e) {
                }
            }
        }
        return false;
    }

    public final int d() {
        return this.d.d();
    }

    /* access modifiers changed from: package-private */
    public final int e(Object obj, boolean z) {
        amzy amzy = this.d;
        amrl.a(obj);
        int binarySearch = Collections.binarySearch(amzy, obj, this.a);
        if (binarySearch >= 0) {
            return z ? binarySearch + 1 : binarySearch;
        }
        return binarySearch ^ -1;
    }

    public final amzy e() {
        return this.d;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0030 A[Catch:{ ClassCastException -> 0x0044, NoSuchElementException -> 0x0042 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 1
            if (r6 == r5) goto L_0x004d
            boolean r1 = r6 instanceof java.util.Set
            r2 = 0
            if (r1 == 0) goto L_0x004c
            java.util.Set r6 = (java.util.Set) r6
            int r1 = r5.size()
            int r3 = r6.size()
            if (r1 != r3) goto L_0x004c
            boolean r1 = r5.isEmpty()
            if (r1 != 0) goto L_0x004b
            java.util.Comparator r1 = r5.a
            boolean r1 = defpackage.angp.a(r1, r6)
            if (r1 == 0) goto L_0x0046
            java.util.Iterator r6 = r6.iterator()
            anhj r1 = r5.iterator()     // Catch:{ ClassCastException -> 0x0044, NoSuchElementException -> 0x0042 }
        L_0x002a:
            boolean r3 = r1.hasNext()     // Catch:{ ClassCastException -> 0x0044, NoSuchElementException -> 0x0042 }
            if (r3 == 0) goto L_0x0041
            java.lang.Object r3 = r1.next()     // Catch:{ ClassCastException -> 0x0044, NoSuchElementException -> 0x0042 }
            java.lang.Object r4 = r6.next()     // Catch:{ ClassCastException -> 0x0044, NoSuchElementException -> 0x0042 }
            if (r4 == 0) goto L_0x0040
            int r3 = r5.b((java.lang.Object) r3, (java.lang.Object) r4)     // Catch:{ ClassCastException -> 0x0044, NoSuchElementException -> 0x0042 }
            if (r3 == 0) goto L_0x002a
        L_0x0040:
            return r2
        L_0x0041:
            return r0
        L_0x0042:
            r6 = move-exception
            return r2
        L_0x0044:
            r6 = move-exception
            return r2
        L_0x0046:
            boolean r6 = r5.containsAll(r6)
            return r6
        L_0x004b:
            return r0
        L_0x004c:
            return r2
        L_0x004d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.anfw.equals(java.lang.Object):boolean");
    }

    /* access modifiers changed from: package-private */
    public final int f(Object obj, boolean z) {
        amzy amzy = this.d;
        amrl.a(obj);
        int binarySearch = Collections.binarySearch(amzy, obj, this.a);
        if (binarySearch >= 0) {
            return !z ? binarySearch + 1 : binarySearch;
        }
        return binarySearch ^ -1;
    }

    public final Object first() {
        if (!isEmpty()) {
            return this.d.get(0);
        }
        throw new NoSuchElementException();
    }

    public final Object floor(Object obj) {
        int e = e(obj, true) - 1;
        if (e != -1) {
            return this.d.get(e);
        }
        return null;
    }

    public final Object higher(Object obj) {
        int f = f(obj, false);
        if (f != size()) {
            return this.d.get(f);
        }
        return null;
    }

    public final anbh k() {
        Comparator reverseOrder = Collections.reverseOrder(this.a);
        return isEmpty() ? a(reverseOrder) : new anfw(this.d.g(), reverseOrder);
    }

    /* renamed from: l */
    public final anhj descendingIterator() {
        return this.d.g().listIterator();
    }

    public final Object last() {
        if (!isEmpty()) {
            return this.d.get(size() - 1);
        }
        throw new NoSuchElementException();
    }

    public final Object lower(Object obj) {
        int e = e(obj, false) - 1;
        if (e != -1) {
            return this.d.get(e);
        }
        return null;
    }

    public final int size() {
        return this.d.size();
    }

    /* renamed from: a */
    public final anhj iterator() {
        return this.d.listIterator();
    }

    /* access modifiers changed from: package-private */
    public final anfw b(int i, int i2) {
        if (i == 0 && i2 == size()) {
            return this;
        }
        if (i < i2) {
            return new anfw(this.d.subList(i, i2), this.a);
        }
        return a(this.a);
    }

    public final anbh c(Object obj, boolean z) {
        return b(0, e(obj, z));
    }

    public final anbh d(Object obj, boolean z) {
        return b(f(obj, z), size());
    }

    public final boolean f() {
        return this.d.f();
    }

    public final Object[] b() {
        return this.d.b();
    }
}
