package com.google.android.gms.security.snet;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import com.google.android.chimera.IntentOperation;
import java.util.Map;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class SnetDailyHygieneChimeraIntentService extends IntentOperation {
    public final void onHandleIntent(Intent intent) {
        if (intent != null && "com.google.android.gms.security.snet.ACTION_CLEAN_PREFS".equals(intent.getAction())) {
            aarq aarq = new aarq(this);
            if (!aarq.b.getBoolean("migrated_to_safetynet_preferences", false)) {
                Map<String, ?> all = aarq.a.getAll();
                SharedPreferences.Editor edit = aarq.a.edit();
                for (String next : all.keySet()) {
                    if (next.startsWith("snet_attestation_request_times_ms") || next.startsWith("snet_saved_attestation_response")) {
                        edit.remove(next);
                    }
                }
                if (edit.commit()) {
                    SharedPreferences.Editor edit2 = aarq.b.edit();
                    edit2.putBoolean("migrated_to_safetynet_preferences", true);
                    edit2.commit();
                }
            }
            Map<String, ?> all2 = aarq.b.getAll();
            SharedPreferences.Editor edit3 = aarq.b.edit();
            for (String next2 : all2.keySet()) {
                if (next2.startsWith("snet_attestation_request_times_ms")) {
                    try {
                        aarq.c.getPackageInfo(next2.substring(34), 0);
                    } catch (PackageManager.NameNotFoundException e) {
                        edit3.remove(next2);
                    }
                }
            }
            edit3.commit();
        }
    }
}
