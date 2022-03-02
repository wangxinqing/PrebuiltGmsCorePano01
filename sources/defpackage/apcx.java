package defpackage;

import java.security.KeyFactory;
import java.security.Signature;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPublicKeySpec;

/* renamed from: apcx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apcx implements aouu {
    private final RSAPrivateCrtKey a;
    private final RSAPublicKey b;
    private final String c;

    public apcx(RSAPrivateCrtKey rSAPrivateCrtKey, int i) {
        int i2 = apdc.a;
        apdc.b(rSAPrivateCrtKey.getModulus().bitLength());
        this.a = rSAPrivateCrtKey;
        String a2 = apco.a(i);
        StringBuilder sb = new StringBuilder(a2.length() + 7);
        sb.append(a2);
        sb.append("withRSA");
        this.c = sb.toString();
        this.b = (RSAPublicKey) ((KeyFactory) apcf.g.a("RSA")).generatePublic(new RSAPublicKeySpec(rSAPrivateCrtKey.getModulus(), rSAPrivateCrtKey.getPublicExponent()));
    }

    public final byte[] a(byte[] bArr) {
        Signature signature = (Signature) apcf.c.a(this.c);
        signature.initSign(this.a);
        signature.update(bArr);
        byte[] sign = signature.sign();
        Signature signature2 = (Signature) apcf.c.a(this.c);
        signature2.initVerify(this.b);
        signature2.update(bArr);
        if (signature2.verify(sign)) {
            return sign;
        }
        throw new RuntimeException("Security bug: RSA signature computation error");
    }
}
