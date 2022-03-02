package com.google.android.gms.auth.uiflows.addaccount;

import android.accounts.Account;
import android.accounts.AccountAuthenticatorResponse;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.chimera.Fragment;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class BrowserSignInChimeraActivity extends gmz implements gnc, gle {
    private static final fzk a = fzk.a("am_response");
    private static final fzk b = fzk.a("url");
    private static final fzk c = fzk.a("account_type");
    private static final fzk d = fzk.a("account_name");
    private AccountAuthenticatorResponse e;

    public static Intent a(Context context, AccountAuthenticatorResponse accountAuthenticatorResponse, String str, String str2, String str3, ijn ijn) {
        Intent className = new Intent().setClassName(context, "com.google.android.gms.auth.uiflows.addaccount.BrowserSignInActivity");
        fzl fzl = new fzl();
        fzl.b(a, accountAuthenticatorResponse);
        fzk fzk = b;
        iva.c(str);
        fzl.b(fzk, str);
        fzk fzk2 = c;
        iva.c(str2);
        fzl.b(fzk2, str2);
        fzl.b(d, str3);
        fzl.b(gmz.j, false);
        fzl.b(gmz.i, ijn.a());
        return className.putExtras(fzl.a);
    }

    private final void k() {
        AccountAuthenticatorResponse accountAuthenticatorResponse = this.e;
        if (accountAuthenticatorResponse != null) {
            accountAuthenticatorResponse.onError(5, "add account failed");
        }
        setResult(0, new Intent().putExtra("errorCode", 5).putExtra("errorMessage", "add account failed"));
        finish();
    }

    /* access modifiers changed from: protected */
    public final String b() {
        return "BrowserSignInActivity";
    }

    public final void c() {
        k();
    }

    public final void e() {
        k();
    }

    public final void onBackPressed() {
        AccountAuthenticatorResponse accountAuthenticatorResponse = this.e;
        if (accountAuthenticatorResponse != null) {
            accountAuthenticatorResponse.onError(4, "user canceled");
        }
        super.onBackPressed();
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.e = (AccountAuthenticatorResponse) f().a(a);
        if (bundle == null) {
            getSupportFragmentManager().beginTransaction().add(16908290, (Fragment) gnd.a()).commit();
        }
    }

    public final void a(int i) {
        k();
    }

    public final void a(Account account, String str, boolean z, Intent intent, boolean z2, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("authAccount", account.name);
        bundle.putString("accountType", account.type);
        AccountAuthenticatorResponse accountAuthenticatorResponse = this.e;
        if (accountAuthenticatorResponse != null) {
            accountAuthenticatorResponse.onResult(bundle);
        }
        setResult(-1, new Intent().putExtras(bundle));
        finish();
    }

    public final void a(gnd gnd) {
        Uri.Builder buildUpon = Uri.parse((String) f().a(b)).buildUpon();
        String str = (String) f().a(d);
        if (str != null) {
            buildUpon.appendQueryParameter("Email", str);
            buildUpon.appendQueryParameter("tmpl", "reauth");
        } else {
            buildUpon.appendQueryParameter("tmpl", "new_account");
        }
        String uri = buildUpon.build().toString();
        gom.a().b();
        gnd.a(uri);
    }

    public final void a(gol gol) {
        if (gol.a != null) {
            glf.a(this, false, false, (String) f().a(c), gol.a, gol.b, (String) null, false, false, false);
        }
    }
}
