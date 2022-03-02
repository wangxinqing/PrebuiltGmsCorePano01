package defpackage;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.List;

/* renamed from: bba  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bba {
    private static final PointF a = new PointF();

    public static double a(double d, double d2, double d3) {
        return d + (d3 * (d2 - d));
    }

    public static float a(float f, float f2, float f3) {
        return f + (f3 * (f2 - f));
    }

    public static int a(int i, int i2, float f) {
        return (int) (((float) i) + (f * ((float) (i2 - i))));
    }

    public static float b(float f, float f2, float f3) {
        return Math.max(f2, Math.min(f3, f));
    }

    public static boolean c(float f, float f2, float f3) {
        return f >= f2 && f <= f3;
    }

    static int a(float f, float f2) {
        int i = (int) f;
        int i2 = (int) f2;
        int i3 = i / i2;
        int i4 = i % i2;
        if ((i ^ i2) < 0 && i4 != 0) {
            i3--;
        }
        return i - (i2 * i3);
    }

    public static int a(int i) {
        return Math.max(0, Math.min(255, i));
    }

    public static PointF a(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    public static void a(axi axi, int i, List list, axi axi2, awc awc) {
        if (axi.c(awc.b(), i)) {
            list.add(axi2.a(awc.b()).a((axj) awc));
        }
    }

    public static void a(ayl ayl, Path path) {
        path.reset();
        PointF pointF = ayl.b;
        path.moveTo(pointF.x, pointF.y);
        a.set(pointF.x, pointF.y);
        for (int i = 0; i < ayl.a.size(); i++) {
            axe axe = (axe) ayl.a.get(i);
            PointF pointF2 = axe.a;
            PointF pointF3 = axe.b;
            PointF pointF4 = axe.c;
            if (!pointF2.equals(a) || !pointF3.equals(pointF4)) {
                path.cubicTo(pointF2.x, pointF2.y, pointF3.x, pointF3.y, pointF4.x, pointF4.y);
            } else {
                path.lineTo(pointF4.x, pointF4.y);
            }
            a.set(pointF4.x, pointF4.y);
        }
        if (ayl.c) {
            path.close();
        }
    }
}
