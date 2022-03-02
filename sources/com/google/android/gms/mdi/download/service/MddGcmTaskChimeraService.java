package com.google.android.gms.mdi.download.service;

import android.content.Context;
import android.content.SharedPreferences;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class MddGcmTaskChimeraService extends qwf {
    private static boolean a = false;

    private static void a(qwq qwq, SharedPreferences sharedPreferences, String str, long j, int i) {
        boolean z;
        if (j > 0) {
            if (sharedPreferences.getLong(str, 0) != j) {
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putLong(str, j);
                edit.apply();
                z = true;
            } else {
                z = false;
            }
            if (!axsv.a.a().o() || z || !a) {
                qxi qxi = new qxi();
                qxi.k = str;
                double d = (double) j;
                Double.isNaN(d);
                qxi.a(j, (long) (d * 0.1d), qxr.a);
                qxi.a(i);
                qxi.a(1, 1);
                qxi.a(true);
                qxi.b(z);
                qxi.n = true;
                qxi.i = "com.google.android.gms.mdi.download.service.MddGcmTaskService";
                qwq.a((qxx) qxi.b());
                return;
            }
            return;
        }
        qwq.a(str, "com.google.android.gms.mdi.download.service.MddGcmTaskService");
    }

    public static void b() {
        ihs b = ihs.b();
        qwq a2 = qwq.a((Context) b);
        SharedPreferences sharedPreferences = b.getSharedPreferences("gms_icing_mdd_gcm_task_periods", 0);
        a(a2, sharedPreferences, "MDD.MAINTENANCE.PERIODIC.GCM.TASK", axtf.a.a().c(), 2);
        if (axsv.f()) {
            SharedPreferences sharedPreferences2 = sharedPreferences;
            a(a2, sharedPreferences2, "MDD.CHARGING.PERIODIC.TASK", axtf.a.a().b(), 2);
            a(a2, sharedPreferences2, "MDD.CELLULAR.CHARGING.PERIODIC.TASK", axtf.a.a().a(), 0);
            a(a2, sharedPreferences2, "MDD.WIFI.CHARGING.PERIODIC.TASK", axtf.a.a().d(), 1);
        } else if (axsv.d()) {
            a2.a("MDD.CHARGING.PERIODIC.TASK", "com.google.android.gms.mdi.download.service.MddGcmTaskService");
            a2.a("MDD.CELLULAR.CHARGING.PERIODIC.TASK", "com.google.android.gms.mdi.download.service.MddGcmTaskService");
            a2.a("MDD.WIFI.CHARGING.PERIODIC.TASK", "com.google.android.gms.mdi.download.service.MddGcmTaskService");
        }
        a = true;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int a(defpackage.qxz r14) {
        /*
            r13 = this;
            java.lang.String r0 = r14.a
            int r1 = r0.hashCode()
            java.lang.String r2 = "MDD.WIFI.CHARGING.PERIODIC.TASK"
            java.lang.String r3 = "MDD.CHARGING.PERIODIC.TASK"
            java.lang.String r4 = "MDD.CELLULAR.CHARGING.PERIODIC.TASK"
            java.lang.String r5 = "MDD.MAINTENANCE.PERIODIC.GCM.TASK"
            r6 = -1
            r7 = 0
            r8 = 3
            r9 = 2
            r10 = 1
            switch(r1) {
                case -2105562759: goto L_0x002f;
                case -1202768674: goto L_0x0027;
                case -69128772: goto L_0x001f;
                case 437964371: goto L_0x0017;
                default: goto L_0x0016;
            }
        L_0x0016:
            goto L_0x0037
        L_0x0017:
            boolean r1 = r0.equals(r2)
            if (r1 == 0) goto L_0x0037
            r1 = 3
            goto L_0x0038
        L_0x001f:
            boolean r1 = r0.equals(r3)
            if (r1 == 0) goto L_0x0037
            r1 = 1
            goto L_0x0038
        L_0x0027:
            boolean r1 = r0.equals(r4)
            if (r1 == 0) goto L_0x0037
            r1 = 2
            goto L_0x0038
        L_0x002f:
            boolean r1 = r0.equals(r5)
            if (r1 == 0) goto L_0x0037
            r1 = 0
            goto L_0x0038
        L_0x0037:
            r1 = -1
        L_0x0038:
            if (r1 == 0) goto L_0x004a
            if (r1 == r10) goto L_0x004a
            if (r1 == r9) goto L_0x004a
            if (r1 == r8) goto L_0x004a
            java.lang.String r14 = "%s: MddGcmTaskChimeraService gets unexpected gcm task %s -- Ignored"
            java.lang.String r1 = "MddGcmTaskChimeraService"
            defpackage.afsh.a((java.lang.String) r14, (java.lang.Object) r1, (java.lang.Object) r0)
            goto L_0x0112
        L_0x004a:
            ihs r0 = defpackage.ihs.b()
            iby r1 = defpackage.rxu.b(r0)
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.lang.String r14 = r14.a
            int r12 = r14.hashCode()
            switch(r12) {
                case -2105562759: goto L_0x0079;
                case -1202768674: goto L_0x0071;
                case -69128772: goto L_0x0069;
                case 437964371: goto L_0x0061;
                default: goto L_0x0060;
            }
        L_0x0060:
            goto L_0x0081
        L_0x0061:
            boolean r14 = r14.equals(r2)
            if (r14 == 0) goto L_0x0081
            r6 = 3
            goto L_0x0082
        L_0x0069:
            boolean r14 = r14.equals(r3)
            if (r14 == 0) goto L_0x0081
            r6 = 1
            goto L_0x0082
        L_0x0071:
            boolean r14 = r14.equals(r4)
            if (r14 == 0) goto L_0x0081
            r6 = 2
            goto L_0x0082
        L_0x0079:
            boolean r14 = r14.equals(r5)
            if (r14 == 0) goto L_0x0081
            r6 = 0
            goto L_0x0082
        L_0x0081:
        L_0x0082:
            if (r6 == 0) goto L_0x00d4
            if (r6 == r10) goto L_0x00b5
            if (r6 == r9) goto L_0x00a0
            if (r6 == r8) goto L_0x008b
            goto L_0x00ef
        L_0x008b:
            boolean r14 = defpackage.axsv.f()
            if (r14 == 0) goto L_0x00ef
            acwa r14 = r1.h()
            r11.add(r14)
            acwa r14 = r1.a((boolean) r10)
            r11.add(r14)
            goto L_0x00ef
        L_0x00a0:
            boolean r14 = defpackage.axsv.f()
            if (r14 == 0) goto L_0x00ef
            acwa r14 = r1.h()
            r11.add(r14)
            acwa r14 = r1.a((boolean) r7)
            r11.add(r14)
            goto L_0x00ef
        L_0x00b5:
            boolean r14 = defpackage.axsv.f()
            if (r14 == 0) goto L_0x00ef
            scd r14 = new scd
            afsu r2 = new afsu
            r2.<init>(r0)
            int r3 = defpackage.sce.a(r0)
            r14.<init>(r0, r2, r3)
            defpackage.sby.a((android.content.Context) r0, (defpackage.afsb) r14)
            acwa r14 = r1.i()
            r11.add(r14)
            goto L_0x00ef
        L_0x00d4:
            boolean r14 = defpackage.axsv.f()
            if (r14 == 0) goto L_0x00e2
            acwa r14 = r1.j()
            r11.add(r14)
            goto L_0x00ef
        L_0x00e2:
            boolean r14 = defpackage.axsv.d()
            if (r14 == 0) goto L_0x00ef
            acwa r14 = r1.k()
            r11.add(r14)
        L_0x00ef:
            acwa r14 = defpackage.acws.a((java.util.Collection) r11)     // Catch:{ ExecutionException -> 0x00f9, InterruptedException -> 0x00f7 }
            defpackage.acws.a((defpackage.acwa) r14)     // Catch:{ ExecutionException -> 0x00f9, InterruptedException -> 0x00f7 }
            goto L_0x0112
        L_0x00f7:
            r14 = move-exception
            goto L_0x00fa
        L_0x00f9:
            r14 = move-exception
        L_0x00fa:
            java.lang.String r1 = "Exception while waiting for mdd tasks to complete"
            defpackage.afsh.a((java.lang.Throwable) r14, (java.lang.String) r1)
            scd r14 = new scd
            afsu r1 = new afsu
            r1.<init>(r0)
            int r2 = defpackage.sce.a(r0)
            r14.<init>(r0, r1, r2)
            r0 = 1044(0x414, float:1.463E-42)
            r14.b(r0)
        L_0x0112:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.mdi.download.service.MddGcmTaskChimeraService.a(qxz):int");
    }
}
