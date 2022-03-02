package defpackage;

import java.io.IOException;
import java.math.BigInteger;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAKeyGenParameterSpec;

/* renamed from: apai  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class apai extends aoug {
    public apai(Class cls) {
        super(cls);
    }

    public final /* bridge */ /* synthetic */ Object b(audx audx) {
        aozj aozj = (aozj) audx;
        aozk aozk = aozj.a;
        if (aozk == null) {
            aozk = aozk.b;
        }
        KeyPairGenerator keyPairGenerator = (KeyPairGenerator) apcf.f.a("RSA");
        keyPairGenerator.initialize(new RSAKeyGenParameterSpec(aozj.b, new BigInteger(1, aozj.c.k())));
        KeyPair generateKeyPair = keyPairGenerator.generateKeyPair();
        RSAPublicKey rSAPublicKey = (RSAPublicKey) generateKeyPair.getPublic();
        RSAPrivateCrtKey rSAPrivateCrtKey = (RSAPrivateCrtKey) generateKeyPair.getPrivate();
        aucd o = aozm.e.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        aozm aozm = (aozm) o.b;
        aozm.a = 0;
        aozk.getClass();
        aozm.b = aozk;
        auay a = auay.a(rSAPublicKey.getPublicExponent().toByteArray());
        if (o.c) {
            o.c();
            o.c = false;
        }
        a.getClass();
        ((aozm) o.b).d = a;
        auay a2 = auay.a(rSAPublicKey.getModulus().toByteArray());
        if (o.c) {
            o.c();
            o.c = false;
        }
        a2.getClass();
        ((aozm) o.b).c = a2;
        aozm aozm2 = (aozm) o.i();
        aucd o2 = aozl.i.o();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        aozl aozl = (aozl) o2.b;
        aozl.a = 0;
        aozm2.getClass();
        aozl.b = aozm2;
        auay a3 = auay.a(rSAPrivateCrtKey.getPrivateExponent().toByteArray());
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        a3.getClass();
        ((aozl) o2.b).c = a3;
        auay a4 = auay.a(rSAPrivateCrtKey.getPrimeP().toByteArray());
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        a4.getClass();
        ((aozl) o2.b).d = a4;
        auay a5 = auay.a(rSAPrivateCrtKey.getPrimeQ().toByteArray());
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        a5.getClass();
        ((aozl) o2.b).e = a5;
        auay a6 = auay.a(rSAPrivateCrtKey.getPrimeExponentP().toByteArray());
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        a6.getClass();
        ((aozl) o2.b).f = a6;
        auay a7 = auay.a(rSAPrivateCrtKey.getPrimeExponentQ().toByteArray());
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        a7.getClass();
        ((aozl) o2.b).g = a7;
        auay a8 = auay.a(rSAPrivateCrtKey.getCrtCoefficient().toByteArray());
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        a8.getClass();
        ((aozl) o2.b).h = a8;
        return (aozl) o2.i();
    }

    public final /* bridge */ /* synthetic */ audx a(auay auay) {
        aubs b = aubs.b();
        aozj aozj = aozj.d;
        try {
            aubc h = auay.h();
            aucj aucj = (aucj) aozj.c(4);
            aueq a = aueh.a.a((Object) aucj);
            a.a(aucj, aubd.a(h), b);
            a.d(aucj);
            h.a(0);
            aucj.b(aucj);
            return (aozj) aucj;
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
        aozj aozj = (aozj) audx;
        aozk aozk = aozj.a;
        if (aozk == null) {
            aozk = aozk.b;
        }
        apar.a(aozk);
        apdc.b(aozj.b);
    }
}
