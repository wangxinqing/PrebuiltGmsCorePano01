package defpackage;

import java.util.Collection;
import java.util.concurrent.Future;

/* renamed from: cjy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class cjy implements bve {
    private final bul a = new bul();

    public final Future a() {
        cbi.k().c.b();
        long a2 = cbi.i().a();
        for (bsz bsz : cbi.y().a()) {
            if (!bsz.b()) {
                new Object[1][0] = Long.valueOf(a2);
                if (cbi.y().b(bsz)) {
                    if (!awuz.a.a().aw() || !jir.a((Collection) cbi.s().a(bsz, 2))) {
                        cbl w = cbi.w();
                        atxw atxw = atxw.a;
                        bul bul = this.a;
                        cjx cjx = new cjx(bsz);
                        bul.a(cjx);
                        w.a(bsz, atxw, (cbm) cjx, (but) cbi.k(), bvq.a("DailyCheckinOperation"));
                    }
                    if (awuz.a.a().V()) {
                        cbl w2 = cbi.w();
                        Collection f = cbi.E().f();
                        bul bul2 = this.a;
                        ckg ckg = new ckg(bsz);
                        bul2.a(ckg);
                        w2.b(bsz, f, ckg, cbi.k(), bvq.a("DailyCheckinOperation"));
                    }
                } else {
                    new Object[1][0] = bsz;
                }
            }
        }
        cbi.z().d(awuz.d());
        return this.a;
    }
}
