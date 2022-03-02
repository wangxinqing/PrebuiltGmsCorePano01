package com.google.android.gms.auth.managed.ui;

import android.app.admin.DevicePolicyManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.chimera.FragmentActivity;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class SettingsSecurityDeviceOwnerChimeraActivity extends FragmentActivity {
    private static final iwd a = ehv.a("AuthManaged", "SettingsSecurityDeviceOwnerChimeraActivity");
    private static final Intent b = new Intent("com.google.android.apps.work.clouddpc.ACTION_DO_STATUS_UI").setPackage("com.google.android.apps.work.clouddpc");

    public static boolean a(Context context) {
        DevicePolicyManager devicePolicyManager;
        if (!jkr.e() || (devicePolicyManager = (DevicePolicyManager) context.getSystemService("device_policy")) == null) {
            return false;
        }
        iwd iwd = a;
        String valueOf = String.valueOf(devicePolicyManager.getDeviceOwner() == null ? "n/a" : devicePolicyManager.getDeviceOwner());
        iwd.b(valueOf.length() == 0 ? new String("device owner: ") : "device owner: ".concat(valueOf), new Object[0]);
        if (!devicePolicyManager.isDeviceOwnerApp("com.google.android.apps.work.clouddpc") || b.resolveActivityInfo(context.getPackageManager(), 0) == null) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i == 1) {
            setResult(i2, intent);
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        startActivityForResult(b, 1);
    }
}
