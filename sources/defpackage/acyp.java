package defpackage;

import android.accounts.Account;

/* renamed from: acyp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acyp {
    public Account a = null;

    public final acyq a() {
        iva.a((Object) this.a, (Object) "Must provide a valid account!");
        return new acyq(this.a);
    }

    public final void a(String str) {
        this.a = new Account(str, "com.google");
    }
}
