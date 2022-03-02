package defpackage;

/* renamed from: acei  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class acei implements Runnable {
    final /* synthetic */ acel a;

    public acei(acel acel) {
        this.a = acel;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0032, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r6 = this;
            r0 = 500(0x1f4, double:2.47E-321)
            java.lang.Thread.sleep(r0)     // Catch:{ InterruptedException -> 0x0006 }
            goto L_0x0007
        L_0x0006:
            r0 = move-exception
        L_0x0007:
            acel r0 = r6.a
            monitor-enter(r0)
            boolean r1 = r0.e     // Catch:{ all -> 0x0035 }
            if (r1 != 0) goto L_0x0033
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0035 }
            long r3 = r0.d     // Catch:{ all -> 0x0035 }
            long r1 = r1 - r3
            long r3 = r0.b     // Catch:{ all -> 0x0035 }
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x002e
            java.util.concurrent.Executor r1 = r0.a     // Catch:{ all -> 0x0035 }
            if (r1 == 0) goto L_0x0028
            acej r2 = new acej     // Catch:{ all -> 0x0035 }
            r2.<init>(r0)     // Catch:{ all -> 0x0035 }
            r1.execute(r2)     // Catch:{ all -> 0x0035 }
            goto L_0x0031
        L_0x0028:
            acek r1 = r0.c     // Catch:{ all -> 0x0035 }
            r1.a()     // Catch:{ all -> 0x0035 }
            goto L_0x0031
        L_0x002e:
            r0.d()     // Catch:{ all -> 0x0035 }
        L_0x0031:
            monitor-exit(r0)     // Catch:{ all -> 0x0035 }
            return
        L_0x0033:
            monitor-exit(r0)     // Catch:{ all -> 0x0035 }
            return
        L_0x0035:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0035 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acei.run():void");
    }
}
