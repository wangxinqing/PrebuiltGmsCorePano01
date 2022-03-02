package com.google.android.gms.auth.uiflows.common;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;
import com.google.android.gms.R;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class UpdateCredentialsChimeraActivity extends gnf implements LoaderManager.LoaderCallbacks {
    public static final fzk a = fzk.a("token_handle");
    public static final fzk b = fzk.a("succeeded");
    private static final iwd c = ehv.a("UpdateCredentialsActivity");
    private static final fzk d = fzk.a("account_type");
    private static final fzk e = fzk.a("auth_code");

    public static Intent a(Context context, Account account, String str, boolean z, ijn ijn) {
        Intent className = new Intent().setClassName(context, "com.google.android.gms.auth.uiflows.common.UpdateCredentialsActivity");
        fzl a2 = gnf.a(ijn, z, R.string.auth_gls_name_checking_info_title);
        a2.b(d, account);
        a2.b(e, str);
        return className.putExtras(a2.a);
    }

    /* access modifiers changed from: protected */
    public final void aI() {
        if (ekh.a.b(this)) {
            setTheme(R.style.TvMinuteMaidOpaque);
        } else {
            super.aI();
        }
    }

    /* access modifiers changed from: protected */
    public final String b() {
        return "UpdateCredentialsActivity";
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (ekh.a.b(this)) {
            setContentView(LayoutInflater.from(this).inflate(R.layout.auth_tv_suw_glif_activity, (ViewGroup) null));
        }
        getSupportLoaderManager().initLoader(0, (Bundle) null, this);
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        return new gnk(this, (Account) f().a(d), (String) f().a(e), g().c);
    }

    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        Bundle bundle = (Bundle) obj;
        Account account = (Account) f().a(d);
        if (bundle == null || !bundle.getBoolean(b.a)) {
            iwd iwd = c;
            String valueOf = String.valueOf(account);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 42);
            sb.append("Failed to update credentails for account: ");
            sb.append(valueOf);
            iwd.d(sb.toString(), new Object[0]);
            a(0, (Intent) null);
            return;
        }
        iwd iwd2 = c;
        String valueOf2 = String.valueOf(account);
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 33);
        sb2.append("Updated credentials for account: ");
        sb2.append(valueOf2);
        iwd2.c(sb2.toString(), new Object[0]);
        a(-1, new Intent().putExtras(bundle));
    }

    public final void onLoaderReset(Loader loader) {
    }
}
