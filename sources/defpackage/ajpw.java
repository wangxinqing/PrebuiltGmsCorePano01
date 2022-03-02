package defpackage;

import java.util.concurrent.Executor;

/* renamed from: ajpw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class ajpw implements Runnable {
    private final ajpz a;
    private final ajpx b;
    private final Executor c;
    private final ahyn d;

    public ajpw(ajpz ajpz, ajpx ajpx, Executor executor, ahyn ahyn) {
        this.a = ajpz;
        this.b = ajpx;
        this.c = executor;
        this.d = ahyn;
    }

    public final void run() {
        Executor executor;
        ajpz ajpz = this.a;
        ajpx ajpx = this.b;
        Executor executor2 = this.c;
        ahyn ahyn = this.d;
        synchronized (ajpz.b) {
            executor = (Executor) ajpz.b.get(ajpx);
        }
        if (executor == executor2) {
            ajpx.a(ahyn);
        }
    }
}
