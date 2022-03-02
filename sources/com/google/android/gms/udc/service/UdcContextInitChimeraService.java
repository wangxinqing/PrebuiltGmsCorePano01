package com.google.android.gms.udc.service;

import android.content.Context;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class UdcContextInitChimeraService extends qwf {
    private static final anij a = addh.b();

    public static void a(Context context) {
        a.d().a("com.google.android.gms.udc.service.UdcContextInitChimeraService", "a", 312, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)").a("Scheduling context registration change job.");
        qxf qxf = new qxf();
        qxf.i = "com.google.android.gms.udc.service.UdcContextInitService";
        qxf.k = "UdcContextRegistrationOneOff";
        qxf.n = true;
        qxf.a(2);
        qxf.a(0, axcc.b() ? 1 : 0);
        qxf.a(azrk.a.a().f(), azrk.a.a().e());
        qxk qxk = new qxk();
        qxk.b = 30;
        qxk.c = (int) TimeUnit.HOURS.toSeconds(18);
        qxk.a = 0;
        qxf.r = qxk.a();
        qxf.b(1);
        qwq.a(context).a((qxx) qxf.b());
        qxi qxi = new qxi();
        qxi.i = "com.google.android.gms.udc.service.UdcContextInitService";
        qxi.k = "UdcContextRegistrationPeriodic";
        qxi.n = true;
        qxi.a(2);
        qxi.a(0, axcc.b() ? 1 : 0);
        qxi.a = azrk.a.a().d();
        qxi.b = TimeUnit.HOURS.toSeconds(1);
        qxk qxk2 = new qxk();
        qxk2.b = 30;
        qxk2.c = (int) TimeUnit.HOURS.toSeconds(18);
        qxk2.a = 0;
        qxi.r = qxk2.a();
        qxi.b(1);
        qwq.a(context).a((qxx) qxi.b());
    }

    public static boolean b(Context context) {
        return context.getSharedPreferences("UdcCtxMgrPrefs", 0).getBoolean("UdcCtxMgrPrefsReg", false);
    }

    private static final boolean c(String str) {
        return "UdcSyncOneOff".equals(str) || "UdcSyncPeriodic".equals(str) || "UdcTestSync".equals(str);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0053 A[SYNTHETIC, Splitter:B:10:0x0053] */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0079 A[Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x009f }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean a(android.content.Context r9, android.accounts.Account r10, boolean r11) {
        /*
            r8 = this;
            java.lang.String r0 = "com.google.android.gms.udc.intentoperation.UdcContextListenerIntentOperation"
            java.lang.String r1 = "com.google.android.gms.udc.CONTEXT_CHANGED"
            android.content.Intent r0 = com.google.android.chimera.IntentOperation.getStartIntent((android.content.Context) r9, (java.lang.String) r0, (java.lang.String) r1)
            java.lang.String r1 = r10.name
            java.lang.String r2 = "UdcAccountName"
            r0.putExtra(r2, r1)
            jtm r1 = new jtm
            r1.<init>()
            r2 = 10002(0x2712, float:1.4016E-41)
            r1.a((int) r2)
            jtn r1 = r1.a()
            java.lang.String r2 = r10.name     // Catch:{ eif -> 0x0035, IOException -> 0x0033 }
            java.lang.String r2 = defpackage.eim.f(r9, r2)     // Catch:{ eif -> 0x0035, IOException -> 0x0033 }
            java.lang.String r2 = defpackage.adhi.c(r9, r2)     // Catch:{ eif -> 0x0035, IOException -> 0x0033 }
            boolean r3 = defpackage.jlh.d(r2)     // Catch:{ eif -> 0x0035, IOException -> 0x0033 }
            if (r3 == 0) goto L_0x002e
            goto L_0x0036
        L_0x002e:
            int r2 = r2.hashCode()     // Catch:{ eif -> 0x0035, IOException -> 0x0033 }
            goto L_0x003a
        L_0x0033:
            r2 = move-exception
            goto L_0x0036
        L_0x0035:
            r2 = move-exception
        L_0x0036:
            int r2 = r10.hashCode()
        L_0x003a:
            r3 = 0
            android.app.PendingIntent r0 = android.app.PendingIntent.getService(r9, r2, r0, r3)
            java.lang.String r2 = "com.google.android.gms.udc"
            grb r2 = defpackage.grb.a(r2, r10)
            iby r9 = defpackage.gra.c(r9, r2)
            java.lang.String r2 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)"
            java.lang.String r4 = "a"
            java.lang.String r5 = "com.google.android.gms.udc.service.UdcContextInitChimeraService"
            r6 = 1
            if (r11 == 0) goto L_0x0079
            anij r11 = a     // Catch:{ ExecutionException -> 0x00a3, TimeoutException -> 0x00a1, InterruptedException -> 0x009f }
            anie r11 = r11.d()     // Catch:{ ExecutionException -> 0x00a3, TimeoutException -> 0x00a1, InterruptedException -> 0x009f }
            r7 = 287(0x11f, float:4.02E-43)
            anie r11 = r11.a((java.lang.String) r5, (java.lang.String) r4, (int) r7, (java.lang.String) r2)     // Catch:{ ExecutionException -> 0x00a3, TimeoutException -> 0x00a1, InterruptedException -> 0x009f }
            java.lang.String r7 = "Registering with contextmanager"
            r11.a((java.lang.String) r7)     // Catch:{ ExecutionException -> 0x00a3, TimeoutException -> 0x00a1, InterruptedException -> 0x009f }
            icc r9 = r9.j     // Catch:{ ExecutionException -> 0x00a3, TimeoutException -> 0x00a1, InterruptedException -> 0x009f }
            icf r9 = defpackage.juc.a((defpackage.icc) r9, (defpackage.jtn) r1, (android.app.PendingIntent) r0)     // Catch:{ ExecutionException -> 0x00a3, TimeoutException -> 0x00a1, InterruptedException -> 0x009f }
            acwa r9 = defpackage.iux.a(r9)     // Catch:{ ExecutionException -> 0x00a3, TimeoutException -> 0x00a1, InterruptedException -> 0x009f }
            long r0 = defpackage.azrk.c()     // Catch:{ ExecutionException -> 0x00a3, TimeoutException -> 0x00a1, InterruptedException -> 0x009f }
            java.util.concurrent.TimeUnit r11 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ ExecutionException -> 0x00a3, TimeoutException -> 0x00a1, InterruptedException -> 0x009f }
            defpackage.acws.a(r9, r0, r11)     // Catch:{ ExecutionException -> 0x00a3, TimeoutException -> 0x00a1, InterruptedException -> 0x009f }
            r3 = 1
            goto L_0x00b8
        L_0x0079:
            anij r11 = a     // Catch:{ ExecutionException -> 0x00a3, TimeoutException -> 0x00a1, InterruptedException -> 0x009f }
            anie r11 = r11.d()     // Catch:{ ExecutionException -> 0x00a3, TimeoutException -> 0x00a1, InterruptedException -> 0x009f }
            r1 = 293(0x125, float:4.1E-43)
            anie r11 = r11.a((java.lang.String) r5, (java.lang.String) r4, (int) r1, (java.lang.String) r2)     // Catch:{ ExecutionException -> 0x00a3, TimeoutException -> 0x00a1, InterruptedException -> 0x009f }
            java.lang.String r1 = "Unregistering with contextmanager"
            r11.a((java.lang.String) r1)     // Catch:{ ExecutionException -> 0x00a3, TimeoutException -> 0x00a1, InterruptedException -> 0x009f }
            icc r9 = r9.j     // Catch:{ ExecutionException -> 0x00a3, TimeoutException -> 0x00a1, InterruptedException -> 0x009f }
            icf r9 = defpackage.juc.a((defpackage.icc) r9, (android.app.PendingIntent) r0)     // Catch:{ ExecutionException -> 0x00a3, TimeoutException -> 0x00a1, InterruptedException -> 0x009f }
            acwa r9 = defpackage.iux.a(r9)     // Catch:{ ExecutionException -> 0x00a3, TimeoutException -> 0x00a1, InterruptedException -> 0x009f }
            long r0 = defpackage.azrk.c()     // Catch:{ ExecutionException -> 0x00a3, TimeoutException -> 0x00a1, InterruptedException -> 0x009f }
            java.util.concurrent.TimeUnit r11 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ ExecutionException -> 0x00a3, TimeoutException -> 0x00a1, InterruptedException -> 0x009f }
            defpackage.acws.a(r9, r0, r11)     // Catch:{ ExecutionException -> 0x00a3, TimeoutException -> 0x00a1, InterruptedException -> 0x009f }
            r3 = 1
            goto L_0x00b8
        L_0x009f:
            r9 = move-exception
            goto L_0x00a4
        L_0x00a1:
            r9 = move-exception
            goto L_0x00a4
        L_0x00a3:
            r9 = move-exception
        L_0x00a4:
            anij r11 = a
            anie r11 = r11.b()
            r11.a((java.lang.Throwable) r9)
            r9 = 302(0x12e, float:4.23E-43)
            anie r9 = r11.a((java.lang.String) r5, (java.lang.String) r4, (int) r9, (java.lang.String) r2)
            java.lang.String r11 = "context manager (un)subscription failed"
            r9.a((java.lang.String) r11)
        L_0x00b8:
            java.lang.String r9 = r10.name
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.udc.service.UdcContextInitChimeraService.a(android.content.Context, android.accounts.Account, boolean):boolean");
    }

    private static final boolean a(String str) {
        return "UdcContextRegistrationOneOff".equals(str) || "UdcContextRegistrationPeriodic".equals(str);
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0113  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int a(defpackage.qxz r9) {
        /*
            r8 = this;
            java.lang.String r0 = r9.a
            boolean r1 = a((java.lang.String) r0)
            r2 = 2
            if (r1 == 0) goto L_0x0010
            boolean r0 = defpackage.azrk.p()
            if (r0 != 0) goto L_0x0016
            goto L_0x0022
        L_0x0010:
            boolean r0 = c(r0)
            if (r0 != 0) goto L_0x0022
        L_0x0016:
            qwq r0 = defpackage.qwq.a((android.content.Context) r8)
            java.lang.String r9 = r9.a
            java.lang.String r1 = "com.google.android.gms.udc.service.UdcContextInitService"
            r0.a((java.lang.String) r9, (java.lang.String) r1)
            return r2
        L_0x0022:
            boolean r0 = defpackage.azrk.p()
            r1 = 1
            r3 = 0
            if (r0 != 0) goto L_0x0035
            java.lang.String r0 = r9.a
            boolean r0 = a((java.lang.String) r0)
            if (r0 == 0) goto L_0x0033
            goto L_0x0035
        L_0x0033:
            r1 = 0
            goto L_0x0089
        L_0x0035:
            android.content.Context r0 = r8.getApplicationContext()
            boolean r4 = defpackage.azrk.b()
            if (r4 == 0) goto L_0x0047
            boolean r4 = defpackage.azrk.p()
            if (r4 != 0) goto L_0x0047
            r4 = 1
            goto L_0x0048
        L_0x0047:
            r4 = 0
        L_0x0048:
            if (r4 == 0) goto L_0x004b
            goto L_0x0052
        L_0x004b:
            boolean r4 = b(r0)
            if (r4 == 0) goto L_0x0033
            r4 = 0
        L_0x0052:
            java.lang.String r5 = "com.google.android.gms"
            java.util.List r5 = defpackage.jgu.d(r0, r5)
            java.util.Iterator r5 = r5.iterator()
            r6 = 0
        L_0x005e:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L_0x0071
            java.lang.Object r7 = r5.next()
            android.accounts.Account r7 = (android.accounts.Account) r7
            boolean r7 = r8.a(r0, r7, r4)
            r7 = r7 ^ r1
            r6 = r6 | r7
            goto L_0x005e
        L_0x0071:
            if (r6 != 0) goto L_0x0088
            java.lang.String r1 = "UdcCtxMgrPrefs"
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r1, r3)
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r1 = "UdcCtxMgrPrefsReg"
            android.content.SharedPreferences$Editor r0 = r0.putBoolean(r1, r4)
            r0.commit()
            r1 = 0
            goto L_0x0089
        L_0x0088:
        L_0x0089:
            boolean r0 = defpackage.azrk.o()
            if (r0 == 0) goto L_0x0113
            addx r0 = defpackage.addx.a(r8)
            rbo r0 = r0.a
            if (r0 != 0) goto L_0x0099
            goto L_0x0113
        L_0x0099:
            java.lang.String r3 = r9.a
            java.lang.String r4 = "UdcTestSync"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x00aa
            aczd r9 = defpackage.aczd.SYNC_ID_CUSTOM_CACHE
            afuk r9 = defpackage.afuk.a(r9, r2)
            goto L_0x00b0
        L_0x00aa:
            java.lang.String r9 = r9.a
            afuk r9 = r0.a(r9)
        L_0x00b0:
            auco r0 = r9.a()
            aczd r2 = defpackage.aczd.SYNC_ID_CUSTOM_CACHE
            if (r0 != r2) goto L_0x0112
            int r0 = r9.b()
            r1 = 3
            if (r0 != r1) goto L_0x00c2
            adeu r0 = defpackage.adeu.PERIODIC
            goto L_0x00c4
        L_0x00c2:
            adeu r0 = defpackage.adeu.TRIGGERED_BY_EVENT
        L_0x00c4:
            raw r1 = defpackage.addx.g(r8)
            boolean r2 = defpackage.azrk.h()
            if (r2 == 0) goto L_0x00ee
            auco r2 = r9.a()
            aczd r2 = (defpackage.aczd) r2
            adev r3 = defpackage.adev.a((android.content.Context) r8)
            adet r0 = r3.b(r0)
            int r9 = r9.b()
            java.util.concurrent.Executor r3 = defpackage.addx.f(r8)
            afud r9 = r1.a(r2, r0, r9, r3)
            int r1 = r1.a(r9)
            goto L_0x0176
        L_0x00ee:
            auco r2 = r9.a()
            aczd r2 = (defpackage.aczd) r2
            rbj r1 = r1.g(r2)
            addn r2 = new addn
            r2.<init>(r8, r0)
            int r0 = r9.b()
            java.util.concurrent.Executor r3 = defpackage.addx.f(r8)
            aorr r0 = r1.a(r2, r0, r3)
            int r9 = r9.b()
            int r1 = r1.a(r0, r9)
            goto L_0x0176
        L_0x0112:
            goto L_0x0176
        L_0x0113:
            java.lang.String r0 = r9.a
            boolean r0 = c(r0)
            if (r0 == 0) goto L_0x0175
            java.lang.String r0 = r9.a
            java.lang.String r1 = "UdcSyncPeriodic"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0128
            adeu r0 = defpackage.adeu.TRIGGERED_BY_EVENT
            goto L_0x012a
        L_0x0128:
            adeu r0 = defpackage.adeu.PERIODIC
        L_0x012a:
            raw r1 = defpackage.addx.g(r8)
            boolean r2 = defpackage.azrk.h()
            if (r2 == 0) goto L_0x0157
            aczd r2 = defpackage.aczd.SYNC_ID_CUSTOM_CACHE
            rav r2 = r1.b(r2)
            java.lang.String r9 = r9.a
            int r9 = r2.a(r9)
            aczd r2 = defpackage.aczd.SYNC_ID_CUSTOM_CACHE
            adev r3 = defpackage.adev.a((android.content.Context) r8)
            adet r0 = r3.b(r0)
            java.util.concurrent.Executor r3 = defpackage.addx.f(r8)
            afud r9 = r1.a(r2, r0, r9, r3)
            int r1 = r1.a(r9)
            goto L_0x0176
        L_0x0157:
            aczd r2 = defpackage.aczd.SYNC_ID_CUSTOM_CACHE
            rbj r1 = r1.g(r2)
            java.lang.String r9 = r9.a
            int r9 = r1.a(r9)
            addo r2 = new addo
            r2.<init>(r8, r0)
            java.util.concurrent.Executor r0 = defpackage.addx.f(r8)
            aorr r0 = r1.a(r2, r9, r0)
            int r1 = r1.a(r0, r9)
            goto L_0x0176
        L_0x0175:
        L_0x0176:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.udc.service.UdcContextInitChimeraService.a(qxz):int");
    }
}
