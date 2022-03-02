package com.google.android.gms.ads.internal.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class v extends BroadcastReceiver {
    final /* synthetic */ w a;

    public v(w wVar) {
        this.a = wVar;
    }

    public final void onReceive(Context context, Intent intent) {
        this.a.a(context, intent);
    }
}
