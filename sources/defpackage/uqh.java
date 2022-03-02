package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: uqh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class uqh implements amoh {
    private final uqj a;
    private final AtomicBoolean b;

    public uqh(uqj uqj, AtomicBoolean atomicBoolean) {
        this.a = uqj;
        this.b = atomicBoolean;
    }

    public final void a(amon amon) {
        uqj uqj = this.a;
        this.b.set(amon.b());
        synchronized (uqj.a) {
            uqj.a.notifyAll();
        }
    }
}
