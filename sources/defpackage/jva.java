package defpackage;

import com.google.android.gms.contextmanager.fence.internal.FenceStateImpl;

/* renamed from: jva  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class jva implements Runnable {
    private final grc a;
    private final FenceStateImpl b;

    public jva(grc grc, FenceStateImpl fenceStateImpl) {
        iva.a((Object) grc);
        this.a = grc;
        iva.a((Object) fenceStateImpl);
        this.b = fenceStateImpl;
    }

    public final void run() {
        this.a.a(this.b);
    }
}
