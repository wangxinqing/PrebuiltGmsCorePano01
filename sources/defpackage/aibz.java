package defpackage;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: aibz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aibz {
    private final Random a;
    private final String b;

    public aibz(Random random, String str) {
        this.a = random;
        this.b = str;
    }

    private static Cipher a(int i, String str, byte[] bArr, byte[] bArr2) {
        Cipher f = jhg.f("AES/CBC/PKCS5Padding");
        if (f != null) {
            f.init(i, new SecretKeySpec(SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1").generateSecret(new PBEKeySpec(str.toCharArray(), bArr2, 2000, 128)).getEncoded(), "PBKDF2WithHmacSHA1"), new IvParameterSpec(bArr));
            return f;
        }
        throw new NoSuchAlgorithmException("No Such Algorithm");
    }

    public final byte[] b(byte[] bArr) {
        try {
            arpe arpe = (arpe) aucj.a((aucj) arpe.d, bArr, aubs.c());
            return a(2, this.b, arpe.a.k(), arpe.b.k()).doFinal(arpe.c.k());
        } catch (auda | GeneralSecurityException e) {
            throw new aicb(e);
        }
    }

    public final byte[] a(byte[] bArr) {
        try {
            byte[] bArr2 = new byte[16];
            byte[] bArr3 = new byte[8];
            this.a.nextBytes(bArr2);
            this.a.nextBytes(bArr3);
            Cipher a2 = a(1, this.b, bArr2, bArr3);
            aucd o = arpe.d.o();
            auay a3 = auay.a(bArr2);
            if (o.c) {
                o.c();
                o.c = false;
            }
            a3.getClass();
            ((arpe) o.b).a = a3;
            auay a4 = auay.a(bArr3);
            if (o.c) {
                o.c();
                o.c = false;
            }
            a4.getClass();
            ((arpe) o.b).b = a4;
            auay a5 = auay.a(a2.doFinal(bArr));
            if (o.c) {
                o.c();
                o.c = false;
            }
            a5.getClass();
            ((arpe) o.b).c = a5;
            return ((arpe) o.i()).k();
        } catch (GeneralSecurityException e) {
            throw new aicb(e);
        }
    }
}
