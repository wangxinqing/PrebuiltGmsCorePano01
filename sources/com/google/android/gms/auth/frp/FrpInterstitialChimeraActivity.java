package com.google.android.gms.auth.frp;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import com.android.setupwizard.navigationbar.SetupWizardNavBar;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class FrpInterstitialChimeraActivity extends ggc implements bdc {
    public String a;
    private AsyncTask m;
    private alkg n;
    private View o;

    private final void a(Bundle bundle) {
        this.a = bundle.getString("account_id");
    }

    private final void i() {
        this.o = this.n.a();
    }

    private final synchronized void j() {
        AsyncTask asyncTask = this.m;
        if (asyncTask != null) {
            asyncTask.cancel(false);
            this.m = null;
        }
    }

    public final void b() {
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        alkg alkg = this.n;
        if (alkg != null) {
            alkg.removeView(this.o);
            i();
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            a(getIntent().getExtras());
        } else {
            a(bundle);
        }
        if (e() == null) {
            alkg alkg = new alkg(this);
            this.n = alkg;
            setContentView((View) alkg);
            this.m = new gfj(this).execute(new Void[0]);
        }
        i();
    }

    public final void onDestroy() {
        j();
        super.onDestroy();
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("account_id", this.a);
    }

    public final void a() {
        j();
        Intent intent = new Intent();
        intent.putExtra("errorCode", 4);
        setResult(0, intent);
        finish();
    }

    public final void a(SetupWizardNavBar setupWizardNavBar) {
        boolean z = this.e;
        setupWizardNavBar.a(z, z);
        setupWizardNavBar.a.setVisibility(4);
    }
}
