package defpackage;

/* renamed from: airn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class airn {
    public double a = 0.0d;
    public double b = 0.0d;
    public int c = 0;
    public final double[] d;
    public final double[] e;
    public final int[] f;
    private double g = 0.0d;
    private double h = 0.0d;

    public airn(int i) {
        this.d = new double[i];
        this.e = new double[i];
        this.f = new int[i];
    }

    public final double a() {
        int i;
        double d2 = this.g;
        if (d2 != 0.0d || (i = this.c) == 0) {
            return d2;
        }
        double d3 = this.a;
        double d4 = (double) i;
        Double.isNaN(d4);
        double d5 = d3 / d4;
        this.g = d5;
        return d5;
    }

    public final double b() {
        int i;
        double d2 = this.h;
        if (d2 != 0.0d || (i = this.c) == 0) {
            return d2;
        }
        double d3 = this.b;
        double d4 = (double) i;
        Double.isNaN(d4);
        double d5 = d3 / d4;
        this.h = d5;
        return d5;
    }
}
