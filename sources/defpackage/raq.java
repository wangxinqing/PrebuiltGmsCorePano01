package defpackage;

import android.accounts.Account;

/* renamed from: raq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
abstract class raq {
    public static raq a(auco auco) {
        return new qym(auco, (Account) null, true);
    }

    public abstract auco a();

    public abstract Account b();

    public abstract boolean c();

    public abstract String d();

    /* access modifiers changed from: package-private */
    public final Account e() {
        amrl.b(!c(), (Object) "Must not ask for account for allAccounts key.");
        return b();
    }

    public static raq a(auco auco, Account account) {
        return new qym(auco, account, false);
    }
}
