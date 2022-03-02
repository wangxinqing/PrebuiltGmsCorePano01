package defpackage;

import android.os.SystemClock;

/* renamed from: ajdh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajdh implements jiq {
    private final long a;
    private final long b = SystemClock.elapsedRealtime();

    public ajdh(long j) {
        this.a = j;
    }

    public final long a() {
        return this.a + (SystemClock.elapsedRealtime() - this.b);
    }

    public final long b() {
        return SystemClock.elapsedRealtime();
    }

    public final long c() {
        return System.nanoTime();
    }
}
