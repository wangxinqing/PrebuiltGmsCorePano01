package defpackage;

import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.PublicKey;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.EllipticCurve;
import java.util.Arrays;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: apbq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apbq implements aoub {
    private static final byte[] a = new byte[0];
    private final apbs b;
    private final String c;
    private final byte[] d;
    private final apbo e;
    private final int f;

    public apbq(ECPublicKey eCPublicKey, byte[] bArr, String str, int i, apbo apbo) {
        apcd.a(eCPublicKey);
        this.b = new apbs(eCPublicKey);
        this.d = bArr;
        this.c = str;
        this.f = i;
        this.e = apbo;
    }

    public final byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3;
        aotx aotx;
        apbs apbs = this.b;
        String str = this.c;
        byte[] bArr4 = this.d;
        int i = ((aowt) this.e).b;
        int i2 = this.f;
        KeyPair a2 = apcd.a(apbs.a.getParams());
        ECPublicKey eCPublicKey = (ECPublicKey) a2.getPublic();
        ECPrivateKey eCPrivateKey = (ECPrivateKey) a2.getPrivate();
        ECPublicKey eCPublicKey2 = apbs.a;
        try {
            ECParameterSpec params = eCPublicKey2.getParams();
            ECParameterSpec params2 = eCPrivateKey.getParams();
            if (!params.getCurve().equals(params2.getCurve()) || !params.getGenerator().equals(params2.getGenerator()) || !params.getOrder().equals(params2.getOrder()) || params.getCofactor() != params2.getCofactor()) {
                throw new GeneralSecurityException("invalid public key spec");
            }
            ECPoint w = eCPublicKey2.getW();
            apcd.a(w, eCPrivateKey.getParams().getCurve());
            PublicKey generatePublic = ((KeyFactory) apcf.g.a("EC")).generatePublic(new ECPublicKeySpec(w, eCPrivateKey.getParams()));
            KeyAgreement keyAgreement = (KeyAgreement) apcf.e.a("ECDH");
            keyAgreement.init(eCPrivateKey);
            int i3 = 1;
            try {
                keyAgreement.doPhase(generatePublic, true);
                byte[] generateSecret = keyAgreement.generateSecret();
                EllipticCurve curve = eCPrivateKey.getParams().getCurve();
                BigInteger bigInteger = new BigInteger(1, generateSecret);
                if (bigInteger.signum() == -1 || bigInteger.compareTo(apcd.a(curve)) >= 0) {
                    throw new GeneralSecurityException("shared secret is out of range");
                }
                apcd.a(bigInteger, true, curve);
                byte[] a3 = apcd.a(eCPublicKey.getParams().getCurve(), i2, eCPublicKey.getW());
                byte[] a4 = apbg.a(a3, generateSecret);
                Mac mac = (Mac) apcf.b.a(str);
                if (i <= mac.getMacLength() * 255) {
                    if (bArr4 == null || bArr4.length == 0) {
                        mac.init(new SecretKeySpec(new byte[mac.getMacLength()], str));
                    } else {
                        mac.init(new SecretKeySpec(bArr4, str));
                    }
                    byte[] bArr5 = new byte[i];
                    mac.init(new SecretKeySpec(mac.doFinal(a4), str));
                    byte[] bArr6 = new byte[0];
                    int i4 = 0;
                    while (true) {
                        mac.update(bArr6);
                        mac.update(bArr2);
                        mac.update((byte) i3);
                        bArr6 = mac.doFinal();
                        int length = bArr6.length;
                        int i5 = i4 + length;
                        if (i5 >= i) {
                            break;
                        }
                        System.arraycopy(bArr6, 0, bArr5, i4, length);
                        i3++;
                        i4 = i5;
                    }
                    System.arraycopy(bArr6, 0, bArr5, i4, i - i4);
                    apbr apbr = new apbr(a3, bArr5);
                    apbo apbo = this.e;
                    apcr apcr = apbr.b;
                    byte[] bArr7 = null;
                    if (apcr != null) {
                        bArr3 = apcr.a();
                    } else {
                        bArr3 = null;
                    }
                    aowt aowt = (aowt) apbo;
                    if (bArr3.length == aowt.b) {
                        if (aowt.a.equals(aovd.b)) {
                            aucd o = aoxu.c.o();
                            o.a((aucj) aowt.c);
                            auay a5 = auay.a(bArr3, 0, aowt.b);
                            if (o.c) {
                                o.c();
                                o.c = false;
                            }
                            a5.getClass();
                            ((aoxu) o.b).b = a5;
                            aotx = (aotx) aovb.a(aowt.a, (audx) (aoxu) o.i(), aotx.class);
                        } else if (aowt.a.equals(aovd.a)) {
                            byte[] copyOfRange = Arrays.copyOfRange(bArr3, 0, aowt.e);
                            byte[] copyOfRange2 = Arrays.copyOfRange(bArr3, aowt.e, aowt.b);
                            aucd o2 = aoxo.d.o();
                            aoxo aoxo = aowt.d.b;
                            if (aoxo == null) {
                                aoxo = aoxo.d;
                            }
                            o2.a((aucj) aoxo);
                            auay a6 = auay.a(copyOfRange);
                            if (o2.c) {
                                o2.c();
                                o2.c = false;
                            }
                            a6.getClass();
                            ((aoxo) o2.b).c = a6;
                            aoxo aoxo2 = (aoxo) o2.i();
                            aucd o3 = aoyq.d.o();
                            aoyq aoyq = aowt.d.c;
                            if (aoyq == null) {
                                aoyq = aoyq.d;
                            }
                            o3.a((aucj) aoyq);
                            auay a7 = auay.a(copyOfRange2);
                            if (o3.c) {
                                o3.c();
                                o3.c = false;
                            }
                            a7.getClass();
                            ((aoyq) o3.b).c = a7;
                            aoyq aoyq2 = (aoyq) o3.i();
                            aucd o4 = aoxm.d.o();
                            int i6 = aowt.d.a;
                            if (o4.c) {
                                o4.c();
                                o4.c = false;
                            }
                            aoxm aoxm = (aoxm) o4.b;
                            aoxm.a = i6;
                            aoxo2.getClass();
                            aoxm.b = aoxo2;
                            aoyq2.getClass();
                            aoxm.c = aoyq2;
                            aotx = (aotx) aovb.a(aowt.a, (audx) (aoxm) o4.i(), aotx.class);
                        } else {
                            throw new GeneralSecurityException("unknown DEM key type");
                        }
                        byte[] a8 = aotx.a(bArr, a);
                        apcr apcr2 = apbr.a;
                        if (apcr2 != null) {
                            bArr7 = apcr2.a();
                        }
                        return ByteBuffer.allocate(bArr7.length + a8.length).put(bArr7).put(a8).array();
                    }
                    throw new GeneralSecurityException("Symmetric key has incorrect length");
                }
                throw new GeneralSecurityException("size too large");
            } catch (IllegalStateException e2) {
                throw new GeneralSecurityException(e2.toString());
            }
        } catch (IllegalArgumentException | NullPointerException e3) {
            throw new GeneralSecurityException(e3.toString());
        }
    }
}
