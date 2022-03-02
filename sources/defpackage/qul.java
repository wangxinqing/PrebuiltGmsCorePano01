package defpackage;

import java.util.Arrays;
import java.util.Locale;

/* renamed from: qul  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qul {
    public int a;
    public int b;
    public int c;
    public double[] d;

    public qul(int i, int i2) {
        this.a = i;
        this.b = i2;
        int i3 = i * i2;
        this.c = i3;
        this.d = new double[i3];
    }

    public static qul a(int i) {
        qul qul = new qul(i, i);
        int i2 = 0;
        while (i2 < qul.c) {
            qul.d[i2] = 1.0d;
            i2 += i + 1;
        }
        return qul;
    }

    public final void b(int i, int i2) {
        int i3 = i * i2;
        if (i3 > this.d.length) {
            this.d = new double[i3];
        }
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof qul) {
            qul qul = (qul) obj;
            if (this.a == qul.a && this.b == qul.b) {
                for (int i = 0; i < this.c; i++) {
                    if (this.d[i] != qul.d[i]) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.a;
        int i2 = 1;
        if (this.b * i != this.c) {
            for (int i3 = 0; i3 < this.c; i3++) {
                long doubleToLongBits = Double.doubleToLongBits(this.d[i3]);
                i2 = (i2 * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
            }
            return (((i2 * 31) + this.a) * 31) + this.b;
        }
        return Arrays.hashCode(new Object[]{Integer.valueOf(i), Integer.valueOf(this.b), Integer.valueOf(Arrays.hashCode(this.d))});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.a; i++) {
            for (int i2 = 0; i2 < this.b; i2++) {
                sb.append(String.format(Locale.ENGLISH, "%8f", new Object[]{Double.valueOf(a(i, i2))}));
                sb.append("    ");
            }
            sb.append(10);
        }
        return sb.toString();
    }

    public qul(double[][] dArr) {
        this(dArr.length, dArr[0].length);
        int i = 0;
        for (int i2 = 0; i2 < this.b; i2++) {
            for (int i3 = 0; i3 < this.a; i3++) {
                this.d[i] = dArr[i3][i2];
                i++;
            }
        }
    }

    public final double a(int i, int i2) {
        int i3;
        if (i >= 0 && i < (i3 = this.a) && i2 >= 0 && i2 < this.b) {
            return this.d[(i2 * i3) + i];
        }
        throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Requested index out of bounds: %d must be within [0,%d] and %d must be within [0,%d]", new Object[]{Integer.valueOf(i), Integer.valueOf(this.a - 1), Integer.valueOf(i2), Integer.valueOf(this.b - 1)}));
    }

    public final void a() {
        for (int i = 0; i < this.c; i++) {
            this.d[i] = 0.0d;
        }
    }

    public final void a(int i, int i2, double d2) {
        int i3 = this.a;
        if (i >= i3 || i2 >= this.b) {
            throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Requested index out of bounds: %d must be within [0,%d] and %d must be within [0,%d]", new Object[]{Integer.valueOf(i), Integer.valueOf(this.a - 1), Integer.valueOf(i2), Integer.valueOf(this.b - 1)}));
        }
        this.d[(i2 * i3) + i] = d2;
    }

    public final void a(qul qul) {
        if (qul.a == this.a && qul.b == this.b) {
            for (int i = 0; i < this.c; i++) {
                this.d[i] = qul.d[i];
            }
            return;
        }
        throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Size of this matrix is %d x %d but size of other is %d x %d", new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(qul.a), Integer.valueOf(qul.b)}));
    }
}
