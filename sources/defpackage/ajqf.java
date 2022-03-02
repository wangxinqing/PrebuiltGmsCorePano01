package defpackage;

import android.os.SystemClock;

/* renamed from: ajqf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajqf {
    private long a = 0;

    public final synchronized void a() {
        this.a = SystemClock.elapsedRealtime();
    }

    public final synchronized boolean a(long j, boolean z) {
        return a(true, j, z, Long.MAX_VALUE);
    }

    public final synchronized boolean a(boolean z, long j, boolean z2, long j2) {
        long elapsedRealtime;
        float f;
        float f2;
        elapsedRealtime = SystemClock.elapsedRealtime() - this.a;
        if (j2 != Long.MAX_VALUE) {
            f = (float) j2;
        } else if (z2) {
            f = (float) j;
        } else {
            if (!z) {
                f2 = (float) aydi.a.a().freshPeriodThresholdBackground();
            } else {
                f2 = (float) aydi.a.a().freshPeriodThreshold();
            }
            f = f2 * ((float) j);
        }
        if (jkr.h()) {
            f = Math.min(f, (float) ayff.b());
        }
        return ((float) elapsedRealtime) > f;
    }
}
