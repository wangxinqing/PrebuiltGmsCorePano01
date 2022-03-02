package defpackage;

import java.util.Random;

/* renamed from: aqit  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqit extends aqjl {
    private final Random a;
    private final double b;
    private final double e = aqjt.a(0.5d, 0.0d, 1.0d);

    public aqit(aqjq aqjq, double d) {
        super(aqjq);
        this.a = aqjq.b();
        this.b = d;
    }

    public final void a() {
        boolean z;
        if (this.d.c == 7) {
            z = true;
        } else {
            z = false;
        }
        ativ.a(z, "Expected type# %s, but got type# %s.", 7, Integer.valueOf(this.d.c));
    }

    public final void a(aqjc aqjc) {
        double d;
        if (this.a.nextDouble() < this.e) {
            d = this.d.a(0);
        } else {
            d = 0.0d;
        }
        aqjc.a = this.d.d;
        double[] dArr = aqjc.b;
        dArr[2] = (dArr[2] - d) + (this.c.a() * this.b);
    }
}
