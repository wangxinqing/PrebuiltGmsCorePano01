package com.google.android.gms.auth.account.data;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import com.google.android.chimera.BroadcastReceiver;
import java.util.List;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class WorkAccountStore$ChimeraReceiver extends BroadcastReceiver {
    public final void onReceive(Context context, Intent intent) {
        if ("com.google.android.gms.auth.GOOGLE_ACCOUNT_CHANGE".equals(intent.getAction()) && intent.hasCategory("com.google.android.gms.auth.category.ACCOUNT_REMOVED")) {
            List<Account> b = erc.b(intent);
            SharedPreferences.Editor edit = ((epw) epw.a.b()).b.edit();
            for (Account account : b) {
                if ("com.google.work".equals(account.type)) {
                    edit.remove(account.name);
                }
            }
            edit.apply();
        }
    }
}
