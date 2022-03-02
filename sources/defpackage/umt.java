package defpackage;

import java.io.IOException;
import java.net.ServerSocket;

/* renamed from: umt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class umt extends jfx {
    final /* synthetic */ ServerSocket a;
    final /* synthetic */ une e;
    final /* synthetic */ tor f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public umt(une une, tor tor, ServerSocket serverSocket) {
        super(9);
        this.e = une;
        this.f = tor;
        this.a = serverSocket;
    }

    public final void run() {
        while (true) {
            try {
                this.e.a(this.f, new uwd(this.a.accept()));
            } catch (IOException e2) {
                ulu.a(this.a, "WifiDirect", "WifiDirectServerSocket");
                ulu.b();
                return;
            }
        }
    }
}
