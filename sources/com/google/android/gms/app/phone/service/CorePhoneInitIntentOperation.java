package com.google.android.gms.app.phone.service;

import android.content.ComponentName;
import android.content.Context;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class CorePhoneInitIntentOperation extends drj {
    static final String[] a = {"com.google.android.gms.app.net.NetworkUsageActivity", "com.google.android.gms.app.net.NetworkUsageActivityAdvanced", "com.google.android.gms.app.settings.DataManagementActivity", "com.google.android.gms.app.settings.SettingsSubPageActivity"};

    /* access modifiers changed from: protected */
    public final void a(Context context) {
        if (jkr.b()) {
            jhg.a(context, new ComponentName(context, "com.google.android.gms.app.settings.GoogleSettingsLink"));
            jhg.a(context, new ComponentName(context, "com.google.android.gms.app.settings.GoogleSettingsIALink"));
            return;
        }
        jhg.a(context, new ComponentName(context, "com.google.android.gms.app.settings.GoogleSettingsActivity"));
    }

    /* access modifiers changed from: protected */
    public final String[] a() {
        return a;
    }
}
