package com.google.android.gms.mdm.receivers;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class GoogleAccountsAddedChimeraReceiver extends AccountsChangedChimeraReceiver {
    private static boolean a;

    public static synchronized boolean a() {
        boolean z;
        synchronized (GoogleAccountsAddedChimeraReceiver.class) {
            z = a;
        }
        return z;
    }

    public static synchronized void b() {
        synchronized (GoogleAccountsAddedChimeraReceiver.class) {
            a = true;
        }
    }

    public final void onHandleIntent(Intent intent) {
        if (a() && "com.google.android.gms.auth.GOOGLE_ACCOUNT_CHANGE".equals(intent.getAction()) && intent.hasCategory("com.google.android.gms.auth.category.ACCOUNT_ADDED")) {
            long currentTimeMillis = System.currentTimeMillis();
            int i = crc.a;
            smy.a();
            smo.h.a((Object) 1);
            smq.a((Context) this, currentTimeMillis + 60000);
        }
    }
}
