package defpackage;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* renamed from: avz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class avz implements avw, awl, awc {
    private final String a;
    private final boolean b;
    private final ayu c;
    private final oh d = new oh();
    private final oh e = new oh();
    private final Path f = new Path();
    private final Paint g = new avq(1);
    private final RectF h = new RectF();
    private final List i = new ArrayList();
    private final awm j;
    private final awm k;
    private final awm l;
    private final awm m;
    private awm n;
    private axb o;
    private final avc p;
    private final int q;
    private final int r;

    public avz(avc avc, ayu ayu, aye aye) {
        this.c = ayu;
        this.a = aye.f;
        this.b = aye.g;
        this.p = avc;
        this.r = aye.h;
        this.f.setFillType(aye.a);
        this.q = (int) (avc.a.a() / 32.0f);
        awm a2 = aye.b.a();
        this.j = a2;
        a2.a((awl) this);
        ayu.a(this.j);
        awm a3 = aye.c.a();
        this.k = a3;
        a3.a((awl) this);
        ayu.a(this.k);
        awm a4 = aye.d.a();
        this.l = a4;
        a4.a((awl) this);
        ayu.a(this.l);
        awm a5 = aye.e.a();
        this.m = a5;
        a5.a((awl) this);
        ayu.a(this.m);
    }

    private final int[] a(int[] iArr) {
        axb axb = this.o;
        if (axb != null) {
            Integer[] numArr = (Integer[]) axb.f();
            int length = numArr.length;
            int i2 = 0;
            if (iArr.length != length) {
                iArr = new int[length];
                while (i2 < numArr.length) {
                    iArr[i2] = numArr[i2].intValue();
                    i2++;
                }
            } else {
                while (i2 < iArr.length) {
                    iArr[i2] = numArr[i2].intValue();
                    i2++;
                }
            }
        }
        return iArr;
    }

    private final int c() {
        int round = Math.round(this.l.c * ((float) this.q));
        int round2 = Math.round(this.m.c * ((float) this.q));
        int round3 = Math.round(this.j.c * ((float) this.q));
        int i2 = round != 0 ? round * 527 : 17;
        if (round2 != 0) {
            i2 = i2 * 31 * round2;
        }
        return round3 != 0 ? i2 * 31 * round3 : i2;
    }

    public final String b() {
        return this.a;
    }

    public final void a() {
        this.p.invalidateSelf();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: android.graphics.RadialGradient} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: android.graphics.LinearGradient} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v27, resolved type: android.graphics.RadialGradient} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v29, resolved type: android.graphics.RadialGradient} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: android.graphics.RadialGradient} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v30, resolved type: android.graphics.RadialGradient} */
    /* JADX WARNING: type inference failed for: r4v22, types: [android.graphics.LinearGradient] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.graphics.Canvas r17, android.graphics.Matrix r18, int r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r18
            boolean r2 = r0.b
            if (r2 != 0) goto L_0x011f
            android.graphics.Path r2 = r0.f
            r2.reset()
            r2 = 0
            r3 = 0
        L_0x000f:
            java.util.List r4 = r0.i
            int r4 = r4.size()
            if (r3 >= r4) goto L_0x002b
            android.graphics.Path r4 = r0.f
            java.util.List r5 = r0.i
            java.lang.Object r5 = r5.get(r3)
            awe r5 = (defpackage.awe) r5
            android.graphics.Path r5 = r5.e()
            r4.addPath(r5, r1)
            int r3 = r3 + 1
            goto L_0x000f
        L_0x002b:
            android.graphics.Path r3 = r0.f
            android.graphics.RectF r4 = r0.h
            r3.computeBounds(r4, r2)
            int r2 = r0.r
            r3 = 1
            if (r2 != r3) goto L_0x007d
            int r2 = r16.c()
            long r2 = (long) r2
            oh r4 = r0.d
            java.lang.Object r4 = r4.a((long) r2)
            android.graphics.LinearGradient r4 = (android.graphics.LinearGradient) r4
            if (r4 != 0) goto L_0x00d7
            awm r4 = r0.l
            java.lang.Object r4 = r4.f()
            android.graphics.PointF r4 = (android.graphics.PointF) r4
            awm r5 = r0.m
            java.lang.Object r5 = r5.f()
            android.graphics.PointF r5 = (android.graphics.PointF) r5
            awm r6 = r0.j
            java.lang.Object r6 = r6.f()
            ayd r6 = (defpackage.ayd) r6
            int[] r7 = r6.b
            int[] r13 = r0.a(r7)
            float[] r14 = r6.a
            android.graphics.LinearGradient r6 = new android.graphics.LinearGradient
            float r9 = r4.x
            float r10 = r4.y
            float r11 = r5.x
            float r12 = r5.y
            android.graphics.Shader$TileMode r15 = android.graphics.Shader.TileMode.CLAMP
            r8 = r6
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            oh r4 = r0.d
            r4.b(r2, r6)
            r4 = r6
            goto L_0x00d7
        L_0x007d:
            int r2 = r16.c()
            long r2 = (long) r2
            oh r4 = r0.e
            java.lang.Object r4 = r4.a((long) r2)
            android.graphics.RadialGradient r4 = (android.graphics.RadialGradient) r4
            if (r4 != 0) goto L_0x00d7
            awm r4 = r0.l
            java.lang.Object r4 = r4.f()
            android.graphics.PointF r4 = (android.graphics.PointF) r4
            awm r5 = r0.m
            java.lang.Object r5 = r5.f()
            android.graphics.PointF r5 = (android.graphics.PointF) r5
            awm r6 = r0.j
            java.lang.Object r6 = r6.f()
            ayd r6 = (defpackage.ayd) r6
            int[] r7 = r6.b
            int[] r12 = r0.a(r7)
            float[] r13 = r6.a
            float r9 = r4.x
            float r10 = r4.y
            float r4 = r5.x
            float r4 = r4 - r9
            double r6 = (double) r4
            float r4 = r5.y
            float r4 = r4 - r10
            double r4 = (double) r4
            double r4 = java.lang.Math.hypot(r6, r4)
            float r4 = (float) r4
            r5 = 0
            int r5 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r5 <= 0) goto L_0x00c4
            r11 = r4
            goto L_0x00ca
        L_0x00c4:
            r4 = 981668463(0x3a83126f, float:0.001)
            r11 = 981668463(0x3a83126f, float:0.001)
        L_0x00ca:
            android.graphics.RadialGradient r4 = new android.graphics.RadialGradient
            android.graphics.Shader$TileMode r14 = android.graphics.Shader.TileMode.CLAMP
            r8 = r4
            r8.<init>(r9, r10, r11, r12, r13, r14)
            oh r5 = r0.e
            r5.b(r2, r4)
        L_0x00d7:
            r4.setLocalMatrix(r1)
            android.graphics.Paint r1 = r0.g
            r1.setShader(r4)
            awm r1 = r0.n
            if (r1 == 0) goto L_0x00ee
            android.graphics.Paint r2 = r0.g
            java.lang.Object r1 = r1.f()
            android.graphics.ColorFilter r1 = (android.graphics.ColorFilter) r1
            r2.setColorFilter(r1)
        L_0x00ee:
            awm r1 = r0.k
            java.lang.Object r1 = r1.f()
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            android.graphics.Paint r2 = r0.g
            r3 = r19
            float r3 = (float) r3
            r4 = 1132396544(0x437f0000, float:255.0)
            float r3 = r3 / r4
            float r1 = (float) r1
            float r3 = r3 * r1
            r1 = 1120403456(0x42c80000, float:100.0)
            float r3 = r3 / r1
            float r3 = r3 * r4
            int r1 = (int) r3
            int r1 = defpackage.bba.a(r1)
            r2.setAlpha(r1)
            android.graphics.Path r1 = r0.f
            android.graphics.Paint r2 = r0.g
            r3 = r17
            r3.drawPath(r1, r2)
            defpackage.auf.a()
            return
        L_0x011f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.avz.a(android.graphics.Canvas, android.graphics.Matrix, int):void");
    }

    public final void a(RectF rectF, Matrix matrix, boolean z) {
        this.f.reset();
        for (int i2 = 0; i2 < this.i.size(); i2++) {
            this.f.addPath(((awe) this.i.get(i2)).e(), matrix);
        }
        this.f.computeBounds(rectF, false);
        rectF.set(rectF.left - 4.0f, rectF.top - 4.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    public final void a(axi axi, int i2, List list, axi axi2) {
        bba.a(axi, i2, list, axi2, this);
    }

    public final void a(Object obj, bbe bbe) {
        if (obj == avh.d) {
            this.k.d = bbe;
        } else if (obj == avh.B) {
            axb axb = new axb(bbe);
            this.n = axb;
            axb.a((awl) this);
            this.c.a(this.n);
        } else if (obj == avh.C) {
            axb axb2 = new axb(bbe);
            this.o = axb2;
            axb2.a((awl) this);
            this.c.a((awm) this.o);
        }
    }

    public final void a(List list, List list2) {
        for (int i2 = 0; i2 < list2.size(); i2++) {
            avu avu = (avu) list2.get(i2);
            if (avu instanceof awe) {
                this.i.add((awe) avu);
            }
        }
    }
}
