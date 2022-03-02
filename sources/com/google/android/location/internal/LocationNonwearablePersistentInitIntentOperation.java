package com.google.android.location.internal;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.provider.Settings;
import android.util.Log;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class LocationNonwearablePersistentInitIntentOperation extends IntentOperation {
    static final String a = jkq.a("com.google.android.gms.car");
    static final String b = jkq.a("com.google.android.location");

    private final void a() {
        boolean z;
        if (!b() || !aycw.d()) {
            z = false;
        } else {
            z = true;
        }
        jhg.a((Context) this, "com.google.android.location.drivingmode.DrivingModeFrxActivity", b());
        jhg.a((Context) this, lto.b.getClassName(), b());
        if (jkr.g()) {
            jhg.a((Context) this, "com.google.android.location.drivingmode.DrivingModeSettingsActivity", z);
            jhg.a((Context) this, "com.google.android.location.drivingmode.DrivingModeSettingsNoSummaryActivity", false);
            return;
        }
        jhg.a((Context) this, "com.google.android.location.drivingmode.DrivingModeSettingsActivity", false);
        jhg.a((Context) this, "com.google.android.location.drivingmode.DrivingModeSettingsNoSummaryActivity", z);
    }

    private static final boolean b() {
        return awqd.d() && awqm.b();
    }

    public final void onHandleIntent(Intent intent) {
        String action = intent.getAction();
        int i = 1;
        if ("com.google.android.gms.phenotype.COMMITTED".equals(action) || a.equals(action) || b.equals(action)) {
            String stringExtra = intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME");
            if ("com.google.android.gms.car".equals(stringExtra) || "com.google.android.location".equals(stringExtra)) {
                a();
                if (awqm.b()) {
                    if (!awqd.d() || !aycw.d()) {
                        i = 0;
                    }
                    lww.a();
                    if (!jkr.b() || Settings.System.canWrite(this)) {
                        try {
                            Settings.System.putInt(getContentResolver(), "gearhead:driving_mode_settings_enabled", i);
                        } catch (IllegalArgumentException e) {
                            Log.e("CAR.DRIVINGMODE", "Failed to write to Settings.System table", e);
                        }
                    }
                }
                if (b()) {
                    luq.a(this, false);
                    return;
                }
                return;
            }
            return;
        }
        int intExtra = intent.getIntExtra("com.google.android.gms.location.internal.FLAGS", 0);
        int i2 = intExtra & 4;
        boolean z = (intExtra & 2) != 0;
        int i3 = intExtra & 8;
        if (i2 != 0) {
            if (jkr.c()) {
                if (axzs.c()) {
                    jhg.a((Context) this, "com.google.android.location.settings.DrivingConditionProvider", true);
                }
                jhg.a((Context) this, "com.google.android.location.settings.DrivingActivity", true);
                jhg.a((Context) this, "com.google.android.location.settings.ActivityRecognitionPermissionActivity", true);
                jhg.a((Context) this, "com.google.android.location.settings.ActivityRecognitionModeActivity", true);
            }
            if (jkr.g()) {
                jhg.a((Context) this, "com.google.android.gms.location.settings.LocationAccuracyActivity", true);
            }
            int i4 = Build.VERSION.SDK_INT;
            if (!jkr.g()) {
                jhg.a((Context) this, "com.google.android.location.settings.WifiScanningPrePConsentActivity", true);
            }
            if (jkr.c() && aycw.a.a().enableDndNotificationBroadcast()) {
                new ahop(this).a(true);
            }
            a();
        }
        if (i3 != 0) {
            a();
        }
        if (b()) {
            luq.a(this, z);
        }
        ayae.c();
        if (ayab.c()) {
            jhg.a((Context) this, "com.google.android.location.settings.EAlertSettingsActivity", false);
            jhg.a((Context) this, "com.google.android.location.service.EAlertSettingInjectorService", false);
        }
    }
}
