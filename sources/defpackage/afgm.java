package defpackage;

import android.os.Build;
import android.os.SystemClock;

/* renamed from: afgm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class afgm {
    public static final long a() {
        int i = Build.VERSION.SDK_INT;
        return SystemClock.elapsedRealtimeNanos();
    }
}
