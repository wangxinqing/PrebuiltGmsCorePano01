package defpackage;

import java.util.List;

/* renamed from: cvh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class cvh implements acvs {
    private final cvk a;
    private final aqsr b;
    private final long c;

    public cvh(cvk cvk, aqsr aqsr, long j) {
        this.a = cvk;
        this.b = aqsr;
        this.c = j;
    }

    public final void a(Exception exc) {
        cvk cvk = this.a;
        aqsr aqsr = this.b;
        long j = this.c;
        int i = aqsr.b;
        if (i == 1 || i == 415 || i == 10006 || i == 10100 || i == 10104 || i == 10200 || i == 10202 || i == 10312) {
            cvk.a();
            ctc ctc = cvk.g;
            ctt d = cvk.d(aqsr);
            cvj cvj = new cvj(cvk, j);
            int i2 = d.b.b;
            if (i2 == 1) {
                ((cte) ctc).a(d.a, cvj, cte.a(cte.e(), (List) amzy.a(cte.a(), cte.c(), cte.f())));
            } else if (i2 == 415) {
                cvj.a(cte.a(cte.f(), (List) amzy.h()));
            } else if (i2 == 10006) {
                ((cte) ctc).a(d.a, cvj, cte.a(cte.g(), (List) amzy.a(cte.b(), cte.c(), cte.f(), cte.d())));
            } else if (i2 == 10100) {
                cvj.a(cte.a(cte.a(), (List) amzy.a((Object) cte.c(), (Object) cte.f())));
            } else if (i2 == 10104) {
                cvj.a(cte.a(cte.b(), (List) amzy.a((Object) cte.c(), (Object) cte.f())));
            } else if (i2 == 10200) {
                ((cte) ctc).a(d.a, cvj, cte.a(cte.d(), (List) amzy.a(cte.g(), cte.b(), cte.e(), cte.a(), cte.c(), cte.f())));
            } else if (i2 == 10202) {
                ((cte) ctc).a(d.a, cvj, (aqrf) null);
            } else if (i2 != 10312) {
                cvj.a(aqrf.d);
            } else {
                cvj.a(cte.a(cte.c(), (List) amzy.a((Object) cte.f())));
            }
        }
        if (cvk.j == null) {
            cvk.j = exc;
            cvk.c();
        }
    }
}
