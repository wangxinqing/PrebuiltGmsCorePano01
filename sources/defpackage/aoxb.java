package defpackage;

import java.io.IOException;

/* renamed from: aoxb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aoxb extends aoug {
    public aoxb(Class cls) {
        super(cls);
    }

    public final /* bridge */ /* synthetic */ Object b(audx audx) {
        aoxk aoxk = (aoxk) audx;
        aucd o = aoxj.d.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        ((aoxj) o.b).a = 0;
        auay a = auay.a(apcw.a(aoxk.a));
        if (o.c) {
            o.c();
            o.c = false;
        }
        a.getClass();
        ((aoxj) o.b).b = a;
        aoxl aoxl = aoxk.b;
        if (aoxl == null) {
            aoxl = aoxl.b;
        }
        if (o.c) {
            o.c();
            o.c = false;
        }
        aoxl.getClass();
        ((aoxj) o.b).c = aoxl;
        return (aoxj) o.i();
    }

    public final /* bridge */ /* synthetic */ audx a(auay auay) {
        aubs b = aubs.b();
        aoxk aoxk = aoxk.c;
        try {
            aubc h = auay.h();
            aucj aucj = (aucj) aoxk.c(4);
            aueq a = aueh.a.a((Object) aucj);
            a.a(aucj, aubd.a(h), b);
            a.d(aucj);
            h.a(0);
            aucj.b(aucj);
            return (aoxk) aucj;
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
        aoxk aoxk = (aoxk) audx;
        aoxl aoxl = aoxk.b;
        if (aoxl == null) {
            aoxl = aoxl.b;
        }
        aoxc.a(aoxl);
        aoxc.a(aoxk.a);
    }
}
