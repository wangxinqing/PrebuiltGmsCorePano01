package defpackage;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.util.Log;
import android.util.SparseArray;

@Deprecated
/* renamed from: ks  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class ks extends BroadcastReceiver {
    private static final SparseArray a = new SparseArray();
    private static int b = 1;

    public static void a(Intent intent) {
        int intExtra = intent.getIntExtra("androidx.contentpager.content.wakelockid", 0);
        if (intExtra != 0 || (intExtra = intent.getIntExtra("android.support.content.wakelockid", 0)) != 0) {
            synchronized (a) {
                PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) a.get(intExtra);
                if (wakeLock == null) {
                    Log.w("WakefulBroadcastReceiv.", "No active wake lock id #" + intExtra);
                    return;
                }
                wakeLock.release();
                a.remove(intExtra);
            }
        }
    }

    public static ComponentName k(Context context, Intent intent) {
        synchronized (a) {
            int i = b;
            int i2 = b + 1;
            b = i2;
            if (i2 <= 0) {
                b = 1;
            }
            intent.putExtra("androidx.contentpager.content.wakelockid", i);
            intent.putExtra("android.support.content.wakelockid", i);
            ComponentName startService = context.startService(intent);
            if (startService == null) {
                return null;
            }
            PowerManager.WakeLock newWakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "androidx.core:wake:" + startService.flattenToShortString());
            newWakeLock.setReferenceCounted(false);
            newWakeLock.acquire(60000);
            a.put(i, newWakeLock);
            return startService;
        }
    }
}
