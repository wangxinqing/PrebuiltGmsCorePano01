package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewParent;

/* renamed from: ajzg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajzg {
    static ajyz a() {
        return new ajzj();
    }

    static ajzb b() {
        return new ajzb();
    }

    static ajyz a(int i) {
        if (i == 0) {
            return new ajzj();
        }
        if (i != 1) {
            return a();
        }
        return new ajza();
    }

    public static void a(View view) {
        Drawable background = view.getBackground();
        if (background instanceof ajzf) {
            a(view, (ajzf) background);
        }
    }

    public static void a(View view, float f) {
        Drawable background = view.getBackground();
        if (background instanceof ajzf) {
            ((ajzf) background).d(f);
        }
    }

    public static void a(View view, ajzf ajzf) {
        ajwh ajwh = ajzf.s.b;
        if (ajwh != null && ajwh.a) {
            float f = 0.0f;
            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                f += qb.o((View) parent);
            }
            ajze ajze = ajzf.s;
            if (ajze.n != f) {
                ajze.n = f;
                ajzf.m();
            }
        }
    }
}
