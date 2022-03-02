package defpackage;

import java.math.BigInteger;
import java.security.KeyFactory;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPublicKeySpec;

/* renamed from: apap  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class apap extends aouh {
    public apap(Class cls) {
        super(cls);
    }

    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        aozq aozq = (aozq) obj;
        int i = 1;
        RSAPublicKey rSAPublicKey = (RSAPublicKey) ((KeyFactory) apcf.g.a("RSA")).generatePublic(new RSAPublicKeySpec(new BigInteger(1, aozq.c.k()), new BigInteger(1, aozq.d.k())));
        aozo aozo = aozq.b;
        if (aozo == null) {
            aozo = aozo.d;
        }
        int b = aoyp.b(aozo.a);
        if (b == 0) {
            b = 1;
        }
        int a = apar.a(b);
        int b2 = aoyp.b(aozo.b);
        if (b2 != 0) {
            i = b2;
        }
        return new apda(rSAPublicKey, a, apar.a(i), aozo.c);
    }
}
