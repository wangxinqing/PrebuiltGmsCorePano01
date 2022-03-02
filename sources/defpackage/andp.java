package defpackage;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: andp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
class andp extends ReentrantLock {
    final anej a;
    volatile int b;
    int c;
    int d;
    volatile AtomicReferenceArray e;
    final int f;
    final AtomicInteger g;

    public andp(anej anej, int i) {
        this.g = new AtomicInteger();
        this.a = anej;
        this.f = -1;
        AtomicReferenceArray a2 = a(i);
        int length = (a2.length() * 3) / 4;
        this.d = length;
        if (length == this.f) {
            this.d = length + 1;
        }
        this.e = a2;
    }

    static final AtomicReferenceArray a(int i) {
        return new AtomicReferenceArray(i);
    }

    static final void c(ReferenceQueue referenceQueue) {
        do {
        } while (referenceQueue.poll() != null);
    }

    public void a() {
    }

    /* access modifiers changed from: package-private */
    public final andk b(andk andk, andk andk2) {
        int i = this.b;
        andk c2 = andk2.c();
        while (andk != andk2) {
            andk a2 = a(andk, c2);
            if (a2 != null) {
                c2 = a2;
            } else {
                i--;
            }
            andk = andk.c();
        }
        this.b = i;
        return c2;
    }

    public void b() {
    }

    /* access modifiers changed from: package-private */
    public final void d() {
        if ((this.g.incrementAndGet() & 63) == 0) {
            e();
        }
    }

    /* access modifiers changed from: package-private */
    public final void e() {
        if (tryLock()) {
            try {
                a();
                this.g.set(0);
            } finally {
                unlock();
            }
        }
    }

    static boolean a(andk andk) {
        return andk.d() == null;
    }

