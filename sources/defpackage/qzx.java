package defpackage;

import java.util.concurrent.Callable;

/* renamed from: qzx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class qzx implements Callable {
    private final ras a;
    private final auco b;

    public qzx(ras ras, auco auco) {
        this.a = ras;
        this.b = auco;
    }

    public final Object call() {
        rau rau;
        ras ras = this.a;
        auco auco = this.b;
        rav b2 = ras.b(auco);
        if (ras.b == null) {
            rau = ras.a(b2);
        } else {
            rau = ras.f(auco);
        }
        boolean z = true;
        if (!rau.a(2)) {
            ras.a.a().a("ras", "i", 569, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)").a("One time sync %d disabled", auco.a());
            z = false;
        } else {
            qxf qxf = new qxf();
            qxf.i = b2.a();
            qxf.k = b2.c();
            qxf.a(0, 0);
            auop auop = rau.a;
            if (auop != null) {
                auoi auoi = auop.b;
                if (auoi == null) {
                    auoi = auoi.d;
                }
                if ((auoi.a & 1) != 0) {
                    auoi auoi2 = rau.a.b;
                    if (auoi2 == null) {
                        auoi2 = auoi.d;
                    }
                    aunn aunn = auoi2.b;
                    if (aunn == null) {
                        aunn = aunn.c;
                    }
                    auno auno = aunn.b;
                    if (auno == null) {
                        auno = auno.c;
                    }
                    aubn aubn = auno.a;
                    if (aubn == null) {
                        aubn = aubn.c;
                    }
                    long a2 = augi.a(aubn);
                    auno auno2 = aunn.b;
                    if (auno2 == null) {
                        auno2 = auno.c;
                    }
                    aubn aubn2 = auno2.b;
                    if (aubn2 == null) {
                        aubn2 = aubn.c;
                    }
                    qxf.a(a2, augi.a(aubn2));
                    auoh auoh = aunn.a;
                    if (auoh == null) {
                        auoh = auoh.l;
                    }
                    rau.a(auoh, qxf);
                    ((qwq) ras.c.a()).a((qxx) qxf.b());
                    auco.a();
                }
            }
            throw new IllegalStateException("One-time sync policy is not enabled");
        }
        return Boolean.valueOf(z);
    }
}
