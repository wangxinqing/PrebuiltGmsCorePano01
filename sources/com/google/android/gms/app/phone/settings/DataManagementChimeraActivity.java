package com.google.android.gms.app.phone.settings;

import android.content.Context;
import com.google.android.gms.R;
import com.google.android.gms.chimera.GoogleSettingsItem;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class DataManagementChimeraActivity extends drm {

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public class SettingsIntentOperation extends hea {
        public final GoogleSettingsItem b() {
            if (axeb.a.a().h()) {
                return null;
            }
            GoogleSettingsItem googleSettingsItem = new GoogleSettingsItem(drm.a((Context) this), 5, (int) R.string.core_data_management_title, 20);
            googleSettingsItem.f = true;
            googleSettingsItem.a();
            googleSettingsItem.n = DataManagementChimeraActivity.class.getName();
            googleSettingsItem.b();
            return googleSettingsItem;
        }
    }
}
