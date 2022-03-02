package defpackage;

import android.hardware.location.GeofenceHardware;

/* renamed from: aimh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aimh {
    public final GeofenceHardware a;

    public aimh(GeofenceHardware geofenceHardware) {
        this.a = geofenceHardware;
    }

    public final int a(int i) {
        return this.a.getStatusOfMonitoringType(i);
    }
}
