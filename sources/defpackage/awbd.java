package defpackage;

/* renamed from: awbd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class awbd implements baua {
    public final batd a = new batd();
    public final batd b = new batd();
    public final long c;
    public boolean d;
    public boolean e;
    final /* synthetic */ awbf f;

    public awbd(awbf awbf, long j) {
        this.f = awbf;
        this.c = j;
    }

    public final bauc bu() {
        return this.f.h;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0072, code lost:
        r10 = r7.f.d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0076, code lost:
        monitor-enter(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        r2 = r7.f.d;
        r3 = r2.j + r8;
        r2.j = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x008b, code lost:
        if (r3 < ((long) (r2.l.c() / 2))) goto L_0x009d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x008d, code lost:
        r2 = r7.f.d;
        r2.a(0, r2.j);
        r7.f.d.j = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x009d, code lost:
        monitor-exit(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x009e, code lost:
        return r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00d3, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00d4, code lost:
        r7.f.h.b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00db, code lost:
        throw r8;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long c(defpackage.batd r8, long r9) {
        /*
            r7 = this;
            r0 = 0
            int r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r2 < 0) goto L_0x00df
            awbf r2 = r7.f
            monitor-enter(r2)
            awbf r3 = r7.f     // Catch:{ all -> 0x00dc }
            awbe r3 = r3.h     // Catch:{ all -> 0x00dc }
            r3.c()     // Catch:{ all -> 0x00dc }
        L_0x0010:
            batd r3 = r7.b     // Catch:{ all -> 0x00d3 }
            long r3 = r3.b     // Catch:{ all -> 0x00d3 }
            int r5 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r5 == 0) goto L_0x0019
            goto L_0x002b
        L_0x0019:
            boolean r3 = r7.e     // Catch:{ all -> 0x00d3 }
            if (r3 != 0) goto L_0x002b
            boolean r3 = r7.d     // Catch:{ all -> 0x00d3 }
            if (r3 != 0) goto L_0x002b
            awbf r3 = r7.f     // Catch:{ all -> 0x00d3 }
            awak r4 = r3.j     // Catch:{ all -> 0x00d3 }
            if (r4 != 0) goto L_0x002b
            r3.h()     // Catch:{ all -> 0x00d3 }
            goto L_0x0010
        L_0x002b:
            awbf r3 = r7.f     // Catch:{ all -> 0x00dc }
            awbe r3 = r3.h     // Catch:{ all -> 0x00dc }
            r3.b()     // Catch:{ all -> 0x00dc }
            boolean r3 = r7.d     // Catch:{ all -> 0x00dc }
            if (r3 != 0) goto L_0x00cb
            awbf r3 = r7.f     // Catch:{ all -> 0x00dc }
            awak r3 = r3.j     // Catch:{ all -> 0x00dc }
            if (r3 != 0) goto L_0x00a6
            batd r3 = r7.b     // Catch:{ all -> 0x00dc }
            long r4 = r3.b     // Catch:{ all -> 0x00dc }
            int r6 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r6 == 0) goto L_0x00a2
            long r9 = java.lang.Math.min(r9, r4)     // Catch:{ all -> 0x00dc }
            long r8 = r3.c(r8, r9)     // Catch:{ all -> 0x00dc }
            awbf r10 = r7.f     // Catch:{ all -> 0x00dc }
            long r3 = r10.a     // Catch:{ all -> 0x00dc }
            long r3 = r3 + r8
            r10.a = r3     // Catch:{ all -> 0x00dc }
            awbb r10 = r10.d     // Catch:{ all -> 0x00dc }
            awbw r10 = r10.l     // Catch:{ all -> 0x00dc }
            int r10 = r10.c()     // Catch:{ all -> 0x00dc }
            int r10 = r10 / 2
            long r5 = (long) r10     // Catch:{ all -> 0x00dc }
            int r10 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r10 < 0) goto L_0x0071
            awbf r10 = r7.f     // Catch:{ all -> 0x00dc }
            awbb r3 = r10.d     // Catch:{ all -> 0x00dc }
            int r4 = r10.c     // Catch:{ all -> 0x00dc }
            long r5 = r10.a     // Catch:{ all -> 0x00dc }
            r3.a((int) r4, (long) r5)     // Catch:{ all -> 0x00dc }
            awbf r10 = r7.f     // Catch:{ all -> 0x00dc }
            r10.a = r0     // Catch:{ all -> 0x00dc }
        L_0x0071:
            monitor-exit(r2)     // Catch:{ all -> 0x00dc }
            awbf r10 = r7.f
            awbb r10 = r10.d
            monitor-enter(r10)
            awbf r2 = r7.f     // Catch:{ all -> 0x009f }
            awbb r2 = r2.d     // Catch:{ all -> 0x009f }
            long r3 = r2.j     // Catch:{ all -> 0x009f }
            long r3 = r3 + r8
            r2.j = r3     // Catch:{ all -> 0x009f }
            awbw r2 = r2.l     // Catch:{ all -> 0x009f }
            int r2 = r2.c()     // Catch:{ all -> 0x009f }
            int r2 = r2 / 2
            long r5 = (long) r2     // Catch:{ all -> 0x009f }
            int r2 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r2 < 0) goto L_0x009d
            awbf r2 = r7.f     // Catch:{ all -> 0x009f }
            awbb r2 = r2.d     // Catch:{ all -> 0x009f }
            r3 = 0
            long r4 = r2.j     // Catch:{ all -> 0x009f }
            r2.a((int) r3, (long) r4)     // Catch:{ all -> 0x009f }
            awbf r2 = r7.f     // Catch:{ all -> 0x009f }
            awbb r2 = r2.d     // Catch:{ all -> 0x009f }
            r2.j = r0     // Catch:{ all -> 0x009f }
        L_0x009d:
            monitor-exit(r10)     // Catch:{ all -> 0x009f }
            return r8
        L_0x009f:
            r8 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x009f }
            throw r8
        L_0x00a2:
            monitor-exit(r2)     // Catch:{ all -> 0x00dc }
            r8 = -1
            return r8
        L_0x00a6:
            java.io.IOException r8 = new java.io.IOException     // Catch:{ all -> 0x00dc }
            java.lang.String r9 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x00dc }
            java.lang.String r10 = java.lang.String.valueOf(r9)     // Catch:{ all -> 0x00dc }
            int r10 = r10.length()     // Catch:{ all -> 0x00dc }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x00dc }
            int r10 = r10 + 18
            r0.<init>(r10)     // Catch:{ all -> 0x00dc }
            java.lang.String r10 = "stream was reset: "
            r0.append(r10)     // Catch:{ all -> 0x00dc }
            r0.append(r9)     // Catch:{ all -> 0x00dc }
            java.lang.String r9 = r0.toString()     // Catch:{ all -> 0x00dc }
            r8.<init>(r9)     // Catch:{ all -> 0x00dc }
            throw r8     // Catch:{ all -> 0x00dc }
        L_0x00cb:
            java.io.IOException r8 = new java.io.IOException     // Catch:{ all -> 0x00dc }
            java.lang.String r9 = "stream closed"
            r8.<init>(r9)     // Catch:{ all -> 0x00dc }
            throw r8     // Catch:{ all -> 0x00dc }
        L_0x00d3:
            r8 = move-exception
            awbf r9 = r7.f     // Catch:{ all -> 0x00dc }
            awbe r9 = r9.h     // Catch:{ all -> 0x00dc }
            r9.b()     // Catch:{ all -> 0x00dc }
            throw r8     // Catch:{ all -> 0x00dc }
        L_0x00dc:
            r8 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00dc }
            throw r8
        L_0x00df:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 35
            r0.<init>(r1)
            java.lang.String r1 = "byteCount < 0: "
            r0.append(r1)
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            r8.<init>(r9)
            goto L_0x00f9
        L_0x00f8:
            throw r8
        L_0x00f9:
            goto L_0x00f8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.awbd.c(batd, long):long");
    }

    public final void close() {
        synchronized (this.f) {
            this.d = true;
            this.b.n();
            this.f.notifyAll();
        }
        this.f.f();
    }
}
