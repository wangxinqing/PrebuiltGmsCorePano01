package defpackage;

import com.google.android.gms.beacon.BleSettings;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: ukw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ukw extends urq {
    public final BleSettings a;
    private final gte b;
    private final gth c;
    private final Runnable d;
    private final ScheduledExecutorService e;
    private tfu f;

    public ukw(gte gte, gth gth, BleSettings bleSettings, Runnable runnable, ScheduledExecutorService scheduledExecutorService, tfw tfw) {
        super(35, tfw);
        this.b = gte;
        this.c = gth;
        this.a = bleSettings;
        this.d = runnable;
        this.e = scheduledExecutorService;
    }

    public final void a() {
        tfu tfu = this.f;
        if (tfu != null) {
            tfu.b();
            this.f = null;
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        acwa a2 = this.b.a(this.c);
        a2.a(ukt.a);
        a2.a(uku.a);
        a2.a((acvp) new ukv(countDownLatch));
        try {
            countDownLatch.await(aymi.p(), TimeUnit.SECONDS);
        } catch (InterruptedException e2) {
            Thread.currentThread().interrupt();
            ((anih) ((anih) ulh.a.b()).a("ukw", "a", 2412, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to stop BLE scanning, timed out after %d seconds.", aymi.p());
        }
    }

    public final int b() {
        aosh f2 = aosh.f();
        acwa a2 = this.b.a(this.c, this.a);
        a2.a((acvv) new ukr(f2));
        a2.a((acvs) new uks(this, f2));
        try {
            f2.get(aymi.o(), TimeUnit.SECONDS);
            jjg jjg = ulh.a;
            this.f = tfu.a(this.d, aymi.a.a().G(), this.e);
            return 2;
        } catch (InterruptedException e2) {
            Thread.currentThread().interrupt();
            ((anih) ((anih) ulh.a.b()).a("ukw", "b", 2376, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Interrupted while waiting to start BLE scanning.");
            return 3;
        } catch (ExecutionException e3) {
            anih anih = (anih) ulh.a.b();
            anih.a((Throwable) e3);
            ((anih) anih.a("ukw", "b", 2379, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to start BLE scanning with settings %s.", (Object) this.a);
            return 4;
        } catch (TimeoutException e4) {
            anih anih2 = (anih) ulh.a.b();
            anih2.a((Throwable) e4);
            ((anih) anih2.a("ukw", "b", 2382, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to start BLE scanning with settings %s in %d seconds.", (Object) this.a, aymi.o());
            return 4;
        }
    }
}
