package com.google.android.gms.ipa.base;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.BoundService;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class IpaInitIntentOperation extends hec {
    public static final /* synthetic */ int a = 0;
    private static final String[] b = {"com.google.android.gms.ipa.base.IpaGcmTaskService"};

    /* access modifiers changed from: protected */
    public final void a(Intent intent, int i) {
        Object[] objArr = {intent, Integer.valueOf(i)};
        qtp.c(getBaseContext());
        IpaGcmTaskChimeraService.a(getBaseContext());
        if (!axvz.g()) {
            Context applicationContext = getApplicationContext();
            Intent startIntent = BoundService.getStartIntent(applicationContext, "com.google.android.gms.ipa.mediastoreindexer.PERSISTENT_START");
            if (startIntent == null) {
                qoi.c("Service intent not available.");
            } else {
                jca.a().a(applicationContext, startIntent, new qqc("ipa", applicationContext), 1);
            }
        }
        if (!axvz.g() || !jkr.c()) {
            Context applicationContext2 = getApplicationContext();
            Intent startIntent2 = BoundService.getStartIntent(applicationContext2, "com.google.android.gms.ipa.smsindexer.PERSISTENT_START");
            if (startIntent2 == null) {
                qoi.c("Service intent not available.");
                return;
            }
            jca.a().a(applicationContext2, startIntent2, new qtk("ipa", applicationContext2), 1);
        }
    }

    /* access modifiers changed from: protected */
    public final void a(Intent intent, boolean z) {
        qns a2;
        qtp.c(getBaseContext());
        if (axvz.i()) {
            new qrg(getApplicationContext().getSharedPreferences("MediastoreIndexerSharedPrefs", 0)).d();
        }
        if (axvz.d() && axvz.a.a().f() && (a2 = qns.a(getApplicationContext())) != null) {
            qok.a().a(new qoc(a2));
        }
        for (String str : b) {
            try {
                jhg.a((Context) this, str, true);
            } catch (IllegalArgumentException e) {
                qoi.c("Component %s invalid: %s", str, e.getMessage());
                qoh.a().a(6);
            }
        }
    }
}
