package defpackage;

import android.accounts.Account;

/* renamed from: agzv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class agzv {
    public static final Account a = new Account("shared", "mobstore");

    public static Account a(String str) {
        if (b(str)) {
            return a;
        }
        int indexOf = str.indexOf(58);
        ahbx.a(indexOf >= 0, "Malformed account", new Object[0]);
        return new Account(str.substring(indexOf + 1), str.substring(0, indexOf));
    }

    static boolean b(Account account) {
        return a.equals(account);
    }

    static boolean b(String str) {
        return "shared".equals(str);
    }

    public static String a(Account account) {
        boolean z;
        boolean z2;
        boolean z3;
        if (account.type.indexOf(58) == -1) {
            z = true;
        } else {
            z = false;
        }
        ahbx.a(z, "Account type contains ':'.", new Object[0]);
        if (account.type.indexOf(47) == -1) {
            z2 = true;
        } else {
            z2 = false;
        }
        ahbx.a(z2, "Account type contains '/'.", new Object[0]);
        if (account.name.indexOf(47) == -1) {
            z3 = true;
        } else {
            z3 = false;
        }
        ahbx.a(z3, "Account name contains '/'.", new Object[0]);
        if (b(account)) {
            return "shared";
        }
        String str = account.type;
        String str2 = account.name;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        return sb.toString();
    }
}
