package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: aoqq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aoqq implements aoqa {
    final /* synthetic */ AtomicReference a;
    final /* synthetic */ aoqa b;

    public aoqq(AtomicReference atomicReference, aoqa aoqa) {
        this.a = atomicReference;
        this.b = aoqa;
    }

    public final aorr a() {
        if (!this.a.compareAndSet(aoqt.NOT_RUN, aoqt.STARTED)) {
            return aorl.a();
        }
        return this.b.a();
    }

    public final String toString() {
        return this.b.toString();
    }
}
