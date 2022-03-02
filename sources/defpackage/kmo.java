package defpackage;

import java.util.Iterator;

/* renamed from: kmo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class kmo implements Runnable {
    final /* synthetic */ boolean a;
    final /* synthetic */ kmp b;

    public kmo(kmp kmp, boolean z) {
        this.b = kmp;
        this.a = z;
    }

    public final void run() {
        boolean z;
        knl a2;
        kmp kmp = this.b;
        boolean z2 = this.a;
        iva.a(kmp.c());
        Iterator it = kmp.d.c().iterator();
        while (true) {
            z = true;
            if (!it.hasNext()) {
                break;
            }
            krl krl = (krl) it.next();
            iva.a(!krl.c, (Object) "Cannot delete an already deleted domain class");
            krl.a.b(krl.b);
            krl.c = true;
        }
        kmp.ap();
        if (kmp.ag() && (a2 = kmp.d.a()) != null) {
            kmp.a.F = false;
            kmp.d.b(a2);
        }
        lgs lgs = kmp.d;
        for (kpf b2 : lgs.a.e(lgs.b)) {
            kmp.d.b(b2);
        }
        for (kmu b3 : kmp.d.d()) {
            kmp.d.b(b3);
        }
        lgs lgs2 = kmp.d;
        iva.b(lgs2.b.a());
        lgs2.a.b(lgs2.b.a.longValue());
        kmy kmy = kmp.a;
        if (!kmy.E || !kmy.d() || kmy.h != null) {
            z = false;
        }
        iva.a(z);
        kmy.P = "";
        kmy.H = false;
        kmy.G = false;
        kmy.a(kpy.UNTRASHED);
        kmy.a(kpd.UNPINNED);
        kmy.W = false;
        kmy.T = false;
        kmy.L = kmy.a;
        kmy.M = kmy.a;
        kmy.c = null;
        kmy.b = null;
        kmy.e = null;
        kmy.a("");
        kmy.m = null;
        kmy.N = null;
        kmy.r = null;
        kmy.s = null;
        kmy.t = null;
        kmy.i = null;
        kmy.v = null;
        kmy.n = null;
        kmy.U = false;
        kmy.o = null;
        kmy.p = null;
        kmy.af = 0;
        kmy.g = null;
        kmy.q = null;
        kmy.ac = false;
        kmy.ab = false;
        kmy.w = null;
        kmy.ah = 0;
        kmy.A = null;
        kmy.B = null;
        kmy.V = false;
        kmy.b((String) null);
        kmy.J = 0;
        kmy.ai = null;
        kmy.u = null;
        kmy.k = null;
        kmy.j = null;
        kmy.ad = false;
        kmy.F = false;
        kmy.K = 0;
        kmy.X = false;
        kmy.Y = false;
        kmy.ag = 0;
        kmy.d = null;
        kmy.y = null;
        kmy.l = null;
        kmp.m(z2);
    }
}
