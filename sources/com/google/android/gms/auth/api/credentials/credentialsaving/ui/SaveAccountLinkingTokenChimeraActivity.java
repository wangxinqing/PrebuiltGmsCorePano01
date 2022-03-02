package com.google.android.gms.auth.api.credentials.credentialsaving.ui;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import com.google.android.chimera.FragmentManager;
import com.google.android.gms.R;
import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class SaveAccountLinkingTokenChimeraActivity extends qcd {
    public hol a;
    public String b;
    private String c;

    public final void a(fej fej) {
        Intent intent = new Intent();
        ivy.a((SafeParcelable) fej.b, intent, "status");
        if (fej.a.a()) {
            ivy.a((SafeParcelable) (SaveAccountLinkingTokenResult) fej.a.b(), intent, "save_account_linking_token_result");
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
        this.b = getIntent().getStringExtra("session_id");
        this.a = new hol(this, "IDENTITY_GMSCORE", (String) null);
        qbt.a(this, this, new fdw(this));
        String a2 = jhg.a((Activity) this);
        if (a2 == null) {
            a(new fej(new Status(10, "Calling package missing."), ampu.a));
            return;
        }
        this.c = a2;
        if (((fei) getSupportFragmentManager().findFragmentByTag("controller")) == null) {
            getSupportFragmentManager().beginTransaction().add((Fragment) fei.a(this.c, this.b), "controller").commitNow();
        }
        ((fek) qck.a(this).a(fek.class)).d.a(this, new fdx(this));
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        if (supportFragmentManager.findFragmentByTag("dialog") == null) {
            fdz.a(this.c).show(supportFragmentManager, "dialog");
        }
    }
}
