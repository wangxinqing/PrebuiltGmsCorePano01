package defpackage;

/* renamed from: lkt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class lkt implements Runnable {
    final /* synthetic */ lkr a;

    public lkt(lkr lkr) {
        this.a = lkr;
    }

    /* JADX WARNING: type inference failed for: r8v0 */
    /* JADX WARNING: type inference failed for: r8v1, types: [boolean] */
    /* JADX WARNING: type inference failed for: r8v11 */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x00d3, code lost:
        if (r0.e != false) goto L_0x00d5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r19 = this;
            r1 = r19
            lkr r2 = r1.a
            lkm r0 = r2.e
            agvx r3 = defpackage.jzq.ap
            java.lang.Object r3 = r3.c()
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r4 = 3
            kqy[] r4 = new defpackage.kqy[r4]
            kph r5 = defpackage.kph.HAS_PENDING_CHANGES
            kqh r5 = r5.n
            r6 = 1
            kqy r5 = r5.e((long) r6)
            r8 = 0
            r4[r8] = r5
            kph r5 = defpackage.kph.REQUIRES_SYNC
            kqh r5 = r5.n
            kqy r5 = r5.e((long) r6)
            r6 = 1
            r4[r6] = r5
            kph r5 = defpackage.kph.HISTORY_LENGTH
            kqh r5 = r5.n
            long r9 = (long) r3
            kqy r3 = r5.d((long) r9)
            r5 = 2
            r4[r5] = r3
            kqy r3 = defpackage.kqz.b((defpackage.kqy[]) r4)
            kqy[] r4 = new defpackage.kqy[r5]
            r4[r8] = r3
            kqy[] r3 = new defpackage.kqy[r5]
            kph r5 = defpackage.kph.ENTRY_ID
            kqh r5 = r5.n
            kqy r5 = r5.d()
            r3[r8] = r5
            kph r5 = defpackage.kph.RESOURCE_ID
            kqh r5 = r5.n
            kqy r5 = r5.d()
            r3[r6] = r5
            kqy r3 = defpackage.kqz.b((defpackage.kqy[]) r3)
            r4[r6] = r3
            kqy r3 = defpackage.kqz.a((defpackage.kqy[]) r4)
            kkb r4 = r0.a
            kql r5 = defpackage.kpi.a
            java.lang.String r5 = r5.b()
            r7 = 0
            android.database.Cursor r3 = r4.a((java.lang.String) r5, (java.lang.String[]) r7, (defpackage.kqy) r3, (java.lang.String) r7)
            kky r4 = new kky
            kkb r5 = r0.a
            kpe r7 = new kpe
            kkf r0 = r0.b
            r7.<init>(r0)
            r4.<init>(r5, r3, r7)
            ith r0 = defpackage.lkr.a     // Catch:{ Exception -> 0x023c }
            java.lang.Object[] r3 = new java.lang.Object[r6]     // Catch:{ Exception -> 0x023c }
            int r5 = r4.size()     // Catch:{ Exception -> 0x023c }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ Exception -> 0x023c }
            r3[r8] = r5     // Catch:{ Exception -> 0x023c }
            java.lang.String r5 = "Syncing/compacting %s Realtime documents..."
            r0.a((java.lang.String) r5, (java.lang.Object[]) r3)     // Catch:{ Exception -> 0x023c }
            java.util.Iterator r3 = r4.iterator()     // Catch:{ Exception -> 0x023c }
        L_0x0093:
            boolean r0 = r3.hasNext()     // Catch:{ Exception -> 0x023c }
            if (r0 == 0) goto L_0x022f
            java.lang.Object r0 = r3.next()     // Catch:{ Exception -> 0x023c }
            r5 = r0
            ljt r5 = (defpackage.ljt) r5     // Catch:{ Exception -> 0x023c }
            ith r0 = defpackage.lkr.a     // Catch:{ Exception -> 0x0217 }
            java.lang.Object[] r7 = new java.lang.Object[r6]     // Catch:{ Exception -> 0x0217 }
            r7[r8] = r5     // Catch:{ Exception -> 0x0217 }
            java.lang.String r9 = "Syncing/compacting realtime document: %s"
            r0.a((java.lang.String) r9, (java.lang.Object[]) r7)     // Catch:{ Exception -> 0x0217 }
            com.google.android.gms.drive.DriveId r0 = r5.a     // Catch:{ Exception -> 0x0217 }
            defpackage.iva.a((java.lang.Object) r0)     // Catch:{ Exception -> 0x0217 }
            com.google.android.gms.drive.DriveId r0 = r5.a     // Catch:{ Exception -> 0x0217 }
            java.lang.String r7 = r0.a     // Catch:{ Exception -> 0x0217 }
            lkm r0 = r2.e     // Catch:{ Exception -> 0x0217 }
            lkk r9 = r0.a(r5, r8)     // Catch:{ Exception -> 0x0217 }
            if (r9 != 0) goto L_0x00c8
            ith r0 = defpackage.lkr.a     // Catch:{ all -> 0x0206 }
            java.lang.Object[] r7 = new java.lang.Object[r6]     // Catch:{ all -> 0x0206 }
            r7[r8] = r5     // Catch:{ all -> 0x0206 }
            java.lang.String r10 = "Realtime document is in use; skipping: %s"
            r0.a((java.lang.String) r10, (java.lang.Object[]) r7)     // Catch:{ all -> 0x0206 }
            goto L_0x0093
        L_0x00c8:
            kpf r0 = r9.h()     // Catch:{ all -> 0x0206 }
            boolean r10 = r0.f     // Catch:{ all -> 0x0206 }
            if (r10 == 0) goto L_0x00d1
            goto L_0x00d5
        L_0x00d1:
            boolean r0 = r0.e     // Catch:{ all -> 0x0206 }
            if (r0 == 0) goto L_0x01e7
        L_0x00d5:
            lgy r0 = r2.g     // Catch:{ all -> 0x0206 }
            boolean r0 = r0.a()     // Catch:{ all -> 0x0206 }
            if (r0 == 0) goto L_0x01da
            ith r0 = defpackage.lkr.a     // Catch:{ all -> 0x0206 }
            java.lang.Object[] r10 = new java.lang.Object[r6]     // Catch:{ all -> 0x0206 }
            r10[r8] = r7     // Catch:{ all -> 0x0206 }
            java.lang.String r11 = "Syncing Realtime document: %s"
            r0.a((java.lang.String) r11, (java.lang.Object[]) r10)     // Catch:{ all -> 0x0206 }
            lkq r0 = new lkq     // Catch:{ all -> 0x0206 }
            r0.<init>(r2, r9)     // Catch:{ all -> 0x0206 }
            kkz r10 = r5.d     // Catch:{ all -> 0x0206 }
            java.lang.String r11 = r5.e     // Catch:{ all -> 0x0206 }
            kkf r12 = r2.d     // Catch:{ all -> 0x0206 }
            long r13 = r10.b     // Catch:{ all -> 0x0206 }
            khq r10 = r12.a((long) r13, (java.lang.String) r11)     // Catch:{ all -> 0x0206 }
            ljp r15 = new ljp     // Catch:{ all -> 0x0206 }
            android.content.Context r11 = r2.b     // Catch:{ all -> 0x0206 }
            r15.<init>(r11, r10)     // Catch:{ all -> 0x0206 }
            lkp r18 = new lkp     // Catch:{ all -> 0x0206 }
            r18.<init>()     // Catch:{ all -> 0x0206 }
            android.content.Context r11 = r2.b     // Catch:{ all -> 0x0206 }
            com.google.android.gms.common.internal.ClientContext r10 = r10.a((android.content.Context) r11)     // Catch:{ all -> 0x0206 }
            int r10 = r10.b     // Catch:{ all -> 0x0206 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x0206 }
            ljz r11 = new ljz     // Catch:{ all -> 0x0206 }
            r12 = 2147483647(0x7fffffff, float:NaN)
            r11.<init>(r12, r10)     // Catch:{ all -> 0x0206 }
            aloz r10 = new aloz     // Catch:{ all -> 0x0206 }
            agvx r12 = defpackage.jzq.at     // Catch:{ all -> 0x0206 }
            java.lang.Object r12 = r12.c()     // Catch:{ all -> 0x0206 }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ all -> 0x0206 }
            r13 = 6000000(0x5b8d80, float:8.407791E-39)
            java.lang.String r14 = java.lang.Integer.toString(r13)     // Catch:{ all -> 0x0206 }
            lkn r13 = new lkn     // Catch:{ all -> 0x0206 }
            r13.<init>(r0)     // Catch:{ all -> 0x0206 }
            alrc r8 = new alrc     // Catch:{ all -> 0x0206 }
            r8.<init>(r11)     // Catch:{ all -> 0x0206 }
            java.lang.String r16 = "android"
            r11 = r10
            r17 = r13
            r13 = r16
            r16 = r17
            r17 = r8
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)     // Catch:{ all -> 0x0206 }
            boolean r8 = r9.a()     // Catch:{ all -> 0x0206 }
            if (r8 == 0) goto L_0x0199
            alns r8 = r9.b()     // Catch:{ all -> 0x0206 }
            alrs r11 = r8.a     // Catch:{ all -> 0x0206 }
            alrt r11 = r11.a     // Catch:{ all -> 0x0206 }
            alsx r8 = r8.b     // Catch:{ all -> 0x0206 }
            java.util.logging.Logger r12 = defpackage.alnw.a     // Catch:{ all -> 0x0206 }
            java.util.logging.Level r13 = java.util.logging.Level.INFO     // Catch:{ all -> 0x0206 }
            java.lang.String r14 = "com.google.apps.brix.api.client.cache.sync.OtStateSyncer"
            java.lang.String r15 = "syncOtState"
            java.lang.String r6 = "Synchronizing file: "
            java.lang.String r1 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x0206 }
            int r16 = r1.length()     // Catch:{ all -> 0x0206 }
            if (r16 != 0) goto L_0x016c
            java.lang.String r1 = new java.lang.String     // Catch:{ all -> 0x0206 }
            r1.<init>(r6)     // Catch:{ all -> 0x0206 }
            goto L_0x0170
        L_0x016c:
            java.lang.String r1 = r6.concat(r1)     // Catch:{ all -> 0x0206 }
        L_0x0170:
            r12.logp(r13, r14, r15, r1)     // Catch:{ all -> 0x0206 }
            java.lang.String r1 = r11.c     // Catch:{ all -> 0x0206 }
            alpl r1 = r10.b(r7, r1)     // Catch:{ all -> 0x0206 }
            r1.c()     // Catch:{ all -> 0x0206 }
            alok r6 = new alok     // Catch:{ all -> 0x0206 }
            alnt r15 = defpackage.alnt.a     // Catch:{ all -> 0x0206 }
            alnu r16 = new alnu     // Catch:{ all -> 0x0206 }
            r16.<init>()     // Catch:{ all -> 0x0206 }
            r14 = 0
            r12 = r6
            r13 = r1
            r17 = r11
            r12.<init>(r13, r14, r15, r16, r17)     // Catch:{ all -> 0x0206 }
            alnv r10 = new alnv     // Catch:{ all -> 0x0206 }
            r10.<init>(r0, r8, r1)     // Catch:{ all -> 0x0206 }
            r6.a((defpackage.alom) r10)     // Catch:{ all -> 0x0206 }
            r6.a()     // Catch:{ all -> 0x0206 }
            goto L_0x019c
        L_0x0199:
            r10.a((java.lang.String) r7, (defpackage.alpi) r0)     // Catch:{ all -> 0x0206 }
        L_0x019c:
            java.util.concurrent.CountDownLatch r1 = r0.b     // Catch:{ alpj -> 0x01b8 }
            r10 = 60
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ alpj -> 0x01b8 }
            boolean r1 = r1.await(r10, r6)     // Catch:{ alpj -> 0x01b8 }
            if (r1 == 0) goto L_0x01b0
            boolean r1 = r0.c     // Catch:{ alpj -> 0x01b8 }
            if (r1 == 0) goto L_0x01ad
            goto L_0x01e7
        L_0x01ad:
            alpj r0 = r0.d     // Catch:{ alpj -> 0x01b8 }
            throw r0     // Catch:{ alpj -> 0x01b8 }
        L_0x01b0:
            java.util.concurrent.TimeoutException r0 = new java.util.concurrent.TimeoutException     // Catch:{ alpj -> 0x01b8 }
            java.lang.String r1 = "Sync timed out."
            r0.<init>(r1)     // Catch:{ alpj -> 0x01b8 }
            throw r0     // Catch:{ alpj -> 0x01b8 }
        L_0x01b8:
            r0 = move-exception
            boolean r1 = r0.a     // Catch:{ all -> 0x0206 }
            if (r1 == 0) goto L_0x01d9
            ith r1 = defpackage.lkr.a     // Catch:{ all -> 0x0206 }
            r6 = 1
            java.lang.Object[] r8 = new java.lang.Object[r6]     // Catch:{ all -> 0x0206 }
            r6 = 0
            r8[r6] = r7     // Catch:{ all -> 0x0206 }
            java.lang.String r6 = "Fatal sync error for %s"
            r1.a((java.lang.String) r6, (java.lang.Object[]) r8)     // Catch:{ all -> 0x0206 }
            lkm r1 = r2.e     // Catch:{ all -> 0x0206 }
            r6 = 1
            ljt[] r7 = new defpackage.ljt[r6]     // Catch:{ all -> 0x0206 }
            r6 = 0
            r7[r6] = r5     // Catch:{ all -> 0x0206 }
            java.util.List r6 = java.util.Arrays.asList(r7)     // Catch:{ all -> 0x0206 }
            r1.a((java.util.List) r6)     // Catch:{ all -> 0x0206 }
        L_0x01d9:
            throw r0     // Catch:{ all -> 0x0206 }
        L_0x01da:
            ith r0 = defpackage.lkr.a     // Catch:{ all -> 0x0206 }
            r1 = 1
            java.lang.Object[] r6 = new java.lang.Object[r1]     // Catch:{ all -> 0x0206 }
            r1 = 0
            r6[r1] = r5     // Catch:{ all -> 0x0206 }
            java.lang.String r1 = "Skipping sync for Realtime document (device is offline): %s"
            r0.a((java.lang.String) r1, (java.lang.Object[]) r6)     // Catch:{ all -> 0x0206 }
        L_0x01e7:
            lke r0 = new lke     // Catch:{ all -> 0x0206 }
            lkg r1 = r2.c     // Catch:{ all -> 0x0206 }
            r0.<init>(r9, r1)     // Catch:{ all -> 0x0206 }
            android.content.Context r1 = r2.b     // Catch:{ all -> 0x0206 }
            r0.a((android.content.Context) r1)     // Catch:{ all -> 0x0206 }
            lkd r0 = new lkd     // Catch:{ Exception -> 0x0217 }
            lku r1 = r2.f     // Catch:{ Exception -> 0x0217 }
            r6 = 0
            r0.<init>(r9, r1, r6)     // Catch:{ Exception -> 0x0217 }
            android.content.Context r1 = r2.b     // Catch:{ Exception -> 0x0217 }
            r0.a((android.content.Context) r1)     // Catch:{ Exception -> 0x0217 }
            r1 = r19
            r6 = 1
            r8 = 0
            goto L_0x0093
        L_0x0206:
            r0 = move-exception
            if (r9 == 0) goto L_0x0216
            lkd r1 = new lkd     // Catch:{ Exception -> 0x0217 }
            lku r6 = r2.f     // Catch:{ Exception -> 0x0217 }
            r7 = 0
            r1.<init>(r9, r6, r7)     // Catch:{ Exception -> 0x0217 }
            android.content.Context r6 = r2.b     // Catch:{ Exception -> 0x0217 }
            r1.a((android.content.Context) r6)     // Catch:{ Exception -> 0x0217 }
        L_0x0216:
            throw r0     // Catch:{ Exception -> 0x0217 }
        L_0x0217:
            r0 = move-exception
            ith r0 = defpackage.lkr.a     // Catch:{ Exception -> 0x023c }
            r1 = 1
            java.lang.Object[] r6 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x023c }
            r7 = 0
            r6[r7] = r5     // Catch:{ Exception -> 0x023c }
            java.lang.String r5 = "Unexpected error during sync/compaction for Realtime document: %s"
            java.lang.String r5 = java.lang.String.format(r5, r6)     // Catch:{ Exception -> 0x023c }
            r0.c(r5)     // Catch:{ Exception -> 0x023c }
            r1 = r19
            r6 = 1
            r8 = 0
            goto L_0x0093
        L_0x022f:
            ith r0 = defpackage.lkr.a     // Catch:{ Exception -> 0x023c }
            java.lang.String r1 = "Syncing/compacting complete."
            r0.b(r1)     // Catch:{ Exception -> 0x023c }
        L_0x0236:
            r4.close()
            return
        L_0x023a:
            r0 = move-exception
            goto L_0x0245
        L_0x023c:
            r0 = move-exception
            ith r0 = defpackage.lkr.a     // Catch:{ all -> 0x023a }
            java.lang.String r1 = "Syncing/compacting failed."
            r0.c(r1)     // Catch:{ all -> 0x023a }
            goto L_0x0236
        L_0x0245:
            r4.close()
            goto L_0x024a
        L_0x0249:
            throw r0
        L_0x024a:
            goto L_0x0249
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lkt.run():void");
    }
}
