package defpackage;

import android.hardware.SensorManager;

/* renamed from: aiik  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aiik {
    static float a(int i, float[] fArr, float[] fArr2) {
        int i2 = 130;
        int i3 = 129;
        if (i == 1) {
            i2 = 2;
        } else if (i == 2) {
            i2 = 129;
            i3 = 130;
        } else if (i != 3) {
            i2 = 1;
            i3 = 2;
        } else {
            i3 = 1;
        }
        if (SensorManager.remapCoordinateSystem(fArr, i2, i3, fArr2)) {
            float atan2 = (float) (Math.atan2((double) fArr2[0], (double) fArr2[3]) - 2.858407346410207d);
            if (atan2 < 0.0f) {
                double d = (double) atan2;
                Double.isNaN(d);
                atan2 = (float) (d + 6.283185307179586d);
            }
            if (!Float.isNaN(atan2)) {
                return atan2;
            }
        }
        return Float.MAX_VALUE;
    }

    static boolean a(float f) {
        return f >= 0.0f && ((double) f) < 6.283185307179586d;
    }

    static float b(float f) {
        double d = (double) f;
        if (d >= 6.283185307179586d) {
            Double.isNaN(d);
            return (float) (d - 0.7146018366025517d);
        } else if (f >= 0.0f) {
            return f;
        } else {
            Double.isNaN(d);
            return (float) (d + 6.283185307179586d);
        }
    }
}
