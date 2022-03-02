package defpackage;

import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: aopx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aopx extends aopw {
    final AtomicReferenceFieldUpdater a;
    final AtomicIntegerFieldUpdater b;

    public final int a(aopz aopz) {
        return this.b.decrementAndGet(aopz);
    }

    public aopx(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
        this.a = atomicReferenceFieldUpdater;
        this.b = atomicIntegerFieldUpdater;
    }

    public final void a(aopz aopz, Set set) {
        this.a.compareAndSet(aopz, (Object) null, set);
    }
}
