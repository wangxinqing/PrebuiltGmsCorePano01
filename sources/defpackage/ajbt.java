package defpackage;

import android.os.Build;
import android.os.SystemClock;

/* renamed from: ajbt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajbt implements aizy {
    public static long e() {
        return System.currentTimeMillis() - SystemClock.elapsedRealtime();
    }

    public final long a() {
        int i = Build.VERSION.SDK_INT;
        return SystemClock.elapsedRealtimeNanos();
    }

    public final long d() {
        return e();
    }

    public final long b() {
        return System.currentTimeMillis();
    }

    public final long c() {
        return SystemClock.elapsedRealtime();
    }
}
