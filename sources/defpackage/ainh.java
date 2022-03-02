package defpackage;

import android.hardware.location.GeofenceHardware;
import android.os.Binder;
import android.util.Log;
import com.android.location.provider.GeofenceProvider;

/* renamed from: ainh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ainh extends GeofenceProvider implements aini {
    public static final ainh a = new ainh();
    private final Object b = new Object();
    private aimh c = null;

    public final aimh a() {
        aimh aimh;
        synchronized (this.b) {
            aimh = this.c;
        }
        return aimh;
    }

    public final void onGeofenceHardwareChange(GeofenceHardware geofenceHardware) {
        aing aing;
        aimh aimh;
        int callingUid = Binder.getCallingUid();
        if (callingUid == 1000) {
            synchronized (this.b) {
                boolean z = aikq.a;
                int i = aing.E;
                synchronized (aing.class) {
                    aing = aing.A;
                }
                if (geofenceHardware != null) {
                    aimh = new aimh(geofenceHardware);
                } else {
                    aimh = null;
                }
                this.c = aimh;
                if (aing != null) {
                    synchronized (aing.k) {
                        boolean z2 = aikq.a;
                        aing.d(12);
                    }
                }
            }
        } else if (Log.isLoggable("GmsCoreGeofenceProvider", 5)) {
            StringBuilder sb = new StringBuilder(54);
            sb.append("Ignoring calls from non-system server. Uid=");
            sb.append(callingUid);
            aikq.c("GmsCoreGeofenceProvider", sb.toString());
        }
    }
}
