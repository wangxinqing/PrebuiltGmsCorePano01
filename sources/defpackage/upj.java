package defpackage;

import java.io.IOException;

/* renamed from: upj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class upj implements Runnable {
    private final upm a;
    private final aosh b;

    public upj(upm upm, aosh aosh) {
        this.a = upm;
        this.b = aosh;
    }

    public final void run() {
        upm upm = this.a;
        aosh aosh = this.b;
        try {
            upm.c.connect();
            if (aosh.isCancelled()) {
                aosh.a((Throwable) new IOException());
            } else {
                aosh.b((Object) true);
            }
        } catch (IOException e) {
            anih anih = (anih) ulh.a.d();
            anih.a((Throwable) e);
            ((anih) anih.a("upm", "f", 165, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to connect via insecure L2cap BluetoothSocket to %s", upm.b);
            aosh.a((Throwable) new IOException());
        }
    }
}
