package com.google.android.gms.auth.api.credentials.assistedsignin.ui;

import android.graphics.Bitmap;
import android.os.Bundle;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import com.google.android.chimera.FragmentManager;
import com.google.android.gms.R;
import com.google.android.gms.auth.api.identity.GetSignInIntentRequest;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class GoogleSignInChimeraActivity extends qcd {
    public hol a;

    public final void a(ezf ezf) {
        setResult(ezf.b(), ezf.c());
        finish();
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        setTheme(R.style.ThemeTranslucent);
        super.onCreate(bundle);
        GetSignInIntentRequest getSignInIntentRequest = (GetSignInIntentRequest) ivy.a(getIntent(), "get_sign_in_intent_request", GetSignInIntentRequest.CREATOR);
        this.a = new hol(this, "IDENTITY_GMSCORE", (String) null);
        qbt.a(this, this, new evz(this, getSignInIntentRequest));
        String a2 = jhg.a((Activity) this);
        if (a2 == null) {
            a(ezf.a("Calling package not found"));
            return;
        }
        amri a3 = pzs.a(getApplicationContext(), a2);
        if (!a3.a()) {
            a(ezf.a("Calling package not found"));
            return;
        }
        ((eze) qck.a(this, new ezd(getApplication(), a2, getSignInIntentRequest, (CharSequence) ((oq) a3.b()).a, (Bitmap) ((oq) a3.b()).b)).a(eze.class)).k.a(this, new ewa(this));
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        if (supportFragmentManager.findFragmentByTag("GoogleSignInDialogFragment") == null) {
            new ewd().show(supportFragmentManager, "GoogleSignInDialogFragment");
        }
        FragmentManager supportFragmentManager2 = getSupportFragmentManager();
        if (supportFragmentManager2.findFragmentByTag("GoogleSignInControllerFragment") == null) {
            supportFragmentManager2.beginTransaction().add((Fragment) new ezb(), "GoogleSignInControllerFragment").commitNow();
        }
    }
}
