package defpackage;

/* renamed from: qum  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qum extends quq {
    public final float[] a;
    public int b = 0;
    public int c = 0;
    private double d = 0.0d;
    private int e = 0;

    public qum(int i) {
        this.a = new float[i];
    }

    public final int a() {
        return this.c;
    }

    public final float b() {
        return (float) this.d;
    }

    public final void a(float f) {
        int i = this.e + 1;
        this.e = i;
        if (i == Integer.MAX_VALUE) {
            this.e = 0;
            this.d = 0.0d;
            for (float f2 : this.a) {
                double d2 = this.d;
                double d3 = (double) f2;
                Double.isNaN(d3);
                this.d = d2 + d3;
            }
        }
        int i2 = this.c;
        float[] fArr = this.a;
        int length = fArr.length;
        if (i2 >= length) {
            double d4 = this.d;
            double d5 = (double) fArr[this.b];
            Double.isNaN(d5);
            this.d = d4 - d5;
        } else {
            this.c = i2 + 1;
        }
        int i3 = this.b;
        fArr[i3] = f;
        double d6 = this.d;
        double d7 = (double) f;
        Double.isNaN(d7);
        this.d = d6 + d7;
        int i4 = i3 + 1;
        this.b = i4;
        if (i4 >= length) {
            this.b = 0;
        }
    }
}
