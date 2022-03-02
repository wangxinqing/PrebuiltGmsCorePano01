package com.google.android.gms.drivingmode;

import android.content.Intent;
import android.util.Log;
import com.google.android.gms.R;
import com.google.android.gms.chimera.GoogleSettingsItem;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class DrivingModeLocationSettingsIntentOperation extends lws {
    public final GoogleSettingsItem b() {
        if (!awqm.b()) {
            return null;
        }
        Log.i("CAR.DRIVINGMODE", "DrivingMode Settings Indexed from the location module");
        if (!awqd.d() || !awqp.a.a().a() || !c()) {
            return null;
        }
        Intent className = new Intent().setClassName(this, lto.d());
        className.setAction("com.google.android.gms.drivingmode.Invoked_from_search");
        GoogleSettingsItem googleSettingsItem = new GoogleSettingsItem(className, 6, getApplicationContext().getString(R.string.driving_mode_settings_search_title), 25);
        googleSettingsItem.h = true;
        googleSettingsItem.j = true;
        googleSettingsItem.a();
        googleSettingsItem.b();
        googleSettingsItem.n = "DrivingModeSettings";
        googleSettingsItem.a(getApplicationContext().getString(R.string.driving_mode_settings_search_car));
        googleSettingsItem.a(getApplicationContext().getString(R.string.driving_mode_settings_search_do_not_disturb));
        googleSettingsItem.a(getApplicationContext().getString(R.string.driving_mode_settings_search_drive));
        googleSettingsItem.a(getApplicationContext().getString(R.string.gearhead_app_name));
        googleSettingsItem.a(getApplicationContext().getString(R.string.driving_mode_settings_search_bluetooth));
        googleSettingsItem.a(getApplicationContext().getString(R.string.driving_mode_settings_search_dnd));
        googleSettingsItem.a(getApplicationContext().getString(R.string.driving_mode_settings_search_car_mode));
        return googleSettingsItem;
    }
}
