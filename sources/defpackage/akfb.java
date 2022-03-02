package defpackage;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewParent;

/* renamed from: akfb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akfb {
    public static final float[] a = new float[4];
    public static final float[] b = new float[8];

    public static void a(View view, RectF rectF) {
        a[0] = rectF.left;
        a[1] = rectF.top;
        a[2] = rectF.right;
        a[3] = rectF.bottom;
        a(view, a);
        rectF.left = a[0];
        rectF.top = a[1];
        rectF.right = a[2];
        rectF.bottom = a[3];
    }

    public static void a(View view, float[] fArr) {
        int length = fArr.length;
        if ((length & 1) == 0) {
            Matrix matrix = view.getMatrix();
            if (matrix != null && !matrix.isIdentity()) {
                matrix.mapPoints(fArr);
            }
            int left = view.getLeft();
            int top = view.getTop();
            int i = 0;
            while (i < length) {
                fArr[i] = fArr[i] + ((float) left);
                int i2 = i + 1;
                fArr[i2] = fArr[i2] + ((float) top);
                i = i2 + 1;
            }
            ViewParent parent = view.getParent();
            while (parent instanceof View) {
                View view2 = (View) parent;
                int scrollX = view2.getScrollX();
                int scrollY = view2.getScrollY();
                int i3 = 0;
                while (i3 < length) {
                    fArr[i3] = fArr[i3] - ((float) scrollX);
                    int i4 = i3 + 1;
                    fArr[i4] = fArr[i4] - ((float) scrollY);
                    i3 = i4 + 1;
                }
                Matrix matrix2 = view2.getMatrix();
                if (matrix2 != null && !matrix2.isIdentity()) {
                    matrix2.mapPoints(fArr);
                }
                int left2 = view2.getLeft();
                int top2 = view2.getTop();
                int i5 = 0;
                while (i5 < length) {
                    fArr[i5] = fArr[i5] + ((float) left2);
                    int i6 = i5 + 1;
                    fArr[i6] = fArr[i6] + ((float) top2);
                    i5 = i6 + 1;
                }
                parent = view2.getParent();
            }
            return;
        }
        throw new IllegalArgumentException();
    }
}
