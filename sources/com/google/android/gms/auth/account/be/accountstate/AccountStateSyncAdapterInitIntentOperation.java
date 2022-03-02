package com.google.android.gms.auth.account.be.accountstate;

import android.accounts.Account;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.R;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class AccountStateSyncAdapterInitIntentOperation extends hec {
    private static final iwd a = ehv.a("AccountStateSyncAdapter");

    /* access modifiers changed from: protected */
    public final void a(Intent intent, int i) {
        a.b("Initializing AccountStateSyncAdapter, IntentAction=%s, InitRuntimeState=%s", intent.getAction(), Integer.valueOf(i));
        Context baseContext = getBaseContext();
        String string = baseContext.getString(R.string.auth_account_state_authority);
        Bundle bundle = new Bundle();
        bundle.putBoolean("force", true);
        bundle.putBoolean("initialize_only", true);
        for (Account requestSync : jgu.d(baseContext, baseContext.getPackageName())) {
            ContentResolver.requestSync(requestSync, string, bundle);
        }
    }
}
