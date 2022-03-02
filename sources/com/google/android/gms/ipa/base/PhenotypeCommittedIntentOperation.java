package com.google.android.gms.ipa.base;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class PhenotypeCommittedIntentOperation extends IntentOperation {
    private static final String a = jkq.a("com.google.android.gms.ipa");

    public final void onHandleIntent(Intent intent) {
        if (("com.google.android.gms.phenotype.COMMITTED".equals(intent.getAction()) || a.equals(intent.getAction())) && "com.google.android.gms.ipa".equals(intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME"))) {
            aguy a2 = aguy.a(getBaseContext().getContentResolver(), yef.a("com.google.android.gms.ipa"));
            if (a2 != null) {
                a2.b();
            }
            IpaGcmTaskChimeraService.a(getBaseContext());
            qtp.c(getBaseContext());
            qns.a(getBaseContext());
            if (!qrc.a(getBaseContext()) || axvz.g()) {
                qqb.c(getBaseContext());
            } else {
                qqb.b(getBaseContext());
            }
            qrg qrg = new qrg(getSharedPreferences("MediastoreIndexerSharedPrefs", 0));
            boolean e = axvz.e();
            if (qrg.a.getBoolean("audio_media_files_indexing_enabled", false) ^ e) {
                if (e) {
                    qrg.d();
                }
                qrg.a.edit().putBoolean("audio_media_files_indexing_enabled", e).commit();
            }
            boolean h = axvz.h();
            if (qrg.a.getBoolean("id_based_mediastore_indexing_enabled", false) ^ h) {
                qrg.d();
                qrg.a.edit().putBoolean("id_based_mediastore_indexing_enabled", h).commit();
            }
        }
    }
}
