package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.PowerManager;
import android.os.SystemClock;

/* renamed from: jiy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jiy {
    private static final IntentFilter a = new IntentFilter("android.intent.action.BATTERY_CHANGED");
    private static long b;
    private static float c = Float.NaN;

    public static int a(Context context) {
        if (!(context == null || context.getApplicationContext() == null)) {
            boolean b2 = b(context);
            PowerManager powerManager = (PowerManager) context.getSystemService("power");
            if (powerManager != null) {
                return (!a(powerManager) ? (char) 0 : 2) | b2 ? 1 : 0;
            }
        }
        return -1;
    }

    public static boolean b(Context context) {
        int i;
        Intent registerReceiver = context.getApplicationContext().registerReceiver((BroadcastReceiver) null, a);
        if (registerReceiver != null) {
            i = registerReceiver.getIntExtra("plugged", 0);
        } else {
            i = 0;
        }
        int i2 = Build.VERSION.SDK_INT;
        if ((i & 7) != 0) {
            return true;
        }
        return false;
    }

    public static boolean c(Context context) {
        if (jkr.b()) {
            return ((PowerManager) context.getSystemService("power")).isDeviceIdleMode();
        }
        return false;
    }

    public static boolean d(Context context) {
        return a((PowerManager) context.getSystemService("power"));
    }

    public static synchronized float e(Context context) {
        float f;
        synchronized (jiy.class) {
            if (SystemClock.elapsedRealtime() - b < 60000) {
                if (Float.isNaN(c)) {
                }
                f = c;
            }
            Intent registerReceiver = context.getApplicationContext().registerReceiver((BroadcastReceiver) null, a);
            if (registerReceiver != null) {
                c = ((float) registerReceiver.getIntExtra("level", -1)) / ((float) registerReceiver.getIntExtra("scale", -1));
            }
            b = SystemClock.elapsedRealtime();
            f = c;
        }
        return f;
    }

    public static boolean a(PowerManager powerManager) {
        int i = Build.VERSION.SDK_INT;
        return powerManager.isInteractive();
    }
}
