package defpackage;

import android.app.admin.DevicePolicyManager;
import android.content.ComponentName;
import android.content.Context;

/* renamed from: jnq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class jnq extends jnp {
    public final String d(Context context) {
        ComponentName profileOwner = ((DevicePolicyManager) context.getSystemService("device_policy")).getProfileOwner();
        if (profileOwner != null) {
            return profileOwner.getPackageName();
        }
        return null;
    }

    public final String e(Context context) {
        return ((DevicePolicyManager) context.getSystemService("device_policy")).getDeviceOwner();
    }
}
