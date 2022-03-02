package com.google.android.gms.auth.managed.config;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.auth.managed.intentoperations.SetupWorkProfileSettingsIntentOperation;
import com.google.android.gms.auth.managed.ui.SetupWorkProfileChimeraActivity;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ConfigChangedIntentOperation extends IntentOperation {
    private static final iwd a = ehv.a("AuthManaged", "ConfigChangedIntentOperation");

    public final void onHandleIntent(Intent intent) {
        a.a("onHandleIntent", new Object[0]);
        SetupWorkProfileChimeraActivity.a(getBaseContext(), SetupWorkProfileSettingsIntentOperation.a(getBaseContext()));
        gjk.b().b(this);
    }
}
