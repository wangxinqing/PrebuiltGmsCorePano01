package defpackage;

import java.io.Closeable;

/* renamed from: upz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class upz implements Runnable {
    private final uqb a;
    private final uqe b;

    public upz(uqb uqb, uqe uqe) {
        this.a = uqb;
        this.b = uqe;
    }

    public final void run() {
        uqb uqb = this.a;
        uqe uqe = this.b;
        uqd uqd = uqb.a;
        uqe uqe2 = uqd.a;
        if (uqd.d.get()) {
            jjt.a((Closeable) uqe);
        } else {
            uqb.a.c.add(uqe);
        }
    }
}
