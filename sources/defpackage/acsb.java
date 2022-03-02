package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.WakefulBroadcastReceiver;

/* renamed from: acsb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class acsb extends WakefulBroadcastReceiver {
    public static void a(Context context, Intent intent) {
        jds.a.a(context, intent);
        WakefulBroadcastReceiver.completeWakefulIntent(intent);
    }

    public static void b(Context context, Intent intent) {
        intent.putExtra("WAKE_LOCK_KEY", jdl.a(context, intent));
        ComponentName startWakefulService = WakefulBroadcastReceiver.startWakefulService(context, intent);
        if (startWakefulService != null) {
            jds jds = jds.a;
            String valueOf = String.valueOf(startWakefulService.flattenToShortString());
            jds.a(context, intent, valueOf.length() == 0 ? new String("wake:") : "wake:".concat(valueOf), intent.getAction(), "com.google.android.gms");
        }
    }
}
