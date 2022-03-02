package defpackage;

/* renamed from: aqft  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqft {
    public final qul a;
    public final qul b;
    private final aqgq c = new aqgq();
    private final qul d;
    private final qul e;

    public aqft(qul qul, qul qul2, qul qul3, qul qul4) {
        this.a = qul;
        this.b = qul2;
        this.d = qul3;
        this.e = qul4;
    }

    public final void a(qul qul, qul qul2) {
        this.a.a(qul);
        this.b.a(qul2);
    }

    public final void b(qul qul, qul qul2, qul qul3) {
        qul qul4;
        int i;
        int i2;
        qul qul5 = qul;
        qul qul6 = qul2;
        this.d.b(qul5.a, this.a.a);
        aqgr.a(qul6, this.b, this.d);
        qul qul7 = this.e;
        int i3 = qul5.a;
        qul7.b(i3, i3);
        aqgr.c(this.d, qul6, this.e);
        qul qul8 = this.e;
        aqgr.d(qul8, qul3, qul8);
        this.c.a(this.e);
        qul qul9 = this.d;
        int i4 = qul5.a;
        qul9.b(i4, i4);
        aqgq aqgq = this.c;
        qul qul10 = this.d;
        qul qul11 = aqgq.a;
        if (qul11 != null) {
            int i5 = qul10.a;
            int i6 = qul11.a;
            int i7 = 4;
            if (i5 == i6 && qul10.b == qul11.b) {
                int i8 = qul11.c;
                int i9 = 0;
                int i10 = 0;
                int i11 = 0;
                while (i9 < i8) {
                    int i12 = i10;
                    int i13 = i11;
                    while (true) {
                        i2 = aqgq.a.a;
                        if (i13 >= i2) {
                            break;
                        }
                        double d2 = i11 == i13 ? 1.0d : 0.0d;
                        int i14 = i12 - i2;
                        for (int i15 = i13 - 1; i15 >= i11; i15--) {
                            qul qul12 = aqgq.a;
                            d2 -= qul12.d[i14] * qul10.d[i9 + i15];
                            i14 -= qul12.a;
                        }
                        double[] dArr = qul10.d;
                        qul qul13 = aqgq.a;
                        dArr[i9 + i13] = d2 / qul13.d[i12];
                        i12 += qul13.a + 1;
                        i13++;
                        i7 = 4;
                    }
                    i9 += i2;
                    i11++;
                    i10 += i2 + 1;
                }
                int i16 = aqgq.a.a;
                int i17 = i8 - i16;
                for (int i18 = i16 - 1; i18 >= 0; i18--) {
                    int i19 = i8 - 1;
                    for (int i20 = aqgq.a.a - 1; i20 >= i18; i20--) {
                        int i21 = i17 + i20;
                        double d3 = qul10.d[i21];
                        int i22 = i19 + 1;
                        int i23 = i20 + 1;
                        while (true) {
                            qul4 = aqgq.a;
                            i = qul4.a;
                            if (i23 >= i) {
                                break;
                            }
                            d3 -= qul4.d[i22] * qul10.d[i17 + i23];
                            i22++;
                            i23++;
                        }
                        qul10.d[i21] = d3 / qul4.d[i19];
                        i19 -= i + 1;
                    }
                    i17 -= aqgq.a.a;
                }
                int i24 = 1;
                for (int i25 = aqgq.a.a; i25 < i8; i25 += aqgq.a.a) {
                    int i26 = 0;
                    int i27 = 0;
                    while (i26 < i24) {
                        double[] dArr2 = qul10.d;
                        dArr2[i25 + i26] = dArr2[i27 + i24];
                        i26++;
                        i27 += aqgq.a.a;
                    }
                    i24++;
                }
                this.e.b(this.a.a, qul5.a);
                aqgr.b(qul6, this.d, this.e);
                this.d.b(this.a.a, qul5.a);
                aqgr.a(this.b, this.e, this.d);
                this.e.b(qul5.a, 1);
                aqgr.a(qul6, this.a, this.e);
                qul qul14 = this.e;
                aqgr.e(qul5, qul14, qul14);
                qul qul15 = this.d;
                qul qul16 = this.e;
                qul qul17 = this.a;
                int i28 = qul15.b;
                if (i28 == qul16.a) {
                    int i29 = qul17.a;
                    int i30 = qul15.a;
                    if (i29 != i30 || qul17.b != qul16.b) {
                        Object[] objArr = new Object[i7];
                        objArr[0] = Integer.valueOf(i30);
                        objArr[1] = Integer.valueOf(qul16.b);
                        objArr[2] = Integer.valueOf(qul17.a);
                        objArr[3] = Integer.valueOf(qul17.b);
                        throw new IllegalArgumentException(String.format("C has wrong dimensions (should be %d x %d but is %d x %d)", objArr));
                    } else if (qul17 == qul15 || qul17 == qul16) {
                        throw new IllegalArgumentException("c must be a different object from a or b");
                    } else {
                        int i31 = 0;
                        int i32 = 0;
                        while (i31 < qul17.c) {
                            int i33 = qul16.a + i32;
                            int i34 = i31;
                            int i35 = 0;
                            while (i35 < qul15.a) {
                                int i36 = i35;
                                double d4 = 0.0d;
                                for (int i37 = i32; i37 < i33; i37++) {
                                    d4 += qul15.d[i36] * qul16.d[i37];
                                    i36 += qul15.a;
                                }
                                double[] dArr3 = qul17.d;
                                dArr3[i34] = dArr3[i34] + d4;
                                i35++;
                                i34++;
                            }
                            i31 += qul17.a;
                            i32 += qul16.a;
                        }
                        qul qul18 = this.e;
                        int i38 = this.a.a;
                        qul18.b(i38, i38);
                        aqgr.a(this.d, qul6, this.e);
                        qul qul19 = this.d;
                        int i39 = this.a.a;
                        qul19.b(i39, i39);
                        aqgr.a(this.e, this.b, this.d);
                        qul qul20 = this.b;
                        aqgr.e(qul20, this.d, qul20);
                    }
                } else {
                    throw new IllegalArgumentException(String.format("Number of columns in A doesn't match number of rows in B (%d != %d)", new Object[]{Integer.valueOf(i28), Integer.valueOf(qul16.a)}));
                }
            } else {
                throw new IllegalArgumentException(String.format("output has the wrong size, should be %d x %d but is %d x %d", new Object[]{Integer.valueOf(i6), Integer.valueOf(aqgq.a.b), Integer.valueOf(qul10.a), Integer.valueOf(qul10.b)}));
            }
        } else {
            throw new IllegalStateException("Must call decompose before calling invert");
        }
    }

    public final void a(qul qul, qul qul2, qul qul3) {
        this.d.b(this.a.a, 1);
        aqgr.a(qul, this.a, this.d);
        this.a.a(this.d);
        qul qul4 = this.d;
        int i = this.a.a;
        qul4.b(i, i);
        aqgr.a(qul, this.b, this.d);
        aqgr.c(this.d, qul, this.b);
        qul qul5 = this.b;
        aqgr.d(qul5, qul2, qul5);
        if (qul3 != null) {
            qul qul6 = this.a;
            aqgr.d(qul6, qul3, qul6);
        }
    }
}
