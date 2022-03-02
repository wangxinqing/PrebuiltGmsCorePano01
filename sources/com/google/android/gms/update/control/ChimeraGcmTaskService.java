package com.google.android.gms.update.control;

import android.content.Context;
import android.content.Intent;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ChimeraGcmTaskService extends qwf {
    public static final iwd a = adnt.d("ChimeraGcmTaskService");

    public static void a(Context context) {
        a.c("Scheduling task: DeviceIdle.", new Object[0]);
        qxf qxf = new qxf();
        qxf.i = "com.google.android.gms.update.SystemUpdateGcmTaskService";
        qxf.k = "DeviceIdle";
        qxf.a(0, TimeUnit.DAYS.toSeconds(365));
        qxf.n = false;
        qxf.a(2);
        qxf.a(0, 0);
        qxf.a(true);
        qxf.b(1);
        qwq.a(context).a((qxx) qxf.b());
    }

    public static void b(Context context) {
        qwq.a(context).a("DeviceIdle", "com.google.android.gms.update.SystemUpdateGcmTaskService");
    }

    public static void c(Context context) {
        a.c("Scheduling task: DeviceCharging.", new Object[0]);
        qxf qxf = new qxf();
        qxf.i = "com.google.android.gms.update.SystemUpdateGcmTaskService";
        qxf.k = "DeviceCharging";
        qxf.a(0, TimeUnit.DAYS.toSeconds(365));
        qxf.n = false;
        qxf.a(2);
        qxf.a(1, 1);
        qxf.b(1);
        qwq.a(context).a((qxx) qxf.b());
    }

    public static void d(Context context) {
        qwq.a(context).a("DeviceCharging", "com.google.android.gms.update.SystemUpdateGcmTaskService");
    }

    public static void e(Context context) {
        a.c("Scheduling task: WifiConnected.", new Object[0]);
        qxf qxf = new qxf();
        qxf.i = "com.google.android.gms.update.SystemUpdateGcmTaskService";
        qxf.k = "WifiConnected";
        qxf.a(0, TimeUnit.DAYS.toSeconds(365));
        qxf.n = false;
        qxf.a(1);
        qxf.a(0, 0);
        qxf.b(1);
        qwq.a(context).a((qxx) qxf.b());
    }

    public static void f(Context context) {
        qwq.a(context).a("WifiConnected", "com.google.android.gms.update.SystemUpdateGcmTaskService");
    }

    public final int a(qxz qxz) {
        String str = qxz.a;
        a.c("Task started with tag: %s.", qxz.a);
        if ("WifiNeededRetry".equals(str)) {
            adjl.a(this, new Intent());
        } else if ("DeviceIdle".equals(str)) {
            adkt adkt = (adkt) adkt.e.b();
            if (((Boolean) adkt.g.b(adkt.b)).booleanValue()) {
                a(adkt.f);
                if (!adjw.b()) {
                    ((adkv) adkv.b.b()).a(5);
                }
            }
        } else if ("DeviceCharging".equals(str)) {
            adkm adkm = (adkm) adkm.c.b();
            if (((Boolean) adkm.e.b(adkm.b)).booleanValue()) {
                c(adkm.d);
                ((adkv) adkv.b.b()).a(4);
            }
        } else if ("WifiConnected".equals(str)) {
            adle adle = (adle) adle.c.b();
            if (((Boolean) adle.e.b(adle.b)).booleanValue()) {
                e(adle.d);
                ((adkv) adkv.b.b()).a(3);
            }
        } else if ("LogStatus".equals(str)) {
            adlc adlc = (adlc) adlc.a.b();
            adlc.c();
            adlc.a();
        } else if ("CheckConfigUpdate".equals(str)) {
            ((adla) adla.h.b()).f();
        } else if ("LogHeartBeat".equals(str)) {
            adlc adlc2 = (adlc) adlc.a.b();
            adns adns = adlc2.b;
            adns.a((anqb) adns.a(9).i());
            if (adlc.e()) {
                adlc2.b();
                adlc2.a(true);
            } else {
                adlc2.a(false);
            }
        }
        return 0;
    }
}
