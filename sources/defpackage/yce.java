package defpackage;

import android.accounts.Account;
import android.accounts.AccountManagerCallback;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.content.Context;
import android.util.Log;
import java.io.IOException;

/* renamed from: yce  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class yce implements ycd {
    static final String[] a = {"service_googleme"};
    private final ycw b = ybx.a;

    public final boolean a(Context context, Account account) {
        amrl.a((Object) context);
        amrl.a((Object) account);
        if ("com.google".equals(account.type)) {
            return a(context, account.name);
        }
        return false;
    }

    public final boolean a(Context context, String str) {
        Account a2;
        amrl.a((Object) context);
        amrl.a((Object) str);
        ydm ydm = new ydm(context);
        if ((jkr.b() && ydm.a.a("android.permission.GET_ACCOUNTS") != 0) || (a2 = this.b.a(context, str)) == null) {
            return false;
        }
        try {
            return ((Boolean) qub.a(context).a(a2, a, (AccountManagerCallback) null).getResult()).booleanValue();
        } catch (AuthenticatorException | OperationCanceledException | IOException e) {
            Log.e("GooglePlusCheckerImpl", "Unable to get account features.", e);
            return false;
        }
    }
}
