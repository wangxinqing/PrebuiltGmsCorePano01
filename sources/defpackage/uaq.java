package defpackage;

import com.google.android.gms.nearby.discovery.service.DiscoveryChimeraService;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: uaq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class uaq implements Runnable {
    private final DiscoveryChimeraService a;

    public uaq(DiscoveryChimeraService discoveryChimeraService) {
        this.a = discoveryChimeraService;
    }

    public final void run() {
        DiscoveryChimeraService discoveryChimeraService = this.a;
        jjg jjg = tsp.a;
        udb udb = discoveryChimeraService.j;
        if (tga.a(udb.e) && aymw.ab()) {
            tzr tzr = udb.l;
            if (tzr.f()) {
                ((anih) tsp.a.c()).a("FastPairScanner2: Scanner was already started; skipping for now");
            } else if (tzr.a()) {
                tzr.b();
            }
        }
        AtomicReference atomicReference = new AtomicReference();
        try {
            udb.a.a((arwm) new ucr(udb, "FastPairControllerOnCreate", atomicReference));
        } catch (InterruptedException e) {
            anih anih = (anih) tsp.a.b();
            anih.a((Throwable) e);
            anih.a("FastPair: OnCreate: Fail to register listeners");
        }
        List<CountDownLatch> list = (List) atomicReference.get();
        if (list != null) {
            System.currentTimeMillis();
            for (CountDownLatch await : list) {
                try {
                    await.await(aymt.b(), TimeUnit.MILLISECONDS);
                } catch (InterruptedException e2) {
                    anih anih2 = (anih) tsp.a.b();
                    anih2.a((Throwable) e2);
                    anih2.a("FastPair: OnCreate: Interrupted when countdown");
                }
            }
            System.currentTimeMillis();
        }
    }
}
