package com.google.android.gms.common.devicedoctor.fixerframework;

import android.content.Intent;
import android.util.Log;
import com.google.android.chimera.IntentOperation;
import java.util.Collection;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class PhenotypeCommittedOperation extends IntentOperation {
    private ing a = new ing();

    public final void onHandleIntent(Intent intent) {
        if (intent != null && awyw.a.a().l()) {
            String stringExtra = intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME");
            String valueOf = String.valueOf(stringExtra);
            Log.i("PTCommittedOperation", valueOf.length() == 0 ? new String("Receive new configuration for ") : "Receive new configuration for ".concat(valueOf));
            if (amzy.a((Collection) amsk.a(',').b().a().c(awyw.a.a().k())).contains(stringExtra)) {
                String valueOf2 = String.valueOf(stringExtra);
                Log.i("PTCommittedOperation", valueOf2.length() == 0 ? new String("Running Fixer Framework for ") : "Running Fixer Framework for ".concat(valueOf2));
                if (!awyw.h()) {
                    imr.a();
                }
                ina c = inb.c();
                c.b = this;
                c.a = aogr.PHENOTYPE_UPDATE;
                this.a.a(c.a());
            }
        }
    }
}
