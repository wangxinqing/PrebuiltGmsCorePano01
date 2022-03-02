package com.google.android.gms.auth.uiflows.addaccount.setupwizard;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class BufferedLogsUploadIntentOperation extends IntentOperation {
    public static final iwd a = ehv.a("BufferedLogsUploadIntentOperation");
    public aljz b;
    public aljy c;
    public fya d;

    public final void onCreate() {
        aljy a2 = aljy.a(getApplicationContext());
        aljz aljz = new aljz(getApplicationContext(), "ANDROID_AUTH");
        fya b2 = fyp.b(getApplicationContext());
        this.c = a2;
        this.b = aljz;
        this.d = b2;
    }

    public final void onHandleIntent(Intent intent) {
        if (intent == null) {
            a.d("null intent", new Object[0]);
        } else if (!"com.google.android.gms.auth.uiflows.addaccount.setupwizard.auth_action_suw_finished".equals(intent.getAction())) {
            a.d("Unknown action", new Object[0]);
        } else {
            if (this.b == null) {
                this.b = new aljz(getApplicationContext(), "ANDROID_AUTH");
            }
            jfm.b(9).execute(new gmr(this, goj.a(getApplicationContext())));
        }
    }
}
