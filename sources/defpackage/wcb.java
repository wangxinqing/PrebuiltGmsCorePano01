package defpackage;

import android.accounts.Account;

/* renamed from: wcb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class wcb implements Runnable {
    private final wcf a;
    private final Account b;

    public wcb(wcf wcf, Account account) {
        this.a = wcf;
        this.b = account;
    }

    public final void run() {
        wcf wcf = this.a;
        wcf.b.a(this.b);
    }
}
