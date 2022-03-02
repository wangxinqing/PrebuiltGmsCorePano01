package defpackage;

import android.accounts.Account;
import android.content.Context;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: zrr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zrr {
    public static Account[] a(Context context) {
        if (jgu.e(context)) {
            return new Account[0];
        }
        ArrayList arrayList = new ArrayList(r2);
        for (Account account : qub.a(context).a("com.google")) {
            if (!"".equals(account.name)) {
                arrayList.add(account);
            }
        }
        return (Account[]) arrayList.toArray(new Account[0]);
    }

    public static Set b(Context context) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Account account : a(context)) {
            linkedHashSet.add(account.name);
        }
        return linkedHashSet;
    }
}
