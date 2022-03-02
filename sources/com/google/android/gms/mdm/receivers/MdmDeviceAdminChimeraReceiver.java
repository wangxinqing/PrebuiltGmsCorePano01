package com.google.android.gms.mdm.receivers;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.DeviceAdminReceiver;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class MdmDeviceAdminChimeraReceiver extends DeviceAdminReceiver {
    public final void onDisabled(Context context, Intent intent) {
        snb.a(context, false);
    }

    public final void onEnabled(Context context, Intent intent) {
        snb.a(context, true);
    }
}
