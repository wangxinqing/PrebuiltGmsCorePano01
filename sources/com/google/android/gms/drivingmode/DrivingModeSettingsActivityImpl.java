package com.google.android.gms.drivingmode;

import android.os.Bundle;
import android.view.MenuItem;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class DrivingModeSettingsActivityImpl extends bjs implements lwx, lxi {
    lwy a;
    lwl b;

    public final lwy a() {
        return this.a;
    }

    public final void a(lwl lwl) {
        this.b = lwl;
    }

    public final Bundle b() {
        return new Bundle();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0058, code lost:
        if (defpackage.lww.d(r3).b() != false) goto L_0x0078;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r4) {
        /*
            r3 = this;
            super.onCreate(r4)
            android.content.Intent r4 = r3.getIntent()
            java.lang.String r0 = r4.getAction()
            if (r0 == 0) goto L_0x002b
            java.lang.String r4 = r4.getAction()
            java.lang.String r0 = "com.google.android.gms.drivingmode.Invoked_from_search"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x002b
            defpackage.lww.a()
            android.content.Context r4 = r3.getApplicationContext()
            lts r4 = defpackage.lww.e(r4)
            anxx r0 = defpackage.anxx.DRIVING_MODE
            anxw r1 = defpackage.anxw.DRIVING_MODE_SETTINGS_FROM_SEARCH
            r4.a((defpackage.anxx) r0, (defpackage.anxw) r1)
        L_0x002b:
            defpackage.lww.a()
            lvy r4 = defpackage.lww.h(r3)
            android.content.SharedPreferences r0 = r4.a
            java.lang.String r1 = "force_frx_rerun_once"
            r2 = 0
            boolean r0 = r0.getBoolean(r1, r2)
            if (r0 == 0) goto L_0x0041
            r4.a(r2)
            goto L_0x005b
        L_0x0041:
            boolean r0 = r4.a()
            if (r0 != 0) goto L_0x0078
            boolean r0 = r4.b()
            if (r0 != 0) goto L_0x0078
            defpackage.lww.a()
            ltp r0 = defpackage.lww.d(r3)
            boolean r0 = r0.b()
            if (r0 == 0) goto L_0x005b
            goto L_0x0078
        L_0x005b:
            defpackage.lww.a()
            lts r4 = defpackage.lww.e(r3)
            anxx r0 = defpackage.anxx.DRIVING_MODE
            anxw r1 = defpackage.anxw.DRIVING_MODE_FRX_STARTED_BY_SETTING_ACCESS
            r4.a((defpackage.anxx) r0, (defpackage.anxw) r1)
            android.content.ComponentName r4 = defpackage.lto.c()
            android.content.Intent r4 = android.content.Intent.makeMainActivity(r4)
            r3.startActivity(r4)
            r3.finish()
            return
        L_0x0078:
            boolean r0 = defpackage.awqd.f()
            if (r0 == 0) goto L_0x0082
            r0 = 1
            r4.a(r0)
        L_0x0082:
            lwy r4 = new lwy
            sg r0 = r3.aE()
            r4.<init>(r3, r0)
            r3.a = r4
            lwr r0 = new lwr
            r0.<init>()
            r4.a((com.google.android.chimera.Fragment) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.drivingmode.DrivingModeSettingsActivityImpl.onCreate(android.os.Bundle):void");
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }

    public final void onWindowFocusChanged(boolean z) {
        lwl lwl = this.b;
        if (lwl != null) {
            lwr lwr = lwl.a;
            StringBuilder sb = new StringBuilder(49);
            sb.append("DrivingModeSettingsFragment#onFocusChanged: ");
            sb.append(z);
            sb.toString();
            if (z && lwr.e.j() == 2) {
                lwr.e();
            }
        }
    }
}
