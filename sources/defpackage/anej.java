package defpackage;

import com.google.android.cast.JGCastService;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* renamed from: anej  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class anej extends AbstractMap implements ConcurrentMap, Serializable {
    static final aneg g = new andc();
    private static final long serialVersionUID = 5;
    final transient int a;
    final transient int b;
    final transient andp[] c;
    final int d;
    final amqw e;
    final transient andl f;
    transient Set h;
    transient Collection i;
    transient Set j;

    public anej(andb andb, andl andl) {
        this.d = Math.min(andb.b(), 65536);
        this.e = (amqw) amrh.a(andb.f, andb.c().a());
        this.f = andl;
        int min = Math.min(andb.a(), JGCastService.FLAG_PRIVATE_DISPLAY);
        int i2 = 0;
        int i3 = 1;
        int i4 = 1;
        int i5 = 0;
        while (i4 < this.d) {
            i5++;
            i4 += i4;
        }
        this.b = 32 - i5;
        this.a = i4 - 1;
        this.c = new andp[i4];
        int i6 = min / i4;
        while (i3 < (i4 * i6 < min ? i6 + 1 : i6)) {
            i3 += i3;
        }
        while (true) {
            andp[] andpArr = this.c;
            if (i2 < andpArr.length) {
                andpArr[i2] = this.f.a(this, i3);
                i2++;
            } else {
                return;
            }
        }
    }

    public static ArrayList a(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        ance.a((Collection) arrayList, collection.iterator());
        return arrayList;
    }

    public final void clear() {
        andp[] andpArr = this.c;
        int length = andpArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            andp andp = andpArr[i2];
            if (andp.b != 0) {
                andp.lock();
                try {
                    AtomicReferenceArray atomicReferenceArray = andp.e;
                    for (int i3 = 0; i3 < atomicReferenceArray.length(); i3++) {
                        atomicReferenceArray.set(i3, (Object) null);
                    }
                    andp.b();
                    andp.g.set(0);
                    andp.c++;
                    andp.b = 0;
                } finally {
                    andp.unlock();
                }
            }
        }
    }

    public final boolean containsKey(Object obj) {
        andk a2;
        boolean z = false;
        if (obj == null) {
            return false;
        }
        int a3 = a(obj);
        andp a4 = a(a3);
        try {
            if (!(a4.b == 0 || (a2 = a4.a(obj, a3)) == null || a2.d() == null)) {
                z = true;
            }
            return z;
        } finally {
            a4.d();
        }
    }

    public final boolean containsValue(Object obj) {
        Object obj2;
        Object obj3 = obj;
        if (obj3 != null) {
            andp[] andpArr = this.c;
            long j2 = -1;
            int i2 = 0;
            while (i2 < 3) {
                long j3 = 0;
                for (andp andp : andpArr) {
                    int i3 = andp.b;
                    AtomicReferenceArray atomicReferenceArray = andp.e;
                    for (int i4 = 0; i4 < atomicReferenceArray.length(); i4++) {
                        for (andk andk = (andk) atomicReferenceArray.get(i4); andk != null; andk = andk.c()) {
                            if (andk.a() == null) {
                                andp.c();
                                obj2 = null;
                            } else {
                                obj2 = andk.d();
                                if (obj2 == null) {
                                    andp.c();
                                    obj2 = null;
                                }
                            }
                            if (obj2 != null && a().b(obj3, obj2)) {
                                return true;
                            }
                        }
                    }
                    j3 += (long) andp.c;
                }
                if (j3 == j2) {
                    return false;
                }
                i2++;
                j2 = j3;
            }
            return false;
        }
        return false;
    }

    public final Set entrySet() {
        Set set = this.j;
        if (set != null) {
            return set;
        }
        andi andi = new andi(this);
        this.j = andi;
        return andi;
    }

    public final Object get(Object obj) {
        Object obj2 = null;
        if (obj == null) {
            return null;
        }
        int a2 = a(obj);
        andp a3 = a(a2);
        try {
            andk a4 = a3.a(obj, a2);
            if (a4 != null) {
                obj2 = a4.d();
                if (obj2 == null) {
                    a3.c();
                }
            }
            return obj2;
        } finally {
            a3.d();
        }
    }

    public final boolean isEmpty() {
        andp[] andpArr = this.c;
        long j2 = 0;
        for (int i2 = 0; i2 < andpArr.length; i2++) {
            if (andpArr[i2].b != 0) {
                return false;
            }
            j2 += (long) andpArr[i2].c;
        }
        if (j2 == 0) {
            return true;
        }
        for (int i3 = 0; i3 < andpArr.length; i3++) {
            if (andpArr[i3].b != 0) {
                return false;
            }
            j2 -= (long) andpArr[i3].c;
        }
        if (j2 == 0) {
            return true;
        }
        return false;
    }

    public final Set keySet() {
        Set set = this.h;
        if (set != null) {
            return set;
        }
        andn andn = new andn(this);
        this.h = andn;
        return andn;
    }

    public final Object put(Object obj, Object obj2) {
        amrl.a(obj);
        amrl.a(obj2);
        int a2 = a(obj);
        return a(a2).a(obj, a2, obj2, false);
    }

    public final void putAll(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        amrl.a(obj);
        amrl.a(obj2);
        int a2 = a(obj);
        return a(a2).a(obj, a2, obj2, true);
    }

    /* JADX INFO: finally extract failed */
    public final Object remove(Object obj) {
        if (obj == null) {
            return null;
        }
        int a2 = a(obj);
        andp a3 = a(a2);
        a3.lock();
        try {
            a3.e();
            int i2 = a3.b;
            AtomicReferenceArray atomicReferenceArray = a3.e;
            int length = (atomicReferenceArray.length() - 1) & a2;
            andk andk = (andk) atomicReferenceArray.get(length);
            andk andk2 = andk;
            while (true) {
                if (andk2 == null) {
                    break;
                }
                Object a4 = andk2.a();
                if (andk2.b() == a2) {
                    if (a4 != null && a3.a.e.b(obj, a4)) {
                        Object d2 = andk2.d();
                        if (d2 == null) {
                            if (!andp.a(andk2)) {
                            }
                        }
                        a3.c++;
                        atomicReferenceArray.set(length, a3.b(andk, andk2));
                        a3.b--;
                        a3.unlock();
                        return d2;
                    }
                }
                andk2 = andk2.c();
            }
            a3.unlock();
            return null;
        } catch (Throwable th) {
            a3.unlock();
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003e, code lost:
        r10 = r5.d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0042, code lost:
        if (r10 == null) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0044, code lost:
        r1.c++;
        r1.a(r5, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004d, code lost:
        r1.unlock();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0056, code lost:
        if (defpackage.andp.a(r5) == false) goto L_0x0073;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0058, code lost:
        r10 = r1.b;
        r1.c++;
        r2.set(r3, r1.b(r4, r5));
        r1.b--;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        return r10;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object replace(java.lang.Object r10, java.lang.Object r11) {
        /*
            r9 = this;
            defpackage.amrl.a((java.lang.Object) r10)
            defpackage.amrl.a((java.lang.Object) r11)
            int r0 = r9.a((java.lang.Object) r10)
            andp r1 = r9.a((int) r0)
            r1.lock()
            r1.e()     // Catch:{ all -> 0x0077 }
            java.util.concurrent.atomic.AtomicReferenceArray r2 = r1.e     // Catch:{ all -> 0x0077 }
            int r3 = r2.length()     // Catch:{ all -> 0x0077 }
            int r3 = r3 + -1
            r3 = r3 & r0
            java.lang.Object r4 = r2.get(r3)     // Catch:{ all -> 0x0077 }
            andk r4 = (defpackage.andk) r4     // Catch:{ all -> 0x0077 }
            r5 = r4
        L_0x0024:
            r6 = 0
            if (r5 == 0) goto L_0x0073
            java.lang.Object r7 = r5.a()     // Catch:{ all -> 0x0077 }
            int r8 = r5.b()     // Catch:{ all -> 0x0077 }
            if (r8 == r0) goto L_0x0032
            goto L_0x006e
        L_0x0032:
            if (r7 == 0) goto L_0x006e
            anej r8 = r1.a     // Catch:{ all -> 0x0077 }
            amqw r8 = r8.e     // Catch:{ all -> 0x0077 }
            boolean r7 = r8.b(r10, r7)     // Catch:{ all -> 0x0077 }
            if (r7 == 0) goto L_0x006e
            java.lang.Object r10 = r5.d()     // Catch:{ all -> 0x0077 }
            if (r10 == 0) goto L_0x0052
            int r0 = r1.c     // Catch:{ all -> 0x0077 }
            int r0 = r0 + 1
            r1.c = r0     // Catch:{ all -> 0x0077 }
            r1.a((defpackage.andk) r5, (java.lang.Object) r11)     // Catch:{ all -> 0x0077 }
            r1.unlock()
            r6 = r10
            goto L_0x0076
        L_0x0052:
            boolean r10 = defpackage.andp.a((defpackage.andk) r5)     // Catch:{ all -> 0x0077 }
            if (r10 == 0) goto L_0x0073
            int r10 = r1.b     // Catch:{ all -> 0x0077 }
            int r10 = r1.c     // Catch:{ all -> 0x0077 }
            int r10 = r10 + 1
            r1.c = r10     // Catch:{ all -> 0x0077 }
            andk r10 = r1.b(r4, r5)     // Catch:{ all -> 0x0077 }
            int r11 = r1.b     // Catch:{ all -> 0x0077 }
            int r11 = r11 + -1
            r2.set(r3, r10)     // Catch:{ all -> 0x0077 }
            r1.b = r11     // Catch:{ all -> 0x0077 }
            goto L_0x0073
        L_0x006e:
            andk r5 = r5.c()     // Catch:{ all -> 0x0077 }
            goto L_0x0024
        L_0x0073:
            r1.unlock()
        L_0x0076:
            return r6
        L_0x0077:
            r10 = move-exception
            r1.unlock()
            goto L_0x007d
        L_0x007c:
            throw r10
        L_0x007d:
            goto L_0x007c
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.anej.replace(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public final int size() {
        andp[] andpArr = this.c;
        long j2 = 0;
        for (andp andp : andpArr) {
            j2 += (long) andp.b;
        }
        return aoog.b(j2);
    }

    public final Collection values() {
        Collection collection = this.i;
        if (collection != null) {
            return collection;
        }
        andy andy = new andy(this);
        this.i = andy;
        return andy;
    }

    /* access modifiers changed from: package-private */
    public Object writeReplace() {
        andr a2 = this.f.a();
        andr b2 = this.f.b();
        amqw amqw = this.e;
        this.f.b().a();
        return new andq(a2, b2, amqw, this.d, this);
    }

    /* access modifiers changed from: package-private */
    public final int a(Object obj) {
        int b2 = this.e.b(obj);
        int i2 = b2 + ((b2 << 15) ^ -12931);
        int i3 = i2 ^ (i2 >>> 10);
        int i4 = i3 + (i3 << 3);
        int i5 = i4 ^ (i4 >>> 6);
        int i6 = i5 + (i5 << 2) + (i5 << 14);
        return i6 ^ (i6 >>> 16);
    }

    /* access modifiers changed from: package-private */
    public final amqw a() {
        return this.f.b().a();
    }

    /* access modifiers changed from: package-private */
    public final andp a(int i2) {
        return this.c[(i2 >>> this.b) & this.a];
    }

    public final boolean remove(Object obj, Object obj2) {
        boolean z = false;
        if (obj == null || obj2 == null) {
            return false;
        }
        int a2 = a(obj);
        andp a3 = a(a2);
        a3.lock();
        try {
            a3.e();
            int i2 = a3.b;
            AtomicReferenceArray atomicReferenceArray = a3.e;
            int length = (atomicReferenceArray.length() - 1) & a2;
            andk andk = (andk) atomicReferenceArray.get(length);
            andk andk2 = andk;
            while (true) {
                if (andk2 == null) {
                    break;
                }
                Object a4 = andk2.a();
                if (andk2.b() == a2) {
                    if (a4 != null && a3.a.e.b(obj, a4)) {
                        if (a3.a.a().b(obj2, andk2.d())) {
                            z = true;
                        } else if (!andp.a(andk2)) {
                        }
                        a3.c++;
                        atomicReferenceArray.set(length, a3.b(andk, andk2));
                        a3.b--;
                    }
                }
                andk2 = andk2.c();
            }
            return z;
        } finally {
            a3.unlock();
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0041, code lost:
        r11 = r6.d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0045, code lost:
        if (r11 == null) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0051, code lost:
        if (r2.a.a().b(r12, r11) == false) goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0053, code lost:
        r2.c++;
        r2.a(r6, r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005b, code lost:
        r2.unlock();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0064, code lost:
        if (defpackage.andp.a(r6) == false) goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0066, code lost:
        r11 = r2.b;
        r2.c++;
        r3.set(r4, r2.b(r5, r6));
        r2.b--;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean replace(java.lang.Object r11, java.lang.Object r12, java.lang.Object r13) {
        /*
            r10 = this;
            defpackage.amrl.a((java.lang.Object) r11)
            defpackage.amrl.a((java.lang.Object) r13)
            r0 = 0
            if (r12 == 0) goto L_0x0089
            int r1 = r10.a((java.lang.Object) r11)
            andp r2 = r10.a((int) r1)
            r2.lock()
            r2.e()     // Catch:{ all -> 0x0084 }
            java.util.concurrent.atomic.AtomicReferenceArray r3 = r2.e     // Catch:{ all -> 0x0084 }
            int r4 = r3.length()     // Catch:{ all -> 0x0084 }
            int r4 = r4 + -1
            r4 = r4 & r1
            java.lang.Object r5 = r3.get(r4)     // Catch:{ all -> 0x0084 }
            andk r5 = (defpackage.andk) r5     // Catch:{ all -> 0x0084 }
            r6 = r5
        L_0x0027:
            r7 = 1
            if (r6 == 0) goto L_0x0080
            java.lang.Object r8 = r6.a()     // Catch:{ all -> 0x0084 }
            int r9 = r6.b()     // Catch:{ all -> 0x0084 }
            if (r9 == r1) goto L_0x0035
            goto L_0x007b
        L_0x0035:
            if (r8 == 0) goto L_0x007b
            anej r9 = r2.a     // Catch:{ all -> 0x0084 }
            amqw r9 = r9.e     // Catch:{ all -> 0x0084 }
            boolean r8 = r9.b(r11, r8)     // Catch:{ all -> 0x0084 }
            if (r8 == 0) goto L_0x007b
            java.lang.Object r11 = r6.d()     // Catch:{ all -> 0x0084 }
            if (r11 == 0) goto L_0x0060
            anej r1 = r2.a     // Catch:{ all -> 0x0084 }
            amqw r1 = r1.a()     // Catch:{ all -> 0x0084 }
            boolean r11 = r1.b(r12, r11)     // Catch:{ all -> 0x0084 }
            if (r11 == 0) goto L_0x0080
            int r11 = r2.c     // Catch:{ all -> 0x0084 }
            int r11 = r11 + r7
            r2.c = r11     // Catch:{ all -> 0x0084 }
            r2.a((defpackage.andk) r6, (java.lang.Object) r13)     // Catch:{ all -> 0x0084 }
            r2.unlock()
            r0 = 1
            goto L_0x0083
        L_0x0060:
            boolean r11 = defpackage.andp.a((defpackage.andk) r6)     // Catch:{ all -> 0x0084 }
            if (r11 == 0) goto L_0x0080
            int r11 = r2.b     // Catch:{ all -> 0x0084 }
            int r11 = r2.c     // Catch:{ all -> 0x0084 }
            int r11 = r11 + r7
            r2.c = r11     // Catch:{ all -> 0x0084 }
            andk r11 = r2.b(r5, r6)     // Catch:{ all -> 0x0084 }
            int r12 = r2.b     // Catch:{ all -> 0x0084 }
            int r12 = r12 + -1
            r3.set(r4, r11)     // Catch:{ all -> 0x0084 }
            r2.b = r12     // Catch:{ all -> 0x0084 }
            goto L_0x0080
        L_0x007b:
            andk r6 = r6.c()     // Catch:{ all -> 0x0084 }
            goto L_0x0027
        L_0x0080:
            r2.unlock()
        L_0x0083:
            return r0
        L_0x0084:
            r11 = move-exception
            r2.unlock()
            throw r11
        L_0x0089:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.anej.replace(java.lang.Object, java.lang.Object, java.lang.Object):boolean");
    }
}
