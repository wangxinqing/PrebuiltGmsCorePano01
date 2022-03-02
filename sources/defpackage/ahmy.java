package defpackage;

import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* renamed from: ahmy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahmy implements ahmg {
    public final int b;
    private final float[] c;
    private final int d;
    private final int e;
    private final boolean f;
    private final ByteBuffer g;
    private final List h = new ArrayList();
    private final List i = new ArrayList();
    private final List j = new ArrayList();
    private final List k = new ArrayList();
    private final List l = new ArrayList();
    private final List m = new ArrayList();
    private final List n = new ArrayList();
    private final int o;

    public ahmy(ByteBuffer byteBuffer, int i2, boolean z) {
        byteBuffer.rewind();
        this.g = byteBuffer;
        this.f = z;
        byteBuffer.getLong();
        this.d = byteBuffer.getInt();
        this.e = byteBuffer.getInt();
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i3 < this.e) {
            int i6 = byteBuffer.getInt();
            int i7 = byteBuffer.getInt();
            i4 = i3 == 0 ? (i6 - (i7 / 3)) - 1 : i4;
            int i8 = this.d;
            if (i8 != 2) {
                if (i8 == 4) {
                    int[] iArr = new int[2];
                    iArr[1] = i6;
                    iArr[0] = i7;
                    float[][] fArr = (float[][]) Array.newInstance(float.class, iArr);
                    for (int i9 = 0; i9 < i7; i9++) {
                        for (int i10 = 0; i10 < i6; i10++) {
                            fArr[i9][i10] = byteBuffer.getFloat();
                        }
                    }
                    this.h.add(fArr);
                } else {
                    StringBuilder sb = new StringBuilder(41);
                    sb.append("Unsupported numBytesForFloat: ");
                    sb.append(i8);
                    throw new IllegalArgumentException(sb.toString());
                }
            } else if (z) {
                int position = byteBuffer.position();
                this.l.add(new int[]{position, i7, i6});
                byteBuffer.position(position + ((i6 + i6 + 8) * i7));
            } else {
                int[] iArr2 = new int[2];
                iArr2[1] = i6;
                iArr2[0] = i7;
                short[][] sArr = (short[][]) Array.newInstance(short.class, iArr2);
                float[] fArr2 = new float[i7];
                float[] fArr3 = new float[i7];
                for (int i11 = 0; i11 < i7; i11++) {
                    fArr2[i11] = byteBuffer.getFloat();
                    fArr3[i11] = byteBuffer.getFloat();
                    for (int i12 = 0; i12 < i6; i12++) {
                        sArr[i11][i12] = byteBuffer.getShort();
                    }
                }
                this.i.add(sArr);
                this.j.add(fArr2);
                this.k.add(fArr3);
            }
            if (i3 < this.e - 1) {
                this.n.add(new float[i7]);
                this.m.add(new float[(i7 / 3)]);
            } else {
                this.m.add(new float[i7]);
            }
            i3++;
            i5 = i7;
        }
        this.b = i4;
        int i13 = i5 - 1;
        this.c = new float[i13];
        for (int i14 = 0; i14 < i13; i14++) {
            this.c[i14] = byteBuffer.getFloat();
        }
        this.o = i2;
    }

    public final List a(ahml ahml) {
        throw new UnsupportedOperationException();
    }

    public final void b(float[] fArr) {
        ahmh.a(this.o, fArr, this.c);
    }

    public final float[] c(float[] fArr) {
        int i2 = 0;
        for (int i3 = 0; i3 < this.e - 1; i3++) {
            if (i3 > 0) {
                fArr = (float[]) this.m.get(i3 - 1);
            }
            float[] fArr2 = (float[]) this.n.get(i3);
            int length = fArr2.length / 3;
            if (this.d == 4) {
                ahmh.a((float[][]) this.h.get(i3), 0, length + length, fArr, (float[]) this.m.get(i3), fArr2);
            } else if (!this.f) {
                ahmh.a((short[][]) this.i.get(i3), (float[]) this.k.get(i3), (float[]) this.j.get(i3), 0, length + length, fArr, (float[]) this.m.get(i3), fArr2);
            } else {
                ahmh.a(this.g, (int[]) this.l.get(i3), 0, length + length, fArr, (float[]) this.m.get(i3), fArr2);
            }
            int i4 = length + length;
            ahmh.a(fArr2, i4);
            for (int i5 = 0; i5 < length; i5++) {
                fArr2[i5] = fArr2[i5] * ((float[]) this.m.get(i3))[i5];
            }
            if (this.d == 4) {
                ahmh.a((float[][]) this.h.get(i3), i4, length * 3, fArr, fArr2, fArr2);
            } else if (!this.f) {
                ahmh.a((short[][]) this.i.get(i3), (float[]) this.k.get(i3), (float[]) this.j.get(i3), i4, length * 3, fArr, fArr2, fArr2);
            } else {
                ahmh.a(this.g, (int[]) this.l.get(i3), i4, length * 3, fArr, fArr2, fArr2);
            }
            int i6 = length * 3;
            for (int i7 = i4; i7 < i6; i7++) {
                fArr2[i7] = (float) Math.tanh((double) fArr2[i7]);
            }
            float[] fArr3 = (float[]) this.m.get(i3);
            for (int i8 = 0; i8 < length; i8++) {
                float f2 = fArr2[length + i8];
                fArr3[i8] = (fArr3[i8] * f2) + ((1.0f - f2) * fArr2[i4 + i8]);
            }
        }
        List list = this.m;
        float[] fArr4 = (float[]) list.get(list.size() - 1);
        if (this.d == 4) {
            float[][] fArr5 = (float[][]) this.h.get(this.e - 1);
            float[] fArr6 = (float[]) this.m.get(this.e - 2);
            int i9 = ahmh.b;
            int length2 = fArr5.length;
            while (i2 < length2) {
                fArr4[i2] = ahmh.a(fArr5[i2], fArr6);
                i2++;
            }
        } else if (!this.f) {
            short[][] sArr = (short[][]) this.i.get(this.e - 1);
            float[] fArr7 = (float[]) this.k.get(this.e - 1);
            float[] fArr8 = (float[]) this.j.get(this.e - 1);
            float[] fArr9 = (float[]) this.m.get(this.e - 2);
            int i10 = ahmh.b;
            int length3 = sArr.length;
            while (i2 < length3) {
                fArr4[i2] = ahmh.a(sArr[i2], fArr7[i2], fArr8[i2], fArr9);
                i2++;
            }
        } else {
            ByteBuffer byteBuffer = this.g;
            int[] iArr = (int[]) this.l.get(this.e - 1);
            float[] fArr10 = (float[]) this.m.get(this.e - 2);
            int i11 = ahmh.b;
            int i12 = iArr[1];
            int i13 = iArr[0];
            int i14 = iArr[2];
            while (i2 < i12) {
                fArr4[i2] = ahmh.a(byteBuffer, ((i14 + i14 + 8) * i2) + i13, i14, fArr10);
                i2++;
            }
        }
        ahmh.c(fArr4);
        return fArr4;
    }

    public final List a(float[] fArr) {
        boolean z;
        int length = fArr.length;
        if (length % this.b == 0) {
            z = true;
        } else {
            z = false;
        }
        ativ.b(z, String.format(Locale.ENGLISH, "%d %% %d != 0", new Object[]{Integer.valueOf(length), Integer.valueOf(this.b)}));
        a();
        int i2 = this.b;
        int i3 = length / i2;
        float[] fArr2 = new float[i2];
        float[] fArr3 = null;
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = this.b;
            System.arraycopy(fArr, i5 * i4, fArr2, 0, i5);
            fArr3 = c(fArr2);
        }
        b(fArr3);
        return ahmh.a(fArr3);
    }

    public final void a() {
        List list = this.m;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Arrays.fill((float[]) list.get(i2), 0.0f);
        }
    }
}
