package defpackage;

import android.os.SystemClock;

/* renamed from: ahtg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ahtg {
    private long a = Long.MAX_VALUE;
    private long b = Long.MAX_VALUE;
    private long c = Long.MAX_VALUE;
    private long d = Long.MAX_VALUE;

    public final synchronized long a() {
        return this.a;
    }

    public final synchronized void a(long j) {
        if (this.a == Long.MAX_VALUE) {
            this.a = j;
        }
        this.b = j;
    }

    public final synchronized void a(long j, long j2) {
        if (this.d == Long.MAX_VALUE) {
            this.d = j;
            this.c = j2;
        }
    }

    public final synchronized long b() {
        long j;
        j = this.b;
        if (j == Long.MAX_VALUE) {
            j = SystemClock.elapsedRealtime();
            this.b = j;
        }
        return j;
    }

    public final synchronized long b(long j, long j2) {
        return (j - this.d) + ((this.c - this.a) * 1000000) + j2;
    }

    public final synchronized long c() {
        long j;
        j = this.a;
        if (j == Long.MAX_VALUE) {
            j = SystemClock.elapsedRealtime();
            this.a = j;
        }
        return j;
    }

    public final synchronized long c(long j, long j2) {
        return (this.d - j) + ((j2 - this.c) * 1000000);
    }
}
