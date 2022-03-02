package defpackage;

import android.location.Location;

/* renamed from: ajnt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajnt {
    public static float a(Location location, Location location2) {
        if (location2 == null || location == null || location.getAccuracy() <= 0.0f || location2.getAccuracy() <= 0.0f) {
            return 0.0f;
        }
        float accuracy = location.getAccuracy();
        float accuracy2 = location2.getAccuracy();
        return ((float) aztb.a.a().a()) * ((float) Math.sqrt((double) ((accuracy * accuracy) + (accuracy2 * accuracy2))));
    }
}
