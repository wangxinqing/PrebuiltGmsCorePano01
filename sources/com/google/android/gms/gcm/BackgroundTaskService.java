package com.google.android.gms.gcm;

import android.util.Log;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class BackgroundTaskService extends qwf {
    public final int a(qxz qxz) {
        String str = qxz.a;
        if ("PersistConnectionInfos".equals(str)) {
            nrr a = nrr.a();
            iva.a(nqw.c());
            a.i.a();
            return 0;
        } else if ("LogPhenotypeExperimentIds".equals(str)) {
            nrr a2 = nrr.a();
            iva.a(nqw.c());
            a2.g.a(nyb.c);
            return 0;
        } else {
            String valueOf = String.valueOf(str);
            Log.w("GCM", valueOf.length() == 0 ? new String("Unknown task: ") : "Unknown task: ".concat(valueOf));
            return 0;
        }
    }
}
