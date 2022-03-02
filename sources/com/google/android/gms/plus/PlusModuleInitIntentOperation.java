package com.google.android.gms.plus;

import android.accounts.Account;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class PlusModuleInitIntentOperation extends hec {
    private static synchronized void a(Context context) {
        synchronized (PlusModuleInitIntentOperation.class) {
            for (Account account : qub.a(context).a("com.google")) {
                ContentResolver.setIsSyncable(account, "com.google.android.gms.plus.action", 1);
                ContentResolver.setSyncAutomatically(account, "com.google.android.gms.plus.action", true);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void a(Intent intent, int i) {
        if ((i & 4) + (i & 8) != 0) {
            a(getApplicationContext());
        }
    }
}
