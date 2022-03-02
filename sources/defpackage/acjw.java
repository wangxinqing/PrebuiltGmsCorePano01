package defpackage;

import android.accounts.Account;
import android.accounts.AccountManagerCallback;

/* renamed from: acjw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class acjw implements ahb {
    private final acjy a;
    private final Account b;
    private final String c;

    public acjw(acjy acjy, Account account, String str) {
        this.a = acjy;
        this.b = account;
        this.c = str;
    }

    public final Object a(agz agz) {
        acjy acjy = this.a;
        Account account = this.b;
        String str = this.c;
        acjy.a.a(account, new String[]{str}, (AccountManagerCallback) new acjx(agz));
        return "AccountManager.hasFeatures";
    }
}
