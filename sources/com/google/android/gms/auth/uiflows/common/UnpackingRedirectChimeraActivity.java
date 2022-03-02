package com.google.android.gms.auth.uiflows.common;

import android.accounts.AccountAuthenticatorResponse;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.util.Log;
import com.google.android.chimera.Activity;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class UnpackingRedirectChimeraActivity extends Activity {
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        PendingIntent pendingIntent = (PendingIntent) getIntent().getParcelableExtra("target");
        if (pendingIntent != null) {
            Intent intent = new Intent();
            AccountAuthenticatorResponse accountAuthenticatorResponse = (AccountAuthenticatorResponse) getIntent().getParcelableExtra("response");
            if (accountAuthenticatorResponse != null) {
                intent.putExtra("response", accountAuthenticatorResponse);
            }
            String a = jhg.a((Activity) this);
            if (a != null) {
                intent.putExtra("caller", a);
            }
            alht.a(getIntent(), intent);
            try {
                startIntentSender(pendingIntent.getIntentSender(), intent, 33554432, 33554432, 0);
                finish();
                return;
            } catch (IntentSender.SendIntentException e) {
                Log.e("UnpackingRedirectAct", "Unable to start unpacked pending intent!", e);
            }
        }
        setResult(0);
        finish();
    }
}
