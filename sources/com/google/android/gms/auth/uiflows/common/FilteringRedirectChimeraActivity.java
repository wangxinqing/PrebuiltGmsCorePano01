package com.google.android.gms.auth.uiflows.common;

import android.accounts.AccountAuthenticatorResponse;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.util.Log;
import com.google.android.chimera.Activity;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class FilteringRedirectChimeraActivity extends Activity {
    private static Random a = new SecureRandom();
    private AccountAuthenticatorResponse b;
    private List c;

    public static PendingIntent a(Context context, PendingIntent pendingIntent, List list, AccountAuthenticatorResponse accountAuthenticatorResponse) {
        Intent className = new Intent().setClassName(context, "com.google.android.gms.auth.uiflows.common.FilteringRedirectActivity");
        className.putExtra("com.google.android.gms.auth.redirect.INTENT", pendingIntent);
        className.putStringArrayListExtra("com.google.android.gms.auth.redirect.whitelist", new ArrayList(list));
        if (accountAuthenticatorResponse != null) {
            className.putExtra("response", accountAuthenticatorResponse);
        }
        long nextLong = a.nextLong();
        StringBuilder sb = new StringBuilder(33);
        sb.append("categoryhack:");
        sb.append(nextLong);
        className.addCategory(sb.toString());
        return PendingIntent.getActivity(context.getApplicationContext(), 0, className, 0);
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i, int i2, Intent intent) {
        int i3;
        String str;
        boolean z;
        super.onActivityResult(i, i2, intent);
        Intent intent2 = new Intent();
        if (!(i2 != -1 || intent == null || intent.getExtras() == null)) {
            if (!intent.hasExtra("booleanResult") || !this.c.contains("booleanResult")) {
                z = false;
            } else {
                intent2.putExtra("booleanResult", intent.getBooleanExtra("booleanResult", false));
                intent.removeExtra("booleanResult");
                z = true;
            }
            if (intent.hasExtra("retry") && this.c.contains("retry")) {
                intent2.putExtra("retry", intent.getBooleanExtra("retry", false));
                intent.removeExtra("retry");
                z = true;
            }
            if (intent.getExtras() != null) {
                for (String str2 : intent.getExtras().keySet()) {
                    if (this.c.contains(str2)) {
                        if ("accountSessionBundle".equals(str2)) {
                            intent2.putExtra(str2, intent.getBundleExtra(str2));
                            z = true;
                        } else {
                            intent2.putExtra(str2, intent.getStringExtra(str2));
                            z = true;
                        }
                    }
                }
            }
            if (z) {
                AccountAuthenticatorResponse accountAuthenticatorResponse = this.b;
                if (accountAuthenticatorResponse != null) {
                    accountAuthenticatorResponse.onResult(intent2.getExtras());
                }
                setResult(-1, intent2);
                finish();
                return;
            }
        }
        if (i2 == 0) {
            i3 = 4;
        } else {
            i3 = 5;
        }
        if (i2 != 0) {
            str = "unknown error";
        } else {
            str = "canceled";
        }
        if (intent != null && intent.hasExtra("errorCode")) {
            i3 = intent.getIntExtra("errorCode", i3);
            str = intent.getStringExtra("errorMessage");
        }
        a(i2, i3, str);
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            Intent intent = getIntent();
            this.b = (AccountAuthenticatorResponse) intent.getParcelableExtra("response");
            this.c = intent.getStringArrayListExtra("com.google.android.gms.auth.redirect.whitelist");
            try {
                startIntentSenderForResult(((PendingIntent) intent.getParcelableExtra("com.google.android.gms.auth.redirect.INTENT")).getIntentSender(), 0, (Intent) null, 0, 0, 0);
                AccountAuthenticatorResponse accountAuthenticatorResponse = this.b;
                if (accountAuthenticatorResponse != null) {
                    accountAuthenticatorResponse.onRequestContinued();
                }
            } catch (IntentSender.SendIntentException e) {
                String valueOf = String.valueOf(e.getMessage());
                Log.e("GLSActivity", valueOf.length() == 0 ? new String("[ FilteringRedirectActivity ]  Unable to initiate pending workflow! ") : "[ FilteringRedirectActivity ]  Unable to initiate pending workflow! ".concat(valueOf));
                a(0, 8, "Cannot launch workflow!");
            }
        } else {
            Log.i("GLSActivity", "[ FilteringRedirectActivity ] Marshalled state from icicle.");
            this.b = (AccountAuthenticatorResponse) bundle.getParcelable("response");
            this.c = bundle.getStringArrayList("com.google.android.gms.auth.redirect.whitelist");
        }
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("response", this.b);
        bundle.putStringArrayList("com.google.android.gms.auth.redirect.whitelist", new ArrayList(this.c));
    }

    private final void a(int i, int i2, String str) {
        AccountAuthenticatorResponse accountAuthenticatorResponse = this.b;
        if (accountAuthenticatorResponse != null) {
            accountAuthenticatorResponse.onError(i2, str);
        }
        Intent intent = new Intent();
        intent.putExtra("errorCode", i2);
        intent.putExtra("errorMessage", str);
        setResult(i, intent);
        finish();
    }
}
