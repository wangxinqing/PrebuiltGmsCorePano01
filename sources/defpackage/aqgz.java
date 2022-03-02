package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: aqgz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqgz {
    public static final double a = Math.toRadians(50.0d);
    public static final double b = Math.toRadians(25.0d);
    public static final double c = Math.toRadians(1.0d);
    boolean d;
    double e;
    double f;
    double g;
    double h;
    double[] i;
    int j;
    public final List k = new ArrayList();
    public final aqhf l;
    public double m;
    public double n;
    public double o;

    public aqgz() {
        ativ.b(true, "Sample frequency must be greater than zero.");
        a();
        a(50.0d);
        this.l = new aqhf();
    }

    static int a(double[] dArr, int i2) {
        int length = dArr.length;
        int i3 = i2 + (length >> 1);
        return i3 >= length ? i3 - length : i3;
    }

    public final void b() {
        aqhf aqhf = this.l;
        if (aqhf != null) {
            aqhf.a = 0.0d;
            aqhf.b = 0;
        }
        this.d = false;
    }

    public final void a() {
        b();
        this.e = 0.0d;
        this.f = 0.0d;
        this.n = 0.0d;
        this.j = 0;
        double[] dArr = this.i;
        if (dArr != null) {
            Arrays.fill(dArr, 0.0d);
        }
    }

    public final void a(double d2) {
        if (d2 > 0.0d) {
            this.h = 1.0d / d2;
            this.g = d2;
            this.i = new double[Math.max(3, (int) (d2 * 0.15d))];
            a();
        }
    }

    public final void a(aqha aqha) {
        this.k.add(aqha);
    }
}
