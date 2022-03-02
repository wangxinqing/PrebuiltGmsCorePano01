package com.google.android.gms.auth.account.be.accountstate;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class LoginAccountsChangedWakefulChimeraBroadcastReceiver extends acsb {
    private static final iwd b = ehv.a("LoginAccountsChanged");

    public final void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        b.a("Received broadcast intent with action: %s", action);
        acsb.b(context, new Intent().setClassName(context, "com.google.android.gms.auth.account.be.accountstate.LoginAccountsChangedIntentService").setAction(action));
    }
}
