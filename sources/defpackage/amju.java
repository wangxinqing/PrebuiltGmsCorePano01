package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: amju  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class amju {
    public final amjr a;
    public final AtomicLong b = new AtomicLong(a(Integer.MIN_VALUE, Integer.MIN_VALUE));
    public final AtomicReference c = new AtomicReference((Object) null);
    public final aosh d = aosh.f();
    private final AtomicReference e = new AtomicReference((Object) null);
    private final Executor f = aosd.a((Executor) aoqm.a);

    public amju(aoqa aoqa, Executor executor) {
        amjr amjr = new amjr(aoqa, executor);
        this.a = amjr;
        this.d.a((Runnable) amjr, (Executor) aoqm.a);
    }

    public static int a(long j) {
        return (int) (j >>> 32);
    }

    public static long a(int i, int i2) {
        return (((long) i2) & 4294967295L) | (((long) i) << 32);
    }

    public final aorr a() {
        long j;
        int a2;
        aorr aorr;
        if (this.d.isDone()) {
            return this.d;
        }
        do {
            j = this.b.get();
            a2 = a(j);
        } while (!this.b.compareAndSet(j, a(a2, ((int) j) + 1)));
        aosh f2 = aosh.f();
        aorr aorr2 = (aorr) this.e.getAndSet(f2);
        if (aorr2 == null) {
            aorr = aorl.a(amll.a((aoqa) new amjp(this, a2)), (Executor) aoqm.a);
        } else {
            aorr = aooz.a(aorr2, Throwable.class, amll.a((aoqb) new amjq(this, a2)), this.f);
        }
        f2.b(aorr);
        amjs amjs = new amjs(this, a2);
        f2.a((Runnable) new amjo(this, f2, amjs), (Executor) aoqm.a);
        return amjs;
    }

    public final aorr a(int i) {
        amjt amjt;
        if (a(this.b.get()) > i) {
            return aorl.a();
        }
        amjt amjt2 = new amjt(i);
        do {
            amjt = (amjt) this.c.get();
            if (amjt != null && amjt.a > i) {
                return aorl.a();
            }
        } while (!this.c.compareAndSet(amjt, amjt2));
        if (a(this.b.get()) > i) {
            amjt2.cancel(true);
            this.c.compareAndSet(amjt2, (Object) null);
            return amjt2;
        }
        amjr amjr = this.a;
        aoqa aoqa = amjr.a;
        Executor executor = amjr.b;
        if (aoqa == null || executor == null) {
            amjt2.b((aorr) this.d);
        } else {
            amjt2.b(aorl.a(amll.a(aoqa), executor));
        }
        return amjt2;
    }
}
