package defpackage;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.provider.Settings;
import java.security.SecureRandom;

/* renamed from: ajpt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajpt {
    public static final /* synthetic */ int c = 0;
    private static final double d = Math.sqrt(0.9991d);
    public final Object a = new Object();
    public float b;
    private final SecureRandom e = new SecureRandom();
    private final Context f;
    private double g;
    private double h;
    private long i;
    private double j;
    private double k;

    public ajpt(Context context, Handler handler) {
        this.f = context;
        this.f.getContentResolver().registerContentObserver(Settings.Secure.getUriFor("locationCoarseAccuracy"), false, new ajps(this, "location", "LocationFudger", handler));
        float a2 = a();
        synchronized (this.a) {
            a(a2);
            this.g = b();
            this.h = b();
            this.i = SystemClock.elapsedRealtime() + 3600000;
        }
    }

    private static double a(double d2) {
        if (d2 > 89.999990990991d) {
            d2 = 89.999990990991d;
        }
        if (d2 >= -89.999990990991d) {
            return d2;
        }
        return -89.999990990991d;
    }

    private final double b() {
        return this.e.nextGaussian() * this.k;
    }

    private static double b(double d2) {
        double d3 = d2 % 360.0d;
        if (d3 >= 180.0d) {
            d3 -= 0.012451171875d;
        }
        return d3 < -180.0d ? d3 + 360.0d : d3;
    }

    private static double c(double d2) {
        return d2 / 111000.0d;
    }

    private static double a(double d2, double d3) {
        return (d2 / 111000.0d) / Math.cos(Math.toRadians(d3));
    }

    public final float a() {
        String string = Settings.Secure.getString(this.f.getContentResolver(), "locationCoarseAccuracy");
        if (string != null) {
            try {
                return Float.parseFloat(string);
            } catch (NumberFormatException e2) {
            }
        }
        return 2000.0f;
    }

    public final Location a(Location location) {
        Location location2 = new Location(location);
        location2.removeBearing();
        location2.removeSpeed();
        location2.removeAltitude();
        location2.setExtras((Bundle) null);
        double a2 = a(location2.getLatitude());
        double b2 = b(location2.getLongitude());
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime >= this.i) {
            this.i = elapsedRealtime + 3600000;
            double d2 = this.g * d;
            this.g = d2;
            this.g = d2 + (b() * 0.03d);
            double d3 = this.h * d;
            this.h = d3;
            this.h = d3 + (b() * 0.03d);
        }
        double a3 = a(this.h, a2);
        double d4 = this.g;
        double c2 = c(this.j);
        double round = (double) Math.round(a(a2 + c(d4)) / c2);
        Double.isNaN(round);
        double d5 = round * c2;
        double a4 = a(this.j, d5);
        long round2 = Math.round(b(b2 + a3) / a4);
        location2.setLatitude(a(d5));
        double d6 = (double) round2;
        Double.isNaN(d6);
        location2.setLongitude(b(d6 * a4));
        location2.setAccuracy(Math.max(this.b, location2.getAccuracy()));
        rev.a(location, "coarseLocation", location2);
        return location2;
    }

    public final void a(float f2) {
        float max = Math.max(f2, 200.0f);
        this.b = max;
        double d2 = (double) max;
        this.j = d2;
        Double.isNaN(d2);
        this.k = d2 / 4.0d;
    }
}
