package com.google.android.gms.auth.account.accounttransfer;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.BroadcastReceiver;
import com.google.android.chimera.IntentOperation;
import java.util.Arrays;
import java.util.Collection;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class AccountTransferChimeraReceiver extends BroadcastReceiver {
    private static final iwd b = ehv.a("AccountTransfer", "AccountTransferReceiver");
    private static final Collection c = Arrays.asList(new String[]{"com.google.android.gms.auth.ACCOUNT_EXPORT_DATA_AVAILABLE", "com.google.android.gms.auth.ACCOUNT_IMPORT_DATA_AVAILABLE", "com.google.android.gms.auth.START_ACCOUNT_EXPORT"});

    public final void onReceive(Context context, Intent intent) {
        if (intent != null) {
            String action = intent.getAction();
            String stringExtra = intent.getStringExtra("key_extra_account_type");
            b.b("onReceive(intent=%s, accountType=%s)", action, stringExtra);
            if (c.contains(action)) {
                Intent startIntent = IntentOperation.getStartIntent(context, AccountTransferIntentOperation.class, action);
                if (stringExtra != null) {
                    startIntent.putExtra("key_extra_account_type", stringExtra);
                }
                if (startIntent == null) {
                    b.d("IntentOperation null", new Object[0]);
                } else {
                    context.startService(startIntent);
                }
            }
        } else {
            b.d("onReceive(intent=null)", new Object[0]);
        }
    }
}
