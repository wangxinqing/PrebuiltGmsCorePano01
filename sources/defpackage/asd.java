package defpackage;

import android.view.View;

/* renamed from: asd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
class asd extends asi {
    private static boolean a = true;

    public float a(View view) {
        if (a) {
            try {
                return view.getTransitionAlpha();
            } catch (NoSuchMethodError e) {
                a = false;
            }
        }
        return view.getAlpha();
    }

    public final void a() {
    }

    public final void b() {
    }

    public void a(View view, float f) {
        if (a) {
            try {
                view.setTransitionAlpha(f);
                return;
            } catch (NoSuchMethodError e) {
                a = false;
            }
        }
        view.setAlpha(f);
    }
}
