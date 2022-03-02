package com.google.android.gms.people.service;

import android.content.Intent;
import android.util.Log;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class SettingsChangedBroadcastIntentOperation extends IntentOperation {
    public final void onCreate() {
    }

    public final void onDestroy() {
    }

    public final void onHandleIntent(Intent intent) {
        if ("com.google.android.gms.phenotype.COMMITTED".equals(intent.getAction()) && "com.google.android.gms.people".equals(intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME"))) {
            if (aywz.a.a().a()) {
                aguy a = aguy.a(getBaseContext().getContentResolver(), yef.a("com.google.android.gms.people"));
                if (a != null) {
                    a.b();
                } else {
                    Log.e("SettingsChangedOp", "Get null phenotype loader");
                }
            }
            if (ayrj.b()) {
                xwq.a(getApplicationContext());
            }
            if (ayxh.k()) {
                DeletedNullContactsCleanupChimeraService.b(this);
            }
            if (ayrn.i()) {
                BackupAndSyncOptInValidationChimeraService.b(this);
            }
        }
    }
}
