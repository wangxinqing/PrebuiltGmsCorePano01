package defpackage;

/* renamed from: aqgr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqgr {
    public static void a(qul qul, qul qul2, qul qul3) {
        qul qul4 = qul;
        qul qul5 = qul2;
        qul qul6 = qul3;
        int i = qul4.b;
        if (i == qul5.a) {
            int i2 = qul6.a;
            int i3 = qul4.a;
            if (i2 != i3 || qul6.b != qul5.b) {
                throw new IllegalArgumentException(String.format("C has wrong dimensions (should be %d x %d but is %d x %d)", new Object[]{Integer.valueOf(i3), Integer.valueOf(qul5.b), Integer.valueOf(qul6.a), Integer.valueOf(qul6.b)}));
            } else if (qul6 == qul4 || qul6 == qul5) {
                throw new IllegalArgumentException("c must be a different object from a or b");
            } else {
                int i4 = 0;
                int i5 = 0;
                while (i4 < qul6.c) {
                    int i6 = qul5.a + i5;
                    int i7 = i4;
                    int i8 = 0;
                    while (i8 < qul4.a) {
                        double d = 0.0d;
                        int i9 = i8;
                        for (int i10 = i5; i10 < i6; i10++) {
                            d += qul4.d[i9] * qul5.d[i10];
                            i9 += qul4.a;
                        }
                        qul6.d[i7] = d;
                        i8++;
                        i7++;
                    }
                    i4 += qul6.a;
                    i5 += qul5.a;
                }
            }
        } else {
            throw new IllegalArgumentException(String.format("Number of columns in A doesn't match number of rows in B (%d != %d)", new Object[]{Integer.valueOf(i), Integer.valueOf(qul5.a)}));
        }
    }

    public static void b(qul qul, qul qul2, qul qul3) {
        qul qul4 = qul;
        qul qul5 = qul2;
        qul qul6 = qul3;
        int i = qul4.a;
        if (i == qul5.a) {
            int i2 = qul6.a;
            int i3 = qul4.b;
            if (i2 != i3 || qul6.b != qul5.b) {
                throw new IllegalArgumentException(String.format("C has wrong dimensions (should be %d x %d but is %d x %d)", new Object[]{Integer.valueOf(i3), Integer.valueOf(qul5.b), Integer.valueOf(qul6.a), Integer.valueOf(qul6.b)}));
            } else if (qul6 == qul4 || qul6 == qul5) {
                throw new IllegalArgumentException("c must be a different object from a or b");
            } else {
                int i4 = 0;
                int i5 = 0;
                while (i4 < qul6.c) {
                    int i6 = qul5.a + i5;
                    int i7 = i4;
                    int i8 = 0;
                    while (i8 < qul4.c) {
                        double d = 0.0d;
                        int i9 = i8;
                        for (int i10 = i5; i10 < i6; i10++) {
                            d += qul4.d[i9] * qul5.d[i10];
                            i9++;
                        }
                        qul6.d[i7] = d;
                        i8 += qul4.a;
                        i7++;
                    }
                    i4 += qul6.a;
                    i5 += qul5.a;
                }
            }
        } else {
            throw new IllegalArgumentException(String.format("Number of columns in A' doesn't match number of rows in B (%d != %d)", new Object[]{Integer.valueOf(i), Integer.valueOf(qul5.a)}));
        }
    }

    public static void c(qul qul, qul qul2, qul qul3) {
        qul qul4 = qul;
        qul qul5 = qul2;
        qul qul6 = qul3;
        int i = qul4.b;
        if (i == qul5.b) {
            int i2 = qul6.a;
            int i3 = qul4.a;
            if (i2 != i3 || qul6.b != qul5.a) {
                throw new IllegalArgumentException(String.format("C has wrong dimensions (should be %d x %d but is %d x %d)", new Object[]{Integer.valueOf(i3), Integer.valueOf(qul5.a), Integer.valueOf(qul6.a), Integer.valueOf(qul6.b)}));
            } else if (qul6 == qul4 || qul6 == qul5) {
                throw new IllegalArgumentException("c must be a different object from a or b");
            } else {
                int i4 = 0;
                int i5 = 0;
                while (i4 < qul6.c) {
                    int i6 = qul5.c;
                    int i7 = i4;
                    int i8 = 0;
                    while (i8 < qul4.a) {
                        double d = 0.0d;
                        int i9 = i8;
                        for (int i10 = i5; i10 < i6; i10 += qul5.a) {
                            d += qul4.d[i9] * qul5.d[i10];
                            i9 += qul4.a;
                        }
                        qul6.d[i7] = d;
                        i8++;
                        i7++;
                    }
                    i4 += qul6.a;
                    i5++;
                }
            }
        } else {
            throw new IllegalArgumentException(String.format("Number of columns in A doesn't match number of rows in B' (%d != %d)", new Object[]{Integer.valueOf(i), Integer.valueOf(qul5.b)}));
        }
    }

    public static void d(qul qul, qul qul2, qul qul3) {
        f(qul, qul2, qul3);
        for (int i = 0; i < qul.c; i++) {
            qul3.d[i] = qul.d[i] + qul2.d[i];
        }
    }

    public static void e(qul qul, qul qul2, qul qul3) {
        f(qul, qul2, qul3);
        for (int i = 0; i < qul.c; i++) {
            qul3.d[i] = qul.d[i] - qul2.d[i];
        }
    }

    public static void f(qul qul, qul qul2, qul qul3) {
        int i;
        int i2 = qul.b;
        if (i2 != qul2.b || (i = qul.a) != qul2.a) {
            throw new IllegalArgumentException(String.format("Dimensions of A and B don't match (A is %d x %d and B is %d x %d)", new Object[]{Integer.valueOf(qul.a), Integer.valueOf(qul.b), Integer.valueOf(qul2.a), Integer.valueOf(qul2.b)}));
        } else if (qul3.a != i || qul3.b != i2) {
            throw new IllegalArgumentException(String.format("output has wrong dimensions (should be %d x %d but is %d x %d)", new Object[]{Integer.valueOf(i), Integer.valueOf(qul.b), Integer.valueOf(qul3.a), Integer.valueOf(qul3.b)}));
        }
    }
}
