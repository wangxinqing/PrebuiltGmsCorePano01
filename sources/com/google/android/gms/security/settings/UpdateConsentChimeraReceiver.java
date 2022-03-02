package com.google.android.gms.security.settings;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.android.chimera.BroadcastReceiver;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class UpdateConsentChimeraReceiver extends BroadcastReceiver {
    public final void onReceive(Context context, Intent intent) {
        if (!intent.hasExtra("consent")) {
            Log.e("UpdateConsentReceiver", "No consent extra");
            return;
        }
        boolean booleanExtra = intent.getBooleanExtra("consent", true);
        aaal aaal = new aaal(context);
        if (aaal.e() || aaal.f()) {
            aaal.a(booleanExtra);
        }
        if (intent.hasExtra("upload_consent")) {
            aaal.a(context, intent.getBooleanExtra("upload_consent", true));
        }
    }
}
