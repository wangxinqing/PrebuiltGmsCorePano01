package com.google.android.gms.auth.api.credentials.authorization.ui;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import com.google.android.chimera.FragmentManager;
import com.google.android.gms.R;
import com.google.android.gms.auth.api.identity.AuthorizationRequest;
import com.google.android.gms.auth.api.identity.AuthorizationResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class AuthorizationChimeraActivity extends qcd {
    public hol a;
    public String b;
    private String c;

    public final void a(fbm fbm) {
        Intent intent = new Intent();
        ivy.a((SafeParcelable) fbm.b, intent, "status");
        if (fbm.a.a()) {
            ivy.a((SafeParcelable) (AuthorizationResult) fbm.a.b(), intent, "authorization_result");
            setResult(-1, intent);
        } else {
            setResult(0, intent);
        }
        finish();
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        setTheme(R.style.ThemeTranslucent);
        super.onCreate(bundle);
        AuthorizationRequest authorizationRequest = (AuthorizationRequest) ivy.a(getIntent(), "authorization_request", AuthorizationRequest.CREATOR);
        this.b = getIntent().getStringExtra("session_id");
        this.a = new hol(this, "IDENTITY_GMSCORE", (String) null);
        qbt.a(this, this, new ezp(this));
        String a2 = jhg.a((Activity) this);
        if (a2 == null) {
            a(new fbm(new Status(10, "Calling package missing."), ampu.a));
            return;
        }
        this.c = a2;
        ((fbn) qck.a(this, new fbl(this.b)).a(fbn.class)).c.a(this, new ezq(this));
        if (((fbk) getSupportFragmentManager().findFragmentByTag("auth_controller")) == null) {
            getSupportFragmentManager().beginTransaction().add((Fragment) fbk.a(a2, authorizationRequest, this.b), "auth_controller").commitNow();
        }
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        if (supportFragmentManager.findFragmentByTag("dialog") == null) {
            ezu.a(this.c).show(supportFragmentManager, "dialog");
        }
    }
}
