package defpackage;

import java.io.IOException;
import java.net.InetSocketAddress;

/* renamed from: utv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class utv implements Runnable {
    private final uui a;
    private final uvi b;
    private final tfw c;
    private final String d;
    private final short e;
    private final aosh f;

    public utv(uui uui, uvi uvi, tfw tfw, String str, short s, aosh aosh) {
        this.a = uui;
        this.b = uvi;
        this.c = tfw;
        this.d = str;
        this.e = s;
        this.f = aosh;
    }

    public final void run() {
        uui uui = this.a;
        uvi uvi = this.b;
        tfw tfw = this.c;
        String str = this.d;
        short s = this.e;
        aosh aosh = this.f;
        byte[] d2 = uui.a.d();
        jjg jjg = ulh.a;
        tfu b2 = tfu.b(new utw(uui, uvi, d2), aymi.R() * 1000, uui.e);
        tfw.a(new utx(uui, uvi, d2));
        if (tfw.b()) {
            uvi.close();
        }
        try {
            aucd o = asmy.f.o();
            auay a2 = auay.a(uui.a.d());
            if (o.c) {
                o.c();
                o.c = false;
            }
            asmy asmy = (asmy) o.b;
            a2.getClass();
            asmy.a |= 64;
            asmy.e = a2;
            int a3 = uui.f.a();
            if (o.c) {
                o.c();
                o.c = false;
            }
            asmy asmy2 = (asmy) o.b;
            int i = asmy2.a | 32;
            asmy2.a = i;
            asmy2.d = a3;
            asmy2.b = 1;
            asmy2.a = 1 | i;
            uui.a(uvi, (asmy) o.i());
            ulu.a(uui.a.d());
            uui.b(uvi.c, 3);
            ((anih) ((anih) ulh.a.d()).a("uui", "a", 382, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Received incoming notice that a Wifi Aware network is available");
            if (uui.a.a(uvi.a, str, tfw)) {
                InetSocketAddress a4 = uui.a.a(uvi.a);
                if (a4 != null) {
                    ((anih) ((anih) ulh.a.d()).a("uui", "a", 403, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Immediately received the ip/port. No need to wait for notice.");
                } else {
                    asmv asmv = uui.b(uvi.c, 4).c;
                    if (asmv == null) {
                        asmv = asmv.d;
                    }
                    InetSocketAddress inetSocketAddress = new InetSocketAddress(asmv.b, asmv.c);
                    ((anih) ((anih) ulh.a.d()).a("uui", "a", 400, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Received incoming notice that a Wifi Aware ServerSocket is available");
                    a4 = inetSocketAddress;
                }
                uvz a5 = uui.a.a(uvi.a, a4, tfw);
                if (a5 != null) {
                    a5.a(new uty(uui, s));
                    aosh.b((Object) a5);
                    b2.b();
                    uvi.close();
                    return;
                }
                uui.a.b(uvi.a);
                throw new IOException("Failed to connect to the Wifi Aware ServerSocket");
            }
            throw new IOException("Failed to join the Wifi Aware network");
        } catch (IOException e2) {
            aosh.a((Throwable) e2);
        } catch (Throwable th) {
            b2.b();
            uvi.close();
            throw th;
        }
    }
}
