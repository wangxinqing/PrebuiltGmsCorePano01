package defpackage;

import android.location.Location;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: alfu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class alfu implements rei {
    final /* synthetic */ AtomicReference a;
    final /* synthetic */ CountDownLatch b;

    public alfu(AtomicReference atomicReference, CountDownLatch countDownLatch) {
        this.a = atomicReference;
        this.b = countDownLatch;
    }

    public final void a(Location location) {
        this.a.set(location);
        this.b.countDown();
    }
}
