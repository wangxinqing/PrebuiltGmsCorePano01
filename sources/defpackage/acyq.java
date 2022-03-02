package defpackage;

import android.accounts.Account;

/* renamed from: acyq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acyq implements ibh {
    private final Account a;

    public acyq(Account account) {
        iva.a((Object) account, (Object) "Must provide a valid account!");
        this.a = account;
    }

    public final Account b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof acyq) && this.a.equals(((acyq) obj).a));
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public acyq(String str) {
        this(new Account(str, "com.google"));
    }
}
