package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: aoqs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aoqs implements Runnable {
    final /* synthetic */ aorr a;
    final /* synthetic */ aorr b;
    final /* synthetic */ AtomicReference c;
    final /* synthetic */ aosh d;
    final /* synthetic */ aorr e;

    public aoqs(aorr aorr, aorr aorr2, AtomicReference atomicReference, aosh aosh, aorr aorr3) {
        this.a = aorr;
        this.b = aorr2;
        this.c = atomicReference;
        this.d = aosh;
        this.e = aorr3;
    }

    public final void run() {
        if (this.a.isDone() || (this.b.isCancelled() && this.c.compareAndSet(aoqt.NOT_RUN, aoqt.CANCELLED))) {
            this.d.b(this.e);
        }
    }
}
