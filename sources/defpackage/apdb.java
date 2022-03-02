package defpackage;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.Arrays;

/* renamed from: apdb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apdb {
    public static String a(int i) {
        String a = apco.a(i);
        int i2 = apdc.a;
        StringBuilder sb = new StringBuilder(a.length() + 9);
        sb.append(a);
        sb.append("withECDSA");
        return sb.toString();
    }

    public static String b(int i) {
        int i2 = i - 1;
        return i2 != 1 ? i2 != 2 ? "SHA-512" : "SHA-384" : "SHA-256";
    }

    public static BigInteger a(byte[] bArr) {
        return new BigInteger(1, bArr);
    }

    public static boolean a() {
        try {
            Class.forName("android.app.Application", false, (ClassLoader) null);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static byte[] a(BigInteger bigInteger, int i) {
        byte[] byteArray = bigInteger.toByteArray();
        int length = byteArray.length;
        if (length == i) {
            return byteArray;
        }
        int i2 = i + 1;
        if (length > i2) {
            throw new GeneralSecurityException("integer too large");
        } else if (length != i2) {
            byte[] bArr = new byte[i];
            System.arraycopy(byteArray, 0, bArr, i - length, length);
            return bArr;
        } else if (byteArray[0] == 0) {
            return Arrays.copyOfRange(byteArray, 1, length);
        } else {
            throw new GeneralSecurityException("integer too large");
        }
    }

    public static byte[] a(byte[] bArr, int i, int i2) {
        MessageDigest messageDigest = (MessageDigest) apcf.d.a(b(i2));
        int digestLength = messageDigest.getDigestLength();
        byte[] bArr2 = new byte[i];
        int i3 = 0;
        for (int i4 = 0; i4 <= (i - 1) / digestLength; i4++) {
            messageDigest.reset();
            messageDigest.update(bArr);
            messageDigest.update(a(BigInteger.valueOf((long) i4), 4));
            byte[] digest = messageDigest.digest();
            int length = digest.length;
            System.arraycopy(digest, 0, bArr2, i3, Math.min(length, i - i3));
            i3 += length;
        }
        return bArr2;
    }
}
