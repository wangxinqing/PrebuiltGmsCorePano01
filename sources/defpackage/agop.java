package defpackage;

import android.accounts.Account;
import android.content.Context;

/* renamed from: agop  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class agop {
    private final Context a;

    public agop(Context context) {
        this.a = context;
    }

    public final agoo a() {
        return new agoo(this.a);
    }

    public final agoo a(Account account) {
        return new agoo(this.a, account);
    }
}
