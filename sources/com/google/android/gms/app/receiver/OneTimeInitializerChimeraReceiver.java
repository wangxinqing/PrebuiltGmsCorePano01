package com.google.android.gms.app.receiver;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.BroadcastReceiver;
import com.google.android.gms.chimera.GmsIntentOperationService;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class OneTimeInitializerChimeraReceiver extends BroadcastReceiver {
    public final void onReceive(Context context, Intent intent) {
        context.startService(intent.setComponent(new ComponentName(context, GmsIntentOperationService.class)).setAction("com.google.android.gms.onetimeinitializer.ONE_TIME_INITIALIZED"));
        jhg.a(context, (Class) getContainerReceiver().getClass());
    }
}
