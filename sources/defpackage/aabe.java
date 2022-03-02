package defpackage;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: aabe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aabe {
    public final hph a;

    public aabe(hol hol) {
        hph hph = new hph(hol, "GCM_COUNTERS", 1024);
        this.a = hph;
        hol.a(avsd.UNMETERED_OR_DAILY);
        hph.a((ScheduledExecutorService) jfm.a(1, 10), aoog.a(TimeUnit.HOURS.toMillis(1)));
        hph.a();
    }
}
