package defpackage;

import java.io.IOException;

/* renamed from: uqy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class uqy implements Runnable {
    private final uqz a;
    private final IOException b;

    public uqy(uqz uqz, IOException iOException) {
        this.a = uqz;
        this.b = iOException;
    }

    public final void run() {
        uqz uqz = this.a;
        IOException iOException = this.b;
        anih anih = (anih) ulh.a.c();
        anih.a((Throwable) iOException);
        ura ura = uqz.a;
        byte[] bArr = ura.a;
        ((anih) anih.a("uqz", "b", 497, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("MultiplexBleSocketV1 connected to %s encountered an error with its internal Weave socket.", (Object) ura.b);
    }
}
