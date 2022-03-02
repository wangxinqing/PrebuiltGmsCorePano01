package defpackage;

import java.lang.reflect.Array;
import java.math.BigInteger;

/* renamed from: apbz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class apbz {
    static final long[] a = apcp.a(a(e));
    static final apbt[][] b = ((apbt[][]) Array.newInstance(apbt.class, new int[]{32, 8}));
    static final apbt[] c = new apbt[8];
    private static final BigInteger d = BigInteger.valueOf(2).pow(255).subtract(BigInteger.valueOf(19));
    private static final BigInteger e = BigInteger.valueOf(-121665).multiply(BigInteger.valueOf(121666).modInverse(d)).mod(d);
    private static final BigInteger f = BigInteger.valueOf(2).multiply(e).mod(d);
    private static final BigInteger g = BigInteger.valueOf(2).modPow(d.subtract(BigInteger.ONE).divide(BigInteger.valueOf(4)), d);

    static {
        apby apby = new apby();
        apby.b = BigInteger.valueOf(4).multiply(BigInteger.valueOf(5).modInverse(d)).mod(d);
        BigInteger bigInteger = apby.b;
        BigInteger multiply = bigInteger.pow(2).subtract(BigInteger.ONE).multiply(e.multiply(bigInteger.pow(2)).add(BigInteger.ONE).modInverse(d));
        BigInteger modPow = multiply.modPow(d.add(BigInteger.valueOf(3)).divide(BigInteger.valueOf(8)), d);
        if (!modPow.pow(2).subtract(multiply).mod(d).equals(BigInteger.ZERO)) {
            modPow = modPow.multiply(g).mod(d);
        }
        if (modPow.testBit(0)) {
            modPow = d.subtract(modPow);
        }
        apby.a = modPow;
        apcp.a(a(f));
        apcp.a(a(g));
        apby apby2 = apby;
        for (int i = 0; i < 32; i++) {
            apby apby3 = apby2;
            for (int i2 = 0; i2 < 8; i2++) {
                b[i][i2] = a(apby3);
                apby3 = a(apby3, apby2);
            }
            for (int i3 = 0; i3 < 8; i3++) {
                apby2 = a(apby2, apby2);
            }
        }
        apby a2 = a(apby, apby);
        for (int i4 = 0; i4 < 8; i4++) {
            c[i4] = a(apby);
            apby = a(apby, a2);
        }
    }

    private static apbt a(apby apby) {
        return new apbt(apcp.a(a(apby.b.add(apby.a).mod(d))), apcp.a(a(apby.b.subtract(apby.a).mod(d))), apcp.a(a(f.multiply(apby.a).multiply(apby.b).mod(d))));
    }

    private static apby a(apby apby, apby apby2) {
        apby apby3 = new apby();
        BigInteger mod = e.multiply(apby.a.multiply(apby2.a).multiply(apby.b).multiply(apby2.b)).mod(d);
        apby3.a = apby.a.multiply(apby2.b).add(apby2.a.multiply(apby.b)).multiply(BigInteger.ONE.add(mod).modInverse(d)).mod(d);
        apby3.b = apby.b.multiply(apby2.b).add(apby.a.multiply(apby2.a)).multiply(BigInteger.ONE.subtract(mod).modInverse(d)).mod(d);
        return apby3;
    }

    private static byte[] a(BigInteger bigInteger) {
        byte[] bArr = new byte[32];
        byte[] byteArray = bigInteger.toByteArray();
        int length = byteArray.length;
        System.arraycopy(byteArray, 0, bArr, 32 - length, length);
        for (int i = 0; i < 16; i++) {
            byte b2 = bArr[i];
            int i2 = (32 - i) - 1;
            bArr[i] = bArr[i2];
            bArr[i2] = b2;
        }
        return bArr;
    }
}
