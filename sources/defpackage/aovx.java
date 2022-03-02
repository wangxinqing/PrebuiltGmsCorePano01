package defpackage;

import java.io.IOException;

/* renamed from: aovx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aovx extends aoug {
    public aovx(Class cls) {
        super(cls);
    }

    public final /* bridge */ /* synthetic */ Object b(audx audx) {
        aoze aoze = (aoze) audx;
        aucd o = aozd.c.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        aozd aozd = (aozd) o.b;
        aoze.getClass();
        aozd.b = aoze;
        aozd.a = 0;
        return (aozd) o.i();
    }

    public final /* bridge */ /* synthetic */ audx a(auay auay) {
        aubs b = aubs.b();
        aoze aoze = aoze.b;
        try {
            aubc h = auay.h();
            aucj aucj = (aucj) aoze.c(4);
            aueq a = aueh.a.a((Object) aucj);
            a.a(aucj, aubd.a(h), b);
            a.d(aucj);
            h.a(0);
            aucj.b(aucj);
            return (aoze) aucj;
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
        aoze aoze = (aoze) audx;
    }
}
