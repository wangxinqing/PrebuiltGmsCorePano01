package defpackage;

import java.io.IOException;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPoint;

/* renamed from: aowh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aowh extends aoug {
    public aowh(Class cls) {
        super(cls);
    }

    public final /* bridge */ /* synthetic */ Object b(audx audx) {
        aoyf aoyf = (aoyf) audx;
        aoyg aoyg = aoyf.a;
        if (aoyg == null) {
            aoyg = aoyg.d;
        }
        aoyj aoyj = aoyg.a;
        if (aoyj == null) {
            aoyj = aoyj.d;
        }
        int b = aoyn.b(aoyj.a);
        if (b == 0) {
            b = 1;
        }
        KeyPair b2 = apcd.b(aows.b(b));
        ECPrivateKey eCPrivateKey = (ECPrivateKey) b2.getPrivate();
        ECPoint w = ((ECPublicKey) b2.getPublic()).getW();
        aucd o = aoyi.e.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        ((aoyi) o.b).a = 0;
        aoyg aoyg2 = aoyf.a;
        if (aoyg2 == null) {
            aoyg2 = aoyg.d;
        }
        if (o.c) {
            o.c();
            o.c = false;
        }
        aoyg2.getClass();
        ((aoyi) o.b).b = aoyg2;
        auay a = auay.a(w.getAffineX().toByteArray());
        if (o.c) {
            o.c();
            o.c = false;
        }
        a.getClass();
        ((aoyi) o.b).c = a;
        auay a2 = auay.a(w.getAffineY().toByteArray());
        if (o.c) {
            o.c();
            o.c = false;
        }
        a2.getClass();
        ((aoyi) o.b).d = a2;
        aoyi aoyi = (aoyi) o.i();
        aucd o2 = aoyh.d.o();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        aoyh aoyh = (aoyh) o2.b;
        aoyh.a = 0;
        aoyi.getClass();
        aoyh.b = aoyi;
        auay a3 = auay.a(eCPrivateKey.getS().toByteArray());
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        a3.getClass();
        ((aoyh) o2.b).c = a3;
        return (aoyh) o2.i();
    }

    public final /* bridge */ /* synthetic */ audx a(auay auay) {
        aubs b = aubs.b();
        aoyf aoyf = aoyf.b;
        try {
            aubc h = auay.h();
            aucj aucj = (aucj) aoyf.c(4);
            aueq a = aueh.a.a((Object) aucj);
            a.a(aucj, aubd.a(h), b);
            a.d(aucj);
            h.a(0);
            aucj.b(aucj);
            return (aoyf) aucj;
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
        aoyg aoyg = ((aoyf) audx).a;
        if (aoyg == null) {
            aoyg = aoyg.d;
        }
        aows.a(aoyg);
    }
}
