package defpackage;

import android.hardware.SensorEvent;

/* renamed from: ahvt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahvt extends ahrh {
    private final long d;

    public ahvt(ahuo ahuo, ahsr ahsr, long j) {
        super(ahuo, ahsr);
        this.d = j;
    }

    public final void a() {
        this.c.postDelayed(this.a, this.d);
    }

    public final void a(ahup ahup, long j, SensorEvent sensorEvent) {
    }

    public final void b() {
        this.c.removeCallbacks(this.a);
    }
}
