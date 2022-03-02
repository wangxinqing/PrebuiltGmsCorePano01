package defpackage;

import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

/* renamed from: rls  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rls {
    public static double a(LatLng latLng, LatLng latLng2) {
        double radians = Math.toRadians(latLng.a);
        double radians2 = Math.toRadians(latLng.b);
        double radians3 = Math.toRadians(latLng2.a);
        double radians4 = Math.toRadians(latLng2.b);
        double sin = Math.sin((radians3 - radians) * 0.5d);
        double sin2 = Math.sin((radians4 - radians2) * 0.5d);
        double asin = Math.asin(Math.sqrt(Math.min(1.0d, (sin * sin) + (sin2 * sin2 * Math.cos(radians) * Math.cos(radians3)))));
        return (asin + asin) * 6371010.0d;
    }

    public static LatLngBounds a(LatLng latLng, double d) {
        boolean z;
        double radians = Math.toRadians(latLng.a);
        double radians2 = Math.toRadians(latLng.b);
        double d2 = d / 6371010.0d;
        double d3 = 0.5d * d2;
        double sin = Math.sin(d3);
        double sin2 = (sin + sin) * Math.sin(d3);
        double[] dArr = {radians - d2, d2 + radians};
        double[] dArr2 = {-3.141592653589793d, 3.1415926535897922d};
        if (dArr[0] <= -1.5707963267948966d) {
            dArr[0] = -1.5707963267948966d;
            z = true;
        } else {
            z = false;
        }
        if (dArr[1] >= 1.5707963267948966d) {
            dArr[1] = 1.5707963267948966d;
        } else if (!z) {
            double sqrt = Math.sqrt(sin2 * (2.0d - sin2));
            double cos = Math.cos(radians);
            if (sqrt <= cos) {
                double asin = Math.asin(sqrt / cos);
                dArr2[0] = Math.IEEEremainder(radians2 - asin, 6.283185307179586d);
                dArr2[1] = Math.IEEEremainder(radians2 + asin, 6.283185307179586d);
            }
        }
        return new LatLngBounds(new LatLng(Math.toDegrees(dArr[0]), Math.toDegrees(dArr2[0])), new LatLng(Math.toDegrees(dArr[1]), Math.toDegrees(dArr2[1])));
    }
}
