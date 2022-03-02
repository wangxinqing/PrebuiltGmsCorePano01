package defpackage;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: kis  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kis {
    public final kit a;
    public CountDownLatch b;
    public int c;
    private final kin d;
    private final AtomicBoolean e = new AtomicBoolean();

    public kis(int i) {
        iva.b(kiq.a(i));
        this.a = null;
        this.d = new kin((kip) null);
        this.c = i;
        this.e.set(true);
        this.d.a(this.c);
    }

    public final void a() {
        if (!this.e.getAndSet(true)) {
            kit kit = this.a;
            if (kit.a.decrementAndGet() == 0) {
                kit.b();
            }
        }
    }

    public final kie b() {
        kit kit = this.a;
        if (kit == null) {
            return null;
        }
        iva.a(kit.f != null, (Object) "Download hasn't been started yet");
        return kit.f;
    }

    public final void a(kip kip) {
        this.d.a(kip);
    }

    public kis(kit kit) {
        iva.a((Object) kit);
        this.a = kit;
        this.d = kit.d;
    }
}
