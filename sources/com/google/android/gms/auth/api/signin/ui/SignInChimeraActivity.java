package com.google.android.gms.auth.api.signin.ui;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.chimera.Activity;
import com.google.android.chimera.FragmentActivity;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.SignInConfiguration;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class SignInChimeraActivity extends qcd {
    public GoogleSignInOptions a;
    public String b;
    public hol c;
    public Intent d;
    public String e;
    private final iwd f = new iwd("Auth.Api.SignIn", "Activity", "SignInChimeraActivity");
    private qao g;
    private hol h;

    public final void a(int i) {
        if (((Boolean) fvx.c.c()).booleanValue()) {
            this.h.a((audx) fxj.a(this.b, 3, Integer.valueOf(i), this.a)).b();
        }
    }

    public final void finish() {
        if (this.d == null) {
            Intent intent = new Intent();
            intent.putExtra("errorCode", Status.e.i);
            setResult(0, intent);
            this.f.c("User exited the activity.", new Object[0]);
        }
        super.finish();
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTheme(2132017716);
        this.h = new hol(this, "ANDROID_AUTH", (String) null);
        this.c = new hol(this, "IDENTITY_GMSCORE", (String) null);
        if (bundle != null) {
            GoogleSignInOptions googleSignInOptions = (GoogleSignInOptions) bundle.getParcelable("sign_in_options");
            amrl.a((Object) googleSignInOptions);
            this.a = googleSignInOptions;
            String string = bundle.getString("consumer_package_name");
            amrl.a((Object) string);
            this.b = string;
            this.e = this.a.p;
        } else if (!"com.google.android.gms.auth.GOOGLE_SIGN_IN".equals(getIntent().getAction())) {
            this.f.e("Unknown action sent to SignInActivity", new Object[0]);
            a(0, (Intent) null);
            return;
        } else {
            SignInConfiguration signInConfiguration = (SignInConfiguration) getIntent().getParcelableExtra("config");
            if (signInConfiguration == null) {
                this.f.e("Activity started with invalid configuration.", new Object[0]);
                a(0, (Intent) null);
                return;
            }
            String a2 = jhg.a((Activity) this);
            if (a2 == null || !a2.equals(signInConfiguration.a)) {
                this.f.e("Calling package [%s] does not match configuration.", amrk.b(a2));
                a(0, (Intent) null);
                return;
            }
            this.b = a2;
            GoogleSignInOptions googleSignInOptions2 = signInConfiguration.b;
            String str = googleSignInOptions2.p;
            if (str == null) {
                this.e = qbw.a();
                fvt fvt = new fvt(googleSignInOptions2);
                fvt.b = this.e;
                GoogleSignInOptions a3 = fvt.a();
                this.a = a3;
                Scope[] b2 = a3.b();
                GoogleSignInOptions googleSignInOptions3 = this.a;
                if (azgq.b()) {
                    this.c.a((audx) qcy.a(this.b, b2, googleSignInOptions3.p, googleSignInOptions3.j, googleSignInOptions3.l, googleSignInOptions3.k)).b();
                }
            } else {
                this.a = googleSignInOptions2;
                this.e = str;
            }
            iwd iwd = this.f;
            String valueOf = String.valueOf(this.e);
            iwd.b(valueOf.length() == 0 ? new String("Log Session ID: ") : "Log Session ID: ".concat(valueOf), new Object[0]);
        }
        if (azgq.b()) {
            qbt.a(this, this, new fxf(this));
        }
        qao a4 = qao.a((FragmentActivity) this);
        this.g = a4;
        aorl.a(a4.b(1, new fxg(this)), new fxh(this), aoqm.a);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("sign_in_options", this.a);
        bundle.putString("consumer_package_name", this.b);
    }

    public final void a(int i, Intent intent) {
        if (intent != null) {
            setResult(i, intent);
        } else {
            setResult(i);
        }
        finish();
    }
}
