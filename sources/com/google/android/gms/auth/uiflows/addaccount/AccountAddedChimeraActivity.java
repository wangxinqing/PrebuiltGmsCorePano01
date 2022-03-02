package com.google.android.gms.auth.uiflows.addaccount;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.R;
import com.google.android.setupdesign.GlifLayout;
import com.google.android.setupdesign.SetupWizardLayout;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class AccountAddedChimeraActivity extends gnx implements aljq {
    public static Intent a(Context context, boolean z, ijn ijn) {
        Bundle bundle;
        Intent className = new Intent().setClassName(context, "com.google.android.gms.auth.uiflows.addaccount.AccountAddedActivity");
        fzl fzl = new fzl();
        fzl.b(gmz.j, Boolean.valueOf(z));
        fzk fzk = gmz.i;
        if (ijn != null) {
            bundle = ijn.a();
        } else {
            bundle = null;
        }
        fzl.b(fzk, bundle);
        return className.putExtras(fzl.a);
    }

    private final void c() {
        alhs.a(getWindow(), false);
    }

    public final void aL() {
    }

    /* access modifiers changed from: protected */
    public final String b() {
        return "AccountAddedActivity";
    }

    public final void onBackPressed() {
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        if (!ijm.a(g().a)) {
            i = R.layout.auth_account_added_activity;
        } else {
            i = R.layout.auth_account_added_glif_activity;
        }
        ijo a = ijo.a(this, i);
        setContentView((View) a.a());
        a.a(getTitle());
        if (a.a() instanceof SetupWizardLayout) {
            SetupWizardLayout setupWizardLayout = (SetupWizardLayout) a.a();
            setupWizardLayout.c().a((aljq) this);
            setupWizardLayout.c().b.setVisibility(4);
            c();
        } else {
            alhf alhf = new alhf(this);
            alhf.a(R.string.sud_next_button_label);
            alhf.b = new gky(this);
            alhf.c = 5;
            alhf.d = 2132018060;
            ((alhe) ((GlifLayout) a.a().findViewById(R.id.setup_wizard_layout)).a(alhe.class)).a(alhf.a());
        }
        ijm.a(a.a());
    }

    public final void onResume() {
        super.onResume();
        c();
    }

    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        c();
    }

    public final void a() {
        a(-1, (Intent) null);
    }
}