    /* access modifiers changed from: package-private */
    public final void c() {
        if (tryLock()) {
            try {
                a();
            } finally {
                unlock();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final andk a(andk andk, andk andk2) {
        return this.a.f.a(this, andk, andk2);
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    public final void b(ReferenceQueue referenceQueue) {
        int i = 0;
        do {
            Reference poll = referenceQueue.poll();
            if (poll != null) {
                aneg aneg = (aneg) poll;
                anej anej = this.a;
                andk a2 = aneg.a();
                int b2 = a2.b();
                andp a3 = anej.a(b2);
                Object a4 = a2.a();
                a3.lock();
                try {
                    int i2 = a3.b;
                    AtomicReferenceArray atomicReferenceArray = a3.e;
                    int length = (atomicReferenceArray.length() - 1) & b2;
                    andk andk = (andk) atomicReferenceArray.get(length);
                    andk andk2 = andk;
                    while (true) {
                        if (andk2 == null) {
                            break;
                        }
                        Object a5 = andk2.a();
                        if (andk2.b() == b2) {
                            if (a5 != null && a3.a.e.b(a4, a5)) {
                                if (((anef) andk2).e() == aneg) {
                                    a3.c++;
                                    atomicReferenceArray.set(length, a3.b(andk, andk2));
                                    a3.b--;
                                }
                            }
                        }
                        andk2 = andk2.c();
                    }
                    a3.unlock();
                    i++;
                } catch (Throwable th) {
                    a3.unlock();
                    throw th;
                }
            } else {
                return;
            }
        } while (i != 16);
    }

    /* access modifiers changed from: package-private */
    public final andk a(Object obj, int i) {
        if (this.b == 0) {
            return null;
        }
        AtomicReferenceArray atomicReferenceArray = this.e;
        for (andk andk = (andk) atomicReferenceArray.get((atomicReferenceArray.length() - 1) & i); andk != null; andk = andk.c()) {
            if (andk.b() == i) {
                Object a2 = andk.a();
                if (a2 == null) {
                    c();
                } else if (this.a.e.b(obj, a2)) {
                    return andk;
                }
            }
        }
        return null;
    }

    public andp(anej anej, int i, byte[] bArr) {
        this(anej, i);
    }

    /* access modifiers changed from: package-private */
    public final Object a(Object obj, int i, Object obj2, boolean z) {
        int i2;
        Object obj3 = obj;
        int i3 = i;
        Object obj4 = obj2;
        lock();
        try {
            e();
            int i4 = this.b + 1;
            if (i4 > this.d) {
                AtomicReferenceArray atomicReferenceArray = this.e;
                int length = atomicReferenceArray.length();
                if (length < 1073741824) {
                    int i5 = this.b;
                    AtomicReferenceArray a2 = a(length + length);
                    this.d = (a2.length() * 3) / 4;
                    int length2 = a2.length() - 1;
                    for (int i6 = 0; i6 < length; i6++) {
                        andk andk = (andk) atomicReferenceArray.get(i6);
                        if (andk != null) {
                            andk c2 = andk.c();
                            int b2 = andk.b() & length2;
                            if (c2 != null) {
                                andk andk2 = andk;
                                while (c2 != null) {
                                    int b3 = c2.b() & length2;
                                    if (b3 != b2) {
                                        i2 = b3;
                                    } else {
                                        i2 = b2;
                                    }
                                    if (b3 != b2) {
                                        andk2 = c2;
                                    }
                                    c2 = c2.c();
                                    b2 = i2;
                                }
                                a2.set(b2, andk2);
                                while (andk != andk2) {
                                    int b4 = andk.b() & length2;
                                    andk a3 = a(andk, (andk) a2.get(b4));
                                    if (a3 == null) {
                                        i5--;
                                    } else {
                                        a2.set(b4, a3);
                                    }
                                    andk = andk.c();
                                }
                            } else {
                                a2.set(b2, andk);
                            }
                        }
                    }
                    this.e = a2;
                    this.b = i5;
                }
                i4 = this.b + 1;
            }
            AtomicReferenceArray atomicReferenceArray2 = this.e;
            int length3 = (atomicReferenceArray2.length() - 1) & i3;
            andk andk3 = (andk) atomicReferenceArray2.get(length3);
            andk andk4 = andk3;
            while (true) {
                if (andk4 == null) {
                    this.c++;
                    andk a4 = this.a.f.a(this, obj3, i3, andk3);
                    a(a4, obj4);
                    atomicReferenceArray2.set(length3, a4);
                    this.b = i4;
                    break;
                }
                Object a5 = andk4.a();
                if (andk4.b() == i3) {
                    if (a5 != null && this.a.e.b(obj3, a5)) {
                        Object d2 = andk4.d();
                        if (d2 == null) {
                            this.c++;
                            a(andk4, obj4);
                            this.b = this.b;
                        } else {
                            if (!z) {
                                this.c++;
                                a(andk4, obj4);
                            }
                            unlock();
                            return d2;
                        }
                    }
                }
                andk4 = andk4.c();
            }
            return null;
        } finally {
            unlock();
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(andk andk, Object obj) {
        this.a.f.a(this, andk, obj);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        r2.c++;
        r4.set(r3, r2.b(r5, r6));
        r2.b--;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.ref.ReferenceQueue r8) {
        /*
            r7 = this;
            r0 = 0
        L_0x0001:
            java.lang.ref.Reference r1 = r8.poll()
            if (r1 == 0) goto L_0x0055
            andk r1 = (defpackage.andk) r1
            anej r2 = r7.a
            int r3 = r1.b()
            andp r2 = r2.a((int) r3)
            r2.lock()
            int r4 = r2.b     // Catch:{ all -> 0x0050 }
            java.util.concurrent.atomic.AtomicReferenceArray r4 = r2.e     // Catch:{ all -> 0x0050 }
            int r5 = r4.length()     // Catch:{ all -> 0x0050 }
            int r5 = r5 + -1
            r3 = r3 & r5
            java.lang.Object r5 = r4.get(r3)     // Catch:{ all -> 0x0050 }
            andk r5 = (defpackage.andk) r5     // Catch:{ all -> 0x0050 }
            r6 = r5
        L_0x0028:
            if (r6 != 0) goto L_0x002e
        L_0x002a:
            r2.unlock()
            goto L_0x0044
        L_0x002e:
            if (r6 != r1) goto L_0x004b
            int r1 = r2.c     // Catch:{ all -> 0x0050 }
            int r1 = r1 + 1
            r2.c = r1     // Catch:{ all -> 0x0050 }
            andk r1 = r2.b(r5, r6)     // Catch:{ all -> 0x0050 }
            int r5 = r2.b     // Catch:{ all -> 0x0050 }
            int r5 = r5 + -1
            r4.set(r3, r1)     // Catch:{ all -> 0x0050 }
            r2.b = r5     // Catch:{ all -> 0x0050 }
            goto L_0x002a
        L_0x0044:
            int r0 = r0 + 1
            r1 = 16
            if (r0 != r1) goto L_0x0001
            goto L_0x0055
        L_0x004b:
            andk r6 = r6.c()     // Catch:{ all -> 0x0050 }
            goto L_0x0028
        L_0x0050:
            r8 = move-exception
            r2.unlock()
            throw r8
        L_0x0055:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.andp.a(java.lang.ref.ReferenceQueue):void");
    }
}
