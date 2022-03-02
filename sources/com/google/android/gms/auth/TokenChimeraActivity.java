package com.google.android.gms.auth;

import android.accounts.Account;
import android.accounts.AccountAuthenticatorResponse;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.chimera.Activity;
import com.google.android.gms.auth.firstparty.shared.AppDescription;

@Deprecated
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class TokenChimeraActivity extends Activity {
    private boolean a = false;
    private String b;
    private String c;
    private Bundle d = new Bundle();
    private AppDescription e;
    private String f = null;
    private fyk g;

    /* access modifiers changed from: package-private */
    public final void a(Intent intent, boolean z) {
        String stringExtra;
        Intent intent2 = new Intent();
        Intent intent3 = getIntent();
        intent2.putExtra("authAccount", this.b);
        intent2.putExtra("service", this.c);
        intent2.putExtra("callerExtras", this.d);
        if (z) {
            fyo.b.b(intent2);
            setResult(0, intent2);
            AccountAuthenticatorResponse accountAuthenticatorResponse = (AccountAuthenticatorResponse) intent3.getParcelableExtra("response");
            if (accountAuthenticatorResponse != null) {
                accountAuthenticatorResponse.onError(4, "canceled");
            }
            finish();
            return;
        }
        gei a2 = fyo.a(intent);
        if (a2 != null) {
            fyo.a(a2).b(intent2);
        }
        if (!(intent == null || (stringExtra = intent.getStringExtra("authtoken")) == null || !this.a)) {
            intent2.putExtra("authtoken", stringExtra);
        }
        AccountAuthenticatorResponse accountAuthenticatorResponse2 = (AccountAuthenticatorResponse) intent3.getParcelableExtra("response");
        if (accountAuthenticatorResponse2 != null) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("retry", true);
            accountAuthenticatorResponse2.onResult(bundle);
        }
        setResult(-1, intent2);
        finish();
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == 0) {
            a(intent, true);
        } else if (i == 1001) {
            a(intent, false);
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().clearFlags(2);
        this.g = new fyk(this);
        if (bundle != null) {
            a(bundle);
            return;
        }
        a(getIntent().getExtras());
        String string = this.d.getString(eig.b);
        if (string != null) {
            int a2 = this.g.a(string);
            String a3 = jhg.a((Activity) this);
            this.a = true;
            if (a3 == null) {
                if (this.d.containsKey("clientPackageName")) {
                    a3 = this.d.getString("clientPackageName");
                } else {
                    a3 = this.g.d;
                }
                this.a = false;
            }
            this.d.putString("clientPackageName", a3);
            this.e = ((fyi) fyi.a.b()).a(getApplicationInfo().uid, this.g.a(a3), string, a2, this.g);
        }
        String str = this.b;
        String str2 = this.c;
        AppDescription appDescription = this.e;
        if (str == null || str2 == null || appDescription == null || appDescription.b == 0 || !jgu.a((Context) this, new Account(str, "com.google"))) {
            setResult(0);
            finish();
            return;
        }
        new eir(this, this.f, this.b, this.c, this.d, this.e).execute(new Object[0]);
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("authAccount", this.b);
        bundle.putString("service", this.c);
        bundle.putBundle("callerExtras", this.d);
        bundle.putBoolean("is_for_result", this.a);
    }

    public final void a(Bundle bundle) {
        this.c = bundle.getString("service");
        this.d = bundle.getBundle("callerExtras");
        this.b = bundle.getString("authAccount");
        this.a = bundle.getBoolean("is_for_result");
        this.f = this.d.getString("request_visible_actions");
    }
}
