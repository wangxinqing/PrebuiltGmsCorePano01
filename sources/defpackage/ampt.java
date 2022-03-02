package defpackage;

import android.os.Build;
import android.os.SystemClock;

/* renamed from: ampt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ampt {
    public static final amtd a;

    static {
        amtd amtd;
        try {
            int i = Build.VERSION.SDK_INT;
            SystemClock.elapsedRealtimeNanos();
            amtd = new ampr();
        } catch (Throwable th) {
            SystemClock.elapsedRealtime();
            amtd = new amps();
        }
        a = amtd;
    }
}
