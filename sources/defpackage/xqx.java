package defpackage;

import android.accounts.Account;

/* renamed from: xqx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class xqx {
    public static boolean a(Account account, String str) {
        return "com.google".equals(account.type) && "com.android.contacts".equals(str);
    }
}
