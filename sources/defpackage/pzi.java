package defpackage;

import android.accounts.AccountManagerCallback;
import android.accounts.AccountManagerFuture;

/* renamed from: pzi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class pzi implements AccountManagerCallback {
    private final pzp a;

    public pzi(pzp pzp) {
        this.a = pzp;
    }

    public final void run(AccountManagerFuture accountManagerFuture) {
        this.a.a(accountManagerFuture);
    }
}
