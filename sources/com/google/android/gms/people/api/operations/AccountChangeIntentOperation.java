package com.google.android.gms.people.api.operations;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class AccountChangeIntentOperation extends IntentOperation {
    private final ybw a;

    public AccountChangeIntentOperation() {
        this(ybx.a);
    }

    public final void onHandleIntent(Intent intent) {
        intent.getAction();
        this.a.a();
        if (intent.hasCategory("com.google.android.gms.auth.category.ACCOUNT_ADDED")) {
            erc.a(intent);
        }
        if (intent.hasCategory("com.google.android.gms.auth.category.ACCOUNT_REMOVED")) {
            erc.b(intent);
        }
    }

    public AccountChangeIntentOperation(ybw ybw) {
        this.a = ybw;
    }
}
