package com.google.android.gms.mdisync.service;

import android.accounts.Account;
import java.util.List;
import java.util.Map;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class MdiSyncBackgroundTaskChimeraService extends qwf {
    private static final anij a = sjk.b();
    private final amsv b;

    public MdiSyncBackgroundTaskChimeraService() {
        this(skd.a);
    }

    public final int a(qxz qxz) {
        slq slq;
        boolean z;
        slr slr;
        if (!aygr.f()) {
            a.d().a("com.google.android.gms.mdisync.service.MdiSyncBackgroundTaskChimeraService", "a", 47, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)").a("Disabled - skipping handling of task '%s'.", (Object) qxz.a);
            return 2;
        }
        skh skh = (skh) this.b.a();
        String str = qxz.a;
        skh.a.d().a("skh", "a", 75, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)").a("Dispatching task '%s'...", (Object) str);
        int lastIndexOf = str.lastIndexOf(95);
        int i = 0;
        if (lastIndexOf == -1) {
            slq = slq.UNKNOWN;
        } else {
            try {
                slq = slq.a(Integer.parseInt(str.substring(0, lastIndexOf)));
                if (slq == null) {
                    slq = slq.UNKNOWN;
                }
            } catch (NumberFormatException e) {
                slq = slq.UNKNOWN;
            }
        }
        sls sls = null;
        if (slq != slq.UNKNOWN) {
            slr[] values = slr.values();
            int length = values.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    slr = null;
                    break;
                }
                slr = values[i2];
                if (str.endsWith(slr.c)) {
                    break;
                }
                i2++;
            }
            if (slr != null) {
                sls = sls.a(slq, slr);
            }
        }
        if (sls == null) {
            anie c = sjk.a().c();
            c.a((int) aygr.b());
            c.a("skh", "a", 81, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)").a("Invalid task tag '%s'!", (Object) str);
            return 2;
        }
        slk slk = (slk) sls;
        slm slm = (slm) skh.b.get(slk.a);
        if (slm != null) {
            skh.a.d().a("skh", "a", 91, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)").a("Running singleton-scoped task '%s'...", (Object) sls);
            i = skh.a(0, skh.a(sls, slm));
            skh.a.d().a("skh", "a", 93, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)").a("Singleton-scoped task '%s' finished with result '%d'!", (Object) sls, i);
            z = true;
        } else {
            z = false;
        }
        for (Account a2 : (List) skh.d.a()) {
            slm slm2 = (slm) ((Map) skh.c.a(a2)).get(slk.a);
            if (slm2 != null) {
                skh.a.d().a("skh", "a", 101, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)").a("Running account-scoped task '%s'...", (Object) sls);
                i = skh.a(i, skh.a(sls, slm2));
                z = true;
            }
        }
        if (!z) {
            anie c2 = sjk.a().c();
            c2.a((int) aygr.b());
            c2.a("skh", "a", 110, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)").a("Task '%s' has no registered task handlers!", (Object) sls);
            return 2;
        }
        skh.a.d().a("skh", "a", 114, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)").a("Task '%s' finished with result '%d'!", (Object) sls, i);
        return i;
    }

    public MdiSyncBackgroundTaskChimeraService(amsv amsv) {
        this.b = amta.a(amsv);
    }
}
