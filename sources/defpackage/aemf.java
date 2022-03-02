package defpackage;

import java.lang.reflect.Array;
import java.util.ArrayList;

/* renamed from: aemf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aemf {
    public final byte[][] a;
    public final ArrayList b;
    public final aeme c;
    public int d = 0;
    public int e = 0;
    public int f;
    public aemb g = null;
    private final int h;
    private final int i;
    private final double[] j;
    private double[] k;
    private double[] l;
    private final aemd m;

    public final void a() {
        this.b.clear();
        int i2 = 0;
        this.d = 0;
        this.e = 0;
        this.g = null;
        double d2 = -1.0d;
        int i3 = -1;
        while (true) {
            double[] dArr = this.j;
            if (i2 < dArr.length) {
                double d3 = dArr[i2];
                this.k[i2] = Math.log10(d3);
                if (d3 > d2) {
                    i3 = i2;
                }
                if (d3 > d2) {
                    d2 = d3;
                }
                i2++;
            } else {
                this.f = i3;
                return;
            }
        }
    }

    public aemf(double[] dArr, aemd aemd) {
        int length = dArr.length;
        if (length <= 127) {
            this.i = 1;
            this.j = dArr;
            this.h = length;
            int[] iArr = new int[2];
            iArr[1] = 1;
            iArr[0] = length;
            this.a = (byte[][]) Array.newInstance(byte.class, iArr);
            this.b = new ArrayList(1);
            this.m = aemd;
            this.c = new aeme(this);
            int i2 = this.h;
            this.k = new double[i2];
            this.l = new double[i2];
            a();
            return;
        }
        throw new IllegalArgumentException("Only 127 states supported (this is easy to adjust)");
    }

    public final void a(aemb aemb) {
        aemb aemb2 = aemb;
        this.f = -1;
        double[] dArr = this.k;
        this.k = this.l;
        this.l = dArr;
        double d2 = -1.7976931348623157E308d;
        for (byte b2 = 0; b2 < this.h; b2 = (byte) (b2 + 1)) {
            double d3 = aemb2.a[b2];
            double d4 = -1.7976931348623157E308d;
            byte b3 = -1;
            for (byte b4 = 0; b4 < this.h; b4 = (byte) (b4 + 1)) {
                double d5 = d3 + this.m.a[b4][b2] + dArr[b4];
                if (d5 > d4 || b3 == -1) {
                    b3 = b4;
                    d4 = d5;
                }
            }
            if (d4 > d2 || this.f == -1) {
                this.f = b2;
                d2 = d4;
            }
            this.a[b2][this.d] = b3;
            this.k[b2] = d4;
        }
        int size = this.b.size();
        int i2 = this.d;
        if (size <= i2) {
            this.b.add(this.g);
        } else {
            this.b.set(i2, this.g);
        }
        this.g = aemb2;
        int i3 = this.d + 1;
        this.d = i3;
        int i4 = this.i;
        if (i3 >= i4) {
            this.d = 0;
        }
        if (this.e < i4) {
            this.e = 1;
        }
    }
}
