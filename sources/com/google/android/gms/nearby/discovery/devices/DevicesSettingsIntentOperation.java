package com.google.android.gms.nearby.discovery.devices;

import com.google.android.gms.R;
import com.google.android.gms.chimera.GoogleSettingsItem;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class DevicesSettingsIntentOperation extends hea {
    public final GoogleSettingsItem b() {
        if (!arxk.b(this, tfx.a(this))) {
            return null;
        }
        GoogleSettingsItem googleSettingsItem = new GoogleSettingsItem(a("com.google.android.gms.settings.DEVICES").putExtra("caller", 2), 6, (int) R.string.common_devices, 41);
        googleSettingsItem.a();
        googleSettingsItem.b();
        googleSettingsItem.n = "NearbyDevicesSettings";
        for (String a : getResources().getStringArray(R.array.devices_index_settings_keywords)) {
            googleSettingsItem.a(a);
        }
        return googleSettingsItem;
    }
}
