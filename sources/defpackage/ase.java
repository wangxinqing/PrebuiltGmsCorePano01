package defpackage;

import android.graphics.Matrix;
import android.view.View;

/* renamed from: ase  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
class ase extends asd {
    private static boolean a = true;
    private static boolean b = true;

    public void a(View view, Matrix matrix) {
        if (a) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError e) {
                a = false;
            }
        }
    }

    public void b(View view, Matrix matrix) {
        if (b) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError e) {
                b = false;
            }
        }
    }
}
