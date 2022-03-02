package defpackage;

/* renamed from: aqgq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqgq {
    public qul a = null;

    public final void a(qul qul) {
        qul qul2 = qul;
        int i = qul2.a;
        if (i == qul2.b) {
            qul qul3 = this.a;
            if (qul3 == null || qul3.a < i) {
                this.a = new qul(i, i);
            }
            this.a.b(i, i);
            int i2 = qul2.a;
            int i3 = 0;
            while (i3 < qul2.c) {
                double d = 0.0d;
                for (int i4 = i3; i4 < i2; i4++) {
                    double d2 = qul2.d[i4];
                    int i5 = qul2.a;
                    int i6 = i4 - i5;
                    int i7 = i3 - i5;
                    while (i7 >= 0) {
                        double[] dArr = this.a.d;
                        d2 -= dArr[i6] * dArr[i7];
                        int i8 = qul2.a;
                        i6 -= i8;
                        i7 -= i8;
                    }
                    if (i4 != i3) {
                        this.a.d[i4] = d2 / d;
                    } else {
                        if (d2 >= 0.0d) {
                            d = Math.sqrt(d2);
                        } else if (d2 >= -0.001d) {
                            d = 0.0d;
                        } else {
                            throw new IllegalArgumentException(String.format("Input matrix must be positive definite\nMatrix: %s\nInternal Sum: %f", new Object[]{qul2, Double.valueOf(d2)}));
                        }
                        this.a.d[i4] = d;
                    }
                }
                int i9 = qul2.a;
                i2 += i9;
                i3 += i9 + 1;
            }
            return;
        }
        throw new IllegalArgumentException(String.format("Input matrix must be square (is size %d x %d)", new Object[]{Integer.valueOf(i), Integer.valueOf(qul2.b)}));
    }

    public final void a(qul qul, qul qul2) {
        int i;
        qul qul3;
        int i2;
        qul qul4;
        int i3;
        qul qul5 = this.a;
        if (qul5 != null) {
            int i4 = 0;
            if (qul.b != 1 || qul.a != (i = qul5.b)) {
                throw new IllegalArgumentException(String.format("b has the wrong size, should be %d x 1 but is %d x %d", new Object[]{Integer.valueOf(qul5.b), Integer.valueOf(qul.a), Integer.valueOf(qul.b)}));
            } else if (qul2.b == 1 && qul2.a == i) {
                int i5 = 0;
                while (true) {
                    qul3 = this.a;
                    i2 = qul3.c;
                    if (i4 >= i2) {
                        break;
                    }
                    double d = qul.d[i5];
                    int i6 = i4 - qul3.a;
                    int i7 = i5 - 1;
                    while (i6 >= 0) {
                        qul qul6 = this.a;
                        d -= qul6.d[i6] * qul2.d[i7];
                        i6 -= qul6.a;
                        i7--;
                    }
                    double[] dArr = qul2.d;
                    qul qul7 = this.a;
                    dArr[i5] = d / qul7.d[i4];
                    i4 += qul7.a + 1;
                    i5++;
                }
                int i8 = i2 - 1;
                int i9 = qul3.a - 1;
                while (i8 >= 0) {
                    double d2 = qul2.d[i9];
                    int i10 = i8 + 1;
                    int i11 = i9 + 1;
                    while (true) {
                        qul4 = this.a;
                        i3 = qul4.a;
                        if (i11 >= i3) {
                            break;
                        }
                        d2 -= qul4.d[i10] * qul2.d[i11];
                        i10++;
                        i11++;
                    }
                    qul2.d[i9] = d2 / qul4.d[i8];
                    i8 -= i3 + 1;
                    i9--;
                }
            } else {
                throw new IllegalArgumentException(String.format("x has the wrong size, should be %d x 1 but is %d x %d", new Object[]{Integer.valueOf(i), Integer.valueOf(qul2.a), Integer.valueOf(qul2.b)}));
            }
        } else {
            throw new IllegalStateException("Must call decompose before calling solve");
        }
    }
}
