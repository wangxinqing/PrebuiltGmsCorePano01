package defpackage;

import android.graphics.Color;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

/* renamed from: azw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class azw {
    private static final bar a = bar.a("x", "y");

    static int a(bat bat) {
        bat.a();
        int j = (int) (bat.j() * 255.0d);
        int j2 = (int) (bat.j() * 255.0d);
        int j3 = (int) (bat.j() * 255.0d);
        while (bat.e()) {
            bat.l();
        }
        bat.b();
        return Color.argb(255, j, j2, j3);
    }

    static float b(bat bat) {
        int n = bat.n();
        int i = n - 1;
        if (n == 0) {
            throw null;
        } else if (i == 0) {
            bat.a();
            float j = (float) bat.j();
            while (bat.e()) {
                bat.l();
            }
            bat.b();
            return j;
        } else if (i == 6) {
            return (float) bat.j();
        } else {
            throw new IllegalArgumentException("Unknown value for token of type " + bas.a(n));
        }
    }

    static List a(bat bat, float f) {
        ArrayList arrayList = new ArrayList();
        bat.a();
        while (bat.n() == 1) {
            bat.a();
            arrayList.add(b(bat, f));
            bat.b();
        }
        bat.b();
        return arrayList;
    }

    static PointF b(bat bat, float f) {
        int n = bat.n();
        int i = n - 1;
        if (n == 0) {
            throw null;
        } else if (i == 0) {
            bat.a();
            float j = (float) bat.j();
            float j2 = (float) bat.j();
            while (bat.n() != 2) {
                bat.l();
            }
            bat.b();
            return new PointF(j * f, j2 * f);
        } else if (i == 2) {
            bat.c();
            float f2 = 0.0f;
            float f3 = 0.0f;
            while (bat.e()) {
                int a2 = bat.a(a);
                if (a2 == 0) {
                    f2 = b(bat);
                } else if (a2 != 1) {
                    bat.g();
                    bat.l();
                } else {
                    f3 = b(bat);
                }
            }
            bat.d();
            return new PointF(f2 * f, f3 * f);
        } else if (i == 6) {
            float j3 = (float) bat.j();
            float j4 = (float) bat.j();
            while (bat.e()) {
                bat.l();
            }
            return new PointF(j3 * f, j4 * f);
        } else {
            throw new IllegalArgumentException("Unknown point starts with " + bas.a(bat.n()));
        }
    }
}
