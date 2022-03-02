package com.google.android.gms.chimera.debug;

import android.content.Intent;
import com.google.android.gms.chimera.GoogleSettingsItem;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ChimeraDebugSettingsOperation extends hea {
    public final GoogleSettingsItem b() {
        GoogleSettingsItem googleSettingsItem = new GoogleSettingsItem(new Intent("com.google.android.gms.chimera.CHIMERA_SETTINGS_ACTIVITY"), 2, "Google Play services modules", 13);
        googleSettingsItem.h = awxo.a.a().F();
        return googleSettingsItem;
    }
}
