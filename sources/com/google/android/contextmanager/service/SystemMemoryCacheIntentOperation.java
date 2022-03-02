package com.google.android.contextmanager.service;

import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class SystemMemoryCacheIntentOperation extends IntentOperation {
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x028a, code lost:
        if (r0.isEmpty() == false) goto L_0x00cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x0300, code lost:
        if (r0.isEmpty() != false) goto L_0x0304;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00c9, code lost:
        if (r0.isEmpty() == false) goto L_0x00cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x013b, code lost:
        if (r0.isEmpty() == false) goto L_0x00cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01a8, code lost:
        if (r0.isEmpty() == false) goto L_0x00cb;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onHandleIntent(android.content.Intent r17) {
        /*
            r16 = this;
            java.lang.String r1 = "[FencePendingIntentCache]%s not whitelisted"
            java.lang.String r0 = r17.getAction()
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r4 = 0
            r3[r4] = r0
            java.lang.String r3 = "com.google.android.contextmanager.service.SystemMemoryCacheIntentOperation.INIT"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x038b
            byd r0 = defpackage.cbi.E()
            byg r0 = r0.b
            byp r2 = r0.d
            jjg r0 = defpackage.bxk.a
            ikh r0 = r2.f
            r0.a()
            ikh r0 = r2.f
            java.lang.String r3 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)"
            java.lang.String r4 = "byp"
            if (r0 != 0) goto L_0x0043
            jjg r0 = defpackage.bxk.a
            anie r0 = r0.b()
            anih r0 = (defpackage.anih) r0
            r1 = 122(0x7a, float:1.71E-43)
            java.lang.String r2 = "a"
            anie r0 = r0.a((java.lang.String) r4, (java.lang.String) r2, (int) r1, (java.lang.String) r3)
            anih r0 = (defpackage.anih) r0
            java.lang.String r1 = "[FencePendingIntentCache]Could not initialize.  Cache is null."
            r0.a((java.lang.String) r1)
            return
        L_0x0043:
            boolean r0 = r0.a()
            if (r0 != 0) goto L_0x038a
            int r0 = defpackage.ikh.b((android.content.Intent) r17)
            int r5 = r2.a
            if (r0 != 0) goto L_0x038a
            ikh r0 = r2.f
            r5 = r17
            r0.c((android.content.Intent) r5)
            java.util.HashSet r5 = new java.util.HashSet
            r5.<init>()
            java.util.HashSet r6 = new java.util.HashSet
            r6.<init>()
            java.lang.String r7 = "b"
            r8 = 500(0x1f4, float:7.0E-43)
            cjo r0 = defpackage.cbi.q()     // Catch:{ all -> 0x0327 }
            r9 = 7
            r10 = 0
            juj r0 = r0.a((defpackage.bsz) r10, (int) r9)     // Catch:{ all -> 0x0327 }
            if (r0 != 0) goto L_0x00d2
            java.util.Set r0 = r2.c()
            boolean r9 = defpackage.awuz.B()
            if (r9 == 0) goto L_0x0083
            r6.removeAll(r5)
            r0.removeAll(r6)
            goto L_0x00ae
        L_0x0083:
            r0.retainAll(r5)
            java.util.Iterator r5 = r5.iterator()
        L_0x008a:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x00ae
            java.lang.Object r6 = r5.next()
            java.lang.String r6 = (java.lang.String) r6
            boolean r11 = r0.contains(r6)
            if (r11 != 0) goto L_0x008a
            jjg r11 = defpackage.bxk.a
            anie r11 = r11.d()
            anih r11 = (defpackage.anih) r11
            anie r11 = r11.a((java.lang.String) r4, (java.lang.String) r7, (int) r8, (java.lang.String) r3)
            anih r11 = (defpackage.anih) r11
            r11.a((java.lang.String) r1, (java.lang.Object) r6)
            goto L_0x008a
        L_0x00ae:
            java.lang.Runnable r1 = r2.g
            if (r1 != 0) goto L_0x00b3
            goto L_0x00c5
        L_0x00b3:
            if (r9 == 0) goto L_0x00b6
            goto L_0x00bc
        L_0x00b6:
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L_0x00c5
        L_0x00bc:
            bwn r1 = defpackage.cbi.k()
            java.lang.Runnable r3 = r2.g
            r1.a((java.lang.Runnable) r3)
        L_0x00c5:
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L_0x00d0
        L_0x00cb:
            r2.a((java.util.Set) r0)
            goto L_0x0304
        L_0x00d0:
            goto L_0x0304
        L_0x00d2:
            byte[] r0 = r0.c()     // Catch:{ auda -> 0x028e }
            aubs r9 = defpackage.aubs.c()     // Catch:{ auda -> 0x028e }
            jyf r11 = defpackage.jyf.c     // Catch:{ auda -> 0x028e }
            aucj r0 = defpackage.aucj.a((defpackage.aucj) r11, (byte[]) r0, (defpackage.aubs) r9)     // Catch:{ auda -> 0x028e }
            jyf r0 = (defpackage.jyf) r0     // Catch:{ auda -> 0x028e }
            if (r0 != 0) goto L_0x0140
            java.util.Set r0 = r2.c()
            boolean r9 = defpackage.awuz.B()
            if (r9 == 0) goto L_0x00f5
            r6.removeAll(r5)
            r0.removeAll(r6)
            goto L_0x0120
        L_0x00f5:
            r0.retainAll(r5)
            java.util.Iterator r5 = r5.iterator()
        L_0x00fc:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x0120
            java.lang.Object r6 = r5.next()
            java.lang.String r6 = (java.lang.String) r6
            boolean r11 = r0.contains(r6)
            if (r11 != 0) goto L_0x00fc
            jjg r11 = defpackage.bxk.a
            anie r11 = r11.d()
            anih r11 = (defpackage.anih) r11
            anie r11 = r11.a((java.lang.String) r4, (java.lang.String) r7, (int) r8, (java.lang.String) r3)
            anih r11 = (defpackage.anih) r11
            r11.a((java.lang.String) r1, (java.lang.Object) r6)
            goto L_0x00fc
        L_0x0120:
            java.lang.Runnable r1 = r2.g
            if (r1 != 0) goto L_0x0125
            goto L_0x0137
        L_0x0125:
            if (r9 == 0) goto L_0x0128
            goto L_0x012e
        L_0x0128:
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L_0x0137
        L_0x012e:
            bwn r1 = defpackage.cbi.k()
            java.lang.Runnable r3 = r2.g
            r1.a((java.lang.Runnable) r3)
        L_0x0137:
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L_0x013e
            goto L_0x00cb
        L_0x013e:
            goto L_0x0304
        L_0x0140:
            aucx r9 = r0.a     // Catch:{ all -> 0x0327 }
            boolean r9 = r9.isEmpty()     // Catch:{ all -> 0x0327 }
            if (r9 != 0) goto L_0x0149
            goto L_0x01ac
        L_0x0149:
            aucx r9 = r0.b     // Catch:{ all -> 0x0327 }
            boolean r9 = r9.isEmpty()     // Catch:{ all -> 0x0327 }
            if (r9 == 0) goto L_0x01ac
            java.util.Set r0 = r2.c()
            boolean r9 = defpackage.awuz.B()
            if (r9 == 0) goto L_0x0162
            r6.removeAll(r5)
            r0.removeAll(r6)
            goto L_0x018d
        L_0x0162:
            r0.retainAll(r5)
            java.util.Iterator r5 = r5.iterator()
        L_0x0169:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x018d
            java.lang.Object r6 = r5.next()
            java.lang.String r6 = (java.lang.String) r6
            boolean r11 = r0.contains(r6)
            if (r11 != 0) goto L_0x0169
            jjg r11 = defpackage.bxk.a
            anie r11 = r11.d()
            anih r11 = (defpackage.anih) r11
            anie r11 = r11.a((java.lang.String) r4, (java.lang.String) r7, (int) r8, (java.lang.String) r3)
            anih r11 = (defpackage.anih) r11
            r11.a((java.lang.String) r1, (java.lang.Object) r6)
            goto L_0x0169
        L_0x018d:
            java.lang.Runnable r1 = r2.g
            if (r1 != 0) goto L_0x0192
            goto L_0x01a4
        L_0x0192:
            if (r9 == 0) goto L_0x0195
            goto L_0x019b
        L_0x0195:
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L_0x01a4
        L_0x019b:
            bwn r1 = defpackage.cbi.k()
            java.lang.Runnable r3 = r2.g
            r1.a((java.lang.Runnable) r3)
        L_0x01a4:
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L_0x013e
            goto L_0x00cb
        L_0x01ac:
            java.util.HashMap r9 = new java.util.HashMap     // Catch:{ all -> 0x0327 }
            r9.<init>()     // Catch:{ all -> 0x0327 }
            aucx r10 = r0.a     // Catch:{ all -> 0x0327 }
            java.util.Iterator r10 = r10.iterator()     // Catch:{ all -> 0x0327 }
        L_0x01b7:
            boolean r11 = r10.hasNext()     // Catch:{ all -> 0x0327 }
            if (r11 == 0) goto L_0x01fa
            java.lang.Object r11 = r10.next()     // Catch:{ all -> 0x0327 }
            jyg r11 = (defpackage.jyg) r11     // Catch:{ all -> 0x0327 }
            java.lang.String r12 = r11.b     // Catch:{ all -> 0x0327 }
            java.lang.Object r12 = r9.get(r12)     // Catch:{ all -> 0x0327 }
            byl r12 = (defpackage.byl) r12     // Catch:{ all -> 0x0327 }
            if (r12 == 0) goto L_0x01ce
            goto L_0x01db
        L_0x01ce:
            java.lang.String r12 = r11.b     // Catch:{ all -> 0x0327 }
            byl r12 = r2.b((java.lang.String) r12)     // Catch:{ all -> 0x0327 }
            if (r12 == 0) goto L_0x01f2
            java.lang.String r13 = r11.b     // Catch:{ all -> 0x0327 }
            r9.put(r13, r12)     // Catch:{ all -> 0x0327 }
        L_0x01db:
            java.lang.String r13 = r11.c     // Catch:{ all -> 0x0327 }
            java.lang.String r14 = r11.d     // Catch:{ all -> 0x0327 }
            java.lang.String r15 = r11.e     // Catch:{ all -> 0x0327 }
            java.lang.String r8 = r11.f     // Catch:{ all -> 0x0327 }
            java.lang.String r8 = defpackage.bzm.a(r13, r14, r15, r8)     // Catch:{ all -> 0x0327 }
            r12.a(r8, r11)     // Catch:{ all -> 0x0327 }
            java.lang.String r8 = r11.c     // Catch:{ all -> 0x0327 }
            r6.add(r8)     // Catch:{ all -> 0x0327 }
            r8 = 500(0x1f4, float:7.0E-43)
            goto L_0x01b7
        L_0x01f2:
            java.lang.String r8 = r11.c     // Catch:{ all -> 0x0327 }
            r5.add(r8)     // Catch:{ all -> 0x0327 }
            r8 = 500(0x1f4, float:7.0E-43)
            goto L_0x01b7
        L_0x01fa:
            aucx r0 = r0.b     // Catch:{ all -> 0x0327 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0327 }
        L_0x0200:
            boolean r8 = r0.hasNext()     // Catch:{ all -> 0x0327 }
            if (r8 == 0) goto L_0x022d
            java.lang.Object r8 = r0.next()     // Catch:{ all -> 0x0327 }
            jyh r8 = (defpackage.jyh) r8     // Catch:{ all -> 0x0327 }
            java.lang.String r10 = r8.b     // Catch:{ all -> 0x0327 }
            java.lang.Object r10 = r9.get(r10)     // Catch:{ all -> 0x0327 }
            byl r10 = (defpackage.byl) r10     // Catch:{ all -> 0x0327 }
            if (r10 != 0) goto L_0x022a
            java.lang.String r10 = r8.b     // Catch:{ all -> 0x0327 }
            byl r10 = r2.b((java.lang.String) r10)     // Catch:{ all -> 0x0327 }
            if (r10 == 0) goto L_0x0224
            java.lang.String r11 = r8.b     // Catch:{ all -> 0x0327 }
            r9.put(r11, r10)     // Catch:{ all -> 0x0327 }
            goto L_0x022a
        L_0x0224:
            java.lang.String r8 = r8.c     // Catch:{ all -> 0x0327 }
            r5.add(r8)     // Catch:{ all -> 0x0327 }
            goto L_0x0200
        L_0x022a:
            r10.d = r8     // Catch:{ all -> 0x0327 }
            goto L_0x0200
        L_0x022d:
            java.util.Collection r10 = r9.values()     // Catch:{ all -> 0x0327 }
            java.util.Set r0 = r2.c()
            boolean r8 = defpackage.awuz.B()
            if (r8 == 0) goto L_0x0242
            r6.removeAll(r5)
            r0.removeAll(r6)
            goto L_0x026f
        L_0x0242:
            r0.retainAll(r5)
            java.util.Iterator r5 = r5.iterator()
        L_0x0249:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x026f
            java.lang.Object r6 = r5.next()
            java.lang.String r6 = (java.lang.String) r6
            boolean r9 = r0.contains(r6)
            if (r9 != 0) goto L_0x0249
            jjg r9 = defpackage.bxk.a
            anie r9 = r9.d()
            anih r9 = (defpackage.anih) r9
            r11 = 500(0x1f4, float:7.0E-43)
            anie r9 = r9.a((java.lang.String) r4, (java.lang.String) r7, (int) r11, (java.lang.String) r3)
            anih r9 = (defpackage.anih) r9
            r9.a((java.lang.String) r1, (java.lang.Object) r6)
            goto L_0x0249
        L_0x026f:
            java.lang.Runnable r1 = r2.g
            if (r1 != 0) goto L_0x0274
            goto L_0x0286
        L_0x0274:
            if (r8 == 0) goto L_0x0277
            goto L_0x027d
        L_0x0277:
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L_0x0286
        L_0x027d:
            bwn r1 = defpackage.cbi.k()
            java.lang.Runnable r3 = r2.g
            r1.a((java.lang.Runnable) r3)
        L_0x0286:
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L_0x0304
            goto L_0x00cb
        L_0x028e:
            r0 = move-exception
            jjg r8 = defpackage.bxk.a     // Catch:{ all -> 0x0327 }
            anie r8 = r8.b()     // Catch:{ all -> 0x0327 }
            anih r8 = (defpackage.anih) r8     // Catch:{ all -> 0x0327 }
            r8.a((java.lang.Throwable) r0)     // Catch:{ all -> 0x0327 }
            r0 = 440(0x1b8, float:6.17E-43)
            anie r0 = r8.a((java.lang.String) r4, (java.lang.String) r7, (int) r0, (java.lang.String) r3)     // Catch:{ all -> 0x0327 }
            anih r0 = (defpackage.anih) r0     // Catch:{ all -> 0x0327 }
            java.lang.String r8 = "[FencePendingIntentCache]Could not deserialize proto."
            r0.a((java.lang.String) r8)     // Catch:{ all -> 0x0327 }
            java.util.Set r0 = r2.c()
            boolean r8 = defpackage.awuz.B()
            if (r8 == 0) goto L_0x02b8
            r6.removeAll(r5)
            r0.removeAll(r6)
            goto L_0x02e5
        L_0x02b8:
            r0.retainAll(r5)
            java.util.Iterator r5 = r5.iterator()
        L_0x02bf:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x02e5
            java.lang.Object r6 = r5.next()
            java.lang.String r6 = (java.lang.String) r6
            boolean r9 = r0.contains(r6)
            if (r9 != 0) goto L_0x02bf
            jjg r9 = defpackage.bxk.a
            anie r9 = r9.d()
            anih r9 = (defpackage.anih) r9
            r11 = 500(0x1f4, float:7.0E-43)
            anie r9 = r9.a((java.lang.String) r4, (java.lang.String) r7, (int) r11, (java.lang.String) r3)
            anih r9 = (defpackage.anih) r9
            r9.a((java.lang.String) r1, (java.lang.Object) r6)
            goto L_0x02bf
        L_0x02e5:
            java.lang.Runnable r1 = r2.g
            if (r1 != 0) goto L_0x02ea
            goto L_0x02fc
        L_0x02ea:
            if (r8 == 0) goto L_0x02ed
            goto L_0x02f3
        L_0x02ed:
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L_0x02fc
        L_0x02f3:
            bwn r1 = defpackage.cbi.k()
            java.lang.Runnable r3 = r2.g
            r1.a((java.lang.Runnable) r3)
        L_0x02fc:
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L_0x013e
            goto L_0x00cb
        L_0x0304:
            cla r0 = r2.b
            if (r0 == 0) goto L_0x0310
            byn r1 = new byn
            r1.<init>(r10)
            r0.a((defpackage.cky) r1)
        L_0x0310:
            boolean r0 = r2.h
            if (r0 == 0) goto L_0x038a
            bwn r0 = defpackage.cbi.k()
            byk r1 = new byk
            r1.<init>(r2)
            java.lang.String r2 = "delayedPersistCacheState"
            bvp r2 = defpackage.bvq.a(r2)
            r0.a(r1, r2)
            return
        L_0x0327:
            r0 = move-exception
            java.util.Set r8 = r2.c()
            boolean r9 = defpackage.awuz.B()
            if (r9 == 0) goto L_0x0339
            r6.removeAll(r5)
            r8.removeAll(r6)
            goto L_0x0369
        L_0x0339:
            r8.retainAll(r5)
            java.util.Iterator r5 = r5.iterator()
        L_0x0340:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x0369
            java.lang.Object r6 = r5.next()
            java.lang.String r6 = (java.lang.String) r6
            boolean r10 = r8.contains(r6)
            if (r10 != 0) goto L_0x0366
            jjg r10 = defpackage.bxk.a
            anie r10 = r10.d()
            anih r10 = (defpackage.anih) r10
            r11 = 500(0x1f4, float:7.0E-43)
            anie r10 = r10.a((java.lang.String) r4, (java.lang.String) r7, (int) r11, (java.lang.String) r3)
            anih r10 = (defpackage.anih) r10
            r10.a((java.lang.String) r1, (java.lang.Object) r6)
            goto L_0x0340
        L_0x0366:
            r11 = 500(0x1f4, float:7.0E-43)
            goto L_0x0340
        L_0x0369:
            java.lang.Runnable r1 = r2.g
            if (r1 != 0) goto L_0x036e
            goto L_0x0380
        L_0x036e:
            if (r9 == 0) goto L_0x0371
            goto L_0x0377
        L_0x0371:
            boolean r1 = r8.isEmpty()
            if (r1 != 0) goto L_0x0380
        L_0x0377:
            bwn r1 = defpackage.cbi.k()
            java.lang.Runnable r3 = r2.g
            r1.a((java.lang.Runnable) r3)
        L_0x0380:
            boolean r1 = r8.isEmpty()
            if (r1 != 0) goto L_0x0389
            r2.a((java.util.Set) r8)
        L_0x0389:
            throw r0
        L_0x038a:
            return
        L_0x038b:
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r1[r4] = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.contextmanager.service.SystemMemoryCacheIntentOperation.onHandleIntent(android.content.Intent):void");
    }
}
