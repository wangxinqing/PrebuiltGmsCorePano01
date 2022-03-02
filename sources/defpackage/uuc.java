package defpackage;

import java.io.IOException;

/* renamed from: uuc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class uuc implements Runnable {
    private final uue a;
    private final uvi b;
    private final String c;
    private final int d;
    private final tfu e;

    public uuc(uue uue, uvi uvi, String str, int i, tfu tfu) {
        this.a = uue;
        this.b = uvi;
        this.c = str;
        this.d = i;
        this.e = tfu;
    }

    public final void run() {
        uue uue = this.a;
        uvi uvi = this.b;
        String str = this.c;
        int i = this.d;
        tfu tfu = this.e;
        uui uui = uue.c;
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
            int i2 = asmy2.a | 32;
            asmy2.a = i2;
            asmy2.d = a3;
            asmy2.b = 3;
            asmy2.a = i2 | 1;
            aucd o2 = asmv.d.o();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            asmv asmv = (asmv) o2.b;
            str.getClass();
            int i3 = asmv.a | 1;
            asmv.a = i3;
            asmv.b = str;
            asmv.a = i3 | 2;
            asmv.c = i;
            if (o.c) {
                o.c();
                o.c = false;
            }
            asmy asmy3 = (asmy) o.b;
            asmv asmv2 = (asmv) o2.i();
            asmv2.getClass();
            asmy3.c = asmv2;
            asmy3.a |= 8;
            uui.a(uvi, (asmy) o.i());
            jjg jjg = ulh.a;
            uvi.close();
        } catch (IOException e2) {
            anih anih = (anih) ulh.a.b();
            anih.a((Throwable) e2);
            ((anih) anih.a("uui", "a", 268, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("L2ProtocolRunner failed to inform the remote device about the ServerSocket");
            tfu.b();
            uvi.close();
            uui.a.b(uvi.a);
            uui.f.c(aoom.a(uvi.a.d));
        }
    }
}
