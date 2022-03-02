package defpackage;

import android.graphics.Matrix;

/* renamed from: ajws  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ajws extends ajru {
    final /* synthetic */ ajxa a;

    public ajws(ajxa ajxa) {
        this.a = ajxa;
    }

    public final Matrix a(float f, Matrix matrix, Matrix matrix2) {
        this.a.s = f;
        return super.evaluate(f, matrix, matrix2);
    }

    public final /* bridge */ /* synthetic */ Object evaluate(float f, Object obj, Object obj2) {
        return evaluate(f, (Matrix) obj, (Matrix) obj2);
    }
}
