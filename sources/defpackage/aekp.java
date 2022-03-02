package defpackage;

import android.os.Build;
import android.os.SystemClock;

/* renamed from: aekp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aekp implements aekn {
    public static final /* synthetic */ int a = 0;

    public final long a() {
        return System.currentTimeMillis();
    }

    public final long b() {
        return SystemClock.elapsedRealtime();
    }

    public final long c() {
        return SystemClock.uptimeMillis();
    }

    static {
        try {
            int i = Build.VERSION.SDK_INT;
            SystemClock.elapsedRealtimeNanos();
        } catch (Throwable th) {
        }
    }
}
