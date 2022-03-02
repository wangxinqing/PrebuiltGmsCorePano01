package defpackage;

import android.hardware.GeomagneticField;
import android.location.Location;

/* renamed from: arcf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class arcf {
    private Location a = null;

    public final arcv a(Location location) {
        if (location == null) {
            return null;
        }
        Location location2 = this.a;
        if (location2 != null && location2.distanceTo(location) < 100000.0f) {
            return null;
        }
        GeomagneticField geomagneticField = new GeomagneticField((float) location.getLatitude(), (float) location.getLongitude(), (float) location.getAltitude(), location.getTime());
        aucd o = arcv.b.o();
        aucd o2 = arcy.d.o();
        double radians = Math.toRadians((double) geomagneticField.getDeclination());
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        ((arcy) o2.b).c = radians;
        double radians2 = Math.toRadians((double) geomagneticField.getInclination());
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        ((arcy) o2.b).b = radians2;
        double fieldStrength = (double) geomagneticField.getFieldStrength();
        Double.isNaN(fieldStrength);
        double d = fieldStrength * 0.001d;
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        ((arcy) o2.b).a = d;
        arcy arcy = (arcy) o2.i();
        if (o.c) {
            o.c();
            o.c = false;
        }
        arcy.getClass();
        ((arcv) o.b).a = arcy;
        arcv arcv = (arcv) o.i();
        this.a = location;
        return arcv;
    }
}
