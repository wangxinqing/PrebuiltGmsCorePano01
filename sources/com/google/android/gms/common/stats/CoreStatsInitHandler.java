package com.google.android.gms.common.stats;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class CoreStatsInitHandler extends hec {
    /* access modifiers changed from: protected */
    public final void a(Intent intent, int i) {
        int i2 = i & 4;
        int i3 = i & 8;
        if ((i & 2) != 0 || i2 != 0 || i3 != 0) {
            if (!(i2 == 0 && i3 == 0)) {
                GmsCoreStatsChimeraService.a((Context) this);
            }
            Intent component = new Intent().setComponent(jcl.a);
            component.setAction("com.google.android.gms.common.stats.START");
            startService(component);
            qwq a = qwq.a((Context) this);
            if (!jkr.c() || !((Boolean) jcd.g.c()).booleanValue()) {
                long longValue = ((Long) jcd.b.c()).longValue();
                if (longValue <= 0) {
                    a.a("NetworkReportService", "com.google.android.gms.common.stats.net.NetworkReportService");
                } else {
                    qxi qxi = new qxi();
                    qxi.i = "com.google.android.gms.common.stats.net.NetworkReportService";
                    qxi.b(2, 2);
                    qxi.a(0, 0);
                    qxi.a(false);
                    qxi.k = "NetworkReportService";
                    qxi.n = true;
                    qxi.b(1);
                    if (axcc.d()) {
                        double h = axbn.h();
                        double d = (double) longValue;
                        Double.isNaN(d);
                        qxi.a(longValue, (long) (h * d), qxr.a);
                    } else {
                        qxi.b = ((Long) jcd.c.c()).longValue();
                        qxi.a = longValue;
                    }
                    a.a((qxx) qxi.b());
                }
            } else {
                long longValue2 = ((Long) jcd.f.c()).longValue();
                if (longValue2 <= 0) {
                    a.a("NetworkReportServicePartialReportsForToday", "com.google.android.gms.common.stats.net.NetworkReportService");
                } else {
                    qxi qxi2 = new qxi();
                    qxi2.i = "com.google.android.gms.common.stats.net.NetworkReportService";
                    qxi2.b(2, 2);
                    qxi2.a(0, 0);
                    qxi2.a(false);
                    qxi2.k = "NetworkReportServicePartialReportsForToday";
                    qxi2.n = true;
                    qxi2.b(1);
                    if (axcc.d()) {
                        double h2 = axbn.h();
                        double d2 = (double) longValue2;
                        Double.isNaN(d2);
                        qxi2.a(longValue2, (long) (h2 * d2), qxr.a);
                    } else {
                        qxi2.a = longValue2;
                    }
                    a.a((qxx) qxi2.b());
                    if (awym.a.a().c()) {
                        qxi qxi3 = new qxi();
                        qxi3.i = "com.google.android.gms.common.stats.net.NetworkReportService";
                        qxi3.b(2, 2);
                        qxi3.a(1, 1);
                        qxi3.a(false);
                        qxi3.k = "NetworkReportServiceYesterdaysReport";
                        qxi3.n = true;
                        qxi3.b(1);
                        if (!axcc.d()) {
                            qxi3.a = 86400;
                        } else {
                            qxi3.a(qxe.EVERY_DAY);
                        }
                        a.a((qxx) qxi3.b());
                    }
                }
                a.a("NetworkReportService", "com.google.android.gms.common.stats.net.NetworkReportService");
            }
            StatsUploadChimeraService.b();
        }
    }
}
