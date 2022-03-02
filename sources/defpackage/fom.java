package defpackage;

import android.accounts.AccountManagerCallback;
import android.accounts.AccountManagerFuture;

/* renamed from: fom  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class fom implements AccountManagerCallback {
    private final foo a;

    public fom(foo foo) {
        this.a = foo;
    }

    public final void run(AccountManagerFuture accountManagerFuture) {
        this.a.a(accountManagerFuture);
    }
}
