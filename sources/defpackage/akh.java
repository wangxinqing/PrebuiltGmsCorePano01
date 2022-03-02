package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: akh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class akh {
    private static final Rect a = new Rect();

    static int a(View view, akf akf, int i) {
        int i2;
        int i3;
        ajy ajy = (ajy) view.getLayoutParams();
        int i4 = akf.a;
        View findViewById = view.findViewById(-1);
        if (findViewById == null) {
            findViewById = view;
        }
        int i5 = akf.b;
        if (i != 0) {
            boolean z = akf.d;
            float f = akf.c;
            if (findViewById != view) {
                i3 = findViewById.getHeight();
            } else {
                i3 = (findViewById.getHeight() - ajy.b) - ajy.h;
            }
            float f2 = akf.c;
            i2 = (int) ((((float) i3) * 50.0f) / 100.0f);
            if (view != findViewById) {
                a.top = i2;
                ((ViewGroup) view).offsetDescendantRectToMyCoords(findViewById, a);
                return a.top - ajy.b;
            }
        } else if (view.getLayoutDirection() != 1) {
            boolean z2 = akf.d;
            float f3 = akf.c;
            int a2 = findViewById == view ? ajy.a(findViewById) : findViewById.getWidth();
            float f4 = akf.c;
            i2 = (int) ((((float) a2) * 50.0f) / 100.0f);
            if (findViewById != view) {
                a.left = i2;
                ((ViewGroup) view).offsetDescendantRectToMyCoords(findViewById, a);
                return a.left - ajy.a;
            }
        } else {
            int width = findViewById != view ? findViewById.getWidth() : ajy.a(findViewById);
            boolean z3 = akf.d;
            float f5 = akf.c;
            int a3 = findViewById == view ? ajy.a(findViewById) : findViewById.getWidth();
            float f6 = akf.c;
            i2 = width - ((int) ((((float) a3) * 50.0f) / 100.0f));
            if (findViewById != view) {
                a.right = i2;
                ((ViewGroup) view).offsetDescendantRectToMyCoords(findViewById, a);
                return a.right + ajy.g;
            }
        }
        return i2;
    }
}
