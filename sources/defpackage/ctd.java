package defpackage;

import java.util.Iterator;

/* renamed from: ctd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class ctd implements icm {
    private final cte a;
    private final dih b;
    private final aqrf c;
    private final cvj d;

    public ctd(cte cte, dih dih, cvj cvj, aqrf aqrf) {
        this.a = cte;
        this.b = dih;
        this.d = cvj;
        this.c = aqrf;
    }

    public final void a(icl icl) {
        dih dih = this.b;
        cvj cvj = this.d;
        aqrf aqrf = this.c;
        wla wla = (wla) icl;
        if (wla.b() != null) {
            Iterator it = wla.b().iterator();
            String str = null;
            while (it.hasNext()) {
                xaa xaa = (xaa) it.next();
                if (xaa.k() && dih.a.equals(xaa.c())) {
                    str = xaa.d();
                }
            }
            cte.a(cvj, aqrf, str);
        }
    }
}
