package com.google.android.gms.ads.init;

import android.app.admin.DevicePolicyManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.ads.identifier.settings.e;
import com.google.android.gms.ads.identifier.settings.r;
import com.google.android.gms.ads.internal.config.n;
import com.google.android.gms.ads.settings.internal.a;
import com.google.android.gms.ads.settings.internal.b;
import com.google.android.gms.ads.settings.internal.c;
import java.util.Locale;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ModuleInitializer extends hec {
    /* access modifiers changed from: protected */
    public final void b(Intent intent) {
        int i = jlo.f().getInt("prev_version_code", -1);
        Context applicationContext = getApplicationContext();
        e a = e.a(applicationContext);
        n.a(applicationContext);
        int i2 = Build.VERSION.SDK_INT;
        if (((DevicePolicyManager) applicationContext.getSystemService("device_policy")).isDeviceOwnerApp("com.google.android.apps.enterprise.dmagent")) {
            a aVar = new a(a, i, applicationContext);
            c cVar = new c(applicationContext, aVar);
            Intent intent2 = new Intent("com.google.android.nfcprovision.IOwnedService.BIND");
            intent2.setComponent(new ComponentName("com.google.android.nfcprovision", "com.google.android.nfcprovision.SchoolOwnedService"));
            try {
                if (!jca.a().a(applicationContext, intent2, cVar, 1)) {
                    aVar.a(false);
                }
            } catch (SecurityException e) {
                Log.w("EduDeviceHelper", "Fail to bind to school-ownership service; assuming it's not school-owned.");
                Log.w("EduDeviceHelper", e);
                aVar.a(false);
            }
        }
        if (awhh.i()) {
            Bundle a2 = b.a("gmscore_upgrade", Boolean.toString(a.i()), Integer.toString(i));
            a2.putString("locale", Locale.getDefault().toString());
            com.google.android.gms.ads.internal.b.a().a(applicationContext, (String) null, "gmob-apps", a2);
        }
        r.a(applicationContext).a();
    }
}
