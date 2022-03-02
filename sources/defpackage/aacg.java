package defpackage;

/* renamed from: aacg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class aacg implements Runnable {
    private final aacp a;
    private final aabx b;
    private final acwd c;

    public aacg(aacp aacp, aabx aabx, acwd acwd) {
        this.a = aacp;
        this.b = aabx;
        this.c = acwd;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0166, code lost:
        if (r0 != false) goto L_0x0168;
     */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x01b6 A[SYNTHETIC, Splitter:B:60:0x01b6] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01cd A[Catch:{ SecurityException -> 0x020c, Exception -> 0x01d9 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r18 = this;
            r1 = r18
            aacp r2 = r1.a
            aabx r3 = r1.b
            acwd r4 = r1.c
            r5 = 512(0x200, float:7.175E-43)
            aacn r6 = new aacn     // Catch:{ SecurityException -> 0x020c, Exception -> 0x01d9 }
            r6.<init>(r3)     // Catch:{ SecurityException -> 0x020c, Exception -> 0x01d9 }
            ntv r0 = r2.c     // Catch:{ SecurityException -> 0x020c, Exception -> 0x01d9 }
            r7 = 0
            android.content.Context r9 = r0.b(r7)     // Catch:{ SecurityException -> 0x020c, Exception -> 0x01d9 }
            if (r9 != 0) goto L_0x0041
            android.content.ComponentName r0 = r6.c     // Catch:{ SecurityException -> 0x020c, Exception -> 0x01d9 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ SecurityException -> 0x020c, Exception -> 0x01d9 }
            java.lang.String r2 = java.lang.String.valueOf(r0)     // Catch:{ SecurityException -> 0x020c, Exception -> 0x01d9 }
            int r2 = r2.length()     // Catch:{ SecurityException -> 0x020c, Exception -> 0x01d9 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ SecurityException -> 0x020c, Exception -> 0x01d9 }
            int r2 = r2 + 26
            r6.<init>(r2)     // Catch:{ SecurityException -> 0x020c, Exception -> 0x01d9 }
            java.lang.String r2 = "Unable to get context for "
            r6.append(r2)     // Catch:{ SecurityException -> 0x020c, Exception -> 0x01d9 }
            r6.append(r0)     // Catch:{ SecurityException -> 0x020c, Exception -> 0x01d9 }
            java.lang.String r0 = "NetworkScheduler.TED"
            java.lang.String r2 = r6.toString()     // Catch:{ SecurityException -> 0x020c, Exception -> 0x01d9 }
            android.util.Log.e(r0, r2)     // Catch:{ SecurityException -> 0x020c, Exception -> 0x01d9 }
            r14 = 0
            goto L_0x01b4
        L_0x0041:
            java.lang.Object r15 = r2.a     // Catch:{ SecurityException -> 0x020c, Exception -> 0x01d9 }
            monitor-enter(r15)     // Catch:{ SecurityException -> 0x020c, Exception -> 0x01d9 }
            nz r0 = r2.b     // Catch:{ all -> 0x01d6 }
            java.lang.Object r0 = r0.get(r6)     // Catch:{ all -> 0x01d6 }
            aacm r0 = (defpackage.aacm) r0     // Catch:{ all -> 0x01d6 }
            if (r0 != 0) goto L_0x01b2
            aacm r13 = new aacm     // Catch:{ all -> 0x01d6 }
            android.os.Looper r0 = r2.d     // Catch:{ all -> 0x01d6 }
            int r8 = r6.a     // Catch:{ all -> 0x01d6 }
            r10 = 2
            r11 = 3
            r12 = 1
            if (r8 == 0) goto L_0x0063
            boolean r8 = defpackage.axlu.d()     // Catch:{ all -> 0x01d6 }
            if (r8 != 0) goto L_0x0061
            r8 = 2
            goto L_0x0064
        L_0x0061:
            r8 = 3
            goto L_0x0064
        L_0x0063:
            r8 = 1
        L_0x0064:
            r13.<init>(r2, r6, r0, r8)     // Catch:{ all -> 0x01d6 }
            int r0 = r13.c     // Catch:{ all -> 0x01d6 }
            if (r0 == r12) goto L_0x0154
            if (r0 == r10) goto L_0x013e
            if (r0 == r11) goto L_0x008a
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x01d6 }
            r8 = 42
            r7.<init>(r8)     // Catch:{ all -> 0x01d6 }
            java.lang.String r8 = "Unexpected execution strategy: "
            r7.append(r8)     // Catch:{ all -> 0x01d6 }
            r7.append(r0)     // Catch:{ all -> 0x01d6 }
            java.lang.String r0 = "NetworkScheduler.TED"
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x01d6 }
            android.util.Log.e(r0, r7)     // Catch:{ all -> 0x01d6 }
            r14 = r13
            goto L_0x0186
        L_0x008a:
            acwd r0 = new acwd     // Catch:{ all -> 0x01d6 }
            r0.<init>()     // Catch:{ all -> 0x01d6 }
            int r10 = r6.a     // Catch:{ all -> 0x01d6 }
            android.os.Bundle r8 = new android.os.Bundle     // Catch:{ all -> 0x01d6 }
            r8.<init>()     // Catch:{ all -> 0x01d6 }
            nta r11 = new nta     // Catch:{ all -> 0x01d6 }
            r11.<init>(r13, r13)     // Catch:{ all -> 0x01d6 }
            java.lang.String r12 = "callback"
            r8.putBinder(r12, r11)     // Catch:{ all -> 0x01d6 }
            java.lang.String r11 = "OP_CODE"
            r12 = 5
            r8.putInt(r11, r12)     // Catch:{ all -> 0x01d6 }
            java.lang.String r11 = "intent"
            aacn r12 = r13.b     // Catch:{ all -> 0x01d6 }
            android.content.Intent r12 = r12.a()     // Catch:{ all -> 0x01d6 }
            r8.putParcelable(r11, r12)     // Catch:{ all -> 0x01d6 }
            boolean r11 = defpackage.axbn.g()     // Catch:{ all -> 0x01d6 }
            if (r11 != 0) goto L_0x00b8
            goto L_0x00bd
        L_0x00b8:
            java.lang.String r11 = "user_serial"
            r8.putInt(r11, r10)     // Catch:{ all -> 0x01d6 }
        L_0x00bd:
            android.content.Intent r11 = new android.content.Intent     // Catch:{ all -> 0x01d6 }
            r11.<init>()     // Catch:{ all -> 0x01d6 }
            android.content.Intent r8 = r11.putExtras(r8)     // Catch:{ all -> 0x01d6 }
            aacp r11 = r13.h     // Catch:{ all -> 0x01d6 }
            ntv r11 = r11.c     // Catch:{ all -> 0x01d6 }
            android.content.Context r11 = r11.b(r7)     // Catch:{ all -> 0x01d6 }
            java.lang.String r12 = "com.google.android.gms.gcm.nts.SchedulerInternalReceiver"
            android.content.Intent r11 = r8.setClassName(r11, r12)     // Catch:{ all -> 0x01d6 }
            com.google.android.gms.scheduler.execution.TaskConnectionTracker$1 r12 = new com.google.android.gms.scheduler.execution.TaskConnectionTracker$1     // Catch:{ all -> 0x01d6 }
            java.lang.String r8 = "scheduler"
            r12.<init>(r8, r0)     // Catch:{ all -> 0x01d6 }
            r16 = 0
            r17 = 0
            r8 = r9
            r9 = r10
            r10 = r11
            r11 = r16
            r14 = r13
            r13 = r17
            defpackage.nqw.a(r8, r9, r10, r11, r12, r13)     // Catch:{ all -> 0x01d6 }
            acwi r0 = r0.a     // Catch:{ ExecutionException -> 0x0118, InterruptedException -> 0x0116 }
            java.lang.Object r0 = defpackage.acws.a((defpackage.acwa) r0)     // Catch:{ ExecutionException -> 0x0118, InterruptedException -> 0x0116 }
            android.os.Bundle r0 = (android.os.Bundle) r0     // Catch:{ ExecutionException -> 0x0118, InterruptedException -> 0x0116 }
            if (r0 == 0) goto L_0x0186
            java.lang.String r8 = "binder"
            android.os.IBinder r0 = r0.getBinder(r8)     // Catch:{ all -> 0x01d6 }
            if (r0 != 0) goto L_0x0105
            java.lang.String r0 = "NetworkScheduler.TED"
            java.lang.String r7 = "Proxy binder is missing from start proxy broadcast"
            android.util.Log.e(r0, r7)     // Catch:{ all -> 0x01d6 }
            goto L_0x0186
        L_0x0105:
            r0.linkToDeath(r14, r7)     // Catch:{ RemoteException -> 0x010c }
            r14.g = r0     // Catch:{ RemoteException -> 0x010c }
            goto L_0x0168
        L_0x010c:
            r0 = move-exception
            java.lang.String r7 = "NetworkScheduler.TED"
            java.lang.String r8 = "Binder linkToDeath failed"
            android.util.Log.e(r7, r8, r0)     // Catch:{ all -> 0x01d6 }
            goto L_0x0186
        L_0x0116:
            r0 = move-exception
            goto L_0x0119
        L_0x0118:
            r0 = move-exception
        L_0x0119:
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x01d6 }
            java.lang.String r7 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x01d6 }
            int r7 = r7.length()     // Catch:{ all -> 0x01d6 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x01d6 }
            int r7 = r7 + 38
            r8.<init>(r7)     // Catch:{ all -> 0x01d6 }
            java.lang.String r7 = "Failed waiting for ordered broadcast: "
            r8.append(r7)     // Catch:{ all -> 0x01d6 }
            r8.append(r0)     // Catch:{ all -> 0x01d6 }
            java.lang.String r0 = "NetworkScheduler.TED"
            java.lang.String r7 = r8.toString()     // Catch:{ all -> 0x01d6 }
            android.util.Log.e(r0, r7)     // Catch:{ all -> 0x01d6 }
            goto L_0x0186
        L_0x013e:
            r14 = r13
            android.content.Intent r0 = r6.a()     // Catch:{ all -> 0x01d6 }
            int r7 = defpackage.aacp.a()     // Catch:{ all -> 0x01d6 }
            int r8 = r6.a     // Catch:{ all -> 0x01d6 }
            java.lang.Object r8 = defpackage.nqw.c(r8)     // Catch:{ all -> 0x01d6 }
            android.os.UserHandle r8 = (android.os.UserHandle) r8     // Catch:{ all -> 0x01d6 }
            boolean r0 = r9.bindServiceAsUser(r0, r14, r7, r8)     // Catch:{ all -> 0x01d6 }
            goto L_0x0166
        L_0x0154:
            r14 = r13
            jca r8 = r2.f     // Catch:{ all -> 0x01d6 }
            java.lang.String r10 = "NetworkScheduler"
            android.content.Intent r11 = r6.a()     // Catch:{ all -> 0x01d6 }
            int r13 = defpackage.aacp.a()     // Catch:{ all -> 0x01d6 }
            r12 = r14
            boolean r0 = r8.a((android.content.Context) r9, (java.lang.String) r10, (android.content.Intent) r11, (android.content.ServiceConnection) r12, (int) r13)     // Catch:{ all -> 0x01d6 }
        L_0x0166:
            if (r0 == 0) goto L_0x0186
        L_0x0168:
            nz r0 = r2.b     // Catch:{ all -> 0x01d6 }
            r0.put(r6, r14)     // Catch:{ all -> 0x01d6 }
            monitor-exit(r15)     // Catch:{ all -> 0x01d6 }
            java.util.concurrent.ScheduledExecutorService r0 = r2.e     // Catch:{ SecurityException -> 0x020c, Exception -> 0x01d9 }
            r14.getClass()     // Catch:{ SecurityException -> 0x020c, Exception -> 0x01d9 }
            aach r2 = new aach     // Catch:{ SecurityException -> 0x020c, Exception -> 0x01d9 }
            r2.<init>(r14)     // Catch:{ SecurityException -> 0x020c, Exception -> 0x01d9 }
            long r6 = defpackage.axlu.b()     // Catch:{ SecurityException -> 0x020c, Exception -> 0x01d9 }
            int r7 = (int) r6     // Catch:{ SecurityException -> 0x020c, Exception -> 0x01d9 }
            long r6 = (long) r7     // Catch:{ SecurityException -> 0x020c, Exception -> 0x01d9 }
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ SecurityException -> 0x020c, Exception -> 0x01d9 }
            jfv r0 = (defpackage.jfv) r0     // Catch:{ SecurityException -> 0x020c, Exception -> 0x01d9 }
            r0.schedule((java.lang.Runnable) r2, (long) r6, (java.util.concurrent.TimeUnit) r8)     // Catch:{ SecurityException -> 0x020c, Exception -> 0x01d9 }
            goto L_0x01b4
        L_0x0186:
            java.lang.String r0 = "NetworkScheduler.TED"
            android.content.ComponentName r6 = r6.c     // Catch:{ all -> 0x01d6 }
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x01d6 }
            java.lang.String r7 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x01d6 }
            int r7 = r7.length()     // Catch:{ all -> 0x01d6 }
            int r7 = r7 + 32
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x01d6 }
            r8.<init>(r7)     // Catch:{ all -> 0x01d6 }
            java.lang.String r7 = "Unable to bind to task service: "
            r8.append(r7)     // Catch:{ all -> 0x01d6 }
            r8.append(r6)     // Catch:{ all -> 0x01d6 }
            java.lang.String r6 = r8.toString()     // Catch:{ all -> 0x01d6 }
            android.util.Log.e(r0, r6)     // Catch:{ all -> 0x01d6 }
            r2.a(r14)     // Catch:{ all -> 0x01d6 }
            monitor-exit(r15)     // Catch:{ all -> 0x01d6 }
            r14 = 0
            goto L_0x01b4
        L_0x01b2:
            monitor-exit(r15)     // Catch:{ all -> 0x01d6 }
            r14 = r0
        L_0x01b4:
            if (r14 == 0) goto L_0x01cd
            aacp r0 = r14.h     // Catch:{ SecurityException -> 0x020c, Exception -> 0x01d9 }
            java.lang.Object r2 = r0.a     // Catch:{ SecurityException -> 0x020c, Exception -> 0x01d9 }
            monitor-enter(r2)     // Catch:{ SecurityException -> 0x020c, Exception -> 0x01d9 }
            java.util.List r0 = r14.a     // Catch:{ all -> 0x01ca }
            aaco r6 = new aaco     // Catch:{ all -> 0x01ca }
            r6.<init>(r3, r4)     // Catch:{ all -> 0x01ca }
            r0.add(r6)     // Catch:{ all -> 0x01ca }
            r14.c()     // Catch:{ all -> 0x01ca }
            monitor-exit(r2)     // Catch:{ all -> 0x01ca }
            return
        L_0x01ca:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x01ca }
            throw r0     // Catch:{ SecurityException -> 0x020c, Exception -> 0x01d9 }
        L_0x01cd:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)     // Catch:{ SecurityException -> 0x020c, Exception -> 0x01d9 }
            r4.a((java.lang.Object) r0)     // Catch:{ SecurityException -> 0x020c, Exception -> 0x01d9 }
            return
        L_0x01d6:
            r0 = move-exception
            monitor-exit(r15)     // Catch:{ all -> 0x01d6 }
            throw r0     // Catch:{ SecurityException -> 0x020c, Exception -> 0x01d9 }
        L_0x01d9:
            r0 = move-exception
            aabq r0 = r3.a
            android.content.ComponentName r0 = r0.f()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r2 = java.lang.String.valueOf(r0)
            int r2 = r2.length()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r2 = r2 + 26
            r3.<init>(r2)
            java.lang.String r2 = "Couldn't bind to service: "
            r3.append(r2)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            java.lang.String r2 = "NetworkScheduler.TED"
            android.util.Log.e(r2, r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            r4.b((java.lang.Object) r0)
            return
        L_0x020c:
            r0 = move-exception
            r0 = 8
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4.b((java.lang.Object) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aacg.run():void");
    }
}
