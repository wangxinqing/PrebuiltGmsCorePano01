package com.google.android.gms.auth.account.be;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class AccountStatusChecker$InitializeIntentOperation extends IntentOperation {
    private static final String[] a = {"com.google", "com.google.work", "cn.google"};
    private ekl b;
    private qub c;
    private eny d;

    public final void onCreate() {
        ekl ekl = new ekl(this);
        qub a2 = qub.a((Context) this);
        this.b = ekl;
        this.c = a2;
        this.d = (eny) eny.a.b();
    }

    public final void onHandleIntent(Intent intent) {
        for (String a2 : a) {
            for (Account account : this.c.a(a2)) {
                ekl.a.b("Initialize check: %s", iwd.a((Object) account));
                this.b.a(this.d, account);
            }
        }
    }
}
