package com.google.android.gms.subscribedfeeds;

import android.accounts.Account;
import android.content.ContentResolver;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import java.util.List;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class AccountsChangedIntentOperation extends IntentOperation {
    public final void onHandleIntent(Intent intent) {
        if (!azpv.d()) {
            List<Account> a = erc.a(intent);
            List<Account> b = erc.b(intent);
            for (Account syncAutomatically : a) {
                ContentResolver.setSyncAutomatically(syncAutomatically, "com.google.android.gms.subscribedfeeds", true);
            }
            ContentResolver contentResolver = ihs.b().getContentResolver();
            for (Account account : b) {
                contentResolver.delete(acuo.a, "_sync_account=? AND _sync_account_type=?", new String[]{account.name, account.type});
            }
        }
    }
}
