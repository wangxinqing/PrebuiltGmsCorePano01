package com.google.android.chimera;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.chimera.annotation.ChimeraApiVersion;

@ChimeraApiVersion(added = 0)
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class WakefulBroadcastReceiver extends BroadcastReceiver {
    private static final SparseArray b = new SparseArray();
    private static int c = 1;

    public static boolean completeWakefulIntent(Intent intent) {
        int intExtra = intent.getIntExtra("android.support.content.wakelockid", 0);
        if (intExtra == 0) {
            return false;
        }
        synchronized (b) {
            PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) b.get(intExtra);
            if (wakeLock == null) {
                StringBuilder sb = new StringBuilder(35);
                sb.append("No active wake lock id #");
                sb.append(intExtra);
                Log.w("WakefulBroadcastReceiver", sb.toString());
                return true;
            }
            wakeLock.release();
            b.remove(intExtra);
            return true;
        }
    }

    public static ComponentName startWakefulService(Context context, Intent intent) {
        synchronized (b) {
            int i = c;
            int i2 = c + 1;
            c = i2;
            if (i2 <= 0) {
                c = 1;
            }
            intent.putExtra("android.support.content.wakelockid", i);
            ComponentName startService = context.startService(intent);
            if (startService == null) {
                return null;
            }
            PowerManager powerManager = (PowerManager) context.getSystemService("power");
            String valueOf = String.valueOf(startService.flattenToShortString());
            PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, valueOf.length() == 0 ? new String("wake:") : "wake:".concat(valueOf));
            newWakeLock.setReferenceCounted(false);
            newWakeLock.acquire(60000);
            b.put(i, newWakeLock);
            return startService;
        }
    }
}
