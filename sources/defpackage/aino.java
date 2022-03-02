package defpackage;

import android.hardware.location.GeofenceHardwareMonitorCallback;
import android.location.Location;

/* renamed from: aino  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aino extends GeofenceHardwareMonitorCallback {
    final /* synthetic */ ainp a;

    public aino(ainp ainp) {
        this.a = ainp;
    }

    public final void onMonitoringSystemChange(int i, boolean z, Location location) {
        aino.super.onMonitoringSystemChange(i, z, location);
        boolean z2 = aikq.a;
        ainp ainp = this.a;
        if (i == ainp.a) {
            aing aing = ainp.d;
            synchronized (aing.k) {
                aucd aucd = aing.D;
                if (aucd != null) {
                    if (aucd.c) {
                        aucd.c();
                        aucd.c = false;
                    }
                    aoal aoal = (aoal) aucd.b;
                    aoal aoal2 = aoal.g;
                    aoal.a |= 8;
                    aoal.e = z;
                }
                boolean z3 = aikq.a;
                aing.b(13, Boolean.valueOf(z));
            }
        }
    }
}
