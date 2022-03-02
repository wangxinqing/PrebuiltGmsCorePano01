package com.google.android.gms.instantapps.routing;

import android.content.Context;
import android.content.Intent;
import java.util.concurrent.Executor;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class DomainFilterUpdateChimeraService extends qwf {
    private static final qfn g = new qfn("DomainFilterUpdateChimeraService");
    qjt a;
    qlg b;
    qld c;
    qkv d;
    qex e;
    private Executor h;

    private static final int a(int i, String str, qev qev, String str2) {
        if (i == 1) {
            qev.a(str2.length() == 0 ? new String("DomainFilterUpdateService.OK") : "DomainFilterUpdateService.OK".concat(str2));
            return 0;
        } else if (i != 2) {
            if (i == 3) {
                qev.a(str2.length() == 0 ? new String("DomainFilterUpdateService.NonRetriable") : "DomainFilterUpdateService.NonRetriable".concat(str2));
                return 0;
            } else if (i != 4) {
                g.b("Unexpected DomainFilterUpdateStatus: %d", Integer.valueOf(i));
                qev.a(str2.length() == 0 ? new String("DomainFilterUpdateService.Failure") : "DomainFilterUpdateService.Failure".concat(str2));
                return 2;
            } else {
                qev.a(str2.length() == 0 ? new String("DomainFilterUpdateService.Throttled") : "DomainFilterUpdateService.Throttled".concat(str2));
                return 0;
            }
        } else if (axuj.a.a().b() || (axuj.a.a().c() && "instantapps.DomainFilterUpdateService.frequentChargingUnmetered".equals(str))) {
            g.c("Will not retry", new Object[0]);
            qev.a(str2.length() == 0 ? new String("DomainFilterUpdateService.WillNotReschedule") : "DomainFilterUpdateService.WillNotReschedule".concat(str2));
            return 2;
        } else {
            g.c("Retry later", new Object[0]);
            qev.a(str2.length() == 0 ? new String("DomainFilterUpdateService.Reschedule") : "DomainFilterUpdateService.Reschedule".concat(str2));
            return 1;
        }
    }

    private final int b(avwm avwm) {
        if (axuy.a.a().l()) {
            return this.a.b(avwm);
        }
        return this.a.a(avwm);
    }

    public static void c() {
        qxi qxi = new qxi();
        qxi.i = "com.google.android.gms.instantapps.routing.DomainFilterUpdateService";
        qxi.k = "instantapps.DomainFilterUpdateService";
        qxi.a = axuy.b() / 1000;
        qxi.a(0, 0);
        qxi.a(0);
        qxi.n = true;
        long b2 = axuy.b() / 1000;
        if (axcc.f()) {
            qxi.a(qxe.a(b2));
        } else {
            qxi.a = b2;
        }
        qwq.a((Context) ihs.b()).a((qxx) qxi.b());
        qxi qxi2 = new qxi();
        qxi2.i = "com.google.android.gms.instantapps.routing.DomainFilterUpdateService";
        qxi2.k = "instantapps.DomainFilterUpdateService.frequentChargingUnmetered";
        qxi2.a(1);
        qxi2.a(1, 1);
        qxi2.n = true;
        long o = axuy.a.a().o() / 1000;
        if (axcc.f()) {
            qxi2.a(qxe.a(o));
        } else {
            qxi2.a = o;
        }
        qwq.a((Context) ihs.b()).a((qxx) qxi2.b());
        if (axuy.a.a().s()) {
            qwq a2 = qwq.a((Context) ihs.b());
            qxi qxi3 = new qxi();
            qxi3.i = "com.google.android.gms.instantapps.routing.DomainFilterUpdateService";
            qxi3.k = "instantapps.DomainFilterUpdateService.fullSync";
            qxi3.a = axuy.a.a().n();
            qxi3.a(0, 0);
            qxi3.a(0);
            qxi3.n = true;
            a2.a((qxx) qxi3.b());
        }
    }

    public final void aH() {
        c();
    }

    public final void onCreate() {
        super.onCreate();
        qfq a2 = qfq.a(getApplicationContext());
        this.a = a2.g;
        this.b = a2.d;
        this.c = a2.r;
        this.d = a2.s;
        this.h = a2.a;
        this.e = a2.k;
        int i = qko.a;
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        if (intent == null || !"com.google.android.gms.instantapps.ACTION_UPDATE_DOMAIN_FILTER".equals(intent.getAction())) {
            return super.onStartCommand(intent, i, i2);
        }
        this.h.execute(new qjx(this, intent));
        return 2;
    }

    public static void b() {
        qwq a2 = qwq.a((Context) ihs.b());
        a2.a("instantapps.DomainFilterUpdateService", "com.google.android.gms.instantapps.routing.DomainFilterUpdateService");
        a2.a("instantapps.DomainFilterUpdateService.frequentChargingUnmetered", "com.google.android.gms.instantapps.routing.DomainFilterUpdateService");
        a2.a("instantapps.DomainFilterUpdateService.fullSync", "com.google.android.gms.instantapps.routing.DomainFilterUpdateService");
        c();
    }

    public static String a(int i) {
        if (axuv.b()) {
            return "instantapps.DomainFilterUpdateService.oneOff";
        }
        StringBuilder sb = new StringBuilder(55);
        sb.append("instantapps.DomainFilterUpdateService.oneOff");
        sb.append(i);
        return sb.toString();
    }

    public static void a(Context context) {
        Intent intent = new Intent("com.google.android.gms.instantapps.ACTION_UPDATE_DOMAIN_FILTER");
        intent.setClassName(context.getPackageName(), "com.google.android.gms.instantapps.routing.DomainFilterUpdateService");
        intent.putExtra("domain_filter_request_type", avwm.ONE_OFF_SYNC_AT_BOOT_COMPLETE.a());
        context.startService(intent);
    }

    public static void a(avwm avwm) {
        qwq a2 = qwq.a((Context) ihs.b());
        qxf qxf = new qxf();
        qxf.i = "com.google.android.gms.instantapps.routing.DomainFilterUpdateService";
        qxf.k = a(avwm.a());
        qxf.a(0, 0);
        qxf.a(0);
        qxf.a(15, 120);
        qxf.b(1);
        a2.a((qxx) qxf.b());
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int a(defpackage.qxz r10) {
        /*
            r9 = this;
            java.lang.String r0 = "ONE_OFF task tag with invalid request type number is used. tag: %s"
            qex r1 = r9.e
            qev r1 = r1.a()
            qld r2 = r9.c
            boolean r2 = r2.a()
            r3 = 0
            if (r2 == 0) goto L_0x0142
            java.lang.String r10 = r10.a
            java.lang.String r2 = "instantapps.ScheduleGetIntentFilters"
            boolean r4 = r10.startsWith(r2)
            r5 = 1
            if (r4 != 0) goto L_0x011e
            qkv r2 = r9.d
            qlc r4 = r2.d
            android.accounts.Account r4 = r4.c()
            qlg r6 = r2.c
            int r6 = r6.a()
            r2.a((android.accounts.Account) r4, (int) r6, (boolean) r3)
            qlg r2 = r9.b
            int r2 = r2.a()
            if (r2 == 0) goto L_0x0117
            java.lang.String r2 = "instantapps.DomainFilterUpdateService.oneOff"
            boolean r4 = r10.startsWith(r2)
            if (r4 == 0) goto L_0x003f
            r4 = r2
            goto L_0x0040
        L_0x003f:
            r4 = r10
        L_0x0040:
            int r6 = r4.hashCode()
            r7 = 3
            r8 = 2
            switch(r6) {
                case -1766957981: goto L_0x0066;
                case 1487110658: goto L_0x005e;
                case 1825138455: goto L_0x0054;
                case 1825649461: goto L_0x004a;
                default: goto L_0x0049;
            }
        L_0x0049:
            goto L_0x0070
        L_0x004a:
            java.lang.String r2 = "instantapps.DomainFilterUpdateService"
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L_0x0070
            r2 = 3
            goto L_0x0071
        L_0x0054:
            java.lang.String r2 = "instantapps.DomainFilterUpdateService.frequentChargingUnmetered"
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L_0x0070
            r2 = 1
            goto L_0x0071
        L_0x005e:
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L_0x0070
            r2 = 0
            goto L_0x0071
        L_0x0066:
            java.lang.String r2 = "instantapps.DomainFilterUpdateService.fullSync"
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L_0x0070
            r2 = 2
            goto L_0x0071
        L_0x0070:
            r2 = -1
        L_0x0071:
            if (r2 == 0) goto L_0x00a1
            if (r2 == r5) goto L_0x009a
            if (r2 == r8) goto L_0x0092
            if (r2 == r7) goto L_0x0088
            int r0 = defpackage.jhg.a
            qfn r0 = g
            java.lang.Object[] r2 = new java.lang.Object[r5]
            r2[r3] = r10
            java.lang.String r4 = "Unexpected DomainFilterUpdateStatus task tag: %s"
            r0.b(r4, r2)
            goto L_0x010f
        L_0x0088:
            qjt r0 = r9.a
            avwm r2 = defpackage.avwm.DAILY_SYNC
            int r3 = r0.b((defpackage.avwm) r2)
            goto L_0x010f
        L_0x0092:
            avwm r0 = defpackage.avwm.PERIODIC_FULL_DOMAIN_FILTER_SYNC
            int r3 = r9.b(r0)
            goto L_0x010f
        L_0x009a:
            avwm r0 = defpackage.avwm.FREQUENT_SYNC
            int r3 = r9.b(r0)
            goto L_0x010f
        L_0x00a1:
            boolean r2 = defpackage.axuv.b()
            if (r2 != 0) goto L_0x00f6
            r2 = 44
            java.lang.String r2 = r10.substring(r2)
            boolean r4 = r2.isEmpty()
            if (r4 == 0) goto L_0x00b6
            ampu r0 = defpackage.ampu.a
            goto L_0x00f8
        L_0x00b6:
            int r2 = java.lang.Integer.parseInt(r2)     // Catch:{ NumberFormatException -> 0x00dc }
            avwm r2 = defpackage.avwm.a(r2)     // Catch:{ NumberFormatException -> 0x00dc }
            if (r2 == 0) goto L_0x00c5
            amri r0 = defpackage.amri.b(r2)     // Catch:{ NumberFormatException -> 0x00dc }
            goto L_0x00f8
        L_0x00c5:
            qfn r1 = g     // Catch:{ NumberFormatException -> 0x00dc }
            java.lang.Object[] r2 = new java.lang.Object[r5]     // Catch:{ NumberFormatException -> 0x00dc }
            r2[r3] = r10     // Catch:{ NumberFormatException -> 0x00dc }
            r1.b(r0, r2)     // Catch:{ NumberFormatException -> 0x00dc }
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ NumberFormatException -> 0x00dc }
            java.lang.Object[] r2 = new java.lang.Object[r5]     // Catch:{ NumberFormatException -> 0x00dc }
            r2[r3] = r10     // Catch:{ NumberFormatException -> 0x00dc }
            java.lang.String r0 = java.lang.String.format(r0, r2)     // Catch:{ NumberFormatException -> 0x00dc }
            r1.<init>(r0)     // Catch:{ NumberFormatException -> 0x00dc }
            throw r1     // Catch:{ NumberFormatException -> 0x00dc }
        L_0x00dc:
            r0 = move-exception
            qfn r1 = g
            java.lang.Object[] r2 = new java.lang.Object[r5]
            r2[r3] = r10
            java.lang.String r4 = "Invalid number format is used to tag ONE_OFF task. tag: %s"
            r1.a(r0, r4, r2)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.Object[] r1 = new java.lang.Object[r5]
            r1[r3] = r10
            java.lang.String r10 = java.lang.String.format(r4, r1)
            r0.<init>(r10)
            throw r0
        L_0x00f6:
            ampu r0 = defpackage.ampu.a
        L_0x00f8:
            boolean r2 = r0.a()
            if (r2 != 0) goto L_0x0105
            avwm r0 = defpackage.avwm.ONE_OFF_SYNC
            int r3 = r9.b(r0)
            goto L_0x010f
        L_0x0105:
            java.lang.Object r0 = r0.b()
            avwm r0 = (defpackage.avwm) r0
            int r3 = r9.b(r0)
        L_0x010f:
            java.lang.String r0 = ""
            int r10 = a(r3, r10, r1, r0)
            return r10
        L_0x0117:
            java.lang.String r10 = "DomainFilterUpdateService.OptedOut"
            r1.a(r10)
            return r3
        L_0x011e:
            qlg r10 = r9.b
            int r10 = r10.a()
            if (r10 != 0) goto L_0x012c
            java.lang.String r10 = "DomainFilterUpdateService.OptedOut.IntentFilter"
            r1.a(r10)
            goto L_0x0141
        L_0x012c:
            qjt r10 = r9.a
            boolean r0 = defpackage.axvw.b()
            if (r0 == 0) goto L_0x0139
            int r5 = r10.a()
            goto L_0x013a
        L_0x0139:
        L_0x013a:
            java.lang.String r10 = ".IntentFilter"
            int r3 = a(r5, r2, r1, r10)
        L_0x0141:
            return r3
        L_0x0142:
            java.lang.String r10 = "DomainFilterUpdateService.SwitchKilled"
            r1.a(r10)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.instantapps.routing.DomainFilterUpdateChimeraService.a(qxz):int");
    }
}
