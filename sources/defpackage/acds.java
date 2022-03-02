package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.smartdevice.setup.accounts.UserCredential;
import java.util.ArrayList;
import java.util.HashSet;

/* renamed from: acds  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acds {
    public static HashSet a(Context context, String str) {
        iva.a((Object) context);
        iva.c(str);
        HashSet hashSet = new HashSet(r0);
        for (Account account : acpd.a(context).a(str)) {
            hashSet.add(account.name);
        }
        return hashSet;
    }

    public static void a(Context context, ArrayList arrayList) {
        iva.a((Object) context);
        iva.a((Object) arrayList);
        a(context, (UserCredential[]) arrayList.toArray(new UserCredential[arrayList.size()]));
    }

    public static void a(Context context, UserCredential[] userCredentialArr) {
        iva.a((Object) context);
        iva.a((Object) userCredentialArr);
        HashSet a = a(context, "com.google");
        for (UserCredential userCredential : userCredentialArr) {
            a(context, userCredential.b, userCredential.f, userCredential.g, userCredential.h, a);
        }
    }

    public static boolean a(Context context, String str, String str2, String str3, String str4, HashSet hashSet) {
        iva.a((Object) context);
        iva.a((Object) str);
        iva.c(str2);
        if (hashSet.contains(str)) {
            Account account = new Account(str, "com.google");
            iva.a((Object) context);
            iva.a((Object) account);
            iva.c(str2);
            acpd.a(context).a(account, str2);
            return true;
        }
        iva.a((Object) context);
        iva.a((Object) str);
        iva.a((Object) str2);
        qub a = acpd.a(context);
        Account account2 = new Account(str, "com.google");
        Bundle bundle = new Bundle();
        bundle.putString("firstName", str3);
        bundle.putString("lastName", str4);
        return a.a(account2, str2, bundle);
    }
}
