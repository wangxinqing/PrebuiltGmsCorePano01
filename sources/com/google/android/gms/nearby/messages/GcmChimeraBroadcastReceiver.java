package com.google.android.gms.nearby.messages;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class GcmChimeraBroadcastReceiver extends acsb {
    public static final /* synthetic */ int b = 0;

    public final void onReceive(Context context, Intent intent) {
        jjg jjg = tgc.a;
        ComponentName componentName = new ComponentName(context.getPackageName(), "com.google.android.gms.nearby.messages.service.NearbyMessagesService");
        intent.putExtra("isCopresenceGcm", true);
        acsb.b(context, intent.setComponent(componentName));
        if (isOrderedBroadcast()) {
            setResultCode(-1);
        }
    }
}
