package defpackage;

/* renamed from: awbc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class awbc implements batz {
    public static final /* synthetic */ int d = 0;
    public boolean a;
    public boolean b;
    final /* synthetic */ awbf c;
    private final batd e = new batd();

    public awbc(awbf awbf) {
        this.c = awbf;
    }

    private final void a(boolean z) {
        awbf awbf;
        long min;
        boolean z2;
        synchronized (this.c) {
            this.c.i.c();
            while (true) {
                try {
                    awbf = this.c;
                    if (awbf.b <= 0 && !this.b && !this.a) {
                        if (awbf.j != null) {
                            break;
                        }
                        awbf.h();
                    }
                } catch (Throwable th) {
                    this.c.i.b();
                    throw th;
                }
            }
            awbf.i.b();
            this.c.g();
            min = Math.min(this.c.b, this.e.b);
            this.c.b -= min;
        }
        this.c.i.c();
        try {
            awbf awbf2 = this.c;
            awbb awbb = awbf2.d;
            int i = awbf2.c;
            if (!z || min != this.e.b) {
                z2 = false;
            } else {
                z2 = true;
            }
            awbb.a(i, z2, this.e, min);
        } finally {
            this.c.i.b();
        }
    }

    public final bauc bu() {
        return this.c.i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0021, code lost:
        if (r13.e.b > 0) goto L_0x0024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0024, code lost:
        a(true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0029, code lost:
        r0.d.a(r0.c, true, (defpackage.batd) null, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0034, code lost:
        r1 = r13.c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0036, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r13.a = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0039, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003a, code lost:
        r13.c.d.b();
        r13.c.f();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0046, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0008, code lost:
        r0 = r13.c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000f, code lost:
        if (r0.g.b != false) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0019, code lost:
        if (r13.e.b <= 0) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void close() {
        /*
            r13 = this;
            awbf r0 = r13.c
            monitor-enter(r0)
            boolean r1 = r13.a     // Catch:{ all -> 0x004c }
            if (r1 != 0) goto L_0x004a
            monitor-exit(r0)     // Catch:{ all -> 0x004c }
            awbf r0 = r13.c
            awbc r1 = r0.g
            boolean r1 = r1.b
            r2 = 1
            if (r1 != 0) goto L_0x0034
            batd r1 = r13.e
            long r3 = r1.b
            r5 = 0
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 <= 0) goto L_0x0029
        L_0x001b:
            batd r0 = r13.e
            long r0 = r0.b
            int r3 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r3 > 0) goto L_0x0024
            goto L_0x0034
        L_0x0024:
            r13.a(r2)
            goto L_0x001b
        L_0x0029:
            awbb r7 = r0.d
            int r8 = r0.c
            r9 = 1
            r10 = 0
            r11 = 0
            r7.a(r8, r9, r10, r11)
        L_0x0034:
            awbf r1 = r13.c
            monitor-enter(r1)
            r13.a = r2     // Catch:{ all -> 0x0047 }
            monitor-exit(r1)     // Catch:{ all -> 0x0047 }
            awbf r0 = r13.c
            awbb r0 = r0.d
            r0.b()
            awbf r0 = r13.c
            r0.f()
            return
        L_0x0047:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0047 }
            throw r0
        L_0x004a:
            monitor-exit(r0)     // Catch:{ all -> 0x004c }
            return
        L_0x004c:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x004c }
            goto L_0x0050
        L_0x004f:
            throw r1
        L_0x0050:
            goto L_0x004f
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.awbc.close():void");
    }

    public final void flush() {
        synchronized (this.c) {
            this.c.g();
        }
        while (this.e.b > 0) {
            a(false);
            this.c.d.b();
        }
    }

    public final void a(batd batd, long j) {
        this.e.a(batd, j);
        while (this.e.b >= 16384) {
            a(false);
        }
    }
}
