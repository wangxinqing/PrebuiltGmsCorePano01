package defpackage;

import android.hardware.TriggerEvent;
import android.hardware.TriggerEventListener;
import java.util.concurrent.TimeUnit;

/* renamed from: ccz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ccz extends TriggerEventListener {
    final /* synthetic */ cdg a;

    public ccz(cdg cdg) {
        this.a = cdg;
    }

    public final void onTrigger(TriggerEvent triggerEvent) {
        new Object[1][0] = Long.valueOf(triggerEvent.timestamp);
        if (triggerEvent.values != null && triggerEvent.values.length == 1 && triggerEvent.values[0] == 1.0f) {
            this.a.E = TimeUnit.NANOSECONDS.toMillis(triggerEvent.timestamp);
            new Object[1][0] = Long.valueOf(this.a.E);
            cdg cdg = this.a;
            ccj ccj = cdg.L;
            cdg.k.a(cdg.o, awuz.a.a().B(), bvq.a("DNDModeProducer_motion_sensor"));
            this.a.b(0);
            this.a.b(awuz.k());
        }
    }
}
