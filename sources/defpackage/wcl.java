package defpackage;

import android.accounts.Account;
import java.util.concurrent.Callable;

/* renamed from: wcl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class wcl implements Callable {
    private final wcp a;
    private final Account b;

    public wcl(wcp wcp, Account account) {
        this.a = wcp;
        this.b = account;
    }

    public final Object call() {
        wcp wcp = this.a;
        Account account = this.b;
        return Boolean.valueOf(wcp.a(account, wcp.c.b(account)));
    }
}
