package defpackage;

import com.google.android.cast.JGCastService;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.logging.Logger;

/* renamed from: amvo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class amvo extends AbstractMap implements ConcurrentMap {
    static final Logger a = Logger.getLogger(amvo.class.getName());
    static final amva s = new amts();
    static final Queue t = new amtt();
    final int b;
    final int c;
    final amur[] d;
    final int e;
    final amqw f;
    final amqw g;
    final amut h;
    final amut i;
    final long j;
    final amvt k;
    final long l;
    final long m;
    final Queue n;
    final amvr o;
    final amtd p;
    final amuf q;
    final amtp r;
    Set u;
    Collection v;
    Set w;

    public amvo(amtm amtm, amtp amtp) {
        Queue queue;
        boolean z;
        boolean z2;
        amtm amtm2 = amtm;
        int i2 = amtm2.d;
        this.e = Math.min(i2 == -1 ? 4 : i2, 65536);
        this.h = amtm.b();
        this.i = amtm.c();
        this.f = (amqw) amrh.a(amtm2.l, amtm.b().a());
        this.g = (amqw) amrh.a(amtm2.m, amtm.c().a());
        long j2 = 0;
        this.j = (amtm2.j == 0 || amtm2.k == 0) ? 0 : amtm2.g != null ? amtm2.f : amtm2.e;
        this.k = (amvt) amrh.a(amtm2.g, amtl.a);
        long j3 = amtm2.k;
        this.l = j3 == -1 ? 0 : j3;
        long j4 = amtm2.j;
        this.m = j4 != -1 ? j4 : j2;
        amvr amvr = (amvr) amrh.a(amtm2.n, amtk.a);
        this.o = amvr;
        if (amvr != amtk.a) {
            queue = new ConcurrentLinkedQueue();
        } else {
            queue = t;
        }
        this.n = queue;
        int i3 = 0;
        int i4 = 1;
        boolean z3 = !f() ? d() : true;
        amtd amtd = amtm2.o;
        this.p = amtd == null ? z3 ? amtd.a : amtm.b : amtd;
        amut amut = this.h;
        if (!e()) {
            z = d();
        } else {
            z = true;
        }
        if (!c()) {
            z2 = f();
        } else {
            z2 = true;
        }
        this.q = amuf.a(amut, z, z2);
        amti amti = (amti) ((amsz) amtm2.p).a;
        this.r = amtp;
        int min = Math.min(16, JGCastService.FLAG_PRIVATE_DISPLAY);
        if (a() && !b()) {
            min = (int) Math.min((long) min, this.j);
        }
        int i5 = 1;
        int i6 = 0;
        while (i5 < this.e && (!a() || ((long) (i5 * 20)) <= this.j)) {
            i6++;
            i5 += i5;
        }
        this.c = 32 - i6;
        this.b = i5 - 1;
        this.d = new amur[i5];
        int i7 = min / i5;
        while (i4 < (i7 * i5 < min ? i7 + 1 : i7)) {
            i4 += i4;
        }
        if (a()) {
            long j5 = this.j;
            long j6 = (long) i5;
            long j7 = (j5 / j6) + 1;
            long j8 = j5 % j6;
            while (true) {
                amur[] amurArr = this.d;
                if (i3 < amurArr.length) {
                    if (((long) i3) == j8) {
                        j7--;
                    }
                    amurArr[i3] = a(i4, j7, (amti) ((amsz) amtm2.p).a);
                    i3++;
                } else {
                    return;
                }
            }
        } else {
            while (true) {
                amur[] amurArr2 = this.d;
                if (i3 < amurArr2.length) {
                    amurArr2[i3] = a(i4, -1, (amti) ((amsz) amtm2.p).a);
                    i3++;
                } else {
                    return;
                }
            }
        }
    }

    public static ArrayList a(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        ance.a((Collection) arrayList, collection.iterator());
        return arrayList;
    }

    static amvp i() {
        return amuq.a;
    }

    /* access modifiers changed from: package-private */
    public final boolean a() {
        return this.j >= 0;
    }

    /* access modifiers changed from: package-private */
    public final boolean c() {
        return this.m > 0;
    }

    public final void clear() {
        amvq amvq;
        amur[] amurArr = this.d;
        int length = amurArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            amur amur = amurArr[i2];
            if (amur.b != 0) {
                amur.lock();
                try {
                    amur.c(amur.a.p.a());
                    AtomicReferenceArray atomicReferenceArray = amur.f;
                    for (int i3 = 0; i3 < atomicReferenceArray.length(); i3++) {
                        for (amvp amvp = (amvp) atomicReferenceArray.get(i3); amvp != null; amvp = amvp.b()) {
                            if (amvp.a().d()) {
                                Object d2 = amvp.d();
                                Object obj = amvp.a().get();
                                if (d2 != null) {
                                    if (obj != null) {
                                        amvq = amvq.EXPLICIT;
                                        amvp.c();
                                        amur.a(d2, obj, amvp.a().a(), amvq);
                                    }
                                }
                                amvq = amvq.COLLECTED;
                                amvp.c();
                                amur.a(d2, obj, amvp.a().a(), amvq);
                            }
                        }
                    }
                    for (int i4 = 0; i4 < atomicReferenceArray.length(); i4++) {
                        atomicReferenceArray.set(i4, (Object) null);
                    }
                    if (amur.a.g()) {
                        do {
                        } while (amur.h.poll() != null);
                    }
                    if (amur.a.h()) {
                        do {
                        } while (amur.i.poll() != null);
                    }
                    amur.l.clear();
                    amur.m.clear();
                    amur.k.set(0);
                    amur.d++;
                    amur.b = 0;
                } finally {
                    amur.unlock();
                    amur.f();
                }
            }
        }
    }

    public final boolean containsKey(Object obj) {
        amvp a2;
        boolean z = false;
        if (obj == null) {
            return false;
        }
        int a3 = a(obj);
        amur a4 = a(a3);
        try {
            if (!(a4.b == 0 || (a2 = a4.a(obj, a3, a4.a.p.a())) == null || a2.a().get() == null)) {
                z = true;
            }
            return z;
        } finally {
            a4.e();
        }
    }

    public final boolean containsValue(Object obj) {
        long j2;
        Object obj2 = obj;
        if (obj2 == null) {
            return false;
        }
        long a2 = this.p.a();
        amur[] amurArr = this.d;
        long j3 = -1;
        int i2 = 0;
        while (i2 < 3) {
            int length = amurArr.length;
            long j4 = 0;
            int i3 = 0;
            while (i3 < length) {
                amur amur = amurArr[i3];
                int i4 = amur.b;
                AtomicReferenceArray atomicReferenceArray = amur.f;
                for (int i5 = 0; i5 < atomicReferenceArray.length(); i5++) {
                    amvp amvp = (amvp) atomicReferenceArray.get(i5);
                    while (amvp != null) {
                        amur[] amurArr2 = amurArr;
                        Object c2 = amur.c(amvp, a2);
                        if (c2 != null) {
                            j2 = a2;
                            if (this.g.b(obj2, c2)) {
                                return true;
                            }
                        } else {
                            j2 = a2;
                        }
                        amvp = amvp.b();
                        amurArr = amurArr2;
                        a2 = j2;
                    }
                }
                amur[] amurArr3 = amurArr;
                j4 += (long) amur.d;
                i3++;
                a2 = a2;
            }
            long j5 = a2;
            amur[] amurArr4 = amurArr;
            if (j4 == j3) {
                return false;
            }
            i2++;
            j3 = j4;
            amurArr = amurArr4;
            a2 = j5;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final boolean d() {
        return this.l > 0;
    }

    /* access modifiers changed from: package-private */
    public final boolean e() {
        return d() || a();
    }

    public final Set entrySet() {
        Set set = this.w;
        if (set != null) {
            return set;
        }
        amuh amuh = new amuh(this, this);
        this.w = amuh;
        return amuh;
    }

    /* access modifiers changed from: package-private */
    public final boolean f() {
        return c();
    }

    /* access modifiers changed from: package-private */
    public final boolean g() {
        return this.h != amut.STRONG;
    }

    public final Object get(Object obj) {
        if (obj == null) {
            return null;
        }
        int a2 = a(obj);
        return a(a2).a(obj, a2);
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    /* access modifiers changed from: package-private */
    public final boolean h() {
        return this.i != amut.STRONG;
    }

    public final boolean isEmpty() {
        amur[] amurArr = this.d;
        long j2 = 0;
        for (int i2 = 0; i2 < amurArr.length; i2++) {
            if (amurArr[i2].b != 0) {
                return false;
            }
            j2 += (long) amurArr[i2].d;
        }
        if (j2 == 0) {
            return true;
        }
        for (int i3 = 0; i3 < amurArr.length; i3++) {
            if (amurArr[i3].b != 0) {
                return false;
            }
            j2 -= (long) amurArr[i3].d;
        }
        if (j2 == 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final long j() {
        amur[] amurArr = this.d;
        long j2 = 0;
        for (amur amur : amurArr) {
            j2 += (long) Math.max(0, amur.b);
        }
        return j2;
    }

    public final Set keySet() {
        Set set = this.u;
        if (set != null) {
            return set;
        }
        amuk amuk = new amuk(this, this);
        this.u = amuk;
        return amuk;
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

    public final Object remove(Object obj) {
        amvq amvq;
        if (obj == null) {
            return null;
        }
        int a2 = a(obj);
        amur a3 = a(a2);
        a3.lock();
        try {
            a3.c(a3.a.p.a());
            int i2 = a3.b;
            AtomicReferenceArray atomicReferenceArray = a3.f;
            int length = a2 & (atomicReferenceArray.length() - 1);
            amvp amvp = (amvp) atomicReferenceArray.get(length);
            amvp amvp2 = amvp;
            while (true) {
                if (amvp2 == null) {
                    break;
                }
                Object d2 = amvp2.d();
                if (amvp2.c() == a2) {
                    if (d2 != null && a3.a.f.b(obj, d2)) {
                        amva a4 = amvp2.a();
                        Object obj2 = a4.get();
                        if (obj2 != null) {
                            amvq = amvq.EXPLICIT;
                        } else if (a4.d()) {
                            amvq = amvq.COLLECTED;
                        }
                        a3.d++;
                        atomicReferenceArray.set(length, a3.a(amvp, amvp2, d2, obj2, a4, amvq));
                        a3.b--;
                        a3.unlock();
                        a3.f();
                        return obj2;
                    }
                }
                amvp2 = amvp2.b();
            }
            return null;
        } finally {
            a3.unlock();
            a3.f();
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0047, code lost:
        r6 = r4.a();
        r0 = r6.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x004f, code lost:
        if (r0 == null) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0051, code lost:
        r8.d++;
        r8.a(r13, r0, r6.a(), defpackage.amvq.b);
        r8.a(r4, r14, r1);
        r8.a(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0066, code lost:
        r8.unlock();
        r8.f();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0072, code lost:
        if (r6.d() == false) goto L_0x0097;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0074, code lost:
        r13 = r8.b;
        r8.d++;
        r9.set(r10, r8.a(r3, r4, r5, (java.lang.Object) null, r6, defpackage.amvq.c));
        r8.b--;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object replace(java.lang.Object r13, java.lang.Object r14) {
        /*
            r12 = this;
            defpackage.amrl.a((java.lang.Object) r13)
            defpackage.amrl.a((java.lang.Object) r14)
            int r0 = r12.a((java.lang.Object) r13)
            amur r8 = r12.a((int) r0)
            r8.lock()
            amvo r1 = r8.a     // Catch:{ all -> 0x009e }
            amtd r1 = r1.p     // Catch:{ all -> 0x009e }
            long r1 = r1.a()     // Catch:{ all -> 0x009e }
            r8.c(r1)     // Catch:{ all -> 0x009e }
            java.util.concurrent.atomic.AtomicReferenceArray r9 = r8.f     // Catch:{ all -> 0x009e }
            int r3 = r9.length()     // Catch:{ all -> 0x009e }
            int r3 = r3 + -1
            r10 = r0 & r3
            java.lang.Object r3 = r9.get(r10)     // Catch:{ all -> 0x009e }
            amvp r3 = (defpackage.amvp) r3     // Catch:{ all -> 0x009e }
            r4 = r3
        L_0x002d:
            r11 = 0
            if (r4 == 0) goto L_0x0097
            java.lang.Object r5 = r4.d()     // Catch:{ all -> 0x009e }
            int r6 = r4.c()     // Catch:{ all -> 0x009e }
            if (r6 == r0) goto L_0x003b
            goto L_0x0092
        L_0x003b:
            if (r5 == 0) goto L_0x0092
            amvo r6 = r8.a     // Catch:{ all -> 0x009e }
            amqw r6 = r6.f     // Catch:{ all -> 0x009e }
            boolean r6 = r6.b(r13, r5)     // Catch:{ all -> 0x009e }
            if (r6 == 0) goto L_0x0092
            amva r6 = r4.a()     // Catch:{ all -> 0x009e }
            java.lang.Object r0 = r6.get()     // Catch:{ all -> 0x009e }
            if (r0 == 0) goto L_0x006e
            int r3 = r8.d     // Catch:{ all -> 0x009e }
            int r3 = r3 + 1
            r8.d = r3     // Catch:{ all -> 0x009e }
            int r3 = r6.a()     // Catch:{ all -> 0x009e }
            amvq r5 = defpackage.amvq.REPLACED     // Catch:{ all -> 0x009e }
            r8.a((java.lang.Object) r13, (java.lang.Object) r0, (int) r3, (defpackage.amvq) r5)     // Catch:{ all -> 0x009e }
            r8.a((defpackage.amvp) r4, (java.lang.Object) r14, (long) r1)     // Catch:{ all -> 0x009e }
            r8.a((defpackage.amvp) r4)     // Catch:{ all -> 0x009e }
            r8.unlock()
            r8.f()
            r11 = r0
            goto L_0x009d
        L_0x006e:
            boolean r13 = r6.d()     // Catch:{ all -> 0x009e }
            if (r13 == 0) goto L_0x0097
            int r13 = r8.b     // Catch:{ all -> 0x009e }
            int r13 = r8.d     // Catch:{ all -> 0x009e }
            int r13 = r13 + 1
            r8.d = r13     // Catch:{ all -> 0x009e }
            r13 = 0
            amvq r7 = defpackage.amvq.COLLECTED     // Catch:{ all -> 0x009e }
            r1 = r8
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r13
            amvp r13 = r1.a(r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x009e }
            int r14 = r8.b     // Catch:{ all -> 0x009e }
            int r14 = r14 + -1
            r9.set(r10, r13)     // Catch:{ all -> 0x009e }
            r8.b = r14     // Catch:{ all -> 0x009e }
            goto L_0x0097
        L_0x0092:
            amvp r4 = r4.b()     // Catch:{ all -> 0x009e }
            goto L_0x002d
        L_0x0097:
            r8.unlock()
            r8.f()
        L_0x009d:
            return r11
        L_0x009e:
            r13 = move-exception
            r8.unlock()
            r8.f()
            goto L_0x00a7
        L_0x00a6:
            throw r13
        L_0x00a7:
            goto L_0x00a6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.amvo.replace(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public final int size() {
        return aoog.b(j());
    }

    public final Collection values() {
        Collection collection = this.v;
        if (collection != null) {
            return collection;
        }
        amvb amvb = new amvb(this, this);
        this.v = amvb;
        return amvb;
    }

    static void b(amvp amvp) {
        amuq amuq = amuq.a;
        amvp.c(amuq);
        amvp.d(amuq);
    }

    static void a(amvp amvp) {
        amuq amuq = amuq.a;
        amvp.a((amvp) amuq);
        amvp.b((amvp) amuq);
    }

    static void b(amvp amvp, amvp amvp2) {
        amvp.c(amvp2);
        amvp2.d(amvp);
    }

    static void a(amvp amvp, amvp amvp2) {
        amvp.a(amvp2);
        amvp2.b(amvp);
    }

    /* access modifiers changed from: package-private */
    public final boolean b() {
        return this.k != amtl.a;
    }

    /* access modifiers changed from: package-private */
    public final int a(Object obj) {
        int b2 = this.f.b(obj);
        int i2 = b2 + ((b2 << 15) ^ -12931);
        int i3 = i2 ^ (i2 >>> 10);
        int i4 = i3 + (i3 << 3);
        int i5 = i4 ^ (i4 >>> 6);
        int i6 = i5 + (i5 << 2) + (i5 << 14);
        return i6 ^ (i6 >>> 16);
    }

    /* access modifiers changed from: package-private */
    public final amur a(int i2) {
        return this.d[(i2 >>> this.c) & this.b];
    }

    /* access modifiers changed from: package-private */
    public final amur a(int i2, long j2, amti amti) {
        return new amur(this, i2, j2, amti);
    }

    /* access modifiers changed from: package-private */
    public final boolean a(amvp amvp, long j2) {
        amrl.a((Object) amvp);
        if (d() && j2 - amvp.e() >= this.l) {
            return true;
        }
        if (!c() || j2 - amvp.h() < this.m) {
            return false;
        }
        return true;
    }

    public final boolean remove(Object obj, Object obj2) {
        amvq amvq;
        boolean z = false;
        if (obj == null || obj2 == null) {
            return false;
        }
        int a2 = a(obj);
        amur a3 = a(a2);
        a3.lock();
        try {
            a3.c(a3.a.p.a());
            int i2 = a3.b;
            AtomicReferenceArray atomicReferenceArray = a3.f;
            int length = a2 & (atomicReferenceArray.length() - 1);
            amvp amvp = (amvp) atomicReferenceArray.get(length);
            amvp amvp2 = amvp;
            while (true) {
                if (amvp2 == null) {
                    break;
                }
                Object d2 = amvp2.d();
                if (amvp2.c() == a2) {
                    if (d2 != null && a3.a.f.b(obj, d2)) {
                        amva a4 = amvp2.a();
                        Object obj3 = a4.get();
                        if (a3.a.g.b(obj2, obj3)) {
                            amvq = amvq.EXPLICIT;
                        } else if (obj3 == null) {
                            if (a4.d()) {
                                amvq = amvq.COLLECTED;
                            }
                        }
                        a3.d++;
                        atomicReferenceArray.set(length, a3.a(amvp, amvp2, d2, obj3, a4, amvq));
                        a3.b--;
                        if (amvq == amvq.EXPLICIT) {
                            z = true;
                        }
                    }
                }
                amvp2 = amvp2.b();
            }
            return z;
        } finally {
            a3.unlock();
            a3.f();
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004a, code lost:
        r1 = r5.a();
        r8 = r1.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0052, code lost:
        if (r8 == null) goto L_0x007e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x005c, code lost:
        if (r9.a.g.b(r14, r8) == false) goto L_0x007a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005e, code lost:
        r9.d++;
        r9.a(r13, r8, r1.a(), defpackage.amvq.b);
        r9.a(r5, r15, r2);
        r9.a(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0072, code lost:
        r9.unlock();
        r9.f();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r9.b(r5, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0082, code lost:
        if (r1.d() == false) goto L_0x00a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0084, code lost:
        r13 = r9.b;
        r9.d++;
        r10.set(r11, r9.a(r4, r5, r7, (java.lang.Object) null, r1, defpackage.amvq.c));
        r9.b--;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean replace(java.lang.Object r13, java.lang.Object r14, java.lang.Object r15) {
        /*
            r12 = this;
            defpackage.amrl.a((java.lang.Object) r13)
            defpackage.amrl.a((java.lang.Object) r15)
            r0 = 0
            if (r14 == 0) goto L_0x00b5
            int r1 = r12.a((java.lang.Object) r13)
            amur r9 = r12.a((int) r1)
            r9.lock()
            amvo r2 = r9.a     // Catch:{ all -> 0x00ad }
            amtd r2 = r2.p     // Catch:{ all -> 0x00ad }
            long r2 = r2.a()     // Catch:{ all -> 0x00ad }
            r9.c(r2)     // Catch:{ all -> 0x00ad }
            java.util.concurrent.atomic.AtomicReferenceArray r10 = r9.f     // Catch:{ all -> 0x00ad }
            int r4 = r10.length()     // Catch:{ all -> 0x00ad }
            int r4 = r4 + -1
            r11 = r1 & r4
            java.lang.Object r4 = r10.get(r11)     // Catch:{ all -> 0x00ad }
            amvp r4 = (defpackage.amvp) r4     // Catch:{ all -> 0x00ad }
            r5 = r4
        L_0x0030:
            r6 = 1
            if (r5 == 0) goto L_0x00a6
            java.lang.Object r7 = r5.d()     // Catch:{ all -> 0x00ad }
            int r8 = r5.c()     // Catch:{ all -> 0x00ad }
            if (r8 == r1) goto L_0x003e
            goto L_0x00a1
        L_0x003e:
            if (r7 == 0) goto L_0x00a1
            amvo r8 = r9.a     // Catch:{ all -> 0x00ad }
            amqw r8 = r8.f     // Catch:{ all -> 0x00ad }
            boolean r8 = r8.b(r13, r7)     // Catch:{ all -> 0x00ad }
            if (r8 == 0) goto L_0x00a1
            amva r1 = r5.a()     // Catch:{ all -> 0x00ad }
            java.lang.Object r8 = r1.get()     // Catch:{ all -> 0x00ad }
            if (r8 == 0) goto L_0x007e
            amvo r4 = r9.a     // Catch:{ all -> 0x00ad }
            amqw r4 = r4.g     // Catch:{ all -> 0x00ad }
            boolean r14 = r4.b(r14, r8)     // Catch:{ all -> 0x00ad }
            if (r14 == 0) goto L_0x007a
            int r14 = r9.d     // Catch:{ all -> 0x00ad }
            int r14 = r14 + r6
            r9.d = r14     // Catch:{ all -> 0x00ad }
            int r14 = r1.a()     // Catch:{ all -> 0x00ad }
            amvq r0 = defpackage.amvq.REPLACED     // Catch:{ all -> 0x00ad }
            r9.a((java.lang.Object) r13, (java.lang.Object) r8, (int) r14, (defpackage.amvq) r0)     // Catch:{ all -> 0x00ad }
            r9.a((defpackage.amvp) r5, (java.lang.Object) r15, (long) r2)     // Catch:{ all -> 0x00ad }
            r9.a((defpackage.amvp) r5)     // Catch:{ all -> 0x00ad }
            r9.unlock()
            r9.f()
            r0 = 1
            goto L_0x00ac
        L_0x007a:
            r9.b((defpackage.amvp) r5, (long) r2)     // Catch:{ all -> 0x00ad }
            goto L_0x00a6
        L_0x007e:
            boolean r13 = r1.d()     // Catch:{ all -> 0x00ad }
            if (r13 == 0) goto L_0x00a6
            int r13 = r9.b     // Catch:{ all -> 0x00ad }
            int r13 = r9.d     // Catch:{ all -> 0x00ad }
            int r13 = r13 + r6
            r9.d = r13     // Catch:{ all -> 0x00ad }
            r6 = 0
            amvq r8 = defpackage.amvq.COLLECTED     // Catch:{ all -> 0x00ad }
            r2 = r9
            r3 = r4
            r4 = r5
            r5 = r7
            r7 = r1
            amvp r13 = r2.a(r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x00ad }
            int r14 = r9.b     // Catch:{ all -> 0x00ad }
            int r14 = r14 + -1
            r10.set(r11, r13)     // Catch:{ all -> 0x00ad }
            r9.b = r14     // Catch:{ all -> 0x00ad }
            goto L_0x00a6
        L_0x00a1:
            amvp r5 = r5.b()     // Catch:{ all -> 0x00ad }
            goto L_0x0030
        L_0x00a6:
            r9.unlock()
            r9.f()
        L_0x00ac:
            return r0
        L_0x00ad:
            r13 = move-exception
            r9.unlock()
            r9.f()
            throw r13
        L_0x00b5:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.amvo.replace(java.lang.Object, java.lang.Object, java.lang.Object):boolean");
    }
}
