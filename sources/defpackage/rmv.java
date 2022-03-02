package defpackage;

import java.util.concurrent.Executor;

/* renamed from: rmv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class rmv implements Runnable {
    private final rmw a;
    private final rng b;
    private final Executor c;
    private final int d;
    private final int e;

    public rmv(rmw rmw, rng rng, Executor executor, int i, int i2) {
        this.a = rmw;
        this.b = rng;
        this.c = executor;
        this.d = i;
        this.e = i2;
    }

    public final void run() {
        rmw rmw = this.a;
        rng rng = this.b;
        Executor executor = this.c;
        int i = this.d;
        int i2 = this.e;
        synchronized (rmw.b) {
            if (rmw.b.get(rng) == executor) {
                rng.a(i, i2);
            }
        }
    }
}
