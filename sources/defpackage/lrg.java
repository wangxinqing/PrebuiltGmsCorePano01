package defpackage;

import android.accounts.Account;
import android.content.Context;

/* renamed from: lrg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lrg {
    public static int a(Account[] accountArr, String str) {
        for (int i = 0; i < accountArr.length; i++) {
            if (accountArr[i].name.equals(str)) {
                return i;
            }
        }
        return -1;
    }

    public static Account a(Context context, String str) {
        Account[] a = a(context);
        int a2 = a(a, str);
        if (a2 != -1) {
            return a[a2];
        }
        return null;
    }

    public static Account[] a(Context context) {
        qub a = qub.a(context);
        Account[] a2 = a.a("com.google");
        if (!jix.a(context)) {
            return a2;
        }
        return (Account[]) jhx.a((Object[][]) new Account[][]{a2, a.a("cn.google")});
    }
}
