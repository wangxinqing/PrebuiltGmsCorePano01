package defpackage;

import android.graphics.RectF;

/* renamed from: awa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class awa extends avs {
    private final String c;
    private final boolean d;
    private final oh e = new oh();
    private final oh f = new oh();
    private final RectF g = new RectF();
    private final int h;
    private final awm i;
    private final awm j;
    private final awm k;
    private axb l;
    private final int m;

    public awa(avc avc, ayu ayu, ayf ayf) {
        super(avc, ayu, ayp.a(ayf.l), ayq.a(ayf.m), ayf.g, ayf.c, ayf.f, ayf.h, ayf.i);
        this.c = ayf.a;
        this.m = ayf.k;
        this.d = ayf.j;
        this.h = (int) (avc.a.a() / 32.0f);
        awm a = ayf.b.a();
        this.i = a;
        a.a((awl) this);
        ayu.a(this.i);
        awm a2 = ayf.d.a();
        this.j = a2;
        a2.a((awl) this);
        ayu.a(this.j);
        awm a3 = ayf.e.a();
        this.k = a3;
        a3.a((awl) this);
        ayu.a(this.k);
    }

    private final int[] a(int[] iArr) {
        axb axb = this.l;
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
        int round = Math.round(this.j.c * ((float) this.h));
        int round2 = Math.round(this.k.c * ((float) this.h));
        int round3 = Math.round(this.i.c * ((float) this.h));
        int i2 = round != 0 ? round * 527 : 17;
        if (round2 != 0) {
            i2 = i2 * 31 * round2;
        }
        return round3 != 0 ? i2 * 31 * round3 : i2;
    }

    public final String b() {
        return this.c;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: android.graphics.LinearGradient} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: android.graphics.RadialGradient} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: android.graphics.RadialGradient} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v12, resolved type: android.graphics.LinearGradient} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v19, resolved type: android.graphics.LinearGradient} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v20, resolved type: android.graphics.LinearGradient} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: android.graphics.LinearGradient} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.graphics.Canvas r17, android.graphics.Matrix r18, int r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r18
            boolean r2 = r0.d
            if (r2 != 0) goto L_0x00b2
            android.graphics.RectF r2 = r0.g
            r3 = 0
            r0.a((android.graphics.RectF) r2, (android.graphics.Matrix) r1, (boolean) r3)
            int r2 = r0.m
            r3 = 1
            if (r2 != r3) goto L_0x0058
            int r2 = r16.c()
            long r2 = (long) r2
            oh r4 = r0.e
            java.lang.Object r4 = r4.a((long) r2)
            android.graphics.LinearGradient r4 = (android.graphics.LinearGradient) r4
            if (r4 != 0) goto L_0x00a6
            awm r4 = r0.j
            java.lang.Object r4 = r4.f()
            android.graphics.PointF r4 = (android.graphics.PointF) r4
            awm r5 = r0.k
            java.lang.Object r5 = r5.f()
            android.graphics.PointF r5 = (android.graphics.PointF) r5
            awm r6 = r0.i
            java.lang.Object r6 = r6.f()
            ayd r6 = (defpackage.ayd) r6
            int[] r7 = r6.b
            int[] r13 = r0.a(r7)
            float[] r14 = r6.a
            float r9 = r4.x
            float r10 = r4.y
            float r11 = r5.x
            float r12 = r5.y
            android.graphics.LinearGradient r4 = new android.graphics.LinearGradient
            android.graphics.Shader$TileMode r15 = android.graphics.Shader.TileMode.CLAMP
            r8 = r4
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            oh r5 = r0.e
            r5.b(r2, r4)
            goto L_0x00a6
        L_0x0058:
            int r2 = r16.c()
            long r2 = (long) r2
            oh r4 = r0.f
            java.lang.Object r4 = r4.a((long) r2)
            android.graphics.RadialGradient r4 = (android.graphics.RadialGradient) r4
            if (r4 != 0) goto L_0x00a6
            awm r4 = r0.j
            java.lang.Object r4 = r4.f()
            android.graphics.PointF r4 = (android.graphics.PointF) r4
            awm r5 = r0.k
            java.lang.Object r5 = r5.f()
            android.graphics.PointF r5 = (android.graphics.PointF) r5
            awm r6 = r0.i
            java.lang.Object r6 = r6.f()
            ayd r6 = (defpackage.ayd) r6
            int[] r7 = r6.b
            int[] r12 = r0.a(r7)
            float[] r13 = r6.a
            float r9 = r4.x
            float r10 = r4.y
            float r4 = r5.x
            float r5 = r5.y
            float r4 = r4 - r9
            double r6 = (double) r4
            float r5 = r5 - r10
            double r4 = (double) r5
            double r4 = java.lang.Math.hypot(r6, r4)
            android.graphics.RadialGradient r6 = new android.graphics.RadialGradient
            float r11 = (float) r4
            android.graphics.Shader$TileMode r14 = android.graphics.Shader.TileMode.CLAMP
            r8 = r6
            r8.<init>(r9, r10, r11, r12, r13, r14)
            oh r4 = r0.f
            r4.b(r2, r6)
            r4 = r6
        L_0x00a6:
            r4.setLocalMatrix(r1)
            android.graphics.Paint r2 = r0.b
            r2.setShader(r4)
            super.a((android.graphics.Canvas) r17, (android.graphics.Matrix) r18, (int) r19)
            return
        L_0x00b2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.awa.a(android.graphics.Canvas, android.graphics.Matrix, int):void");
    }

    public final void a(Object obj, bbe bbe) {
        super.a(obj, bbe);
        if (obj == avh.C) {
            axb axb = new axb(bbe);
            this.l = axb;
            axb.a((awl) this);
            this.a.a((awm) this.l);
        }
    }
}
