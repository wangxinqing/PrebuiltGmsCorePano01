package com.google.android.gms.instantapps.routing;

import android.accounts.Account;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class AccountChangedIntentOperation extends IntentOperation {
    static {
        new qfn("AccountChangedIntentOperation");
    }

    public final void onHandleIntent(Intent intent) {
        new Object[1][0] = intent;
        if (intent != null && "com.google.android.gms.auth.GOOGLE_ACCOUNT_CHANGE".equals(intent.getAction()) && qfq.a(this).r.a()) {
            qlc qlc = qfq.a(this).c;
            Account a = qlc.a();
            if (a != null) {
                for (Account account : erc.b(intent)) {
                    if (account.name.equals(a.name)) {
                        qlc.b();
                    }
                }
            }
            DomainFilterUpdateChimeraService.a(avwm.ONE_OFF_SYNC_AT_ACCOUNT_CHANGE);
        }
    }
}
