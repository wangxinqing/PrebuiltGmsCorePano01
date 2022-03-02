package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: agfy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class agfy implements Runnable {
    private final AtomicReference a;

    public agfy(AtomicReference atomicReference) {
        this.a = atomicReference;
    }

    public final void run() {
        AtomicReference atomicReference = this.a;
        anhq anhq = agge.a;
        Runnable runnable = (Runnable) atomicReference.getAndSet((Object) null);
        if (runnable != null) {
            runnable.run();
        }
    }
}
