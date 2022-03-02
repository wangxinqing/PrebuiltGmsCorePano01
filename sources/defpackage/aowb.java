package defpackage;

import java.io.IOException;

/* renamed from: aowb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aowb extends aoug {
    public aowb(Class cls) {
        super(cls);
    }

    public final /* bridge */ /* synthetic */ Object b(audx audx) {
        aozg aozg = (aozg) audx;
        aucd o = aozf.c.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        aozf aozf = (aozf) o.b;
        aozg.getClass();
        aozf.b = aozg;
        aozf.a = 0;
        return (aozf) o.i();
    }

    public final /* bridge */ /* synthetic */ audx a(auay auay) {
        aubs b = aubs.b();
        aozg aozg = aozg.c;
        try {
            aubc h = auay.h();
            aucj aucj = (aucj) aozg.c(4);
            aueq a = aueh.a.a((Object) aucj);
            a.a(aucj, aubd.a(h), b);
            a.d(aucj);
            h.a(0);
            aucj.b(aucj);
            return (aozg) aucj;
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
        aozg aozg = (aozg) audx;
    }
}
