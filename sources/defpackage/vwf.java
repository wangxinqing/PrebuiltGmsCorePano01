package defpackage;

import java.util.Locale;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: vwf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class vwf {
    public final vwe a = new vwe(0, 0, vwg.LOST);
    public final vwh b = new vwh();
    public final Runnable c;
    public ScheduledFuture d;
    final /* synthetic */ vwi e;

    public vwf(vwi vwi, Runnable runnable) {
        this.e = vwi;
        this.c = runnable;
        this.d = vwi.a.schedule(runnable, ayni.r(), TimeUnit.MILLISECONDS);
    }

    /* access modifiers changed from: package-private */
    public final void a(vwg vwg) {
        this.a.c = vwg;
    }

    public final String toString() {
        return String.format(Locale.US, "SightedBlePeripheral<advertisement: %s, weightedAverage: %s>", new Object[]{this.a, this.b});
    }
}
