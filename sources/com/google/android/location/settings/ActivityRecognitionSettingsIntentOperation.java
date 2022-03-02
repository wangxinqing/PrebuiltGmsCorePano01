package com.google.android.location.settings;

import android.content.Intent;
import com.google.android.gms.R;
import com.google.android.gms.chimera.GoogleSettingsItem;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ActivityRecognitionSettingsIntentOperation extends hea {
    public final GoogleSettingsItem b() {
        if (!jkr.c() || !aycw.a.a().enableDrivingModeGoogleSetting()) {
            return null;
        }
        GoogleSettingsItem googleSettingsItem = new GoogleSettingsItem(new Intent("com.google.android.gms.location.settings.AR_MODE_SETTING"), 0, getString(R.string.driving_mode_driving), 25);
        googleSettingsItem.f = false;
        return googleSettingsItem;
    }
}
