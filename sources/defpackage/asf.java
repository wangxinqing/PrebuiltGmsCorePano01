package defpackage;

import android.view.View;

/* renamed from: asf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
class asf extends ase {
    private static boolean a = true;

    public void a(View view, int i, int i2, int i3, int i4) {
        if (a) {
            try {
                view.setLeftTopRightBottom(i, i2, i3, i4);
            } catch (NoSuchMethodError e) {
                a = false;
            }
        }
    }
}
