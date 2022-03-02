package defpackage;

import android.hardware.location.GeofenceHardwareCallback;
import android.location.Location;
import android.util.Log;
import android.util.SparseIntArray;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

/* renamed from: ainm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ainm extends GeofenceHardwareCallback {
    public volatile CountDownLatch a;
    public volatile CountDownLatch b;
    public final SparseIntArray c = new SparseIntArray(50);
    final /* synthetic */ ainp d;
    private final Object e = new Object();
    private Location f = null;

    public ainm(ainp ainp) {
        this.d = ainp;
    }

    public final void onGeofenceAdd(int i, int i2) {
        ainm.super.onGeofenceAdd(i, i2);
        synchronized (this.c) {
            this.c.put(i, i2);
        }
        if (this.a != null) {
            this.a.countDown();
        }
    }

    public final void onGeofenceRemove(int i, int i2) {
        ainm.super.onGeofenceRemove(i, i2);
        if (i2 != 0) {
            boolean z = aikq.a;
        }
        if (this.b != null) {
            this.b.countDown();
        }
    }

    public final void onGeofenceTransition(int i, int i2, Location location, long j, int i3) {
        ainm.super.onGeofenceTransition(i, i2, location, j, i3);
        synchronized (this.e) {
            if (location != null) {
                if (Math.abs(location.getLatitude()) > 9.999999747378752E-6d || Math.abs(location.getLongitude()) > 9.999999747378752E-6d) {
                    Location location2 = this.f;
                    if (location2 == null || location2.getTime() != location.getTime()) {
                        this.f = location;
                        this.d.d.a(location, (Map) null, false);
                    }
                }
            }
            if (!aybx.b()) {
                aiko.a.a((aikn) new aikm(-1801621853, location, "Invalid location dropped"));
            } else {
                aiko.a.a(2022288865, location, 5);
            }
            if (Log.isLoggable("GeofenceHardware", 5)) {
                Log.w("GeofenceHardware", "Ignored invalid location.");
            }
        }
        boolean z = aikq.a;
    }
}
