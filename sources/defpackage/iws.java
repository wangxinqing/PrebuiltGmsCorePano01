package defpackage;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AccountManagerCallback;
import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;

/* renamed from: iws  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class iws {
    static {
        String[] strArr = irx.r;
    }

    public static void a(Context context, String str, String[] strArr, AccountManagerCallback accountManagerCallback) {
        iva.b(!TextUtils.isEmpty(str), "The accountName is required");
        iva.b(true, "The requiredFeatures parameter is required");
        AccountManager accountManager = AccountManager.get(context);
        boolean z = false;
        for (Account account : accountManager.getAccountsByType("com.google")) {
            if (str.equals(account.name)) {
                z = true;
            }
        }
        if (z) {
            accountManager.hasFeatures(new Account(str, "com.google"), strArr, accountManagerCallback, (Handler) null);
            return;
        }
        throw new IllegalStateException("Given account does not exist on the device");
    }
}
