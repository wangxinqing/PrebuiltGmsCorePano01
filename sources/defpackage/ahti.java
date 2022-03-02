package defpackage;

import android.hardware.GeomagneticField;
import android.hardware.SensorEvent;
import android.location.Location;
import android.os.SystemClock;

/* renamed from: ahti  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ahti extends qvw {
    final /* synthetic */ ahtl a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ahti(ahtl ahtl, String str, String str2) {
        super(str, str2);
        this.a = ahtl;
    }

    /* access modifiers changed from: protected */
    public final void a(Location location) {
        ahtl ahtl = this.a;
        ahtl.j.a();
        if (ahtl.b && !ahtl.i() && !ahyi.a(location)) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            ahsr ahsr = ahtl.h;
            amrl.a((Object) location);
            ahsr.a.a(location, elapsedRealtime);
            ahtl.a(ahup.GPS, elapsedRealtime, (SensorEvent) null);
            if (!ahtl.a) {
                ahtl.a = true;
                GeomagneticField geomagneticField = new GeomagneticField((float) location.getLatitude(), (float) location.getLongitude(), (float) location.getAltitude(), System.currentTimeMillis());
                ahsr ahsr2 = ahtl.h;
                ahsr2.a.a(geomagneticField.getX(), geomagneticField.getY(), geomagneticField.getZ(), geomagneticField.getDeclination());
            }
        }
    }
}
