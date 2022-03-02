package defpackage;

/* renamed from: aosf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aosf implements Runnable {
    final /* synthetic */ aosg a;

    public aosf(aosg aosg) {
        this.a = aosg;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001c, code lost:
        if (r2 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0025, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0032, code lost:
        r10.a.d = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0037, code lost:
        if (r2 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0046, code lost:
        r2 = r2 | java.lang.Thread.interrupted();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        r0.run();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x004a, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x004c, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x004e, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        r3 = defpackage.aosg.a;
        r4 = java.util.logging.Level.SEVERE;
        r0 = java.lang.String.valueOf(r0);
        r9 = new java.lang.StringBuilder(java.lang.String.valueOf(r0).length() + 35);
        r9.append("Exception while executing runnable ");
        r9.append(r0);
        r3.logp(r4, "com.google.common.util.concurrent.SequentialExecutor$QueueWorker", "workOnQueue", r9.toString(), r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0079, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x007f, code lost:
        if (r2 != false) goto L_0x0081;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0088, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0089, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x008e, code lost:
        monitor-enter(r10.a.b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
        r10.a.d = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0094, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r10 = this;
            r0 = 0
            r1 = 1
            r2 = 0
        L_0x0003:
            aosg r3 = r10.a     // Catch:{ all -> 0x007e }
            java.util.Deque r3 = r3.b     // Catch:{ all -> 0x007e }
            monitor-enter(r3)     // Catch:{ all -> 0x007e }
            if (r0 != 0) goto L_0x0026
            aosg r0 = r10.a     // Catch:{ all -> 0x007b }
            int r4 = r0.d     // Catch:{ all -> 0x007b }
            r5 = 4
            if (r4 == r5) goto L_0x001b
            long r6 = r0.c     // Catch:{ all -> 0x007b }
            r8 = 1
            long r6 = r6 + r8
            r0.c = r6     // Catch:{ all -> 0x007b }
            r0.d = r5     // Catch:{ all -> 0x007b }
            goto L_0x0026
        L_0x001b:
            monitor-exit(r3)     // Catch:{ all -> 0x007b }
            if (r2 == 0) goto L_0x0040
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch:{ Error -> 0x0089 }
            r0.interrupt()     // Catch:{ Error -> 0x0089 }
            return
        L_0x0026:
            aosg r0 = r10.a     // Catch:{ all -> 0x007b }
            java.util.Deque r0 = r0.b     // Catch:{ all -> 0x007b }
            java.lang.Object r0 = r0.poll()     // Catch:{ all -> 0x007b }
            java.lang.Runnable r0 = (java.lang.Runnable) r0     // Catch:{ all -> 0x007b }
            if (r0 != 0) goto L_0x0041
            aosg r0 = r10.a     // Catch:{ all -> 0x007b }
            r0.d = r1     // Catch:{ all -> 0x007b }
            monitor-exit(r3)     // Catch:{ all -> 0x007b }
            if (r2 == 0) goto L_0x0040
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch:{ Error -> 0x0089 }
            r0.interrupt()     // Catch:{ Error -> 0x0089 }
        L_0x0040:
            return
        L_0x0041:
            monitor-exit(r3)     // Catch:{ all -> 0x007b }
            boolean r3 = java.lang.Thread.interrupted()     // Catch:{ all -> 0x007e }
            r2 = r2 | r3
            r0.run()     // Catch:{ RuntimeException -> 0x004e }
            r0 = 1
            goto L_0x0003
        L_0x004c:
            r0 = move-exception
            goto L_0x007f
        L_0x004e:
            r8 = move-exception
            java.util.logging.Logger r3 = defpackage.aosg.a     // Catch:{ all -> 0x004c }
            java.util.logging.Level r4 = java.util.logging.Level.SEVERE     // Catch:{ all -> 0x004c }
            java.lang.String r5 = "com.google.common.util.concurrent.SequentialExecutor$QueueWorker"
            java.lang.String r6 = "workOnQueue"
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x004c }
            java.lang.String r7 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x004c }
            int r7 = r7.length()     // Catch:{ all -> 0x004c }
            int r7 = r7 + 35
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x004c }
            r9.<init>(r7)     // Catch:{ all -> 0x004c }
            java.lang.String r7 = "Exception while executing runnable "
            r9.append(r7)     // Catch:{ all -> 0x004c }
            r9.append(r0)     // Catch:{ all -> 0x004c }
            java.lang.String r7 = r9.toString()     // Catch:{ all -> 0x004c }
            r3.logp(r4, r5, r6, r7, r8)     // Catch:{ all -> 0x004c }
            r0 = 1
            goto L_0x0003
        L_0x007b:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x007b }
            throw r0     // Catch:{ all -> 0x007e }
        L_0x007e:
            r0 = move-exception
        L_0x007f:
            if (r2 == 0) goto L_0x0088
            java.lang.Thread r2 = java.lang.Thread.currentThread()     // Catch:{ Error -> 0x0089 }
            r2.interrupt()     // Catch:{ Error -> 0x0089 }
        L_0x0088:
            throw r0     // Catch:{ Error -> 0x0089 }
        L_0x0089:
            r0 = move-exception
            aosg r2 = r10.a
            java.util.Deque r2 = r2.b
            monitor-enter(r2)
            aosg r3 = r10.a     // Catch:{ all -> 0x0095 }
            r3.d = r1     // Catch:{ all -> 0x0095 }
            monitor-exit(r2)     // Catch:{ all -> 0x0095 }
            throw r0
        L_0x0095:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0095 }
            goto L_0x0099
        L_0x0098:
            throw r0
        L_0x0099:
            goto L_0x0098
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aosf.run():void");
    }
}
