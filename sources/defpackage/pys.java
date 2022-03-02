package defpackage;

import android.accounts.Account;
import android.accounts.AuthenticatorDescription;
import android.content.Context;
import android.os.Build;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ClientContext;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: pys  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class pys {
    private static final iwd a = new iwd("CommonAccount", "AccountUtil");

    public static ArrayList a(qub qub, String[] strArr, ArrayList arrayList, String str) {
        Account[] accountArr;
        HashSet hashSet;
        ArrayList arrayList2 = new ArrayList();
        Set<String> a2 = a(qub, strArr);
        if (a2 == null) {
            a2 = new HashSet<>(Arrays.asList(iri.a));
        }
        for (String str2 : a2) {
            int i = Build.VERSION.SDK_INT;
            if (anbs.b((Iterable) Arrays.asList(iri.a), amrs.a((Object) str2))) {
                accountArr = qub.a(str2, str);
            } else {
                accountArr = new Account[0];
            }
            ArrayList arrayList3 = new ArrayList(accountArr.length);
            if (arrayList != null) {
                hashSet = new HashSet(arrayList.size());
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    hashSet.add((Account) ((Parcelable) arrayList.get(i2)));
                }
            } else {
                hashSet = null;
            }
            for (Account account : accountArr) {
                if (hashSet == null || hashSet.contains(account)) {
                    arrayList3.add(account);
                }
            }
            arrayList2.addAll(arrayList3);
        }
        return arrayList2;
    }

    public static Set a(qub qub, String[] strArr) {
        if (strArr == null) {
            return null;
        }
        HashSet hashSet = new HashSet(strArr.length);
        Collections.addAll(hashSet, strArr);
        HashSet hashSet2 = new HashSet(r0);
        for (AuthenticatorDescription authenticatorDescription : qub.a()) {
            hashSet2.add(authenticatorDescription.type);
        }
        hashSet.retainAll(hashSet2);
        return hashSet;
    }

    public static boolean a(Context context, qub qub, Account account, String str) {
        if (!jkr.e()) {
            int i = jhg.i(context, str);
            if (qby.a(context, i)) {
                return true;
            }
            if (i != -1) {
                ClientContext clientContext = new ClientContext();
                clientContext.b = i;
                clientContext.e = str;
                if (ixk.a(context, clientContext).a("android.permission.GET_ACCOUNTS") == 0) {
                    return true;
                }
                a.d("The calling package does not have the %s permission. Will display Chooser.", "android.permission.GET_ACCOUNTS");
                return false;
            }
            a.d("Could not get calling package.", new Object[0]);
            return false;
        } else if (!anbs.b((Iterable) Arrays.asList(iri.a), amrs.a((Object) account.type))) {
            return false;
        } else {
            int b = qub.b(account, str);
            if (b == 2 || b == 1 || (b == 4 && qby.a(context, jhg.i(context, str)))) {
                return true;
            }
            return false;
        }
    }
}
