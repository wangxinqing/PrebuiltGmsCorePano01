package defpackage;

import android.accounts.Account;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;

/* renamed from: qed  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qed {
    public final qlc a;
    private final qec b;

    public qed(qec qec, qlc qlc) {
        this.b = qec;
        this.a = qlc;
    }

    public final String a(Account account) {
        try {
            qec qec = this.b;
            String valueOf = String.valueOf(axuy.a.a().E());
            String str = valueOf.length() == 0 ? new String("oauth2:") : "oauth2:".concat(valueOf);
            qev a2 = qec.b.a();
            String c = qec.a.c(account, str);
            a2.a("GmsAccountManager.blockingGetAuthToken");
            if (!TextUtils.isEmpty(c)) {
                return c;
            }
            throw new AuthenticatorException("Null/empty token");
        } catch (AuthenticatorException | OperationCanceledException | IOException e) {
            Log.e("InstantApps", "getTokenWithNotification failed", e);
            throw new qep("getTokenWithNotification failed", e);
        }
    }
}
