package defpackage;

/* renamed from: ajra  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajra {
    public final double a;
    public final double b;
    public final double c;
    private double d = -1.0d;

    public ajra(double[] dArr) {
        amrl.a(dArr.length == 3);
        this.a = dArr[0];
        this.b = dArr[1];
        this.c = dArr[2];
    }

    public final double a() {
        double d2 = this.d;
        if (d2 >= 0.0d) {
            return d2;
        }
        double sqrt = Math.sqrt(Math.pow(this.a, 2.0d) + Math.pow(this.b, 2.0d) + Math.pow(this.c, 2.0d));
        this.d = sqrt;
        return sqrt;
    }
}
