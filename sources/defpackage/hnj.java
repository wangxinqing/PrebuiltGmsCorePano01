package defpackage;

import java.util.List;

/* renamed from: hnj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hnj {
    public static final iwd a = hir.c("EntityManager");
    public static final fzi b = new hni();
    public final hlo c = hlo.a();
    public final hkx d = ((hkx) hkx.i.b());
    public final hls e = ((hls) hls.e.b());
    public final hnh f = ((hnh) hnh.a.b());
    public final hnl g = ((hnl) hnl.a.b());
    public final hnu h = ((hnu) hnu.a.b());
    public final Object i = new Object();

    public final amri a(hjg hjg, pyv pyv) {
        return hjg.a ? amri.b(this.f.a(pyv)) : ampu.a;
    }

    public final void a(pyv pyv) {
        hnu hnu = this.h;
        hnv hnv = new hnv();
        hnv.a = pyv;
        hnv.b = 400;
        hnv.c = true;
        hnu.b(hnv.a());
    }

    public final boolean a(pyv pyv, int i2) {
        boolean z;
        iva.a((Object) pyv);
        synchronized (this.i) {
            z = !((List) this.d.a(pyv, hkx.d(i2))).isEmpty();
        }
        return z;
    }
}
