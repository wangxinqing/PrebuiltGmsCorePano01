package com.google.android.gms.drive.api.operations;

import android.accounts.Account;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import java.util.List;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class AccountsChangedIntentOperation extends IntentOperation {
    private static final ith a = new ith("AccountsChangedIntentOp", "");

    public final void onHandleIntent(Intent intent) {
        boolean z = false;
        if (!"com.google.android.gms.auth.GOOGLE_ACCOUNT_CHANGE".equals(intent.getAction())) {
            a.b("Invalid action: %s", intent.getAction());
            return;
        }
        List<Account> b = erc.b(intent);
        if (b != null && !b.isEmpty()) {
            try {
                jzk.b(getApplicationContext());
                lsm a2 = lsm.a();
                kkg kkg = new kkg(a2.d, a2.h, a2.b);
                if (!b.isEmpty()) {
                    for (Account account : b) {
                        kkg.b.a(kkg.b.c(account.name));
                        z = true;
                    }
                    if (z) {
                        a2.p.a();
                    }
                }
            } catch (InterruptedException e) {
                a.c("AccountsChangedIntentOp", "Interrupted while handling GOOGLE_ACCOUNT_CHANGE intent", e);
            }
        }
    }
}
