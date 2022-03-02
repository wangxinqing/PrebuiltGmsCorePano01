package defpackage;

import java.util.Random;
import java.util.concurrent.TimeUnit;

/* renamed from: osp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class osp {
    public static final long a = TimeUnit.HOURS.toSeconds(12);
    public static final long b = TimeUnit.HOURS.toSeconds(1);

    public static qxj a(String str, long j, long j2, int i, boolean z) {
        int nextInt = new Random(System.nanoTime()).nextInt((int) Math.min(b, j - j2));
        qxi qxi = new qxi();
        qxi.k = str;
        qxi.a = j;
        qxi.b = j - (j2 + ((long) nextInt));
        qxi.n = true;
        qxi.a(((Boolean) ozx.d.c()).booleanValue());
        qxi.a(i);
        qxi.a(1, 1);
        qxi.i = "com.google.android.gms.icing.service.IcingGcmTaskService";
        qxi.b(z);
        return qxi.b();
    }

    public static void a(qwq qwq, boolean z) {
        long j;
        oso.c("MaintenanceDriver: Registering all GCM Tasks.");
        long longValue = ((Long) ozx.bm.c()).longValue();
        long j2 = a;
        if (axcc.e()) {
            double h = 1.0d - axbn.h();
            double d = (double) longValue;
            Double.isNaN(d);
            j = (long) (h * d);
        } else {
            j = j2;
        }
        qwq.a((qxx) a("Maintenance.BatchDownload.24h", longValue, j, 1, z));
    }
}
