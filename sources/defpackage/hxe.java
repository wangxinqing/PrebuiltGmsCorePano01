package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.provider.Settings;
import java.util.concurrent.TimeUnit;

/* renamed from: hxe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hxe {
    static final long a = TimeUnit.SECONDS.toMillis(60);
    public static ob b = null;
    public static final Object c = new Object();
    private static volatile boolean d = false;
    private static long e;

    static {
        long j = -a;
        e = j + j;
    }

    public static boolean a(Context context) {
        if (e > SystemClock.elapsedRealtime() - a) {
            return d;
        }
        boolean z = false;
        try {
            int i = Build.VERSION.SDK_INT;
            int i2 = Settings.Global.getInt(context.getContentResolver(), "adb_enabled");
            e = SystemClock.elapsedRealtime();
            if (i2 == 1) {
                z = true;
            }
            d = z;
            return z;
        } catch (Settings.SettingNotFoundException e2) {
            return false;
        }
    }
}
