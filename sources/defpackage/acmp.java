package defpackage;

import java.util.Iterator;

/* renamed from: acmp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class acmp implements icm {
    private final acmw a;
    private final iby b;

    public acmp(acmw acmw, iby iby) {
        this.a = acmw;
        this.b = iby;
    }

    public final void a(icl icl) {
        acmw acmw = this.a;
        iby iby = this.b;
        xfh b2 = ((wla) icl).b();
        if (b2 != null) {
            Iterator it = b2.iterator();
            while (it.hasNext()) {
                xaa xaa = (xaa) it.next();
                String c = xaa.c();
                acmw.c.put(c, xaa.d());
                for (acmv a2 : acmw.e) {
                    a2.a();
                }
                iby.a(c, 1, 0).a((icm) new acmu(acmw, c));
            }
            b2.c();
        }
    }
}
