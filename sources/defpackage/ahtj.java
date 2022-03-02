package defpackage;

import android.hardware.SensorEvent;
import android.location.GnssMeasurementsEvent;
import android.os.SystemClock;

/* renamed from: ahtj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ahtj extends GnssMeasurementsEvent.Callback {
    final /* synthetic */ ahtl a;

    public ahtj(ahtl ahtl) {
        this.a = ahtl;
    }

    public final void onGnssMeasurementsReceived(GnssMeasurementsEvent gnssMeasurementsEvent) {
        ahtl ahtl = this.a;
        int i = ahtl.f;
        if (ahtl.c && !ahtl.i()) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            ahsr ahsr = this.a.h;
            ahsr.post(new ahsm(ahsr, gnssMeasurementsEvent, elapsedRealtime));
            this.a.a(ahup.GNSS_MEASUREMENTS, elapsedRealtime, (SensorEvent) null);
        }
    }

    public final void onStatusChanged(int i) {
    }
}
