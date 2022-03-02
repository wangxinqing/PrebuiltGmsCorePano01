package com.google.android.gms.auth.managed.intentoperations;

import android.content.Intent;
import com.google.android.gms.auth.managed.ui.SettingsSecurityDeviceOwnerChimeraActivity;
import com.google.android.gms.auth.managed.ui.SetupWorkProfileChimeraActivity;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class AuthManagedModuleInitIntentOperation extends hec {
    protected static final String[] a = {"com.google.android.gms.auth.managed.ui.EmmActivity", "com.google.android.gms.auth.managed.ui.PhoneskyDpcInstallActivity"};
    private static final iwd b = ehv.a("AuthManaged", "AuthManagedModuleInitIntentOperation");

    private final void a() {
        boolean a2 = SetupWorkProfileSettingsIntentOperation.a(getBaseContext());
        SetupWorkProfileChimeraActivity.a(getBaseContext(), a2);
        iwd iwd = b;
        StringBuilder sb = new StringBuilder(42);
        sb.append("Set up work profile activity enabled:");
        sb.append(a2);
        iwd.b(sb.toString(), new Object[0]);
    }

    /* access modifiers changed from: protected */
    public final void a(Intent intent) {
        b.a("onBootCompleted", new Object[0]);
        a();
        gjk.b().b(this);
        if (gjk.b().c()) {
            ghm.a().b(this);
        }
    }

    /* access modifiers changed from: protected */
    public final void a(Intent intent, boolean z) {
        String str;
        boolean z2;
        b.a("onModuleUpdated", new Object[0]);
        amre a2 = amre.a("; ").a();
        iwd iwd = b;
        String[] strArr = a;
        int length = strArr.length;
        String a3 = a2.a((Object[]) strArr);
        StringBuilder sb = new StringBuilder(String.valueOf(a3).length() + 33);
        sb.append("Enabling ");
        sb.append(length);
        sb.append(" components: ");
        sb.append(a3);
        iwd.b(sb.toString(), new Object[0]);
        String[] strArr2 = a;
        int length2 = strArr2.length;
        int i = 0;
        while (true) {
            str = "enabling ";
            z2 = true;
            if (i >= length2) {
                break;
            }
            String str2 = strArr2[i];
            iwd iwd2 = b;
            String valueOf = String.valueOf(str2);
            iwd2.c(valueOf.length() == 0 ? new String(str) : str.concat(valueOf), new Object[0]);
            jhg.a(getBaseContext(), str2, true);
            i++;
        }
        if (!awpl.a.a().a() || !SettingsSecurityDeviceOwnerChimeraActivity.a(getBaseContext())) {
            z2 = false;
        }
        iwd iwd3 = b;
        if (!z2) {
            str = "disabling ";
        }
        iwd3.c(str.concat("com.google.android.gms.auth.managed.ui.SettingsSecurityDeviceOwnerActivity"), new Object[0]);
        try {
            jhg.a(getBaseContext(), "com.google.android.gms.auth.managed.ui.SettingsSecurityDeviceOwnerActivity", z2);
        } catch (IllegalArgumentException e) {
            if (z2) {
                b.d("Component is not available", e, new Object[0]);
            }
        }
        a();
        gjk.b().b(this);
    }
}
