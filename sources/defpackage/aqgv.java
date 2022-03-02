package defpackage;

import com.google.location.bluemoon.inertialanchor.Pose;

/* renamed from: aqgv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqgv extends aqgt implements arce {
    private static final long e = aqjs.a(0.1d);
    public double c = Double.NEGATIVE_INFINITY;
    public double d = 0.0d;

    public aqgv(aqjh aqjh) {
        super(aqjh);
    }

    public final void a(float f) {
    }

    public final void a(Pose pose) {
    }

    public final void b(int i, long j) {
        if (i == this.b) {
            a(new aqjb(aqjs.a(j)));
        }
    }

    public final void d() {
    }

    public final void a(float f, float f2, long j) {
        double d2 = this.c;
        double d3 = this.d;
        double d4 = (double) f;
        Double.isNaN(d4);
        double d5 = d3 + d4;
        this.d = d5;
        double d6 = (double) j;
        Double.isNaN(d6);
        if (d6 - d2 >= ((double) e)) {
            a(1, j, (double) f2, d5);
            this.d = 0.0d;
            this.c = d6;
        }
    }

    public final void a(int i, long j, double d2) {
        if (i == this.b) {
            a(new aqjb(aqjs.a(j), d2));
        }
    }

    public final void a(int i, long j, double d2, double d3) {
        if (i == this.b) {
            a(new aqjb(aqjs.a(j), d2, d3));
        }
    }

    public final void a(long j) {
        b(1, j);
    }

    public final void a(long j, float f) {
        a(1, j, (double) f);
    }
}
