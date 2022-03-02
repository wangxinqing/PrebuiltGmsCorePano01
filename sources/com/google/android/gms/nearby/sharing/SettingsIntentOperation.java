package com.google.android.gms.nearby.sharing;

import com.google.android.gms.R;
import com.google.android.gms.chimera.GoogleSettingsItem;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class SettingsIntentOperation extends hea {
    public final GoogleSettingsItem b() {
        if (!ModuleInitializer.a(this)) {
            return null;
        }
        GoogleSettingsItem googleSettingsItem = new GoogleSettingsItem(a("com.google.android.gms.settings.SHARING"), 6, getString(R.string.sharing_product_name), 43);
        googleSettingsItem.a();
        googleSettingsItem.b();
        googleSettingsItem.n = "NearbySharingSettings";
        for (String a : getResources().getStringArray(R.array.sharing_index_settings_keywords)) {
            googleSettingsItem.a(a);
        }
        return googleSettingsItem;
    }
}
