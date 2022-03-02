package com.google.android.gms.drivingmode;

import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import com.google.android.chimera.Activity;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class DrivingModeFrxActivityImpl extends Activity implements lwx {
    lwy a;

    public final lwy a() {
        return this.a;
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        boolean booleanExtra = getIntent().getBooleanExtra("frx_immediate_start", false);
        bundle.putBoolean("DrivingMode.ImmediateStart", booleanExtra);
        int intExtra = getIntent().getIntExtra("client_trigger_reason", 0);
        bundle.putInt("DrivingMode.ClientTriggerReason", intExtra);
        Log.i("CAR.DRIVINGMODE", String.format("DrivingModeFrxActivityImpl started with session arguments: immediateStart = %s; clientTriggerReason = %s", new Object[]{Boolean.valueOf(booleanExtra), Integer.valueOf(intExtra)}));
        return bundle;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0069  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r4) {
        /*
            r3 = this;
            boolean r0 = defpackage.jkr.e()
            if (r0 == 0) goto L_0x0015
            java.lang.String r0 = "setupwizard.theme"
            java.lang.String r1 = ""
            java.lang.String r0 = android.os.SystemProperties.get(r0, r1)
            int r0 = defpackage.bek.a(r0)
            r3.setTheme(r0)
        L_0x0015:
            super.onCreate(r4)
            lwy r4 = new lwy
            r0 = 0
            r4.<init>(r3, r0)
            r3.a = r4
            android.content.Intent r4 = r3.getIntent()
            java.lang.String r0 = "FRX_START_FRAGMENT"
            boolean r4 = r4.hasExtra(r0)
            r1 = 1
            if (r4 == 0) goto L_0x006f
            android.content.Intent r4 = r3.getIntent()
            java.lang.String r4 = r4.getStringExtra(r0)
            int r0 = r4.hashCode()
            r2 = -1135185847(0xffffffffbc567049, float:-0.013088294)
            if (r0 == r2) goto L_0x004e
            r2 = 1733800235(0x6757b12b, float:1.018577E24)
            if (r0 == r2) goto L_0x0044
            goto L_0x0058
        L_0x0044:
            java.lang.String r0 = "GEARHEAD_INSTALL"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0058
            r4 = 1
            goto L_0x0059
        L_0x004e:
            java.lang.String r0 = "DND_ACCESS"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0058
            r4 = 0
            goto L_0x0059
        L_0x0058:
            r4 = -1
        L_0x0059:
            if (r4 == 0) goto L_0x0069
            if (r4 == r1) goto L_0x0063
            lvx r4 = new lvx
            r4.<init>()
            goto L_0x0074
        L_0x0063:
            lvr r4 = new lvr
            r4.<init>()
            goto L_0x0074
        L_0x0069:
            lvo r4 = new lvo
            r4.<init>()
            goto L_0x0074
        L_0x006f:
            lvx r4 = new lvx
            r4.<init>()
        L_0x0074:
            lwy r0 = r3.a
            r0.a((com.google.android.chimera.Fragment) r4)
            android.content.Intent r4 = r3.getIntent()
            java.lang.String r0 = "com.google.android.location.activity.DRIVING_MODE_NOTIFICATION"
            boolean r4 = r4.getBooleanExtra(r0, r1)
            if (r4 == 0) goto L_0x0093
            defpackage.lww.a()
            lts r4 = defpackage.lww.e(r3)
            anxx r0 = defpackage.anxx.DRIVING_MODE_FRX_INTRO
            anxw r2 = defpackage.anxw.DRIVING_MODE_FRX_STARTED_BY_LEAVE_BEHIND_NOTIFICATION
            r4.a((defpackage.anxx) r0, (defpackage.anxw) r2)
        L_0x0093:
            r3.setRequestedOrientation(r1)
            lwu r4 = new lwu
            android.content.Context r0 = r3.getApplicationContext()
            r4.<init>(r0)
            r4.b()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.drivingmode.DrivingModeFrxActivityImpl.onCreate(android.os.Bundle):void");
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }
}
