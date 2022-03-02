package com.google.android.gms.romanesco.restoresettings;

import android.content.Intent;
import com.google.android.gms.R;
import com.google.android.gms.chimera.GoogleSettingsItem;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ContactsRestoreSettingsIntentOperation extends hea {
    public final GoogleSettingsItem b() {
        if (!azfh.a.a().n()) {
            return null;
        }
        jix.g(this);
        GoogleSettingsItem googleSettingsItem = new GoogleSettingsItem(new Intent().setClassName(this, "com.google.android.gms.romanesco.settings.ContactsRestoreSettingsActivity"), 7, (int) R.string.romanesco_contacts_restore_title, 17);
        googleSettingsItem.f = false;
        return googleSettingsItem;
    }
}
