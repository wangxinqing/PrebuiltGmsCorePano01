package com.google.android.gms.nearby.sharing;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.UserManager;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ModuleInitializer extends IntentOperation {
    private static final String a = jkq.a("com.google.android.gms.nearby");

    public static boolean a(Context context) {
        if (!ayni.p() || Build.VERSION.SDK_INT < 23 || !context.getPackageManager().hasSystemFeature("android.hardware.bluetooth") || !context.getPackageManager().hasSystemFeature("android.hardware.bluetooth_le") || ((b(context) && !ayni.a.a().bf()) || (ayni.a.a().r() && jkr.e() && ((UserManager) context.getSystemService("user")).getUserRestrictions().getBoolean("no_bluetooth_sharing", false)))) {
            return false;
        }
        return true;
    }

    public static boolean b(Context context) {
        return kf.a(context, "android.permission.MANAGE_USERS") == 0 && jkb.a(context).d();
    }

    public final void onHandleIntent(Intent intent) {
        String action = intent.getAction();
        if ((!"com.google.android.gms.phenotype.COMMITTED".equals(action) && !a.equals(action)) || "com.google.android.gms.nearby".equals(intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME"))) {
            boolean a2 = a(this);
            tfy.a(this, "com.google.android.gms.nearby.sharing.DirectShareService", a2);
            tfy.a(this, "com.google.android.gms.nearby.sharing.SharingSyncService", a2);
            tfy.a(this, "com.google.android.gms.nearby.sharing.ShareSheetActivity", a2);
            tfy.a(this, "com.google.android.gms.nearby.sharing.SettingsActivity", a2);
            tfy.a(this, "com.google.android.gms.nearby.sharing.SetupActivity", a2);
            tfy.a(this, "com.google.android.gms.nearby.sharing.ReceiveSurfaceActivity", a2);
            tfy.a(this, "com.google.android.gms.nearby.sharing.SettingsActivityAlias", a2);
            tfy.a(this, "com.google.android.gms.nearby.sharing.ReceiveSurfaceService", a2);
            boolean z = false;
            if (a2 && jkr.c()) {
                z = true;
            }
            tfy.a(this, "com.google.android.gms.nearby.sharing.SharingTileService", z);
            if (Build.VERSION.SDK_INT >= 23) {
                tfy.a(this, "com.google.android.gms.nearby.sharing.ReceiveSurfaceService", true);
                startService(new Intent().setClassName(this, "com.google.android.gms.nearby.sharing.ReceiveSurfaceService"));
            }
            if (!a2) {
                ((anih) vvj.a.d()).a("Runtime state initialization complete. Sharing is disabled.");
            } else {
                ((anih) vvj.a.d()).a("Runtime state initialization complete. Sharing is enabled.");
            }
        }
    }
}
