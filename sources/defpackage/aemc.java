package defpackage;

import java.lang.reflect.Array;

/* renamed from: aemc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aemc {
    public final byte[][] a = ((byte[][]) Array.newInstance(byte.class, new int[]{4, 3}));
    private double[][] b = ((double[][]) Array.newInstance(double.class, new int[]{4, 3}));
    private double[][] c = null;

    public aemc() {
        for (int i = 0; i < 3; i++) {
            for (int i2 = 0; i2 < 4; i2++) {
                this.a[i2][i] = (byte) i;
            }
        }
    }

    private final double b(int i) {
        double d = 0.0d;
        for (int i2 = 0; i2 < 4; i2++) {
            d += this.c[i2][i];
        }
        return d;
    }

    public final aemb a(int i) {
        double[][] dArr = this.c;
        if (dArr == null) {
            this.c = this.b;
            this.b = null;
            for (int i2 = 0; i2 < 3; i2++) {
                for (int i3 = 0; i3 < 4; i3++) {
                    byte b2 = this.a[i3][i2];
                    if (b2 != i2) {
                        double b3 = this.c[i3][b2] / b(b2);
                        this.c[i3][i2] = 0.0d;
                        this.c[i3][i2] = ((-b3) * b(i2)) / (b3 - 4.0d);
                    }
                }
            }
            for (int i4 = 0; i4 < 3; i4++) {
                double b4 = b(i4);
                int i5 = 0;
                while (i5 < 4) {
                    double[] dArr2 = this.c[i5];
                    double d = dArr2[i4];
                    if (d != 0.0d) {
                        dArr2[i4] = Math.log10(d / b4);
                        i5++;
                    } else {
                        throw new IllegalArgumentException(String.format("All state/observation combinations must have a frequency > 0, state=%s, obs=%s", new Object[]{Integer.valueOf(i4), Integer.valueOf(i5)}));
                    }
                }
            }
            dArr = this.c;
        }
        return new aemb(dArr[i], i);
    }

    public final void a(int i, int i2, double d) {
        this.b[i2][i] = d;
    }
}
