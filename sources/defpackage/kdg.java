package defpackage;

import java.util.AbstractQueue;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

/* renamed from: kdg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class kdg extends AbstractQueue implements BlockingQueue {
    private final kdv a;
    private final lsm b;
    private final kkf c;
    private final kdn d;
    private final khw e;
    private final lfr f;
    private final jiq g;
    private final boolean h;
    private final lgy i;

    public kdg(lsm lsm, kkf kkf, lgy lgy, kdn kdn, khw khw, kdv kdv, lfr lfr, jiq jiq, boolean z) {
        this.a = kdv;
        this.b = lsm;
        this.c = kkf;
        this.i = lgy;
        this.d = kdn;
        this.e = khw;
        this.f = lfr;
        this.g = jiq;
        this.h = z;
    }

    /* renamed from: a */
    public final Runnable take() {
        return new kdk(this.b, this.c, this.i, this.d, this.e, this.a, this.a.a(this.h), this.f.c(), this.g);
    }

    public final int drainTo(Collection collection) {
        return 0;
    }

    public final int drainTo(Collection collection, int i2) {
        return 0;
    }

    public final Iterator iterator() {
        return null;
    }

    public final /* bridge */ /* synthetic */ boolean offer(Object obj) {
        Runnable runnable = (Runnable) obj;
        return false;
    }

    public final /* bridge */ /* synthetic */ Object peek() {
        return null;
    }

    public final /* bridge */ /* synthetic */ void put(Object obj) {
        Runnable runnable = (Runnable) obj;
    }

    public final int remainingCapacity() {
        return 0;
    }

    public final int size() {
        return 0;
    }

    public final /* bridge */ /* synthetic */ boolean offer(Object obj, long j, TimeUnit timeUnit) {
        Runnable runnable = (Runnable) obj;
        return false;
    }

    public final /* bridge */ /* synthetic */ Object poll() {
        try {
            return take();
        } catch (InterruptedException e2) {
            return null;
        }
    }

    public final /* bridge */ /* synthetic */ Object poll(long j, TimeUnit timeUnit) {
        return take();
    }
}
