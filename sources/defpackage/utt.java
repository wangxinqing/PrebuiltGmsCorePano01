package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

/* renamed from: utt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class utt implements Runnable {
    private final uui a;
    private final uvi b;
    private final String c;
    private final uvq d;

    public utt(uui uui, uvi uvi, String str, uvq uvq) {
        this.a = uui;
        this.b = uvi;
        this.c = str;
        this.d = uvq;
    }

    public final void run() {
        uui uui = this.a;
        uvi uvi = this.b;
        String str = this.c;
        uvq uvq = this.d;
        byte[] d2 = uui.a.d();
        jjg jjg = ulh.a;
        tfu b2 = tfu.b(new uua(uui, uvi, d2), aymi.R() * 1000, uui.e);
        try {
            asmy a2 = uui.a((InputStream) uvi.c, 2);
            if ((a2.a & 64) != 0) {
                byte[] k = a2.e.k();
                uvi.a.d = k;
                Arrays.toString(k);
            }
            short a3 = aoom.a(d2);
            short a4 = aoom.a(uvi.a.d);
            if (uui.f.b(a4)) {
                if (a3 > a4) {
                    uvi e = uui.f.e(a4);
                    if (e != null) {
                        e.close();
                    }
                } else {
                    b2.b();
                    uvi.close();
                    return;
                }
            }
            if (!uui.a.a(uvi.a, str, new uue(uui, uvi, b2, uvq))) {
                ((anih) ((anih) ulh.a.b()).a("uui", "a", 209, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("L2ProtocolRunner failed to host a network");
                b2.b();
                uvi.close();
                uui.f.c(a4);
                return;
            }
            new jfx(9, new uub(uui, uvi, b2, a4)).start();
            try {
                aucd o = asmy.f.o();
                auay a5 = auay.a(uui.a.d());
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                asmy asmy = (asmy) o.b;
                a5.getClass();
                asmy.a |= 64;
                asmy.e = a5;
                int a6 = uui.f.a();
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                asmy asmy2 = (asmy) o.b;
                int i = asmy2.a | 32;
                asmy2.a = i;
                asmy2.d = a6;
                asmy2.b = 2;
                asmy2.a = i | 1;
                uui.a(uvi, (asmy) o.i());
            } catch (IOException e2) {
                anih anih = (anih) ulh.a.b();
                anih.a((Throwable) e2);
                ((anih) anih.a("uui", "a", 249, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("L2ProtocolRunner failed to inform the remote device about the network");
                b2.b();
                uvi.close();
                uui.a.b(uvi.a);
                uui.f.c(a4);
            }
        } catch (IOException e3) {
            anih anih2 = (anih) ulh.a.b();
            anih2.a((Throwable) e3);
            ((anih) anih2.a("uui", "a", 142, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("L2ProtocolRunner failed to read from the remote device");
            b2.b();
            uvi.close();
        }
    }
}
