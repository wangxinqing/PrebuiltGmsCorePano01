package com.google.android.gms.security.settings;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import com.google.android.gms.R;
import com.google.android.gms.chimera.GoogleSettingsItem;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class SecuritySettingsIntentOperation extends hea {
    public final GoogleSettingsItem b() {
        jix.g(this);
        VerifyAppsSettingsChimeraActivity.a((Context) this);
        Intent className = new Intent().setClassName(this, "com.google.android.gms.security.settings.SecuritySettingsActivity");
        Resources resources = getResources();
        GoogleSettingsItem googleSettingsItem = new GoogleSettingsItem(className, 0, (int) R.string.security_settings_activity_title, 53);
        googleSettingsItem.f = false;
        googleSettingsItem.a();
        googleSettingsItem.b();
        googleSettingsItem.n = "SecuritySettings";
        googleSettingsItem.a(resources.getString(R.string.adm_settings_activity_title));
        googleSettingsItem.a(resources.getString(R.string.security_status_section_title));
        googleSettingsItem.a(resources.getString(R.string.security_settings_activity_title));
        googleSettingsItem.a(resources.getString(R.string.google_play_protect_title));
        googleSettingsItem.a(resources.getString(R.string.play_protect_title));
        return googleSettingsItem;
    }
}
