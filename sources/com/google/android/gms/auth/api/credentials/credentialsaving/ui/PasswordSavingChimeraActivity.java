package com.google.android.gms.auth.api.credentials.credentialsaving.ui;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.chimera.Activity;
import com.google.android.chimera.FragmentManager;
import com.google.android.gms.R;
import com.google.android.gms.auth.api.identity.SavePasswordRequest;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class PasswordSavingChimeraActivity extends qcd {
    public final void a(Status status, int i) {
        Intent intent = new Intent();
        ivy.a((SafeParcelable) status, intent, "status");
        setResult(i, intent);
        finish();
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTheme(R.style.ThemeTranslucent);
        SavePasswordRequest savePasswordRequest = (SavePasswordRequest) ivy.a(getIntent(), "save_password_request", SavePasswordRequest.CREATOR);
        String stringExtra = getIntent().getStringExtra("session_id");
        amrl.a((Object) stringExtra);
        String a = jhg.a((Activity) this);
        if (a == null) {
            a(new Status(10, "Calling package not found."), 0);
            return;
        }
        amri a2 = pzs.a(getApplication(), a);
        if (!a2.a()) {
            a(new Status(10, "App info not found."), 0);
            return;
        }
        amri a3 = hiq.a(this, a);
        if (!a3.a()) {
            a(new Status(10, "App ID is not present."), 0);
            return;
        }
        ((fez) qck.a(this, new fey(getApplication(), (String) a3.b(), a, stringExtra, (oq) a2.b(), savePasswordRequest)).a(fez.class)).l.a(this, new fdv(this));
        fcq fcq = (fcq) qck.a(this).a(fcq.class);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        if (supportFragmentManager.findFragmentByTag("PasswordSavingBottomSheetDialogFragment") == null) {
            new fdu().show(supportFragmentManager, "PasswordSavingBottomSheetDialogFragment");
        }
    }
}
