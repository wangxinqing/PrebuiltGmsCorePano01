package com.google.android.gms.mdi.download.ui;

import android.content.Intent;
import com.google.android.gms.R;
import com.google.android.gms.chimera.GoogleSettingsItem;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class DebugUiIntentOperation extends hea {
    public final GoogleSettingsItem b() {
        if (!((Boolean) sbx.d.c()).booleanValue()) {
            return null;
        }
        Intent intent = new Intent("com.google.android.gms.mdi.download.ui.DEBUG_UI");
        boolean g = axsv.a.a().g();
        GoogleSettingsItem googleSettingsItem = new GoogleSettingsItem(intent, 2, (int) R.string.mdd_debug_ui_title, 38);
        googleSettingsItem.g = !g;
        return googleSettingsItem;
    }
}
