package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.List;

/* renamed from: awh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class awh implements avw, awe, awb, awl, awc {
    private final Matrix a = new Matrix();
    private final Path b = new Path();
    private final avc c;
    private final ayu d;
    private final String e;
    private final boolean f;
    private final awm g;
    private final awm h;
    private final axa i;
    private avv j;

    public awh(avc avc, ayu ayu, ayk ayk) {
        this.c = avc;
        this.d = ayu;
        this.e = ayk.a;
        this.f = ayk.e;
        awm a2 = ayk.b.a();
        this.g = a2;
        ayu.a(a2);
        this.g.a((awl) this);
        awm a3 = ayk.c.a();
        this.h = a3;
        ayu.a(a3);
        this.h.a((awl) this);
        axa a4 = ayk.d.a();
        this.i = a4;
        a4.a(ayu);
        this.i.a((awl) this);
    }

    public final void a() {
        this.c.invalidateSelf();
    }

    public final String b() {
        return this.e;
    }

    public final Path e() {
        Path e2 = this.j.e();
        this.b.reset();
        float floatValue = ((Float) this.g.f()).floatValue();
        float floatValue2 = ((Float) this.h.f()).floatValue();
        for (int i2 = ((int) floatValue) - 1; i2 >= 0; i2--) {
            this.a.set(this.i.a(((float) i2) + floatValue2));
            this.b.addPath(e2, this.a);
        }
        return this.b;
    }

    public final void a(Canvas canvas, Matrix matrix, int i2) {
        float floatValue = ((Float) this.g.f()).floatValue();
        float floatValue2 = ((Float) this.h.f()).floatValue();
        float floatValue3 = ((Float) this.i.h.f()).floatValue() / 100.0f;
        float floatValue4 = ((Float) this.i.i.f()).floatValue() / 100.0f;
        for (int i3 = ((int) floatValue) - 1; i3 >= 0; i3--) {
            this.a.set(matrix);
            float f2 = (float) i3;
            this.a.preConcat(this.i.a(f2 + floatValue2));
            this.j.a(canvas, this.a, (int) (((float) i2) * bba.a(floatValue3, floatValue4, f2 / floatValue)));
        }
    }

    public final void a(RectF rectF, Matrix matrix, boolean z) {
        this.j.a(rectF, matrix, z);
    }

    public final void a(axi axi, int i2, List list, axi axi2) {
        bba.a(axi, i2, list, axi2, this);
    }

    public final void a(Object obj, bbe bbe) {
        awm awm;
        if (!this.i.a(obj, bbe)) {
            if (obj == avh.q) {
                awm = this.g;
            } else if (obj == avh.r) {
                awm = this.h;
            } else {
                return;
            }
            awm.d = bbe;
        }
    }

    public final void a(List list, List list2) {
        this.j.a(list, list2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:2:0x0004 A[LOOP:0: B:2:0x0004->B:5:0x000e, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.util.ListIterator r9) {
        /*
            r8 = this;
            avv r0 = r8.j
            if (r0 != 0) goto L_0x003a
        L_0x0004:
            boolean r0 = r9.hasPrevious()
            if (r0 == 0) goto L_0x0010
            java.lang.Object r0 = r9.previous()
            if (r0 != r8) goto L_0x0004
        L_0x0010:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
        L_0x0015:
            boolean r0 = r9.hasPrevious()
            if (r0 == 0) goto L_0x0026
            java.lang.Object r0 = r9.previous()
            r6.add(r0)
            r9.remove()
            goto L_0x0015
        L_0x0026:
            java.util.Collections.reverse(r6)
            avv r9 = new avv
            avc r2 = r8.c
            ayu r3 = r8.d
            boolean r5 = r8.f
            r7 = 0
            java.lang.String r4 = "Repeater"
            r1 = r9
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r8.j = r9
        L_0x003a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.awh.a(java.util.ListIterator):void");
    }
}
