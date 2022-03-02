package com.google.firebase.auth.api.gms;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ModuleInitializer extends hec {
    private static final iwd a = new iwd("FBAuthModuleInit", new String[0]);
    private static final String[] b = {"com.google.firebase.auth.api.gms.service.FirebaseAuthService", "com.google.firebase.auth.api.gms.ui.BrowserSignInStarterActivity", "com.google.firebase.auth.api.gms.ui.BrowserSignInResponseHandlerActivity"};

    /* access modifiers changed from: protected */
    public final void a(Intent intent, boolean z) {
        for (String str : b) {
            iwd iwd = a;
            String valueOf = String.valueOf(str);
            iwd.a(valueOf.length() == 0 ? new String("onModuleUpdated, enabling: ") : "onModuleUpdated, enabling: ".concat(valueOf), new Object[0]);
            jhg.a((Context) this, str, true);
        }
    }
}
