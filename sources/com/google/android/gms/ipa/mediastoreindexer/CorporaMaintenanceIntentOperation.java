package com.google.android.gms.ipa.mediastoreindexer;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class CorporaMaintenanceIntentOperation extends IntentOperation {
    public final void onHandleIntent(Intent intent) {
        qoi.a("Starting mediastore corpora maintenance");
        qof qof = new qof();
        qrd qrd = new qrd(6);
        qps qps = new qps();
        qqd qqd = new qqd(getApplicationContext(), qof, qrd);
        awdx.a(qqd);
        qps.a = qqd;
        awdx.a((Object) qps.a, qqd.class);
        aorr b = new qpt(qps.a).a.b();
        aorl.a(b, new qre(b, qrd), qqd.b);
        aorl.a(b, axvz.a.a().F(), TimeUnit.SECONDS, qqd.a);
        qof.a(b, qqd.b);
    }
}
