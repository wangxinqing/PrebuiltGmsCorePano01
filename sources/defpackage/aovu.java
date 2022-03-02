package defpackage;

import java.io.IOException;

/* renamed from: aovu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aovu extends aoug {
    public aovu(Class cls) {
        super(cls);
    }

    public final /* bridge */ /* synthetic */ Object b(audx audx) {
        aoxx aoxx = (aoxx) audx;
        aucd o = aoxw.c.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        ((aoxw) o.b).a = 0;
        auay a = auay.a(apcw.a(32));
        if (o.c) {
            o.c();
            o.c = false;
        }
        a.getClass();
        ((aoxw) o.b).b = a;
        return (aoxw) o.i();
    }

    public final /* bridge */ /* synthetic */ audx a(auay auay) {
        aubs b = aubs.b();
        aoxx aoxx = aoxx.a;
        try {
            aubc h = auay.h();
            aucj aucj = (aucj) aoxx.c(4);
            aueq a = aueh.a.a((Object) aucj);
            a.a(aucj, aubd.a(h), b);
            a.d(aucj);
            h.a(0);
            aucj.b(aucj);
            return (aoxx) aucj;
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
        aoxx aoxx = (aoxx) audx;
    }
}
