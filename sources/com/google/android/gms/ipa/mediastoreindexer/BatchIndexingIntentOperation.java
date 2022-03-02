package com.google.android.gms.ipa.mediastoreindexer;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class BatchIndexingIntentOperation extends IntentOperation {
    public final void onHandleIntent(Intent intent) {
        qoi.a("Starting mediastore batch index");
        qof qof = new qof();
        qrd qrd = new qrd(5);
        qpq qpq = new qpq();
        qqd qqd = new qqd(getApplicationContext(), qof, qrd);
        awdx.a(qqd);
        qpq.a = qqd;
        awdx.a((Object) qpq.a, qqd.class);
        aorr b = new qpr(qpq.a).a.b();
        aorl.a(b, new qre(b, qrd), qqd.b);
        aorl.a(b, axvz.a.a().C(), TimeUnit.SECONDS, qqd.a);
        qof.a(b, qqd.b);
    }
}
