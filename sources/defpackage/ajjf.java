package defpackage;

/* renamed from: ajjf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajjf {
    private static long a = 0;

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002b, code lost:
        r8 = new java.lang.RuntimeException();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0030, code lost:
        new defpackage.ajje(r8).start();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0038, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0028, code lost:
        if (r8 == null) goto L_0x002b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(java.lang.Throwable r8) {
        /*
            aztb r0 = defpackage.aztb.a
            aztc r0 = r0.a()
            boolean r0 = r0.at()
            if (r0 == 0) goto L_0x003e
            java.lang.Class<ajjf> r0 = defpackage.ajjf.class
            monitor-enter(r0)
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x003b }
            long r3 = a     // Catch:{ all -> 0x003b }
            long r3 = r1 - r3
            aztb r5 = defpackage.aztb.a     // Catch:{ all -> 0x003b }
            aztc r5 = r5.a()     // Catch:{ all -> 0x003b }
            long r5 = r5.bK()     // Catch:{ all -> 0x003b }
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 < 0) goto L_0x0039
            a = r1     // Catch:{ all -> 0x003b }
            monitor-exit(r0)     // Catch:{ all -> 0x003b }
            if (r8 == 0) goto L_0x002b
            goto L_0x0030
        L_0x002b:
            java.lang.RuntimeException r8 = new java.lang.RuntimeException
            r8.<init>()
        L_0x0030:
            ajje r0 = new ajje
            r0.<init>(r8)
            r0.start()
            return
        L_0x0039:
            monitor-exit(r0)     // Catch:{ all -> 0x003b }
            return
        L_0x003b:
            r8 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x003b }
            throw r8
        L_0x003e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajjf.a(java.lang.Throwable):void");
    }
}
