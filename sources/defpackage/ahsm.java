package defpackage;

import android.location.GnssMeasurementsEvent;

/* renamed from: ahsm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class ahsm implements Runnable {
    private final ahsr a;
    private final GnssMeasurementsEvent b;
    private final long c;

    public ahsm(ahsr ahsr, GnssMeasurementsEvent gnssMeasurementsEvent, long j) {
        this.a = ahsr;
        this.b = gnssMeasurementsEvent;
        this.c = j;
    }

    public final void run() {
        ahsr ahsr = this.a;
        ahsr.a.a(this.b, this.c);
    }
}
