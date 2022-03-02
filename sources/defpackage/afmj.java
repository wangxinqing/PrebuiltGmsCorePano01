package defpackage;

import android.accounts.Account;

/* renamed from: afmj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class afmj {
    public static String a(Account account) {
        String str = account.type;
        String str2 = account.name;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        return sb.toString();
    }

    public static boolean a(String str) {
        return str != null && !str.isEmpty() && !str.contains(":") && !str.contains("|");
    }
}
