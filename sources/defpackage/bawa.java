package defpackage;

/* renamed from: bawa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class bawa implements Runnable {
    final /* synthetic */ bawb a;

    public bawa(bawb bawb) {
        this.a = bawb;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001f, code lost:
        if (r1 == null) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r1.run();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0024, code lost:
        r0 = r6.a.c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0028, code lost:
        monitor-enter(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r1 = (java.lang.Runnable) r6.a.c.pollFirst();
        r2 = r6.a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0035, code lost:
        if (r1 == null) goto L_0x0039;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0037, code lost:
        r5 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0039, code lost:
        r5 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003a, code lost:
        r2.d = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003c, code lost:
        monitor-exit(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0041, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0046, code lost:
        monitor-enter(r6.a.c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        r2 = r6.a;
        r2.d = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        r2.a.execute(r2.b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0055, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0059, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r6 = this;
            bawb r0 = r6.a
            java.util.ArrayDeque r0 = r0.c
            monitor-enter(r0)
            bawb r1 = r6.a     // Catch:{ all -> 0x005c }
            boolean r2 = r1.d     // Catch:{ all -> 0x005c }
            if (r2 != 0) goto L_0x005a
            java.util.ArrayDeque r1 = r1.c     // Catch:{ all -> 0x005c }
            java.lang.Object r1 = r1.pollFirst()     // Catch:{ all -> 0x005c }
            java.lang.Runnable r1 = (java.lang.Runnable) r1     // Catch:{ all -> 0x005c }
            bawb r2 = r6.a     // Catch:{ all -> 0x005c }
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L_0x001b
            r5 = 1
            goto L_0x001c
        L_0x001b:
            r5 = 0
        L_0x001c:
            r2.d = r5     // Catch:{ all -> 0x005c }
            monitor-exit(r0)     // Catch:{ all -> 0x005c }
        L_0x001f:
            if (r1 == 0) goto L_0x0059
            r1.run()     // Catch:{ all -> 0x0041 }
            bawb r0 = r6.a
            java.util.ArrayDeque r0 = r0.c
            monitor-enter(r0)
            bawb r1 = r6.a     // Catch:{ all -> 0x003e }
            java.util.ArrayDeque r1 = r1.c     // Catch:{ all -> 0x003e }
            java.lang.Object r1 = r1.pollFirst()     // Catch:{ all -> 0x003e }
            java.lang.Runnable r1 = (java.lang.Runnable) r1     // Catch:{ all -> 0x003e }
            bawb r2 = r6.a     // Catch:{ all -> 0x003e }
            if (r1 == 0) goto L_0x0039
            r5 = 1
            goto L_0x003a
        L_0x0039:
            r5 = 0
        L_0x003a:
            r2.d = r5     // Catch:{ all -> 0x003e }
            monitor-exit(r0)     // Catch:{ all -> 0x003e }
            goto L_0x001f
        L_0x003e:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x003e }
            throw r1
        L_0x0041:
            r0 = move-exception
            bawb r1 = r6.a
            java.util.ArrayDeque r1 = r1.c
            monitor-enter(r1)
            bawb r2 = r6.a     // Catch:{ all -> 0x0056 }
            r2.d = r4     // Catch:{ all -> 0x0056 }
            java.util.concurrent.Executor r3 = r2.a     // Catch:{ RejectedExecutionException -> 0x0053 }
            java.lang.Runnable r2 = r2.b     // Catch:{ RejectedExecutionException -> 0x0053 }
            r3.execute(r2)     // Catch:{ RejectedExecutionException -> 0x0053 }
            goto L_0x0054
        L_0x0053:
            r2 = move-exception
        L_0x0054:
            monitor-exit(r1)     // Catch:{ all -> 0x0056 }
            throw r0
        L_0x0056:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0056 }
            throw r0
        L_0x0059:
            return
        L_0x005a:
            monitor-exit(r0)     // Catch:{ all -> 0x005c }
            return
        L_0x005c:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x005c }
            goto L_0x0060
        L_0x005f:
            throw r1
        L_0x0060:
            goto L_0x005f
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bawa.run():void");
    }
}
