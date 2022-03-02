package defpackage;

import java.util.Arrays;

/* renamed from: fh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class fh extends fl {
    protected final fb af = new fb();
    public int ag;
    public int ah;
    public int ai = 2;
    public boolean aj = false;
    public boolean ak = false;
    private fk am;
    private int an = 0;
    private int ao = 0;
    private fg[] ap = new fg[4];
    private fg[] aq = new fg[4];
    private fg[] ar = new fg[4];
    private final boolean[] as = new boolean[3];
    private final fg[] at = new fg[4];

    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0173, code lost:
        r15 = r12;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int a(defpackage.fb r17, defpackage.fg[] r18, defpackage.fg r19, int r20, boolean[] r21) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r19
            r3 = 0
            r4 = 1
            r21[r3] = r4
            r21[r4] = r3
            r5 = 0
            r18[r3] = r5
            r6 = 2
            r18[r6] = r5
            r18[r4] = r5
            r7 = 3
            r18[r7] = r5
            r8 = 0
            r9 = 5
            r10 = 8
            if (r20 != 0) goto L_0x00dc
            ff r11 = r2.i
            ff r11 = r11.b
            if (r11 == 0) goto L_0x0029
            fg r11 = r11.a
            if (r11 == r0) goto L_0x0029
            r11 = 0
            goto L_0x002a
        L_0x0029:
            r11 = 1
        L_0x002a:
            r2.ab = r5
            int r12 = r2.K
            if (r12 == r10) goto L_0x0032
            r12 = r2
            goto L_0x0033
        L_0x0032:
            r12 = r5
        L_0x0033:
            r14 = r2
            r6 = r5
            r13 = r12
            r15 = 0
        L_0x0037:
            ff r4 = r14.k
            ff r4 = r4.b
            if (r4 != 0) goto L_0x003f
            goto L_0x00ad
        L_0x003f:
            r14.ab = r5
            int r4 = r14.K
            if (r4 != r10) goto L_0x005c
            ff r4 = r14.i
            fd r5 = r4.f
            ff r4 = r4.b
            fd r4 = r4.f
            r1.c(r5, r4, r3, r9)
            ff r4 = r14.k
            fd r4 = r4.f
            ff r5 = r14.i
            fd r5 = r5.f
            r1.c(r4, r5, r3, r9)
            goto L_0x0068
        L_0x005c:
            if (r12 == 0) goto L_0x005f
            goto L_0x0060
        L_0x005f:
            r12 = r14
        L_0x0060:
            if (r13 != 0) goto L_0x0063
        L_0x0062:
            goto L_0x0067
        L_0x0063:
            if (r13 == r14) goto L_0x0062
            r13.ab = r14
        L_0x0067:
            r13 = r14
        L_0x0068:
            int r4 = r14.K
            if (r4 == r10) goto L_0x0093
            int r4 = r14.ad
            if (r4 != r7) goto L_0x0093
            int r4 = r14.ae
            if (r4 != r7) goto L_0x0076
            r21[r3] = r3
        L_0x0076:
            float r4 = r14.u
            int r4 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r4 > 0) goto L_0x0093
            r21[r3] = r3
            int r4 = r15 + 1
            fg[] r5 = r0.ap
            int r8 = r5.length
            if (r4 < r8) goto L_0x008e
            int r8 = r8 + r8
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r5, r8)
            fg[] r5 = (defpackage.fg[]) r5
            r0.ap = r5
        L_0x008e:
            fg[] r5 = r0.ap
            r5[r15] = r14
            r15 = r4
        L_0x0093:
            ff r4 = r14.k
            ff r4 = r4.b
            fg r4 = r4.a
            ff r5 = r4.i
            ff r5 = r5.b
            if (r5 != 0) goto L_0x00a0
        L_0x009f:
            goto L_0x00ad
        L_0x00a0:
            fg r5 = r5.a
            if (r5 == r14) goto L_0x00a5
            goto L_0x009f
        L_0x00a5:
            if (r4 == r14) goto L_0x009f
            r6 = r4
            r14 = r6
            r4 = 1
            r5 = 0
            r8 = 0
            goto L_0x0037
        L_0x00ad:
            ff r1 = r14.k
            ff r1 = r1.b
            if (r1 == 0) goto L_0x00b9
            fg r1 = r1.a
            if (r1 == r0) goto L_0x00b9
            r11 = 0
            goto L_0x00ba
        L_0x00b9:
        L_0x00ba:
            ff r1 = r2.i
            ff r1 = r1.b
            if (r1 == 0) goto L_0x00c9
            ff r1 = r6.k
            ff r1 = r1.b
            if (r1 != 0) goto L_0x00c7
            goto L_0x00c9
        L_0x00c7:
            r1 = 1
            goto L_0x00cc
        L_0x00c9:
            r1 = 1
            r21[r1] = r1
        L_0x00cc:
            r2.X = r11
            r4 = 0
            r6.ab = r4
            r18[r3] = r2
            r2 = 2
            r18[r2] = r12
            r18[r1] = r6
            r18[r7] = r13
            goto L_0x01a1
        L_0x00dc:
            ff r4 = r2.j
            ff r4 = r4.b
            if (r4 == 0) goto L_0x00e8
            fg r4 = r4.a
            if (r4 == r0) goto L_0x00e8
            r4 = 0
            goto L_0x00e9
        L_0x00e8:
            r4 = 1
        L_0x00e9:
            r5 = 0
            r2.ac = r5
            int r5 = r2.K
            if (r5 == r10) goto L_0x00f2
            r5 = r2
            goto L_0x00f3
        L_0x00f2:
            r5 = 0
        L_0x00f3:
            r11 = r2
            r6 = r5
            r8 = r6
            r5 = 0
            r12 = 0
        L_0x00f8:
            ff r13 = r11.l
            ff r13 = r13.b
            if (r13 != 0) goto L_0x0101
            r15 = r12
            goto L_0x0174
        L_0x0101:
            r13 = 0
            r11.ac = r13
            int r13 = r11.K
            if (r13 != r10) goto L_0x011f
            ff r13 = r11.j
            fd r14 = r13.f
            ff r13 = r13.b
            fd r13 = r13.f
            r1.c(r14, r13, r3, r9)
            ff r13 = r11.l
            fd r13 = r13.f
            ff r14 = r11.j
            fd r14 = r14.f
            r1.c(r13, r14, r3, r9)
            goto L_0x012b
        L_0x011f:
            if (r6 == 0) goto L_0x0122
            goto L_0x0123
        L_0x0122:
            r6 = r11
        L_0x0123:
            if (r8 != 0) goto L_0x0126
        L_0x0125:
            goto L_0x012a
        L_0x0126:
            if (r8 == r11) goto L_0x0125
            r8.ac = r11
        L_0x012a:
            r8 = r11
        L_0x012b:
            int r13 = r11.K
            if (r13 == r10) goto L_0x015a
            int r13 = r11.ae
            if (r13 != r7) goto L_0x0158
            int r13 = r11.ad
            if (r13 != r7) goto L_0x0139
            r21[r3] = r3
        L_0x0139:
            float r13 = r11.u
            r14 = 0
            int r13 = (r13 > r14 ? 1 : (r13 == r14 ? 0 : -1))
            if (r13 > 0) goto L_0x015b
            r21[r3] = r3
            int r13 = r12 + 1
            fg[] r15 = r0.ap
            int r9 = r15.length
            if (r13 < r9) goto L_0x0152
            int r9 = r9 + r9
            java.lang.Object[] r9 = java.util.Arrays.copyOf(r15, r9)
            fg[] r9 = (defpackage.fg[]) r9
            r0.ap = r9
        L_0x0152:
            fg[] r9 = r0.ap
            r9[r12] = r11
            r12 = r13
            goto L_0x015b
        L_0x0158:
            r14 = 0
            goto L_0x015b
        L_0x015a:
            r14 = 0
        L_0x015b:
            ff r9 = r11.l
            ff r9 = r9.b
            fg r9 = r9.a
            ff r13 = r9.j
            ff r13 = r13.b
            if (r13 != 0) goto L_0x0168
        L_0x0167:
            goto L_0x0173
        L_0x0168:
            fg r13 = r13.a
            if (r13 == r11) goto L_0x016d
            goto L_0x0167
        L_0x016d:
            if (r9 == r11) goto L_0x0167
            r5 = r9
            r11 = r5
            r9 = 5
            goto L_0x00f8
        L_0x0173:
            r15 = r12
        L_0x0174:
            ff r1 = r11.l
            ff r1 = r1.b
            if (r1 == 0) goto L_0x0180
            fg r1 = r1.a
            if (r1 == r0) goto L_0x0180
            r4 = 0
            goto L_0x0181
        L_0x0180:
        L_0x0181:
            ff r1 = r2.j
            ff r1 = r1.b
            if (r1 == 0) goto L_0x0190
            ff r1 = r5.l
            ff r1 = r1.b
            if (r1 != 0) goto L_0x018e
            goto L_0x0190
        L_0x018e:
            r1 = 1
            goto L_0x0193
        L_0x0190:
            r1 = 1
            r21[r1] = r1
        L_0x0193:
            r2.Y = r4
            r4 = 0
            r5.ac = r4
            r18[r3] = r2
            r2 = 2
            r18[r2] = r6
            r18[r1] = r5
            r18[r7] = r8
        L_0x01a1:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fh.a(fb, fg[], fg, int, boolean[]):int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:168:0x02ea  */
    /* JADX WARNING: Removed duplicated region for block: B:302:0x02ec A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void c(defpackage.fb r34) {
        /*
            r33 = this;
            r6 = r33
            r15 = r34
            r14 = 0
            r13 = 0
        L_0x0006:
            int r0 = r6.an
            if (r13 >= r0) goto L_0x058d
            fg[] r0 = r6.ar
            r12 = r0[r13]
            fg[] r2 = r6.at
            r4 = 0
            boolean[] r5 = r6.as
            r0 = r33
            r1 = r34
            r3 = r12
            int r0 = r0.a(r1, r2, r3, r4, r5)
            fg[] r1 = r6.at
            r2 = 2
            r1 = r1[r2]
            if (r1 == 0) goto L_0x0586
            boolean[] r3 = r6.as
            r4 = 1
            boolean r5 = r3[r4]
            if (r5 == 0) goto L_0x0052
            int r0 = r12.g()
        L_0x002e:
            if (r1 == 0) goto L_0x004e
            ff r2 = r1.i
            fd r2 = r2.f
            r15.a((defpackage.fd) r2, (int) r0)
            fg r2 = r1.ab
            ff r3 = r1.i
            int r3 = r3.a()
            int r4 = r1.c()
            int r3 = r3 + r4
            ff r1 = r1.k
            int r1 = r1.a()
            int r3 = r3 + r1
            int r0 = r0 + r3
            r1 = r2
            goto L_0x002e
        L_0x004e:
            r19 = r13
            goto L_0x0588
        L_0x0052:
            int r5 = r12.V
            int r7 = r6.ad
            int r8 = r6.ai
            r9 = 8
            r10 = 0
            r11 = 3
            r16 = 0
            if (r8 != r2) goto L_0x0061
            goto L_0x0063
        L_0x0061:
            if (r8 != r9) goto L_0x018e
        L_0x0063:
            boolean r3 = r3[r14]
            if (r3 == 0) goto L_0x018e
            boolean r3 = r12.X
            if (r3 == 0) goto L_0x018e
            if (r5 == r2) goto L_0x018e
            if (r7 == r2) goto L_0x018e
            if (r5 != 0) goto L_0x018e
            r1 = r12
            r2 = r16
            r3 = 0
            r4 = 0
            r5 = 0
        L_0x0078:
            if (r1 == 0) goto L_0x00c9
            int r2 = r1.K
            if (r2 == r9) goto L_0x00a8
            int r4 = r4 + 1
            int r2 = r1.ad
            if (r2 == r11) goto L_0x00a4
            int r2 = r1.c()
            int r5 = r5 + r2
            ff r2 = r1.i
            ff r7 = r2.b
            if (r7 == 0) goto L_0x0094
            int r2 = r2.a()
            goto L_0x0095
        L_0x0094:
            r2 = 0
        L_0x0095:
            int r5 = r5 + r2
            ff r2 = r1.k
            ff r7 = r2.b
            if (r7 == 0) goto L_0x00a1
            int r2 = r2.a()
            goto L_0x00a2
        L_0x00a1:
            r2 = 0
        L_0x00a2:
            int r5 = r5 + r2
            goto L_0x00a9
        L_0x00a4:
            float r2 = r1.Z
            float r3 = r3 + r2
            goto L_0x00a9
        L_0x00a8:
        L_0x00a9:
            ff r2 = r1.k
            ff r2 = r2.b
            if (r2 == 0) goto L_0x00b2
            fg r2 = r2.a
            goto L_0x00b4
        L_0x00b2:
            r2 = r16
        L_0x00b4:
            if (r2 != 0) goto L_0x00b7
            goto L_0x00c3
        L_0x00b7:
            ff r7 = r2.i
            ff r7 = r7.b
            if (r7 == 0) goto L_0x00c1
            fg r7 = r7.a
            if (r7 == r1) goto L_0x00c3
        L_0x00c1:
            r2 = r16
        L_0x00c3:
            r32 = r2
            r2 = r1
            r1 = r32
            goto L_0x0078
        L_0x00c9:
            if (r2 == 0) goto L_0x00e3
            ff r1 = r2.k
            ff r1 = r1.b
            if (r1 == 0) goto L_0x00d6
            fg r2 = r1.a
            int r2 = r2.w
            goto L_0x00d7
        L_0x00d6:
            r2 = 0
        L_0x00d7:
            if (r1 != 0) goto L_0x00da
            goto L_0x00e4
        L_0x00da:
            fg r1 = r1.a
            if (r1 != r6) goto L_0x00e4
            int r2 = r33.i()
            goto L_0x00e4
        L_0x00e3:
            r2 = 0
        L_0x00e4:
            float r1 = (float) r2
            float r2 = (float) r5
            float r1 = r1 - r2
            int r4 = r4 + 1
            float r2 = (float) r4
            float r2 = r1 / r2
            if (r0 == 0) goto L_0x00f4
            float r2 = (float) r0
            float r2 = r1 / r2
            r4 = r2
            r2 = 0
            goto L_0x00f5
        L_0x00f4:
            r4 = r2
        L_0x00f5:
            if (r12 == 0) goto L_0x018a
            ff r5 = r12.i
            ff r7 = r5.b
            if (r7 == 0) goto L_0x0102
            int r5 = r5.a()
            goto L_0x0103
        L_0x0102:
            r5 = 0
        L_0x0103:
            ff r7 = r12.k
            ff r8 = r7.b
            if (r8 == 0) goto L_0x010e
            int r7 = r7.a()
            goto L_0x010f
        L_0x010e:
            r7 = 0
        L_0x010f:
            int r8 = r12.K
            r17 = 1056964608(0x3f000000, float:0.5)
            if (r8 == r9) goto L_0x0150
            float r5 = (float) r5
            float r2 = r2 + r5
            ff r8 = r12.i
            fd r8 = r8.f
            float r9 = r2 + r17
            int r9 = (int) r9
            r15.a((defpackage.fd) r8, (int) r9)
            int r8 = r12.ad
            if (r8 == r11) goto L_0x012c
            int r5 = r12.c()
            float r5 = (float) r5
            float r2 = r2 + r5
            goto L_0x013f
        L_0x012c:
            int r8 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r8 == 0) goto L_0x013a
            float r8 = r12.Z
            float r8 = r8 * r1
            float r8 = r8 / r3
            float r8 = r8 - r5
            float r5 = (float) r7
            float r8 = r8 - r5
            float r2 = r2 + r8
            goto L_0x013f
        L_0x013a:
            float r5 = r4 - r5
            float r8 = (float) r7
            float r5 = r5 - r8
            float r2 = r2 + r5
        L_0x013f:
            ff r5 = r12.k
            fd r5 = r5.f
            float r8 = r2 + r17
            int r8 = (int) r8
            r15.a((defpackage.fd) r5, (int) r8)
            if (r0 == 0) goto L_0x014c
            goto L_0x014d
        L_0x014c:
            float r2 = r2 + r4
        L_0x014d:
            float r5 = (float) r7
            float r2 = r2 + r5
            goto L_0x0167
        L_0x0150:
            r5 = 1073741824(0x40000000, float:2.0)
            float r5 = r4 / r5
            float r5 = r2 - r5
            float r5 = r5 + r17
            int r5 = (int) r5
            ff r7 = r12.i
            fd r7 = r7.f
            r15.a((defpackage.fd) r7, (int) r5)
            ff r7 = r12.k
            fd r7 = r7.f
            r15.a((defpackage.fd) r7, (int) r5)
        L_0x0167:
            ff r5 = r12.k
            ff r5 = r5.b
            if (r5 == 0) goto L_0x0170
            fg r5 = r5.a
            goto L_0x0172
        L_0x0170:
            r5 = r16
        L_0x0172:
            if (r5 == 0) goto L_0x0181
            ff r7 = r5.i
            ff r7 = r7.b
            if (r7 == 0) goto L_0x0181
            fg r7 = r7.a
            if (r7 == r12) goto L_0x0181
            r12 = r16
            goto L_0x0182
        L_0x0181:
            r12 = r5
        L_0x0182:
            if (r12 != r6) goto L_0x0186
            r12 = r16
        L_0x0186:
            r9 = 8
            goto L_0x00f5
        L_0x018a:
            r19 = r13
            goto L_0x0588
        L_0x018e:
            if (r0 != 0) goto L_0x0196
            r0 = r1
            r3 = r16
            r8 = r3
            r7 = 0
            goto L_0x019d
        L_0x0196:
            if (r5 != r2) goto L_0x033f
            r0 = r1
            r3 = r16
            r8 = r3
            r7 = 0
        L_0x019d:
            if (r0 == 0) goto L_0x02fa
            fg r9 = r0.ab
            if (r9 != 0) goto L_0x01aa
            fg[] r3 = r6.at
            r3 = r3[r4]
            r17 = 1
            goto L_0x01ac
        L_0x01aa:
            r17 = r7
        L_0x01ac:
            if (r5 != r2) goto L_0x0200
            ff r7 = r0.i
            int r10 = r7.a()
            if (r8 == 0) goto L_0x01be
            ff r8 = r8.k
            int r8 = r8.a()
            int r10 = r10 + r8
            goto L_0x01bf
        L_0x01be:
        L_0x01bf:
            if (r1 == r0) goto L_0x01c3
            r8 = 3
            goto L_0x01c4
        L_0x01c3:
            r8 = 1
        L_0x01c4:
            fd r14 = r7.f
            ff r2 = r7.b
            fd r2 = r2.f
            r15.a(r14, r2, r10, r8)
            int r2 = r0.ad
            if (r2 != r11) goto L_0x01ff
            ff r2 = r0.k
            int r8 = r0.c
            if (r8 != r4) goto L_0x01ea
            int r8 = r0.e
            int r10 = r0.c()
            int r8 = java.lang.Math.max(r8, r10)
            fd r2 = r2.f
            fd r7 = r7.f
            r15.c(r2, r7, r8, r11)
            goto L_0x0255
        L_0x01ea:
            fd r8 = r7.f
            ff r10 = r7.b
            fd r10 = r10.f
            int r14 = r7.c
            r15.a(r8, r10, r14, r11)
            fd r2 = r2.f
            fd r7 = r7.f
            int r8 = r0.e
            r15.b(r2, r7, r8, r11)
            goto L_0x0255
        L_0x01ff:
            goto L_0x0255
        L_0x0200:
            r2 = 5
            if (r5 == 0) goto L_0x022d
            if (r17 == 0) goto L_0x022d
            if (r8 == 0) goto L_0x022d
            ff r7 = r0.k
            ff r8 = r7.b
            if (r8 != 0) goto L_0x021a
            fd r2 = r7.f
            int r7 = r0.g()
            int r8 = r0.y
            int r7 = r7 + r8
            r15.a((defpackage.fd) r2, (int) r7)
            goto L_0x0255
        L_0x021a:
            int r7 = r7.a()
            ff r8 = r0.k
            fd r8 = r8.f
            ff r10 = r3.k
            ff r10 = r10.b
            fd r10 = r10.f
            int r7 = -r7
            r15.c(r8, r10, r7, r2)
            goto L_0x0255
        L_0x022d:
            if (r5 != 0) goto L_0x0230
            goto L_0x025e
        L_0x0230:
            if (r17 != 0) goto L_0x025e
            if (r8 != 0) goto L_0x025e
            ff r7 = r0.i
            ff r8 = r7.b
            if (r8 != 0) goto L_0x0244
            fd r2 = r7.f
            int r7 = r0.g()
            r15.a((defpackage.fd) r2, (int) r7)
            goto L_0x0255
        L_0x0244:
            int r7 = r7.a()
            ff r8 = r0.i
            fd r8 = r8.f
            ff r10 = r12.i
            ff r10 = r10.b
            fd r10 = r10.f
            r15.c(r8, r10, r7, r2)
        L_0x0255:
            r18 = r0
            r4 = r12
            r19 = r13
            r0 = 3
            r2 = 0
            goto L_0x02e7
        L_0x025e:
            ff r2 = r0.i
            ff r7 = r0.k
            int r10 = r2.a()
            int r14 = r7.a()
            fd r11 = r2.f
            r18 = r0
            ff r0 = r2.b
            fd r0 = r0.f
            r15.a(r11, r0, r10, r4)
            fd r0 = r7.f
            ff r11 = r7.b
            fd r11 = r11.f
            r19 = r13
            int r13 = -r14
            r15.b(r0, r11, r13, r4)
            ff r0 = r2.b
            if (r0 == 0) goto L_0x0288
            fd r0 = r0.f
            goto L_0x028a
        L_0x0288:
            r0 = r16
        L_0x028a:
            if (r8 != 0) goto L_0x0298
            ff r0 = r12.i
            ff r0 = r0.b
            if (r0 == 0) goto L_0x0295
            fd r0 = r0.f
            goto L_0x0299
        L_0x0295:
            r0 = r16
            goto L_0x0299
        L_0x0298:
        L_0x0299:
            if (r9 != 0) goto L_0x02a8
            ff r8 = r3.k
            ff r8 = r8.b
            if (r8 == 0) goto L_0x02a5
            fg r9 = r8.a
            r13 = r9
            goto L_0x02a9
        L_0x02a5:
            r13 = r16
            goto L_0x02a9
        L_0x02a8:
            r13 = r9
        L_0x02a9:
            if (r13 == 0) goto L_0x02e0
            ff r8 = r13.i
            fd r8 = r8.f
            if (r17 == 0) goto L_0x02bf
            ff r8 = r3.k
            ff r8 = r8.b
            if (r8 == 0) goto L_0x02bc
            fd r8 = r8.f
            r20 = r8
            goto L_0x02c1
        L_0x02bc:
            r20 = r16
            goto L_0x02c1
        L_0x02bf:
            r20 = r8
        L_0x02c1:
            if (r0 != 0) goto L_0x02c9
            r4 = r12
            r20 = r13
            r0 = 3
            r2 = 0
            goto L_0x02e5
        L_0x02c9:
            if (r20 == 0) goto L_0x02e0
            fd r8 = r2.f
            r11 = 1056964608(0x3f000000, float:0.5)
            fd r2 = r7.f
            r7 = r34
            r9 = r0
            r0 = 3
            r4 = r12
            r12 = r20
            r20 = r13
            r13 = r2
            r2 = 0
            r7.a(r8, r9, r10, r11, r12, r13, r14)
            goto L_0x02e5
        L_0x02e0:
            r4 = r12
            r20 = r13
            r0 = 3
            r2 = 0
        L_0x02e5:
            r9 = r20
        L_0x02e7:
            if (r17 != 0) goto L_0x02ea
            goto L_0x02ec
        L_0x02ea:
            r9 = r16
        L_0x02ec:
            r12 = r4
            r0 = r9
            r7 = r17
            r8 = r18
            r13 = r19
            r2 = 2
            r4 = 1
            r11 = 3
            r14 = 0
            goto L_0x019d
        L_0x02fa:
            r4 = r12
            r19 = r13
            r2 = 0
            r0 = 2
            if (r5 != r0) goto L_0x0588
            ff r0 = r1.i
            ff r1 = r3.k
            int r10 = r0.a()
            int r14 = r1.a()
            ff r5 = r4.i
            ff r5 = r5.b
            if (r5 == 0) goto L_0x0317
            fd r5 = r5.f
            r9 = r5
            goto L_0x0319
        L_0x0317:
            r9 = r16
        L_0x0319:
            ff r3 = r3.k
            ff r3 = r3.b
            if (r3 == 0) goto L_0x0323
            fd r3 = r3.f
            r12 = r3
            goto L_0x0325
        L_0x0323:
            r12 = r16
        L_0x0325:
            if (r9 != 0) goto L_0x0329
        L_0x0327:
            goto L_0x0588
        L_0x0329:
            if (r12 == 0) goto L_0x0327
            fd r3 = r1.f
            int r5 = -r14
            r7 = 1
            r15.b(r3, r12, r5, r7)
            fd r8 = r0.f
            float r11 = r4.H
            fd r13 = r1.f
            r7 = r34
            r7.a(r8, r9, r10, r11, r12, r13, r14)
            goto L_0x0588
        L_0x033f:
            r4 = r12
            r19 = r13
            r2 = 0
            r3 = 3
            r5 = r16
        L_0x0346:
            if (r1 == 0) goto L_0x03e7
            int r7 = r1.ad
            if (r7 == r3) goto L_0x03a4
            ff r7 = r1.i
            int r7 = r7.a()
            if (r5 == 0) goto L_0x035c
            ff r5 = r5.k
            int r5 = r5.a()
            int r7 = r7 + r5
            goto L_0x035d
        L_0x035c:
        L_0x035d:
            ff r5 = r1.i
            ff r8 = r5.b
            fg r9 = r8.a
            int r9 = r9.ad
            if (r9 != r3) goto L_0x0369
            r11 = 2
            goto L_0x036a
        L_0x0369:
            r11 = 3
        L_0x036a:
            fd r5 = r5.f
            fd r8 = r8.f
            r15.a(r5, r8, r7, r11)
            ff r5 = r1.k
            int r5 = r5.a()
            ff r7 = r1.k
            ff r7 = r7.b
            fg r7 = r7.a
            ff r7 = r7.i
            ff r8 = r7.b
            if (r8 != 0) goto L_0x0384
            goto L_0x038d
        L_0x0384:
            fg r8 = r8.a
            if (r8 != r1) goto L_0x038d
            int r7 = r7.a()
            int r5 = r5 + r7
        L_0x038d:
            ff r7 = r1.k
            ff r8 = r7.b
            fg r9 = r8.a
            int r9 = r9.ad
            if (r9 != r3) goto L_0x0399
            r11 = 2
            goto L_0x039a
        L_0x0399:
            r11 = 3
        L_0x039a:
            fd r7 = r7.f
            fd r8 = r8.f
            int r5 = -r5
            r15.b(r7, r8, r5, r11)
            r8 = 1
            goto L_0x03de
        L_0x03a4:
            float r5 = r1.Z
            float r10 = r10 + r5
            ff r5 = r1.k
            ff r7 = r5.b
            if (r7 == 0) goto L_0x03c5
            int r14 = r5.a()
            fg[] r5 = r6.at
            r5 = r5[r3]
            if (r1 == r5) goto L_0x03c6
            ff r5 = r1.k
            ff r5 = r5.b
            fg r5 = r5.a
            ff r5 = r5.i
            int r5 = r5.a()
            int r14 = r14 + r5
            goto L_0x03c6
        L_0x03c5:
            r14 = 0
        L_0x03c6:
            ff r5 = r1.k
            fd r5 = r5.f
            ff r7 = r1.i
            fd r7 = r7.f
            r8 = 1
            r15.a(r5, r7, r2, r8)
            ff r5 = r1.k
            fd r7 = r5.f
            ff r5 = r5.b
            fd r5 = r5.f
            int r9 = -r14
            r15.b(r7, r5, r9, r8)
        L_0x03de:
            fg r5 = r1.ab
            r32 = r5
            r5 = r1
            r1 = r32
            goto L_0x0346
        L_0x03e7:
            r8 = 1
            if (r0 != r8) goto L_0x0466
            fg[] r0 = r6.ap
            r0 = r0[r2]
            ff r1 = r0.i
            int r1 = r1.a()
            ff r5 = r0.i
            ff r5 = r5.b
            if (r5 == 0) goto L_0x03ff
            int r5 = r5.a()
            int r1 = r1 + r5
        L_0x03ff:
            ff r5 = r0.k
            int r5 = r5.a()
            ff r7 = r0.k
            ff r7 = r7.b
            if (r7 == 0) goto L_0x0410
            int r7 = r7.a()
            int r5 = r5 + r7
        L_0x0410:
            ff r7 = r4.k
            ff r7 = r7.b
            fd r7 = r7.f
            fg[] r8 = r6.at
            r3 = r8[r3]
            if (r0 != r3) goto L_0x0426
            r3 = 1
            r7 = r8[r3]
            ff r7 = r7.k
            ff r7 = r7.b
            fd r7 = r7.f
            goto L_0x0427
        L_0x0426:
            r3 = 1
        L_0x0427:
            int r8 = r0.c
            if (r8 != r3) goto L_0x0450
            ff r0 = r4.i
            fd r8 = r0.f
            ff r0 = r0.b
            fd r0 = r0.f
            r15.a(r8, r0, r1, r3)
            ff r0 = r4.k
            fd r0 = r0.f
            int r1 = -r5
            r15.b(r0, r7, r1, r3)
            ff r0 = r4.k
            fd r0 = r0.f
            ff r1 = r4.i
            fd r1 = r1.f
            int r3 = r4.c()
            r4 = 2
            r15.c(r0, r1, r3, r4)
            goto L_0x0588
        L_0x0450:
            ff r3 = r0.i
            fd r4 = r3.f
            ff r3 = r3.b
            fd r3 = r3.f
            r8 = 1
            r15.c(r4, r3, r1, r8)
            ff r0 = r0.k
            fd r0 = r0.f
            int r1 = -r5
            r15.c(r0, r7, r1, r8)
            goto L_0x0588
        L_0x0466:
            r14 = 0
        L_0x0467:
            int r1 = r0 + -1
            if (r14 >= r1) goto L_0x0588
            fg[] r5 = r6.ap
            r7 = r5[r14]
            int r14 = r14 + 1
            r5 = r5[r14]
            ff r8 = r7.i
            fd r9 = r8.f
            ff r11 = r7.k
            fd r11 = r11.f
            ff r12 = r5.i
            fd r12 = r12.f
            ff r13 = r5.k
            fd r13 = r13.f
            fg[] r2 = r6.at
            r16 = r0
            r0 = r2[r3]
            if (r5 != r0) goto L_0x0493
            r0 = 1
            r2 = r2[r0]
            ff r0 = r2.k
            fd r0 = r0.f
            goto L_0x0494
        L_0x0493:
            r0 = r13
        L_0x0494:
            int r2 = r8.a()
            ff r8 = r7.i
            ff r8 = r8.b
            if (r8 == 0) goto L_0x04b0
            fg r8 = r8.a
            ff r8 = r8.k
            ff r13 = r8.b
            if (r13 != 0) goto L_0x04a7
            goto L_0x04b0
        L_0x04a7:
            fg r13 = r13.a
            if (r13 != r7) goto L_0x04b0
            int r8 = r8.a()
            int r2 = r2 + r8
        L_0x04b0:
            ff r8 = r7.i
            ff r8 = r8.b
            fd r8 = r8.f
            r13 = 2
            r15.a(r9, r8, r2, r13)
            ff r2 = r7.k
            int r2 = r2.a()
            ff r8 = r7.k
            ff r8 = r8.b
            if (r8 == 0) goto L_0x04d8
            fg r8 = r7.ab
            if (r8 == 0) goto L_0x04d8
            ff r8 = r8.i
            ff r13 = r8.b
            if (r13 == 0) goto L_0x04d5
            int r8 = r8.a()
            goto L_0x04d6
        L_0x04d5:
            r8 = 0
        L_0x04d6:
            int r2 = r2 + r8
            goto L_0x04d9
        L_0x04d8:
        L_0x04d9:
            ff r8 = r7.k
            ff r8 = r8.b
            fd r8 = r8.f
            int r2 = -r2
            r13 = 2
            r15.b(r11, r8, r2, r13)
            if (r14 != r1) goto L_0x0541
            ff r1 = r5.i
            int r1 = r1.a()
            ff r2 = r5.i
            ff r2 = r2.b
            if (r2 == 0) goto L_0x0504
            fg r2 = r2.a
            ff r2 = r2.k
            ff r8 = r2.b
            if (r8 != 0) goto L_0x04fb
            goto L_0x0504
        L_0x04fb:
            fg r8 = r8.a
            if (r8 != r5) goto L_0x0504
            int r2 = r2.a()
            int r1 = r1 + r2
        L_0x0504:
            ff r2 = r5.i
            ff r2 = r2.b
            fd r2 = r2.f
            r8 = 2
            r15.a(r12, r2, r1, r8)
            ff r1 = r5.k
            fg[] r2 = r6.at
            r8 = r2[r3]
            if (r5 != r8) goto L_0x051c
            r8 = 1
            r1 = r2[r8]
            ff r1 = r1.k
            goto L_0x051d
        L_0x051c:
            r8 = 1
        L_0x051d:
            int r2 = r1.a()
            ff r13 = r1.b
            if (r13 == 0) goto L_0x0537
            fg r13 = r13.a
            ff r13 = r13.i
            ff r3 = r13.b
            if (r3 != 0) goto L_0x052e
            goto L_0x0537
        L_0x052e:
            fg r3 = r3.a
            if (r3 != r5) goto L_0x0537
            int r3 = r13.a()
            int r2 = r2 + r3
        L_0x0537:
            ff r1 = r1.b
            fd r1 = r1.f
            int r2 = -r2
            r3 = 2
            r15.b(r0, r1, r2, r3)
            goto L_0x0543
        L_0x0541:
            r3 = 2
            r8 = 1
        L_0x0543:
            int r1 = r4.f
            if (r1 <= 0) goto L_0x054a
            r15.b(r11, r9, r1, r3)
        L_0x054a:
            ey r1 = r34.b()
            float r2 = r7.Z
            float r13 = r5.Z
            ff r3 = r7.i
            int r25 = r3.a()
            ff r3 = r7.k
            int r27 = r3.a()
            ff r3 = r5.i
            int r29 = r3.a()
            ff r3 = r5.k
            int r31 = r3.a()
            r20 = r1
            r21 = r2
            r22 = r10
            r23 = r13
            r24 = r9
            r26 = r11
            r28 = r12
            r30 = r0
            r20.a(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            r15.a((defpackage.ey) r1)
            r0 = r16
            r2 = 0
            r3 = 3
            goto L_0x0467
        L_0x0586:
            r19 = r13
        L_0x0588:
            int r13 = r19 + 1
            r14 = 0
            goto L_0x0006
        L_0x058d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fh.c(fb):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:178:0x0306  */
    /* JADX WARNING: Removed duplicated region for block: B:312:0x0308 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void d(defpackage.fb r35) {
        /*
            r34 = this;
            r6 = r34
            r15 = r35
            r14 = 0
            r13 = 0
        L_0x0006:
            int r0 = r6.ao
            if (r13 >= r0) goto L_0x05a9
            fg[] r0 = r6.aq
            r12 = r0[r13]
            fg[] r2 = r6.at
            r4 = 1
            boolean[] r5 = r6.as
            r0 = r34
            r1 = r35
            r3 = r12
            int r0 = r0.a(r1, r2, r3, r4, r5)
            fg[] r1 = r6.at
            r2 = 2
            r1 = r1[r2]
            if (r1 == 0) goto L_0x05a2
            boolean[] r3 = r6.as
            r4 = 1
            boolean r5 = r3[r4]
            if (r5 == 0) goto L_0x0052
            int r0 = r12.h()
        L_0x002e:
            if (r1 == 0) goto L_0x004e
            ff r2 = r1.j
            fd r2 = r2.f
            r15.a((defpackage.fd) r2, (int) r0)
            fg r2 = r1.ac
            ff r3 = r1.j
            int r3 = r3.a()
            int r4 = r1.f()
            int r3 = r3 + r4
            ff r1 = r1.l
            int r1 = r1.a()
            int r3 = r3 + r1
            int r0 = r0 + r3
            r1 = r2
            goto L_0x002e
        L_0x004e:
            r20 = r13
            goto L_0x05a4
        L_0x0052:
            int r5 = r12.W
            int r7 = r6.ae
            int r8 = r6.ai
            r9 = 8
            r10 = 0
            r11 = 3
            r16 = 0
            if (r8 != r2) goto L_0x0061
            goto L_0x0063
        L_0x0061:
            if (r8 != r9) goto L_0x018e
        L_0x0063:
            boolean r3 = r3[r14]
            if (r3 == 0) goto L_0x018e
            boolean r3 = r12.Y
            if (r3 == 0) goto L_0x018e
            if (r5 == r2) goto L_0x018e
            if (r7 == r2) goto L_0x018e
            if (r5 != 0) goto L_0x018e
            r1 = r12
            r2 = r16
            r3 = 0
            r4 = 0
            r5 = 0
        L_0x0078:
            if (r1 == 0) goto L_0x00c9
            int r2 = r1.K
            if (r2 == r9) goto L_0x00a8
            int r4 = r4 + 1
            int r2 = r1.ae
            if (r2 == r11) goto L_0x00a4
            int r2 = r1.f()
            int r5 = r5 + r2
            ff r2 = r1.j
            ff r7 = r2.b
            if (r7 == 0) goto L_0x0094
            int r2 = r2.a()
            goto L_0x0095
        L_0x0094:
            r2 = 0
        L_0x0095:
            int r5 = r5 + r2
            ff r2 = r1.l
            ff r7 = r2.b
            if (r7 == 0) goto L_0x00a1
            int r2 = r2.a()
            goto L_0x00a2
        L_0x00a1:
            r2 = 0
        L_0x00a2:
            int r5 = r5 + r2
            goto L_0x00a9
        L_0x00a4:
            float r2 = r1.aa
            float r3 = r3 + r2
            goto L_0x00a9
        L_0x00a8:
        L_0x00a9:
            ff r2 = r1.l
            ff r2 = r2.b
            if (r2 == 0) goto L_0x00b2
            fg r2 = r2.a
            goto L_0x00b4
        L_0x00b2:
            r2 = r16
        L_0x00b4:
            if (r2 != 0) goto L_0x00b7
            goto L_0x00c3
        L_0x00b7:
            ff r7 = r2.j
            ff r7 = r7.b
            if (r7 == 0) goto L_0x00c1
            fg r7 = r7.a
            if (r7 == r1) goto L_0x00c3
        L_0x00c1:
            r2 = r16
        L_0x00c3:
            r33 = r2
            r2 = r1
            r1 = r33
            goto L_0x0078
        L_0x00c9:
            if (r2 == 0) goto L_0x00e3
            ff r1 = r2.l
            ff r1 = r1.b
            if (r1 == 0) goto L_0x00d6
            fg r2 = r1.a
            int r2 = r2.w
            goto L_0x00d7
        L_0x00d6:
            r2 = 0
        L_0x00d7:
            if (r1 != 0) goto L_0x00da
            goto L_0x00e4
        L_0x00da:
            fg r1 = r1.a
            if (r1 != r6) goto L_0x00e4
            int r2 = r34.j()
            goto L_0x00e4
        L_0x00e3:
            r2 = 0
        L_0x00e4:
            float r1 = (float) r2
            float r2 = (float) r5
            float r1 = r1 - r2
            int r4 = r4 + 1
            float r2 = (float) r4
            float r2 = r1 / r2
            if (r0 == 0) goto L_0x00f4
            float r2 = (float) r0
            float r2 = r1 / r2
            r4 = r2
            r2 = 0
            goto L_0x00f5
        L_0x00f4:
            r4 = r2
        L_0x00f5:
            if (r12 == 0) goto L_0x018a
            ff r5 = r12.j
            ff r7 = r5.b
            if (r7 == 0) goto L_0x0102
            int r5 = r5.a()
            goto L_0x0103
        L_0x0102:
            r5 = 0
        L_0x0103:
            ff r7 = r12.l
            ff r8 = r7.b
            if (r8 == 0) goto L_0x010e
            int r7 = r7.a()
            goto L_0x010f
        L_0x010e:
            r7 = 0
        L_0x010f:
            int r8 = r12.K
            r17 = 1056964608(0x3f000000, float:0.5)
            if (r8 == r9) goto L_0x0150
            float r5 = (float) r5
            float r2 = r2 + r5
            ff r8 = r12.j
            fd r8 = r8.f
            float r9 = r2 + r17
            int r9 = (int) r9
            r15.a((defpackage.fd) r8, (int) r9)
            int r8 = r12.ae
            if (r8 == r11) goto L_0x012c
            int r5 = r12.f()
            float r5 = (float) r5
            float r2 = r2 + r5
            goto L_0x013f
        L_0x012c:
            int r8 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r8 == 0) goto L_0x013a
            float r8 = r12.aa
            float r8 = r8 * r1
            float r8 = r8 / r3
            float r8 = r8 - r5
            float r5 = (float) r7
            float r8 = r8 - r5
            float r2 = r2 + r8
            goto L_0x013f
        L_0x013a:
            float r5 = r4 - r5
            float r8 = (float) r7
            float r5 = r5 - r8
            float r2 = r2 + r5
        L_0x013f:
            ff r5 = r12.l
            fd r5 = r5.f
            float r8 = r2 + r17
            int r8 = (int) r8
            r15.a((defpackage.fd) r5, (int) r8)
            if (r0 == 0) goto L_0x014c
            goto L_0x014d
        L_0x014c:
            float r2 = r2 + r4
        L_0x014d:
            float r5 = (float) r7
            float r2 = r2 + r5
            goto L_0x0167
        L_0x0150:
            r5 = 1073741824(0x40000000, float:2.0)
            float r5 = r4 / r5
            float r5 = r2 - r5
            float r5 = r5 + r17
            int r5 = (int) r5
            ff r7 = r12.j
            fd r7 = r7.f
            r15.a((defpackage.fd) r7, (int) r5)
            ff r7 = r12.l
            fd r7 = r7.f
            r15.a((defpackage.fd) r7, (int) r5)
        L_0x0167:
            ff r5 = r12.l
            ff r5 = r5.b
            if (r5 == 0) goto L_0x0170
            fg r5 = r5.a
            goto L_0x0172
        L_0x0170:
            r5 = r16
        L_0x0172:
            if (r5 == 0) goto L_0x0181
            ff r7 = r5.j
            ff r7 = r7.b
            if (r7 == 0) goto L_0x0181
            fg r7 = r7.a
            if (r7 == r12) goto L_0x0181
            r12 = r16
            goto L_0x0182
        L_0x0181:
            r12 = r5
        L_0x0182:
            if (r12 != r6) goto L_0x0186
            r12 = r16
        L_0x0186:
            r9 = 8
            goto L_0x00f5
        L_0x018a:
            r20 = r13
            goto L_0x05a4
        L_0x018e:
            if (r0 != 0) goto L_0x0196
            r0 = r1
            r3 = r16
            r8 = r3
            r7 = 0
            goto L_0x019d
        L_0x0196:
            if (r5 != r2) goto L_0x035b
            r0 = r1
            r3 = r16
            r8 = r3
            r7 = 0
        L_0x019d:
            if (r0 == 0) goto L_0x0316
            fg r9 = r0.ac
            if (r9 != 0) goto L_0x01aa
            fg[] r3 = r6.at
            r3 = r3[r4]
            r17 = 1
            goto L_0x01ac
        L_0x01aa:
            r17 = r7
        L_0x01ac:
            if (r5 != r2) goto L_0x021c
            ff r7 = r0.j
            int r10 = r7.a()
            if (r8 == 0) goto L_0x01be
            ff r8 = r8.l
            int r8 = r8.a()
            int r10 = r10 + r8
            goto L_0x01bf
        L_0x01be:
        L_0x01bf:
            if (r1 == r0) goto L_0x01c3
            r8 = 3
            goto L_0x01c4
        L_0x01c3:
            r8 = 1
        L_0x01c4:
            ff r14 = r7.b
            if (r14 == 0) goto L_0x01cd
            fd r2 = r7.f
            fd r14 = r14.f
            goto L_0x01e1
        L_0x01cd:
            ff r2 = r0.m
            ff r14 = r2.b
            if (r14 == 0) goto L_0x01de
            fd r2 = r2.f
            fd r14 = r14.f
            int r18 = r7.a()
            int r10 = r10 - r18
            goto L_0x01e1
        L_0x01de:
            r2 = r16
            r14 = r2
        L_0x01e1:
            if (r2 != 0) goto L_0x01e4
            goto L_0x01e9
        L_0x01e4:
            if (r14 == 0) goto L_0x01e9
            r15.a(r2, r14, r10, r8)
        L_0x01e9:
            int r2 = r0.ae
            if (r2 != r11) goto L_0x021b
            ff r2 = r0.l
            int r8 = r0.d
            if (r8 != r4) goto L_0x0206
            int r8 = r0.g
            int r10 = r0.f()
            int r8 = java.lang.Math.max(r8, r10)
            fd r2 = r2.f
            fd r7 = r7.f
            r15.c(r2, r7, r8, r11)
            goto L_0x0271
        L_0x0206:
            fd r8 = r7.f
            ff r10 = r7.b
            fd r10 = r10.f
            int r14 = r7.c
            r15.a(r8, r10, r14, r11)
            fd r2 = r2.f
            fd r7 = r7.f
            int r8 = r0.g
            r15.b(r2, r7, r8, r11)
            goto L_0x0271
        L_0x021b:
            goto L_0x0271
        L_0x021c:
            r2 = 5
            if (r5 == 0) goto L_0x0249
            if (r17 == 0) goto L_0x0249
            if (r8 == 0) goto L_0x0249
            ff r7 = r0.l
            ff r8 = r7.b
            if (r8 != 0) goto L_0x0236
            fd r2 = r7.f
            int r7 = r0.h()
            int r8 = r0.z
            int r7 = r7 + r8
            r15.a((defpackage.fd) r2, (int) r7)
            goto L_0x0271
        L_0x0236:
            int r7 = r7.a()
            ff r8 = r0.l
            fd r8 = r8.f
            ff r10 = r3.l
            ff r10 = r10.b
            fd r10 = r10.f
            int r7 = -r7
            r15.c(r8, r10, r7, r2)
            goto L_0x0271
        L_0x0249:
            if (r5 != 0) goto L_0x024c
            goto L_0x027a
        L_0x024c:
            if (r17 != 0) goto L_0x027a
            if (r8 != 0) goto L_0x027a
            ff r7 = r0.j
            ff r8 = r7.b
            if (r8 != 0) goto L_0x0260
            fd r2 = r7.f
            int r7 = r0.h()
            r15.a((defpackage.fd) r2, (int) r7)
            goto L_0x0271
        L_0x0260:
            int r7 = r7.a()
            ff r8 = r0.j
            fd r8 = r8.f
            ff r10 = r12.j
            ff r10 = r10.b
            fd r10 = r10.f
            r15.c(r8, r10, r7, r2)
        L_0x0271:
            r19 = r0
            r4 = r12
            r20 = r13
            r0 = 3
            r2 = 0
            goto L_0x0303
        L_0x027a:
            ff r2 = r0.j
            ff r7 = r0.l
            int r10 = r2.a()
            int r14 = r7.a()
            fd r11 = r2.f
            r19 = r0
            ff r0 = r2.b
            fd r0 = r0.f
            r15.a(r11, r0, r10, r4)
            fd r0 = r7.f
            ff r11 = r7.b
            fd r11 = r11.f
            r20 = r13
            int r13 = -r14
            r15.b(r0, r11, r13, r4)
            ff r0 = r2.b
            if (r0 == 0) goto L_0x02a4
            fd r0 = r0.f
            goto L_0x02a6
        L_0x02a4:
            r0 = r16
        L_0x02a6:
            if (r8 != 0) goto L_0x02b4
            ff r0 = r12.j
            ff r0 = r0.b
            if (r0 == 0) goto L_0x02b1
            fd r0 = r0.f
            goto L_0x02b5
        L_0x02b1:
            r0 = r16
            goto L_0x02b5
        L_0x02b4:
        L_0x02b5:
            if (r9 != 0) goto L_0x02c4
            ff r8 = r3.l
            ff r8 = r8.b
            if (r8 == 0) goto L_0x02c1
            fg r9 = r8.a
            r13 = r9
            goto L_0x02c5
        L_0x02c1:
            r13 = r16
            goto L_0x02c5
        L_0x02c4:
            r13 = r9
        L_0x02c5:
            if (r13 == 0) goto L_0x02fc
            ff r8 = r13.j
            fd r8 = r8.f
            if (r17 == 0) goto L_0x02db
            ff r8 = r3.l
            ff r8 = r8.b
            if (r8 == 0) goto L_0x02d8
            fd r8 = r8.f
            r21 = r8
            goto L_0x02dd
        L_0x02d8:
            r21 = r16
            goto L_0x02dd
        L_0x02db:
            r21 = r8
        L_0x02dd:
            if (r0 != 0) goto L_0x02e5
            r4 = r12
            r21 = r13
            r0 = 3
            r2 = 0
            goto L_0x0301
        L_0x02e5:
            if (r21 == 0) goto L_0x02fc
            fd r8 = r2.f
            r11 = 1056964608(0x3f000000, float:0.5)
            fd r2 = r7.f
            r7 = r35
            r9 = r0
            r0 = 3
            r4 = r12
            r12 = r21
            r21 = r13
            r13 = r2
            r2 = 0
            r7.a(r8, r9, r10, r11, r12, r13, r14)
            goto L_0x0301
        L_0x02fc:
            r4 = r12
            r21 = r13
            r0 = 3
            r2 = 0
        L_0x0301:
            r9 = r21
        L_0x0303:
            if (r17 != 0) goto L_0x0306
            goto L_0x0308
        L_0x0306:
            r9 = r16
        L_0x0308:
            r12 = r4
            r0 = r9
            r7 = r17
            r8 = r19
            r13 = r20
            r2 = 2
            r4 = 1
            r11 = 3
            r14 = 0
            goto L_0x019d
        L_0x0316:
            r4 = r12
            r20 = r13
            r2 = 0
            r0 = 2
            if (r5 != r0) goto L_0x05a4
            ff r0 = r1.j
            ff r1 = r3.l
            int r10 = r0.a()
            int r14 = r1.a()
            ff r5 = r4.j
            ff r5 = r5.b
            if (r5 == 0) goto L_0x0333
            fd r5 = r5.f
            r9 = r5
            goto L_0x0335
        L_0x0333:
            r9 = r16
        L_0x0335:
            ff r3 = r3.l
            ff r3 = r3.b
            if (r3 == 0) goto L_0x033f
            fd r3 = r3.f
            r12 = r3
            goto L_0x0341
        L_0x033f:
            r12 = r16
        L_0x0341:
            if (r9 != 0) goto L_0x0345
        L_0x0343:
            goto L_0x05a4
        L_0x0345:
            if (r12 == 0) goto L_0x0343
            fd r3 = r1.f
            int r5 = -r14
            r7 = 1
            r15.b(r3, r12, r5, r7)
            fd r8 = r0.f
            float r11 = r4.I
            fd r13 = r1.f
            r7 = r35
            r7.a(r8, r9, r10, r11, r12, r13, r14)
            goto L_0x05a4
        L_0x035b:
            r4 = r12
            r20 = r13
            r2 = 0
            r3 = 3
            r5 = r16
        L_0x0362:
            if (r1 == 0) goto L_0x0403
            int r7 = r1.ae
            if (r7 == r3) goto L_0x03c0
            ff r7 = r1.j
            int r7 = r7.a()
            if (r5 == 0) goto L_0x0378
            ff r5 = r5.l
            int r5 = r5.a()
            int r7 = r7 + r5
            goto L_0x0379
        L_0x0378:
        L_0x0379:
            ff r5 = r1.j
            ff r8 = r5.b
            fg r9 = r8.a
            int r9 = r9.ae
            if (r9 != r3) goto L_0x0385
            r11 = 2
            goto L_0x0386
        L_0x0385:
            r11 = 3
        L_0x0386:
            fd r5 = r5.f
            fd r8 = r8.f
            r15.a(r5, r8, r7, r11)
            ff r5 = r1.l
            int r5 = r5.a()
            ff r7 = r1.l
            ff r7 = r7.b
            fg r7 = r7.a
            ff r7 = r7.j
            ff r8 = r7.b
            if (r8 != 0) goto L_0x03a0
            goto L_0x03a9
        L_0x03a0:
            fg r8 = r8.a
            if (r8 != r1) goto L_0x03a9
            int r7 = r7.a()
            int r5 = r5 + r7
        L_0x03a9:
            ff r7 = r1.l
            ff r8 = r7.b
            fg r9 = r8.a
            int r9 = r9.ae
            if (r9 != r3) goto L_0x03b5
            r11 = 2
            goto L_0x03b6
        L_0x03b5:
            r11 = 3
        L_0x03b6:
            fd r7 = r7.f
            fd r8 = r8.f
            int r5 = -r5
            r15.b(r7, r8, r5, r11)
            r8 = 1
            goto L_0x03fa
        L_0x03c0:
            float r5 = r1.aa
            float r10 = r10 + r5
            ff r5 = r1.l
            ff r7 = r5.b
            if (r7 == 0) goto L_0x03e1
            int r14 = r5.a()
            fg[] r5 = r6.at
            r5 = r5[r3]
            if (r1 == r5) goto L_0x03e2
            ff r5 = r1.l
            ff r5 = r5.b
            fg r5 = r5.a
            ff r5 = r5.j
            int r5 = r5.a()
            int r14 = r14 + r5
            goto L_0x03e2
        L_0x03e1:
            r14 = 0
        L_0x03e2:
            ff r5 = r1.l
            fd r5 = r5.f
            ff r7 = r1.j
            fd r7 = r7.f
            r8 = 1
            r15.a(r5, r7, r2, r8)
            ff r5 = r1.l
            fd r7 = r5.f
            ff r5 = r5.b
            fd r5 = r5.f
            int r9 = -r14
            r15.b(r7, r5, r9, r8)
        L_0x03fa:
            fg r5 = r1.ac
            r33 = r5
            r5 = r1
            r1 = r33
            goto L_0x0362
        L_0x0403:
            r8 = 1
            if (r0 != r8) goto L_0x0482
            fg[] r0 = r6.ap
            r0 = r0[r2]
            ff r1 = r0.j
            int r1 = r1.a()
            ff r5 = r0.j
            ff r5 = r5.b
            if (r5 == 0) goto L_0x041b
            int r5 = r5.a()
            int r1 = r1 + r5
        L_0x041b:
            ff r5 = r0.l
            int r5 = r5.a()
            ff r7 = r0.l
            ff r7 = r7.b
            if (r7 == 0) goto L_0x042c
            int r7 = r7.a()
            int r5 = r5 + r7
        L_0x042c:
            ff r7 = r4.l
            ff r7 = r7.b
            fd r7 = r7.f
            fg[] r8 = r6.at
            r3 = r8[r3]
            if (r0 != r3) goto L_0x0442
            r3 = 1
            r7 = r8[r3]
            ff r7 = r7.l
            ff r7 = r7.b
            fd r7 = r7.f
            goto L_0x0443
        L_0x0442:
            r3 = 1
        L_0x0443:
            int r8 = r0.d
            if (r8 != r3) goto L_0x046c
            ff r0 = r4.j
            fd r8 = r0.f
            ff r0 = r0.b
            fd r0 = r0.f
            r15.a(r8, r0, r1, r3)
            ff r0 = r4.l
            fd r0 = r0.f
            int r1 = -r5
            r15.b(r0, r7, r1, r3)
            ff r0 = r4.l
            fd r0 = r0.f
            ff r1 = r4.j
            fd r1 = r1.f
            int r3 = r4.f()
            r4 = 2
            r15.c(r0, r1, r3, r4)
            goto L_0x05a4
        L_0x046c:
            ff r3 = r0.j
            fd r4 = r3.f
            ff r3 = r3.b
            fd r3 = r3.f
            r8 = 1
            r15.c(r4, r3, r1, r8)
            ff r0 = r0.l
            fd r0 = r0.f
            int r1 = -r5
            r15.c(r0, r7, r1, r8)
            goto L_0x05a4
        L_0x0482:
            r14 = 0
        L_0x0483:
            int r1 = r0 + -1
            if (r14 >= r1) goto L_0x05a4
            fg[] r5 = r6.ap
            r7 = r5[r14]
            int r14 = r14 + 1
            r5 = r5[r14]
            ff r8 = r7.j
            fd r9 = r8.f
            ff r11 = r7.l
            fd r11 = r11.f
            ff r12 = r5.j
            fd r12 = r12.f
            ff r13 = r5.l
            fd r13 = r13.f
            fg[] r2 = r6.at
            r16 = r0
            r0 = r2[r3]
            if (r5 != r0) goto L_0x04af
            r0 = 1
            r2 = r2[r0]
            ff r0 = r2.l
            fd r0 = r0.f
            goto L_0x04b0
        L_0x04af:
            r0 = r13
        L_0x04b0:
            int r2 = r8.a()
            ff r8 = r7.j
            ff r8 = r8.b
            if (r8 == 0) goto L_0x04cc
            fg r8 = r8.a
            ff r8 = r8.l
            ff r13 = r8.b
            if (r13 != 0) goto L_0x04c3
            goto L_0x04cc
        L_0x04c3:
            fg r13 = r13.a
            if (r13 != r7) goto L_0x04cc
            int r8 = r8.a()
            int r2 = r2 + r8
        L_0x04cc:
            ff r8 = r7.j
            ff r8 = r8.b
            fd r8 = r8.f
            r13 = 2
            r15.a(r9, r8, r2, r13)
            ff r2 = r7.l
            int r2 = r2.a()
            ff r8 = r7.l
            ff r8 = r8.b
            if (r8 == 0) goto L_0x04f4
            fg r8 = r7.ac
            if (r8 == 0) goto L_0x04f4
            ff r8 = r8.j
            ff r13 = r8.b
            if (r13 == 0) goto L_0x04f1
            int r8 = r8.a()
            goto L_0x04f2
        L_0x04f1:
            r8 = 0
        L_0x04f2:
            int r2 = r2 + r8
            goto L_0x04f5
        L_0x04f4:
        L_0x04f5:
            ff r8 = r7.l
            ff r8 = r8.b
            fd r8 = r8.f
            int r2 = -r2
            r13 = 2
            r15.b(r11, r8, r2, r13)
            if (r14 != r1) goto L_0x055d
            ff r1 = r5.j
            int r1 = r1.a()
            ff r2 = r5.j
            ff r2 = r2.b
            if (r2 == 0) goto L_0x0520
            fg r2 = r2.a
            ff r2 = r2.l
            ff r8 = r2.b
            if (r8 != 0) goto L_0x0517
            goto L_0x0520
        L_0x0517:
            fg r8 = r8.a
            if (r8 != r5) goto L_0x0520
            int r2 = r2.a()
            int r1 = r1 + r2
        L_0x0520:
            ff r2 = r5.j
            ff r2 = r2.b
            fd r2 = r2.f
            r8 = 2
            r15.a(r12, r2, r1, r8)
            ff r1 = r5.l
            fg[] r2 = r6.at
            r8 = r2[r3]
            if (r5 != r8) goto L_0x0538
            r8 = 1
            r1 = r2[r8]
            ff r1 = r1.l
            goto L_0x0539
        L_0x0538:
            r8 = 1
        L_0x0539:
            int r2 = r1.a()
            ff r13 = r1.b
            if (r13 == 0) goto L_0x0553
            fg r13 = r13.a
            ff r13 = r13.j
            ff r3 = r13.b
            if (r3 != 0) goto L_0x054a
            goto L_0x0553
        L_0x054a:
            fg r3 = r3.a
            if (r3 != r5) goto L_0x0553
            int r3 = r13.a()
            int r2 = r2 + r3
        L_0x0553:
            ff r1 = r1.b
            fd r1 = r1.f
            int r2 = -r2
            r3 = 2
            r15.b(r0, r1, r2, r3)
            goto L_0x055f
        L_0x055d:
            r3 = 2
            r8 = 1
        L_0x055f:
            int r1 = r4.h
            if (r1 <= 0) goto L_0x0566
            r15.b(r11, r9, r1, r3)
        L_0x0566:
            ey r1 = r35.b()
            float r2 = r7.aa
            float r13 = r5.aa
            ff r3 = r7.j
            int r26 = r3.a()
            ff r3 = r7.l
            int r28 = r3.a()
            ff r3 = r5.j
            int r30 = r3.a()
            ff r3 = r5.l
            int r32 = r3.a()
            r21 = r1
            r22 = r2
            r23 = r10
            r24 = r13
            r25 = r9
            r27 = r11
            r29 = r12
            r31 = r0
            r21.a(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            r15.a((defpackage.ey) r1)
            r0 = r16
            r2 = 0
            r3 = 3
            goto L_0x0483
        L_0x05a2:
            r20 = r13
        L_0x05a4:
            int r13 = r20 + 1
            r14 = 0
            goto L_0x0006
        L_0x05a9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fh.d(fb):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v13, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v17, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v14, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v18, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v61, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v15, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v19, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v20, resolved type: int} */
    /* JADX WARNING: type inference failed for: r0v6 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(defpackage.fg r11, boolean[] r12) {
        /*
            r10 = this;
            int r0 = r11.ae
            r1 = 3
            r2 = 0
            if (r0 != r1) goto L_0x0016
            int r0 = r11.ad
            if (r0 == r1) goto L_0x0016
            float r0 = r11.u
            r3 = 0
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 > 0) goto L_0x0012
            goto L_0x0016
        L_0x0012:
            r12[r2] = r2
            return
        L_0x0016:
            int r0 = r11.e()
            r3 = 1
            r11.U = r3
            boolean r4 = r11 instanceof defpackage.fi
            r5 = 8
            if (r4 == 0) goto L_0x003c
            r12 = r11
            fi r12 = (defpackage.fi) r12
            int r1 = r12.ai
            if (r1 != 0) goto L_0x0039
            int r0 = r12.ag
            r1 = -1
            if (r0 != r1) goto L_0x0038
            int r12 = r12.ah
            if (r12 != r1) goto L_0x0035
            r0 = 0
            goto L_0x003a
        L_0x0035:
            r2 = r12
            r0 = 0
            goto L_0x003a
        L_0x0038:
            goto L_0x003a
        L_0x0039:
            r2 = r0
        L_0x003a:
            goto L_0x01ab
        L_0x003c:
            ff r4 = r11.m
            ff r6 = r4.b
            if (r6 != 0) goto L_0x0055
            ff r6 = r11.j
            ff r6 = r6.b
            if (r6 != 0) goto L_0x0055
            ff r6 = r11.l
            ff r6 = r6.b
            if (r6 != 0) goto L_0x0055
            int r12 = r11.x
            int r12 = r12 + r0
            r2 = r0
            r0 = r12
            goto L_0x01ab
        L_0x0055:
            ff r6 = r11.l
            ff r6 = r6.b
            if (r6 == 0) goto L_0x0072
            ff r7 = r11.j
            ff r7 = r7.b
            if (r7 != 0) goto L_0x0062
            goto L_0x0072
        L_0x0062:
            if (r6 == r7) goto L_0x006e
            fg r6 = r6.a
            fg r7 = r7.a
            if (r6 != r7) goto L_0x0072
            fg r7 = r11.r
            if (r6 == r7) goto L_0x0072
        L_0x006e:
            r12[r2] = r2
            return
        L_0x0072:
            boolean r4 = r4.c()
            if (r4 == 0) goto L_0x00a6
            ff r1 = r11.m
            ff r1 = r1.b
            fg r1 = r1.a
            boolean r2 = r1.U
            if (r2 != 0) goto L_0x0085
            r10.b(r1, r12)
        L_0x0085:
            int r12 = r1.L
            int r2 = r1.t
            int r12 = r12 - r2
            int r12 = r12 + r0
            int r12 = java.lang.Math.max(r12, r0)
            int r2 = r1.O
            int r1 = r1.t
            int r2 = r2 - r1
            int r2 = r2 + r0
            int r0 = java.lang.Math.max(r2, r0)
            int r1 = r11.K
            if (r1 != r5) goto L_0x00a1
            int r1 = r11.t
            int r12 = r12 - r1
            int r0 = r0 - r1
        L_0x00a1:
            r11.L = r12
            r11.O = r0
            return
        L_0x00a6:
            ff r4 = r11.j
            boolean r4 = r4.c()
            r6 = 0
            if (r4 == 0) goto L_0x00c9
            ff r4 = r11.j
            ff r7 = r4.b
            fg r7 = r7.a
            int r4 = r4.a()
            int r4 = r4 + r0
            boolean r8 = r7.b()
            if (r8 == 0) goto L_0x00c1
            goto L_0x00cb
        L_0x00c1:
            boolean r8 = r7.U
            if (r8 != 0) goto L_0x00cb
            r10.b(r7, r12)
            goto L_0x00cb
        L_0x00c9:
            r4 = r0
            r7 = r6
        L_0x00cb:
            ff r8 = r11.l
            boolean r8 = r8.c()
            if (r8 == 0) goto L_0x00f0
            ff r6 = r11.l
            ff r8 = r6.b
            fg r8 = r8.a
            int r6 = r6.a()
            int r0 = r0 + r6
            boolean r6 = r8.b()
            if (r6 == 0) goto L_0x00e5
            goto L_0x00ee
        L_0x00e5:
            boolean r6 = r8.U
            if (r6 != 0) goto L_0x00ed
            r10.b(r8, r12)
            goto L_0x00ee
        L_0x00ed:
        L_0x00ee:
            r6 = r8
            goto L_0x00f1
        L_0x00f0:
        L_0x00f1:
            ff r12 = r11.j
            ff r12 = r12.b
            r8 = 5
            if (r12 == 0) goto L_0x014c
            boolean r12 = r7.b()
            if (r12 != 0) goto L_0x014c
            ff r12 = r11.j
            ff r12 = r12.b
            int r12 = r12.g
            if (r12 != r1) goto L_0x010f
            int r12 = r7.L
            int r9 = r7.e()
            int r12 = r12 - r9
            int r4 = r4 + r12
            goto L_0x0116
        L_0x010f:
            if (r12 != r8) goto L_0x0115
            int r12 = r7.L
            int r4 = r4 + r12
            goto L_0x0116
        L_0x0115:
        L_0x0116:
            boolean r12 = r7.R
            if (r12 != 0) goto L_0x0136
            ff r12 = r7.j
            ff r12 = r12.b
            if (r12 == 0) goto L_0x0134
            fg r12 = r12.a
            if (r12 == r11) goto L_0x0134
            ff r12 = r7.l
            ff r12 = r12.b
            if (r12 == 0) goto L_0x0134
            fg r12 = r12.a
            if (r12 == r11) goto L_0x0134
            int r12 = r7.ae
            if (r12 != r1) goto L_0x0136
            r12 = 0
            goto L_0x0137
        L_0x0134:
            r12 = 0
            goto L_0x0137
        L_0x0136:
            r12 = 1
        L_0x0137:
            r11.R = r12
            if (r12 == 0) goto L_0x014d
            ff r12 = r7.l
            ff r12 = r12.b
            if (r12 != 0) goto L_0x0142
            goto L_0x0146
        L_0x0142:
            fg r12 = r12.a
            if (r12 == r11) goto L_0x014d
        L_0x0146:
            int r12 = r7.L
            int r12 = r4 - r12
            int r4 = r4 + r12
            goto L_0x014d
        L_0x014c:
        L_0x014d:
            ff r12 = r11.l
            ff r12 = r12.b
            if (r12 != 0) goto L_0x0154
            goto L_0x01a9
        L_0x0154:
            boolean r12 = r6.b()
            if (r12 != 0) goto L_0x01a8
            ff r12 = r11.l
            ff r12 = r12.b
            int r12 = r12.g
            if (r12 != r8) goto L_0x016b
            int r12 = r6.O
            int r7 = r6.e()
            int r12 = r12 - r7
            int r0 = r0 + r12
            goto L_0x0172
        L_0x016b:
            if (r12 != r1) goto L_0x0171
            int r12 = r6.O
            int r0 = r0 + r12
            goto L_0x0172
        L_0x0171:
        L_0x0172:
            boolean r12 = r6.S
            if (r12 != 0) goto L_0x0190
            ff r12 = r6.j
            ff r12 = r12.b
            if (r12 == 0) goto L_0x018f
            fg r12 = r12.a
            if (r12 == r11) goto L_0x018f
            ff r12 = r6.l
            ff r12 = r12.b
            if (r12 == 0) goto L_0x018f
            fg r12 = r12.a
            if (r12 == r11) goto L_0x018f
            int r12 = r6.ae
            if (r12 != r1) goto L_0x0190
            goto L_0x0191
        L_0x018f:
            goto L_0x0191
        L_0x0190:
            r2 = 1
        L_0x0191:
            r11.S = r2
            if (r2 == 0) goto L_0x01a9
            ff r12 = r6.j
            ff r12 = r12.b
            if (r12 != 0) goto L_0x019c
            goto L_0x01a0
        L_0x019c:
            fg r12 = r12.a
            if (r12 == r11) goto L_0x01a9
        L_0x01a0:
            int r12 = r6.O
            int r12 = r0 - r12
            int r0 = r0 + r12
            r2 = r0
            r0 = r4
            goto L_0x01ab
        L_0x01a8:
        L_0x01a9:
            r2 = r0
            r0 = r4
        L_0x01ab:
            int r12 = r11.K
            if (r12 != r5) goto L_0x01b4
            int r12 = r11.t
            int r0 = r0 - r12
            int r2 = r2 - r12
            goto L_0x01b5
        L_0x01b4:
        L_0x01b5:
            r11.L = r0
            r11.O = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fh.b(fg, boolean[]):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: fh} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: fh} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: fh} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: fh} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v64, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v66, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v67, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v68, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v69, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v70, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v71, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v72, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v73, resolved type: boolean} */
    /* JADX WARNING: Incorrect type for immutable var: ssa=boolean, code=int, for r0v79, types: [boolean] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x02b3 A[Catch:{ Exception -> 0x02bd }] */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x02e4 A[Catch:{ Exception -> 0x02bd }] */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x0391 A[Catch:{ Exception -> 0x03c7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x03f3  */
    /* JADX WARNING: Removed duplicated region for block: B:222:0x0434  */
    /* JADX WARNING: Removed duplicated region for block: B:239:0x0479  */
    /* JADX WARNING: Removed duplicated region for block: B:254:0x04d5  */
    /* JADX WARNING: Removed duplicated region for block: B:257:0x04e8  */
    /* JADX WARNING: Removed duplicated region for block: B:260:0x0503  */
    /* JADX WARNING: Removed duplicated region for block: B:262:0x0510  */
    /* JADX WARNING: Removed duplicated region for block: B:263:0x0517  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void n() {
        /*
            r30 = this;
            r1 = r30
            int r2 = r1.w
            int r3 = r1.x
            int r0 = r30.c()
            r4 = 0
            int r5 = java.lang.Math.max(r4, r0)
            int r0 = r30.f()
            int r6 = java.lang.Math.max(r4, r0)
            r1.aj = r4
            r1.ak = r4
            fg r0 = r1.r
            r7 = 0
            r8 = 2
            if (r0 != 0) goto L_0x0027
            r1.w = r4
            r1.x = r4
            goto L_0x00aa
        L_0x0027:
            fk r0 = r1.am
            if (r0 == 0) goto L_0x002c
            goto L_0x0033
        L_0x002c:
            fk r0 = new fk
            r0.<init>(r1)
            r1.am = r0
        L_0x0033:
            fk r0 = r1.am
            int r9 = r1.w
            r0.a = r9
            int r9 = r1.x
            r0.b = r9
            int r9 = r30.c()
            r0.c = r9
            int r9 = r30.f()
            r0.d = r9
            java.util.ArrayList r9 = r0.e
            int r9 = r9.size()
            r10 = 0
        L_0x0050:
            if (r10 >= r9) goto L_0x0088
            java.util.ArrayList r11 = r0.e
            java.lang.Object r11 = r11.get(r10)
            fj r11 = (defpackage.fj) r11
            ff r12 = r11.a
            int r12 = r12.g
            ff r12 = r1.e(r12)
            r11.a = r12
            ff r12 = r11.a
            if (r12 == 0) goto L_0x007d
            ff r13 = r12.b
            r11.b = r13
            int r12 = r12.a()
            r11.c = r12
            ff r12 = r11.a
            int r13 = r12.h
            r11.e = r13
            int r12 = r12.e
            r11.d = r12
            goto L_0x0085
        L_0x007d:
            r11.b = r7
            r11.c = r4
            r11.e = r8
            r11.d = r4
        L_0x0085:
            int r10 = r10 + 1
            goto L_0x0050
        L_0x0088:
            r1.w = r4
            r1.x = r4
            java.util.ArrayList r0 = r1.q
            int r0 = r0.size()
            r9 = 0
        L_0x0093:
            if (r9 >= r0) goto L_0x00a3
            java.util.ArrayList r10 = r1.q
            java.lang.Object r10 = r10.get(r9)
            ff r10 = (defpackage.ff) r10
            r10.b()
            int r9 = r9 + 1
            goto L_0x0093
        L_0x00a3:
            fb r0 = r1.af
            ez r0 = r0.g
            r1.a((defpackage.ez) r0)
        L_0x00aa:
            int r9 = r1.ae
            int r10 = r1.ad
            int r0 = r1.ai
            r12 = 1
            if (r0 == r8) goto L_0x00b9
            r23 = r2
            r18 = r3
            goto L_0x0222
        L_0x00b9:
            if (r9 != r8) goto L_0x00bc
            goto L_0x00c4
        L_0x00bc:
            if (r10 == r8) goto L_0x00c4
            r23 = r2
            r18 = r3
            goto L_0x0222
        L_0x00c4:
            java.util.ArrayList r0 = r1.al
            boolean[] r13 = r1.as
            int r14 = r0.size()
            r13[r4] = r12
            r18 = r3
            r3 = 0
            r7 = 0
            r8 = 0
            r11 = 0
            r12 = 0
            r15 = 0
        L_0x00d6:
            if (r15 < r14) goto L_0x0115
            int r7 = java.lang.Math.max(r7, r12)
            int r12 = r1.D
            int r7 = java.lang.Math.max(r7, r8)
            int r7 = java.lang.Math.max(r12, r7)
            r1.ag = r7
            int r4 = java.lang.Math.max(r11, r4)
            int r7 = r1.E
            int r3 = java.lang.Math.max(r4, r3)
            int r3 = java.lang.Math.max(r7, r3)
            r1.ah = r3
            r3 = 0
        L_0x00f9:
            if (r3 >= r14) goto L_0x0111
            java.lang.Object r4 = r0.get(r3)
            fg r4 = (defpackage.fg) r4
            r7 = 0
            r4.T = r7
            r4.U = r7
            r4.P = r7
            r4.Q = r7
            r4.R = r7
            r4.S = r7
            int r3 = r3 + 1
            goto L_0x00f9
        L_0x0111:
            r23 = r2
            goto L_0x01cc
        L_0x0115:
            java.lang.Object r19 = r0.get(r15)
            r20 = r0
            r0 = r19
            fg r0 = (defpackage.fg) r0
            boolean r19 = r0.b()
            if (r19 == 0) goto L_0x012d
            r23 = r2
            r21 = r13
            r19 = r14
            goto L_0x01be
        L_0x012d:
            r19 = r14
            boolean r14 = r0.T
            if (r14 != 0) goto L_0x0136
            r1.a((defpackage.fg) r0, (boolean[]) r13)
        L_0x0136:
            boolean r14 = r0.U
            if (r14 != 0) goto L_0x013d
            r1.b(r0, r13)
        L_0x013d:
            r14 = 0
            boolean r21 = r13[r14]
            if (r21 == 0) goto L_0x01ca
            int r14 = r0.M
            r21 = r13
            int r13 = r0.N
            int r14 = r14 + r13
            int r13 = r0.c()
            int r14 = r14 - r13
            int r13 = r0.L
            r22 = r14
            int r14 = r0.O
            int r13 = r13 + r14
            int r14 = r0.f()
            int r13 = r13 - r14
            int r14 = r0.ad
            r23 = r13
            r13 = 4
            if (r14 != r13) goto L_0x0172
            int r14 = r0.c()
            ff r13 = r0.i
            int r13 = r13.c
            int r14 = r14 + r13
            ff r13 = r0.k
            int r13 = r13.c
            int r14 = r14 + r13
            r22 = r14
        L_0x0172:
            int r13 = r0.ae
            r14 = 4
            if (r13 != r14) goto L_0x0187
            int r13 = r0.f()
            ff r14 = r0.j
            int r14 = r14.c
            int r13 = r13 + r14
            ff r14 = r0.l
            int r14 = r14.c
            int r13 = r13 + r14
            r23 = r13
        L_0x0187:
            int r13 = r0.K
            r14 = 8
            if (r13 == r14) goto L_0x0194
            r29 = r23
            r23 = r2
            r2 = r29
            goto L_0x0197
        L_0x0194:
            r23 = r2
            r2 = 0
        L_0x0197:
            if (r13 == r14) goto L_0x019c
            r13 = r22
            goto L_0x019d
        L_0x019c:
            r13 = 0
        L_0x019d:
            int r14 = r0.M
            int r7 = java.lang.Math.max(r7, r14)
            int r14 = r0.N
            int r12 = java.lang.Math.max(r12, r14)
            int r14 = r0.O
            int r4 = java.lang.Math.max(r4, r14)
            int r0 = r0.L
            int r11 = java.lang.Math.max(r11, r0)
            int r8 = java.lang.Math.max(r8, r13)
            int r0 = java.lang.Math.max(r3, r2)
            r3 = r0
        L_0x01be:
            int r15 = r15 + 1
            r14 = r19
            r0 = r20
            r13 = r21
            r2 = r23
            goto L_0x00d6
        L_0x01ca:
            r23 = r2
        L_0x01cc:
            boolean[] r0 = r1.as
            r2 = 0
            boolean r0 = r0[r2]
            if (r5 > 0) goto L_0x01d4
            goto L_0x01df
        L_0x01d4:
            if (r6 <= 0) goto L_0x01df
            int r2 = r1.ag
            if (r2 > r5) goto L_0x01de
            int r2 = r1.ah
            if (r2 <= r6) goto L_0x01df
        L_0x01de:
            r0 = 0
        L_0x01df:
            if (r0 == 0) goto L_0x0221
            int r2 = r1.ad
            r3 = 2
            if (r2 != r3) goto L_0x0201
            r2 = 1
            r1.ad = r2
            if (r5 > 0) goto L_0x01ec
            goto L_0x01f6
        L_0x01ec:
            int r3 = r1.ag
            if (r5 >= r3) goto L_0x01f6
            r1.aj = r2
            r1.a((int) r5)
            goto L_0x0201
        L_0x01f6:
            int r2 = r1.D
            int r3 = r1.ag
            int r2 = java.lang.Math.max(r2, r3)
            r1.a((int) r2)
        L_0x0201:
            int r2 = r1.ae
            r3 = 2
            if (r2 != r3) goto L_0x0221
            r2 = 1
            r1.ae = r2
            if (r6 > 0) goto L_0x020c
            goto L_0x0216
        L_0x020c:
            int r3 = r1.ah
            if (r6 >= r3) goto L_0x0216
            r1.ak = r2
            r1.b(r6)
            goto L_0x0221
        L_0x0216:
            int r2 = r1.E
            int r3 = r1.ah
            int r2 = java.lang.Math.max(r2, r3)
            r1.b(r2)
        L_0x0221:
            r4 = r0
        L_0x0222:
            r2 = 0
            r1.an = r2
            r1.ao = r2
            java.util.ArrayList r0 = r1.al
            int r2 = r0.size()
            r0 = 0
        L_0x022e:
            if (r0 >= r2) goto L_0x0245
            java.util.ArrayList r3 = r1.al
            java.lang.Object r3 = r3.get(r0)
            fg r3 = (defpackage.fg) r3
            boolean r7 = r3 instanceof defpackage.fl
            if (r7 != 0) goto L_0x023d
            goto L_0x0242
        L_0x023d:
            fl r3 = (defpackage.fl) r3
            r3.n()
        L_0x0242:
            int r0 = r0 + 1
            goto L_0x022e
        L_0x0245:
            r0 = 0
            r3 = 1
        L_0x0247:
            if (r3 == 0) goto L_0x0561
            r7 = 1
            int r8 = r0 + 1
            fb r0 = r1.af     // Catch:{ Exception -> 0x03e4 }
            r0.a()     // Catch:{ Exception -> 0x03e4 }
            fb r0 = r1.af     // Catch:{ Exception -> 0x03e4 }
            boolean r3 = r1.b(r0)     // Catch:{ Exception -> 0x03e4 }
            if (r3 == 0) goto L_0x03d7
            fb r7 = r1.af     // Catch:{ Exception -> 0x03c9 }
            fa r11 = r7.b     // Catch:{ Exception -> 0x03c9 }
            r11.a(r7)     // Catch:{ Exception -> 0x03c9 }
            r7.a((defpackage.fa) r11)     // Catch:{ Exception -> 0x03c9 }
            r0 = 0
        L_0x0264:
            int r12 = r7.e     // Catch:{ Exception -> 0x03c9 }
            if (r0 >= r12) goto L_0x0270
            boolean[] r12 = r7.d     // Catch:{ Exception -> 0x03c9 }
            r13 = 0
            r12[r0] = r13     // Catch:{ Exception -> 0x03c9 }
            int r0 = r0 + 1
            goto L_0x0264
        L_0x0270:
            r0 = 0
            r12 = 0
        L_0x0272:
            if (r12 != 0) goto L_0x03aa
            java.util.ArrayList r13 = r11.a     // Catch:{ Exception -> 0x03c9 }
            int r13 = r13.size()     // Catch:{ Exception -> 0x03c9 }
            r19 = r3
            r3 = 0
            r14 = 0
            r15 = 0
        L_0x027f:
            r20 = 0
            if (r14 >= r13) goto L_0x02c0
            r21 = r12
            java.util.ArrayList r12 = r11.a     // Catch:{ Exception -> 0x02bd }
            java.lang.Object r12 = r12.get(r14)     // Catch:{ Exception -> 0x02bd }
            fd r12 = (defpackage.fd) r12     // Catch:{ Exception -> 0x02bd }
            r22 = 5
            r22 = r13
            r13 = 5
        L_0x0292:
            if (r13 >= 0) goto L_0x029b
            int r14 = r14 + 1
            r12 = r21
            r13 = r22
            goto L_0x027f
        L_0x029b:
            r24 = r14
            float[] r14 = r12.e     // Catch:{ Exception -> 0x02bd }
            r14 = r14[r13]     // Catch:{ Exception -> 0x02bd }
            if (r3 == 0) goto L_0x02a4
        L_0x02a3:
            goto L_0x02ae
        L_0x02a4:
            int r25 = (r14 > r20 ? 1 : (r14 == r20 ? 0 : -1))
            if (r25 < 0) goto L_0x02a9
            goto L_0x02a3
        L_0x02a9:
            if (r13 >= r15) goto L_0x02ac
            goto L_0x02a3
        L_0x02ac:
            r3 = r12
            r15 = r13
        L_0x02ae:
            int r14 = (r14 > r20 ? 1 : (r14 == r20 ? 0 : -1))
            if (r14 > 0) goto L_0x02b3
        L_0x02b2:
            goto L_0x02b8
        L_0x02b3:
            if (r13 > r15) goto L_0x02b6
            goto L_0x02b2
        L_0x02b6:
            r15 = r13
            r3 = 0
        L_0x02b8:
            int r13 = r13 + -1
            r14 = r24
            goto L_0x0292
        L_0x02bd:
            r0 = move-exception
            goto L_0x03cc
        L_0x02c0:
            r21 = r12
            if (r3 == 0) goto L_0x02dc
            boolean[] r12 = r7.d     // Catch:{ Exception -> 0x02bd }
            int r13 = r3.a     // Catch:{ Exception -> 0x02bd }
            boolean r14 = r12[r13]     // Catch:{ Exception -> 0x02bd }
            if (r14 == 0) goto L_0x02cf
            r3 = r0
            r0 = 0
            goto L_0x02e2
        L_0x02cf:
            r14 = 1
            r12[r13] = r14     // Catch:{ Exception -> 0x02bd }
            int r0 = r0 + 1
            int r12 = r7.e     // Catch:{ Exception -> 0x02bd }
            if (r0 < r12) goto L_0x02dc
            r21 = 1
            goto L_0x02dd
        L_0x02dc:
        L_0x02dd:
            r29 = r3
            r3 = r0
            r0 = r29
        L_0x02e2:
            if (r0 == 0) goto L_0x0391
            r12 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r12 = 0
            r14 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r15 = -1
        L_0x02ec:
            int r13 = r7.f     // Catch:{ Exception -> 0x02bd }
            if (r12 >= r13) goto L_0x0357
            ey[] r13 = r7.c     // Catch:{ Exception -> 0x02bd }
            r13 = r13[r12]     // Catch:{ Exception -> 0x02bd }
            r24 = r3
            fd r3 = r13.a     // Catch:{ Exception -> 0x02bd }
            int r3 = r3.h     // Catch:{ Exception -> 0x02bd }
            r25 = r4
            r4 = 1
            if (r3 == r4) goto L_0x0344
            ex r3 = r13.d     // Catch:{ Exception -> 0x0341 }
            int r4 = r3.f     // Catch:{ Exception -> 0x0341 }
            r26 = r6
            r6 = -1
            r27 = r5
            if (r4 != r6) goto L_0x030d
            r28 = r9
            goto L_0x034a
        L_0x030d:
            r5 = 0
        L_0x030e:
            if (r4 == r6) goto L_0x0348
            int r6 = r3.a     // Catch:{ Exception -> 0x033e }
            if (r5 >= r6) goto L_0x0348
            int[] r6 = r3.c     // Catch:{ Exception -> 0x033e }
            r6 = r6[r4]     // Catch:{ Exception -> 0x033e }
            r28 = r9
            int r9 = r0.a     // Catch:{ Exception -> 0x03c7 }
            if (r6 != r9) goto L_0x0334
            ex r3 = r13.d     // Catch:{ Exception -> 0x03c7 }
            float r3 = r3.b((defpackage.fd) r0)     // Catch:{ Exception -> 0x03c7 }
            int r4 = (r3 > r20 ? 1 : (r3 == r20 ? 0 : -1))
            if (r4 >= 0) goto L_0x0333
            float r4 = r13.b     // Catch:{ Exception -> 0x03c7 }
            float r4 = -r4
            float r4 = r4 / r3
            int r3 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            if (r3 >= 0) goto L_0x0333
            r14 = r4
            r15 = r12
            goto L_0x034a
        L_0x0333:
            goto L_0x034a
        L_0x0334:
            int[] r6 = r3.d     // Catch:{ Exception -> 0x03c7 }
            r4 = r6[r4]     // Catch:{ Exception -> 0x03c7 }
            int r5 = r5 + 1
            r9 = r28
            r6 = -1
            goto L_0x030e
        L_0x033e:
            r0 = move-exception
            goto L_0x03d2
        L_0x0341:
            r0 = move-exception
            goto L_0x03ce
        L_0x0344:
            r27 = r5
            r26 = r6
        L_0x0348:
            r28 = r9
        L_0x034a:
            int r12 = r12 + 1
            r3 = r24
            r4 = r25
            r6 = r26
            r5 = r27
            r9 = r28
            goto L_0x02ec
        L_0x0357:
            r24 = r3
            r25 = r4
            r27 = r5
            r26 = r6
            r28 = r9
            if (r15 < 0) goto L_0x039b
            ey[] r3 = r7.c     // Catch:{ Exception -> 0x03c7 }
            r3 = r3[r15]     // Catch:{ Exception -> 0x03c7 }
            fd r4 = r3.a     // Catch:{ Exception -> 0x03c7 }
            r5 = -1
            r4.b = r5     // Catch:{ Exception -> 0x03c7 }
            r3.a((defpackage.fd) r0)     // Catch:{ Exception -> 0x03c7 }
            fd r0 = r3.a     // Catch:{ Exception -> 0x03c7 }
            r0.b = r15     // Catch:{ Exception -> 0x03c7 }
            r0 = 0
        L_0x0374:
            int r4 = r7.f     // Catch:{ Exception -> 0x03c7 }
            if (r0 >= r4) goto L_0x0382
            ey[] r4 = r7.c     // Catch:{ Exception -> 0x03c7 }
            r4 = r4[r0]     // Catch:{ Exception -> 0x03c7 }
            r4.a((defpackage.ey) r3)     // Catch:{ Exception -> 0x03c7 }
            int r0 = r0 + 1
            goto L_0x0374
        L_0x0382:
            r11.a(r7)     // Catch:{ Exception -> 0x03c7 }
            r7.a((defpackage.fa) r11)     // Catch:{ Exception -> 0x0389 }
            goto L_0x038e
        L_0x0389:
            r0 = move-exception
            r3 = r0
            defpackage.apev.a(r3)     // Catch:{ Exception -> 0x03c7 }
        L_0x038e:
            r12 = r21
            goto L_0x039c
        L_0x0391:
            r24 = r3
            r25 = r4
            r27 = r5
            r26 = r6
            r28 = r9
        L_0x039b:
            r12 = 1
        L_0x039c:
            r3 = r19
            r0 = r24
            r4 = r25
            r6 = r26
            r5 = r27
            r9 = r28
            goto L_0x0272
        L_0x03aa:
            r19 = r3
            r25 = r4
            r27 = r5
            r26 = r6
            r28 = r9
            r0 = 0
        L_0x03b5:
            int r3 = r7.f     // Catch:{ Exception -> 0x03c7 }
            if (r0 >= r3) goto L_0x03c6
            ey[] r3 = r7.c     // Catch:{ Exception -> 0x03c7 }
            r3 = r3[r0]     // Catch:{ Exception -> 0x03c7 }
            fd r4 = r3.a     // Catch:{ Exception -> 0x03c7 }
            float r3 = r3.b     // Catch:{ Exception -> 0x03c7 }
            r4.d = r3     // Catch:{ Exception -> 0x03c7 }
            int r0 = r0 + 1
            goto L_0x03b5
        L_0x03c6:
            goto L_0x03e1
        L_0x03c7:
            r0 = move-exception
            goto L_0x03d4
        L_0x03c9:
            r0 = move-exception
            r19 = r3
        L_0x03cc:
            r25 = r4
        L_0x03ce:
            r27 = r5
            r26 = r6
        L_0x03d2:
            r28 = r9
        L_0x03d4:
            r3 = r19
            goto L_0x03ed
        L_0x03d7:
            r19 = r3
            r25 = r4
            r27 = r5
            r26 = r6
            r28 = r9
        L_0x03e1:
            r3 = r19
            goto L_0x03f0
        L_0x03e4:
            r0 = move-exception
            r25 = r4
            r27 = r5
            r26 = r6
            r28 = r9
        L_0x03ed:
            defpackage.apev.a(r0)
        L_0x03f0:
            r0 = 3
            if (r3 == 0) goto L_0x0434
            boolean[] r3 = r1.as
            r4 = 2
            r7 = 0
            r3[r4] = r7
            r30.m()
            java.util.ArrayList r4 = r1.al
            int r4 = r4.size()
            r5 = 0
        L_0x0403:
            if (r5 >= r4) goto L_0x046e
            java.util.ArrayList r6 = r1.al
            java.lang.Object r6 = r6.get(r5)
            fg r6 = (defpackage.fg) r6
            r6.m()
            int r9 = r6.ad
            if (r9 != r0) goto L_0x0420
            int r9 = r6.c()
            int r11 = r6.F
            if (r9 >= r11) goto L_0x0420
            r9 = 2
            r11 = 1
            r3[r9] = r11
        L_0x0420:
            int r9 = r6.ae
            if (r9 == r0) goto L_0x0425
            goto L_0x0431
        L_0x0425:
            int r9 = r6.f()
            int r6 = r6.G
            if (r9 >= r6) goto L_0x0431
            r6 = 2
            r9 = 1
            r3[r6] = r9
        L_0x0431:
            int r5 = r5 + 1
            goto L_0x0403
        L_0x0434:
            r7 = 0
            r30.m()
            r3 = 0
        L_0x0439:
            if (r3 >= r2) goto L_0x046e
            java.util.ArrayList r4 = r1.al
            java.lang.Object r4 = r4.get(r3)
            fg r4 = (defpackage.fg) r4
            int r5 = r4.ad
            if (r5 != r0) goto L_0x0457
            int r5 = r4.c()
            int r6 = r4.F
            if (r5 < r6) goto L_0x0450
            goto L_0x0457
        L_0x0450:
            boolean[] r0 = r1.as
            r3 = 2
            r4 = 1
            r0[r3] = r4
            goto L_0x046e
        L_0x0457:
            int r5 = r4.ae
            if (r5 == r0) goto L_0x045c
            goto L_0x046b
        L_0x045c:
            int r5 = r4.f()
            int r4 = r4.G
            if (r5 >= r4) goto L_0x046b
            boolean[] r0 = r1.as
            r3 = 2
            r4 = 1
            r0[r3] = r4
            goto L_0x046e
        L_0x046b:
            int r3 = r3 + 1
            goto L_0x0439
        L_0x046e:
            r3 = 8
            if (r8 >= r3) goto L_0x04d5
            boolean[] r0 = r1.as
            r4 = 2
            boolean r0 = r0[r4]
            if (r0 == 0) goto L_0x04d5
            r0 = 0
            r4 = 0
            r5 = 0
        L_0x047c:
            if (r0 >= r2) goto L_0x049f
            java.util.ArrayList r6 = r1.al
            java.lang.Object r6 = r6.get(r0)
            fg r6 = (defpackage.fg) r6
            int r9 = r6.w
            int r11 = r6.c()
            int r9 = r9 + r11
            int r4 = java.lang.Math.max(r4, r9)
            int r9 = r6.x
            int r6 = r6.f()
            int r9 = r9 + r6
            int r5 = java.lang.Math.max(r5, r9)
            int r0 = r0 + 1
            goto L_0x047c
        L_0x049f:
            int r0 = r1.D
            int r0 = java.lang.Math.max(r0, r4)
            int r4 = r1.E
            int r4 = java.lang.Math.max(r4, r5)
            r5 = 2
            if (r10 == r5) goto L_0x04b0
            r0 = 0
            goto L_0x04c0
        L_0x04b0:
            int r6 = r30.c()
            if (r6 >= r0) goto L_0x04bf
            r1.a((int) r0)
            r1.ad = r5
            r0 = 1
            r25 = 1
            goto L_0x04c0
        L_0x04bf:
            r0 = 0
        L_0x04c0:
            r6 = r28
            if (r6 == r5) goto L_0x04c5
            goto L_0x04d8
        L_0x04c5:
            int r9 = r30.f()
            if (r9 >= r4) goto L_0x04d4
            r1.b(r4)
            r1.ae = r5
            r0 = 1
            r25 = 1
            goto L_0x04d8
        L_0x04d4:
            goto L_0x04d8
        L_0x04d5:
            r6 = r28
            r0 = 0
        L_0x04d8:
            int r4 = r1.D
            int r5 = r30.c()
            int r4 = java.lang.Math.max(r4, r5)
            int r5 = r30.c()
            if (r4 <= r5) goto L_0x04f2
            r1.a((int) r4)
            r4 = 1
            r1.ad = r4
            r0 = 1
            r25 = 1
            goto L_0x04f3
        L_0x04f2:
        L_0x04f3:
            int r4 = r1.E
            int r5 = r30.f()
            int r4 = java.lang.Math.max(r4, r5)
            int r5 = r30.f()
            if (r4 <= r5) goto L_0x050d
            r1.b(r4)
            r4 = 1
            r1.ae = r4
            r0 = 1
            r25 = 1
            goto L_0x050e
        L_0x050d:
        L_0x050e:
            if (r25 == 0) goto L_0x0517
            r11 = r26
            r5 = r27
            r4 = 1
            r9 = 2
            goto L_0x0559
        L_0x0517:
            int r4 = r1.ad
            r5 = 2
            if (r4 == r5) goto L_0x051f
            r5 = r27
            goto L_0x0539
        L_0x051f:
            if (r27 > 0) goto L_0x0524
            r5 = r27
            goto L_0x0539
        L_0x0524:
            int r4 = r30.c()
            r5 = r27
            if (r4 <= r5) goto L_0x0538
            r4 = 1
            r1.aj = r4
            r1.ad = r4
            r1.a((int) r5)
            r0 = 1
            r25 = 1
            goto L_0x0539
        L_0x0538:
        L_0x0539:
            int r4 = r1.ae
            r9 = 2
            if (r4 != r9) goto L_0x0556
            if (r26 <= 0) goto L_0x0556
            int r4 = r30.f()
            r11 = r26
            if (r4 <= r11) goto L_0x0554
            r4 = 1
            r1.ak = r4
            r1.ae = r4
            r1.b(r11)
            r0 = 1
            r25 = 1
            goto L_0x0559
        L_0x0554:
            r4 = 1
            goto L_0x0559
        L_0x0556:
            r11 = r26
            r4 = 1
        L_0x0559:
            r3 = r0
            r9 = r6
            r0 = r8
            r6 = r11
            r4 = r25
            goto L_0x0247
        L_0x0561:
            r25 = r4
            r6 = r9
            r7 = 0
            fg r0 = r1.r
            if (r0 == 0) goto L_0x05c3
            int r0 = r1.D
            int r2 = r30.c()
            int r0 = java.lang.Math.max(r0, r2)
            int r2 = r1.E
            int r3 = r30.f()
            int r2 = java.lang.Math.max(r2, r3)
            fk r3 = r1.am
            int r4 = r3.a
            r1.w = r4
            int r4 = r3.b
            r1.x = r4
            int r4 = r3.c
            r1.a((int) r4)
            int r4 = r3.d
            r1.b(r4)
            java.util.ArrayList r4 = r3.e
            int r4 = r4.size()
        L_0x0597:
            if (r7 >= r4) goto L_0x05bc
            java.util.ArrayList r5 = r3.e
            java.lang.Object r5 = r5.get(r7)
            fj r5 = (defpackage.fj) r5
            ff r8 = r5.a
            int r8 = r8.g
            ff r11 = r1.e(r8)
            ff r12 = r5.b
            int r13 = r5.c
            r14 = -1
            int r15 = r5.e
            int r5 = r5.d
            r17 = 0
            r16 = r5
            r11.a(r12, r13, r14, r15, r16, r17)
            int r7 = r7 + 1
            goto L_0x0597
        L_0x05bc:
            r1.a((int) r0)
            r1.b(r2)
            goto L_0x05cb
        L_0x05c3:
            r2 = r23
            r1.w = r2
            r2 = r18
            r1.x = r2
        L_0x05cb:
            if (r25 != 0) goto L_0x05ce
            goto L_0x05d2
        L_0x05ce:
            r1.ad = r10
            r1.ae = r6
        L_0x05d2:
            fb r0 = r1.af
            ez r0 = r0.g
            r1.a((defpackage.ez) r0)
            fg r0 = r1.r
            r2 = r1
        L_0x05dc:
            if (r0 == 0) goto L_0x05e7
            fg r3 = r0.r
            boolean r4 = r0 instanceof defpackage.fh
            if (r4 == 0) goto L_0x05e5
            r2 = r0
        L_0x05e5:
            r0 = r3
            goto L_0x05dc
        L_0x05e7:
            if (r1 != r2) goto L_0x05ec
            r30.l()
        L_0x05ec:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fh.n():void");
    }

    public final void a() {
        this.af.a();
        super.a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:224:0x06e0, code lost:
        if (r5.K == 8) goto L_0x06e5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean b(defpackage.fb r21) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r20.a((defpackage.fb) r21)
            java.util.ArrayList r2 = r0.al
            int r2 = r2.size()
            int r3 = r0.ai
            r4 = 4
            r5 = 8
            r6 = 0
            r7 = 1
            r8 = 2
            if (r3 != r8) goto L_0x0018
            goto L_0x001c
        L_0x0018:
            if (r3 == r4) goto L_0x001c
            r3 = 1
            goto L_0x0073
        L_0x001c:
            java.util.ArrayList r3 = r0.al
            int r3 = r3.size()
            r9 = 0
        L_0x0023:
            r10 = 3
            r11 = -1
            if (r9 >= r3) goto L_0x0044
            java.util.ArrayList r12 = r0.al
            java.lang.Object r12 = r12.get(r9)
            fg r12 = (defpackage.fg) r12
            r12.a = r11
            r12.b = r11
            int r11 = r12.ad
            if (r11 != r10) goto L_0x0038
        L_0x0037:
            goto L_0x003d
        L_0x0038:
            int r11 = r12.ae
            if (r11 == r10) goto L_0x0037
            goto L_0x0041
        L_0x003d:
            r12.a = r7
            r12.b = r7
        L_0x0041:
            int r9 = r9 + 1
            goto L_0x0023
        L_0x0044:
            r9 = 0
            r12 = 0
            r13 = 0
        L_0x0047:
            if (r9 == 0) goto L_0x0147
            r9 = 0
            r10 = 0
            r12 = 0
        L_0x004c:
            if (r9 >= r3) goto L_0x006c
            java.util.ArrayList r13 = r0.al
            java.lang.Object r13 = r13.get(r9)
            fg r13 = (defpackage.fg) r13
            int r14 = r13.a
            if (r14 != r7) goto L_0x005b
            goto L_0x005d
        L_0x005b:
            if (r14 != r11) goto L_0x005f
        L_0x005d:
            int r10 = r10 + 1
        L_0x005f:
            int r13 = r13.b
            if (r13 != r7) goto L_0x0064
        L_0x0063:
            goto L_0x0067
        L_0x0064:
            if (r13 != r11) goto L_0x0069
            goto L_0x0063
        L_0x0067:
            int r12 = r12 + 1
        L_0x0069:
            int r9 = r9 + 1
            goto L_0x004c
        L_0x006c:
            if (r10 == 0) goto L_0x0070
            r3 = 0
            goto L_0x0073
        L_0x0070:
            if (r12 == 0) goto L_0x0146
            r3 = 0
        L_0x0073:
        L_0x0074:
            if (r6 >= r2) goto L_0x0136
            java.util.ArrayList r9 = r0.al
            java.lang.Object r9 = r9.get(r6)
            fg r9 = (defpackage.fg) r9
            boolean r10 = r9 instanceof defpackage.fh
            if (r10 == 0) goto L_0x00a3
            int r10 = r9.ad
            int r11 = r9.ae
            if (r10 != r8) goto L_0x008b
            r9.f(r7)
        L_0x008b:
            if (r11 == r8) goto L_0x008e
            goto L_0x0092
        L_0x008e:
            r9.g(r7)
        L_0x0092:
            r9.a((defpackage.fb) r1)
            if (r10 != r8) goto L_0x009a
            r9.f(r8)
        L_0x009a:
            if (r11 == r8) goto L_0x009e
            goto L_0x0132
        L_0x009e:
            r9.g(r8)
            goto L_0x0132
        L_0x00a3:
            if (r3 == 0) goto L_0x012f
            int r10 = r0.ad
            if (r10 == r8) goto L_0x00dd
            int r10 = r9.ad
            if (r10 != r4) goto L_0x00dd
            ff r10 = r9.i
            fd r11 = r1.a((java.lang.Object) r10)
            r10.f = r11
            ff r10 = r9.k
            fd r11 = r1.a((java.lang.Object) r10)
            r10.f = r11
            ff r10 = r9.i
            int r10 = r10.c
            int r11 = r20.c()
            ff r12 = r9.k
            int r12 = r12.c
            int r11 = r11 - r12
            ff r12 = r9.i
            fd r12 = r12.f
            r1.a((defpackage.fd) r12, (int) r10)
            ff r12 = r9.k
            fd r12 = r12.f
            r1.a((defpackage.fd) r12, (int) r11)
            r9.b(r10, r11)
            r9.a = r8
        L_0x00dd:
            int r10 = r0.ae
            if (r10 == r8) goto L_0x012f
            int r10 = r9.ae
            if (r10 != r4) goto L_0x012f
            ff r10 = r9.j
            fd r11 = r1.a((java.lang.Object) r10)
            r10.f = r11
            ff r10 = r9.l
            fd r11 = r1.a((java.lang.Object) r10)
            r10.f = r11
            ff r10 = r9.j
            int r10 = r10.c
            int r11 = r20.f()
            ff r12 = r9.l
            int r12 = r12.c
            int r11 = r11 - r12
            ff r12 = r9.j
            fd r12 = r12.f
            r1.a((defpackage.fd) r12, (int) r10)
            ff r12 = r9.l
            fd r12 = r12.f
            r1.a((defpackage.fd) r12, (int) r11)
            int r12 = r9.C
            if (r12 > 0) goto L_0x0118
            int r12 = r9.K
            if (r12 != r5) goto L_0x012a
        L_0x0118:
            ff r12 = r9.m
            fd r13 = r1.a((java.lang.Object) r12)
            r12.f = r13
            ff r12 = r9.m
            fd r12 = r12.f
            int r13 = r9.C
            int r13 = r13 + r10
            r1.a((defpackage.fd) r12, (int) r13)
        L_0x012a:
            r9.c(r10, r11)
            r9.b = r8
        L_0x012f:
            r9.a((defpackage.fb) r1)
        L_0x0132:
            int r6 = r6 + 1
            goto L_0x0074
        L_0x0136:
            int r2 = r0.an
            if (r2 > 0) goto L_0x013b
            goto L_0x013e
        L_0x013b:
            r20.c(r21)
        L_0x013e:
            int r2 = r0.ao
            if (r2 <= 0) goto L_0x0145
            r20.d(r21)
        L_0x0145:
            return r7
        L_0x0146:
            return r6
        L_0x0147:
            r14 = 0
            r15 = 0
            r16 = 0
        L_0x014b:
            if (r14 >= r3) goto L_0x0724
            java.util.ArrayList r5 = r0.al
            java.lang.Object r5 = r5.get(r14)
            fg r5 = (defpackage.fg) r5
            int r6 = r5.a
            r17 = 1056964608(0x3f000000, float:0.5)
            if (r6 != r11) goto L_0x0381
            int r6 = r0.ad
            if (r6 == r8) goto L_0x037f
            int r11 = r5.ad
            if (r11 != r10) goto L_0x0167
            r5.a = r7
            goto L_0x0381
        L_0x0167:
            if (r6 != r8) goto L_0x016a
            goto L_0x019e
        L_0x016a:
            if (r11 != r4) goto L_0x019e
            ff r6 = r5.i
            fd r11 = r1.a((java.lang.Object) r6)
            r6.f = r11
            ff r6 = r5.k
            fd r11 = r1.a((java.lang.Object) r6)
            r6.f = r11
            ff r6 = r5.i
            int r6 = r6.c
            int r11 = r20.c()
            ff r4 = r5.k
            int r4 = r4.c
            int r11 = r11 - r4
            ff r4 = r5.i
            fd r4 = r4.f
            r1.a((defpackage.fd) r4, (int) r6)
            ff r4 = r5.k
            fd r4 = r4.f
            r1.a((defpackage.fd) r4, (int) r11)
            r5.b(r6, r11)
            r5.a = r8
            goto L_0x0381
        L_0x019e:
            ff r4 = r5.i
            ff r6 = r4.b
            if (r6 == 0) goto L_0x020c
            ff r11 = r5.k
            ff r11 = r11.b
            if (r11 == 0) goto L_0x020c
            fg r6 = r6.a
            if (r6 != r0) goto L_0x0208
            fg r6 = r11.a
            if (r6 != r0) goto L_0x0208
            int r4 = r4.a()
            ff r6 = r5.k
            int r6 = r6.a()
            int r11 = r0.ad
            if (r11 != r10) goto L_0x01c6
            int r11 = r20.c()
            int r11 = r11 - r6
            goto L_0x01e3
        L_0x01c6:
            int r11 = r5.c()
            int r18 = r20.c()
            int r18 = r18 - r4
            int r18 = r18 - r6
            int r6 = r18 - r11
            float r6 = (float) r6
            float r11 = r5.H
            float r6 = r6 * r11
            float r6 = r6 + r17
            int r6 = (int) r6
            int r4 = r4 + r6
            int r6 = r5.c()
            int r11 = r4 + r6
        L_0x01e3:
            ff r6 = r5.i
            fd r10 = r1.a((java.lang.Object) r6)
            r6.f = r10
            ff r6 = r5.k
            fd r10 = r1.a((java.lang.Object) r6)
            r6.f = r10
            ff r6 = r5.i
            fd r6 = r6.f
            r1.a((defpackage.fd) r6, (int) r4)
            ff r6 = r5.k
            fd r6 = r6.f
            r1.a((defpackage.fd) r6, (int) r11)
            r5.a = r8
            r5.b(r4, r11)
            goto L_0x0381
        L_0x0208:
            r5.a = r7
            goto L_0x0381
        L_0x020c:
            if (r6 != 0) goto L_0x020f
            goto L_0x0241
        L_0x020f:
            fg r10 = r6.a
            if (r10 != r0) goto L_0x0241
            int r4 = r4.a()
            int r6 = r5.c()
            int r6 = r6 + r4
            ff r10 = r5.i
            fd r11 = r1.a((java.lang.Object) r10)
            r10.f = r11
            ff r10 = r5.k
            fd r11 = r1.a((java.lang.Object) r10)
            r10.f = r11
            ff r10 = r5.i
            fd r10 = r10.f
            r1.a((defpackage.fd) r10, (int) r4)
            ff r10 = r5.k
            fd r10 = r10.f
            r1.a((defpackage.fd) r10, (int) r6)
            r5.a = r8
            r5.b(r4, r6)
            goto L_0x0381
        L_0x0241:
            ff r10 = r5.k
            ff r10 = r10.b
            if (r10 == 0) goto L_0x027f
            fg r11 = r10.a
            if (r11 != r0) goto L_0x027f
            fd r6 = r1.a((java.lang.Object) r4)
            r4.f = r6
            ff r4 = r5.k
            fd r6 = r1.a((java.lang.Object) r4)
            r4.f = r6
            int r4 = r20.c()
            ff r6 = r5.k
            int r6 = r6.a()
            int r4 = r4 - r6
            int r6 = r5.c()
            int r6 = r4 - r6
            ff r10 = r5.i
            fd r10 = r10.f
            r1.a((defpackage.fd) r10, (int) r6)
            ff r10 = r5.k
            fd r10 = r10.f
            r1.a((defpackage.fd) r10, (int) r4)
            r5.a = r8
            r5.b(r6, r4)
            goto L_0x0381
        L_0x027f:
            if (r6 == 0) goto L_0x02be
            fg r11 = r6.a
            int r11 = r11.a
            if (r11 != r8) goto L_0x02be
            fd r6 = r6.f
            fd r10 = r1.a((java.lang.Object) r4)
            r4.f = r10
            ff r4 = r5.k
            fd r10 = r1.a((java.lang.Object) r4)
            r4.f = r10
            float r4 = r6.d
            ff r6 = r5.i
            int r6 = r6.a()
            float r6 = (float) r6
            float r4 = r4 + r6
            float r4 = r4 + r17
            int r4 = (int) r4
            int r6 = r5.c()
            int r6 = r6 + r4
            ff r10 = r5.i
            fd r10 = r10.f
            r1.a((defpackage.fd) r10, (int) r4)
            ff r10 = r5.k
            fd r10 = r10.f
            r1.a((defpackage.fd) r10, (int) r6)
            r5.a = r8
            r5.b(r4, r6)
            goto L_0x0381
        L_0x02be:
            if (r10 == 0) goto L_0x02fe
            fg r11 = r10.a
            int r11 = r11.a
            if (r11 != r8) goto L_0x02fe
            fd r6 = r10.f
            fd r10 = r1.a((java.lang.Object) r4)
            r4.f = r10
            ff r4 = r5.k
            fd r10 = r1.a((java.lang.Object) r4)
            r4.f = r10
            float r4 = r6.d
            ff r6 = r5.k
            int r6 = r6.a()
            float r6 = (float) r6
            float r4 = r4 - r6
            float r4 = r4 + r17
            int r4 = (int) r4
            int r6 = r5.c()
            int r6 = r4 - r6
            ff r10 = r5.i
            fd r10 = r10.f
            r1.a((defpackage.fd) r10, (int) r6)
            ff r10 = r5.k
            fd r10 = r10.f
            r1.a((defpackage.fd) r10, (int) r4)
            r5.a = r8
            r5.b(r6, r4)
            goto L_0x0381
        L_0x02fe:
            if (r6 != 0) goto L_0x0381
            if (r10 != 0) goto L_0x0381
            boolean r6 = r5 instanceof defpackage.fi
            if (r6 == 0) goto L_0x0359
            r6 = r5
            fi r6 = (defpackage.fi) r6
            int r10 = r6.ai
            if (r10 != r7) goto L_0x0381
            fd r10 = r1.a((java.lang.Object) r4)
            r4.f = r10
            ff r4 = r5.k
            fd r10 = r1.a((java.lang.Object) r4)
            r4.f = r10
            int r4 = r6.ag
            r10 = -1
            if (r4 == r10) goto L_0x0322
            float r4 = (float) r4
            goto L_0x0338
        L_0x0322:
            int r4 = r6.ah
            if (r4 != r10) goto L_0x0330
            int r4 = r20.c()
            float r4 = (float) r4
            float r6 = r6.af
            float r4 = r4 * r6
            goto L_0x0338
        L_0x0330:
            int r4 = r20.c()
            int r6 = r6.ah
            int r4 = r4 - r6
            float r4 = (float) r4
        L_0x0338:
            float r4 = r4 + r17
            int r4 = (int) r4
            ff r6 = r5.i
            fd r6 = r6.f
            r1.a((defpackage.fd) r6, (int) r4)
            ff r6 = r5.k
            fd r6 = r6.f
            r1.a((defpackage.fd) r6, (int) r4)
            r5.a = r8
            r5.b = r8
            r5.b(r4, r4)
            int r4 = r20.f()
            r6 = 0
            r5.c(r6, r4)
            goto L_0x0381
        L_0x0359:
            fd r6 = r1.a((java.lang.Object) r4)
            r4.f = r6
            ff r4 = r5.k
            fd r6 = r1.a((java.lang.Object) r4)
            r4.f = r6
            int r4 = r5.w
            int r6 = r5.c()
            ff r10 = r5.i
            fd r10 = r10.f
            r1.a((defpackage.fd) r10, (int) r4)
            ff r10 = r5.k
            fd r10 = r10.f
            int r4 = r4 + r6
            r1.a((defpackage.fd) r10, (int) r4)
            r5.a = r8
            goto L_0x0381
        L_0x037f:
            r5.a = r7
        L_0x0381:
            int r4 = r5.b
            r6 = -1
            if (r4 != r6) goto L_0x0707
            int r4 = r0.ae
            if (r4 == r8) goto L_0x0700
            int r6 = r5.ae
            r10 = 3
            if (r6 != r10) goto L_0x0397
            r5.b = r7
            r4 = 1
            r6 = 0
            r10 = 8
            goto L_0x070b
        L_0x0397:
            if (r4 != r8) goto L_0x039a
            goto L_0x03f0
        L_0x039a:
            r4 = 4
            if (r6 != r4) goto L_0x03f0
            ff r6 = r5.j
            fd r10 = r1.a((java.lang.Object) r6)
            r6.f = r10
            ff r6 = r5.l
            fd r10 = r1.a((java.lang.Object) r6)
            r6.f = r10
            ff r6 = r5.j
            int r6 = r6.c
            int r10 = r20.f()
            ff r11 = r5.l
            int r11 = r11.c
            int r10 = r10 - r11
            ff r11 = r5.j
            fd r11 = r11.f
            r1.a((defpackage.fd) r11, (int) r6)
            ff r11 = r5.l
            fd r11 = r11.f
            r1.a((defpackage.fd) r11, (int) r10)
            int r11 = r5.C
            if (r11 > 0) goto L_0x03d3
            int r11 = r5.K
            r4 = 8
            if (r11 == r4) goto L_0x03d3
            goto L_0x03e5
        L_0x03d3:
            ff r4 = r5.m
            fd r11 = r1.a((java.lang.Object) r4)
            r4.f = r11
            ff r4 = r5.m
            fd r4 = r4.f
            int r11 = r5.C
            int r11 = r11 + r6
            r1.a((defpackage.fd) r4, (int) r11)
        L_0x03e5:
            r5.c(r6, r10)
            r5.b = r8
            r4 = 1
            r6 = 0
            r10 = 8
            goto L_0x070b
        L_0x03f0:
            ff r4 = r5.j
            ff r6 = r4.b
            if (r6 == 0) goto L_0x0483
            ff r10 = r5.l
            ff r10 = r10.b
            if (r10 == 0) goto L_0x0483
            fg r6 = r6.a
            if (r6 != r0) goto L_0x047b
            fg r6 = r10.a
            if (r6 != r0) goto L_0x047b
            int r4 = r4.a()
            ff r6 = r5.l
            int r6 = r6.a()
            int r10 = r0.ae
            r11 = 3
            if (r10 != r11) goto L_0x0419
            int r6 = r5.f()
            int r6 = r6 + r4
            goto L_0x0436
        L_0x0419:
            int r10 = r5.f()
            float r11 = (float) r4
            int r19 = r20.f()
            int r19 = r19 - r4
            int r19 = r19 - r6
            int r4 = r19 - r10
            float r4 = (float) r4
            float r6 = r5.I
            float r4 = r4 * r6
            float r11 = r11 + r4
            float r11 = r11 + r17
            int r4 = (int) r11
            int r6 = r5.f()
            int r6 = r6 + r4
        L_0x0436:
            ff r10 = r5.j
            fd r11 = r1.a((java.lang.Object) r10)
            r10.f = r11
            ff r10 = r5.l
            fd r11 = r1.a((java.lang.Object) r10)
            r10.f = r11
            ff r10 = r5.j
            fd r10 = r10.f
            r1.a((defpackage.fd) r10, (int) r4)
            ff r10 = r5.l
            fd r10 = r10.f
            r1.a((defpackage.fd) r10, (int) r6)
            int r10 = r5.C
            if (r10 > 0) goto L_0x045e
            int r10 = r5.K
            r11 = 8
            if (r10 != r11) goto L_0x0470
        L_0x045e:
            ff r10 = r5.m
            fd r11 = r1.a((java.lang.Object) r10)
            r10.f = r11
            ff r10 = r5.m
            fd r10 = r10.f
            int r11 = r5.C
            int r11 = r11 + r4
            r1.a((defpackage.fd) r10, (int) r11)
        L_0x0470:
            r5.b = r8
            r5.c(r4, r6)
            r4 = 1
            r6 = 0
            r10 = 8
            goto L_0x070b
        L_0x047b:
            r5.b = r7
            r4 = 1
            r6 = 0
            r10 = 8
            goto L_0x070b
        L_0x0483:
            if (r6 != 0) goto L_0x0486
            goto L_0x04d9
        L_0x0486:
            fg r10 = r6.a
            if (r10 != r0) goto L_0x04d9
            int r4 = r4.a()
            int r6 = r5.f()
            int r6 = r6 + r4
            ff r10 = r5.j
            fd r11 = r1.a((java.lang.Object) r10)
            r10.f = r11
            ff r10 = r5.l
            fd r11 = r1.a((java.lang.Object) r10)
            r10.f = r11
            ff r10 = r5.j
            fd r10 = r10.f
            r1.a((defpackage.fd) r10, (int) r4)
            ff r10 = r5.l
            fd r10 = r10.f
            r1.a((defpackage.fd) r10, (int) r6)
            int r10 = r5.C
            if (r10 > 0) goto L_0x04bc
            int r10 = r5.K
            r11 = 8
            if (r10 == r11) goto L_0x04bc
            goto L_0x04ce
        L_0x04bc:
            ff r10 = r5.m
            fd r11 = r1.a((java.lang.Object) r10)
            r10.f = r11
            ff r10 = r5.m
            fd r10 = r10.f
            int r11 = r5.C
            int r11 = r11 + r4
            r1.a((defpackage.fd) r10, (int) r11)
        L_0x04ce:
            r5.b = r8
            r5.c(r4, r6)
            r4 = 1
            r6 = 0
            r10 = 8
            goto L_0x070b
        L_0x04d9:
            ff r10 = r5.l
            ff r10 = r10.b
            if (r10 == 0) goto L_0x0538
            fg r11 = r10.a
            if (r11 != r0) goto L_0x0538
            fd r6 = r1.a((java.lang.Object) r4)
            r4.f = r6
            ff r4 = r5.l
            fd r6 = r1.a((java.lang.Object) r4)
            r4.f = r6
            int r4 = r20.f()
            ff r6 = r5.l
            int r6 = r6.a()
            int r4 = r4 - r6
            int r6 = r5.f()
            int r6 = r4 - r6
            ff r10 = r5.j
            fd r10 = r10.f
            r1.a((defpackage.fd) r10, (int) r6)
            ff r10 = r5.l
            fd r10 = r10.f
            r1.a((defpackage.fd) r10, (int) r4)
            int r10 = r5.C
            if (r10 > 0) goto L_0x051b
            int r10 = r5.K
            r11 = 8
            if (r10 == r11) goto L_0x051b
            goto L_0x052d
        L_0x051b:
            ff r10 = r5.m
            fd r11 = r1.a((java.lang.Object) r10)
            r10.f = r11
            ff r10 = r5.m
            fd r10 = r10.f
            int r11 = r5.C
            int r11 = r11 + r6
            r1.a((defpackage.fd) r10, (int) r11)
        L_0x052d:
            r5.b = r8
            r5.c(r6, r4)
            r4 = 1
            r6 = 0
            r10 = 8
            goto L_0x070b
        L_0x0538:
            if (r6 == 0) goto L_0x0598
            fg r11 = r6.a
            int r11 = r11.b
            if (r11 != r8) goto L_0x0598
            fd r6 = r6.f
            fd r10 = r1.a((java.lang.Object) r4)
            r4.f = r10
            ff r4 = r5.l
            fd r10 = r1.a((java.lang.Object) r4)
            r4.f = r10
            float r4 = r6.d
            ff r6 = r5.j
            int r6 = r6.a()
            float r6 = (float) r6
            float r4 = r4 + r6
            float r4 = r4 + r17
            int r4 = (int) r4
            int r6 = r5.f()
            int r6 = r6 + r4
            ff r10 = r5.j
            fd r10 = r10.f
            r1.a((defpackage.fd) r10, (int) r4)
            ff r10 = r5.l
            fd r10 = r10.f
            r1.a((defpackage.fd) r10, (int) r6)
            int r10 = r5.C
            if (r10 > 0) goto L_0x057b
            int r10 = r5.K
            r11 = 8
            if (r10 == r11) goto L_0x057b
            goto L_0x058d
        L_0x057b:
            ff r10 = r5.m
            fd r11 = r1.a((java.lang.Object) r10)
            r10.f = r11
            ff r10 = r5.m
            fd r10 = r10.f
            int r11 = r5.C
            int r11 = r11 + r4
            r1.a((defpackage.fd) r10, (int) r11)
        L_0x058d:
            r5.b = r8
            r5.c(r4, r6)
            r4 = 1
            r6 = 0
            r10 = 8
            goto L_0x070b
        L_0x0598:
            if (r10 != 0) goto L_0x059b
            goto L_0x05fa
        L_0x059b:
            fg r11 = r10.a
            int r11 = r11.b
            if (r11 != r8) goto L_0x05fa
            fd r6 = r10.f
            fd r10 = r1.a((java.lang.Object) r4)
            r4.f = r10
            ff r4 = r5.l
            fd r10 = r1.a((java.lang.Object) r4)
            r4.f = r10
            float r4 = r6.d
            ff r6 = r5.l
            int r6 = r6.a()
            float r6 = (float) r6
            float r4 = r4 - r6
            float r4 = r4 + r17
            int r4 = (int) r4
            int r6 = r5.f()
            int r6 = r4 - r6
            ff r10 = r5.j
            fd r10 = r10.f
            r1.a((defpackage.fd) r10, (int) r6)
            ff r10 = r5.l
            fd r10 = r10.f
            r1.a((defpackage.fd) r10, (int) r4)
            int r10 = r5.C
            if (r10 > 0) goto L_0x05dd
            int r10 = r5.K
            r11 = 8
            if (r10 == r11) goto L_0x05dd
            goto L_0x05ef
        L_0x05dd:
            ff r10 = r5.m
            fd r11 = r1.a((java.lang.Object) r10)
            r10.f = r11
            ff r10 = r5.m
            fd r10 = r10.f
            int r11 = r5.C
            int r11 = r11 + r6
            r1.a((defpackage.fd) r10, (int) r11)
        L_0x05ef:
            r5.b = r8
            r5.c(r6, r4)
            r4 = 1
            r6 = 0
            r10 = 8
            goto L_0x070b
        L_0x05fa:
            ff r11 = r5.m
            ff r11 = r11.b
            if (r11 == 0) goto L_0x064f
            fg r7 = r11.a
            int r7 = r7.b
            if (r7 != r8) goto L_0x064f
            fd r6 = r11.f
            fd r7 = r1.a((java.lang.Object) r4)
            r4.f = r7
            ff r4 = r5.l
            fd r7 = r1.a((java.lang.Object) r4)
            r4.f = r7
            float r4 = r6.d
            int r6 = r5.C
            float r6 = (float) r6
            float r4 = r4 - r6
            float r4 = r4 + r17
            int r4 = (int) r4
            int r6 = r5.f()
            int r6 = r6 + r4
            ff r7 = r5.j
            fd r7 = r7.f
            r1.a((defpackage.fd) r7, (int) r4)
            ff r7 = r5.l
            fd r7 = r7.f
            r1.a((defpackage.fd) r7, (int) r6)
            ff r7 = r5.m
            fd r10 = r1.a((java.lang.Object) r7)
            r7.f = r10
            ff r7 = r5.m
            fd r7 = r7.f
            int r10 = r5.C
            int r10 = r10 + r4
            r1.a((defpackage.fd) r7, (int) r10)
            r5.b = r8
            r5.c(r4, r6)
            r4 = 1
            r6 = 0
            r10 = 8
            goto L_0x070b
        L_0x064f:
            if (r11 != 0) goto L_0x06fb
            if (r6 != 0) goto L_0x06fb
            if (r10 != 0) goto L_0x06fb
            boolean r6 = r5 instanceof defpackage.fi
            if (r6 == 0) goto L_0x06b4
            r6 = r5
            fi r6 = (defpackage.fi) r6
            int r7 = r6.ai
            if (r7 != 0) goto L_0x06af
            fd r7 = r1.a((java.lang.Object) r4)
            r4.f = r7
            ff r4 = r5.l
            fd r7 = r1.a((java.lang.Object) r4)
            r4.f = r7
            int r4 = r6.ag
            r7 = -1
            if (r4 == r7) goto L_0x0675
            float r4 = (float) r4
            goto L_0x068b
        L_0x0675:
            int r4 = r6.ah
            if (r4 != r7) goto L_0x0683
            int r4 = r20.f()
            float r4 = (float) r4
            float r6 = r6.af
            float r4 = r4 * r6
            goto L_0x068b
        L_0x0683:
            int r4 = r20.f()
            int r6 = r6.ah
            int r4 = r4 - r6
            float r4 = (float) r4
        L_0x068b:
            float r4 = r4 + r17
            int r4 = (int) r4
            ff r6 = r5.j
            fd r6 = r6.f
            r1.a((defpackage.fd) r6, (int) r4)
            ff r6 = r5.l
            fd r6 = r6.f
            r1.a((defpackage.fd) r6, (int) r4)
            r5.b = r8
            r5.a = r8
            r5.c(r4, r4)
            int r4 = r20.c()
            r6 = 0
            r5.b(r6, r4)
            r4 = 1
            r10 = 8
            goto L_0x070b
        L_0x06af:
            r6 = 0
            r4 = 1
            r10 = 8
            goto L_0x070b
        L_0x06b4:
            r6 = 0
            fd r7 = r1.a((java.lang.Object) r4)
            r4.f = r7
            ff r4 = r5.l
            fd r7 = r1.a((java.lang.Object) r4)
            r4.f = r7
            int r4 = r5.x
            int r7 = r5.f()
            ff r10 = r5.j
            fd r10 = r10.f
            r1.a((defpackage.fd) r10, (int) r4)
            ff r10 = r5.l
            fd r10 = r10.f
            int r7 = r7 + r4
            r1.a((defpackage.fd) r10, (int) r7)
            int r7 = r5.C
            if (r7 > 0) goto L_0x06e3
            int r7 = r5.K
            r10 = 8
            if (r7 != r10) goto L_0x06f7
            goto L_0x06e5
        L_0x06e3:
            r10 = 8
        L_0x06e5:
            ff r7 = r5.m
            fd r11 = r1.a((java.lang.Object) r7)
            r7.f = r11
            ff r7 = r5.m
            fd r7 = r7.f
            int r11 = r5.C
            int r4 = r4 + r11
            r1.a((defpackage.fd) r7, (int) r4)
        L_0x06f7:
            r5.b = r8
            r4 = 1
            goto L_0x070b
        L_0x06fb:
            r6 = 0
            r10 = 8
            r4 = 1
            goto L_0x070b
        L_0x0700:
            r6 = 0
            r10 = 8
            r4 = 1
            r5.b = r4
            goto L_0x070b
        L_0x0707:
            r4 = 1
            r6 = 0
            r10 = 8
        L_0x070b:
            int r7 = r5.b
            r11 = -1
            if (r7 != r11) goto L_0x0712
            int r15 = r15 + 1
        L_0x0712:
            int r5 = r5.a
            if (r5 == r11) goto L_0x0717
            goto L_0x071b
        L_0x0717:
            r5 = r16
            int r16 = r5 + 1
        L_0x071b:
            int r14 = r14 + 1
            r4 = 4
            r5 = 8
            r7 = 1
            r10 = 3
            goto L_0x014b
        L_0x0724:
            r5 = r16
            r4 = 1
            r10 = 8
            if (r15 != 0) goto L_0x072f
            if (r5 != 0) goto L_0x072f
        L_0x072d:
            r9 = 1
            goto L_0x0734
        L_0x072f:
            if (r12 != r15) goto L_0x0734
            if (r13 != r5) goto L_0x0734
            goto L_0x072d
        L_0x0734:
            r13 = r5
            r12 = r15
            r4 = 4
            r5 = 8
            r7 = 1
            r10 = 3
            goto L_0x0047
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fh.b(fb):boolean");
    }

    /* access modifiers changed from: package-private */
    public final void a(fg fgVar, int i) {
        int i2 = 0;
        if (i == 0) {
            while (true) {
                ff ffVar = fgVar.i;
                ff ffVar2 = ffVar.b;
                if (ffVar2 == null) {
                    break;
                }
                fg fgVar2 = ffVar2.a;
                ff ffVar3 = fgVar2.k.b;
                if (ffVar3 == null || ffVar3 != ffVar || fgVar2 == fgVar) {
                    break;
                }
                fgVar = fgVar2;
            }
            while (true) {
                int i3 = this.an;
                if (i2 >= i3) {
                    fg[] fgVarArr = this.ar;
                    int length = fgVarArr.length;
                    if (i3 + 1 >= length) {
                        this.ar = (fg[]) Arrays.copyOf(fgVarArr, length + length);
                    }
                    fg[] fgVarArr2 = this.ar;
                    int i4 = this.an;
                    fgVarArr2[i4] = fgVar;
                    this.an = i4 + 1;
                    return;
                } else if (this.ar[i2] != fgVar) {
                    i2++;
                } else {
                    return;
                }
            }
        } else {
            while (true) {
                ff ffVar4 = fgVar.j;
                ff ffVar5 = ffVar4.b;
                if (ffVar5 == null) {
                    break;
                }
                fg fgVar3 = ffVar5.a;
                ff ffVar6 = fgVar3.l.b;
                if (ffVar6 == null || ffVar6 != ffVar4 || fgVar3 == fgVar) {
                    break;
                }
                fgVar = fgVar3;
            }
            while (true) {
                int i5 = this.ao;
                if (i2 >= i5) {
                    fg[] fgVarArr3 = this.aq;
                    int length2 = fgVarArr3.length;
                    if (i5 + 1 >= length2) {
                        this.aq = (fg[]) Arrays.copyOf(fgVarArr3, length2 + length2);
                    }
                    fg[] fgVarArr4 = this.aq;
                    int i6 = this.ao;
                    fgVarArr4[i6] = fgVar;
                    this.ao = i6 + 1;
                    return;
                } else if (this.aq[i2] != fgVar) {
                    i2++;
                } else {
                    return;
                }
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v50, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v51, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v11, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v52, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v53, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v54, resolved type: int} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.fg r11, boolean[] r12) {
        /*
            r10 = this;
            int r0 = r11.ad
            r1 = 0
            r2 = 3
            r3 = 0
            if (r0 != r2) goto L_0x0016
            int r0 = r11.ae
            if (r0 != r2) goto L_0x0016
            float r0 = r11.u
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0012
            goto L_0x0016
        L_0x0012:
            r12[r3] = r3
            return
        L_0x0016:
            int r0 = r11.d()
            int r4 = r11.ad
            if (r4 != r2) goto L_0x002d
            int r4 = r11.ae
            if (r4 == r2) goto L_0x002d
            float r4 = r11.u
            int r1 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r1 > 0) goto L_0x0029
            goto L_0x002d
        L_0x0029:
            r12[r3] = r3
            return
        L_0x002d:
            r1 = 1
            r11.T = r1
            boolean r4 = r11 instanceof defpackage.fi
            if (r4 == 0) goto L_0x004f
            r12 = r11
            fi r12 = (defpackage.fi) r12
            int r2 = r12.ai
            if (r2 != r1) goto L_0x004a
            int r0 = r12.ag
            r1 = -1
            if (r0 != r1) goto L_0x0047
            int r12 = r12.ah
            if (r12 != r1) goto L_0x0046
            r12 = 0
            goto L_0x004c
        L_0x0046:
            goto L_0x004c
        L_0x0047:
            r3 = r0
            r12 = 0
            goto L_0x004c
        L_0x004a:
            r12 = r0
            r3 = r12
        L_0x004c:
            r0 = r12
            goto L_0x0160
        L_0x004f:
            ff r4 = r11.k
            boolean r4 = r4.c()
            if (r4 != 0) goto L_0x0066
            ff r4 = r11.i
            boolean r4 = r4.c()
            if (r4 == 0) goto L_0x0060
            goto L_0x0066
        L_0x0060:
            int r12 = r11.w
            int r3 = r0 + r12
            goto L_0x0160
        L_0x0066:
            ff r4 = r11.k
            ff r5 = r4.b
            if (r5 == 0) goto L_0x0081
            ff r6 = r11.i
            ff r6 = r6.b
            if (r6 == 0) goto L_0x0081
            if (r5 == r6) goto L_0x007e
            fg r7 = r5.a
            fg r6 = r6.a
            if (r7 != r6) goto L_0x0081
            fg r6 = r11.r
            if (r7 == r6) goto L_0x0081
        L_0x007e:
            r12[r3] = r3
            return
        L_0x0081:
            r6 = 0
            if (r5 == 0) goto L_0x009a
            fg r5 = r5.a
            int r4 = r4.a()
            int r4 = r4 + r0
            boolean r7 = r5.b()
            if (r7 == 0) goto L_0x0092
            goto L_0x009c
        L_0x0092:
            boolean r7 = r5.T
            if (r7 != 0) goto L_0x009c
            r10.a((defpackage.fg) r5, (boolean[]) r12)
            goto L_0x009c
        L_0x009a:
            r4 = r0
            r5 = r6
        L_0x009c:
            ff r7 = r11.i
            ff r8 = r7.b
            if (r8 == 0) goto L_0x00b8
            fg r6 = r8.a
            int r7 = r7.a()
            int r0 = r0 + r7
            boolean r7 = r6.b()
            if (r7 == 0) goto L_0x00b0
            goto L_0x00b9
        L_0x00b0:
            boolean r7 = r6.T
            if (r7 != 0) goto L_0x00b8
            r10.a((defpackage.fg) r6, (boolean[]) r12)
            goto L_0x00b9
        L_0x00b8:
        L_0x00b9:
            ff r12 = r11.k
            ff r12 = r12.b
            r7 = 2
            r8 = 4
            if (r12 == 0) goto L_0x010a
            boolean r12 = r5.b()
            if (r12 != 0) goto L_0x010a
            ff r12 = r11.k
            ff r12 = r12.b
            int r12 = r12.g
            if (r12 != r8) goto L_0x00d8
            int r12 = r5.N
            int r9 = r5.d()
            int r12 = r12 - r9
            int r4 = r4 + r12
            goto L_0x00dd
        L_0x00d8:
            if (r12 != r7) goto L_0x00dd
            int r12 = r5.N
            int r4 = r4 + r12
        L_0x00dd:
            boolean r12 = r5.Q
            if (r12 != 0) goto L_0x00f5
            ff r12 = r5.i
            ff r12 = r12.b
            if (r12 == 0) goto L_0x00f3
            ff r12 = r5.k
            ff r12 = r12.b
            if (r12 == 0) goto L_0x00f3
            int r12 = r5.ad
            if (r12 != r2) goto L_0x00f5
            r12 = 0
            goto L_0x00f6
        L_0x00f3:
            r12 = 0
            goto L_0x00f6
        L_0x00f5:
            r12 = 1
        L_0x00f6:
            r11.Q = r12
            if (r12 == 0) goto L_0x010a
            ff r12 = r5.i
            ff r12 = r12.b
            if (r12 != 0) goto L_0x0101
            goto L_0x0105
        L_0x0101:
            fg r12 = r12.a
            if (r12 == r11) goto L_0x010a
        L_0x0105:
            int r12 = r5.N
            int r12 = r4 - r12
            int r4 = r4 + r12
        L_0x010a:
            ff r12 = r11.i
            ff r12 = r12.b
            if (r12 != 0) goto L_0x0111
            goto L_0x015e
        L_0x0111:
            boolean r12 = r6.b()
            if (r12 != 0) goto L_0x015d
            ff r12 = r11.i
            ff r12 = r12.b
            int r12 = r12.g
            if (r12 != r7) goto L_0x0128
            int r12 = r6.M
            int r5 = r6.d()
            int r12 = r12 - r5
            int r0 = r0 + r12
            goto L_0x012d
        L_0x0128:
            if (r12 != r8) goto L_0x012d
            int r12 = r6.M
            int r0 = r0 + r12
        L_0x012d:
            boolean r12 = r6.P
            if (r12 != 0) goto L_0x0143
            ff r12 = r6.i
            ff r12 = r12.b
            if (r12 == 0) goto L_0x0142
            ff r12 = r6.k
            ff r12 = r12.b
            if (r12 == 0) goto L_0x0142
            int r12 = r6.ad
            if (r12 != r2) goto L_0x0143
            goto L_0x0144
        L_0x0142:
            goto L_0x0144
        L_0x0143:
            r3 = 1
        L_0x0144:
            r11.P = r3
            if (r3 == 0) goto L_0x015c
            ff r12 = r6.k
            ff r12 = r12.b
            if (r12 != 0) goto L_0x014f
            goto L_0x0154
        L_0x014f:
            fg r12 = r12.a
            if (r12 != r11) goto L_0x0154
            goto L_0x015c
        L_0x0154:
            int r12 = r6.M
            int r12 = r0 - r12
            int r3 = r0 + r12
            r0 = r4
            goto L_0x0160
        L_0x015c:
            goto L_0x015e
        L_0x015d:
        L_0x015e:
            r3 = r0
            r0 = r4
        L_0x0160:
            int r12 = r11.K
            r1 = 8
            if (r12 != r1) goto L_0x016b
            int r12 = r11.s
            int r3 = r3 - r12
            int r0 = r0 - r12
            goto L_0x016c
        L_0x016b:
        L_0x016c:
            r11.M = r3
            r11.N = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fh.a(fg, boolean[]):void");
    }
}
