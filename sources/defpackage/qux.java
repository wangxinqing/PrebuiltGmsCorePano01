package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: qux  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qux extends qus {
    public qux(quz quz) {
        super(quz);
    }

    /* access modifiers changed from: protected */
    public final boolean b(long j, TimeUnit timeUnit) {
        return this.a.a.tryAcquire(j, timeUnit);
    }

    /* access modifiers changed from: protected */
    public final void c() {
        this.a.a.acquire();
    }

    /* access modifiers changed from: protected */
    public final void d() {
        quz quz = this.a;
        synchronized (quz.a) {
            if (quz.a.availablePermits() == 0) {
                throw new IllegalStateException("Releasing reader lock that is exclusively held by writer");
            } else if (quz.a.availablePermits() >= 1073741823) {
                throw new IllegalStateException("Releasing reader lock that is not acquired");
            } else if (quz.a.availablePermits() >= 0) {
                quz.a.release();
            } else {
                throw new IllegalStateException("Lock is in an inconsistent state");
            }
        }
    }

    public final void f() {
        super.e();
    }
}
