package defpackage;

import java.io.IOException;

/* renamed from: tng  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class tng implements Runnable {
    private final tnl a;
    private final tlh b;
    private final String c;
    private final tnm d;
    private final tnk e;

    public tng(tnl tnl, tlh tlh, String str, tnm tnm, tnk tnk) {
        this.a = tnl;
        this.b = tlh;
        this.c = str;
        this.d = tnm;
        this.e = tnk;
    }

    public final void run() {
        tnl tnl = this.a;
        tlh tlh = this.b;
        String str = this.c;
        tnm tnm = this.d;
        tnk tnk = this.e;
        jjg jjg = tky.a;
        tfu b2 = tfu.b(new tnj(tlh, str, tnm), aymi.z(), tnl.b);
        try {
            auta b3 = auta.b(tnl.a);
            b3.a(tnm.e());
            tnm.a(b3.a());
            b3.a(tnm.e());
            b2.b();
            tnl.a(str, b3, tnk);
        } catch (ausp | ausx | IOException | IllegalStateException e2) {
            anih anih = (anih) tky.a.b();
            anih.a(e2);
            anih.a("In startServer(), UKEY2 failed with endpoint %s", (Object) str);
            if (e2 instanceof ausx) {
                try {
                    tnm.a(((ausx) e2).a());
                } catch (IOException e3) {
                    anih anih2 = (anih) tky.a.c();
                    anih2.a((Throwable) e3);
                    anih2.a("Client %d failed to pass the alert error message to endpoint %s", tlh.b(), (Object) str);
                }
            }
            b2.b();
            tnk.a(str, tnm);
        }
    }
}
