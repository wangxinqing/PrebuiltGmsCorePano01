package defpackage;

import java.io.IOException;

/* renamed from: aovl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aovl extends aoug {
    public aovl(Class cls) {
        super(cls);
    }

    public final /* bridge */ /* synthetic */ Object b(audx audx) {
        aoxp aoxp = (aoxp) audx;
        aucd o = aoxo.d.o();
        aoxq aoxq = aoxp.a;
        if (aoxq == null) {
            aoxq = aoxq.b;
        }
        if (o.c) {
            o.c();
            o.c = false;
        }
        aoxq.getClass();
        ((aoxo) o.b).b = aoxq;
        auay a = auay.a(apcw.a(aoxp.b));
        if (o.c) {
            o.c();
            o.c = false;
        }
        aoxo aoxo = (aoxo) o.b;
        a.getClass();
        aoxo.c = a;
        aoxo.a = 0;
        return (aoxo) o.i();
    }

    public final /* bridge */ /* synthetic */ audx a(auay auay) {
        aubs b = aubs.b();
        aoxp aoxp = aoxp.c;
        try {
            aubc h = auay.h();
            aucj aucj = (aucj) aoxp.c(4);
            aueq a = aueh.a.a((Object) aucj);
            a.a(aucj, aubd.a(h), b);
            a.d(aucj);
            h.a(0);
            aucj.b(aucj);
            return (aoxp) aucj;
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
        aoxp aoxp = (aoxp) audx;
        apdc.a(aoxp.b);
        aoxq aoxq = aoxp.a;
        if (aoxq == null) {
            aoxq = aoxq.b;
        }
        aovm.a(aoxq);
    }
}
