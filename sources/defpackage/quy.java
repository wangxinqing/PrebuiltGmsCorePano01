package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: quy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class quy extends qus {
    public quy(quz quz) {
        super(quz);
    }

    /* access modifiers changed from: protected */
    public final boolean b(long j, TimeUnit timeUnit) {
        return this.a.a.tryAcquire(1073741823, j, timeUnit);
    }

    /* access modifiers changed from: protected */
    public final void c() {
        this.a.a.acquire(1073741823);
    }

    /* access modifiers changed from: protected */
    public final void d() {
        quz quz = this.a;
        synchronized (quz.a) {
            if (quz.a.availablePermits() == 0) {
                quz.a.release(1073741823);
            } else {
                throw new IllegalStateException("ReadWriteLock is in an inconsistent state");
            }
        }
    }
}
