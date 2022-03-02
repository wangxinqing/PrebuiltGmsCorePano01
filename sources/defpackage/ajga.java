package defpackage;

import java.util.ArrayList;
import java.util.Random;

/* renamed from: ajga  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajga {
    public final int a;
    public final int b;
    public long c = -1;
    public ArrayList d = null;
    private final Random e;

    static {
        jjg.a("EAlert");
    }

    public ajga(Random random, int i, int i2) {
        this.e = random;
        this.a = i;
        this.b = i2;
    }

    public final double a(double d2) {
        double nextDouble = this.e.nextDouble() * d2;
        double d3 = (double) (!this.e.nextBoolean() ? -1 : 1);
        Double.isNaN(d3);
        return nextDouble * d3;
    }
}
