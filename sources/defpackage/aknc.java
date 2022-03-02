package defpackage;

import java.util.List;

/* renamed from: aknc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aknc implements akmb {
    private final int a;
    private final Boolean b;

    public aknc(int i, Boolean bool) {
        this.a = i;
        this.b = bool;
    }

    private static final boolean a(float[] fArr) {
        if (fArr != null) {
            return true;
        }
        aklz.a().d("Model misconfigured or loaded incorrectly");
        return false;
    }

    static float[] a(float[] fArr, int i, int i2) {
        float[] fArr2 = new float[i2];
        float[] fArr3 = new float[i2];
        for (int i3 = 0; i3 < i; i3++) {
            for (int i4 = 0; i4 < i2; i4++) {
                int i5 = (i3 * i2) + i4;
                float f = fArr[i5];
                float f2 = fArr2[i4];
                float f3 = f - f2;
                float f4 = f2 + (f3 / ((float) (i3 + 1)));
                fArr2[i4] = f4;
                fArr3[i4] = fArr3[i4] + (f3 * (fArr[i5] - f4));
            }
        }
        for (int i6 = 0; i6 < i2; i6++) {
            fArr3[i6] = fArr3[i6] / ((float) i);
        }
        int i7 = i * i2;
        float[] fArr4 = new float[(i7 + i7)];
        for (int i8 = 0; i8 < i; i8++) {
            for (int i9 = 0; i9 < i2; i9++) {
                int i10 = i8 * i2;
                float f5 = fArr[i10 + i9];
                int i11 = i10 + i10;
                fArr4[i11 + i9] = f5;
                fArr4[i11 + i2 + i9] = (f5 - fArr2[i9]) / ((float) Math.sqrt((double) (fArr3[i9] + 0.1f)));
            }
        }
        return fArr4;
    }

    public final String a() {
        int i = this.a;
        StringBuilder sb = new StringBuilder(22);
        sb.append("SimpleTF-ID");
        sb.append(i);
        return sb.toString();
    }

    public final float[] a(akmd akmd, List list) {
        apxg apxg;
        asvc asvc;
        float f;
        int i;
        float f2;
        int i2;
        aucx aucx;
        aknc aknc = this;
        akmd akmd2 = akmd;
        int size = list.size();
        if (size == 0) {
            aklz.a().b("No candidates to score");
            return new float[0];
        }
        if (aknc.b.booleanValue()) {
            apxg apxg2 = akmd2.g;
            if (apxg2 == null || apxg2.P() == null || akmd2.g.P().M() == 0) {
                aklz.a().c("Model misconfigured or loaded incorrectly");
                return new float[size];
            }
            apxg P = akmd2.g.P();
            apxg k = P.k(0);
            if (k.I() == 0 || k.J() == 0) {
                aklz.a().c("Model misconfigured or loaded incorrectly");
                return new float[size];
            }
            apxg = P;
            asvc = null;
        } else {
            asve asve = akmd2.b;
            if (!(asve == null || (asve.a & 1) == 0)) {
                asvc asvc2 = asve.b;
                if (asvc2 == null) {
                    asvc2 = asvc.b;
                }
                if (asvc2.a.size() != 0) {
                    asvc = akmd2.b.b;
                    if (asvc == null) {
                        asvc = asvc.b;
                    }
                    asvb asvb = (asvb) asvc.a.get(0);
                    if (asvb.a.size() == 0 || asvb.c == 0) {
                        aklz.a().c("Model misconfigured or loaded incorrectly");
                        return new float[size];
                    }
                    apxg = null;
                }
            }
            aklz.a().c("Model misconfigured or loaded incorrectly");
            return new float[size];
        }
        assi[] assiArr = akmd2.d;
        int length = assiArr.length;
        float[] fArr = new float[(size * length)];
        int i3 = 0;
        while (i3 < size) {
            aklu aklu = (aklu) list.get(i3);
            for (int i4 = 0; i4 < length; i4++) {
                int i5 = (i3 * length) + i4;
                Float f3 = (Float) aklu.a.get(Integer.valueOf(assiArr[i4].aM));
                if (f3 != null) {
                    fArr[i5] = f3.floatValue();
                }
            }
            i3++;
            aknc = this;
        }
        float f4 = 0.0f;
        if (!aknc.b.booleanValue()) {
            aucx aucx2 = asvc.a;
            int size2 = aucx2.size();
            int i6 = 0;
            while (i6 < size2) {
                asvb asvb2 = (asvb) aucx2.get(i6);
                if (asvb2.e == aknc.a) {
                    int i7 = asvb2.c;
                    if (asvb2.a.size() % i7 == 0) {
                        int size3 = asvb2.a.size() / i7;
                        if (size * size3 != fArr.length) {
                            aklz.a().d("Model misconfigured or loaded incorrectly");
                            aucx = aucx2;
                            i2 = size2;
                            fArr = null;
                        } else {
                            float[] fArr2 = new float[(size * i7)];
                            int i8 = 0;
                            while (i8 < i7) {
                                int i9 = 0;
                                while (i9 < size) {
                                    int i10 = (i9 * i7) + i8;
                                    fArr2[i10] = f4;
                                    int i11 = 0;
                                    while (i11 < size3) {
                                        fArr2[i10] = fArr2[i10] + (fArr[(i9 * size3) + i11] * asvb2.a.c((i8 * size3) + i11));
                                        i11++;
                                        aucx2 = aucx2;
                                        size2 = size2;
                                    }
                                    aucx aucx3 = aucx2;
                                    int i12 = size2;
                                    float c = fArr2[i10] + asvb2.b.c(i8);
                                    fArr2[i10] = c;
                                    if (i7 != 1 && !asvb2.d) {
                                        fArr2[i10] = akoy.a(c);
                                    }
                                    i9++;
                                    aucx2 = aucx3;
                                    size2 = i12;
                                    f4 = 0.0f;
                                }
                                aucx aucx4 = aucx2;
                                int i13 = size2;
                                i8++;
                                f4 = 0.0f;
                            }
                            if (asvb2.d) {
                                float[] a2 = a(fArr2, size, i7);
                                for (int i14 = 0; i14 < a2.length; i14++) {
                                    a2[i14] = akoy.a(a2[i14]);
                                }
                                aucx = aucx2;
                                fArr = a2;
                                i2 = size2;
                            } else {
                                aucx = aucx2;
                                i2 = size2;
                                fArr = fArr2;
                            }
                        }
                    } else {
                        aucx = aucx2;
                        i2 = size2;
                        aklz.a().d("Model misconfigured or loaded incorrectly");
                        fArr = null;
                    }
                } else {
                    aucx = aucx2;
                    i2 = size2;
                    aklz.a();
                    int i15 = asvb2.e;
                    int i16 = aknc.a;
                    StringBuilder sb = new StringBuilder(90);
                    sb.append("Bypass layer processing, model pass id: ");
                    sb.append(i15);
                    sb.append(", inference helper pass id: ");
                    sb.append(i16);
                    sb.toString();
                }
                i6++;
                if (!a(fArr)) {
                    return new float[size];
                }
                aucx2 = aucx;
                size2 = i2;
                f4 = 0.0f;
            }
        } else {
            int i17 = 0;
            while (i17 < apxg.M()) {
                apxg k2 = apxg.k(i17);
                if (k2.L() != aknc.a) {
                    aklz.a();
                    int L = k2.L();
                    int i18 = aknc.a;
                    StringBuilder sb2 = new StringBuilder(90);
                    sb2.append("Bypass layer processing, model pass id: ");
                    sb2.append(L);
                    sb2.append(", inference helper pass id: ");
                    sb2.append(i18);
                    sb2.toString();
                } else {
                    int J = k2.J();
                    if (k2.I() % J != 0) {
                        aklz.a().d("Model misconfigured or loaded incorrectly");
                        fArr = null;
                    } else {
                        int I = k2.I() / J;
                        if (size * I != fArr.length) {
                            aklz.a().d("Model misconfigured or loaded incorrectly");
                            fArr = null;
                        } else {
                            float[] fArr3 = new float[(size * J)];
                            int i19 = 0;
                            while (i19 < J) {
                                int i20 = 0;
                                while (i20 < size) {
                                    int i21 = (i20 * J) + i19;
                                    fArr3[i21] = 0.0f;
                                    int i22 = 0;
                                    while (i22 < I) {
                                        float f5 = fArr3[i21];
                                        float f6 = fArr[(i20 * I) + i22];
                                        int i23 = (i19 * I) + i22;
                                        int i24 = i17;
                                        int d = k2.d(4);
                                        if (d != 0) {
                                            i = I;
                                            f2 = k2.d.getFloat(k2.h(d) + (i23 * 4));
                                        } else {
                                            i = I;
                                            f2 = 0.0f;
                                        }
                                        fArr3[i21] = f5 + (f6 * f2);
                                        i22++;
                                        I = i;
                                        i17 = i24;
                                    }
                                    int i25 = i17;
                                    int i26 = I;
                                    float f7 = fArr3[i21];
                                    int d2 = k2.d(6);
                                    if (d2 != 0) {
                                        f = k2.d.getFloat(k2.h(d2) + (i19 * 4));
                                    } else {
                                        f = 0.0f;
                                    }
                                    fArr3[i21] = f7 + f;
                                    if (J != 1 && !k2.K()) {
                                        fArr3[i21] = akoy.a(fArr3[i21]);
                                    }
                                    i20++;
                                    I = i26;
                                    i17 = i25;
                                }
                                int i27 = i17;
                                int i28 = I;
                                i19++;
                                aknc = this;
                            }
                            if (k2.K()) {
                                float[] a3 = a(fArr3, size, J);
                                for (int i29 = 0; i29 < a3.length; i29++) {
                                    a3[i29] = akoy.a(a3[i29]);
                                }
                                fArr = a3;
                            } else {
                                fArr = fArr3;
                            }
                        }
                    }
                }
                if (!a(fArr)) {
                    return new float[size];
                }
                i17++;
            }
        }
        if (fArr.length == size) {
            return fArr;
        }
        aklz.a().d("Model misconfigured or loaded incorrectly");
        return new float[size];
    }
}
