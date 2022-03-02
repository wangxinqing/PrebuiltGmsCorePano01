package defpackage;

import android.accounts.Account;
import android.content.Context;

/* renamed from: adhp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adhp implements adhf {
    private final Context a;

    public adhp(Context context) {
        this.a = context;
    }

    public final String a(Account account) {
        return eig.c(this.a, account.name);
    }
}
