package defpackage;

import android.accounts.Account;

/* renamed from: ahya  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class ahya {
    public final Account a(String str) {
        for (Account account : a()) {
            if (account.name.equals(str)) {
                return account;
            }
        }
        return null;
    }

    public abstract Account[] a();

    public final boolean a(Account account) {
        for (Account equals : a()) {
            if (account.equals(equals)) {
                return true;
            }
        }
        return false;
    }
}
