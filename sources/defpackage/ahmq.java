package defpackage;

import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: ahmq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahmq implements ahmg {
    private final float[] b;
    private final int c;
    private final boolean d;
    private final ahmr e;
    private final ahmv f;
    private final ahmv g;

    public ahmq(ByteBuffer byteBuffer, int i, boolean z) {
        this.e = new ahmr(byteBuffer, axzj.b());
        ahmv ahmv = new ahmv(byteBuffer, axzj.b());
        this.f = ahmv;
        int i2 = ahmv.a - 1;
        this.b = new float[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            this.b[i3] = byteBuffer.getFloat();
        }
        this.c = i;
        this.d = z;
        this.g = z ? new ahmv(byteBuffer, axzj.b()) : null;
    }

    public final List a(ahml ahml) {
        throw new UnsupportedOperationException();
    }

    public final List a(float[] fArr) {
        int i;
        int i2;
        ahmr ahmr;
        int i3;
        int i4;
        int i5;
        int i6;
        float[] fArr2;
        ahmq ahmq = this;
        ahmr ahmr2 = ahmq.e;
        int i7 = 0;
        float[] fArr3 = null;
        int i8 = 0;
        float[] fArr4 = fArr;
        while (i8 < ahmr2.a) {
            int i9 = ahmr2.c[i8];
            char c2 = 2;
            int i10 = 1;
            if (i9 == 1) {
                int i11 = ((int[]) ahmr2.k.get(i8))[1];
                if (i8 != 0) {
                    i = ((int[]) ahmr2.k.get(i8 - 1))[1];
                } else {
                    i = ((int[]) ahmr2.g.get(i7))[i7];
                }
                int intValue = ((Integer) ahmr2.h.get(i8)).intValue();
                int length = ((((fArr4.length / i) - ((int[]) ahmr2.g.get(i8))[1]) / intValue) + 1) * i11;
                float[] fArr5 = new float[length];
                int i12 = 0;
                while (i12 < i11) {
                    if (!ahmr2.b) {
                        int i13 = i * intValue;
                        float[] fArr6 = ((float[][]) ahmr2.e.get(i8))[i12];
                        float f2 = ((float[][]) ahmr2.f.get(i8))[i12][i7];
                        float f3 = ((float[][]) ahmr2.f.get(i8))[i12][i10];
                        float f4 = ((float[][]) ahmr2.f.get(i8))[i12][c2];
                        float f5 = ((float[][]) ahmr2.f.get(i8))[i12][3];
                        int i14 = ahmh.b;
                        int i15 = i12;
                        int i16 = 0;
                        while (true) {
                            i4 = length;
                            i3 = i12;
                            if (i16 > fArr4.length - fArr6.length) {
                                break;
                            }
                            int i17 = 0;
                            float f6 = 0.0f;
                            while (true) {
                                i6 = i8;
                                if (i17 >= fArr6.length) {
                                    break;
                                }
                                f6 += fArr4[i16 + i17] * fArr6[i17];
                                i17++;
                                i8 = i6;
                            }
                            fArr5[i15] = (((f6 - f2) * f4) / f3) + f5;
                            i16 += i13;
                            i15 += i11;
                            length = i4;
                            i12 = i3;
                            i8 = i6;
                        }
                        ahmr = ahmr2;
                        i5 = i8;
                    } else {
                        i4 = length;
                        i3 = i12;
                        int i18 = i * intValue;
                        ByteBuffer byteBuffer = ahmr2.d;
                        i5 = i8;
                        int[] iArr = (int[]) ahmr2.k.get(i5);
                        int i19 = ahmh.b;
                        int i20 = iArr[2];
                        int i21 = i20 + i20;
                        int i22 = iArr[0] + ((i21 + 24) * i3);
                        int i23 = i3;
                        int i24 = 0;
                        while (i24 <= fArr4.length - i20) {
                            int i25 = 0;
                            float f7 = 0.0f;
                            float f8 = 0.0f;
                            while (i25 < i20) {
                                ahmr ahmr3 = ahmr2;
                                int i26 = i24 + i25;
                                f7 += fArr4[i26] * ((float) ((char) byteBuffer.getShort(i22 + 8 + i25 + i25)));
                                f8 += fArr4[i26];
                                i25++;
                                ahmr2 = ahmr3;
                                i18 = i18;
                            }
                            int i27 = i22 + 8 + i21;
                            fArr5[i23] = ((byteBuffer.getFloat(i27 + 8) * (((byteBuffer.getFloat(i22 + 4) * f7) + (byteBuffer.getFloat(i22) * f8)) - byteBuffer.getFloat(i27))) / byteBuffer.getFloat(i27 + 4)) + byteBuffer.getFloat(i27 + 12);
                            i24 += i18;
                            i23 += i11;
                            ahmr2 = ahmr2;
                        }
                        ahmr = ahmr2;
                    }
                    i12 = i3 + 1;
                    ahmq = this;
                    i8 = i5;
                    length = i4;
                    ahmr2 = ahmr;
                    i7 = 0;
                    c2 = 2;
                    i10 = 1;
                }
                ahmh.b(fArr5);
                int intValue2 = ((Integer) ahmr2.i.get(i8)).intValue();
                int intValue3 = ((Integer) ahmr2.j.get(i8)).intValue();
                int i28 = i8 + 1;
                if (i28 >= ahmr2.a || ahmr2.c[i28] != i10) {
                    i2 = 0;
                } else {
                    i2 = 1;
                }
                int i29 = (((length / i11) - intValue3) / intValue2) + 1;
                float[] fArr7 = new float[((i29 + i2 + i2) * i11)];
                for (int i30 = 0; i30 < i11; i30++) {
                    for (int i31 = 0; i31 < i29 * intValue2; i31 += intValue2) {
                        float f9 = -3.4028235E38f;
                        for (int i32 = i31; i32 < i31 + intValue3; i32++) {
                            f9 = Math.max(f9, fArr5[(i11 * i32) + i30]);
                        }
                        fArr7[(((i31 / intValue2) + i2) * i11) + i30] = f9;
                    }
                }
                fArr3 = fArr7;
            } else if (i9 == 2) {
                if (ahmr2.b) {
                    fArr2 = ahmh.a(ahmr2.d, (int[]) ahmr2.k.get(i8), fArr4);
                } else {
                    fArr2 = ahmh.a((float[][]) ahmr2.e.get(i8), fArr4);
                }
                if (i8 < ahmr2.a - 1) {
                    ahmh.b(fArr2);
                } else {
                    ahmh.c(fArr2);
                }
                fArr3 = fArr2;
            } else if (i9 != 3) {
                StringBuilder sb = new StringBuilder(34);
                sb.append("Unsupported layerType: ");
                sb.append(i9);
                throw new IllegalArgumentException(sb.toString());
            }
            i8++;
            fArr4 = fArr3;
        }
        float[] a = ahmq.f.a(fArr3);
        ahmh.a(ahmq.c, a, ahmq.b);
        List a2 = ahmh.a(a);
        if (ahmq.d) {
            ahmh.a(a2, a[3], ahmq.g.a(fArr3));
        }
        return a2;
    }
}
