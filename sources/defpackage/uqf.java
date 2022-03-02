package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: uqf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class uqf implements amoh {
    private final uqg a;
    private final AtomicBoolean b;

    public uqf(uqg uqg, AtomicBoolean atomicBoolean) {
        this.a = uqg;
        this.b = atomicBoolean;
    }

    public final void a(amon amon) {
        uqg uqg = this.a;
        this.b.set(amon.b());
        synchronized (uqg.a) {
            uqg.a.notifyAll();
        }
    }
}
