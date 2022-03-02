package defpackage;

import android.location.Location;
import com.google.android.gms.location.internal.ParcelableGeofence;

/* renamed from: aijz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aijz {
    protected final ParcelableGeofence a;
    public byte b = 0;
    protected double c = Double.MAX_VALUE;
    private final double d;

    public final void a(Location location) {
        double d2;
        ParcelableGeofence parcelableGeofence = this.a;
        this.c = aell.b(parcelableGeofence.d, parcelableGeofence.e, location.getLatitude(), location.getLongitude());
        double max = Math.max(0.2d, (double) location.getAccuracy());
        double d3 = (double) this.a.f;
        double max2 = Math.max(max, d3);
        double min = Math.min(max, d3);
        double d4 = 3.141592653589793d * max * max;
        double d5 = this.c;
        if (d5 >= max2 + min) {
            d2 = 0.0d;
        } else if (d5 > max2 - min) {
            double d6 = min * min;
            double d7 = d5 * d5;
            double d8 = max2 * max2;
            double d9 = d5 + d5;
            double d10 = d5 + min;
            d2 = ((Math.acos(((d7 + d6) - d8) / (d9 * min)) * d6) + (d8 * Math.acos(((d7 + d8) - d6) / (d9 * max2)))) - (Math.sqrt((((((-d5) + min) + max2) * (d10 - max2)) * ((d5 - min) + max2)) * (d10 + max2)) * 0.5d);
        } else {
            d2 = Math.min(d4, this.d);
        }
        double d11 = d2 / d4;
        this.b = d11 < 0.5d ? d11 < 1.0E-7d ? (byte) 2 : 4 : d11 >= ((this.a.f > 100.0f ? 1 : (this.a.f == 100.0f ? 0 : -1)) <= 0 ? 0.75d : 0.85d) ? (byte) 1 : 3;
    }

    public aijz(ParcelableGeofence parcelableGeofence) {
        this.a = parcelableGeofence;
        double d2 = (double) parcelableGeofence.f;
        Double.isNaN(d2);
        Double.isNaN(d2);
        this.d = 3.141592653589793d * d2 * d2;
    }
}
