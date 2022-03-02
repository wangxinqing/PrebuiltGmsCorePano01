package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: aqcl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqcl implements aqci {
    public static final azxg b = azxg.a("com.google.frameworks.client.data.android.metrics.MutableMetricsContext");
    public final apyg c;
    public final AtomicBoolean d = new AtomicBoolean(false);
    public final AtomicBoolean e = new AtomicBoolean(false);
    public final AtomicInteger f = new AtomicInteger(0);
    public final AtomicInteger g = new AtomicInteger(0);
    public final AtomicInteger h = new AtomicInteger(0);
    public final AtomicInteger i = new AtomicInteger(-1);
    public final AtomicLong j = new AtomicLong(-1);
    public final AtomicLong k = new AtomicLong(-1);
    public final AtomicLong l = new AtomicLong(-1);
    public final AtomicReference m = new AtomicReference((Object) null);

    public aqcl(apyg apyg) {
        this.c = apyg;
    }

    public final void a() {
        amrl.b(!this.e.getAndSet(true), (Object) "Already recorded cache lookup.");
    }
}
