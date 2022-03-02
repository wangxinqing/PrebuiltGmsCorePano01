package com.google.android.gms.auth.login;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import com.android.setupwizard.navigationbar.SetupWizardNavBar;
import com.google.android.gms.auth.firstparty.dataservice.TokenRequest;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class LoginActivityChimeraTask extends ggc implements View.OnClickListener, bdc {
    public static final /* synthetic */ int n = 0;
    private static final String o;
    private static final String p;
    private static final String q = String.valueOf(o).concat(".token_request");
    private static final String r = String.valueOf(o).concat(".backup");
    private static final String s = String.valueOf(o).concat(".title");
    private static final String t = String.valueOf(o).concat(" .browser_request");
    private static final String u = String.valueOf(o).concat(".confirming_credentials");
    private static final String v = String.valueOf(o).concat(".allow_credit_card");
    private boolean A;
    private String B;
    private ggx C;
    private alkg D;
    private View E;
    public TokenRequest a;
    public boolean m;
    private String w;
    private String x;
    private boolean y;
    private boolean z;

    static {
        String concat = String.valueOf(LoginActivityChimeraTask.class.getName()).concat(".");
        o = concat;
        p = String.valueOf(concat).concat("auth_code");
    }

    public static Intent a(Context context, TokenRequest tokenRequest, String str, String str2, boolean z2, boolean z3, String str3, boolean z4) {
        return new Intent().setClassName(context, "com.google.android.gms.auth.login.LoginActivityTask").putExtra(q, tokenRequest).putExtra("password", str).putExtra(p, str2).putExtra(r, false).putExtra(t, z2).putExtra(u, z3).putExtra(v, z4).putExtra(s, str3);
    }

    private final void j() {
        this.E = this.D.a();
    }

    public final void b() {
    }

    public final void c() {
        ggh ggh = new ggh(this, getApplicationContext(), this.a, this.x, this.w, this.y, this.z, this.A);
        this.C = ggh;
        ggh.execute(new Object[0]);
    }

    public final void i() {
        if (!this.C.cancel(false)) {
            Log.w("GLSActivity", "LoginActivityTask.BackgroudTask failed to cancel.");
        }
        Intent intent = new Intent();
        intent.putExtra("errorCode", 4);
        setResult(0, intent);
        finish();
    }

    public void onClick(View view) {
        i();
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        alkg alkg = this.D;
        if (alkg != null) {
            alkg.removeView(this.E);
            j();
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
            int i = Build.VERSION.SDK_INT;
            alkg alkg = new alkg(this);
            this.D = alkg;
            setContentView((View) alkg);
            c();
        }
        int i2 = Build.VERSION.SDK_INT;
        j();
    }

    public final void onPause() {
        super.onPause();
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable(q, this.a);
        bundle.putString("password", this.x);
        bundle.putString(p, this.w);
        bundle.putBoolean(r, this.y);
        bundle.putBoolean(t, this.z);
        bundle.putBoolean(u, this.A);
        bundle.putString(s, this.B);
        bundle.putBoolean(v, this.m);
    }

    private final void a(Bundle bundle) {
        this.a = (TokenRequest) bundle.getParcelable(q);
        this.x = bundle.getString("password");
        this.w = bundle.getString(p);
        this.y = bundle.getBoolean(r, false);
        this.B = bundle.getString(s);
        this.z = bundle.getBoolean(t, false);
        this.A = bundle.getBoolean(u, false);
        this.m = bundle.getBoolean(v, false);
    }

    public final void a() {
        i();
    }

    public final void a(SetupWizardNavBar setupWizardNavBar) {
        boolean z2 = this.e;
        setupWizardNavBar.a(z2, z2);
        setupWizardNavBar.b.setVisibility(4);
        setupWizardNavBar.a.setEnabled(false);
    }
}
