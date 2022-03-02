package defpackage;

/* renamed from: aqhb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqhb implements aqha {
    public final aqgz a;
    double b;
    final aqhc[] c = new aqhc[4];
    aqhg d;
    public final aqhg e = new aqhg();
    public final aqhg f = new aqhg();
    public final aqhg g = new aqhg();
    public final aqhg h = new aqhg();
    public final aqhd i = new aqhd();
    public final aqhh j = new aqhh();
    public final aqhi k = new aqhi();
    public double l;

    public aqhb() {
        ativ.b(true, "expectedSampleFrequencyHz must be greater than zero.");
        this.b = Math.min(50.0d, 1000.0d);
        aqgz aqgz = new aqgz();
        this.a = aqgz;
        aqgz.a((aqha) this);
        a();
    }

    public final void a() {
        b();
        this.a.a();
        this.d = null;
        this.l = 0.0d;
    }

    public final void a(double d2, double d3) {
        this.l -= d3;
    }

    public final void b() {
        boolean z;
        boolean z2;
        int i2;
        boolean z3;
        boolean z4;
        double d2 = this.b;
        boolean z5 = true;
        int max = Math.max(1, (int) (d2 + d2));
        double d3 = this.b;
        if (max > 0) {
            z = true;
        } else {
            z = false;
        }
        ativ.a(z, "Order must be greater than zero, but is %d.", Integer.valueOf(max));
        if (d3 > 0.0d) {
            z2 = true;
        } else {
            z2 = false;
        }
        ativ.b(z2, "Filter sample frequency must be greater than zero.");
        ativ.b(true, "Filter cutoff frequency must be greater than zero.");
        int i3 = max + 1;
        double d4 = 0.1d / (d3 / 2.0d);
        double[] dArr = new double[i3];
        int i4 = 0;
        while (true) {
            i2 = i3 / 2;
            if (i4 > i2) {
                break;
            }
            int i5 = i3 - 1;
            double d5 = (double) i4;
            double d6 = (double) i5;
            Double.isNaN(d6);
            Double.isNaN(d5);
            double d7 = (d5 - (d6 / 2.0d)) * d4;
            if (Math.abs(d7) < 1.0E-6d) {
                double d8 = 0.25d * d4;
                dArr[i4] = d8;
                dArr[i5 - i4] = d8;
            } else {
                double d9 = d7 * 3.141592653589793d;
                double sin = ((0.25d * d4) * Math.sin(d9)) / d9;
                dArr[i4] = sin;
                dArr[i5 - i4] = sin;
            }
            i4++;
        }
        if (max % 2 == 0) {
            dArr[i2 + 1] = dArr[i2 - 1];
        }
        if (i3 > 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        ativ.b(z3, "Window length must be greater than zero.");
        double[] dArr2 = new double[i3];
        for (int i6 = 0; i6 < i2; i6++) {
            int i7 = i3 - 1;
            double d10 = (double) i6;
            Double.isNaN(d10);
            double d11 = (double) i7;
            Double.isNaN(d11);
            double cos = 0.54d - (Math.cos((d10 * 6.283185307179586d) / d11) * 0.45999999999999996d);
            dArr2[i6] = cos;
            dArr2[i7 - i6] = cos;
        }
        if (i3 % 2 != 0) {
            dArr2[i2] = 1.0d;
        }
        if (i3 == i3) {
            z4 = true;
        } else {
            z4 = false;
        }
        ativ.b(z4, "The dot product requires equal length arrays");
        ativ.b(z4, "The dot product requires output array of equal length to input arrays");
        for (int i8 = 0; i8 < i3; i8++) {
            dArr[i8] = dArr[i8] * dArr2[i8];
        }
        double d12 = 0.0d;
        for (int i9 = 0; i9 < i3; i9++) {
            d12 += dArr[i9];
        }
        if (d12 <= 1.0E-100d) {
            z5 = false;
        }
        ativ.a(z5, (Object) "Sum of filter coefficients is near or below zero.");
        for (int i10 = 0; i10 < i3; i10++) {
            dArr[i10] = dArr[i10] / d12;
        }
        int i11 = 0;
        while (true) {
            aqhc[] aqhcArr = this.c;
            int length = aqhcArr.length;
            if (i11 < 4) {
                aqhcArr[i11] = new aqhc(dArr);
                i11++;
            } else {
                return;
            }
        }
    }
}
