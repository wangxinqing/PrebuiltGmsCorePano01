package defpackage;

import java.util.HashSet;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: tub  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class tub {
    public final Queue a = new ConcurrentLinkedQueue();
    public ScheduledFuture b;
    public boolean c;
    private final tww d;
    private final ScheduledExecutorService e = Executors.newSingleThreadScheduledExecutor();
    private final long f;

    public tub(tww tww, long j) {
        this.d = tww;
        this.f = j;
    }

    public static void a(tug tug) {
        ((anih) tsp.a.d()).a("FailedStoreAccessoryRequestsController: Request which failed at %d has finished its allowed number of retries. Forgetting this request permanently.", tug.f());
    }

    public final void b() {
        this.c = true;
        ScheduledFuture scheduledFuture = this.b;
        if (scheduledFuture != null && !scheduledFuture.cancel(true)) {
            this.c = false;
            return;
        }
        HashSet hashSet = new HashSet();
        boolean z = false;
        for (tug tug : this.a) {
            if (!tug.e()) {
                a(tug);
                hashSet.add(tug);
            } else {
                if (!z) {
                    twv a2 = this.d.a(tug.a(), tug.c(), tug.b(), true);
                    if (a2.a() == avuv.SUCCESS) {
                        hashSet.add(tug);
                        ((anih) tsp.a.d()).a("FailedStoreAccessoryRequestsController: Retry attempt # %d  for a request which failed at %d SUCCEEDED", tug.a, tug.f());
                    } else {
                        ((anih) tsp.a.d()).a("FailedStoreAccessoryRequestsController: Retry attempt # %d  for a request which failed at %d FAILED", tug.a, tug.f());
                        if (!a2.b()) {
                            hashSet.add(tug);
                            ((anih) tsp.a.d()).a("FailedStoreAccessoryRequestsController: request which failed at %d cannot be retried. Forgetting this request permanently.", tug.f());
                        } else {
                            z = true;
                        }
                    }
                }
                tug.a++;
            }
        }
        this.a.removeAll(hashSet);
        this.b = !this.a.isEmpty() ? a() : null;
        this.c = false;
    }

    public final ScheduledFuture a() {
        return this.e.schedule(new tua(this), this.f, TimeUnit.MILLISECONDS);
    }
}
