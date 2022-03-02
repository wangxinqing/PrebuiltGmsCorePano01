package defpackage;

/* renamed from: aaek  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class aaek implements aabw {
    private final aaen a;

    public aaek(aaen aaen) {
        this.a = aaen;
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x008f A[Catch:{ all -> 0x00d7 }, DONT_GENERATE] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00a0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.aabx r10, int r11) {
        /*
            r9 = this;
            aaen r0 = r9.a
            nxn r1 = defpackage.nxn.EXECUTION_CALLBACK
            java.lang.String r1 = defpackage.aabn.a((defpackage.nxn) r1)
            if (r1 == 0) goto L_0x000b
            goto L_0x000d
        L_0x000b:
            java.lang.String r1 = ""
        L_0x000d:
            axcf r2 = defpackage.axcf.a
            axcg r2 = r2.a()
            boolean r2 = r2.a()
            aael r3 = new aael
            r3.<init>(r0, r1)
            njy r4 = r0.f     // Catch:{ all -> 0x00ea }
            java.lang.String r5 = "handleClientCallback"
            amky r4 = r4.b(r5)     // Catch:{ all -> 0x00ea }
            acrz r5 = r0.e     // Catch:{ all -> 0x00d7 }
            r5.a((java.lang.String) r1)     // Catch:{ all -> 0x00d7 }
            aabn r1 = r0.h     // Catch:{ all -> 0x00d7 }
            nxk r5 = r0.d()     // Catch:{ all -> 0x00d7 }
            int r6 = defpackage.aadn.e(r11)     // Catch:{ all -> 0x00d7 }
            r1.a((defpackage.nxk) r5, (defpackage.aabx) r10, (int) r6)     // Catch:{ all -> 0x00d7 }
            java.util.List r1 = r0.a     // Catch:{ all -> 0x00d7 }
            monitor-enter(r1)     // Catch:{ all -> 0x00d7 }
            int r5 = r10.k()     // Catch:{ all -> 0x00d4 }
            r0.b((int) r5)     // Catch:{ all -> 0x00d4 }
            android.util.SparseArray r5 = r0.b     // Catch:{ all -> 0x00d4 }
            int r6 = r10.k()     // Catch:{ all -> 0x00d4 }
            java.lang.Object r5 = r5.get(r6)     // Catch:{ all -> 0x00d4 }
            java.util.Map r5 = (java.util.Map) r5     // Catch:{ all -> 0x00d4 }
            aabq r6 = r10.a     // Catch:{ all -> 0x00d4 }
            java.lang.Object r5 = r5.remove(r6)     // Catch:{ all -> 0x00d4 }
            aabx r5 = (defpackage.aabx) r5     // Catch:{ all -> 0x00d4 }
            if (r5 == 0) goto L_0x00c5
            boolean r6 = r5.h()     // Catch:{ all -> 0x00d4 }
            if (r6 != 0) goto L_0x0060
            r6 = 5
            r5.b(r6)     // Catch:{ all -> 0x00d4 }
        L_0x0060:
            aabq r5 = r5.a     // Catch:{ all -> 0x00d4 }
            aabn r6 = r0.h     // Catch:{ all -> 0x00d4 }
            r6.a((defpackage.aabq) r5, (int) r11)     // Catch:{ all -> 0x00d4 }
            r6 = 1
            r7 = 0
            if (r11 == 0) goto L_0x007c
            if (r11 == r6) goto L_0x0071
            r8 = 2
            if (r11 == r8) goto L_0x007c
            goto L_0x0087
        L_0x0071:
            boolean r8 = r5.m()     // Catch:{ all -> 0x00d4 }
            if (r8 == 0) goto L_0x007b
            aabq r7 = defpackage.aabj.c(r5)     // Catch:{ all -> 0x00d4 }
        L_0x007b:
            goto L_0x0087
        L_0x007c:
            boolean r8 = r5.n()     // Catch:{ all -> 0x00d4 }
            if (r8 == 0) goto L_0x0086
            aabq r7 = defpackage.aabj.b(r5)     // Catch:{ all -> 0x00d4 }
        L_0x0086:
        L_0x0087:
            java.util.List r8 = r0.a     // Catch:{ all -> 0x00d4 }
            boolean r8 = r8.contains(r5)     // Catch:{ all -> 0x00d4 }
            if (r8 == 0) goto L_0x00a0
            monitor-exit(r1)     // Catch:{ all -> 0x00d4 }
            if (r2 == 0) goto L_0x0095
            r3.run()     // Catch:{ all -> 0x00de }
        L_0x0095:
            if (r4 == 0) goto L_0x009a
            r4.close()     // Catch:{ all -> 0x00ea }
        L_0x009a:
            if (r2 != 0) goto L_0x00d3
        L_0x009c:
            r3.run()
            return
        L_0x00a0:
            if (r7 == 0) goto L_0x00ab
            if (r11 != r6) goto L_0x00a6
            r10 = 3
            goto L_0x00a7
        L_0x00a6:
            r10 = 4
        L_0x00a7:
            r0.a((defpackage.aabq) r7, (defpackage.aabq) r5, (int) r10)     // Catch:{ all -> 0x00d4 }
            goto L_0x00b0
        L_0x00ab:
            aabq r10 = r10.a     // Catch:{ all -> 0x00d4 }
            r0.b((defpackage.aabq) r10)     // Catch:{ all -> 0x00d4 }
        L_0x00b0:
            aadt r10 = r0.i     // Catch:{ all -> 0x00d4 }
            java.util.List r11 = r0.a     // Catch:{ all -> 0x00d4 }
            r10.a((java.util.Collection) r11)     // Catch:{ all -> 0x00d4 }
            monitor-exit(r1)     // Catch:{ all -> 0x00d4 }
            if (r2 == 0) goto L_0x00bd
            r3.run()     // Catch:{ all -> 0x00de }
        L_0x00bd:
            if (r4 == 0) goto L_0x00c2
            r4.close()     // Catch:{ all -> 0x00ea }
        L_0x00c2:
            if (r2 != 0) goto L_0x00d3
            goto L_0x009c
        L_0x00c5:
            monitor-exit(r1)     // Catch:{ all -> 0x00d4 }
            if (r2 == 0) goto L_0x00cb
            r3.run()     // Catch:{ all -> 0x00de }
        L_0x00cb:
            if (r4 == 0) goto L_0x00d0
            r4.close()     // Catch:{ all -> 0x00ea }
        L_0x00d0:
            if (r2 != 0) goto L_0x00d3
            goto L_0x009c
        L_0x00d3:
            return
        L_0x00d4:
            r10 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00d4 }
            throw r10     // Catch:{ all -> 0x00d7 }
        L_0x00d7:
            r10 = move-exception
            if (r2 == 0) goto L_0x00dd
            r3.run()     // Catch:{ all -> 0x00de }
        L_0x00dd:
            throw r10     // Catch:{ all -> 0x00de }
        L_0x00de:
            r10 = move-exception
            if (r4 == 0) goto L_0x00e9
            r4.close()     // Catch:{ all -> 0x00e5 }
            goto L_0x00e9
        L_0x00e5:
            r11 = move-exception
            defpackage.apev.a((java.lang.Throwable) r10, (java.lang.Throwable) r11)     // Catch:{ all -> 0x00ea }
        L_0x00e9:
            throw r10     // Catch:{ all -> 0x00ea }
        L_0x00ea:
            r10 = move-exception
            if (r2 != 0) goto L_0x00f0
            r3.run()
        L_0x00f0:
            goto L_0x00f2
        L_0x00f1:
            throw r10
        L_0x00f2:
            goto L_0x00f1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aaek.a(aabx, int):void");
    }
}
