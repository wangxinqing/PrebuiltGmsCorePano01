package defpackage;

import android.accounts.AccountManagerCallback;
import android.accounts.AccountManagerFuture;

/* renamed from: pyz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class pyz implements AccountManagerCallback {
    private final pze a;

    public pyz(pze pze) {
        this.a = pze;
    }

    public final void run(AccountManagerFuture accountManagerFuture) {
        this.a.a(accountManagerFuture);
    }
}
