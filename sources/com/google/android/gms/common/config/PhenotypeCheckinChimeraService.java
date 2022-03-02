package com.google.android.gms.common.config;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class PhenotypeCheckinChimeraService extends qwf {
    private final void a(Class cls, String str) {
        Intent startIntent = IntentOperation.getStartIntent((Context) this, cls, str);
        if (startIntent == null) {
            Log.e("phenotype_checkin", String.format("Failed to get IntentOperation for '%s'", new Object[]{str}));
            return;
        }
        startService(startIntent);
    }

    public final void aH() {
        qwq a = qwq.a((Context) this);
        qxi qxi = new qxi();
        qxi.a = axao.a.a().a();
        qxi.i = getContainerService().getClass().getName();
        qxi.n = true;
        qxi.b(0, 0);
        qxi.a(0, 0);
        qxi.a(false);
        qxi.b(1);
        qxi.a(true);
        qxi.k = "phenotype_checkin";
        a.a((qxx) qxi.b());
    }

    public final int a(qxz qxz) {
        a(PhenotypeRegistrationOperation.class, "com.google.android.gms.phenotype.DAILY_CHECKIN");
        a(PhenotypeUpdateOperation.class, "com.google.android.gms.phenotype.DAILY_CHECKIN");
        return 0;
    }
}
