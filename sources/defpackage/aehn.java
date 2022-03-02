package defpackage;

import com.google.android.libraries.bluetooth.fastpair.PairingException;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.MessageDigest;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import javax.crypto.KeyAgreement;

/* renamed from: aehn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aehn {
    public final aehf a;
    public final String b;
    public final int c;

    public aehn(aehf aehf, String str, int i) {
        this.a = aehf;
        this.b = str;
        this.c = i;
    }

    private final aehm a(byte[] bArr) {
        byte[] bArr2;
        int length = bArr.length;
        if (length == 64) {
            KeyPair a2 = aegi.a();
            aegi aegi = new aegi((ECPublicKey) a2.getPublic(), (ECPrivateKey) a2.getPrivate());
            ECPublicKey eCPublicKey = aegi.a;
            if (eCPublicKey != null) {
                ECPoint w = eCPublicKey.getW();
                bArr2 = aooa.a(aegi.a(w.getAffineX().toByteArray()), aegi.a(w.getAffineY().toByteArray()));
            } else {
                bArr2 = null;
            }
            if (bArr2 != null) {
                ((anih) ((anih) aehd.a.d()).a("aehn", "a", 96, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Handshake %s, generates key by ECDH.", (Object) this.b);
                KeyAgreement keyAgreement = (KeyAgreement) aegi.a(aegf.a);
                keyAgreement.init(aegi.b);
                keyAgreement.doPhase(((KeyFactory) aegi.a(aegg.a)).generatePublic(new ECPublicKeySpec(new ECPoint(new BigInteger(1, Arrays.copyOf(bArr, 32)), new BigInteger(1, Arrays.copyOfRange(bArr, 32, 64))), ((ECPublicKey) aegi.a().getPublic()).getParams())), true);
                return new aehm(Arrays.copyOf(MessageDigest.getInstance("SHA-256").digest(keyAgreement.generateSecret()), 16), bArr2);
            }
            throw new GeneralSecurityException("Failed to do ECDH.");
        } else if (length == 16) {
            ((anih) ((anih) aehd.a.d()).a("aehn", "a", 102, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Handshake %s, using the given secret.", (Object) this.b);
            return new aehm(bArr, new byte[0]);
        } else {
            StringBuilder sb = new StringBuilder(38);
            sb.append("Key length is not correct: ");
            sb.append(length);
            throw new GeneralSecurityException(sb.toString());
        }
    }

    private final byte[] b(byte[] bArr) {
        aeiy a2 = this.a.a();
        a2.a(TimeUnit.SECONDS.toMillis((long) this.c));
        aeix c2 = a2.c(aeft.a, aefp.a);
        ((anih) ((anih) aehd.a.d()).a("aehn", "b", 122, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Writing handshake packet to address=%s", (Object) this.b);
        a2.a(aeft.a, aefp.a, bArr);
        ((anih) ((anih) aehd.a.d()).a("aehn", "b", 125, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Waiting handshake packet from address=%s", (Object) this.b);
        return c2.a(TimeUnit.SECONDS.toMillis((long) this.c));
    }

    private final String a(byte[] bArr, byte[] bArr2) {
        if (bArr2.length != 16) {
            String valueOf = String.valueOf(anml.g.a(bArr2));
            throw new PairingException(valueOf.length() == 0 ? new String("Handshake failed because of incorrect response: ") : "Handshake failed because of incorrect response: ".concat(valueOf), new Object[0]);
        }
        byte[] b2 = aeev.b(bArr, bArr2);
        byte b3 = b2[0];
        if (b3 == 1) {
            String a2 = aeez.a(Arrays.copyOfRange(b2, 1, 7));
            ((anih) ((anih) aehd.a.d()).a("aehn", "a", 141, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Handshake success with public %s, ble %s", (Object) a2, (Object) this.b);
            return a2;
        }
        StringBuilder sb = new StringBuilder(39);
        sb.append("Handshake response type incorrect: ");
        sb.append(b3);
        throw new PairingException(sb.toString(), new Object[0]);
    }

    public final aegz a(byte[] bArr, aehj aehj) {
        aehm aehm;
        byte[] bArr2;
        byte[] bArr3 = bArr;
        int length = bArr3.length;
        if (length == 64) {
            KeyPair a2 = aegi.a();
            aegi aegi = new aegi((ECPublicKey) a2.getPublic(), (ECPrivateKey) a2.getPrivate());
            ECPublicKey eCPublicKey = aegi.a;
            if (eCPublicKey != null) {
                ECPoint w = eCPublicKey.getW();
                bArr2 = aooa.a(aegi.a(w.getAffineX().toByteArray()), aegi.a(w.getAffineY().toByteArray()));
            } else {
                bArr2 = null;
            }
            if (bArr2 != null) {
                ((anih) ((anih) aehd.a.d()).a("aehn", "a", 96, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Handshake %s, generates key by ECDH.", (Object) this.b);
                KeyAgreement keyAgreement = (KeyAgreement) aegi.a(aegf.a);
                keyAgreement.init(aegi.b);
                keyAgreement.doPhase(((KeyFactory) aegi.a(aegg.a)).generatePublic(new ECPublicKeySpec(new ECPoint(new BigInteger(1, Arrays.copyOf(bArr3, 32)), new BigInteger(1, Arrays.copyOfRange(bArr3, 32, 64))), ((ECPublicKey) aegi.a().getPublic()).getParams())), true);
                aehm = new aehm(Arrays.copyOf(MessageDigest.getInstance("SHA-256").digest(keyAgreement.generateSecret()), 16), bArr2);
            } else {
                throw new GeneralSecurityException("Failed to do ECDH.");
            }
        } else if (length == 16) {
            ((anih) ((anih) aehd.a.d()).a("aehn", "a", 102, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Handshake %s, using the given secret.", (Object) this.b);
            aehm = new aehm(bArr3, new byte[0]);
        } else {
            StringBuilder sb = new StringBuilder(38);
            sb.append("Key length is not correct: ");
            sb.append(length);
            throw new GeneralSecurityException(sb.toString());
        }
        ((anih) ((anih) aehd.a.d()).a("aehn", "a", 80, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Handshake %s, flags %s.", (Object) this.b, aehj.b);
        byte[] a3 = aooa.a(aeev.a(aehm.a, aehj.a()), aehm.b);
        aeiy a4 = this.a.a();
        a4.a(TimeUnit.SECONDS.toMillis((long) this.c));
        aeix c2 = a4.c(aeft.a, aefp.a);
        ((anih) ((anih) aehd.a.d()).a("aehn", "b", 122, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Writing handshake packet to address=%s", (Object) this.b);
        a4.a(aeft.a, aefp.a, a3);
        ((anih) ((anih) aehd.a.d()).a("aehn", "b", 125, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Waiting handshake packet from address=%s", (Object) this.b);
        byte[] a5 = c2.a(TimeUnit.SECONDS.toMillis((long) this.c));
        byte[] bArr4 = aehm.a;
        if (a5.length != 16) {
            String valueOf = String.valueOf(anml.g.a(a5));
            throw new PairingException(valueOf.length() == 0 ? new String("Handshake failed because of incorrect response: ") : "Handshake failed because of incorrect response: ".concat(valueOf), new Object[0]);
        }
        byte[] b2 = aeev.b(bArr4, a5);
        byte b3 = b2[0];
        if (b3 == 1) {
            String a6 = aeez.a(Arrays.copyOfRange(b2, 1, 7));
            ((anih) ((anih) aehd.a.d()).a("aehn", "a", 141, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Handshake success with public %s, ble %s", (Object) a6, (Object) this.b);
            return new aeew(aehm.a, a6);
        }
        StringBuilder sb2 = new StringBuilder(39);
        sb2.append("Handshake response type incorrect: ");
        sb2.append(b3);
        throw new PairingException(sb2.toString(), new Object[0]);
    }
}
