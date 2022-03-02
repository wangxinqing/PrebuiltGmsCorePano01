package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: bala  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class bala extends bakz {
    private final AtomicIntegerFieldUpdater a;

    public final boolean a(balc balc) {
        return this.a.compareAndSet(balc, 0, -1);
    }

    public final void b(balc balc) {
        this.a.set(balc, 0);
    }

    public bala(AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
        this.a = atomicIntegerFieldUpdater;
    }
}
