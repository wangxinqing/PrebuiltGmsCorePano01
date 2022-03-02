package com.google.android.gms.people.sync.coreui;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import com.google.android.gms.R;
import com.google.android.gms.chimera.GoogleSettingsItem;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ContactsSyncCoreSettingsIntentOperation extends hea {
    public final GoogleSettingsItem b() {
        if (ayqr.f()) {
            if (!ayqs.a.a().a()) {
                Intent className = new Intent().setClassName(this, "com.google.android.gms.people.sync.coreui.ContactsSyncCoreActivity");
                if (ayqs.b() && Build.VERSION.SDK_INT >= 22) {
                    className.putExtra("android.intent.extra.REFERRER", new Uri.Builder().scheme("android-app").authority("com.google.android.gms.settings").build());
                }
                GoogleSettingsItem googleSettingsItem = new GoogleSettingsItem(className, 4, (int) R.string.people_contacts_sync_core_activity_title, 18);
                googleSettingsItem.f = ayqr.a.a().d();
                return googleSettingsItem;
            }
            jix.h(this);
        }
        return null;
    }
}
