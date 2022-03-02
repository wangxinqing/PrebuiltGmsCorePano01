package defpackage;

import java.io.IOException;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPoint;

/* renamed from: aozu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aozu extends aoug {
    public aozu(Class cls) {
        super(cls);
    }

    public final /* bridge */ /* synthetic */ Object b(audx audx) {
        aoya aoya = ((aoxz) audx).a;
        if (aoya == null) {
            aoya = aoya.d;
        }
        int b = aoyn.b(aoya.b);
        if (b == 0) {
            b = 1;
        }
        KeyPair b2 = apcd.b(apar.b(b));
        ECPrivateKey eCPrivateKey = (ECPrivateKey) b2.getPrivate();
        ECPoint w = ((ECPublicKey) b2.getPublic()).getW();
        aucd o = aoyc.e.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        aoyc aoyc = (aoyc) o.b;
        aoyc.a = 0;
        aoya.getClass();
        aoyc.b = aoya;
        auay a = auay.a(w.getAffineX().toByteArray());
        if (o.c) {
            o.c();
            o.c = false;
        }
        a.getClass();
        ((aoyc) o.b).c = a;
        auay a2 = auay.a(w.getAffineY().toByteArray());
        if (o.c) {
            o.c();
            o.c = false;
        }
        a2.getClass();
        ((aoyc) o.b).d = a2;
        aoyc aoyc2 = (aoyc) o.i();
        aucd o2 = aoyb.d.o();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        aoyb aoyb = (aoyb) o2.b;
        aoyb.a = 0;
        aoyc2.getClass();
        aoyb.b = aoyc2;
        auay a3 = auay.a(eCPrivateKey.getS().toByteArray());
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        a3.getClass();
        ((aoyb) o2.b).c = a3;
        return (aoyb) o2.i();
    }

    public final /* bridge */ /* synthetic */ audx a(auay auay) {
        aubs b = aubs.b();
        aoxz aoxz = aoxz.b;
        try {
            aubc h = auay.h();
            aucj aucj = (aucj) aoxz.c(4);
            aueq a = aueh.a.a((Object) aucj);
            a.a(aucj, aubd.a(h), b);
            a.d(aucj);
            h.a(0);
            aucj.b(aucj);
            return (aoxz) aucj;
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
        aoya aoya = ((aoxz) audx).a;
        if (aoya == null) {
            aoya = aoya.d;
        }
        apar.a(aoya);
    }
}
