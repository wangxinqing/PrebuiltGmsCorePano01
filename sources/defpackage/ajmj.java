package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;

/* renamed from: ajmj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajmj {
    public final Context a;

    public ajmj(Context context) {
        this.a = context;
    }

    public static Account a(Intent intent) {
        if (intent.hasExtra("account")) {
            return (Account) intent.getParcelableExtra("account");
        }
        return null;
    }

    public final void a(Account account, int i) {
        Intent intent = new Intent("com.google.android.gms.location.reporting.INITIALIZATION_CHANGED");
        intent.putExtra("initialization", i);
        intent.putExtra("account", account);
        this.a.sendBroadcast(intent);
    }
}
