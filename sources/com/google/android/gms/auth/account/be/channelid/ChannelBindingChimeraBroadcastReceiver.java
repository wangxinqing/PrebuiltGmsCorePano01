package com.google.android.gms.auth.account.be.channelid;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.BroadcastReceiver;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ChannelBindingChimeraBroadcastReceiver extends BroadcastReceiver {
    public final void onReceive(Context context, Intent intent) {
        context.startService(new Intent().setClassName(context, "com.google.android.gms.auth.account.be.channelid.ChannelBindingStateIntentService").setAction("com.google.gservices.intent.action.GSERVICES_CHANGED"));
    }
}
