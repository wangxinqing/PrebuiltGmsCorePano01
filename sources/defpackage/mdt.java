package defpackage;

import android.accounts.Account;

/* renamed from: mdt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class mdt implements ibh {
    public static mdt a(Account account) {
        return new mdr(account);
    }

    public abstract Account b();
}
