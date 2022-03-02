package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Looper;

/* renamed from: thp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class thp {
    public static void a(Context context, BroadcastReceiver broadcastReceiver) {
        if (broadcastReceiver != null) {
            try {
                context.unregisterReceiver(broadcastReceiver);
            } catch (IllegalArgumentException e) {
            }
        }
    }

    public static void a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        context.registerReceiver(broadcastReceiver, intentFilter, "com.google.android.gms.permission.INTERNAL_BROADCAST", new qvr(Looper.getMainLooper()));
    }

    public static void a(Context context, Intent intent) {
        context.sendBroadcast(intent.setPackage(context.getPackageName()), "com.google.android.gms.permission.INTERNAL_BROADCAST");
    }

    public static void a(Context context, String str) {
        a(context, new Intent(str));
    }
}
