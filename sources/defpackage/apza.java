package defpackage;

import android.accounts.Account;

/* renamed from: apza  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
abstract class apza {
    static apza a(Account account, String str) {
        return new apzc(account, str);
    }

    public abstract Account a();

    public abstract String b();
}
