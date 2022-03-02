package defpackage;

/* renamed from: nrc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class nrc implements nri {
    private final nrj a;
    private final amnc b;
    private final long c;

    public nrc(nrj nrj, amnc amnc, long j) {
        this.a = nrj;
        this.b = amnc;
        this.c = j;
    }

    /* JADX WARNING: type inference failed for: r0v20, types: [aucj] */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x01bd, code lost:
        if (defpackage.amsk.a(',').c(defpackage.axjy.a.b().d()).contains(java.lang.Integer.toString(r6.suppressedVisualEffects)) == false) goto L_0x01bf;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0314  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0328  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x02c9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.acwa a() {
        /*
            r20 = this;
            r1 = r20
            nrj r2 = r1.a
            amnc r3 = r1.b
            long r4 = r1.c
            ntx r6 = defpackage.ntx.a((defpackage.amnc) r3)
            boolean r0 = defpackage.axmg.b()
            r7 = 0
            r8 = 1
            r9 = 0
            if (r0 != 0) goto L_0x001b
            boolean r0 = defpackage.axmg.c()
            if (r0 == 0) goto L_0x0093
        L_0x001b:
            ntv r0 = r2.n
            boolean r10 = defpackage.jkr.g()
            if (r10 == 0) goto L_0x0093
            android.content.pm.PackageInfo r10 = r6.b(r0, r9)     // Catch:{ NameNotFoundException -> 0x0092 }
            int r11 = r6.b     // Catch:{ NameNotFoundException -> 0x0092 }
            android.content.Context r0 = r0.b(r11)     // Catch:{ NameNotFoundException -> 0x0092 }
            java.lang.Class<android.app.AppOpsManager> r11 = android.app.AppOpsManager.class
            java.lang.Object r0 = r0.getSystemService(r11)     // Catch:{ NameNotFoundException -> 0x0092 }
            android.app.AppOpsManager r0 = (android.app.AppOpsManager) r0     // Catch:{ NameNotFoundException -> 0x0092 }
            java.lang.String r11 = "android:run_any_in_background"
            android.content.pm.ApplicationInfo r12 = r10.applicationInfo     // Catch:{ NameNotFoundException -> 0x0092 }
            int r12 = r12.uid     // Catch:{ NameNotFoundException -> 0x0092 }
            android.content.pm.ApplicationInfo r10 = r10.applicationInfo     // Catch:{ NameNotFoundException -> 0x0092 }
            java.lang.String r10 = r10.packageName     // Catch:{ NameNotFoundException -> 0x0092 }
            int r0 = r0.checkOpNoThrow(r11, r12, r10)     // Catch:{ NameNotFoundException -> 0x0092 }
            if (r0 != 0) goto L_0x0046
            goto L_0x0093
        L_0x0046:
            boolean r0 = defpackage.axmg.c()
            if (r0 == 0) goto L_0x007b
            nub r0 = r2.k
            java.lang.String r10 = r3.h
            int r11 = r3.q
            nya r12 = defpackage.nya.k
            aucd r12 = r12.o()
            boolean r13 = r12.c
            if (r13 != 0) goto L_0x005d
            goto L_0x0062
        L_0x005d:
            r12.c()
            r12.c = r9
        L_0x0062:
            aucj r13 = r12.b
            nya r13 = (defpackage.nya) r13
            int r14 = r13.a
            r14 = r14 | 8
            r13.a = r14
            r13.g = r11
            r11 = 13
            r13.b = r11
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r8)
            r13.c = r11
            r0.a(r6, r10, r12)
        L_0x007b:
            boolean r0 = defpackage.axmg.b()
            if (r0 == 0) goto L_0x0093
            nub r0 = r2.k
            java.lang.String r2 = r3.h
            int r3 = r3.q
            nxy r4 = defpackage.nxy.APP_RESTRICTED
            r0.a((defpackage.ntx) r6, (java.lang.String) r2, (int) r3, (defpackage.nxy) r4)
            acwa r0 = defpackage.acws.a((java.lang.Object) r7)
            goto L_0x032d
        L_0x0092:
            r0 = move-exception
        L_0x0093:
            axlc r0 = defpackage.axlc.a
            axld r0 = r0.a()
            boolean r0 = r0.n()
            if (r0 != 0) goto L_0x00a0
            goto L_0x00a7
        L_0x00a0:
            nuh r0 = r2.i
            ntn r10 = r2.j
            r0.a((defpackage.nrj) r2, (defpackage.ntn) r10, (defpackage.ntx) r6)
        L_0x00a7:
            nvt r0 = r2.o
            boolean r6 = defpackage.jkr.h()
            if (r6 != 0) goto L_0x00b1
            goto L_0x0157
        L_0x00b1:
            axlc r6 = defpackage.axlc.a
            axld r6 = r6.a()
            boolean r6 = r6.o()
            if (r6 == 0) goto L_0x0157
            nvs r6 = new nvs
            r6.<init>(r3)
            apwx r10 = r6.b
            java.lang.String r11 = "gcm.n.e"
            boolean r10 = r10.b(r11)
            if (r10 == 0) goto L_0x0157
            apwx r10 = r6.b
            java.lang.String r11 = "gcm.n.dnp"
            boolean r10 = r10.b(r11)
            if (r10 != 0) goto L_0x0157
            apwx r10 = r6.b
            java.lang.String r11 = "gcm.n.image"
            java.lang.String r10 = r10.a(r11)
            boolean r10 = android.text.TextUtils.isEmpty(r10)
            if (r10 == 0) goto L_0x0157
            nvr r10 = r6.a
            ntx r10 = r10.c
            ntv r11 = r0.a
            int r12 = r10.b
            android.content.Context r13 = r11.b(r12)
            ntv r11 = r0.a
            int r12 = r10.b
            java.lang.String r14 = r10.a
            android.content.Context r11 = r11.a(r12, r14)
            java.lang.Class<android.app.NotificationManager> r12 = android.app.NotificationManager.class
            java.lang.Object r12 = r13.getSystemService(r12)
            android.app.NotificationManager r12 = (android.app.NotificationManager) r12
            java.lang.String r14 = r10.a
            boolean r14 = r12.canNotifyAsPackage(r14)
            if (r14 == 0) goto L_0x0157
            ntn r0 = r0.b
            int r0 = r0.a(r10)
            if (r0 > 0) goto L_0x0157
            apwx r0 = r6.b
            java.lang.String r14 = "gcm.n.android_channel_id"
            java.lang.String r0 = r0.a(r14)
            boolean r14 = android.text.TextUtils.isEmpty(r0)
            if (r14 != 0) goto L_0x0157
            java.lang.Class<android.app.NotificationManager> r14 = android.app.NotificationManager.class
            java.lang.Object r14 = r11.getSystemService(r14)
            android.app.NotificationManager r14 = (android.app.NotificationManager) r14
            if (r14 == 0) goto L_0x0157
            android.app.NotificationChannel r14 = r14.getNotificationChannel(r0)
            if (r14 == 0) goto L_0x0157
            java.lang.String r14 = r10.a
            apwx r15 = r6.b
            android.content.res.Resources r17 = r11.getResources()
            android.content.pm.PackageManager r18 = r11.getPackageManager()
            android.os.Bundle r19 = android.os.Bundle.EMPTY
            r16 = r0
            apwu r0 = defpackage.apwv.a(r13, r14, r15, r16, r17, r18, r19)
            java.lang.String r2 = r10.a
            java.lang.String r3 = r0.b
            je r0 = r0.a
            android.app.Notification r0 = r0.b()
            r12.notifyAsPackage(r2, r3, r9, r0)
            acwa r0 = defpackage.acws.a((java.lang.Object) r7)
            goto L_0x032d
        L_0x0157:
            ntn r0 = r2.j
            boolean r6 = defpackage.jkr.g()
            r10 = 10
            if (r6 == 0) goto L_0x02c6
            int r6 = r3.q
            if (r6 < r10) goto L_0x02c6
            axjy r6 = defpackage.axjy.a
            axjz r6 = r6.a()
            boolean r6 = r6.b()
            if (r6 != 0) goto L_0x01bf
            android.content.Context r6 = r0.a
            boolean r11 = defpackage.jkr.b()
            if (r11 == 0) goto L_0x01bf
            iwq r6 = defpackage.iwq.a((android.content.Context) r6)
            int r6 = r6.c()
            if (r6 == r8) goto L_0x01bf
            android.content.Context r6 = r0.a
            boolean r11 = defpackage.jkr.c()
            if (r11 == 0) goto L_0x01bf
            iwq r6 = defpackage.iwq.a((android.content.Context) r6)
            boolean r11 = defpackage.jkr.b()
            if (r11 == 0) goto L_0x019c
            android.app.NotificationManager r6 = r6.a
            android.app.NotificationManager$Policy r6 = r6.getNotificationPolicy()
            goto L_0x019d
        L_0x019c:
            r6 = r7
        L_0x019d:
            if (r6 == 0) goto L_0x01bf
            int r6 = r6.suppressedVisualEffects
            r11 = 44
            amsk r11 = defpackage.amsk.a((char) r11)
            axjy r12 = defpackage.axjy.a
            axjz r12 = r12.a()
            java.lang.String r12 = r12.d()
            java.util.List r11 = r11.c(r12)
            java.lang.String r6 = java.lang.Integer.toString(r6)
            boolean r6 = r11.contains(r6)
            if (r6 != 0) goto L_0x02c6
        L_0x01bf:
            java.util.NavigableMap r6 = r0.a()
            if (r6 == 0) goto L_0x02c6
            ntx r6 = defpackage.ntx.a((defpackage.amnc) r3)
            nrr r11 = defpackage.nrr.a()
            ntv r11 = r11.l
            int r12 = r6.b
            android.content.Context r11 = r11.b(r12)
            int r11 = defpackage.nqw.a((android.content.Context) r11, (defpackage.ntx) r6)
            nya r12 = defpackage.nya.k
            aucd r12 = r12.o()
            java.lang.String r13 = r3.h
            boolean r14 = r12.c
            if (r14 != 0) goto L_0x01e6
            goto L_0x01eb
        L_0x01e6:
            r12.c()
            r12.c = r9
        L_0x01eb:
            aucj r14 = r12.b
            nya r14 = (defpackage.nya) r14
            r13.getClass()
            int r15 = r14.a
            r15 = r15 | r8
            r14.a = r15
            r14.d = r13
            java.lang.String r13 = r6.a
            r13.getClass()
            r15 = r15 | 2
            r14.a = r15
            r14.e = r13
            int r13 = r6.b
            r15 = r15 | 4
            r14.a = r15
            r14.f = r13
            int r13 = r3.q
            r15 = r15 | 8
            r14.a = r15
            r14.g = r13
            r13 = r15 | 16
            r14.a = r13
            r14.h = r11
            java.util.Map$Entry r11 = r0.b(r6)
            if (r11 != 0) goto L_0x022a
            nsb r0 = r0.c
            nxt r6 = defpackage.nxt.APP_WAS_IN_HIGH_USAGE_BUCKET
            r0.a(r12, r6)
            r8 = 0
            goto L_0x02c7
        L_0x022a:
            java.lang.Object r11 = r11.getValue()
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            long r13 = java.lang.System.currentTimeMillis()
            nua r15 = r0.b
            ntz r15 = r15.b(r6)
            boolean r16 = r0.a(r6, r13)
            if (r16 == 0) goto L_0x026d
            nua r15 = r0.b
            ntz r7 = new ntz
            r7.<init>(r13, r8)
            r15.a((defpackage.ntx) r6, (defpackage.ntz) r7)
            boolean r6 = r12.c
            if (r6 != 0) goto L_0x0253
            goto L_0x0258
        L_0x0253:
            r12.c()
            r12.c = r9
        L_0x0258:
            aucj r6 = r12.b
            nya r6 = (defpackage.nya) r6
            int r7 = r6.a
            r7 = r7 | 32
            r6.a = r7
            r6.i = r11
            nsb r0 = r0.c
            nxt r6 = defpackage.nxt.APP_WAS_WITHIN_QUOTA
            r0.a(r12, r6)
            r8 = 0
            goto L_0x02c7
        L_0x026d:
            nua r7 = r0.b
            ntz r7 = r7.b(r6)
            int r7 = r7.c
            if (r11 <= r7) goto L_0x02a8
            int r7 = r15.c
            int r11 = r11 - r7
            boolean r7 = r12.c
            if (r7 != 0) goto L_0x027f
            goto L_0x0284
        L_0x027f:
            r12.c()
            r12.c = r9
        L_0x0284:
            aucj r7 = r12.b
            nya r7 = (defpackage.nya) r7
            int r13 = r7.a
            r13 = r13 | 32
            r7.a = r13
            r7.i = r11
            nsb r7 = r0.c
            nxt r11 = defpackage.nxt.APP_WAS_WITHIN_QUOTA
            r7.a(r12, r11)
            nua r0 = r0.b
            ntz r7 = new ntz
            long r11 = r15.b
            int r13 = r15.c
            int r13 = r13 + r8
            r7.<init>(r11, r13)
            r0.a((defpackage.ntx) r6, (defpackage.ntz) r7)
            r8 = 0
            goto L_0x02c7
        L_0x02a8:
            boolean r6 = r12.c
            if (r6 != 0) goto L_0x02ad
            goto L_0x02b2
        L_0x02ad:
            r12.c()
            r12.c = r9
        L_0x02b2:
            aucj r6 = r12.b
            nya r6 = (defpackage.nya) r6
            int r7 = r6.a
            r7 = r7 | 32
            r6.a = r7
            r6.i = r9
            nsb r0 = r0.c
            nxt r6 = defpackage.nxt.REDUCED_MESSAGE_PRIORITY
            r0.a(r12, r6)
            goto L_0x02c7
        L_0x02c6:
            r8 = 0
        L_0x02c7:
            if (r8 == 0) goto L_0x02f7
            r0 = 5
            java.lang.Object r0 = r3.c(r0)
            aucd r0 = (defpackage.aucd) r0
            r0.a((defpackage.aucj) r3)
            amnb r0 = (defpackage.amnb) r0
            boolean r3 = r0.c
            if (r3 != 0) goto L_0x02da
            goto L_0x02df
        L_0x02da:
            r0.c()
            r0.c = r9
        L_0x02df:
            aucj r3 = r0.b
            amnc r3 = (defpackage.amnc) r3
            amnc r6 = defpackage.amnc.r
            int r6 = r3.a
            r7 = 134217728(0x8000000, float:3.85186E-34)
            r6 = r6 | r7
            r3.a = r6
            r6 = 17
            r3.q = r6
            aucj r0 = r0.i()
            r3 = r0
            amnc r3 = (defpackage.amnc) r3
        L_0x02f7:
            if (r8 != 0) goto L_0x02fd
            int r0 = r3.q
            if (r0 >= r10) goto L_0x0328
        L_0x02fd:
            boolean r0 = defpackage.nrj.d()
            if (r0 == 0) goto L_0x0328
            android.content.Context r0 = r2.a
            boolean r0 = defpackage.ntu.b((android.content.Context) r0)
            if (r0 == 0) goto L_0x0328
            nuh r0 = r2.i
            boolean r0 = r0.a((defpackage.amnc) r3)
            if (r0 != 0) goto L_0x0314
            goto L_0x0328
        L_0x0314:
            if (r8 == 0) goto L_0x0321
            hph r0 = r2.l
            java.lang.String r2 = "USAGE_QUOTA_PRIORITY_REDUCED_AND_WRITTEN_TO_DOZE_QUEUE"
            hox r0 = r0.c(r2)
            r0.a()
        L_0x0321:
            r2 = 0
            acwa r0 = defpackage.acws.a((java.lang.Object) r2)
            goto L_0x032d
        L_0x0328:
            acwa r0 = r2.a((defpackage.amnc) r3, (long) r4, (boolean) r9)
        L_0x032d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nrc.a():acwa");
    }
}
