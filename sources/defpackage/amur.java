package defpackage;

import java.lang.ref.ReferenceQueue;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;

/* renamed from: amur  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class amur extends ReentrantLock {
    final amvo a;
    volatile int b;
    long c;
    int d;
    int e;
    volatile AtomicReferenceArray f;
    final long g;
    final ReferenceQueue h;
    final ReferenceQueue i;
    final Queue j;
    final AtomicInteger k = new AtomicInteger();
    final Queue l;
    final Queue m;
    final amti n;

    public amur(amvo amvo, int i2, long j2, amti amti) {
        ReferenceQueue referenceQueue;
        Queue queue;
        Queue queue2;
        this.a = amvo;
        this.g = j2;
        amrl.a((Object) amti);
        this.n = amti;
        AtomicReferenceArray a2 = a(i2);
        this.e = (a2.length() * 3) / 4;
        if (!this.a.b()) {
            int i3 = this.e;
            if (((long) i3) == this.g) {
                this.e = i3 + 1;
            }
        }
        this.f = a2;
        ReferenceQueue referenceQueue2 = null;
        if (amvo.g()) {
            referenceQueue = new ReferenceQueue();
        } else {
            referenceQueue = null;
        }
        this.h = referenceQueue;
        this.i = amvo.h() ? new ReferenceQueue() : referenceQueue2;
        if (amvo.e()) {
            queue = new ConcurrentLinkedQueue();
        } else {
            queue = amvo.t;
        }
        this.j = queue;
        if (amvo.c()) {
            queue2 = new amvm();
        } else {
            queue2 = amvo.t;
        }
        this.l = queue2;
        this.m = amvo.e() ? new amty() : amvo.t;
    }

    static final AtomicReferenceArray a(int i2) {
        return new AtomicReferenceArray(i2);
    }

    /* access modifiers changed from: package-private */
    public final amvp b(amvp amvp, amvp amvp2) {
        int i2 = this.b;
        amvp b2 = amvp2.b();
        while (amvp != amvp2) {
            amvp a2 = a(amvp, b2);
            if (a2 != null) {
                b2 = a2;
            } else {
                b(amvp);
                i2--;
            }
            amvp = amvp.b();
        }
        this.b = i2;
        return b2;
    }

    /* access modifiers changed from: package-private */
    public final Object c(amvp amvp, long j2) {
        if (amvp.d() == null) {
            a();
            return null;
        }
        Object obj = amvp.a().get();
        if (obj == null) {
            a();
            return null;
        } else if (!this.a.a(amvp, j2)) {
            return obj;
        } else {
            a(j2);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public final void d() {
        int i2;
        AtomicReferenceArray atomicReferenceArray = this.f;
        int length = atomicReferenceArray.length();
        if (length < 1073741824) {
            int i3 = this.b;
            AtomicReferenceArray a2 = a(length + length);
            this.e = (a2.length() * 3) / 4;
            int length2 = a2.length() - 1;
            for (int i4 = 0; i4 < length; i4++) {
                amvp amvp = (amvp) atomicReferenceArray.get(i4);
                if (amvp != null) {
                    amvp b2 = amvp.b();
                    int c2 = amvp.c() & length2;
                    if (b2 != null) {
                        amvp amvp2 = amvp;
                        while (b2 != null) {
                            int c3 = b2.c() & length2;
                            if (c3 != c2) {
                                i2 = c3;
                            } else {
                                i2 = c2;
                            }
                            if (c3 != c2) {
                                amvp2 = b2;
                            }
                            b2 = b2.b();
                            c2 = i2;
                        }
                        a2.set(c2, amvp2);
                        while (amvp != amvp2) {
                            int c4 = amvp.c() & length2;
                            amvp a3 = a(amvp, (amvp) a2.get(c4));
                            if (a3 != null) {
                                a2.set(c4, a3);
                            } else {
                                b(amvp);
                                i3--;
                            }
                            amvp = amvp.b();
                        }
                    } else {
                        a2.set(c2, amvp);
                    }
                }
            }
            this.f = a2;
            this.b = i3;
        }
    }

    /* access modifiers changed from: package-private */
    public final void e() {
        if ((this.k.incrementAndGet() & 63) == 0) {
            c(this.a.p.a());
            f();
        }
    }

    /* access modifiers changed from: package-private */
    public final void f() {
        if (!isHeldByCurrentThread()) {
            amvo amvo = this.a;
            while (((amvs) amvo.n.poll()) != null) {
                try {
                    amvo.o.a();
                } catch (Throwable th) {
                    amvo.a.logp(Level.WARNING, "com.google.common.cache.LocalCache", "processPendingNotifications", "Exception thrown by removal listener", th);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final amvp a(amvp amvp, amvp amvp2) {
        if (amvp.d() == null) {
            return null;
        }
        amva a2 = amvp.a();
        Object obj = a2.get();
        if (obj == null && a2.d()) {
            return null;
        }
        amvp a3 = this.a.q.a(this, amvp, amvp2);
        a3.a(a2.a(this.i, obj, a3));
        return a3;
    }

    /* access modifiers changed from: package-private */
    public final amvp b(Object obj, int i2) {
        AtomicReferenceArray atomicReferenceArray = this.f;
        for (amvp amvp = (amvp) atomicReferenceArray.get((atomicReferenceArray.length() - 1) & i2); amvp != null; amvp = amvp.b()) {
            if (amvp.c() == i2) {
                Object d2 = amvp.d();
                if (d2 == null) {
                    a();
                } else if (this.a.f.b(obj, d2)) {
                    return amvp;
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final amvp a(amvp amvp, amvp amvp2, Object obj, Object obj2, amva amva, amvq amvq) {
        a(obj, obj2, amva.a(), amvq);
        this.l.remove(amvp2);
        this.m.remove(amvp2);
        if (!amva.c()) {
            return b(amvp, amvp2);
        }
        amva.a((Object) null);
        return amvp;
    }

    /* access modifiers changed from: package-private */
    public final void c() {
        while (true) {
            amvp amvp = (amvp) this.j.poll();
            if (amvp == null) {
                return;
            }
            if (this.m.contains(amvp)) {
                this.m.add(amvp);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void c(long j2) {
        if (tryLock()) {
            try {
                b();
                b(j2);
                this.k.set(0);
            } finally {
                unlock();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final amvp a(Object obj, int i2, long j2) {
        amvp b2 = b(obj, i2);
        if (b2 == null) {
            return null;
        }
        if (!this.a.a(b2, j2)) {
            return b2;
        }
        a(j2);
        return null;
    }

    /* access modifiers changed from: package-private */
    public final amvp a(Object obj, int i2, amvp amvp) {
        amuf amuf = this.a.q;
        amrl.a(obj);
        return amuf.a(this, obj, i2, amvp);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: amvp} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r4.d++;
        r13.set(r5, r4.a(r7, r8, r8.d(), r8.a().get(), r8.a(), defpackage.amvq.c));
        r4.b--;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0106, code lost:
        if (r0.isHeldByCurrentThread() == false) goto L_0x0117;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0115, code lost:
        if (r0.isHeldByCurrentThread() == false) goto L_0x0117;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x011a, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b() {
        /*
            r14 = this;
            amvo r0 = r14.a
            boolean r0 = r0.g()
            r1 = 16
            r2 = 0
            if (r0 != 0) goto L_0x000d
            goto L_0x007c
        L_0x000d:
            r0 = 0
        L_0x000e:
            java.lang.ref.ReferenceQueue r3 = r14.h
            java.lang.ref.Reference r3 = r3.poll()
            if (r3 == 0) goto L_0x007c
            amvp r3 = (defpackage.amvp) r3
            amvo r4 = r14.a
            int r5 = r3.c()
            amur r4 = r4.a((int) r5)
            r4.lock()
            int r6 = r4.b     // Catch:{ all -> 0x0074 }
            java.util.concurrent.atomic.AtomicReferenceArray r13 = r4.f     // Catch:{ all -> 0x0074 }
            int r6 = r13.length()     // Catch:{ all -> 0x0074 }
            int r6 = r6 + -1
            r5 = r5 & r6
            java.lang.Object r6 = r13.get(r5)     // Catch:{ all -> 0x0074 }
            r7 = r6
            amvp r7 = (defpackage.amvp) r7     // Catch:{ all -> 0x0074 }
            r8 = r7
        L_0x0038:
            if (r8 != 0) goto L_0x0041
        L_0x003a:
            r4.unlock()
            r4.f()
            goto L_0x006a
        L_0x0041:
            if (r8 != r3) goto L_0x006f
            int r3 = r4.d     // Catch:{ all -> 0x0074 }
            int r3 = r3 + 1
            r4.d = r3     // Catch:{ all -> 0x0074 }
            java.lang.Object r9 = r8.d()     // Catch:{ all -> 0x0074 }
            amva r3 = r8.a()     // Catch:{ all -> 0x0074 }
            java.lang.Object r10 = r3.get()     // Catch:{ all -> 0x0074 }
            amva r11 = r8.a()     // Catch:{ all -> 0x0074 }
            amvq r12 = defpackage.amvq.COLLECTED     // Catch:{ all -> 0x0074 }
            r6 = r4
            amvp r3 = r6.a(r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x0074 }
            int r6 = r4.b     // Catch:{ all -> 0x0074 }
            int r6 = r6 + -1
            r13.set(r5, r3)     // Catch:{ all -> 0x0074 }
            r4.b = r6     // Catch:{ all -> 0x0074 }
            goto L_0x003a
        L_0x006a:
            int r0 = r0 + 1
            if (r0 != r1) goto L_0x000e
            goto L_0x007c
        L_0x006f:
            amvp r8 = r8.b()     // Catch:{ all -> 0x0074 }
            goto L_0x0038
        L_0x0074:
            r0 = move-exception
            r4.unlock()
            r4.f()
            throw r0
        L_0x007c:
            amvo r0 = r14.a
            boolean r0 = r0.h()
            if (r0 == 0) goto L_0x012e
        L_0x0084:
            java.lang.ref.ReferenceQueue r0 = r14.i
            java.lang.ref.Reference r0 = r0.poll()
            if (r0 == 0) goto L_0x012e
            r8 = r0
            amva r8 = (defpackage.amva) r8
            amvo r0 = r14.a
            amvp r3 = r8.b()
            int r4 = r3.c()
            amur r0 = r0.a((int) r4)
            java.lang.Object r3 = r3.d()
            r0.lock()
            int r5 = r0.b     // Catch:{ all -> 0x011f }
            java.util.concurrent.atomic.AtomicReferenceArray r10 = r0.f     // Catch:{ all -> 0x011f }
            int r5 = r10.length()     // Catch:{ all -> 0x011f }
            int r5 = r5 + -1
            r11 = r4 & r5
            java.lang.Object r5 = r10.get(r11)     // Catch:{ all -> 0x011f }
            amvp r5 = (defpackage.amvp) r5     // Catch:{ all -> 0x011f }
            r6 = r5
        L_0x00b7:
            if (r6 == 0) goto L_0x010e
            java.lang.Object r7 = r6.d()     // Catch:{ all -> 0x011f }
            int r9 = r6.c()     // Catch:{ all -> 0x011f }
            if (r9 == r4) goto L_0x00c4
            goto L_0x0109
        L_0x00c4:
            if (r7 == 0) goto L_0x0109
            amvo r9 = r0.a     // Catch:{ all -> 0x011f }
            amqw r9 = r9.f     // Catch:{ all -> 0x011f }
            boolean r9 = r9.b(r3, r7)     // Catch:{ all -> 0x011f }
            if (r9 == 0) goto L_0x0109
            amva r3 = r6.a()     // Catch:{ all -> 0x011f }
            if (r3 != r8) goto L_0x00ff
            int r3 = r0.d     // Catch:{ all -> 0x011f }
            int r3 = r3 + 1
            r0.d = r3     // Catch:{ all -> 0x011f }
            java.lang.Object r9 = r8.get()     // Catch:{ all -> 0x011f }
            amvq r12 = defpackage.amvq.COLLECTED     // Catch:{ all -> 0x011f }
            r3 = r0
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r9
            r9 = r12
            amvp r3 = r3.a(r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x011f }
            int r4 = r0.b     // Catch:{ all -> 0x011f }
            int r4 = r4 + -1
            r10.set(r11, r3)     // Catch:{ all -> 0x011f }
            r0.b = r4     // Catch:{ all -> 0x011f }
            r0.unlock()
            boolean r3 = r0.isHeldByCurrentThread()
            if (r3 == 0) goto L_0x0117
            goto L_0x011a
        L_0x00ff:
            r0.unlock()
            boolean r3 = r0.isHeldByCurrentThread()
            if (r3 != 0) goto L_0x011a
            goto L_0x0117
        L_0x0109:
            amvp r6 = r6.b()     // Catch:{ all -> 0x011f }
            goto L_0x00b7
        L_0x010e:
            r0.unlock()
            boolean r3 = r0.isHeldByCurrentThread()
            if (r3 != 0) goto L_0x011a
        L_0x0117:
            r0.f()
        L_0x011a:
            int r2 = r2 + 1
            if (r2 != r1) goto L_0x0084
            goto L_0x012e
        L_0x011f:
            r1 = move-exception
            r0.unlock()
            boolean r2 = r0.isHeldByCurrentThread()
            if (r2 == 0) goto L_0x012a
            goto L_0x012d
        L_0x012a:
            r0.f()
        L_0x012d:
            throw r1
        L_0x012e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.amur.b():void");
    }

    /* access modifiers changed from: package-private */
    public final Object a(amvp amvp, Object obj, amva amva) {
        if (amva.c()) {
            amrl.b(!Thread.holdsLock(amvp), "Recursive load of: %s", obj);
            Object e2 = amva.e();
            if (e2 != null) {
                a(amvp, this.a.p.a());
                return e2;
            }
            String valueOf = String.valueOf(obj);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 35);
            sb.append("CacheLoader returned null for key ");
            sb.append(valueOf);
            sb.append(".");
            throw new amto(sb.toString());
        }
        throw new AssertionError();
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0005, code lost:
        r2 = r4.a.p.a();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(java.lang.Object r5, int r6) {
        /*
            r4 = this;
            int r0 = r4.b     // Catch:{ all -> 0x0032 }
            r1 = 0
            if (r0 == 0) goto L_0x002e
            amvo r0 = r4.a     // Catch:{ all -> 0x0032 }
            amtd r0 = r0.p     // Catch:{ all -> 0x0032 }
            long r2 = r0.a()     // Catch:{ all -> 0x0032 }
            amvp r5 = r4.a((java.lang.Object) r5, (int) r6, (long) r2)     // Catch:{ all -> 0x0032 }
            if (r5 == 0) goto L_0x002e
            amva r6 = r5.a()     // Catch:{ all -> 0x0032 }
            java.lang.Object r6 = r6.get()     // Catch:{ all -> 0x0032 }
            if (r6 == 0) goto L_0x002b
            r4.a((defpackage.amvp) r5, (long) r2)     // Catch:{ all -> 0x0032 }
            r5.d()     // Catch:{ all -> 0x0032 }
            amvo r5 = r4.a     // Catch:{ all -> 0x0032 }
            amtp r5 = r5.r     // Catch:{ all -> 0x0032 }
            r4.e()
            return r6
        L_0x002b:
            r4.a()     // Catch:{ all -> 0x0032 }
        L_0x002e:
            r4.e()
            return r1
        L_0x0032:
            r5 = move-exception
            r4.e()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.amur.a(java.lang.Object, int):java.lang.Object");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0064, code lost:
        r11 = r5.a();
        r2 = r11.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006c, code lost:
        if (r2 != null) goto L_0x0096;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006e, code lost:
        r9.d++;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0078, code lost:
        if (r11.d() != false) goto L_0x0082;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007a, code lost:
        a(r5, r12, r0);
        r10 = r9.b + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0082, code lost:
        a(r10, (java.lang.Object) null, r11.a(), defpackage.amvq.c);
        a(r5, r12, r0);
        r10 = r9.b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0090, code lost:
        r9.b = r10;
        a(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0096, code lost:
        if (r13 != false) goto L_0x00b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0098, code lost:
        r9.d++;
        a(r10, r2, r11.a(), defpackage.amvq.b);
        a(r5, r12, r0);
        a(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00ad, code lost:
        unlock();
        f();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00b3, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        b(r5, r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(java.lang.Object r10, int r11, java.lang.Object r12, boolean r13) {
        /*
            r9 = this;
            r9.lock()
            amvo r0 = r9.a     // Catch:{ all -> 0x00be }
            amtd r0 = r0.p     // Catch:{ all -> 0x00be }
            long r0 = r0.a()     // Catch:{ all -> 0x00be }
            r9.c(r0)     // Catch:{ all -> 0x00be }
            int r2 = r9.b     // Catch:{ all -> 0x00be }
            int r2 = r2 + 1
            int r3 = r9.e     // Catch:{ all -> 0x00be }
            if (r2 > r3) goto L_0x0017
            goto L_0x001a
        L_0x0017:
            r9.d()     // Catch:{ all -> 0x00be }
        L_0x001a:
            java.util.concurrent.atomic.AtomicReferenceArray r2 = r9.f     // Catch:{ all -> 0x00be }
            int r3 = r2.length()     // Catch:{ all -> 0x00be }
            int r3 = r3 + -1
            r3 = r3 & r11
            java.lang.Object r4 = r2.get(r3)     // Catch:{ all -> 0x00be }
            amvp r4 = (defpackage.amvp) r4     // Catch:{ all -> 0x00be }
            r5 = r4
        L_0x002a:
            r6 = 0
            if (r5 != 0) goto L_0x004d
            int r13 = r9.d     // Catch:{ all -> 0x00be }
            int r13 = r13 + 1
            r9.d = r13     // Catch:{ all -> 0x00be }
            amvp r10 = r9.a((java.lang.Object) r10, (int) r11, (defpackage.amvp) r4)     // Catch:{ all -> 0x00be }
            r9.a((defpackage.amvp) r10, (java.lang.Object) r12, (long) r0)     // Catch:{ all -> 0x00be }
            r2.set(r3, r10)     // Catch:{ all -> 0x00be }
            int r11 = r9.b     // Catch:{ all -> 0x00be }
            int r11 = r11 + 1
            r9.b = r11     // Catch:{ all -> 0x00be }
            r9.a((defpackage.amvp) r10)     // Catch:{ all -> 0x00be }
        L_0x0046:
            r9.unlock()
            r9.f()
            return r6
        L_0x004d:
            java.lang.Object r7 = r5.d()     // Catch:{ all -> 0x00be }
            int r8 = r5.c()     // Catch:{ all -> 0x00be }
            if (r8 == r11) goto L_0x0058
            goto L_0x00b8
        L_0x0058:
            if (r7 == 0) goto L_0x00b8
            amvo r8 = r9.a     // Catch:{ all -> 0x00be }
            amqw r8 = r8.f     // Catch:{ all -> 0x00be }
            boolean r7 = r8.b(r10, r7)     // Catch:{ all -> 0x00be }
            if (r7 == 0) goto L_0x00b8
            amva r11 = r5.a()     // Catch:{ all -> 0x00be }
            java.lang.Object r2 = r11.get()     // Catch:{ all -> 0x00be }
            if (r2 != 0) goto L_0x0096
            int r13 = r9.d     // Catch:{ all -> 0x00be }
            int r13 = r13 + 1
            r9.d = r13     // Catch:{ all -> 0x00be }
            boolean r13 = r11.d()     // Catch:{ all -> 0x00be }
            if (r13 != 0) goto L_0x0082
            r9.a((defpackage.amvp) r5, (java.lang.Object) r12, (long) r0)     // Catch:{ all -> 0x00be }
            int r10 = r9.b     // Catch:{ all -> 0x00be }
            int r10 = r10 + 1
            goto L_0x0090
        L_0x0082:
            int r11 = r11.a()     // Catch:{ all -> 0x00be }
            amvq r13 = defpackage.amvq.COLLECTED     // Catch:{ all -> 0x00be }
            r9.a((java.lang.Object) r10, (java.lang.Object) r6, (int) r11, (defpackage.amvq) r13)     // Catch:{ all -> 0x00be }
            r9.a((defpackage.amvp) r5, (java.lang.Object) r12, (long) r0)     // Catch:{ all -> 0x00be }
            int r10 = r9.b     // Catch:{ all -> 0x00be }
        L_0x0090:
            r9.b = r10     // Catch:{ all -> 0x00be }
            r9.a((defpackage.amvp) r5)     // Catch:{ all -> 0x00be }
            goto L_0x0046
        L_0x0096:
            if (r13 != 0) goto L_0x00b4
            int r13 = r9.d     // Catch:{ all -> 0x00be }
            int r13 = r13 + 1
            r9.d = r13     // Catch:{ all -> 0x00be }
            int r11 = r11.a()     // Catch:{ all -> 0x00be }
            amvq r13 = defpackage.amvq.REPLACED     // Catch:{ all -> 0x00be }
            r9.a((java.lang.Object) r10, (java.lang.Object) r2, (int) r11, (defpackage.amvq) r13)     // Catch:{ all -> 0x00be }
            r9.a((defpackage.amvp) r5, (java.lang.Object) r12, (long) r0)     // Catch:{ all -> 0x00be }
            r9.a((defpackage.amvp) r5)     // Catch:{ all -> 0x00be }
        L_0x00ad:
            r9.unlock()
            r9.f()
            return r2
        L_0x00b4:
            r9.b((defpackage.amvp) r5, (long) r0)     // Catch:{ all -> 0x00be }
            goto L_0x00ad
        L_0x00b8:
            amvp r5 = r5.b()     // Catch:{ all -> 0x00be }
            goto L_0x002a
        L_0x00be:
            r10 = move-exception
            r9.unlock()
            r9.f()
            goto L_0x00c7
        L_0x00c6:
            throw r10
        L_0x00c7:
            goto L_0x00c6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.amur.a(java.lang.Object, int, java.lang.Object, boolean):java.lang.Object");
    }

    /* access modifiers changed from: package-private */
    public final void b(long j2) {
        amvp amvp;
        amvp amvp2;
        c();
        do {
            amvp = (amvp) this.l.peek();
            if (amvp == null || !this.a.a(amvp, j2)) {
                do {
                    amvp2 = (amvp) this.m.peek();
                    if (amvp2 == null || !this.a.a(amvp2, j2)) {
                        return;
                    }
                } while (a(amvp2, amvp2.c(), amvq.EXPIRED));
                throw new AssertionError();
            }
        } while (a(amvp, amvp.c(), amvq.EXPIRED));
        throw new AssertionError();
    }

    /* access modifiers changed from: package-private */
    public final void b(amvp amvp) {
        Object d2 = amvp.d();
        amvp.c();
        a(d2, amvp.a().get(), amvp.a().a(), amvq.COLLECTED);
        this.l.remove(amvp);
        this.m.remove(amvp);
    }

    /* access modifiers changed from: package-private */
    public final void b(amvp amvp, long j2) {
        if (this.a.d()) {
            amvp.a(j2);
        }
        this.m.add(amvp);
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        if (tryLock()) {
            try {
                b();
            } finally {
                unlock();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(long j2) {
        if (tryLock()) {
            try {
                b(j2);
            } finally {
                unlock();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(amvp amvp) {
        if (this.a.a()) {
            c();
            if (((long) amvp.a().a()) > this.g && !a(amvp, amvp.c(), amvq.SIZE)) {
                throw new AssertionError();
            }
            while (this.c > this.g) {
                for (amvp amvp2 : this.m) {
                    if (amvp2.a().a() > 0) {
                        if (!a(amvp2, amvp2.c(), amvq.SIZE)) {
                            throw new AssertionError();
                        }
                    }
                }
                throw new AssertionError();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(amvp amvp, long j2) {
        if (this.a.d()) {
            amvp.a(j2);
        }
        this.j.add(amvp);
    }

    /* access modifiers changed from: package-private */
    public final void a(amvp amvp, Object obj, long j2) {
        boolean z;
        amva amva;
        amva a2 = amvp.a();
        int a3 = this.a.k.a();
        if (a3 >= 0) {
            z = true;
        } else {
            z = false;
        }
        amrl.b(z, (Object) "Weights must be non-negative");
        int ordinal = this.a.i.ordinal();
        if (ordinal == 0) {
            amva = a3 != 1 ? new amvi(obj, a3) : new amux(obj);
        } else if (ordinal == 1) {
            amva = a3 != 1 ? new amvh(this.i, obj, amvp, a3) : new amus(this.i, obj, amvp);
        } else if (ordinal == 2) {
            amva = a3 != 1 ? new amvj(this.i, obj, amvp, a3) : new amvf(this.i, obj, amvp);
        } else {
            throw null;
        }
        amvp.a(amva);
        c();
        this.c += (long) a3;
        if (this.a.d()) {
            amvp.a(j2);
        }
        if (this.a.f()) {
            amvp.b(j2);
        }
        this.m.add(amvp);
        this.l.add(amvp);
        a2.a(obj);
    }

    /* access modifiers changed from: package-private */
    public final void a(Object obj, Object obj2, int i2, amvq amvq) {
        this.c -= (long) i2;
        int ordinal = amvq.ordinal();
        if (ordinal != 0 && ordinal != 1 && ordinal != 2 && ordinal != 3 && ordinal != 4) {
            throw null;
        } else if (this.a.n != amvo.t) {
            this.a.n.offer(new amvs(obj, obj2, amvq));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: amvp} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(defpackage.amvp r10, int r11, defpackage.amvq r12) {
        /*
            r9 = this;
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r9.f
            int r1 = r0.length()
            int r1 = r1 + -1
            r11 = r11 & r1
            java.lang.Object r1 = r0.get(r11)
            r3 = r1
            amvp r3 = (defpackage.amvp) r3
            r4 = r3
        L_0x0011:
            if (r4 == 0) goto L_0x0040
            if (r4 != r10) goto L_0x003b
            int r10 = r9.d
            r1 = 1
            int r10 = r10 + r1
            r9.d = r10
            java.lang.Object r5 = r4.d()
            amva r10 = r4.a()
            java.lang.Object r6 = r10.get()
            amva r7 = r4.a()
            r2 = r9
            r8 = r12
            amvp r10 = r2.a(r3, r4, r5, r6, r7, r8)
            int r12 = r9.b
            r0.set(r11, r10)
            int r12 = r12 + -1
            r9.b = r12
            return r1
        L_0x003b:
            amvp r4 = r4.b()
            goto L_0x0011
        L_0x0040:
            r10 = 0
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.amur.a(amvp, int, amvq):boolean");
    }
}
