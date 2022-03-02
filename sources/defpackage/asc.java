package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;

/* renamed from: asc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class asc {
    public static final asi a;
    static final Property b = new asa(Float.class, "translationAlpha");

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            a = new ash();
        } else if (Build.VERSION.SDK_INT >= 23) {
            a = new asg();
        } else if (Build.VERSION.SDK_INT >= 22) {
            a = new asf();
        } else {
            int i = Build.VERSION.SDK_INT;
            a = new ase();
        }
        new asb(Rect.class, "clipBounds");
    }

    static float a(View view) {
        return a.a(view);
    }

    static asn b(View view) {
        int i = Build.VERSION.SDK_INT;
        return new asn(view);
    }

    static void a(View view, float f) {
        a.a(view, f);
    }

    static void a(View view, int i) {
        a.a(view, i);
    }

    static void a(View view, int i, int i2, int i3, int i4) {
        a.a(view, i, i2, i3, i4);
    }
}
