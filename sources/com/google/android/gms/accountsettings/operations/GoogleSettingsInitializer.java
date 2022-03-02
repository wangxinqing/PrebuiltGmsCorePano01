package com.google.android.gms.accountsettings.operations;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.R;
import com.google.android.gms.chimera.GoogleSettingsItem;
import java.util.List;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class GoogleSettingsInitializer extends hea {
    public GoogleSettingsInitializer() {
    }

    public final List a() {
        jix.g(this);
        aucf aucf = (aucf) aqmz.l.o();
        if (aucf.c) {
            aucf.c();
            aucf.c = false;
        }
        aqmz aqmz = (aqmz) aucf.b;
        aqmz.b = 5;
        int i = aqmz.a | 1;
        aqmz.a = i;
        aqmz.c = 2016;
        int i2 = i | 2;
        aqmz.a = i2;
        aqmz.a = i2 | 16;
        aqmz.f = true;
        aqmz aqmz2 = (aqmz) aucf.i();
        aucd o = aqna.d.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        aqna aqna = (aqna) o.b;
        aqmz2.getClass();
        aqna.b = aqmz2;
        aqna.a |= 1;
        hol.a(getApplicationContext(), "IDENTITY_FRONTEND").a(((aqna) o.i()).k()).b();
        GoogleSettingsItem googleSettingsItem = new GoogleSettingsItem(new Intent().setClassName(this, "com.google.android.gms.accountsettings.ui.MyAccountNotAvailableAlertActivity").addCategory("android.intent.category.DEFAULT"), 1, (int) R.string.common_asm_google_account_title, 2);
        googleSettingsItem.q = R.string.accountsettings_not_available;
        googleSettingsItem.f = true;
        return amzy.a((Object) googleSettingsItem);
    }

    protected GoogleSettingsInitializer(Context context) {
        attachBaseContext(context);
    }
}
