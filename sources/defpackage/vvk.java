package defpackage;

import android.os.SystemClock;

/* renamed from: vvk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class vvk {
    private final String a;
    private long b = 0;
    private long c = 0;

    public vvk(String str) {
        this.a = str;
    }

    public final void a() {
        this.c++;
        ((anih) vvj.a.d()).a("Incremented the RateLimitThrottler(%s) count to %d.", (Object) this.a, this.c);
    }

    public final boolean a(long j, long j2) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean z = false;
        if (elapsedRealtime <= this.b + j2) {
            if (this.c >= j) {
                z = true;
            }
            if (z) {
                ((anih) vvj.a.d()).a("RateLimitThrottler(%s) is at the throttling limit of (%d/%d millis): skipping action.", (Object) this.a, (Object) Long.valueOf(j), (Object) Long.valueOf(j2));
            }
            return z;
        }
        this.b = elapsedRealtime;
        this.c = 0;
        return false;
    }
}
