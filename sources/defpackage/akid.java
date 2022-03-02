package defpackage;

import com.google.android.gms.location.LocationResult;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: akid  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akid extends reh {
    final /* synthetic */ AtomicReference a;
    final /* synthetic */ CountDownLatch b;

    public akid(AtomicReference atomicReference, CountDownLatch countDownLatch) {
        this.a = atomicReference;
        this.b = countDownLatch;
    }

    public final void a(LocationResult locationResult) {
        this.a.set(locationResult.a());
        this.b.countDown();
    }
}
