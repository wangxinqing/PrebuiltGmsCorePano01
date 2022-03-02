package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;

/* renamed from: ajzn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajzn {
    private final ajzv[] a = new ajzv[4];
    private final Matrix[] b = new Matrix[4];
    private final Matrix[] c = new Matrix[4];
    private final PointF d = new PointF();
    private final Path e = new Path();
    private final Path f = new Path();
    private final ajzv g = new ajzv();
    private final float[] h = new float[2];
    private final float[] i = new float[2];
    private boolean j = true;

    public ajzn() {
        for (int i2 = 0; i2 < 4; i2++) {
            this.a[i2] = new ajzv();
            this.b[i2] = new Matrix();
            this.c[i2] = new Matrix();
        }
    }

    private static final float a(int i2) {
        return (float) ((i2 + 1) * 90);
    }

    private final boolean a(Path path, int i2) {
        Path path2 = new Path();
        this.a[i2].a(this.b[i2], path2);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (!rectF.isEmpty()) {
            return true;
        }
        if (rectF.width() <= 1.0f || rectF.height() <= 1.0f) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:51:0x021c  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0237 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.ajzl r11, float r12, android.graphics.RectF r13, defpackage.ajzc r14, android.graphics.Path r15) {
        /*
            r10 = this;
            r15.rewind()
            android.graphics.Path r0 = r10.e
            r0.rewind()
            android.graphics.Path r0 = r10.f
            r0.rewind()
            android.graphics.Path r0 = r10.f
            android.graphics.Path$Direction r1 = android.graphics.Path.Direction.CW
            r0.addRect(r13, r1)
            ajzm r0 = new ajzm
            r2 = r0
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            r7 = r15
            r2.<init>(r3, r4, r5, r6, r7)
            r11 = 0
            r12 = 0
        L_0x0021:
            r13 = 4
            r14 = 3
            r1 = 1
            if (r12 >= r13) goto L_0x00dc
            ajzl r13 = r0.a
            r2 = 2
            if (r12 == r1) goto L_0x0038
            if (r12 == r2) goto L_0x0035
            if (r12 == r14) goto L_0x0032
            ajyy r3 = r13.g
            goto L_0x003a
        L_0x0032:
            ajyy r3 = r13.f
            goto L_0x003a
        L_0x0035:
            ajyy r3 = r13.i
            goto L_0x003a
        L_0x0038:
            ajyy r3 = r13.h
        L_0x003a:
            if (r12 == r1) goto L_0x0049
            if (r12 == r2) goto L_0x0046
            if (r12 == r14) goto L_0x0043
            ajyz r13 = r13.c
            goto L_0x004b
        L_0x0043:
            ajyz r13 = r13.b
            goto L_0x004b
        L_0x0046:
            ajyz r13 = r13.e
            goto L_0x004b
        L_0x0049:
            ajyz r13 = r13.d
        L_0x004b:
            ajzv[] r4 = r10.a
            r4 = r4[r12]
            float r5 = r0.d
            android.graphics.RectF r6 = r0.c
            float r3 = r3.a(r6)
            r13.a(r4, r5, r3)
            float r13 = a(r12)
            android.graphics.Matrix[] r3 = r10.b
            r3 = r3[r12]
            r3.reset()
            android.graphics.RectF r3 = r0.c
            android.graphics.PointF r4 = r10.d
            if (r12 == r1) goto L_0x0087
            if (r12 == r2) goto L_0x007f
            if (r12 == r14) goto L_0x0077
            float r14 = r3.right
            float r2 = r3.top
            r4.set(r14, r2)
            goto L_0x008e
        L_0x0077:
            float r14 = r3.left
            float r2 = r3.top
            r4.set(r14, r2)
            goto L_0x008e
        L_0x007f:
            float r14 = r3.left
            float r2 = r3.bottom
            r4.set(r14, r2)
            goto L_0x008e
        L_0x0087:
            float r14 = r3.right
            float r2 = r3.bottom
            r4.set(r14, r2)
        L_0x008e:
            android.graphics.Matrix[] r14 = r10.b
            r14 = r14[r12]
            android.graphics.PointF r2 = r10.d
            float r2 = r2.x
            android.graphics.PointF r3 = r10.d
            float r3 = r3.y
            r14.setTranslate(r2, r3)
            android.graphics.Matrix[] r14 = r10.b
            r14 = r14[r12]
            r14.preRotate(r13)
            float[] r13 = r10.h
            ajzv[] r14 = r10.a
            r14 = r14[r12]
            float r2 = r14.b
            r13[r11] = r2
            float r14 = r14.c
            r13[r1] = r14
            android.graphics.Matrix[] r14 = r10.b
            r14 = r14[r12]
            r14.mapPoints(r13)
            android.graphics.Matrix[] r13 = r10.c
            r13 = r13[r12]
            r13.reset()
            android.graphics.Matrix[] r13 = r10.c
            r13 = r13[r12]
            float[] r14 = r10.h
            r2 = r14[r11]
            r14 = r14[r1]
            r13.setTranslate(r2, r14)
            android.graphics.Matrix[] r13 = r10.c
            r13 = r13[r12]
            float r14 = a(r12)
            r13.preRotate(r14)
            int r12 = r12 + 1
            goto L_0x0021
        L_0x00dc:
            r12 = 0
        L_0x00dd:
            if (r12 >= r13) goto L_0x023a
            float[] r2 = r10.h
            ajzv[] r3 = r10.a
            r3 = r3[r12]
            r4 = 0
            r2[r11] = r4
            float r3 = r3.a
            r2[r1] = r3
            android.graphics.Matrix[] r3 = r10.b
            r3 = r3[r12]
            r3.mapPoints(r2)
            if (r12 != 0) goto L_0x0101
            android.graphics.Path r2 = r0.b
            float[] r3 = r10.h
            r5 = r3[r11]
            r3 = r3[r1]
            r2.moveTo(r5, r3)
            goto L_0x010c
        L_0x0101:
            android.graphics.Path r2 = r0.b
            float[] r3 = r10.h
            r5 = r3[r11]
            r3 = r3[r1]
            r2.lineTo(r5, r3)
        L_0x010c:
            ajzv[] r2 = r10.a
            r2 = r2[r12]
            android.graphics.Matrix[] r3 = r10.b
            r3 = r3[r12]
            android.graphics.Path r5 = r0.b
            r2.a((android.graphics.Matrix) r3, (android.graphics.Path) r5)
            ajzc r2 = r0.e
            if (r2 == 0) goto L_0x0136
            ajzv[] r3 = r10.a
            r3 = r3[r12]
            android.graphics.Matrix[] r5 = r10.b
            r5 = r5[r12]
            ajzf r6 = r2.a
            java.util.BitSet r6 = r6.v
            r6.set(r12, r11)
            ajzf r2 = r2.a
            ajzu[] r2 = r2.t
            ajzu r3 = r3.a((android.graphics.Matrix) r5)
            r2[r12] = r3
        L_0x0136:
            int r2 = r12 + 1
            r3 = r2 & 3
            float[] r5 = r10.h
            ajzv[] r6 = r10.a
            r6 = r6[r12]
            float r7 = r6.b
            r5[r11] = r7
            float r6 = r6.c
            r5[r1] = r6
            android.graphics.Matrix[] r6 = r10.b
            r6 = r6[r12]
            r6.mapPoints(r5)
            float[] r5 = r10.i
            ajzv[] r6 = r10.a
            r6 = r6[r3]
            r5[r11] = r4
            float r6 = r6.a
            r5[r1] = r6
            android.graphics.Matrix[] r6 = r10.b
            r6 = r6[r3]
            r6.mapPoints(r5)
            float[] r5 = r10.h
            r6 = r5[r11]
            float[] r7 = r10.i
            r8 = r7[r11]
            float r6 = r6 - r8
            double r8 = (double) r6
            r5 = r5[r1]
            r6 = r7[r1]
            float r5 = r5 - r6
            double r5 = (double) r5
            double r5 = java.lang.Math.hypot(r8, r5)
            float r5 = (float) r5
            r6 = -1165815185(0xffffffffba83126f, float:-0.001)
            float r5 = r5 + r6
            float r5 = java.lang.Math.max(r5, r4)
            android.graphics.RectF r6 = r0.c
            float[] r7 = r10.h
            ajzv[] r8 = r10.a
            r8 = r8[r12]
            float r9 = r8.b
            r7[r11] = r9
            float r8 = r8.c
            r7[r1] = r8
            android.graphics.Matrix[] r8 = r10.b
            r8 = r8[r12]
            r8.mapPoints(r7)
            if (r12 == r1) goto L_0x01a7
            if (r12 == r14) goto L_0x01a7
            float r6 = r6.centerY()
            float[] r7 = r10.h
            r7 = r7[r1]
            float r6 = r6 - r7
            java.lang.Math.abs(r6)
            goto L_0x01b3
        L_0x01a7:
            float r6 = r6.centerX()
            float[] r7 = r10.h
            r7 = r7[r11]
            float r6 = r6 - r7
            java.lang.Math.abs(r6)
        L_0x01b3:
            ajzv r6 = r10.g
            r6.a()
            ajzv r6 = r10.g
            r6.a((float) r5, (float) r4)
            android.graphics.Path r5 = new android.graphics.Path
            r5.<init>()
            ajzv r6 = r10.g
            android.graphics.Matrix[] r7 = r10.c
            r7 = r7[r12]
            r6.a((android.graphics.Matrix) r7, (android.graphics.Path) r5)
            boolean r6 = r10.j
            if (r6 == 0) goto L_0x020d
            int r6 = android.os.Build.VERSION.SDK_INT
            boolean r6 = r10.a(r5, r12)
            if (r6 != 0) goto L_0x01de
            boolean r3 = r10.a(r5, r3)
            if (r3 != 0) goto L_0x01de
            goto L_0x020d
        L_0x01de:
            android.graphics.Path r3 = r10.f
            android.graphics.Path$Op r6 = android.graphics.Path.Op.DIFFERENCE
            r5.op(r5, r3, r6)
            float[] r3 = r10.h
            r3[r11] = r4
            ajzv r4 = r10.g
            float r4 = r4.a
            r3[r1] = r4
            android.graphics.Matrix[] r4 = r10.c
            r4 = r4[r12]
            r4.mapPoints(r3)
            android.graphics.Path r3 = r10.e
            float[] r4 = r10.h
            r5 = r4[r11]
            r4 = r4[r1]
            r3.moveTo(r5, r4)
            ajzv r3 = r10.g
            android.graphics.Matrix[] r4 = r10.c
            r4 = r4[r12]
            android.graphics.Path r5 = r10.e
            r3.a((android.graphics.Matrix) r4, (android.graphics.Path) r5)
            goto L_0x0218
        L_0x020d:
            ajzv r3 = r10.g
            android.graphics.Matrix[] r4 = r10.c
            r4 = r4[r12]
            android.graphics.Path r5 = r0.b
            r3.a((android.graphics.Matrix) r4, (android.graphics.Path) r5)
        L_0x0218:
            ajzc r3 = r0.e
            if (r3 == 0) goto L_0x0236
            ajzv r4 = r10.g
            android.graphics.Matrix[] r5 = r10.c
            r5 = r5[r12]
            ajzf r6 = r3.a
            java.util.BitSet r6 = r6.v
            int r7 = r12 + 4
            r6.set(r7, r11)
            ajzf r3 = r3.a
            ajzu[] r3 = r3.u
            ajzu r4 = r4.a((android.graphics.Matrix) r5)
            r3[r12] = r4
            goto L_0x0237
        L_0x0236:
        L_0x0237:
            r12 = r2
            goto L_0x00dd
        L_0x023a:
            r15.close()
            android.graphics.Path r11 = r10.e
            r11.close()
            int r11 = android.os.Build.VERSION.SDK_INT
            android.graphics.Path r11 = r10.e
            boolean r11 = r11.isEmpty()
            if (r11 != 0) goto L_0x0253
            android.graphics.Path r11 = r10.e
            android.graphics.Path$Op r12 = android.graphics.Path.Op.UNION
            r15.op(r11, r12)
        L_0x0253:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajzn.a(ajzl, float, android.graphics.RectF, ajzc, android.graphics.Path):void");
    }

    public final void a(ajzl ajzl, float f2, RectF rectF, Path path) {
        a(ajzl, f2, rectF, (ajzc) null, path);
    }
}
