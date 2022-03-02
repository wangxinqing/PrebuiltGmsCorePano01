package defpackage;

import android.location.GpsSatellite;
import android.location.GpsStatus;
import android.location.LocationManager;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: ajpq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajpq implements GpsStatus.Listener {
    public final Object a = new Object();
    public final ArrayList b;
    public boolean c;
    private final LocationManager d;
    private GpsStatus e;

    public ajpq(LocationManager locationManager) {
        this.d = locationManager;
        this.b = new ArrayList();
        this.c = false;
    }

    public final void a() {
        if (!this.c || this.b.isEmpty()) {
            this.d.removeGpsStatusListener(this);
        } else {
            this.d.addGpsStatusListener(this);
        }
    }

    public final void onGpsStatusChanged(int i) {
        if (i == 4) {
            try {
                this.e = this.d.getGpsStatus(this.e);
            } catch (NullPointerException e2) {
                this.e = null;
            }
            GpsStatus gpsStatus = this.e;
            if (gpsStatus != null) {
                Iterable<GpsSatellite> satellites = gpsStatus.getSatellites();
                synchronized (this.a) {
                    Iterator it = this.b.iterator();
                    while (it.hasNext()) {
                        ((ajpp) it.next()).a(satellites);
                    }
                }
            }
        }
    }

    public final void a(ajpp ajpp) {
        synchronized (this.a) {
            boolean isEmpty = this.b.isEmpty();
            if (this.b.add(ajpp)) {
                if (isEmpty) {
                    a();
                }
            }
        }
    }
}
