package defpackage;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;

/* renamed from: ub  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ub {
    public static ub a;
    public final Context b;
    public final ua c = new ua();
    private final LocationManager d;

    public ub(Context context, LocationManager locationManager) {
        this.b = context;
        this.d = locationManager;
    }

    public final Location a(String str) {
        try {
            if (this.d.isProviderEnabled(str)) {
                return this.d.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception e) {
            return null;
        }
    }
}
