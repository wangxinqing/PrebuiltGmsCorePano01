package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* renamed from: ajzr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajzr extends ajzt {
    private static final RectF h = new RectF();
    @Deprecated
    public final float a;
    @Deprecated
    public final float b;
    @Deprecated
    public final float c;
    @Deprecated
    public final float d;
    @Deprecated
    public float e;
    @Deprecated
    public float f;

    public ajzr(float f2, float f3, float f4, float f5) {
        this.a = f2;
        this.b = f3;
        this.c = f4;
        this.d = f5;
    }

    public final void a(Matrix matrix, Path path) {
        Matrix matrix2 = this.g;
        matrix.invert(matrix2);
        path.transform(matrix2);
        h.set(this.a, this.b, this.c, this.d);
        path.arcTo(h, this.e, this.f, false);
        path.transform(matrix);
    }
}
