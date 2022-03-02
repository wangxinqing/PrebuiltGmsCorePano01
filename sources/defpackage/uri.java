package defpackage;

import java.io.IOException;

/* renamed from: uri  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class uri implements Runnable {
    private final urj a;
    private final IOException b;

    public uri(urj urj, IOException iOException) {
        this.a = urj;
        this.b = iOException;
    }

    public final void run() {
        urj urj = this.a;
        IOException iOException = this.b;
        anih anih = (anih) ulh.a.c();
        anih.a((Throwable) iOException);
        ((anih) anih.a("urj", "b", 383, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("PhysicalBleSocket connected to %s encountered an error with its internal Weave socket.", (Object) urj.a.a);
    }
}
