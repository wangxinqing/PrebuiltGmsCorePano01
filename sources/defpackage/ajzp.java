package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;

/* renamed from: ajzp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ajzp extends ajzu {
    private final ajzr a;

    public ajzp(ajzr ajzr) {
        this.a = ajzr;
    }

    public final void a(Matrix matrix, ajyv ajyv, int i, Canvas canvas) {
        ajyv ajyv2 = ajyv;
        int i2 = i;
        Canvas canvas2 = canvas;
        ajzr ajzr = this.a;
        float f = ajzr.e;
        float f2 = ajzr.f;
        RectF rectF = new RectF(ajzr.a, ajzr.b, ajzr.c, ajzr.d);
        Path path = ajyv2.k;
        if (f2 < 0.0f) {
            ajyv.i[0] = 0;
            ajyv.i[1] = ajyv2.f;
            ajyv.i[2] = ajyv2.e;
            ajyv.i[3] = ajyv2.d;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f, f2);
            path.close();
            float f3 = (float) (-i2);
            rectF.inset(f3, f3);
            ajyv.i[0] = 0;
            ajyv.i[1] = ajyv2.d;
            ajyv.i[2] = ajyv2.e;
            ajyv.i[3] = ajyv2.f;
        }
        float width = 1.0f - (((float) i2) / (rectF.width() / 2.0f));
        ajyv.j[1] = width;
        ajyv.j[2] = width + ((1.0f - width) / 2.0f);
        ajyv2.b.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, ajyv.i, ajyv.j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas2.concat(matrix);
        if (f2 >= 0.0f) {
            canvas2.clipPath(path, Region.Op.DIFFERENCE);
            canvas2.drawPath(path, ajyv2.l);
        }
        canvas.drawArc(rectF, f, f2, true, ajyv2.b);
        canvas.restore();
    }
}
