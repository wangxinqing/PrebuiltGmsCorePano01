package defpackage;

import android.accounts.AccountManagerCallback;
import android.accounts.AccountManagerFuture;

/* renamed from: acjx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class acjx implements AccountManagerCallback {
    private final agz a;

    public acjx(agz agz) {
        this.a = agz;
    }

    public final void run(AccountManagerFuture accountManagerFuture) {
        acjy.a(this.a, accountManagerFuture);
    }
}
