package defpackage;

import java.io.IOException;

/* renamed from: ujm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class ujm implements Runnable {
    private final ujn a;
    private final aosh b;

    public ujm(ujn ujn, aosh aosh) {
        this.a = ujn;
        this.b = aosh;
    }

    public final void run() {
        ujn ujn = this.a;
        aosh aosh = this.b;
        upc c = ujn.c();
        if (c == null) {
            aosh.a((Throwable) new IOException());
        } else if (aosh.isCancelled()) {
            ulu.a((ull) c, "Bluetooth", ujn.a);
            aosh.a((Throwable) new IOException());
        } else {
            aosh.b((Object) c);
        }
    }
}
