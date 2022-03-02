package defpackage;

import android.os.SystemClock;
import java.util.concurrent.TimeUnit;

/* renamed from: aiem  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aiem implements Runnable {
    final /* synthetic */ aien a;
    private final aqfq b;

    public aiem(aien aien, aqfq aqfq) {
        this.a = aien;
        this.b = aqfq;
    }

    public final void run() {
        long nanos = TimeUnit.MILLISECONDS.toNanos(SystemClock.elapsedRealtime());
        this.a.h.a(nanos, this.b);
        this.a.a(nanos);
    }
}
