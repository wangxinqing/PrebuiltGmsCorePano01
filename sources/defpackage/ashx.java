package defpackage;

/* renamed from: ashx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ashx implements Runnable {
    final /* synthetic */ asig a;

    public ashx(asig asig) {
        this.a = asig;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0053, code lost:
        r0.add(r2.a);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r7 = this;
            java.util.HashSet r0 = new java.util.HashSet
            asig r1 = r7.a
            java.util.HashSet r1 = r1.f
            r0.<init>(r1)
            asig r1 = r7.a
            java.util.ArrayList r1 = r1.e
            java.util.Iterator r1 = r1.iterator()
        L_0x0011:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0059
            java.lang.Object r2 = r1.next()
            asif r2 = (defpackage.asif) r2
            java.util.Iterator r3 = r0.iterator()
        L_0x0021:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x004d
            java.lang.Object r4 = r3.next()
            asic r4 = (defpackage.asic) r4
            boolean r5 = r2.a((defpackage.asic) r4)
            if (r5 != 0) goto L_0x0053
            asig r5 = r2.d
            java.util.HashMap r6 = r5.c
            monitor-enter(r6)
            java.util.HashMap r5 = r5.c     // Catch:{ all -> 0x004a }
            java.lang.Object r5 = r5.get(r4)     // Catch:{ all -> 0x004a }
            asif r5 = (defpackage.asif) r5     // Catch:{ all -> 0x004a }
            monitor-exit(r6)     // Catch:{ all -> 0x004a }
            if (r5 == 0) goto L_0x0021
            boolean r4 = r5.a((defpackage.asic) r4)
            if (r4 == 0) goto L_0x0021
            goto L_0x0053
        L_0x004a:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x004a }
            throw r0
        L_0x004d:
            r1.remove()
            r2.run()
        L_0x0053:
            asic r2 = r2.a
            r0.add(r2)
            goto L_0x0011
        L_0x0059:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ashx.run():void");
    }
}
