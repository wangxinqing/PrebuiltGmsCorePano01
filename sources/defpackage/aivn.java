package defpackage;

import android.location.GpsSatellite;
import android.location.GpsStatus;
import android.location.LocationManager;

/* renamed from: aivn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aivn implements GpsStatus.Listener {
    private final LocationManager a;
    private int b = -1;

    public aivn(LocationManager locationManager) {
        this.a = locationManager;
    }

    public final synchronized int a() {
        return this.b;
    }

    public final void onGpsStatusChanged(int i) {
        if (i == 4) {
            synchronized (this) {
                GpsStatus gpsStatus = null;
                try {
                    gpsStatus = this.a.getGpsStatus((GpsStatus) null);
                } catch (NullPointerException e) {
                }
                int i2 = 0;
                if (gpsStatus != null) {
                    for (GpsSatellite usedInFix : gpsStatus.getSatellites()) {
                        if (usedInFix.usedInFix()) {
                            i2++;
                        }
                    }
                }
                this.b = i2;
            }
        }
    }
}
