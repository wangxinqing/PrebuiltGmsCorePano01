package defpackage;

/* renamed from: avyr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class avyr implements Runnable {
    final /* synthetic */ avys a;

    public avyr(avys avys) {
        this.a = avys;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x009b, code lost:
        r9 = r9 + 1;
        r0 = r3 - r11.l;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00a3, code lost:
        if (r0 <= r6) goto L_0x00a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00a5, code lost:
        r12 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00a7, code lost:
        r12 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00aa, code lost:
        if (r0 > r6) goto L_0x00ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00ad, code lost:
        r5 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00ae, code lost:
        r1 = r18;
        r6 = r12;
        r0 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00ce, code lost:
        r0 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00d6, code lost:
        defpackage.awaj.a(r5.c);
        r0 = 0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r18 = this;
            r1 = r18
        L_0x0002:
            avys r2 = r1.a
            long r3 = java.lang.System.nanoTime()
            monitor-enter(r2)
            java.util.Deque r0 = r2.f     // Catch:{ all -> 0x010d }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x010d }
            r5 = 0
            r6 = -9223372036854775808
            r9 = 0
            r10 = 0
        L_0x0014:
            boolean r11 = r0.hasNext()     // Catch:{ all -> 0x010d }
            if (r11 == 0) goto L_0x00b5
            java.lang.Object r11 = r0.next()     // Catch:{ all -> 0x0109 }
            awdk r11 = (defpackage.awdk) r11     // Catch:{ all -> 0x0109 }
            java.util.List r12 = r11.j     // Catch:{ all -> 0x0109 }
            r13 = 0
        L_0x0023:
            int r14 = r12.size()     // Catch:{ all -> 0x0109 }
            if (r13 >= r14) goto L_0x008b
            java.lang.Object r14 = r12.get(r13)     // Catch:{ all -> 0x0109 }
            java.lang.ref.Reference r14 = (java.lang.ref.Reference) r14     // Catch:{ all -> 0x0109 }
            java.lang.Object r14 = r14.get()     // Catch:{ all -> 0x0109 }
            if (r14 != 0) goto L_0x0084
            java.util.logging.Logger r14 = defpackage.awaa.a     // Catch:{ all -> 0x0109 }
            java.util.logging.Level r15 = java.util.logging.Level.WARNING     // Catch:{ all -> 0x0109 }
            avzo r8 = r11.a     // Catch:{ all -> 0x0109 }
            avyj r8 = r8.a     // Catch:{ all -> 0x0109 }
            avzd r8 = r8.a     // Catch:{ all -> 0x0109 }
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch:{ all -> 0x0109 }
            java.lang.String r16 = java.lang.String.valueOf(r8)     // Catch:{ all -> 0x0109 }
            int r16 = r16.length()     // Catch:{ all -> 0x0109 }
            r17 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0109 }
            int r1 = r16 + 69
            r0.<init>(r1)     // Catch:{ all -> 0x0109 }
            java.lang.String r1 = "A connection to "
            r0.append(r1)     // Catch:{ all -> 0x0109 }
            r0.append(r8)     // Catch:{ all -> 0x0109 }
            java.lang.String r1 = " was leaked. Did you forget to close a response body?"
            r0.append(r1)     // Catch:{ all -> 0x0109 }
            java.lang.String r1 = "com.squareup.okhttp.ConnectionPool"
            java.lang.String r8 = "pruneAndGetAllocationCount"
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0109 }
            r14.logp(r15, r1, r8, r0)     // Catch:{ all -> 0x0109 }
            r12.remove(r13)     // Catch:{ all -> 0x0109 }
            r0 = 1
            r11.k = r0     // Catch:{ all -> 0x0109 }
            boolean r0 = r12.isEmpty()     // Catch:{ all -> 0x0109 }
            if (r0 == 0) goto L_0x007f
            long r0 = r2.d     // Catch:{ all -> 0x0109 }
            long r0 = r3 - r0
            r11.l = r0     // Catch:{ all -> 0x0109 }
            goto L_0x009b
        L_0x007f:
            r1 = r18
            r0 = r17
            goto L_0x0023
        L_0x0084:
            r17 = r0
            int r13 = r13 + 1
            r1 = r18
            goto L_0x0023
        L_0x008b:
            r17 = r0
            int r0 = r12.size()     // Catch:{ all -> 0x0109 }
            if (r0 <= 0) goto L_0x009b
            int r10 = r10 + 1
            r1 = r18
            r0 = r17
            goto L_0x0014
        L_0x009b:
            int r9 = r9 + 1
            long r0 = r11.l     // Catch:{ all -> 0x0109 }
            long r0 = r3 - r0
            int r8 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r8 <= 0) goto L_0x00a7
            r12 = r0
            goto L_0x00a8
        L_0x00a7:
            r12 = r6
        L_0x00a8:
            int r8 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r8 > 0) goto L_0x00ad
            goto L_0x00ae
        L_0x00ad:
            r5 = r11
        L_0x00ae:
            r1 = r18
            r6 = r12
            r0 = r17
            goto L_0x0014
        L_0x00b5:
            long r0 = r2.d     // Catch:{ all -> 0x0109 }
            r3 = -1
            r11 = 0
            int r8 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r8 < 0) goto L_0x00c0
            goto L_0x00d0
        L_0x00c0:
            int r8 = r2.c     // Catch:{ all -> 0x0109 }
            if (r9 > r8) goto L_0x00d0
            if (r9 <= 0) goto L_0x00c9
            long r0 = r0 - r6
            monitor-exit(r2)     // Catch:{ all -> 0x0109 }
            goto L_0x00dc
        L_0x00c9:
            if (r10 <= 0) goto L_0x00cd
            monitor-exit(r2)     // Catch:{ all -> 0x0109 }
            goto L_0x00dc
        L_0x00cd:
            monitor-exit(r2)     // Catch:{ all -> 0x0109 }
            r0 = r3
            goto L_0x00dc
        L_0x00d0:
            java.util.Deque r0 = r2.f     // Catch:{ all -> 0x0109 }
            r0.remove(r5)     // Catch:{ all -> 0x0109 }
            monitor-exit(r2)     // Catch:{ all -> 0x0109 }
            java.net.Socket r0 = r5.c
            defpackage.awaj.a((java.net.Socket) r0)
            r0 = r11
        L_0x00dc:
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 == 0) goto L_0x0106
            int r2 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r2 <= 0) goto L_0x0101
            r2 = 1000000(0xf4240, double:4.940656E-318)
            long r4 = r0 / r2
            long r2 = r2 * r4
            long r0 = r0 - r2
            r3 = r18
            avys r2 = r3.a
            monitor-enter(r2)
            avys r6 = r3.a     // Catch:{ InterruptedException -> 0x00fa }
            int r1 = (int) r0     // Catch:{ InterruptedException -> 0x00fa }
            r6.wait(r4, r1)     // Catch:{ InterruptedException -> 0x00fa }
            goto L_0x00fb
        L_0x00f8:
            r0 = move-exception
            goto L_0x00ff
        L_0x00fa:
            r0 = move-exception
        L_0x00fb:
            monitor-exit(r2)     // Catch:{ all -> 0x00f8 }
            r1 = r3
            goto L_0x0002
        L_0x00ff:
            monitor-exit(r2)     // Catch:{ all -> 0x00f8 }
            throw r0
        L_0x0101:
            r3 = r18
            r1 = r3
            goto L_0x0002
        L_0x0106:
            r3 = r18
            return
        L_0x0109:
            r0 = move-exception
            r3 = r18
            goto L_0x010f
        L_0x010d:
            r0 = move-exception
            r3 = r1
        L_0x010f:
            monitor-exit(r2)     // Catch:{ all -> 0x0111 }
            throw r0
        L_0x0111:
            r0 = move-exception
            goto L_0x010f
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.avyr.run():void");
    }
}
