package defpackage;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;

/* renamed from: aza  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aza extends ayu {
    private final RectF g = new RectF();
    private final Paint h = new avq();
    private final float[] i = new float[8];
    private final Path j = new Path();
    private final ayx k;
    private awm l;

    public aza(avc avc, ayx ayx) {
        super(avc, ayx);
        this.k = ayx;
        this.h.setAlpha(0);
        this.h.setStyle(Paint.Style.FILL);
        this.h.setColor(ayx.k);
    }

    public final void a(RectF rectF, Matrix matrix, boolean z) {
        super.a(rectF, matrix, z);
        RectF rectF2 = this.g;
        ayx ayx = this.k;
        rectF2.set(0.0f, 0.0f, (float) ayx.i, (float) ayx.j);
        this.a.mapRect(this.g);
        rectF.set(this.g);
    }

    public final void b(Canvas canvas, Matrix matrix, int i2) {
        int i3;
        int alpha = Color.alpha(this.k.k);
        if (alpha != 0) {
            awm awm = this.f.e;
            if (awm != null) {
                i3 = ((Integer) awm.f()).intValue();
            } else {
                i3 = 100;
            }
            int i4 = (int) ((((float) i2) / 255.0f) * (((((float) alpha) / 255.0f) * ((float) i3)) / 100.0f) * 255.0f);
            this.h.setAlpha(i4);
            awm awm2 = this.l;
            if (awm2 != null) {
                this.h.setColorFilter((ColorFilter) awm2.f());
            }
            if (i4 > 0) {
                float[] fArr = this.i;
                fArr[0] = 0.0f;
                fArr[1] = 0.0f;
                ayx ayx = this.k;
                float f = (float) ayx.i;
                fArr[2] = f;
                fArr[3] = 0.0f;
                fArr[4] = f;
                float f2 = (float) ayx.j;
                fArr[5] = f2;
                fArr[6] = 0.0f;
                fArr[7] = f2;
                matrix.mapPoints(fArr);
                this.j.reset();
                Path path = this.j;
                float[] fArr2 = this.i;
                path.moveTo(fArr2[0], fArr2[1]);
                Path path2 = this.j;
                float[] fArr3 = this.i;
                path2.lineTo(fArr3[2], fArr3[3]);
                Path path3 = this.j;
                float[] fArr4 = this.i;
                path3.lineTo(fArr4[4], fArr4[5]);
                Path path4 = this.j;
                float[] fArr5 = this.i;
                path4.lineTo(fArr5[6], fArr5[7]);
                Path path5 = this.j;
                float[] fArr6 = this.i;
                path5.lineTo(fArr6[0], fArr6[1]);
                this.j.close();
                canvas.drawPath(this.j, this.h);
            }
        }
    }

    public final void a(Object obj, bbe bbe) {
        super.a(obj, bbe);
        if (obj == avh.B) {
            this.l = new axb(bbe);
        }
    }
}
