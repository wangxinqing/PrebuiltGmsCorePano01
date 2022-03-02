package defpackage;

import android.content.Context;

/* renamed from: hns  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class hns {
    public static final iwd a = hir.c("SyncHelper");
    public final hne b = ((hne) hne.a.b());
    public final hnn c = ((hnn) hnn.a.b());
    public final hnl d = ((hnl) hnl.a.b());
    public final hkx e = ((hkx) hkx.i.b());
    public final hls f = ((hls) hls.e.b());
    public final hmx g;
    public final hmz h;

    public hns(Context context) {
        this.g = hmx.a(context);
        this.h = new hmz(context);
    }

    public static hln a(aqol aqol) {
        hlm hlm = new hlm();
        hlm.a(4);
        hlm.a = aqol.a;
        hlm.b = aqol.au();
        hlm.c = aqol.b;
        return hlm.a();
    }

    public static hln a(aqpe aqpe) {
        hlm hlm = new hlm();
        hlm.a(2);
        hlm.a = aqpe.b;
        hlm.b = aqpe.au();
        hlm.c = aqpe.c;
        return hlm.a();
    }

    public static hln a(aqph aqph) {
        hlm hlm = new hlm();
        hlm.a(1);
        hlm.a = aqph.b;
        hlm.b = aqph.au();
        hlm.c = aqph.c;
        return hlm.a();
    }

    public final void a(pyv pyv, int i) {
        this.e.a(pyv, hkx.a(i), true);
        this.e.a(pyv, hkx.b(i), false);
    }
}
