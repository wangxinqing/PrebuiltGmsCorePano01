package defpackage;

import android.accounts.Account;

/* renamed from: rmj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rmj {
    public final Account a;
    public final String b;
    public final long c;
    public long d = Long.MAX_VALUE;
    public long e = Long.MAX_VALUE;
    public String f;

    public rmj(Account account, String str, long j) {
        iva.a((Object) account, (Object) "account");
        this.a = account;
        iva.a((Object) str, (Object) "reason");
        this.b = str;
        this.c = j;
    }
}
