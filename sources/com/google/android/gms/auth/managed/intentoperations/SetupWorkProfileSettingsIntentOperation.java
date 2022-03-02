package com.google.android.gms.auth.managed.intentoperations;

import android.app.admin.DevicePolicyManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import com.google.android.gms.R;
import com.google.android.gms.auth.managed.ui.PhoneskyDpcInstallChimeraActivity;
import com.google.android.gms.chimera.GoogleSettingsItem;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class SetupWorkProfileSettingsIntentOperation extends hea {
    public final GoogleSettingsItem b() {
        GoogleSettingsItem googleSettingsItem = new GoogleSettingsItem(new Intent().setClassName(this, "com.google.android.gms.auth.managed.ui.SetupWorkProfileActivity").putExtras(new Bundle()), 7, (int) R.string.auth_device_management_setup_work_profile_settings_entry, 60);
        if (!a(this)) {
            return null;
        }
        return googleSettingsItem;
    }

    public static boolean a(Context context) {
        int i = Build.VERSION.SDK_INT;
        DevicePolicyManager devicePolicyManager = (DevicePolicyManager) context.getSystemService("device_policy");
        return awow.a.b().d() && PhoneskyDpcInstallChimeraActivity.a(context) && devicePolicyManager.getDeviceOwner() == null && devicePolicyManager.getProfileOwner() == null;
    }
}
