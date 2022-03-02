package com.google.android.gms.auth.account.be;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class UpdateHideDmNotificationsIntentOperation extends IntentOperation {
    private static final iwd a = ehv.a("UpdateHideDmNotificationsIntentOperation");
    private static final long b = TimeUnit.MINUTES.toMillis(5);

    public static Intent a(Context context, Account account) {
        Intent putExtra = IntentOperation.getStartIntent(context, UpdateHideDmNotificationsIntentOperation.class, "com.google.android.gms.auth.account.be.update_hide_dm_notifications").putExtra("account_name", account);
        putExtra.putExtra("hide_notifications", true);
        return putExtra;
    }

    public final void onHandleIntent(Intent intent) {
        boolean booleanExtra = intent.getBooleanExtra("hide_notifications", false);
        Account account = (Account) intent.getParcelableExtra("account_name");
        if (booleanExtra) {
            a.c("setting timestamp", new Object[0]);
            ((eny) eny.a.b()).b(account, eqb.o, Long.valueOf(System.currentTimeMillis() + b));
            return;
        }
        a.c("clearing timestamp", new Object[0]);
        ((eny) eny.a.b()).b(account, eqb.o, (Object) null);
    }
}
