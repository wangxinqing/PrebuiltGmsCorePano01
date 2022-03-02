package defpackage;

import java.io.IOException;
import java.security.GeneralSecurityException;

/* renamed from: aoxe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aoxe extends aoug {
    public aoxe(Class cls) {
        super(cls);
    }

    public final /* bridge */ /* synthetic */ Object b(audx audx) {
        aoyr aoyr = (aoyr) audx;
        aucd o = aoyq.d.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        ((aoyq) o.b).a = 0;
        aoys aoys = aoyr.a;
        if (aoys == null) {
            aoys = aoys.c;
        }
        if (o.c) {
            o.c();
            o.c = false;
        }
        aoys.getClass();
        ((aoyq) o.b).b = aoys;
        auay a = auay.a(apcw.a(aoyr.b));
        if (o.c) {
            o.c();
            o.c = false;
        }
        a.getClass();
        ((aoyq) o.b).c = a;
        return (aoyq) o.i();
    }

    public final /* bridge */ /* synthetic */ audx a(auay auay) {
        aubs b = aubs.b();
        aoyr aoyr = aoyr.c;
        try {
            aubc h = auay.h();
            aucj aucj = (aucj) aoyr.c(4);
            aueq a = aueh.a.a((Object) aucj);
            a.a(aucj, aubd.a(h), b);
            a.d(aucj);
            h.a(0);
            aucj.b(aucj);
            return (aoyr) aucj;
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
        aoyr aoyr = (aoyr) audx;
        if (aoyr.b >= 16) {
            aoys aoys = aoyr.a;
            if (aoys == null) {
                aoys = aoys.c;
            }
            aoxf.a(aoys);
            return;
        }
        throw new GeneralSecurityException("key too short");
    }
}
