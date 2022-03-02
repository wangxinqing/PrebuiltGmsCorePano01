package defpackage;

import java.util.concurrent.CountDownLatch;

/* renamed from: kfg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class kfg extends key implements ici {
    private static final ith g = new ith("CancellableOperation", "");
    public final itp f = new kff(this);
    private int h = 0;
    private boolean i = false;
    private final CountDownLatch j = new CountDownLatch(1);

    protected kfg(String str, kec kec, kwg kwg, int i2) {
        super(str, kec, kwg, i2, false);
        synchronized (kec.t) {
            kec.t.add(this);
        }
    }

    private static final void a(int i2) {
        g.b("CancellableOperation", "Illegal state: %s", Integer.valueOf(i2));
    }

    private final void d() {
        synchronized (this) {
            if (this.h != 4) {
                this.h = 4;
                kec kec = this.a;
                synchronized (kec.t) {
                    kec.t.remove(this);
                }
                this.j.countDown();
                return;
            }
            a(4);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        e();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0017, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0018, code lost:
        d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001b, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x001c, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r0 = r1.h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x001f, code lost:
        if (r0 == 1) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0022, code lost:
        if (r0 == 4) goto L_0x0029;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0024, code lost:
        a(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0027, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0028, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0029, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x002a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x002d, code lost:
        if (r1.i == false) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x002f, code lost:
        r1.h = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0032, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0033, code lost:
        h();
        d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0039, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        r1.h = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x003d, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x003e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0011, code lost:
        if (r0 == false) goto L_0x001c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(android.content.Context r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            int r2 = r1.h     // Catch:{ all -> 0x0042 }
            if (r2 == 0) goto L_0x000a
            a(r2)     // Catch:{ all -> 0x0042 }
            monitor-exit(r1)     // Catch:{ all -> 0x0042 }
            return
        L_0x000a:
            r2 = 1
            r1.h = r2     // Catch:{ all -> 0x0042 }
            boolean r0 = r1.i     // Catch:{ all -> 0x0042 }
            r0 = r0 ^ r2
            monitor-exit(r1)     // Catch:{ all -> 0x0042 }
            if (r0 == 0) goto L_0x001c
            r1.e()     // Catch:{ nja -> 0x0017 }
            goto L_0x001c
        L_0x0017:
            r2 = move-exception
            r1.d()
            throw r2
        L_0x001c:
            monitor-enter(r1)
            int r0 = r1.h     // Catch:{ all -> 0x003f }
            if (r0 == r2) goto L_0x002b
            r2 = 4
            if (r0 == r2) goto L_0x0029
            a(r0)     // Catch:{ all -> 0x003f }
            monitor-exit(r1)     // Catch:{ all -> 0x003f }
            return
        L_0x0029:
            monitor-exit(r1)     // Catch:{ all -> 0x003f }
            return
        L_0x002b:
            boolean r2 = r1.i     // Catch:{ all -> 0x003f }
            if (r2 == 0) goto L_0x003a
            r2 = 3
            r1.h = r2     // Catch:{ all -> 0x003f }
            monitor-exit(r1)     // Catch:{ all -> 0x003f }
            r1.h()
            r1.d()
            return
        L_0x003a:
            r2 = 2
            r1.h = r2     // Catch:{ all -> 0x003f }
            monitor-exit(r1)     // Catch:{ all -> 0x003f }
            return
        L_0x003f:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x003f }
            throw r2
        L_0x0042:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0042 }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kfg.b(android.content.Context):void");
    }

    public final void c() {
        g();
    }

    /* access modifiers changed from: protected */
    public abstract void e();

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0016, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0018, code lost:
        d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x001b, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean f() {
        /*
            r3 = this;
            monitor-enter(r3)
            int r0 = r3.h     // Catch:{ all -> 0x001c }
            r1 = 1
            if (r0 == r1) goto L_0x0017
            r2 = 2
            if (r0 == r2) goto L_0x0017
            r1 = 3
            r2 = 0
            if (r0 == r1) goto L_0x0015
            r1 = 4
            if (r0 == r1) goto L_0x0015
            a(r0)     // Catch:{ all -> 0x001c }
            monitor-exit(r3)     // Catch:{ all -> 0x001c }
            return r2
        L_0x0015:
            monitor-exit(r3)     // Catch:{ all -> 0x001c }
            return r2
        L_0x0017:
            monitor-exit(r3)     // Catch:{ all -> 0x001c }
            r3.d()
            return r1
        L_0x001c:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x001c }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kfg.f():boolean");
    }

    public final void g() {
        synchronized (this) {
            if (!this.i) {
                this.i = true;
                if (this.h == 2) {
                    this.h = 3;
                    h();
                    d();
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public abstract void h();

    public final synchronized boolean i() {
        return this.h == 4;
    }
}
