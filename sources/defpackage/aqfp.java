package defpackage;

import java.io.PrintWriter;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* renamed from: aqfp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqfp extends aqfd {
    private static final long e = TimeUnit.SECONDS.toNanos(12);
    public final aqgk b = new aqgk();
    public final aqgg c;
    public final aqgj d = new aqgj();
    private final aqgg f;
    private final aqgg g;
    private final float h;
    private final boolean i;

    public aqfp(aqfj aqfj) {
        aqfc aqfc = (aqfc) aqfj;
        this.c = new aqge(new aqgh(this.d, aqfc.f), e);
        this.h = aqfc.a;
        this.i = aqfc.e;
        aqfk aqfk = new aqfk(new aqfe());
        aqfh aqfh = new aqfh(new aqfl(), 3);
        this.f = new aqfm(new aqfe());
        this.g = new aqfg(new aqgc(new aqfr(aqfc.b, aqfc.c), new aqfn(this.f, aqfk), true, aqfc.d), aqfh);
        this.a = new aqgg[]{this.g, new aqfo(this), this.d};
    }

    private final boolean e() {
        aqey a = this.g.a();
        return a != null && !a.c();
    }

    public final int a(long j, int i2) {
        int a = this.g.a(j, i2);
        if (e()) {
            if (!this.d.b(j)) {
                a |= 16;
            }
            if (this.d.a(j) >= 4.0f) {
                return a;
            }
            aqey a2 = this.g.a();
            if ((a2 != null && a2.a() && this.i) || (a & 32) != 0 || a2.b()) {
                return a | 24;
            }
        }
        return a;
    }

    public final long b() {
        return (!e() ? this.g : this.c).b();
    }

    public final aqey a() {
        return e() ? this.c.a() : this.g.a();
    }

    public final void a(long j, float f2, float f3) {
        super.a(j, f2, f3);
        if (e()) {
            this.c.a(j, f2, f3);
        }
    }

    public final void a(long j, aqey aqey) {
        aqey a = aqgd.a(aqey, this.h);
        this.b.a(a);
        super.a(j, a);
        this.f.a(j, aqey);
        if (e()) {
            this.c.a(j, this.g.a());
        }
    }

    public final void a(long j, aqgf aqgf) {
        this.b.a(aqgf);
        aqgf aqgf2 = this.b.a;
        this.c.a(j, aqgf2);
        super.a(j, aqgf2);
    }

    public final void a(long j, PrintWriter printWriter) {
        StringBuilder sb = new StringBuilder();
        sb.append("FusedPositionKalmanFusion:");
        String valueOf = String.valueOf(String.format(Locale.US, "%.1f", new Object[]{Float.valueOf(this.h)}));
        sb.append(valueOf.length() == 0 ? new String(" gpsNormalization=") : " gpsNormalization=".concat(valueOf));
        boolean e2 = e();
        StringBuilder sb2 = new StringBuilder(21);
        sb2.append(" Kalman active: ");
        sb2.append(e2);
        sb.append(sb2.toString());
        printWriter.println(sb);
        super.a(j, printWriter);
    }
}
