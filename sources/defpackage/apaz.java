package defpackage;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: apaz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apaz implements aotx {
    private static final ThreadLocal a = new apax();
    private static final ThreadLocal b = new apay();
    private final byte[] c;
    private final byte[] d;
    private final SecretKeySpec e;
    private final int f;

    public apaz(byte[] bArr, int i) {
        if (i == 12 || i == 16) {
            this.f = i;
            apdc.a(bArr.length);
            this.e = new SecretKeySpec(bArr, "AES");
            Cipher cipher = (Cipher) a.get();
            cipher.init(1, this.e);
            byte[] a2 = a(cipher.doFinal(new byte[16]));
            this.c = a2;
            this.d = a(a2);
            return;
        }
        throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
    }

    private final byte[] a(Cipher cipher, int i, byte[] bArr, int i2, int i3) {
        byte[] bArr2;
        int length;
        byte[] bArr3 = new byte[16];
        bArr3[15] = (byte) i;
        if (i3 == 0) {
            return cipher.doFinal(c(bArr3, this.c));
        }
        byte[] doFinal = cipher.doFinal(bArr3);
        int i4 = 0;
        int i5 = 0;
        while (i3 - i5 > 16) {
            for (int i6 = 0; i6 < 16; i6++) {
                doFinal[i6] = (byte) (doFinal[i6] ^ bArr[(i2 + i5) + i6]);
            }
            doFinal = cipher.doFinal(doFinal);
            i5 += 16;
        }
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i5 + i2, i2 + i3);
        if (copyOfRange.length == 16) {
            bArr2 = c(copyOfRange, this.c);
        } else {
            byte[] copyOf = Arrays.copyOf(this.d, 16);
            while (true) {
                length = copyOfRange.length;
                if (i4 >= length) {
                    break;
                }
                copyOf[i4] = (byte) (copyOf[i4] ^ copyOfRange[i4]);
                i4++;
            }
            copyOf[length] = (byte) (copyOf[length] ^ 128);
            bArr2 = copyOf;
        }
        return cipher.doFinal(c(doFinal, bArr2));
    }

    private static byte[] c(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        byte[] bArr3 = new byte[length];
        for (int i = 0; i < length; i++) {
            bArr3[i] = (byte) (bArr[i] ^ bArr2[i]);
        }
        return bArr3;
    }

    public final byte[] b(byte[] bArr, byte[] bArr2) {
        throw null;
    }

    private static byte[] a(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        int i = 0;
        int i2 = 0;
        while (i2 < 15) {
            byte b2 = bArr[i2];
            int i3 = i2 + 1;
            bArr2[i2] = (byte) (((b2 + b2) ^ ((bArr[i3] & 255) >>> 7)) & 255);
            i2 = i3;
        }
        byte b3 = bArr[15];
        int i4 = b3 + b3;
        if ((bArr[0] & 128) != 0) {
            i = 135;
        }
        bArr2[15] = (byte) (i4 ^ i);
        return bArr2;
    }

    public final byte[] a(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int i = this.f;
        if (length <= (Integer.MAX_VALUE - i) - 16) {
            byte[] bArr3 = new byte[(i + length + 16)];
            byte[] a2 = apcw.a(i);
            System.arraycopy(a2, 0, bArr3, 0, this.f);
            Cipher cipher = (Cipher) a.get();
            cipher.init(1, this.e);
            Cipher cipher2 = cipher;
            byte[] a3 = a(cipher2, 0, a2, 0, a2.length);
            byte[] bArr4 = bArr2;
            byte[] a4 = a(cipher2, 1, bArr4, 0, bArr4.length);
            Cipher cipher3 = (Cipher) b.get();
            cipher3.init(1, this.e, new IvParameterSpec(a3));
            cipher3.doFinal(bArr, 0, length, bArr3, this.f);
            byte[] a5 = a(cipher, 2, bArr3, this.f, length);
            int i2 = length + this.f;
            for (int i3 = 0; i3 < 16; i3++) {
                bArr3[i2 + i3] = (byte) ((a4[i3] ^ a3[i3]) ^ a5[i3]);
            }
            return bArr3;
        }
        throw new GeneralSecurityException("plaintext too long");
    }
}
