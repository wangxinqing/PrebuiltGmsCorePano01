package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: aopf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aopf extends aopa {
    final AtomicReferenceFieldUpdater a;
    final AtomicReferenceFieldUpdater b;
    final AtomicReferenceFieldUpdater c;
    final AtomicReferenceFieldUpdater d;
    final AtomicReferenceFieldUpdater e;

    public final void a(aopm aopm, aopm aopm2) {
        this.b.lazySet(aopm, aopm2);
    }

    public aopf(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.a = atomicReferenceFieldUpdater;
        this.b = atomicReferenceFieldUpdater2;
        this.c = atomicReferenceFieldUpdater3;
        this.d = atomicReferenceFieldUpdater4;
        this.e = atomicReferenceFieldUpdater5;
    }

    public final void a(aopm aopm, Thread thread) {
        this.a.lazySet(aopm, thread);
    }

    public final boolean a(aopn aopn, aope aope, aope aope2) {
        return this.d.compareAndSet(aopn, aope, aope2);
    }

    public final boolean a(aopn aopn, aopm aopm, aopm aopm2) {
        return this.c.compareAndSet(aopn, aopm, aopm2);
    }

    public final boolean a(aopn aopn, Object obj, Object obj2) {
        return this.e.compareAndSet(aopn, obj, obj2);
    }
}
