package defpackage;

import android.os.Build;
import android.view.View;

/* renamed from: asg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
class asg extends asf {
    private static boolean a = true;

    public void a(View view, int i) {
        if (Build.VERSION.SDK_INT == 28) {
            super.a(view, i);
        } else if (a) {
            try {
                view.setTransitionVisibility(i);
            } catch (NoSuchMethodError e) {
                a = false;
            }
        }
    }
}
