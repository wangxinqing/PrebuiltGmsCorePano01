package com.google.android.gms.auth.account.visibility;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class WhitelistApplicationForGoogleAccountsIntentOperation extends IntentOperation {
    private static final iwd a = ehv.a("WhitelistApplicationForGoogleAccountsIntentOperation");

    public static Intent a(Context context, String str) {
        Intent startIntent = IntentOperation.getStartIntent(context, WhitelistApplicationForGoogleAccountsIntentOperation.class, "com.google.android.gms.auth.account.visibility.WHITELIST_APPLICATION");
        startIntent.putExtra("calling_package", str);
        return startIntent;
    }

    public final void onHandleIntent(Intent intent) {
        String string;
        if (intent != null) {
            String action = intent.getAction();
            if ("com.google.android.gms.auth.account.visibility.WHITELIST_APPLICATION".equals(action)) {
                Bundle extras = intent.getExtras();
                if (extras == null || (string = extras.getString("calling_package")) == null) {
                    a.d("onHandleIntent called without package name in extras(%s)", extras);
                    return;
                }
                ((ese) ese.d.b()).a(string);
                return;
            }
            a.d("onHandleIntent called with incorrect action(%s)", action);
            return;
        }
        a.d("onHandleIntent(intent=null)", new Object[0]);
    }
}
