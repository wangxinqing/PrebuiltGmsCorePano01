package defpackage;

import java.io.IOException;

/* renamed from: ukx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ukx extends jfx {
    final /* synthetic */ uqd a;
    final /* synthetic */ uky e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ukx(uky uky, uqd uqd) {
        super(9);
        this.e = uky;
        this.a = uqd;
    }

    public final void run() {
        while (true) {
            try {
                uqo uqo = this.e.a;
                uqd uqd = this.a;
                if (!uqd.d.get()) {
                    uqe uqe = (uqe) uqd.c.take();
                    if (uqe != uqd.a) {
                        uqo.a(uqe);
                    } else {
                        throw new uqc();
                    }
                } else {
                    throw new uqc();
                }
            } catch (InterruptedException e2) {
                throw new IOException("BleServerSocket interrupted while waiting for incoming BLE sockets", e2);
            } catch (IOException e3) {
                uqd uqd2 = this.a;
                if (uqd2 != null) {
                    try {
                        uqd2.close();
                        jjg jjg = ulh.a;
                        return;
                    } catch (IOException e4) {
                        anih anih = (anih) ulh.a.c();
                        anih.a((Throwable) e4);
                        ((anih) anih.a("ulu", "a", 106, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to close %sSocket %s", (Object) "BLE", (Object) "Server Socket");
                        return;
                    }
                } else {
                    return;
                }
            }
        }
    }
}
