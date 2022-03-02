package defpackage;

import java.math.BigInteger;

/* renamed from: ausn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ausn {
    public static final BigInteger a = new BigInteger("7FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFED", 16);
    public static final BigInteger b = new BigInteger("52036CEE2B6FFE738CC740797779E89800700A4D4141D8AB75EB4DCA135978A3", 16);
    static final BigInteger[] c = {BigInteger.ZERO, BigInteger.ONE, BigInteger.ONE, BigInteger.ZERO};
    private static final BigInteger d = new BigInteger("2406D9DC56DFFCE7198E80F2EEF3D13000E0149A8283B156EBD69B9426B2F159", 16);

    static BigInteger[] a(BigInteger[] bigIntegerArr) {
        b(bigIntegerArr);
        return new BigInteger[]{bigIntegerArr[0].multiply(bigIntegerArr[2].modInverse(a)).mod(a), bigIntegerArr[1].multiply(bigIntegerArr[2].modInverse(a)).mod(a)};
    }

    static void b(BigInteger[] bigIntegerArr) {
        if (bigIntegerArr == null || bigIntegerArr.length != 4 || bigIntegerArr[0] == null || bigIntegerArr[1] == null || bigIntegerArr[2] == null || bigIntegerArr[3] == null) {
            throw new ausm("Point is not in extended representation");
        }
    }

    static void c(BigInteger[] bigIntegerArr) {
        if (bigIntegerArr == null || bigIntegerArr[0] == null || bigIntegerArr[1] == null) {
            throw new ausm("Point is not in affine representation");
        }
    }

    static BigInteger[] a(BigInteger[] bigIntegerArr, BigInteger bigInteger) {
        b(bigIntegerArr);
        if (bigInteger == null) {
            throw new ausm("Can't multiply point by null");
        } else if (bigInteger.bitLength() <= 256) {
            BigInteger[] bigIntegerArr2 = c;
            BigInteger[] bigIntegerArr3 = bigIntegerArr2;
            for (int i = 0; i < 256; i++) {
                if (bigInteger.testBit(i)) {
                    bigIntegerArr2 = b(bigIntegerArr2, bigIntegerArr);
                } else {
                    bigIntegerArr3 = b(bigIntegerArr2, bigIntegerArr);
                }
                if (i < 255) {
                    b(bigIntegerArr);
                    BigInteger multiply = bigIntegerArr[3].pow(2).multiply(d);
                    BigInteger shiftLeft = bigIntegerArr[2].pow(2).shiftLeft(1);
                    BigInteger shiftLeft2 = bigIntegerArr[1].multiply(bigIntegerArr[0]).shiftLeft(2);
                    BigInteger subtract = shiftLeft.subtract(multiply);
                    BigInteger add = shiftLeft.add(multiply);
                    BigInteger shiftLeft3 = bigIntegerArr[1].pow(2).add(bigIntegerArr[0].pow(2)).shiftLeft(1);
                    bigIntegerArr = new BigInteger[]{shiftLeft2.multiply(subtract).mod(a), add.multiply(shiftLeft3).mod(a), subtract.multiply(add).mod(a), shiftLeft2.multiply(shiftLeft3).mod(a)};
                }
            }
            return b(bigIntegerArr2, a(bigIntegerArr3, bigIntegerArr3));
        } else {
            throw new ausm("Refuse to multiply point by scalar with more than 256 bits");
        }
    }

    static BigInteger[] b(BigInteger[] bigIntegerArr, BigInteger[] bigIntegerArr2) {
        b(bigIntegerArr);
        b(bigIntegerArr2);
        BigInteger multiply = bigIntegerArr[1].subtract(bigIntegerArr[0]).multiply(bigIntegerArr2[1].subtract(bigIntegerArr2[0]));
        BigInteger multiply2 = bigIntegerArr[1].add(bigIntegerArr[0]).multiply(bigIntegerArr2[1].add(bigIntegerArr2[0]));
        BigInteger multiply3 = bigIntegerArr[3].multiply(d).multiply(bigIntegerArr2[3]);
        BigInteger bigInteger = bigIntegerArr[2];
        BigInteger multiply4 = bigInteger.add(bigInteger).multiply(bigIntegerArr2[2]);
        BigInteger subtract = multiply2.subtract(multiply);
        BigInteger subtract2 = multiply4.subtract(multiply3);
        BigInteger add = multiply4.add(multiply3);
        BigInteger add2 = multiply2.add(multiply);
        return new BigInteger[]{subtract.multiply(subtract2).mod(a), add.multiply(add2).mod(a), subtract2.multiply(add).mod(a), subtract.multiply(add2).mod(a)};
    }

    static BigInteger[] a(BigInteger[] bigIntegerArr, BigInteger[] bigIntegerArr2) {
        b(bigIntegerArr);
        b(bigIntegerArr2);
        return b(bigIntegerArr, new BigInteger[]{bigIntegerArr2[0].negate(), bigIntegerArr2[1], bigIntegerArr2[2], bigIntegerArr2[3].negate()});
    }
}
