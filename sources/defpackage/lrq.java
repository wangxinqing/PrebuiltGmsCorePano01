package defpackage;

import android.os.SystemClock;
import java.util.Locale;
import java.util.Random;

/* renamed from: lrq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lrq implements lsg {
    private final long a;
    private final double b;
    private final long c;
    private final Random d;
    private int e = 0;
    private long f;

    public lrq(long j, double d2, long j2) {
        boolean z;
        boolean z2;
        Random random = new Random();
        boolean z3 = false;
        if (j > 0) {
            z = true;
        } else {
            z = false;
        }
        iva.b(z);
        if (d2 >= 1.0d) {
            z2 = true;
        } else {
            z2 = false;
        }
        iva.b(z2);
        iva.b(j <= j2 ? true : z3);
        this.a = j;
        this.b = d2;
        this.c = j2;
        iva.a((Object) random);
        this.d = random;
        b();
    }

    private final synchronized void e() {
        double d2 = this.b;
        double nextDouble = this.d.nextDouble();
        double pow = Math.pow(this.b, (double) this.e);
        long j = this.a;
        double d3 = (double) this.c;
        double d4 = (double) j;
        Double.isNaN(d4);
        this.f = ((long) Math.min(d3, d4 * pow * (((d2 - 4.0d) * nextDouble) + 1.0d))) + SystemClock.uptimeMillis();
    }

    /* access modifiers changed from: package-private */
    public final synchronized long a() {
        long max;
        max = Math.max(0, this.f - SystemClock.uptimeMillis());
        this.e++;
        e();
        return max;
    }

    public final synchronized void b() {
        this.e = 0;
        e();
    }

    public final synchronized boolean c() {
        return SystemClock.uptimeMillis() >= this.f;
    }

    public final synchronized boolean d() {
        boolean c2;
        c2 = c();
        if (c2) {
            a();
        }
        return c2;
    }

    public final synchronized void f() {
        long a2 = a();
        if (a2 > 0) {
            Thread.sleep(a2);
        }
    }

    public final void g() {
    }

    public final String toString() {
        return String.format(Locale.US, "ExponentialBackoffRateLimiter[%d tokens, initialMs=%d, factor=%.3f]", new Object[]{Integer.valueOf(this.e), Long.valueOf(this.a), Double.valueOf(this.b)});
    }
}
