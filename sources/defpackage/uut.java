package defpackage;

import java.io.IOException;
import java.net.ServerSocket;

/* renamed from: uut  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class uut extends jfx {
    final /* synthetic */ ServerSocket a;
    final /* synthetic */ uvy e;
    final /* synthetic */ uvf f;
    final /* synthetic */ uue g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public uut(uvf uvf, int i, ServerSocket serverSocket, uvy uvy, uue uue) {
        super(i);
        this.f = uvf;
        this.a = serverSocket;
        this.e = uvy;
        this.g = uue;
    }

    public final void run() {
        ServerSocket serverSocket;
        try {
            uvz uvz = new uvz(this.a.accept());
            uvz.a(new uus(this, this.e));
            uue uue = this.g;
            uue.c.a((Runnable) new uud(uue, uue.a, uvz, uue.d, uue.b));
            serverSocket = this.a;
        } catch (IOException e2) {
            anih anih = (anih) ulh.a.d();
            anih.a((Throwable) e2);
            ((anih) anih.a("uut", "run", 647, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("WiFi Aware ServerSocket failed to accept any incoming connections.");
            serverSocket = this.a;
        } catch (Throwable th) {
            ulu.a(this.a, "WifiAware", "ServerSocket");
            ulu.b();
            throw th;
        }
        ulu.a(serverSocket, "WifiAware", "ServerSocket");
        ulu.b();
    }
}
