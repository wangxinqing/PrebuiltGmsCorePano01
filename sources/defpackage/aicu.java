package defpackage;

import android.location.Location;
import android.os.Build;
import android.os.SystemClock;

/* renamed from: aicu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aicu {
    public static final long a(Location location) {
        int i = Build.VERSION.SDK_INT;
        long elapsedRealtimeNanos = location.getElapsedRealtimeNanos();
        long elapsedRealtimeNanos2 = SystemClock.elapsedRealtimeNanos();
        return elapsedRealtimeNanos > elapsedRealtimeNanos2 ? elapsedRealtimeNanos2 : elapsedRealtimeNanos;
    }
}
