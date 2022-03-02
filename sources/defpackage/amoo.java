package defpackage;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: amoo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class amoo implements Future {
    public final CountDownLatch a = new CountDownLatch(1);
    public volatile amon b;
    private volatile amoh c;

    public final void a() {
        if (this.c != null) {
            this.c.a(this.b);
        }
    }

    public final boolean cancel(boolean z) {
        return false;
    }

    public final /* bridge */ /* synthetic */ Object get() {
        this.a.await();
        return this.b;
    }

    public final boolean isCancelled() {
        return false;
    }

    public final boolean isDone() {
        return this.b != null;
    }

    public final void a(amoh amoh) {
        this.c = amoh;
        if (isDone()) {
            a();
        }
    }

    public final /* bridge */ /* synthetic */ Object get(long j, TimeUnit timeUnit) {
        if (this.a.await(j, timeUnit)) {
            return this.b;
        }
        throw new TimeoutException();
    }
}
