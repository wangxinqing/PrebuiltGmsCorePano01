package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.AsyncTask;
import com.google.android.gms.auth.uiflows.settings.AccountSettingsChimeraActivity;
import java.io.IOException;

/* renamed from: gql  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gql extends AsyncTask {
    final /* synthetic */ Account a;
    final /* synthetic */ AccountSettingsChimeraActivity b;

    public gql(AccountSettingsChimeraActivity accountSettingsChimeraActivity, Account account) {
        this.b = accountSettingsChimeraActivity;
        this.a = account;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        AccountSettingsChimeraActivity accountSettingsChimeraActivity = this.b;
        iwd iwd = AccountSettingsChimeraActivity.a;
        try {
            eiw.a((Context) accountSettingsChimeraActivity).a(this.a, accountSettingsChimeraActivity.d);
            return true;
        } catch (eiv e) {
            iwd iwd2 = AccountSettingsChimeraActivity.a;
            String valueOf = String.valueOf(e.a);
            iwd2.c(valueOf.length() == 0 ? new String("Found recovery URL: ") : "Found recovery URL: ".concat(valueOf), new Object[0]);
            return false;
        } catch (IOException e2) {
            AccountSettingsChimeraActivity.a.a((Throwable) e2);
            return false;
        } catch (eif e3) {
            AccountSettingsChimeraActivity.a.a((Throwable) e3);
            return false;
        }
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        if (((Boolean) obj).booleanValue()) {
            AccountSettingsChimeraActivity accountSettingsChimeraActivity = this.b;
            iwd iwd = AccountSettingsChimeraActivity.a;
            accountSettingsChimeraActivity.e.a(accountSettingsChimeraActivity.d);
        }
    }
}
