package defpackage;

import com.android.volley.toolbox.ImageRequest;
import java.io.PrintWriter;

/* renamed from: aqfu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqfu implements aqgg {
    private static final qul d = qul.a(2);
    final aqft a;
    aqey b = null;
    private long c;
    private final qul e;
    private final qul f;
    private final qul g;
    private final int h;
    private aqff i;

    public aqfu(aqft aqft, int i2) {
        this.a = aqft;
        this.e = new qul(2, 1);
        qul qul = new qul(2, 2);
        this.f = qul;
        qul.a();
        qul qul2 = new qul(2, 2);
        this.g = qul2;
        qul2.a(0, 0, 6.25d);
        this.g.a(1, 1, 6.25d);
        this.h = i2;
    }

    public final int a(long j, int i2) {
        return 15;
    }

    public final void a(long j, aqfq aqfq) {
    }

    public final void a(long j, aqgf aqgf) {
    }

    public final void a(long j, PrintWriter printWriter) {
    }

    public final long b() {
        return this.c;
    }

    public final void c() {
        this.i = null;
        this.b = null;
    }

    public final void d() {
        c();
    }

    public final aqey a() {
        aqew aqew = null;
        if (this.i == null) {
            return null;
        }
        aqft aqft = this.a;
        qul qul = aqft.a;
        qul qul2 = aqft.b;
        double sqrt = Math.sqrt((qul2.a(0, 0) + qul2.a(1, 1)) / 2.0d);
        double d2 = (double) (this.h / ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS);
        if (sqrt < d2) {
            sqrt = d2;
        }
        if (!(sqrt == Double.MAX_VALUE || this.b == null)) {
            double a2 = qul.a(0, 0);
            double a3 = qul.a(1, 0);
            aqex aqex = this.b.a;
            int a4 = this.i.a(a3);
            int b2 = this.i.b(a2);
            aqew = aqey.k();
            aqew.a(a4, b2, (int) (sqrt * 1000.0d));
            aqew.a(aqex);
            if (this.b.f()) {
                aqew.a(this.b.g);
            }
            if (this.b.d()) {
                aqew.d(this.b.e);
            }
            if (this.b.g()) {
                aqew.b(this.b.h);
            }
            if (this.b.h()) {
                aqew.b(this.b.l);
            }
        }
        return aqew.a();
    }

    public final void a(double d2) {
        if (this.i != null) {
            this.g.a(0, 0, d2);
            this.g.a(1, 1, d2);
            this.a.a(d, this.g, (qul) null);
        }
    }

    public final void a(long j, float f2, float f3) {
        if (this.i != null) {
            this.a.a(d, this.g, (qul) null);
        }
    }

    public final void a(long j, aqey aqey) {
        boolean z;
        aqey aqey2 = aqey;
        aqey aqey3 = this.b;
        double d2 = 0.0d;
        if (!(aqey3 == null || aqey2 == null)) {
            if (aqey.b() && aqey3.b()) {
                double min = (double) Math.min((float) aell.a(aqey2.b, aqey2.c, aqey3.b, aqey3.c), 165.0f);
                Double.isNaN(min);
                d2 = 1.0d - (min / 165.0d);
            } else if (aqey.a() && aqey3.a()) {
                d2 = 0.8999999761581421d;
            }
        }
        this.b = aqey2;
        this.c = j;
        if (this.i != null) {
            qul qul = this.a.a;
            double a2 = qul.a(0, 0);
            double a3 = qul.a(1, 0);
            if (this.i.a(a2, a3) > 0.1d) {
                aqff aqff = this.i;
                aqff aqff2 = new aqff(aqey2.b, aqey2.c);
                this.i = aqff2;
                qul.a(0, 0, aqff2.b(aqff.b(a2)));
                qul.a(1, 0, this.i.a(aqff.a(a3)));
                aqft aqft = this.a;
                aqft.a(qul, aqft.b);
                z = false;
            } else {
                z = false;
            }
        } else {
            this.i = new aqff(aqey2.b, aqey2.c);
            z = true;
        }
        double a4 = this.i.a(aqey2.b);
        this.e.a(0, 0, this.i.b(aqey2.c));
        this.e.a(1, 0, a4);
        int i2 = aqey2.d;
        if (aqey.b() && i2 < 10000) {
            i2 = 10000;
        }
        double d3 = (double) i2;
        Double.isNaN(d3);
        double d4 = d3 / 1000.0d;
        double sqrt = Math.sqrt(d2 + 1.0d);
        this.f.a();
        double d5 = d4 * d4 * sqrt;
        this.f.a(0, 0, d5);
        this.f.a(1, 1, d5);
        if (z) {
            this.a.a(this.e, this.f);
            return;
        }
        qul qul2 = this.a.b;
        aqgr.f(qul2, qul2, qul2);
        for (int i3 = 0; i3 < qul2.c; i3++) {
            double[] dArr = qul2.d;
            dArr[i3] = dArr[i3] * sqrt;
        }
        this.a.b(this.e, d, this.f);
    }
}
