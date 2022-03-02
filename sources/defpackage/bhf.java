package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* renamed from: bhf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bhf extends BroadcastReceiver {
    public boolean a = true;

    public bhf(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        context.registerReceiver(this, intentFilter);
    }

    public final void onReceive(Context context, Intent intent) {
        boolean z;
        if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
            z = true;
        } else if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
            z = false;
        } else {
            return;
        }
        this.a = z;
    }
}
