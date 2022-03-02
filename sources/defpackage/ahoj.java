package defpackage;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ahoj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahoj {
    public final ahoe a;
    private final double[][] b;
    private final double[] c;
    private final int d;
    private final ahog e = new ahog();
    private final ahok[] f;
    private final ahod g;

    @Deprecated
    public ahoj(double[] dArr, double[][] dArr2, double[][] dArr3, double[][][] dArr4, int[] iArr, double[] dArr5, int[] iArr2, int[] iArr3, aibh aibh) {
        int i;
        double d2;
        double[] dArr6 = dArr;
        this.d = dArr6.length;
        this.a = new ahoe(aibh);
        int i2 = this.d;
        this.c = new double[i2];
        int[] iArr4 = new int[2];
        iArr4[1] = i2;
        iArr4[0] = i2;
        this.b = (double[][]) Array.newInstance(double.class, iArr4);
        int i3 = 0;
        while (true) {
            i = this.d;
            if (i3 >= i) {
                break;
            }
            double[] dArr7 = this.c;
            double d3 = dArr6[i3];
            if (d3 > 0.0d) {
                d2 = Math.log(d3);
            } else {
                d2 = -1.0E20d;
            }
            dArr7[i3] = d2;
            for (int i4 = 0; i4 < this.d; i4++) {
                double[] dArr8 = this.b[i3];
                double d4 = dArr2[i3][i4];
                dArr8[i4] = d4 > 0.0d ? Math.log(d4) : -1.0E20d;
            }
            i3++;
        }
        this.f = new ahok[i];
        this.g = new ahod(dArr3, dArr4);
        for (int i5 = 0; i5 < this.d; i5++) {
            this.f[i5] = new ahok(iArr[i5], dArr5[i5], iArr2[i5], iArr3[i5]);
        }
    }

    public final List a(long j) {
        int length;
        int i;
        int i2;
        double d2;
        ahod ahod;
        int i3;
        ahok[] ahokArr;
        double[][] dArr;
        ahoe ahoe;
        int i4;
        int i5;
        double[][] dArr2;
        double[][] dArr3;
        double d3;
        double d4;
        double d5;
        double d6;
        double[][] dArr4;
        long j2;
        int i6;
        double[][] dArr5;
        Class<double> cls;
        int i7;
        int i8;
        double[][] dArr6;
        Class<double> cls2 = double.class;
        int a2 = this.a.a();
        ArrayList arrayList = new ArrayList();
        long j3 = j - (((long) a2) * 360000);
        ahoe ahoe2 = this.a;
        ahok[] ahokArr2 = this.f;
        ahod ahod2 = this.g;
        double[][] dArr7 = this.b;
        double[] dArr8 = this.c;
        int length2 = ahokArr2.length;
        ahod2.a();
        int a3 = ahoe2.a();
        int a4 = ahoe2.a();
        int[] iArr = new int[2];
        iArr[1] = length2;
        iArr[0] = a4 + 1;
        double[][] dArr9 = (double[][]) Array.newInstance(cls2, iArr);
        int i9 = 0;
        while (i9 < a4) {
            int i10 = ((ahoe2.b - i9) + 240) % 240;
            ahod2.a();
            int i11 = a4;
            int length3 = ahokArr2.length;
            double[] dArr10 = dArr8;
            double[] dArr11 = new double[length3];
            ArrayList arrayList2 = arrayList;
            for (int i12 = 0; i12 < length3; i12++) {
                dArr11[i12] = -1.0E20d;
            }
            int i13 = 1;
            while (true) {
                j2 = j3;
                if (i13 > ahoe.a(ahokArr2)) {
                    cls = cls2;
                    i6 = i10;
                    dArr5 = dArr9;
                    i7 = 0;
                    break;
                }
                int i14 = ((i10 + i13) + 240) % 240;
                ahod2.a(ahoe2.e[i14]);
                int i15 = 0;
                while (i15 < length3) {
                    ahok ahok = ahokArr2[i15];
                    Class<double> cls3 = cls2;
                    if (i13 < ahok.a) {
                        i8 = i10;
                        dArr6 = dArr9;
                    } else if (i13 <= ahok.b) {
                        i8 = i10;
                        dArr6 = dArr9;
                        dArr11[i15] = ahof.a(dArr11[i15], (i14 != ahoe2.a ? dArr9[i14][i15] : 0.0d) + ahod2.a(i15));
                    } else {
                        i8 = i10;
                        dArr6 = dArr9;
                    }
                    i15++;
                    cls2 = cls3;
                    dArr9 = dArr6;
                    i10 = i8;
                }
                cls = cls2;
                i6 = i10;
                dArr5 = dArr9;
                if (i14 != ahoe2.a) {
                    i13++;
                    j3 = j2;
                    cls2 = cls;
                    dArr9 = dArr5;
                    i10 = i6;
                } else {
                    for (int i16 = 0; i16 < length3; i16++) {
                        if (i13 < ahokArr2[i16].a) {
                            dArr11[i16] = ahof.a(dArr11[i16], ahod2.a(i16));
                        }
                    }
                    i7 = 0;
                }
            }
            while (i7 < length2) {
                double d7 = -1.0E20d;
                for (int i17 = 0; i17 < length2; i17++) {
                    d7 = ahof.a(d7, dArr11[i17] + dArr7[i7][i17]);
                }
                dArr5[i6][i7] = d7;
                i7++;
            }
            i9++;
            a4 = i11;
            dArr8 = dArr10;
            arrayList = arrayList2;
            j3 = j2;
            cls2 = cls;
            dArr9 = dArr5;
        }
        ArrayList arrayList3 = arrayList;
        long j4 = j3;
        double[][] dArr12 = dArr9;
        double[] dArr13 = dArr8;
        int i18 = a3 + 1;
        int[] iArr2 = new int[2];
        iArr2[1] = length2;
        iArr2[0] = i18;
        Class<double> cls4 = cls2;
        double[][] dArr14 = (double[][]) Array.newInstance(cls4, iArr2);
        int[] iArr3 = new int[2];
        iArr3[1] = length2;
        iArr3[0] = i18;
        double[][] dArr15 = (double[][]) Array.newInstance(cls4, iArr3);
        int i19 = a3;
        while (i19 >= 0) {
            ArrayList arrayList4 = arrayList3;
            int i20 = ahoe2.a;
            int i21 = ((i20 - i19) + 240) % 240;
            int i22 = a3 - i19;
            int i23 = i22 + 1;
            int a5 = ahoe.a(ahokArr2);
            int length4 = ahokArr2.length;
            double[][] dArr16 = dArr7;
            int i24 = a3;
            int[] iArr4 = new int[2];
            iArr4[1] = a5 + 1;
            iArr4[0] = length4;
            double[][] dArr17 = (double[][]) Array.newInstance(cls4, iArr4);
            ahod2.a();
            int i25 = 1;
            while (i25 <= a5) {
                double[][] dArr18 = dArr17;
                Class<double> cls5 = cls4;
                ahok[] ahokArr3 = ahokArr2;
                ahod ahod3 = ahod2;
                int i26 = length2;
                if (i25 <= i23) {
                    ahod = ahod3;
                    ahod.a(ahoe2.e[(((i21 + 240) - i25) + 1) % 240]);
                    i3 = 0;
                } else {
                    ahod = ahod3;
                    i3 = 0;
                }
                while (true) {
                    ahokArr = ahokArr3;
                    if (i3 >= ahokArr.length) {
                        break;
                    }
                    ahok ahok2 = ahokArr[i3];
                    int i27 = ((i21 + 240) - i25) % 240;
                    if (i25 <= ahok2.b && (i21 == i20 || i25 >= ahok2.a)) {
                        double a6 = ahod.a(i3);
                        if (i25 >= i23) {
                            dArr2 = dArr15;
                            i4 = i19;
                            dArr = dArr16;
                            d3 = dArr13[i3];
                            ahoe = ahoe2;
                            i5 = a5;
                            dArr3 = dArr14;
                        } else {
                            dArr2 = dArr15;
                            i4 = i19;
                            d3 = -1.0E20d;
                            int i28 = 0;
                            while (true) {
                                ahoe = ahoe2;
                                dArr4 = dArr16;
                                i5 = a5;
                                if (i28 >= dArr4.length) {
                                    break;
                                }
                                double[][] dArr19 = dArr4;
                                d3 = ahof.a(d3, dArr14[i27][i28] + dArr4[i28][i3]);
                                i28++;
                                dArr14 = dArr14;
                                a5 = i5;
                                ahoe2 = ahoe;
                                dArr16 = dArr19;
                            }
                            dArr = dArr4;
                            dArr3 = dArr14;
                        }
                        double d8 = a6 + d3;
                        if (i21 != i20) {
                            if (i25 < ahok2.a || i25 > ahok2.b) {
                                d6 = -1.0E20d;
                            } else {
                                if (ahok2.c == null) {
                                    ahok2.a();
                                }
                                d6 = ahok2.c[i25];
                            }
                            d4 = d8 + d6;
                        } else {
                            if (i25 <= ahok2.b) {
                                if (ahok2.d == null) {
                                    ahok2.a();
                                }
                                int i29 = ahok2.a;
                                if (i25 < i29) {
                                    d5 = ahok2.d[i29];
                                } else {
                                    d5 = ahok2.d[i25];
                                }
                            } else {
                                d5 = -1.0E20d;
                            }
                            d4 = d8 + d5;
                        }
                        dArr18[i3][i25] = d4;
                    } else {
                        dArr18[i3][i25] = -1.0E20d;
                        dArr2 = dArr15;
                        i4 = i19;
                        ahoe = ahoe2;
                        dArr = dArr16;
                        i5 = a5;
                        dArr3 = dArr14;
                    }
                    i3++;
                    dArr14 = dArr3;
                    dArr15 = dArr2;
                    a5 = i5;
                    i19 = i4;
                    ahoe2 = ahoe;
                    dArr16 = dArr;
                    ahokArr3 = ahokArr;
                }
                double[][] dArr20 = dArr15;
                int i30 = i19;
                ahoe ahoe3 = ahoe2;
                double[][] dArr21 = dArr16;
                int i31 = a5;
                double[][] dArr22 = dArr14;
                i25++;
                ahokArr2 = ahokArr;
                a5 = i31;
                length2 = i26;
                dArr17 = dArr18;
                dArr16 = dArr21;
                ahod2 = ahod;
                cls4 = cls5;
            }
            int i32 = 0;
            while (i32 < length2) {
                dArr15[i21][i32] = -1.0E20d;
                ahok ahok3 = ahokArr2[i32];
                int i33 = ahok3.a;
                int i34 = ahok3.b;
                if (i21 == ahoe2.a) {
                    i2 = 1;
                } else {
                    i2 = i33;
                }
                ahok[] ahokArr4 = ahokArr2;
                ahod ahod4 = ahod2;
                double d9 = -1.0E20d;
                while (i2 <= i34) {
                    double[][] dArr23 = dArr17;
                    int i35 = length2;
                    d9 = ahof.a(d9, dArr23[i32][i2]);
                    i2++;
                    cls4 = cls4;
                    dArr17 = dArr23;
                    ahok3 = ahok3;
                }
                dArr14[i21][i32] = d9;
                double[] dArr24 = new double[(i34 + 1)];
                dArr24[i34] = dArr17[i32][i34];
                while (i34 > 1) {
                    int i36 = i34 - 1;
                    dArr24[i36] = ahof.a(dArr17[i32][i36], dArr24[i34]);
                    i34 = i36;
                    length2 = length2;
                    cls4 = cls4;
                    dArr17 = dArr17;
                }
                double[][] dArr25 = dArr17;
                Class<double> cls6 = cls4;
                int i37 = length2;
                int i38 = 0;
                while (i38 < ahok3.b && i38 <= i22) {
                    int i39 = ((i21 - i38) + 240) % 240;
                    if (i21 != ahoe2.a) {
                        int i40 = i38 + 1;
                        d2 = dArr12[i21][i32] + (i33 < i40 ? dArr24[i40] : dArr24[i33]);
                    } else {
                        d2 = dArr24[i38 + 1];
                    }
                    double[] dArr26 = dArr15[i39];
                    dArr26[i32] = ahof.a(dArr26[i32], d2);
                    i38++;
                    dArr24 = dArr24;
                    ahok3 = ahok3;
                }
                i32++;
                ahokArr2 = ahokArr4;
                ahod2 = ahod4;
                length2 = i37;
                cls4 = cls6;
                dArr17 = dArr25;
            }
            Class<double> cls7 = cls4;
            ahok[] ahokArr5 = ahokArr2;
            ahod ahod5 = ahod2;
            int i41 = length2;
            i19--;
            a3 = i24;
            dArr7 = dArr16;
        }
        double[][] dArr27 = (double[][]) aiba.a(dArr15, dArr14).a;
        int length5 = dArr27.length;
        int a7 = this.a.a();
        StringBuilder sb = new StringBuilder(71);
        sb.append("posterior length: ");
        sb.append(length5);
        sb.append("; session length in hours: ");
        sb.append((((float) a7) * 6.0f) / 60.0f);
        sb.toString();
        ArrayList arrayList5 = new ArrayList(2);
        double d10 = -1.0d;
        int i42 = 0;
        while (true) {
            length = dArr27.length;
            if (i42 >= length) {
                break;
            }
            ahoe ahoe4 = this.a;
            if (ahoe4.f) {
                i = (ahoe4.a + i42) % 240;
            } else {
                i = i42;
            }
            double[] dArr28 = dArr27[i];
            double d11 = dArr28[1] - dArr28[0];
            if (d10 < 0.0d && d11 >= 0.0d) {
                arrayList5.add(Integer.valueOf(Math.max(0, i42 - 1)));
            } else if (d10 >= 0.0d && d11 < 0.0d) {
                arrayList5.add(Integer.valueOf(i42));
            }
            i42++;
            d10 = d11;
        }
        if (arrayList5.size() % 2 == 1) {
            arrayList5.add(Integer.valueOf(length - 1));
        }
        ArrayList arrayList6 = new ArrayList(arrayList5.size() / 2);
        int i43 = 0;
        for (int i44 = 2; i43 < arrayList5.size() / i44; i44 = 2) {
            int i45 = i43 + i43;
            arrayList6.add(new ahyw(j4 + (((long) ((Integer) arrayList5.get(i45)).intValue()) * 360000), j4 + (((long) ((Integer) arrayList5.get(i45 + 1)).intValue()) * 360000)));
            i43++;
        }
        int size = arrayList6.size();
        for (int i46 = 0; i46 < size; i46++) {
            ahyw ahyw = (ahyw) arrayList6.get(i46);
            arrayList3.add(new aiba(Long.valueOf(ahyw.a), Long.valueOf(ahyw.b)));
        }
        return arrayList3;
    }

    public final void a(ahoi ahoi) {
        boolean z;
        float[] fArr;
        int i;
        float[] fArr2;
        ahoi ahoi2 = ahoi;
        ahoe ahoe = this.a;
        ahog ahog = this.e;
        if (ahoe.d == -1) {
            long j = ahoe.g;
            if (j != -1) {
                long j2 = ahoi2.b;
                long j3 = ((j2 - j) / 360000) - 1;
                StringBuilder sb = new StringBuilder(34);
                sb.append("skippedEpochs ");
                sb.append(j3);
                sb.toString();
                if (j3 > 5) {
                    ahoe.i.add(new aiba(Long.valueOf(ahoe.g), Long.valueOf(j2)));
                    int size = ahoe.i.size();
                    StringBuilder sb2 = new StringBuilder(36);
                    sb2.append("missingDataWindows.size: ");
                    sb2.append(size);
                    sb2.toString();
                    i = 0;
                } else {
                    i = 0;
                }
                while (((long) i) < j3) {
                    int i2 = ahoe.a;
                    ahoe.b = i2;
                    int i3 = (i2 + 1) % 240;
                    ahoe.a = i3;
                    if (i3 == 0 && !ahoe.f) {
                        ahoe.f = true;
                    }
                    float[][] fArr3 = ahoe.e;
                    if (i2 == 0 && ahoe.f) {
                        fArr2 = fArr3[239];
                    } else {
                        fArr2 = fArr3[i2 - 1];
                    }
                    fArr3[i2] = fArr2;
                    ahoe.c = (int) (((long) ahoe.c) + j3);
                    i++;
                }
            }
            ahoe.d = ahoi2.c;
            ahog.a();
            z = true;
        } else {
            z = true;
        }
        while (true) {
            long j4 = ahoi2.c;
            long j5 = ahoe.d + 360000;
            if (j4 < j5) {
                break;
            }
            int i4 = ahoe.a;
            ahoe.b = i4;
            ahoe.c++;
            int i5 = (i4 + 1) % 240;
            ahoe.a = i5;
            if (i5 == 0 && !ahoe.f) {
                ahoe.f = true;
            }
            ahoe.d = j5;
            ahog.a();
            if (!z) {
                float[][] fArr4 = ahoe.e;
                int i6 = ahoe.b;
                if (i6 == 0 && ahoe.f) {
                    fArr = fArr4[239];
                } else {
                    fArr = fArr4[i6 - 1];
                }
                fArr4[i6] = fArr;
            } else {
                z = false;
            }
        }
        int i7 = ahoi2.a[0];
        int[] iArr = ahog.a;
        int i8 = iArr[0] + i7;
        iArr[0] = i8;
        int i9 = ahog.b + 1;
        ahog.b = i9;
        float[][] fArr5 = ahoe.e;
        int i10 = ahoe.a;
        float[] fArr6 = new float[1];
        if (i9 != 0) {
            fArr6[0] = (((float) i8) / ((float) i9)) / 100.0f;
        } else {
            fArr6[0] = 0.5f;
        }
        fArr5[i10] = fArr6;
        if (ahoe.c >= 5 && ahoe.h != null) {
            ahoe.a(ahoi2.b);
        }
        StringBuilder sb3 = new StringBuilder(26);
        sb3.append("last epoch finished? ");
        sb3.append(!z);
        sb3.toString();
    }
}
