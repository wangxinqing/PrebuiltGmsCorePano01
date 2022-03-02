package defpackage;

import android.os.Build;
import android.os.SystemClock;
import java.util.concurrent.TimeUnit;

/* renamed from: agyl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class agyl {
    public static final agyl a = new agyl();

    private agyl() {
    }

    public static final long b() {
        int i = Build.VERSION.SDK_INT;
        return SystemClock.elapsedRealtimeNanos();
    }

    public final long a() {
        return TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis());
    }
}
