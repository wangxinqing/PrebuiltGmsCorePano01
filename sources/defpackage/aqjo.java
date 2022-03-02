package defpackage;

import java.util.Random;

/* renamed from: aqjo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqjo {
    private final double a;
    private final Random b;

    public aqjo(double d, long j) {
        ativ.b(aooc.b(0.0d));
        boolean z = false;
        if (d > 0.0d && d < Double.POSITIVE_INFINITY) {
            z = true;
        }
        ativ.b(z);
        this.a = d;
        this.b = new Random(j);
    }

    public final double a() {
        return (this.a * this.b.nextGaussian()) + 0.0d;
    }
}
