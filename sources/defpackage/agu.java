package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: agu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class agu extends agp {
    final AtomicReferenceFieldUpdater a;
    final AtomicReferenceFieldUpdater b;
    final AtomicReferenceFieldUpdater c;
    final AtomicReferenceFieldUpdater d;
    final AtomicReferenceFieldUpdater e;

    public final void a(agx agx, agx agx2) {
        this.b.lazySet(agx, agx2);
    }

    public agu(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.a = atomicReferenceFieldUpdater;
        this.b = atomicReferenceFieldUpdater2;
        this.c = atomicReferenceFieldUpdater3;
        this.d = atomicReferenceFieldUpdater4;
        this.e = atomicReferenceFieldUpdater5;
    }

    public final void a(agx agx, Thread thread) {
        this.a.lazySet(agx, thread);
    }

    public final boolean a(agy agy, agt agt, agt agt2) {
        return this.d.compareAndSet(agy, agt, agt2);
    }

    public final boolean a(agy agy, agx agx, agx agx2) {
        return this.c.compareAndSet(agy, agx, agx2);
    }

    public final boolean a(agy agy, Object obj, Object obj2) {
        return this.e.compareAndSet(agy, obj, obj2);
    }
}
