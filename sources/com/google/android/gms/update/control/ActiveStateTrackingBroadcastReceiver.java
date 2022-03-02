package com.google.android.gms.update.control;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class ActiveStateTrackingBroadcastReceiver extends nla {
    public final Object a = new Object();
    public boolean b = false;

    public ActiveStateTrackingBroadcastReceiver() {
        super("ota");
    }

    public final void a(Context context) {
        synchronized (this.a) {
            if (this.b) {
                context.unregisterReceiver(this);
                this.b = false;
            }
        }
    }

    public abstract void a(Intent intent);

    public final void a(Context context, Intent intent) {
        new adkj(this, intent).start();
    }

    public final void a(Context context, IntentFilter intentFilter) {
        synchronized (this.a) {
            if (!this.b) {
                this.b = true;
                context.registerReceiver(this, intentFilter);
            }
        }
    }
}
