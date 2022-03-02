package defpackage;

import android.os.Build;
import android.os.SystemClock;
import java.util.concurrent.TimeUnit;

/* renamed from: jiz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jiz extends amtd {
    public final long a() {
        int i = Build.VERSION.SDK_INT;
        try {
            return SystemClock.elapsedRealtimeNanos();
        } catch (NoSuchMethodError e) {
            return TimeUnit.NANOSECONDS.convert(SystemClock.elapsedRealtime(), TimeUnit.MILLISECONDS);
        }
    }
}
