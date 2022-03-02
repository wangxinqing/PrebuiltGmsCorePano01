package defpackage;

import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ahmr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahmr {
    public final int a;
    public final boolean b;
    public final int[] c;
    public final ByteBuffer d;
    public final List e;
    public final List f;
    public final List g;
    public final List h;
    public final List i;
    public final List j;
    public final List k;
    private final int l;

    public ahmr(ByteBuffer byteBuffer, boolean z) {
        ByteBuffer byteBuffer2 = byteBuffer;
        boolean z2 = z;
        Class<float> cls = float.class;
        byteBuffer.rewind();
        this.d = byteBuffer2;
        this.b = z2;
        byteBuffer.getLong();
        int i2 = byteBuffer.getInt();
        this.l = i2;
        int i3 = 4;
        if (i2 == 2 || i2 == 4) {
            int i4 = byteBuffer.getInt();
            this.a = i4;
            this.c = new int[i4];
            this.g = new ArrayList();
            this.h = new ArrayList();
            this.i = new ArrayList();
            this.j = new ArrayList();
            if (!z2) {
                this.e = new ArrayList();
                this.f = new ArrayList();
            } else {
                this.e = null;
                this.f = null;
            }
            this.k = new ArrayList();
            int i5 = 0;
            int i6 = 0;
            while (i6 < this.a) {
                this.c[i6] = byteBuffer.getInt();
                int i7 = this.c[i6];
                if (i7 == 1) {
                    int i8 = byteBuffer.getInt();
                    int i9 = byteBuffer.getInt();
                    int[] iArr = new int[3];
                    int i10 = 0;
                    while (i10 < 3) {
                        iArr[i10] = byteBuffer.getInt();
                        i10++;
                        i5 = 0;
                    }
                    this.g.add(iArr);
                    this.h.add(Integer.valueOf(byteBuffer.getInt()));
                    this.i.add(Integer.valueOf(byteBuffer.getInt()));
                    this.j.add(Integer.valueOf(byteBuffer.getInt()));
                    int position = byteBuffer.position();
                    List list = this.k;
                    int[] iArr2 = new int[3];
                    iArr2[i5] = position;
                    iArr2[1] = i9;
                    iArr2[2] = i8;
                    list.add(iArr2);
                    if (z2) {
                        byteBuffer2.position(position + (i9 * (i8 + i8 + 24)));
                    } else {
                        int[] iArr3 = new int[2];
                        iArr3[1] = i8;
                        iArr3[i5] = i9;
                        float[][] fArr = (float[][]) Array.newInstance(cls, iArr3);
                        int[] iArr4 = new int[2];
                        iArr4[1] = 4;
                        iArr4[i5] = i9;
                        float[][] fArr2 = (float[][]) Array.newInstance(cls, iArr4);
                        int i11 = 0;
                        while (i11 < i9) {
                            int i12 = this.l;
                            if (i12 == 2) {
                                float f2 = byteBuffer.getFloat();
                                float f3 = byteBuffer.getFloat();
                                for (int i13 = 0; i13 < i8; i13++) {
                                    fArr[i11][i13] = (((float) ((char) byteBuffer.getShort())) * f3) + f2;
                                }
                                i5 = 0;
                            } else if (i12 == 4) {
                                for (int i14 = 0; i14 < i8; i14++) {
                                    fArr[i11][i14] = byteBuffer.getFloat();
                                }
                            }
                            while (i5 < 4) {
                                fArr2[i11][i5] = byteBuffer.getFloat();
                                i5++;
                            }
                            i11++;
                            i5 = 0;
                        }
                        this.e.add(fArr);
                        this.f.add(fArr2);
                    }
                } else if (i7 == 2) {
                    int i15 = byteBuffer.getInt();
                    int i16 = byteBuffer.getInt();
                    int position2 = byteBuffer.position();
                    List list2 = this.k;
                    int[] iArr5 = new int[3];
                    iArr5[i5] = position2;
                    iArr5[1] = i16;
                    iArr5[2] = i15;
                    list2.add(iArr5);
                    if (z2) {
                        byteBuffer2.position(position2 + (i16 * (i15 + i15 + 8)));
                    } else {
                        int[] iArr6 = new int[2];
                        iArr6[1] = i15;
                        iArr6[i5] = i16;
                        float[][] fArr3 = (float[][]) Array.newInstance(cls, iArr6);
                        int i17 = 0;
                        while (i17 < i16) {
                            int i18 = this.l;
                            if (i18 == 2) {
                                float f4 = byteBuffer.getFloat();
                                float f5 = byteBuffer.getFloat();
                                for (int i19 = 0; i19 < i15; i19++) {
                                    fArr3[i17][i19] = (((float) ((char) byteBuffer.getShort())) * f5) + f4;
                                }
                            } else if (i18 == i3) {
                                for (int i20 = 0; i20 < i15; i20++) {
                                    fArr3[i17][i20] = byteBuffer.getFloat();
                                }
                            }
                            i17++;
                            i3 = 4;
                        }
                        this.e.add(fArr3);
                    }
                } else if (i7 != 3) {
                    StringBuilder sb = new StringBuilder(34);
                    sb.append("Unsupported layerType: ");
                    sb.append(i7);
                    throw new IllegalArgumentException(sb.toString());
                }
                i6++;
                i3 = 4;
            }
            return;
        }
        StringBuilder sb2 = new StringBuilder(41);
        sb2.append("Unsupported numBytesForFloat: ");
        sb2.append(i2);
        throw new IllegalArgumentException(sb2.toString());
    }
}
