package defpackage;

/* renamed from: v  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class v implements Runnable {
    final /* synthetic */ x a;

    public v(x xVar) {
        this.a = xVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:2:0x000c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r8 = this;
        L_0x0000:
            x r0 = r8.a
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.d
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r1, r2)
            if (r0 == 0) goto L_0x00ae
            r0 = 0
            r3 = 0
        L_0x000e:
            x r4 = r8.a     // Catch:{ all -> 0x00a5 }
            java.util.concurrent.atomic.AtomicBoolean r4 = r4.c     // Catch:{ all -> 0x00a5 }
            boolean r4 = r4.compareAndSet(r2, r1)     // Catch:{ all -> 0x00a5 }
            if (r4 == 0) goto L_0x0087
            x r0 = r8.a     // Catch:{ all -> 0x00a5 }
            ct r3 = r0.f     // Catch:{ all -> 0x00a5 }
            if (r3 != 0) goto L_0x001f
            goto L_0x0022
        L_0x001f:
            r3.e()     // Catch:{ all -> 0x00a5 }
        L_0x0022:
            cf r3 = r0.g     // Catch:{ all -> 0x00a5 }
            if (r3 == 0) goto L_0x002d
            cg r4 = r0.l     // Catch:{ all -> 0x00a5 }
            java.util.concurrent.CopyOnWriteArrayList r3 = r3.a     // Catch:{ all -> 0x00a5 }
            r3.remove(r4)     // Catch:{ all -> 0x00a5 }
        L_0x002d:
            cc r3 = r0.h     // Catch:{ all -> 0x00a5 }
            vvx r4 = new vvx     // Catch:{ all -> 0x00a5 }
            vts r5 = r3.a     // Catch:{ all -> 0x00a5 }
            com.google.android.gms.nearby.sharing.ContactFilter r6 = r3.b     // Catch:{ all -> 0x00a5 }
            vvw r3 = r3.c     // Catch:{ all -> 0x00a5 }
            r4.<init>(r5, r6, r3)     // Catch:{ all -> 0x00a5 }
            r0.g = r4     // Catch:{ all -> 0x00a5 }
            cf r3 = r0.g     // Catch:{ all -> 0x00a5 }
            cg r4 = r0.l     // Catch:{ all -> 0x00a5 }
            java.util.concurrent.CopyOnWriteArrayList r3 = r3.a     // Catch:{ all -> 0x00a5 }
            r3.add(r4)     // Catch:{ all -> 0x00a5 }
            cp r3 = new cp     // Catch:{ all -> 0x00a5 }
            cf r4 = r0.g     // Catch:{ all -> 0x00a5 }
            cs r5 = r0.i     // Catch:{ all -> 0x00a5 }
            r3.<init>(r4, r5)     // Catch:{ all -> 0x00a5 }
            java.util.concurrent.Executor r4 = r0.j     // Catch:{ all -> 0x00a5 }
            r3.c = r4     // Catch:{ all -> 0x00a5 }
            java.util.concurrent.Executor r4 = r0.k     // Catch:{ all -> 0x00a5 }
            r3.d = r4     // Catch:{ all -> 0x00a5 }
            java.util.concurrent.Executor r4 = r3.c     // Catch:{ all -> 0x00a5 }
            if (r4 == 0) goto L_0x007f
            java.util.concurrent.Executor r5 = r3.d     // Catch:{ all -> 0x00a5 }
            if (r5 == 0) goto L_0x0077
            cf r6 = r3.a     // Catch:{ all -> 0x00a5 }
            cs r3 = r3.b     // Catch:{ all -> 0x00a5 }
            cb r7 = new cb     // Catch:{ all -> 0x00a5 }
            by r6 = (defpackage.by) r6     // Catch:{ all -> 0x00a5 }
            r7.<init>(r6, r4, r5, r3)     // Catch:{ all -> 0x00a5 }
            r0.f = r7     // Catch:{ all -> 0x00a5 }
            ct r3 = r0.f     // Catch:{ all -> 0x00a5 }
            boolean r3 = r3.h()     // Catch:{ all -> 0x00a5 }
            if (r3 != 0) goto L_0x0022
            ct r0 = r0.f     // Catch:{ all -> 0x00a5 }
            r3 = 1
            goto L_0x000e
        L_0x0077:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x00a5 }
            java.lang.String r2 = "BackgroundThreadExecutor required"
            r0.<init>(r2)     // Catch:{ all -> 0x00a5 }
            throw r0     // Catch:{ all -> 0x00a5 }
        L_0x007f:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x00a5 }
            java.lang.String r2 = "MainThreadExecutor required"
            r0.<init>(r2)     // Catch:{ all -> 0x00a5 }
            throw r0     // Catch:{ all -> 0x00a5 }
        L_0x0087:
            if (r3 != 0) goto L_0x008a
            goto L_0x0091
        L_0x008a:
            x r2 = r8.a     // Catch:{ all -> 0x00a5 }
            as r2 = r2.b     // Catch:{ all -> 0x00a5 }
            r2.c(r0)     // Catch:{ all -> 0x00a5 }
        L_0x0091:
            x r0 = r8.a
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.d
            r0.set(r1)
            if (r3 == 0) goto L_0x00ae
            x r0 = r8.a
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.c
            boolean r0 = r0.get()
            if (r0 != 0) goto L_0x0000
            goto L_0x00ae
        L_0x00a5:
            r0 = move-exception
            x r2 = r8.a
            java.util.concurrent.atomic.AtomicBoolean r2 = r2.d
            r2.set(r1)
            throw r0
        L_0x00ae:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v.run():void");
    }
}
