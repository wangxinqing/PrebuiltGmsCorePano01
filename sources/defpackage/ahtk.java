package defpackage;

import android.hardware.SensorEvent;
import android.location.GnssNavigationMessage;
import android.os.SystemClock;

/* renamed from: ahtk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ahtk extends GnssNavigationMessage.Callback {
    final /* synthetic */ ahtl a;

    public ahtk(ahtl ahtl) {
        this.a = ahtl;
    }

    public final void onGnssNavigationMessageReceived(GnssNavigationMessage gnssNavigationMessage) {
        ahtl ahtl = this.a;
        int i = ahtl.f;
        if (ahtl.d && !ahtl.i()) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            ahsr ahsr = this.a.h;
            ahsr.post(new ahsn(ahsr, gnssNavigationMessage, elapsedRealtime));
            this.a.a(ahup.GNSS_NAVIGATION_MESSAGE, elapsedRealtime, (SensorEvent) null);
        }
    }

    public final void onStatusChanged(int i) {
    }
}
