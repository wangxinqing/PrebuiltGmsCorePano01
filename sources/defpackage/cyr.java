package defpackage;

import android.accounts.AccountManagerCallback;
import android.accounts.AccountManagerFuture;

/* renamed from: cyr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class cyr implements AccountManagerCallback {
    private final cza a;

    public cyr(cza cza) {
        this.a = cza;
    }

    public final void run(AccountManagerFuture accountManagerFuture) {
        this.a.a(accountManagerFuture);
    }
}
