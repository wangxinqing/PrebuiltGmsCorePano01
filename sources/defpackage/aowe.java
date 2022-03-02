package defpackage;

import java.io.IOException;

/* renamed from: aowe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aowe extends aoug {
    public aowe(Class cls) {
        super(cls);
    }

    public final /* bridge */ /* synthetic */ Object b(audx audx) {
        aozs aozs = (aozs) audx;
        aucd o = aozr.c.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        ((aozr) o.b).a = 0;
        auay a = auay.a(apcw.a(32));
        if (o.c) {
            o.c();
            o.c = false;
        }
        a.getClass();
        ((aozr) o.b).b = a;
        return (aozr) o.i();
    }

    public final /* bridge */ /* synthetic */ audx a(auay auay) {
        aubs b = aubs.b();
        aozs aozs = aozs.a;
        try {
            aubc h = auay.h();
            aucj aucj = (aucj) aozs.c(4);
            aueq a = aueh.a.a((Object) aucj);
            a.a(aucj, aubd.a(h), b);
            a.d(aucj);
            h.a(0);
            aucj.b(aucj);
            return (aozs) aucj;
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
        aozs aozs = (aozs) audx;
    }
}
