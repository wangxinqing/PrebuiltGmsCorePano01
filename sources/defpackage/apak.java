package defpackage;

import java.math.BigInteger;
import java.security.KeyFactory;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPublicKeySpec;

/* renamed from: apak  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class apak extends aouh {
    public apak(Class cls) {
        super(cls);
    }

    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        aozm aozm = (aozm) obj;
        int i = 1;
        RSAPublicKey rSAPublicKey = (RSAPublicKey) ((KeyFactory) apcf.g.a("RSA")).generatePublic(new RSAPublicKeySpec(new BigInteger(1, aozm.c.k()), new BigInteger(1, aozm.d.k())));
        aozk aozk = aozm.b;
        if (aozk == null) {
            aozk = aozk.b;
        }
        int b = aoyp.b(aozk.a);
        if (b != 0) {
            i = b;
        }
        return new apcy(rSAPublicKey, apar.a(i));
    }
}
