package defpackage;

import android.accounts.Account;
import android.accounts.OnAccountsUpdateListener;
import android.content.Context;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: ahxz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahxz extends ahya implements OnAccountsUpdateListener {
    private static ahxz c = null;
    public final qub a;
    public Account[] b;

    private ahxz(Context context) {
        Account[] accountArr;
        qub a2 = qub.a(context.getApplicationContext());
        try {
            accountArr = eig.d(context.getApplicationContext(), "com.google");
        } catch (RemoteException | hxw | hxx e) {
            String valueOf = String.valueOf(e.getMessage());
            if (valueOf.length() == 0) {
                new String("Failed to obtain accounts: ");
            } else {
                "Failed to obtain accounts: ".concat(valueOf);
            }
            accountArr = new Account[0];
        }
        this.a = a2;
        this.b = accountArr;
        a2.a((OnAccountsUpdateListener) this, false);
    }

    public static synchronized ahxz a(Context context) {
        ahxz ahxz;
        synchronized (ahxz.class) {
            if (c == null) {
                c = new ahxz(context);
            }
            ahxz = c;
        }
        return ahxz;
    }

    public final Account[] a() {
        return this.b;
    }

    public final void onAccountsUpdated(Account[] accountArr) {
        if (accountArr != null) {
            ArrayList arrayList = new ArrayList();
            for (Account account : accountArr) {
                if ("com.google".equals(account.type)) {
                    arrayList.add(account);
                }
            }
            Account[] accountArr2 = (Account[]) arrayList.toArray(new Account[arrayList.size()]);
            Arrays.sort(accountArr2, new ahxy());
            this.b = accountArr2;
        }
    }
}
