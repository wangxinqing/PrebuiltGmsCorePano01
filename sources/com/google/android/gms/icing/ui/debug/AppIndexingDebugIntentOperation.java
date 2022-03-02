package com.google.android.gms.icing.ui.debug;

import com.google.android.gms.R;
import com.google.android.gms.chimera.GoogleSettingsItem;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class AppIndexingDebugIntentOperation extends hea {
    public final GoogleSettingsItem b() {
        if (axsd.a.a().b()) {
            return new GoogleSettingsItem(a("com.google.android.gms.icing.APP_INDEXING_DEBUG"), 3, (int) R.string.app_indexing_debug_title, 6);
        }
        return null;
    }
}
