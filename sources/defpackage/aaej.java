package defpackage;

import android.os.Looper;

/* renamed from: aaej  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aaej extends qvr {
    private final acrz a;
    private final aaen b;
    private long c = 0;

    public aaej(Looper looper, acrz acrz, aaen aaen) {
        super(looper);
        this.a = acrz;
        this.b = aaen;
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00ce  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void handleMessage(android.os.Message r14) {
        /*
            r13 = this;
            int r0 = r14.what
            r1 = 2
            r2 = 1
            if (r0 == 0) goto L_0x000b
            if (r0 == r2) goto L_0x000b
            if (r0 == r1) goto L_0x000b
            return
        L_0x000b:
            long r3 = r14.getWhen()
            long r5 = r13.c
            r0 = 4
            r7 = 0
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 < 0) goto L_0x0108
            long r3 = android.os.SystemClock.uptimeMillis()
            r13.c = r3
            int r3 = r14.arg1
            nxn r3 = defpackage.nxn.a(r3)
            java.lang.String r4 = defpackage.aabn.a((defpackage.nxn) r3)
            if (r4 == 0) goto L_0x002a
            goto L_0x002c
        L_0x002a:
            java.lang.String r4 = ""
        L_0x002c:
            qye r5 = new qye     // Catch:{ all -> 0x0101 }
            java.lang.String r6 = "nts:standalone:checkQueue:"
            int r8 = r4.length()     // Catch:{ all -> 0x0101 }
            if (r8 != 0) goto L_0x003c
            java.lang.String r8 = new java.lang.String     // Catch:{ all -> 0x0101 }
            r8.<init>(r6)     // Catch:{ all -> 0x0101 }
            goto L_0x0040
        L_0x003c:
            java.lang.String r8 = r6.concat(r4)     // Catch:{ all -> 0x0101 }
        L_0x0040:
            r5.<init>(r8)     // Catch:{ all -> 0x0101 }
            acrz r6 = r13.a     // Catch:{ all -> 0x00f7 }
            r6.a((java.lang.String) r4)     // Catch:{ all -> 0x00f7 }
            int r14 = r14.what     // Catch:{ all -> 0x00f7 }
            if (r14 == 0) goto L_0x0072
            if (r14 == r2) goto L_0x0052
            if (r14 == r1) goto L_0x0072
            r14 = 0
            goto L_0x0085
        L_0x0052:
            aaen r14 = r13.b     // Catch:{ all -> 0x00f7 }
            java.lang.String r6 = "checkQueueLazily"
            amkr r6 = defpackage.amlv.a((java.lang.String) r6)     // Catch:{ all -> 0x00f7 }
            aaeh r8 = r14.k     // Catch:{ all -> 0x0066 }
            int r14 = r14.a((defpackage.aaeh) r8, (defpackage.nxn) r3)     // Catch:{ all -> 0x0066 }
            if (r6 == 0) goto L_0x0085
            r6.close()     // Catch:{ all -> 0x00f7 }
            goto L_0x0085
        L_0x0066:
            r14 = move-exception
            if (r6 == 0) goto L_0x0071
            r6.close()     // Catch:{ all -> 0x006d }
            goto L_0x0071
        L_0x006d:
            r0 = move-exception
            defpackage.apev.a((java.lang.Throwable) r14, (java.lang.Throwable) r0)     // Catch:{ all -> 0x00f7 }
        L_0x0071:
            throw r14     // Catch:{ all -> 0x00f7 }
        L_0x0072:
            aaen r14 = r13.b     // Catch:{ all -> 0x00f7 }
            java.lang.String r6 = "checkQueueEagerly"
            amkr r6 = defpackage.amlv.a((java.lang.String) r6)     // Catch:{ all -> 0x00f7 }
            aaeh r8 = r14.j     // Catch:{ all -> 0x00eb }
            int r14 = r14.a((defpackage.aaeh) r8, (defpackage.nxn) r3)     // Catch:{ all -> 0x00eb }
            if (r6 == 0) goto L_0x0085
            r6.close()     // Catch:{ all -> 0x00f7 }
        L_0x0085:
            r5.close()     // Catch:{ all -> 0x0101 }
            acrz r5 = r13.a
            r5.c((java.lang.String) r4)
            long r4 = android.os.SystemClock.uptimeMillis()
            long r8 = r13.c
            aaen r6 = r13.b
            aabn r10 = r6.h
            nxk r6 = r6.d()
            nxp r11 = defpackage.nxp.f
            aucd r11 = r11.o()
            boolean r12 = r11.c
            if (r12 != 0) goto L_0x00a6
            goto L_0x00ab
        L_0x00a6:
            r11.c()
            r11.c = r7
        L_0x00ab:
            aucj r12 = r11.b
            nxp r12 = (defpackage.nxp) r12
            int r3 = r3.p
            r12.b = r3
            int r3 = r12.a
            r3 = r3 | r2
            r12.a = r3
            r12.e = r2
            r2 = r3 | 8
            r12.a = r2
            r0 = r0 | r2
            r12.a = r0
            long r2 = (long) r14
            r12.d = r2
            long r4 = r4 - r8
            aubn r14 = defpackage.augi.a((long) r4)
            boolean r0 = r11.c
            if (r0 != 0) goto L_0x00ce
            goto L_0x00d3
        L_0x00ce:
            r11.c()
            r11.c = r7
        L_0x00d3:
            aucj r0 = r11.b
            nxp r0 = (defpackage.nxp) r0
            r14.getClass()
            r0.c = r14
            int r14 = r0.a
            r14 = r14 | r1
            r0.a = r14
            aucj r14 = r11.i()
            nxp r14 = (defpackage.nxp) r14
            r10.a((defpackage.nxk) r6, (defpackage.nxp) r14)
            return
        L_0x00eb:
            r14 = move-exception
            if (r6 == 0) goto L_0x00f6
            r6.close()     // Catch:{ all -> 0x00f2 }
            goto L_0x00f6
        L_0x00f2:
            r0 = move-exception
            defpackage.apev.a((java.lang.Throwable) r14, (java.lang.Throwable) r0)     // Catch:{ all -> 0x00f7 }
        L_0x00f6:
            throw r14     // Catch:{ all -> 0x00f7 }
        L_0x00f7:
            r14 = move-exception
            r5.close()     // Catch:{ all -> 0x00fc }
            goto L_0x0100
        L_0x00fc:
            r0 = move-exception
            defpackage.apev.a((java.lang.Throwable) r14, (java.lang.Throwable) r0)     // Catch:{ all -> 0x0101 }
        L_0x0100:
            throw r14     // Catch:{ all -> 0x0101 }
        L_0x0101:
            r14 = move-exception
            acrz r0 = r13.a
            r0.c((java.lang.String) r4)
            throw r14
        L_0x0108:
            java.lang.String r3 = "NetworkScheduler"
            boolean r0 = android.util.Log.isLoggable(r3, r0)
            if (r0 != 0) goto L_0x0112
            goto L_0x0118
        L_0x0112:
            java.lang.String r0 = "ignoring stale queue check message"
            android.util.Log.i(r3, r0)
        L_0x0118:
            aaen r0 = r13.b
            aabn r3 = r0.h
            nxk r0 = r0.d()
            nxp r4 = defpackage.nxp.f
            aucd r4 = r4.o()
            int r14 = r14.arg1
            nxn r14 = defpackage.nxn.a(r14)
            boolean r5 = r4.c
            if (r5 == 0) goto L_0x0135
            r4.c()
            r4.c = r7
        L_0x0135:
            aucj r5 = r4.b
            nxp r5 = (defpackage.nxp) r5
            int r14 = r14.p
            r5.b = r14
            int r14 = r5.a
            r14 = r14 | r2
            r5.a = r14
            r5.e = r1
            r14 = r14 | 8
            r5.a = r14
            aucj r14 = r4.i()
            nxp r14 = (defpackage.nxp) r14
            r3.a((defpackage.nxk) r0, (defpackage.nxp) r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aaej.handleMessage(android.os.Message):void");
    }
}
