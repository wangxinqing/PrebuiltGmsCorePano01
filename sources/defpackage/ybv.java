package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;

/* renamed from: ybv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ybv {
    public static final ybv a = new ybv();
    public static final IntentFilter b = new IntentFilter("android.intent.action.BATTERY_CHANGED");

    public final ybu a(Context context) {
        ybu ybu = ybu.a;
        try {
            Intent registerReceiver = context.registerReceiver((BroadcastReceiver) null, b);
            if (registerReceiver == null) {
                return ybu;
            }
            int i = -1;
            int intExtra = registerReceiver.getIntExtra("status", -1);
            boolean z = true;
            if (!(intExtra == 2 || intExtra == 5)) {
                z = false;
            }
            int intExtra2 = registerReceiver.getIntExtra("level", -1);
            int intExtra3 = registerReceiver.getIntExtra("scale", 0);
            if (intExtra2 >= 0) {
                if (intExtra3 > 0) {
                    i = (intExtra2 * 100) / intExtra3;
                }
            }
            return new ybu(z, i);
        } catch (Exception e) {
            Log.w("PeopleBU", "Unable to get battery status", e);
            return ybu;
        }
    }
}
