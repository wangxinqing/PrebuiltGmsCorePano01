package com.google.android.gms.icing.appindexing.service;

import android.content.Context;
import java.nio.charset.Charset;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class PeriodicRebuildIndexChimeraService extends owr {
    private static final Charset a = Charset.forName("UTF-8");

    private static long a(long j, long j2) {
        long j3 = j % j2;
        return j3 < 0 ? j3 + Math.abs(j2) : j3;
    }

    public static void a(qwq qwq) {
        int i;
        if (!((Boolean) ozx.aJ.c()).booleanValue()) {
            oso.a("UPDATE_INDEX Periodic Scheduling Disabled.");
            return;
        }
        qxi qxi = new qxi();
        qxi.k = "PeriodicIndexRebuild";
        qxi.n = true;
        qxi.a(((Boolean) ozx.d.c()).booleanValue());
        qxi.a(((Integer) ozx.ca.c()).intValue());
        boolean booleanValue = ((Boolean) ozx.bZ.c()).booleanValue();
        if (axcc.b() || ((Boolean) ozx.bZ.c()).booleanValue()) {
            i = 1;
        } else {
            i = 0;
        }
        qxi.a(booleanValue ? 1 : 0, i);
        qxi.i = "com.google.android.gms.icing.indexapi.PeriodicRebuildIndexService";
        qxi.b(1);
        long longValue = ((Long) ozx.bV.c()).longValue();
        long longValue2 = ((Long) ozx.bW.c()).longValue();
        if (!axcc.e()) {
            qxi.a = longValue;
            qxi.b = longValue2;
        } else {
            qxi.a(qxe.a(longValue));
        }
        qwq.a((qxx) qxi.b());
        oso.a("Task scheduled.");
    }

    public final int a(qxz qxz, owa owa) {
        String str;
        String string;
        owa owa2 = owa;
        if (!((Boolean) ozx.aK.c()).booleanValue()) {
            oso.a("UPDATE_INDEX Periodic Task Disabled.");
            return 0;
        }
        long currentTimeMillis = System.currentTimeMillis();
        Context context = owa2.a;
        prp prp = owa2.b;
        oyq oyq = owa2.c;
        long j = prp.b.getLong("last-periodic-rebuild", 0);
        Set<String> a2 = owa.a(context);
        String string2 = prp.b.getString("instance-id", (String) null);
        if (string2 == null) {
            synchronized (prp.g) {
                string = prp.b.getString("instance-id", (String) null);
                if (string == null) {
                    string = UUID.randomUUID().toString();
                    prp.b.edit().putString("instance-id", string).commit();
                }
            }
            str = string;
        } else {
            str = string2;
        }
        oso.a("Considering %d packages for index rebuild.", (Object) Integer.valueOf(a2.size()));
        for (String str2 : a2) {
            if (a(a(owq.a(owq.a(-3750763034362895579L, str2.getBytes(a)), str.getBytes(a)), ((Long) ozx.bX.c()).longValue()) - a(j, ((Long) ozx.bX.c()).longValue()), ((Long) ozx.bX.c()).longValue()) + j >= currentTimeMillis) {
                oso.a("Skipping package %s because it is not scheduled in the current window.", (Object) str2);
            } else {
                long p = currentTimeMillis - prp.p(str2);
                if (p < ((Long) ozx.bY.c()).longValue()) {
                    oso.a("Skipping package %s because we just indexed it %d minutes ago.", (Object) str2, (Object) Long.valueOf(TimeUnit.MILLISECONDS.toMinutes(p)));
                    oyq.a(str2, aomb.PERIODIC, aolz.THROTTLED);
                } else {
                    String str3 = str2;
                    if (!owa.a(str2, currentTimeMillis, aomb.PERIODIC, false)) {
                        oso.a("Failed to send index request to package %s.", (Object) str3);
                    } else {
                        oso.a("Sent index request to package %s.", (Object) str3);
                    }
                }
            }
        }
        prp.b.edit().putLong("last-periodic-rebuild", currentTimeMillis).commit();
        return 0;
    }
}
