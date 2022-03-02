package defpackage;

import android.graphics.Matrix;
import android.view.View;

/* renamed from: ash  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ash extends asg {
    public final float a(View view) {
        return view.getTransitionAlpha();
    }

    public final void b(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }

    public final void a(View view, float f) {
        view.setTransitionAlpha(f);
    }

    public final void a(View view, int i) {
        view.setTransitionVisibility(i);
    }

    public final void a(View view, int i, int i2, int i3, int i4) {
        view.setLeftTopRightBottom(i, i2, i3, i4);
    }

    public final void a(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }
}
