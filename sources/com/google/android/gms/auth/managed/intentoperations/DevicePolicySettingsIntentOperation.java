package com.google.android.gms.auth.managed.intentoperations;

import android.app.admin.DevicePolicyManager;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Build;
import com.google.android.gms.R;
import com.google.android.gms.chimera.GoogleSettingsItem;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class DevicePolicySettingsIntentOperation extends hea {
    public final GoogleSettingsItem b() {
        DevicePolicyManager devicePolicyManager;
        ComponentName profileOwner;
        Intent intent = new Intent("com.google.android.apps.work.clouddpc.ACTION_STATUS_UI").setPackage("com.google.android.apps.work.clouddpc");
        GoogleSettingsItem googleSettingsItem = new GoogleSettingsItem(intent, 0, (int) R.string.auth_device_policy_settings_entry, 23);
        int i = Build.VERSION.SDK_INT;
        if (!awpc.a.a().a() || (devicePolicyManager = (DevicePolicyManager) getSystemService("device_policy")) == null) {
            return null;
        }
        if (("com.google.android.apps.work.clouddpc".equals(devicePolicyManager.getDeviceOwner()) || ((profileOwner = devicePolicyManager.getProfileOwner()) != null && "com.google.android.apps.work.clouddpc".equals(profileOwner.getPackageName()))) && intent.resolveActivityInfo(getPackageManager(), 0) != null) {
            return googleSettingsItem;
        }
        return null;
    }
}
