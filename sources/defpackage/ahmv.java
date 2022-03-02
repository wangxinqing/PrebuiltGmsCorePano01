package defpackage;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ahmv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahmv {
    public final int a;
    private final int b;
    private final int c;
    private final boolean d;
    private final ByteBuffer e;
    private final List f = new ArrayList();
    private final List g = new ArrayList();
    private final List h = new ArrayList();
    private final List i = new ArrayList();
    private final List j = new ArrayList();

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: short[][]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ahmv(java.nio.ByteBuffer r12, boolean r13) {
        /*
            r11 = this;
            r11.<init>()
            r11.e = r12
            r11.d = r13
            r12.getLong()
            int r0 = r12.getInt()
            r11.b = r0
            int r0 = r12.getInt()
            r11.c = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r11.f = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r11.g = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r11.h = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r11.i = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r11.j = r0
            r0 = 0
            r1 = 0
            r2 = 0
        L_0x003c:
            int r3 = r11.c
            if (r1 >= r3) goto L_0x00f8
            int r3 = r12.getInt()
            int r4 = r12.getInt()
            int r2 = r11.b
            r5 = 2
            r6 = 1
            if (r2 == r5) goto L_0x0093
            r7 = 4
            if (r2 != r7) goto L_0x007a
            int[] r2 = new int[r5]
            r2[r6] = r3
            r2[r0] = r4
            java.lang.Class<float> r5 = float.class
            java.lang.Object r2 = java.lang.reflect.Array.newInstance(r5, r2)
            r5 = r2
            float[][] r5 = (float[][]) r5
            r2 = 0
        L_0x0061:
            if (r2 < r4) goto L_0x0069
            java.util.List r2 = r11.f
            r2.add(r5)
            goto L_0x00d6
        L_0x0069:
            r6 = 0
        L_0x006a:
            if (r6 >= r3) goto L_0x0077
            r7 = r5[r2]
            float r8 = r12.getFloat()
            r7[r6] = r8
            int r6 = r6 + 1
            goto L_0x006a
        L_0x0077:
            int r2 = r2 + 1
            goto L_0x0061
        L_0x007a:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r0 = 41
            r13.<init>(r0)
            java.lang.String r0 = "Unsupported numBytesForFloat: "
            r13.append(r0)
            r13.append(r2)
            java.lang.String r13 = r13.toString()
            r12.<init>(r13)
            throw r12
        L_0x0093:
            if (r13 == 0) goto L_0x00b1
            int r2 = r12.position()
            java.util.List r7 = r11.j
            r8 = 3
            int[] r8 = new int[r8]
            r8[r0] = r2
            r8[r6] = r4
            r8[r5] = r3
            r7.add(r8)
            int r3 = r3 + r3
            int r3 = r3 + 8
            int r3 = r3 * r4
            int r2 = r2 + r3
            r12.position(r2)
            goto L_0x00d6
        L_0x00b1:
            int[] r2 = new int[r5]
            r2[r6] = r3
            r2[r0] = r4
            java.lang.Class<short> r5 = short.class
            java.lang.Object r2 = java.lang.reflect.Array.newInstance(r5, r2)
            r5 = r2
            short[][] r5 = (short[][]) r5
            float[] r6 = new float[r4]
            float[] r7 = new float[r4]
            r2 = 0
        L_0x00c5:
            if (r2 < r4) goto L_0x00db
            java.util.List r2 = r11.g
            r2.add(r5)
            java.util.List r2 = r11.h
            r2.add(r6)
            java.util.List r2 = r11.i
            r2.add(r7)
        L_0x00d6:
            int r1 = r1 + 1
            r2 = r4
            goto L_0x003c
        L_0x00db:
            float r8 = r12.getFloat()
            r6[r2] = r8
            float r8 = r12.getFloat()
            r7[r2] = r8
            r8 = 0
        L_0x00e8:
            if (r8 >= r3) goto L_0x00f5
            r9 = r5[r2]
            short r10 = r12.getShort()
            r9[r8] = r10
            int r8 = r8 + 1
            goto L_0x00e8
        L_0x00f5:
            int r2 = r2 + 1
            goto L_0x00c5
        L_0x00f8:
            r11.a = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahmv.<init>(java.nio.ByteBuffer, boolean):void");
    }

    public final float[] a(float[] fArr) {
        for (int i2 = 0; i2 < this.c; i2++) {
            if (this.b == 4) {
                fArr = ahmh.a((float[][]) this.f.get(i2), fArr);
            } else if (!this.d) {
                short[][] sArr = (short[][]) this.g.get(i2);
                float[] fArr2 = (float[]) this.i.get(i2);
                float[] fArr3 = (float[]) this.h.get(i2);
                int i3 = ahmh.b;
                float[] fArr4 = new float[sArr.length];
                for (int i4 = 0; i4 < sArr.length; i4++) {
                    fArr4[i4] = ahmh.a(sArr[i4], fArr2[i4], fArr3[i4], fArr);
                }
                fArr = fArr4;
            } else {
                fArr = ahmh.a(this.e, (int[]) this.j.get(i2), fArr);
            }
            if (i2 < this.c - 1) {
                ahmh.b(fArr);
            }
        }
        if (this.a <= 2) {
            int i5 = ahmh.b;
            ahmh.a(fArr, fArr.length);
        } else {
            ahmh.c(fArr);
        }
        return fArr;
    }
}
