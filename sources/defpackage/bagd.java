package defpackage;

import java.util.Random;
import java.util.concurrent.TimeUnit;

/* renamed from: bagd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bagd {
    private final Random a = new Random();
    private final long b = TimeUnit.SECONDS.toNanos(1);
    private final long c = TimeUnit.MINUTES.toNanos(2);
    private long d = this.b;

    public final long a() {
        boolean z;
        long j = this.d;
        double d2 = (double) j;
        Double.isNaN(d2);
        this.d = Math.min((long) (1.6d * d2), this.c);
        Double.isNaN(d2);
        double d3 = -0.2d * d2;
        Double.isNaN(d2);
        double d4 = d2 * 0.2d;
        if (d4 >= d3) {
            z = true;
        } else {
            z = false;
        }
        amrl.a(z);
        return j + ((long) ((this.a.nextDouble() * (d4 - d3)) + d3));
    }
}
