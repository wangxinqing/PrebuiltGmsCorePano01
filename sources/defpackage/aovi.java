package defpackage;

import java.io.IOException;

/* renamed from: aovi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aovi extends aoug {
    public aovi(Class cls) {
        super(cls);
    }

    public final /* bridge */ /* synthetic */ Object b(audx audx) {
        aoxn aoxn = (aoxn) audx;
        aoug c = new aovm().c();
        aoxp aoxp = aoxn.a;
        if (aoxp == null) {
            aoxp = aoxp.c;
        }
        aoxo aoxo = (aoxo) c.b(aoxp);
        aoug c2 = new aoxf().c();
        aoyr aoyr = aoxn.b;
        if (aoyr == null) {
            aoyr = aoyr.c;
        }
        aoyq aoyq = (aoyq) c2.b(aoyr);
        aucd o = aoxm.d.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        aoxm aoxm = (aoxm) o.b;
        aoxo.getClass();
        aoxm.b = aoxo;
        aoyq.getClass();
        aoxm.c = aoyq;
        aoxm.a = 0;
        return (aoxm) o.i();
    }

    public final /* bridge */ /* synthetic */ audx a(auay auay) {
        aubs b = aubs.b();
        aoxn aoxn = aoxn.c;
        try {
            aubc h = auay.h();
            aucj aucj = (aucj) aoxn.c(4);
            aueq a = aueh.a.a((Object) aucj);
            a.a(aucj, aubd.a(h), b);
            a.d(aucj);
            h.a(0);
            aucj.b(aucj);
            return (aoxn) aucj;
        } catch (IOException e) {
            if (!(e.getCause() instanceof auda)) {
                throw new auda(e.getMessage());
            }
            throw ((auda) e.getCause());
        } catch (RuntimeException e2) {
            if (e2.getCause() instanceof auda) {
                throw ((auda) e2.getCause());
            }
            throw e2;
        } catch (auda e3) {
            throw e3;
        } catch (auda e4) {
            throw e4;
        }
    }

    public final /* bridge */ /* synthetic */ void a(audx audx) {
        aoxn aoxn = (aoxn) audx;
        aoug c = new aovm().c();
        aoxp aoxp = aoxn.a;
        if (aoxp == null) {
            aoxp = aoxp.c;
        }
        c.a((audx) aoxp);
        aoug c2 = new aoxf().c();
        aoyr aoyr = aoxn.b;
        if (aoyr == null) {
            aoyr = aoyr.c;
        }
        c2.a((audx) aoyr);
        aoxp aoxp2 = aoxn.a;
        if (aoxp2 == null) {
            aoxp2 = aoxp.c;
        }
        apdc.a(aoxp2.b);
    }
}
