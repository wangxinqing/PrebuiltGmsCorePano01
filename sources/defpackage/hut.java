package defpackage;

/* renamed from: hut  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class hut implements huz {
    final /* synthetic */ huv a;

    public hut(huv huv) {
        this.a = huv;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
        r14.close();
        r0 = new defpackage.hux(r3, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0132, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.hux a(long r23, defpackage.hvl r25) {
        /*
            r22 = this;
            r1 = r22
            r0 = r25
            huv r2 = r1.a
            java.lang.Object r2 = r2.b
            monitor-enter(r2)
            long r3 = r0.b     // Catch:{ all -> 0x0146 }
            int r4 = (int) r3     // Catch:{ all -> 0x0146 }
            avtn r3 = r0.a     // Catch:{ all -> 0x0146 }
            huv r0 = r1.a     // Catch:{ all -> 0x0146 }
            android.util.LruCache r0 = r0.f     // Catch:{ all -> 0x0146 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0146 }
            r0.remove(r5)     // Catch:{ all -> 0x0146 }
            huv r0 = r1.a     // Catch:{ all -> 0x0146 }
            android.util.LruCache r0 = r0.g     // Catch:{ all -> 0x0146 }
            r0.remove(r5)     // Catch:{ all -> 0x0146 }
            int r0 = r3.k     // Catch:{ all -> 0x0146 }
            huv r5 = r1.a     // Catch:{ all -> 0x0146 }
            java.io.File r5 = r5.e     // Catch:{ all -> 0x0146 }
            java.lang.String r5 = r5.getAbsolutePath()     // Catch:{ all -> 0x0146 }
            java.lang.String r6 = "/"
            java.lang.String r5 = r5.concat(r6)     // Catch:{ all -> 0x0146 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0146 }
            java.lang.String r0 = r5.concat(r0)     // Catch:{ all -> 0x0146 }
            java.lang.String r5 = "/"
            java.lang.String r0 = r0.concat(r5)     // Catch:{ all -> 0x0146 }
            java.lang.String r5 = defpackage.hwt.b(r3)     // Catch:{ all -> 0x0146 }
            java.lang.String r0 = r0.concat(r5)     // Catch:{ all -> 0x0146 }
            java.lang.String r5 = "/"
            java.lang.String r0 = r0.concat(r5)     // Catch:{ all -> 0x0146 }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x0146 }
            java.lang.String r0 = r0.concat(r4)     // Catch:{ all -> 0x0146 }
            java.io.File r11 = new java.io.File     // Catch:{ all -> 0x0146 }
            r11.<init>(r0)     // Catch:{ all -> 0x0146 }
            boolean r0 = r11.isDirectory()     // Catch:{ all -> 0x0146 }
            if (r0 == 0) goto L_0x0142
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ all -> 0x0146 }
            r12.<init>()     // Catch:{ all -> 0x0146 }
            java.lang.String[] r0 = r11.list()     // Catch:{ all -> 0x0146 }
            java.lang.String[] r0 = defpackage.huv.a((java.lang.String[]) r0)     // Catch:{ all -> 0x0146 }
            java.util.PriorityQueue r13 = new java.util.PriorityQueue     // Catch:{ all -> 0x0146 }
            r13.<init>()     // Catch:{ all -> 0x0146 }
            long r14 = defpackage.huv.l()     // Catch:{ all -> 0x0146 }
            huu r10 = new huu     // Catch:{ all -> 0x0146 }
            huv r4 = r1.a     // Catch:{ all -> 0x0146 }
            r10.<init>(r4)     // Catch:{ all -> 0x0146 }
            int r9 = r0.length     // Catch:{ all -> 0x0135 }
            r4 = 0
            r8 = 0
        L_0x007f:
            if (r8 >= r9) goto L_0x00c9
            r7 = r0[r8]     // Catch:{ all -> 0x0135 }
            java.lang.String r4 = "play_logger_context.pb"
            boolean r4 = r4.equals(r7)     // Catch:{ all -> 0x0135 }
            if (r4 == 0) goto L_0x0093
            r18 = r8
            r19 = r9
            r20 = r14
            r14 = r10
            goto L_0x00c1
        L_0x0093:
            r16 = 1
            r17 = 0
            r4 = r10
            r5 = r14
            r25 = r7
            r7 = r11
            r18 = r8
            r8 = r25
            r19 = r9
            r9 = r16
            r20 = r14
            r14 = r10
            r10 = r17
            long r4 = defpackage.huv.a(r4, r5, r7, r8, r9, r10)     // Catch:{ all -> 0x0133 }
            r6 = -1
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 != 0) goto L_0x00c1
            java.io.File r4 = new java.io.File     // Catch:{ all -> 0x0133 }
            r5 = r25
            r4.<init>(r11, r5)     // Catch:{ all -> 0x0133 }
            hus r4 = defpackage.huv.a((java.io.File) r4)     // Catch:{ all -> 0x0133 }
            r13.add(r4)     // Catch:{ all -> 0x0133 }
        L_0x00c1:
            int r8 = r18 + 1
            r10 = r14
            r9 = r19
            r14 = r20
            goto L_0x007f
        L_0x00c9:
            r14 = r10
            boolean r0 = defpackage.awtf.g()     // Catch:{ all -> 0x0133 }
            r4 = 0
            if (r0 != 0) goto L_0x00ef
            huv r0 = r1.a     // Catch:{ ExecutionException -> 0x00e3 }
            ahfv r0 = r0.h     // Catch:{ ExecutionException -> 0x00e3 }
            aorr r0 = r0.a()     // Catch:{ ExecutionException -> 0x00e3 }
            java.lang.Object r0 = defpackage.aosr.a(r0)     // Catch:{ ExecutionException -> 0x00e3 }
            avra r0 = (defpackage.avra) r0     // Catch:{ ExecutionException -> 0x00e3 }
            r4 = r23
            r6 = r0
            goto L_0x00f2
        L_0x00e3:
            r0 = move-exception
            java.lang.String r5 = "FlatFileLogStore"
            java.lang.String r6 = "Failed to get data from ClearcutInternalEvents proto data store."
            android.util.Log.e(r5, r6, r0)     // Catch:{ all -> 0x0133 }
            r6 = r4
            r4 = r23
            goto L_0x00f2
        L_0x00ef:
            r6 = r4
            r4 = r23
        L_0x00f2:
            java.lang.Object r0 = r13.poll()     // Catch:{ all -> 0x0133 }
            hus r0 = (defpackage.hus) r0     // Catch:{ all -> 0x0133 }
            if (r0 == 0) goto L_0x0129
            r7 = 0
            int r9 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r9 <= 0) goto L_0x0129
            java.io.File r7 = new java.io.File     // Catch:{ all -> 0x0133 }
            java.lang.String r8 = r0.a     // Catch:{ all -> 0x0133 }
            r7.<init>(r11, r8)     // Catch:{ all -> 0x0133 }
            huw r0 = defpackage.huv.a((defpackage.avra) r6, (defpackage.hus) r0, (java.io.File) r7)     // Catch:{ IOException -> 0x0119 }
            auay r8 = r0.b     // Catch:{ IOException -> 0x0119 }
            int r8 = r8.a()     // Catch:{ IOException -> 0x0119 }
            long r8 = (long) r8
            long r4 = r4 - r8
            r12.add(r0)     // Catch:{ IOException -> 0x0117 }
            goto L_0x0128
        L_0x0117:
            r0 = move-exception
            goto L_0x011a
        L_0x0119:
            r0 = move-exception
        L_0x011a:
            java.lang.String r8 = defpackage.hwt.b(r3)     // Catch:{ all -> 0x0133 }
            hum r9 = defpackage.hum.CORRUPTED_LOG_FILE_CONTENTS     // Catch:{ all -> 0x0133 }
            hun r0 = r9.a(r0)     // Catch:{ all -> 0x0133 }
            r9 = 1
            r14.a(r7, r8, r0, r9)     // Catch:{ all -> 0x0133 }
        L_0x0128:
            goto L_0x00f2
        L_0x0129:
            r14.close()     // Catch:{ all -> 0x0146 }
            hux r0 = new hux     // Catch:{ all -> 0x0146 }
            r0.<init>(r3, r12)     // Catch:{ all -> 0x0146 }
            monitor-exit(r2)     // Catch:{ all -> 0x0146 }
            return r0
        L_0x0133:
            r0 = move-exception
            goto L_0x0137
        L_0x0135:
            r0 = move-exception
            r14 = r10
        L_0x0137:
            r3 = r0
            r14.close()     // Catch:{ all -> 0x013c }
            goto L_0x0141
        L_0x013c:
            r0 = move-exception
            r4 = r0
            defpackage.apev.a((java.lang.Throwable) r3, (java.lang.Throwable) r4)     // Catch:{ all -> 0x0146 }
        L_0x0141:
            throw r3     // Catch:{ all -> 0x0146 }
        L_0x0142:
            hux r0 = defpackage.hux.a     // Catch:{ all -> 0x0146 }
            monitor-exit(r2)     // Catch:{ all -> 0x0146 }
            return r0
        L_0x0146:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0146 }
            goto L_0x014a
        L_0x0149:
            throw r0
        L_0x014a:
            goto L_0x0149
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hut.a(long, hvl):hux");
    }
}
