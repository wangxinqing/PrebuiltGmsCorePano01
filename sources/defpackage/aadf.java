package defpackage;

import android.os.Handler;

/* renamed from: aadf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aadf implements aabo {
    private final qvg a;
    private final aadm b;

    public aadf(qvg qvg, aadm aadm) {
        iva.a((Object) qvg, (Object) "no JobScheduler provided");
        this.a = qvg;
        this.b = aadm;
    }

    private static final boolean b(aabq aabq) {
        return aabq.p() || aabq.q();
    }

    public final void a(aabq aabq) {
        int i;
        if (b(aabq) && (i = aabq.i) >= 0) {
            this.a.a(i);
        }
    }

    public final void a(Handler handler) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:60:0x013a, code lost:
        if (r1 == 1) goto L_0x013c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.aabq r12, defpackage.aabq r13, int r14) {
        /*
            r11 = this;
            java.lang.String r14 = "NetworkScheduler"
            boolean r0 = b(r12)
            if (r0 == 0) goto L_0x0187
            int r13 = r12.i
            r0 = -1
            r1 = 0
            r2 = 1
            if (r13 == r0) goto L_0x0011
            r13 = 1
            goto L_0x0012
        L_0x0011:
            r13 = 0
        L_0x0012:
            java.lang.String r0 = "JobId was not populated."
            defpackage.iva.a((boolean) r13, (java.lang.Object) r0)
            qvg r13 = r11.a     // Catch:{ IllegalStateException -> 0x0168 }
            aadm r0 = r11.b     // Catch:{ IllegalStateException -> 0x0168 }
            boolean r3 = r12.p()     // Catch:{ IllegalStateException -> 0x0168 }
            if (r3 != 0) goto L_0x0044
            boolean r3 = r12.q()     // Catch:{ IllegalStateException -> 0x0168 }
            if (r3 == 0) goto L_0x0029
            goto L_0x0044
        L_0x0029:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException     // Catch:{ IllegalStateException -> 0x0168 }
            int r12 = r12.o     // Catch:{ IllegalStateException -> 0x0168 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ IllegalStateException -> 0x0168 }
            r1 = 30
            r0.<init>(r1)     // Catch:{ IllegalStateException -> 0x0168 }
            java.lang.String r1 = "Unknown task type: "
            r0.append(r1)     // Catch:{ IllegalStateException -> 0x0168 }
            r0.append(r12)     // Catch:{ IllegalStateException -> 0x0168 }
            java.lang.String r12 = r0.toString()     // Catch:{ IllegalStateException -> 0x0168 }
            r13.<init>(r12)     // Catch:{ IllegalStateException -> 0x0168 }
            throw r13     // Catch:{ IllegalStateException -> 0x0168 }
        L_0x0044:
            int r3 = r12.i     // Catch:{ IllegalStateException -> 0x0168 }
            if (r3 < 0) goto L_0x004a
            r3 = 1
            goto L_0x004b
        L_0x004a:
            r3 = 0
        L_0x004b:
            java.lang.String r4 = "jobId needs to be set"
            defpackage.iva.b(r3, r4)     // Catch:{ IllegalStateException -> 0x0168 }
            qxx r3 = r12.n     // Catch:{ IllegalStateException -> 0x0168 }
            qxl r4 = r3.l     // Catch:{ IllegalStateException -> 0x0168 }
            android.app.job.JobInfo$Builder r5 = new android.app.job.JobInfo$Builder     // Catch:{ IllegalStateException -> 0x0168 }
            int r6 = r12.i     // Catch:{ IllegalStateException -> 0x0168 }
            android.content.ComponentName r0 = r0.a     // Catch:{ IllegalStateException -> 0x0168 }
            r5.<init>(r6, r0)     // Catch:{ IllegalStateException -> 0x0168 }
            int r0 = r3.p     // Catch:{ IllegalStateException -> 0x0168 }
            if (r0 == r2) goto L_0x0063
            r0 = 0
            goto L_0x0064
        L_0x0063:
            r0 = 1
        L_0x0064:
            android.app.job.JobInfo$Builder r0 = r5.setRequiresCharging(r0)     // Catch:{ IllegalStateException -> 0x0168 }
            boolean r5 = r12.p()     // Catch:{ IllegalStateException -> 0x0168 }
            if (r5 == 0) goto L_0x0074
            boolean r5 = r12.f     // Catch:{ IllegalStateException -> 0x0168 }
            if (r5 == 0) goto L_0x0074
            r5 = 1
            goto L_0x0075
        L_0x0074:
            r5 = 0
        L_0x0075:
            android.app.job.JobInfo$Builder r0 = r0.setPersisted(r5)     // Catch:{ IllegalStateException -> 0x0168 }
            int r5 = r3.n     // Catch:{ IllegalStateException -> 0x0168 }
            r6 = 2
            if (r5 == r2) goto L_0x0084
            if (r5 == r6) goto L_0x0082
            r5 = 1
            goto L_0x0085
        L_0x0082:
            r5 = 0
            goto L_0x0085
        L_0x0084:
            r5 = 2
        L_0x0085:
            android.app.job.JobInfo$Builder r0 = r0.setRequiredNetworkType(r5)     // Catch:{ IllegalStateException -> 0x0168 }
            android.os.PersistableBundle r5 = new android.os.PersistableBundle     // Catch:{ IllegalStateException -> 0x0168 }
            r5.<init>()     // Catch:{ IllegalStateException -> 0x0168 }
            java.lang.String r7 = "_nts.tag"
            java.lang.String r8 = r12.e()     // Catch:{ IllegalStateException -> 0x0168 }
            r5.putString(r7, r8)     // Catch:{ IllegalStateException -> 0x0168 }
            java.lang.String r7 = "_nts.cls"
            java.lang.String r8 = r12.g()     // Catch:{ IllegalStateException -> 0x0168 }
            r5.putString(r7, r8)     // Catch:{ IllegalStateException -> 0x0168 }
            java.lang.String r7 = "_nts.pkg"
            nxc r8 = r12.a     // Catch:{ IllegalStateException -> 0x0168 }
            java.lang.String r8 = r8.b     // Catch:{ IllegalStateException -> 0x0168 }
            r5.putString(r7, r8)     // Catch:{ IllegalStateException -> 0x0168 }
            java.lang.String r7 = "_nts.usr"
            nxc r8 = r12.a     // Catch:{ IllegalStateException -> 0x0168 }
            long r8 = r8.e     // Catch:{ IllegalStateException -> 0x0168 }
            int r9 = (int) r8     // Catch:{ IllegalStateException -> 0x0168 }
            r5.putInt(r7, r9)     // Catch:{ IllegalStateException -> 0x0168 }
            android.app.job.JobInfo$Builder r0 = r0.setExtras(r5)     // Catch:{ IllegalStateException -> 0x0168 }
            qxr r5 = defpackage.qxr.a     // Catch:{ IllegalStateException -> 0x0168 }
            int r3 = r3.a((defpackage.qxr) r5)     // Catch:{ IllegalStateException -> 0x0168 }
            if (r3 == r2) goto L_0x00d0
            int r3 = r4.c     // Catch:{ IllegalStateException -> 0x0168 }
            long r7 = (long) r3     // Catch:{ IllegalStateException -> 0x0168 }
            r9 = 1000(0x3e8, double:4.94E-321)
            long r7 = r7 * r9
            int r3 = r4.b     // Catch:{ IllegalStateException -> 0x0168 }
            if (r3 != r2) goto L_0x00cb
            goto L_0x00cc
        L_0x00cb:
            r1 = 1
        L_0x00cc:
            r0.setBackoffCriteria(r7, r1)     // Catch:{ IllegalStateException -> 0x0168 }
            goto L_0x00d4
        L_0x00d0:
            r0.setRequiresDeviceIdle(r2)     // Catch:{ IllegalStateException -> 0x0168 }
        L_0x00d4:
            int r1 = r12.o     // Catch:{ IllegalStateException -> 0x0168 }
            if (r1 != r6) goto L_0x00fb
            qxx r1 = r12.n     // Catch:{ IllegalStateException -> 0x0168 }
            qwb r1 = (defpackage.qwb) r1     // Catch:{ IllegalStateException -> 0x0168 }
            java.util.Set r1 = r1.a     // Catch:{ IllegalStateException -> 0x0168 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ IllegalStateException -> 0x0168 }
        L_0x00e2:
            boolean r3 = r1.hasNext()     // Catch:{ IllegalStateException -> 0x0168 }
            if (r3 == 0) goto L_0x0149
            java.lang.Object r3 = r1.next()     // Catch:{ IllegalStateException -> 0x0168 }
            qvz r3 = (defpackage.qvz) r3     // Catch:{ IllegalStateException -> 0x0168 }
            android.app.job.JobInfo$TriggerContentUri r4 = new android.app.job.JobInfo$TriggerContentUri     // Catch:{ IllegalStateException -> 0x0168 }
            android.net.Uri r5 = r3.a     // Catch:{ IllegalStateException -> 0x0168 }
            int r3 = r3.b     // Catch:{ IllegalStateException -> 0x0168 }
            r4.<init>(r5, r3)     // Catch:{ IllegalStateException -> 0x0168 }
            r0.addTriggerContentUri(r4)     // Catch:{ IllegalStateException -> 0x0168 }
            goto L_0x00e2
        L_0x00fb:
            long r3 = android.os.SystemClock.elapsedRealtime()     // Catch:{ IllegalStateException -> 0x0168 }
            long r7 = r12.h()     // Catch:{ IllegalStateException -> 0x0168 }
            long r7 = r7 - r3
            r9 = 0
            long r7 = java.lang.Math.max(r9, r7)     // Catch:{ IllegalStateException -> 0x0168 }
            r0.setMinimumLatency(r7)     // Catch:{ IllegalStateException -> 0x0168 }
            nwq r1 = r12.m     // Catch:{ IllegalStateException -> 0x0168 }
            aucx r1 = r1.b     // Catch:{ IllegalStateException -> 0x0168 }
            boolean r1 = r1.isEmpty()     // Catch:{ IllegalStateException -> 0x0168 }
            if (r1 == 0) goto L_0x0149
            nwq r1 = r12.m     // Catch:{ IllegalStateException -> 0x0168 }
            int r1 = r1.c     // Catch:{ IllegalStateException -> 0x0168 }
            int r1 = defpackage.nwp.a(r1)     // Catch:{ IllegalStateException -> 0x0168 }
            if (r1 == 0) goto L_0x0149
            if (r1 != r6) goto L_0x0149
            nwq r1 = r12.m     // Catch:{ IllegalStateException -> 0x0168 }
            int r1 = r1.d     // Catch:{ IllegalStateException -> 0x0168 }
            int r1 = defpackage.nwl.a(r1)     // Catch:{ IllegalStateException -> 0x0168 }
            if (r1 == 0) goto L_0x0149
            if (r1 != r6) goto L_0x0149
            nwq r1 = r12.m     // Catch:{ IllegalStateException -> 0x0168 }
            int r1 = r1.g     // Catch:{ IllegalStateException -> 0x0168 }
            int r1 = defpackage.nwn.a(r1)     // Catch:{ IllegalStateException -> 0x0168 }
            if (r1 != 0) goto L_0x013a
            goto L_0x013c
        L_0x013a:
            if (r1 != r2) goto L_0x0149
        L_0x013c:
            long r5 = r12.i()     // Catch:{ IllegalStateException -> 0x0168 }
            long r5 = r5 - r3
            long r3 = java.lang.Math.max(r9, r5)     // Catch:{ IllegalStateException -> 0x0168 }
            r0.setOverrideDeadline(r3)     // Catch:{ IllegalStateException -> 0x0168 }
        L_0x0149:
            android.app.job.JobInfo r0 = r0.build()     // Catch:{ IllegalStateException -> 0x0168 }
            nxc r1 = r12.a     // Catch:{ IllegalStateException -> 0x0168 }
            java.lang.String r3 = r1.b     // Catch:{ IllegalStateException -> 0x0168 }
            long r4 = r1.e     // Catch:{ IllegalStateException -> 0x0168 }
            int r1 = (int) r4     // Catch:{ IllegalStateException -> 0x0168 }
            int r1 = defpackage.nqw.a((int) r1)     // Catch:{ IllegalStateException -> 0x0168 }
            java.lang.String r12 = r12.e()     // Catch:{ IllegalStateException -> 0x0168 }
            int r12 = r13.a((android.app.job.JobInfo) r0, (java.lang.String) r3, (int) r1, (java.lang.String) r12)     // Catch:{ IllegalStateException -> 0x0168 }
            if (r12 == r2) goto L_0x0167
            java.lang.String r12 = "Task was not scheduled."
            android.util.Log.e(r14, r12)     // Catch:{ IllegalStateException -> 0x0168 }
        L_0x0167:
            return
        L_0x0168:
            r12 = move-exception
            java.lang.String r12 = r12.getMessage()
            java.lang.String r12 = java.lang.String.valueOf(r12)
            java.lang.String r13 = "dropping task because JobScheduler threw exception: "
            int r0 = r12.length()
            if (r0 != 0) goto L_0x017f
            java.lang.String r12 = new java.lang.String
            r12.<init>(r13)
            goto L_0x0183
        L_0x017f:
            java.lang.String r12 = r13.concat(r12)
        L_0x0183:
            android.util.Log.e(r14, r12)
            return
        L_0x0187:
            if (r13 == 0) goto L_0x018c
            r11.a((defpackage.aabq) r13)
        L_0x018c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aadf.a(aabq, aabq, int):void");
    }
}
