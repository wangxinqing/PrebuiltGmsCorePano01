package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;

/* renamed from: ajzs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajzs extends ajzt {
    public float a;
    public float b;

    public final void a(Matrix matrix, Path path) {
        Matrix matrix2 = this.g;
        matrix.invert(matrix2);
        path.transform(matrix2);
        path.lineTo(this.a, this.b);
        path.transform(matrix);
    }
}
