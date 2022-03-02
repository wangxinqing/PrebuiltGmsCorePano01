package defpackage;

import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: ausf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ausf implements ausd {
    static final BigInteger[] a = {new BigInteger(new byte[]{25, -127, -5, 67, -15, 3, 41, 14, -49, -105, 114, 2, 45, -72, -79, -101, -6, -13, -119, 5, 126, -39, 30, -124, -122, -21, 54, -121, 99, 67, 89, 37}), new BigInteger(new byte[]{10, 113, 76, 52, -13, -75, -120, -86, -55, 47, -46, 88, 120, -124, -94, 9, 100, -3, 53, 26, 31, 20, 125, 92, 75, -65, 92, 47, 55, -89, 124, 54}), BigInteger.ONE, new BigInteger(new byte[]{4, -113, -63, -50, -27, -125, -103, 37, -27, -101, Byte.MIN_VALUE, -22, -83, -126, -84, 10, 60, -2, -59, 96, -109, 89, -117, 72, 68, -35, 42, 62, 36, 93, -120, 51})};
    static final BigInteger[] b = {new BigInteger(new byte[]{32, 26, 24, 79, 71, -39, -89, -105, 56, -111, -47, 72, -29, -47, -56, 100, -40, 8, 69, 71, 19, 28, 44, 28, -17, -73, -18, -67, 38, -58, 53, 103}), new BigInteger(new byte[]{109, -94, -45, -79, -114, -60, -7, -86, 59, 8, -29, -100, -103, 124, -40, -65, 110, -103, 72, -1, -44, -2, -1, -20, -81, -115, -48, -77, -42, 72, -73, -24}), BigInteger.ONE, new BigInteger(new byte[]{22, 64, -19, 90, 84, -6, 11, 7, 34, -122, -23, -46, 47, 70, 71, 99, -5, -10, 13, 121, 29, 55, -71, 9, 59, 88, 77, -12, -55, -107, -9, -127})};
    static final BigInteger[] c = {new BigInteger(new byte[]{33, 105, 54, -45, -51, 110, 83, -2, -64, -92, -30, 49, -3, -42, -36, 92, 105, 44, -57, 96, -107, 37, -89, -78, -55, 86, 45, 96, -113, 37, -43, 26}), new BigInteger(new byte[]{102, 102, 102, 102, 102, 102, 102, 102, 102, 102, 102, 102, 102, 102, 102, 102, 102, 102, 102, 102, 102, 102, 102, 102, 102, 102, 102, 102, 102, 102, 102, 88}), BigInteger.ONE, new BigInteger(new byte[]{103, -121, 95, 15, -41, -117, 118, 101, 102, -22, 78, -114, 100, -85, -29, 125, 32, -16, -97, Byte.MIN_VALUE, 119, 81, 82, -11, 109, -34, -118, -77, -91, -73, -35, -93})};
    public byte[] d;
    public int e;
    private BigInteger f;
    private BigInteger g;
    private BigInteger[] h;
    private BigInteger[] i;
    private BigInteger[] j;
    private BigInteger[] k;
    private BigInteger[] l;

    public ausf(int i2, byte[] bArr) {
        BigInteger bigInteger;
        if (bArr.length >= 4) {
            this.e = i2;
            this.f = new BigInteger(1, b(bArr));
            do {
                bigInteger = new BigInteger(PSKKeyManager.MAX_KEY_LENGTH_BYTES, new SecureRandom());
                this.g = bigInteger;
            } while (bigInteger.equals(BigInteger.ZERO));
            try {
                this.h = ausn.a(c, this.g);
            } catch (ausm e2) {
                throw new ausp("Could not make public key point", e2);
            }
        } else {
            throw new ausp("Passwords must be at least 4 bytes");
        }
    }

    private final byte[] a(boolean z) {
        BigInteger[] bigIntegerArr;
        if (!z) {
            try {
                bigIntegerArr = b;
            } catch (ausm e2) {
                throw new ausp("Could not make commitment point message", e2);
            }
        } else {
            bigIntegerArr = a;
        }
        BigInteger[] a2 = ausn.a(bigIntegerArr, this.f);
        this.l = a2;
        BigInteger[] b2 = ausn.b(a2, this.h);
        this.l = b2;
        this.k = ausn.a(b2);
        aucd o = ausl.f.o();
        aucd o2 = ausi.e.o();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        ausi ausi = (ausi) o2.b;
        ausi.b = 1;
        ausi.a |= 1;
        auay a3 = auay.a(this.k[0].toByteArray());
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        ausi ausi2 = (ausi) o2.b;
        a3.getClass();
        int i2 = 2;
        ausi2.a |= 2;
        ausi2.c = a3;
        auay a4 = auay.a(this.k[1].toByteArray());
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        ausi ausi3 = (ausi) o2.b;
        a4.getClass();
        ausi3.a |= 4;
        ausi3.d = a4;
        ausi ausi4 = (ausi) o2.i();
        if (o.c) {
            o.c();
            o.c = false;
        }
        ausl ausl = (ausl) o.b;
        ausi4.getClass();
        ausl.c = ausi4;
        int i3 = ausl.a | 2;
        ausl.a = i3;
        if (z) {
            i2 = 1;
        }
        ausl.a = i3 | 1;
        ausl.b = i2;
        return ((ausl) o.i()).k();
    }

    private final void b(boolean z) {
        BigInteger[] bigIntegerArr;
        int i2 = this.e;
        if (i2 == 5 || i2 == 2) {
            if (!z) {
                try {
                    bigIntegerArr = a;
                } catch (ausm e2) {
                    throw new ausp("Error computing shared key", e2);
                }
            } else {
                bigIntegerArr = b;
            }
            this.d = b(a(ausn.a(ausn.a(ausn.a(this.j, ausn.a(bigIntegerArr, this.f)), this.g))));
            return;
        }
        String a2 = ause.a(i2);
        StringBuilder sb = new StringBuilder(a2.length() + 33);
        sb.append("Cannot make shared key in state: ");
        sb.append(a2);
        throw new ausp(sb.toString());
    }

    public final byte[] a(byte[] bArr) {
        throw null;
    }

    public final byte[] c() {
        int i2 = this.e;
        int i3 = i2 - 1;
        if (i2 == 0) {
            throw null;
        } else if (i3 == 0) {
            byte[] a2 = a(true);
            this.e = 2;
            return a2;
        } else if (i3 == 2) {
            byte[] a3 = a(true, (byte[]) null);
            this.e = 4;
            return a3;
        } else if (i3 == 5) {
            byte[] a4 = a(false);
            this.e = 7;
            return a4;
        } else if (i3 == 7) {
            byte[] a5 = a(false, (byte[]) null);
            this.e = 9;
            return a5;
        } else {
            String a6 = ause.a(i2);
            StringBuilder sb = new StringBuilder(a6.length() + 34);
            sb.append("Cannot get next message in state: ");
            sb.append(a6);
            throw new ausp(sb.toString());
        }
    }

    public final aurx d() {
        throw null;
    }

    private final void b(byte[] bArr, boolean z) {
        try {
            ausl ausl = (ausl) aucj.a((aucj) ausl.f, bArr);
            int i2 = ausl.a;
            if ((i2 & 1) != 0) {
                if (ausl.b != (!z ? 1 : 2)) {
                    throw new ausp("Commitment message has wrong flow number");
                } else if ((i2 & 2) != 0) {
                    ausi ausi = ausl.c;
                    if (ausi == null) {
                        ausi = ausi.e;
                    }
                    int i3 = ausi.a;
                    if ((i3 & 1) != 0) {
                        int i4 = ausi.b;
                        if ((i3 & 2) == 0) {
                            throw new ausp("Commitment point missing x coordinate");
                        } else if ((i3 & 4) != 0) {
                            BigInteger[] bigIntegerArr = {new BigInteger(ausi.c.k()), new BigInteger(ausi.d.k())};
                            this.i = bigIntegerArr;
                            try {
                                ausn.c(bigIntegerArr);
                                BigInteger bigInteger = bigIntegerArr[0];
                                BigInteger bigInteger2 = bigIntegerArr[1];
                                if (bigInteger.signum() != 1 || bigInteger2.signum() != 1) {
                                    throw new ausm("Point encoding must use only positive integers");
                                } else if (bigInteger.compareTo(ausn.a) >= 0 || bigInteger2.compareTo(ausn.a) >= 0) {
                                    throw new ausm("Point lies outside of the expected field");
                                } else {
                                    BigInteger multiply = bigInteger.multiply(bigInteger);
                                    BigInteger multiply2 = bigInteger2.multiply(bigInteger2);
                                    if (multiply.negate().add(multiply2).mod(ausn.a).equals(BigInteger.ONE.add(ausn.b.multiply(multiply).multiply(multiply2)).mod(ausn.a))) {
                                        BigInteger[] bigIntegerArr2 = this.i;
                                        ausn.c(bigIntegerArr2);
                                        this.j = new BigInteger[]{bigIntegerArr2[0], bigIntegerArr2[1], BigInteger.ONE, bigIntegerArr2[0].multiply(bigIntegerArr2[1]).mod(ausn.a)};
                                        return;
                                    }
                                    throw new ausm("Point does not lie on the expected curve");
                                }
                            } catch (ausm e2) {
                                throw new ausp("Error validating their commitment point", e2);
                            }
                        } else {
                            throw new ausp("Commitment point missing y coordinate");
                        }
                    } else {
                        throw new ausp("Commitment message has wrong curve");
                    }
                } else {
                    throw new ausp("Commitment message missing point");
                }
            } else {
                throw new ausp("Commitment message missing flow number");
            }
        } catch (auda e3) {
            throw new ausp("Could not parse commitment message", e3);
        }
    }

    public final byte[] c(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            throw new ausp("Handshake message too short");
        }
        byte[] bArr2 = new byte[0];
        int i2 = this.e;
        int i3 = i2 - 1;
        if (i2 == 0) {
            throw null;
        } else if (i3 == 1) {
            b(bArr, true);
            b(true);
            this.e = 3;
            return bArr2;
        } else if (i3 == 6) {
            a(bArr, false);
            this.e = 8;
            return bArr2;
        } else if (i3 == 3) {
            byte[] a2 = a(bArr, true);
            this.e = 9;
            return a2;
        } else if (i3 == 4) {
            b(bArr, false);
            b(false);
            this.e = 6;
            return bArr2;
        } else {
            String a3 = ause.a(i2);
            StringBuilder sb = new StringBuilder(a3.length() + 31);
            sb.append("Cannot parse message in state: ");
            sb.append(a3);
            throw new ausp(sb.toString());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0060, code lost:
        if (r4 == 0) goto L_0x0065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0063, code lost:
        if (r1 == r0) goto L_0x0065;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final byte[] a(byte[] r9, boolean r10) {
        /*
            r8 = this;
            ausl r0 = defpackage.ausl.f     // Catch:{ auda -> 0x00d9 }
            aucj r9 = defpackage.aucj.a((defpackage.aucj) r0, (byte[]) r9)     // Catch:{ auda -> 0x00d9 }
            ausl r9 = (defpackage.ausl) r9     // Catch:{ auda -> 0x00d9 }
            int r0 = r9.a
            r1 = r0 & 1
            if (r1 == 0) goto L_0x00d1
            r1 = 3
            r2 = 4
            if (r10 != 0) goto L_0x0014
            r3 = 3
            goto L_0x0015
        L_0x0014:
            r3 = 4
        L_0x0015:
            int r4 = r9.b
            if (r4 != r3) goto L_0x00b0
            r0 = r0 & r2
            if (r0 == 0) goto L_0x00a8
            auay r0 = r9.d
            byte[] r0 = r0.k()
            byte[][] r2 = new byte[r2][]
            r3 = 1
            byte[] r4 = new byte[r3]
            r5 = 0
            r4[r5] = r10
            r2[r5] = r4
            java.math.BigInteger[] r4 = r8.k
            byte[] r4 = a((java.math.BigInteger[]) r4)
            r2[r3] = r4
            r4 = 2
            java.math.BigInteger[] r6 = r8.i
            byte[] r6 = a((java.math.BigInteger[]) r6)
            r2[r4] = r6
            byte[] r4 = r8.d
            r2[r1] = r4
            byte[] r1 = a((byte[][]) r2)
            byte[] r1 = b((byte[]) r1)
            if (r1 == 0) goto L_0x0063
            if (r0 == 0) goto L_0x0063
            int r2 = r1.length
            int r4 = r0.length
            if (r2 != r4) goto L_0x00a0
            r2 = 0
            r4 = 0
        L_0x0053:
            int r6 = r0.length
            if (r2 >= r6) goto L_0x0060
            byte r6 = r1[r2]
            byte r7 = r0[r2]
            r6 = r6 ^ r7
            r4 = r4 | r6
            byte r4 = (byte) r4
            int r2 = r2 + 1
            goto L_0x0053
        L_0x0060:
            if (r4 != 0) goto L_0x00a0
            goto L_0x0065
        L_0x0063:
            if (r1 != r0) goto L_0x00a0
        L_0x0065:
            if (r10 == 0) goto L_0x009c
            int r10 = r9.a
            r10 = r10 & 8
            if (r10 == 0) goto L_0x009c
            javax.crypto.spec.SecretKeySpec r10 = new javax.crypto.spec.SecretKeySpec     // Catch:{ SignatureException -> 0x0093 }
            byte[] r0 = r8.d     // Catch:{ SignatureException -> 0x0093 }
            java.lang.String r1 = "AES"
            r10.<init>(r0, r1)     // Catch:{ SignatureException -> 0x0093 }
            auay r9 = r9.e     // Catch:{ SignatureException -> 0x0093 }
            byte[] r9 = r9.k()     // Catch:{ SignatureException -> 0x0093 }
            aush r9 = defpackage.ausa.a((javax.crypto.SecretKey) r10, (byte[]) r9)     // Catch:{ SignatureException -> 0x0093 }
            int r10 = r9.c     // Catch:{ SignatureException -> 0x0093 }
            if (r10 != r3) goto L_0x008b
            auay r9 = r9.b     // Catch:{ SignatureException -> 0x0093 }
            byte[] r9 = r9.k()     // Catch:{ SignatureException -> 0x0093 }
            return r9
        L_0x008b:
            ausp r9 = new ausp     // Catch:{ SignatureException -> 0x0093 }
            java.lang.String r10 = "Incorrect sequence number in responder hello"
            r9.<init>((java.lang.String) r10)     // Catch:{ SignatureException -> 0x0093 }
            throw r9     // Catch:{ SignatureException -> 0x0093 }
        L_0x0093:
            r9 = move-exception
            ausp r10 = new ausp
            java.lang.String r0 = "Error recovering payload from hash message"
            r10.<init>(r0, r9)
            throw r10
        L_0x009c:
            byte[] r9 = new byte[r5]
            return r9
        L_0x00a0:
            ausp r9 = new ausp
            java.lang.String r10 = "Hash message had incorrect hash value"
            r9.<init>((java.lang.String) r10)
            throw r9
        L_0x00a8:
            ausp r9 = new ausp
            java.lang.String r10 = "Hash message missing hash value"
            r9.<init>((java.lang.String) r10)
            throw r9
        L_0x00b0:
            ausp r9 = new ausp
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r0 = 78
            r10.<init>(r0)
            java.lang.String r0 = "Hash message has flow number "
            r10.append(r0)
            r10.append(r4)
            java.lang.String r0 = ", but expected flow number "
            r10.append(r0)
            r10.append(r3)
            java.lang.String r10 = r10.toString()
            r9.<init>((java.lang.String) r10)
            throw r9
        L_0x00d1:
            ausp r9 = new ausp
            java.lang.String r10 = "Hash message missing flow number"
            r9.<init>((java.lang.String) r10)
            throw r9
        L_0x00d9:
            r9 = move-exception
            ausp r10 = new ausp
            java.lang.String r0 = "Could not parse hash message"
            r10.<init>(r0, r9)
            goto L_0x00e3
        L_0x00e2:
            throw r10
        L_0x00e3:
            goto L_0x00e2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ausf.a(byte[], boolean):byte[]");
    }

    private static byte[] b(byte[] bArr) {
        try {
            return MessageDigest.getInstance("SHA-256").digest(bArr);
        } catch (NoSuchAlgorithmException e2) {
            throw new ausp("Error performing hash", e2);
        }
    }

    public final boolean b() {
        int i2 = this.e;
        int i3 = i2 - 1;
        if (i2 != 0) {
            return i3 == 8 || i3 == 9;
        }
        throw null;
    }

    private static final byte[] a(BigInteger[] bigIntegerArr) {
        return a(bigIntegerArr[0].toByteArray(), bigIntegerArr[1].toByteArray());
    }

    private static byte[] a(byte[]... bArr) {
        int i2 = 0;
        for (byte[] length : bArr) {
            i2 += length.length;
        }
        byte[] bArr2 = new byte[i2];
        int i3 = 0;
        for (byte[] bArr3 : bArr) {
            int length2 = bArr3.length;
            System.arraycopy(bArr3, 0, bArr2, i3, length2);
            i3 += length2;
        }
        return bArr2;
    }

    public final byte[] a(boolean z, byte[] bArr) {
        aucd o = ausl.f.o();
        int i2 = 4;
        auay a2 = auay.a(b(a(new byte[]{!z}, a(this.i), a(this.k), this.d)));
        if (o.c) {
            o.c();
            o.c = false;
        }
        ausl ausl = (ausl) o.b;
        a2.getClass();
        int i3 = ausl.a | 4;
        ausl.a = i3;
        ausl.d = a2;
        if (z) {
            i2 = 3;
        }
        ausl.a = i3 | 1;
        ausl.b = i2;
        if (this.e == 8 && bArr != null) {
            try {
                auay a3 = auay.a(ausa.a(new ausv(13, aurx.a(bArr, 1).k()), (SecretKey) new SecretKeySpec(this.d, "AES")));
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                ausl ausl2 = (ausl) o.b;
                a3.getClass();
                ausl2.a = 8 | ausl2.a;
                ausl2.e = a3;
            } catch (InvalidKeyException | NoSuchAlgorithmException e2) {
                throw new ausp("Cannot set payload", e2);
            }
        }
        return ((ausl) o.i()).k();
    }
}
