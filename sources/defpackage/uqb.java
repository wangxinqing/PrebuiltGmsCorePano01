package defpackage;

import java.io.IOException;

/* renamed from: uqb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class uqb implements ampj {
    final /* synthetic */ uqd a;

    public uqb(uqd uqd) {
        this.a = uqd;
    }

    public final void a(ampi ampi) {
        uqd uqd = this.a;
        upw upw = new upw(this, ampi);
        uqe uqe = uqd.a;
        uqd.a((Runnable) upw);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void b(ampi ampi) {
        uqd uqd = this.a;
        uqe uqe = uqd.a;
        if (uqd.d.get()) {
            ampi.b();
            return;
        }
        uqr a2 = uqq.a(ampi, new upx(this, ampi), new upy(this));
        if (a2 == null) {
            ((anih) ((anih) ulh.a.b()).a("uqb", "b", 119, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to create an incoming MultiplexBleSocket from connection %s.", (Object) ampi.c());
        } else {
            this.a.b.put(ampi.c(), a2);
        }
    }

    public final void a(IOException iOException) {
        anih anih = (anih) ulh.a.d();
        anih.a((Throwable) iOException);
        ((anih) anih.a("uqb", "a", 132, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("BleServerSocket encountered an error while receiving an incoming connection. Ignoring since this server socket only returns successfully connected sockets.");
    }
}
