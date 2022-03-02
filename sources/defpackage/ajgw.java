package defpackage;

import android.os.SystemClock;

/* renamed from: ajgw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajgw implements ajgx {
    private final long a;
    private int b;
    private long c;

    public ajgw(long j) {
        this.a = j;
        this.c = -j;
    }

    public final long b(Runnable runnable) {
        long a2 = a();
        if (a2 > 0) {
            return a2;
        }
        if (!a(runnable)) {
            return a();
        }
        return 0;
    }

    public final long a() {
        return Math.max(0, (this.a - (SystemClock.elapsedRealtime() - this.c)) / 1000);
    }

    public final boolean a(Runnable runnable) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - this.c < this.a) {
            this.b++;
            return false;
        }
        this.c = elapsedRealtime;
        runnable.run();
        return true;
    }
}
