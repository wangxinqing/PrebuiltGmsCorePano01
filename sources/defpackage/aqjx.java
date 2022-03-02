package defpackage;

/* renamed from: aqjx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqjx extends aqjr implements aqir {
    private aqff b;
    private final double c;
    private final double d;
    private aqjy e;

    public aqjx(aqia aqia) {
        amrl.a((Object) aqia);
        this.c = aqia.a();
        if (aqia.b() > 1.0d) {
            this.d = aqia.b();
        } else {
            this.d = 1.0d;
        }
    }

    public final double a(aqjc aqjc) {
        double d2;
        double d3;
        aqjc aqjc2 = aqjc;
        aqff aqff = this.b;
        if (aqff == null || this.e == null) {
            return 1.0d;
        }
        double a = aell.a(aqff.a(aqjc2.b[1]));
        double a2 = aell.a(this.b.b(aqjc2.b[0]));
        aqjy aqjy = this.e;
        double d4 = this.d;
        double d5 = this.c;
        double b2 = aqjy.f.b(aell.a(a2));
        double a3 = aqjy.f.a(aell.a(a));
        double d6 = aqjy.d;
        double d7 = aqjy.a;
        double d8 = (b2 - d6) / 0.0d;
        double d9 = (a3 - aqjy.e) / 0.0d;
        if (d8 < 0.0d || d8 + 1.0d > ((double) aqjy.b) || d9 < 0.0d || d9 + 1.0d > ((double) aqjy.c)) {
            d2 = 5.0E-6d;
        } else {
            int floor = (int) Math.floor(d8);
            double d10 = (double) floor;
            Double.isNaN(d10);
            double d11 = d8 - d10;
            int floor2 = (int) Math.floor(d9);
            double d12 = (double) floor2;
            Double.isNaN(d12);
            double d13 = d9 - d12;
            double a4 = aqjy.a(d11, floor, floor2);
            int i = floor2 + 1;
            if (i < aqjy.c) {
                d3 = aqjy.a(d11, floor, i);
            } else {
                d3 = 0.0d;
            }
            d2 = ((1.0d - d13) * a4) + (d13 * d3);
        }
        if (Double.isInfinite(d2)) {
            d2 = 5.0E-7d;
        } else if (Double.isNaN(d2)) {
            d2 = 5.0E-7d;
        }
        return Math.pow(d2, 1.0d / d4) + d5;
    }

    public final void a(aqff aqff, aqff aqff2) {
        this.b = aqff2;
        this.e = null;
    }

    public final void b() {
        this.a = null;
        this.e = null;
    }

    public final void a() {
        boolean z;
        aqjb aqjb = this.a;
        if (aqjb == null || this.b == null) {
            this.e = null;
            return;
        }
        if (aqjb.c == 9) {
            z = true;
        } else {
            z = false;
        }
        amrl.a(z);
        aqij aqij = (aqij) this.a;
        amzy amzy = aqij.a;
        amrl.a((Object) null);
        amzy amzy2 = aqij.a;
        throw null;
    }
}
