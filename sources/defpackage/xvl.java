package defpackage;

import android.accounts.Account;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;

/* renamed from: xvl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class xvl {
    private final qub a;

    public xvl(qub qub) {
        this.a = qub;
    }

    private final Account[] a() {
        Account[] accountArr = (Account[]) this.a.a("com.google", new String[]{"service_HOSTED"}).getResult();
        if (aytd.o()) {
            return accountArr;
        }
        ArrayList arrayList = new ArrayList();
        for (Account account : accountArr) {
            if (!c(account.name)) {
                arrayList.add(account);
            }
        }
        return arrayList.size() != accountArr.length ? (Account[]) arrayList.toArray(new Account[0]) : accountArr;
    }

    private final Account[] b() {
        return (Account[]) this.a.a("com.google", new String[]{"service_uca"}).getResult();
    }

    private static boolean c(String str) {
        return str.endsWith("@google.com");
    }

    /* access modifiers changed from: package-private */
    public final boolean b(String str) {
        try {
            Account[] b = b();
            if (b != null) {
                for (Account account : b) {
                    if (str.equals(account.name)) {
                        return true;
                    }
                }
            }
            return false;
        } catch (AuthenticatorException | OperationCanceledException | IOException e) {
            Log.e("FSA2_AccountEligibilityChecker", "Exception checking account types", e);
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean a(String str) {
        if (!aytd.o() && c(str)) {
            return false;
        }
        try {
            Account[] a2 = a();
            if (a2 != null && (r3 = a2.length) > 0) {
                for (Account account : a2) {
                    if (str.equals(account.name)) {
                        return true;
                    }
                }
            }
            return false;
        } catch (AuthenticatorException | OperationCanceledException | IOException e) {
            Log.e("FSA2_AccountEligibilityChecker", "Exception checking account types", e);
            return true;
        }
    }

    public final Account[] a(boolean z, boolean z2) {
        try {
            Account[] a2 = this.a.a("com.google");
            HashSet hashSet = new HashSet();
            if (!z) {
                for (Account account : a()) {
                    hashSet.add(account.name);
                }
            }
            if (!z2) {
                for (Account account2 : b()) {
                    hashSet.add(account2.name);
                }
            }
            if (hashSet.isEmpty()) {
                return a2;
            }
            ArrayList arrayList = new ArrayList();
            for (Account account3 : a2) {
                if (!hashSet.contains(account3.name)) {
                    arrayList.add(account3);
                }
            }
            return (Account[]) arrayList.toArray(new Account[0]);
        } catch (AuthenticatorException | OperationCanceledException | IOException e) {
            return new Account[0];
        }
    }
}
