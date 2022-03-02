package defpackage;

import android.accounts.Account;
import android.accounts.AccountManagerCallback;
import android.accounts.AccountManagerFuture;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.content.Context;
import com.google.android.gms.R;
import com.google.android.gms.plus.activity.AccountSignUpChimeraActivity;
import java.io.IOException;

/* renamed from: ykw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ykw extends ylc implements AccountManagerCallback {
    final /* synthetic */ AccountSignUpChimeraActivity a;

    public ykw(AccountSignUpChimeraActivity accountSignUpChimeraActivity) {
        this.a = accountSignUpChimeraActivity;
    }

    public final boolean b() {
        return false;
    }

    public final boolean c() {
        return this.a.d != 2;
    }

    public final void d() {
        AccountSignUpChimeraActivity accountSignUpChimeraActivity = this.a;
        if (!jgu.g(accountSignUpChimeraActivity, accountSignUpChimeraActivity.a)) {
            AccountSignUpChimeraActivity accountSignUpChimeraActivity2 = this.a;
            accountSignUpChimeraActivity2.a(accountSignUpChimeraActivity2.getString(R.string.plus_invalid_account));
            return;
        }
        qub.a((Context) this.a).a(new Account(this.a.a, "com.google"), irx.r, (AccountManagerCallback) this);
    }

    public final void run(AccountManagerFuture accountManagerFuture) {
        try {
            Boolean bool = (Boolean) accountManagerFuture.getResult();
            if (bool != null) {
                this.a.d = bool.booleanValue() ^ true ? 1 : 0;
                this.a.a();
                return;
            }
            AccountSignUpChimeraActivity accountSignUpChimeraActivity = this.a;
            accountSignUpChimeraActivity.a(accountSignUpChimeraActivity.getString(R.string.plus_internal_error));
        } catch (OperationCanceledException e) {
            AccountSignUpChimeraActivity accountSignUpChimeraActivity2 = this.a;
            accountSignUpChimeraActivity2.a(accountSignUpChimeraActivity2.getString(R.string.plus_internal_error));
        } catch (AuthenticatorException e2) {
            AccountSignUpChimeraActivity accountSignUpChimeraActivity3 = this.a;
            accountSignUpChimeraActivity3.a(accountSignUpChimeraActivity3.getString(R.string.plus_internal_error));
        } catch (IOException e3) {
            AccountSignUpChimeraActivity accountSignUpChimeraActivity4 = this.a;
            accountSignUpChimeraActivity4.a(accountSignUpChimeraActivity4.getString(R.string.plus_network_unreliable));
        }
    }
}
