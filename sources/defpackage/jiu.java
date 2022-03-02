package defpackage;

import android.os.SystemClock;

/* renamed from: jiu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jiu implements jiq {
    public static final jiu a = new jiu();

    private jiu() {
    }

    public final long a() {
        return System.currentTimeMillis();
    }

    public final long b() {
        return SystemClock.elapsedRealtime();
    }

    public final long c() {
        return System.nanoTime();
    }
}
