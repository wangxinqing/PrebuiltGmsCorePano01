package com.google.android.gms.contextmanager.gcm;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.BroadcastReceiver;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class GcmChimeraBroadcastReceiver extends BroadcastReceiver {
    public final void onReceive(Context context, Intent intent) {
        new jwe(context, intent).a(bvq.a("GcmBroadcastHandler"));
    }
}
