package defpackage;

import android.hardware.SensorEvent;

/* renamed from: cda  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class cda extends nlb {
    final /* synthetic */ cdg a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cda(cdg cdg, String str, String str2) {
        super(str, str2);
        this.a = cdg;
    }

    public final void a(SensorEvent sensorEvent) {
        if (sensorEvent.values != null && sensorEvent.values.length == 1) {
            this.a.F = sensorEvent.values[0];
            new Object[1][0] = Float.valueOf(this.a.F);
            cdg cdg = this.a;
            cdg.r.unregisterListener(cdg.m);
            cdg cdg2 = this.a;
            cdg2.k.a(cdg2.p, awuz.a.a().A(), bvq.a("DNDModeProducer_light_sensor"));
            this.a.b(0);
        }
    }
}
