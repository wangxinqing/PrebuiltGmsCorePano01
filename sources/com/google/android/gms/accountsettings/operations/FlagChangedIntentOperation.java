package com.google.android.gms.accountsettings.operations;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.accountsettings.service.PurgeScreenDataChimeraService;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class FlagChangedIntentOperation extends IntentOperation {
    static final String b = jkq.a("com.google.android.gms.accountsettings");
    private static final iwd c = dit.a("FlagChangedOp");
    qwq a;

    public FlagChangedIntentOperation() {
    }

    public final void onCreate() {
        this.a = qwq.a(getBaseContext());
    }

    public final void onHandleIntent(Intent intent) {
        boolean z;
        if (intent != null && jlo.m() != 10) {
            String action = intent.getAction();
            if ("com.google.android.gms.phenotype.COMMITTED".equals(action) || b.equals(action)) {
                z = intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME").equals("com.google.android.gms.accountsettings");
            } else {
                z = "com.google.gservices.intent.action.GSERVICES_CHANGED".equals(action);
            }
            if (!z) {
                return;
            }
            if (jhg.d(this, "com.google.android.gms.accountsettings.service.PurgeScreenDataService") != 1) {
                c.a("Service isn't enabled - drop scheduling task", new Object[0]);
                int i = ModuleInitializer.a;
                return;
            }
            qwq qwq = this.a;
            if (qwq != null) {
                qwq.a((qxx) PurgeScreenDataChimeraService.a());
            }
        }
    }

    protected FlagChangedIntentOperation(Context context) {
        attachBaseContext(context);
    }
}
