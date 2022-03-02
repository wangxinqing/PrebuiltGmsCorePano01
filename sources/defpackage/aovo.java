package defpackage;

import java.io.IOException;
import java.security.GeneralSecurityException;

/* renamed from: aovo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aovo extends aoug {
    public aovo(Class cls) {
        super(cls);
    }

    public final /* bridge */ /* synthetic */ Object b(audx audx) {
        aoxs aoxs = (aoxs) audx;
        aucd o = aoxr.d.o();
        auay a = auay.a(apcw.a(aoxs.b));
        if (o.c) {
            o.c();
            o.c = false;
        }
        a.getClass();
        ((aoxr) o.b).c = a;
        aoxt aoxt = aoxs.a;
        if (aoxt == null) {
            aoxt = aoxt.b;
        }
        if (o.c) {
            o.c();
            o.c = false;
        }
        aoxr aoxr = (aoxr) o.b;
        aoxt.getClass();
        aoxr.b = aoxt;
        aoxr.a = 0;
        return (aoxr) o.i();
    }

    public final /* bridge */ /* synthetic */ audx a(auay auay) {
        aubs b = aubs.b();
        aoxs aoxs = aoxs.c;
        try {
            aubc h = auay.h();
            aucj aucj = (aucj) aoxs.c(4);
            aueq a = aueh.a.a((Object) aucj);
            a.a(aucj, aubd.a(h), b);
            a.d(aucj);
            h.a(0);
            aucj.b(aucj);
            return (aoxs) aucj;
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
        aoxs aoxs = (aoxs) audx;
        apdc.a(aoxs.b);
        aoxt aoxt = aoxs.a;
        if (aoxt == null) {
            aoxt = aoxt.b;
        }
        if (aoxt.a != 12) {
            aoxt aoxt2 = aoxs.a;
            if (aoxt2 == null) {
                aoxt2 = aoxt.b;
            }
            if (aoxt2.a != 16) {
                throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
            }
        }
    }
}
