package com.google.android.gms.gcm;

import android.content.Intent;
import com.google.android.gms.chimera.GoogleSettingsItem;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class GcmDiagnosticIntentOperation extends hea {
    public final GoogleSettingsItem b() {
        return new GoogleSettingsItem(new Intent().setClassName(this, "com.google.android.gms.gcm.GcmDiagnostics").setFlags(268435456), 2, "GCM Diagnostics", 28);
    }
}
