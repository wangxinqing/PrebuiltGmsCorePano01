package defpackage;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.Shader;

/* renamed from: ajzq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ajzq extends ajzu {
    private final ajzs a;
    private final float b;
    private final float d;

    public ajzq(ajzs ajzs, float f, float f2) {
        this.a = ajzs;
        this.b = f;
        this.d = f2;
    }

    /* access modifiers changed from: package-private */
    public final float a() {
        ajzs ajzs = this.a;
        return (float) Math.toDegrees(Math.atan((double) ((ajzs.b - this.d) / (ajzs.a - this.b))));
    }

    public final void a(Matrix matrix, ajyv ajyv, int i, Canvas canvas) {
        ajyv ajyv2 = ajyv;
        int i2 = i;
        Canvas canvas2 = canvas;
        ajzs ajzs = this.a;
        RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot((double) (ajzs.b - this.d), (double) (ajzs.a - this.b)), 0.0f);
        Matrix matrix2 = new Matrix(matrix);
        matrix2.preTranslate(this.b, this.d);
        matrix2.preRotate(a());
        rectF.bottom += (float) i2;
        rectF.offset(0.0f, (float) (-i2));
        ajyv.g[0] = ajyv2.f;
        ajyv.g[1] = ajyv2.e;
        ajyv.g[2] = ajyv2.d;
        ajyv2.c.setShader(new LinearGradient(rectF.left, rectF.top, rectF.left, rectF.bottom, ajyv.g, ajyv.h, Shader.TileMode.CLAMP));
        canvas.save();
        canvas2.concat(matrix2);
        canvas2.drawRect(rectF, ajyv2.c);
        canvas.restore();
    }
}
