package com.google.android.gms.auth.uiflows.removeaccount;

import android.accounts.AccountAuthenticatorResponse;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.R;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ConfirmAccountDeletionChimeraActivity extends gnx {
    public static final iwd a = new iwd("RemoveAccount", "ConfirmAccountDeletionActivity");

    public static Intent a(Context context, AccountAuthenticatorResponse accountAuthenticatorResponse) {
        Intent className = new Intent().setClassName(context, "com.google.android.gms.auth.login.ConfirmAccountDeletionActivity");
        className.setFlags(67108864);
        className.putExtra("response", accountAuthenticatorResponse);
        return className;
    }

    /* access modifiers changed from: protected */
    public final String b() {
        return "ConfirmAccountDeletionActivity";
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        AccountAuthenticatorResponse accountAuthenticatorResponse = (AccountAuthenticatorResponse) getIntent().getExtras().getParcelable("response");
        if (accountAuthenticatorResponse != null) {
            if (i2 == -1) {
                a.c("User authenticated, starting intent.", new Object[0]);
                Bundle bundle = new Bundle();
                bundle.putBoolean("booleanResult", true);
                accountAuthenticatorResponse.onResult(bundle);
            } else {
                a.c("Failed to confirm lock screen credential.", new Object[0]);
                Bundle bundle2 = new Bundle();
                bundle2.putBoolean("booleanResult", false);
                accountAuthenticatorResponse.onResult(bundle2);
            }
            finish();
            return;
        }
        a(i2, (Intent) null);
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        int i;
        int i2;
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getIntent().getExtras();
        }
        boolean equals = "com.android.managedprovisioning".equals(bundle.getString("caller"));
        if (!equals) {
            i = R.string.auth_factory_reset_protection_remove_account_confirmation_content;
        } else {
            i = R.string.auth_factory_reset_protection_remove_account_confirmation_content_by_mp;
        }
        if (!equals) {
            i2 = R.string.auth_factory_reset_protection_remove_account_confirmation_title;
        } else {
            i2 = R.string.auth_factory_reset_protection_remove_account_confirmation_title_by_mp;
        }
        new AlertDialog.Builder(this).setCancelable(false).setTitle(i2).setMessage(i).setPositiveButton(17039370, new gqj(this)).setNegativeButton(17039360, new gqi(this)).create().show();
    }

    public static Intent a(Context context, String str) {
        return new Intent().setClassName(context, "com.google.android.gms.auth.login.ConfirmAccountDeletionActivity").putExtra("caller", str);
    }
}
