package com.google.android.gms.auth.api.credentials.assistedsignin.ui;

import android.os.Bundle;
import com.google.android.chimera.Activity;
import com.google.android.chimera.FragmentManager;
import com.google.android.gms.R;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class AssistedSignInChimeraActivity extends qcd {
    public hol a;
    public String b;
    private eyf c;

    public final void a(ezf ezf) {
        setResult(ezf.b(), ezf.c());
        finish();
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        setTheme(R.style.ThemeTranslucent);
        super.onCreate(bundle);
        BeginSignInRequest beginSignInRequest = (BeginSignInRequest) ivy.a(getIntent(), "begin_sign_in_request", BeginSignInRequest.CREATOR);
        String stringExtra = getIntent().getStringExtra("session_id");
        amrl.a((Object) stringExtra);
        this.b = stringExtra;
        this.a = new hol(this, "IDENTITY_GMSCORE", (String) null);
        qbt.a(this, this, new evt(this));
        String a2 = jhg.a((Activity) this);
        if (a2 == null) {
            a(ezf.a("Calling package missing."));
            return;
        }
        amri a3 = pzs.a(getApplicationContext(), a2);
        if (!a3.a()) {
            a(ezf.a("Calling package not found."));
            return;
        }
        fcq fcq = (fcq) qck.a(this).a(fcq.class);
        eyf eyf = (eyf) qck.a(this, new eyb(getApplication(), a2, (oq) a3.b(), beginSignInRequest, this.b)).a(eyf.class);
        this.c = eyf;
        eyf.j.a(this, new evu(this));
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        if (supportFragmentManager.findFragmentByTag("AssistedSignInDialogFragment") == null) {
            new evy().show(supportFragmentManager, "AssistedSignInDialogFragment");
        }
    }
}
