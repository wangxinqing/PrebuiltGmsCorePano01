package com.google.android.gms.auth.uiflows.gettoken;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;
import com.google.android.gms.R;
import com.google.android.gms.auth.firstparty.dataservice.TokenRequest;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class GetTokenChimeraActivity extends gnx implements LoaderManager.LoaderCallbacks {
    public static final fzk a = fzk.a("response");
    public static final fzk b = fzk.a("isSupervisedMemberAccount");
    public static final fzk c = fzk.a("request");
    private static final fzk d = fzk.a("suppress_ui");

    public static Intent a(Context context, TokenRequest tokenRequest, boolean z, boolean z2, ijn ijn) {
        Intent className = new Intent().setClassName(context, "com.google.android.gms.auth.uiflows.gettoken.GetTokenActivity");
        fzl fzl = new fzl();
        fzl.b(c, tokenRequest);
        fzl.b(d, Boolean.valueOf(z));
        fzl.b(gmz.j, Boolean.valueOf(z2));
        fzl.b(gmz.i, ijn.a());
        return className.putExtras(fzl.a);
    }

    /* access modifiers changed from: protected */
    public final void aI() {
        if (((Boolean) f().a(d, false)).booleanValue()) {
            setTheme(R.style.InvisibleCustomTitle);
        } else {
            setTheme(2132019153);
        }
    }

    /* access modifiers changed from: protected */
    public final String b() {
        return "GetTokenActivity";
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!((Boolean) f().a(d, false)).booleanValue() && bundle == null) {
            gng gng = new gng();
            fzl fzl = new fzl();
            fzl.b(gng.b, Integer.valueOf(R.string.auth_gls_name_checking_info_title));
            gng.setArguments(fzl.a);
            gng.show(getSupportFragmentManager(), "dialog");
        }
        getSupportLoaderManager().initLoader(0, (Bundle) null, this);
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        return new gnz(this, this, awjd.a.a().b());
    }

    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        a(-1, new Intent().putExtras((Bundle) obj));
    }

    public final void onLoaderReset(Loader loader) {
    }

    static {
        fzk.a("consent_intent");
    }
}
