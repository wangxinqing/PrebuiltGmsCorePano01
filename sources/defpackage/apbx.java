package defpackage;

import java.security.MessageDigest;
import java.util.Arrays;

/* renamed from: apbx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apbx {
    public static final /* synthetic */ int a = 0;
    private static final apbt b = new apbt(new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0});
    private static final apbu c = new apbu(new apbv(new long[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}), new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0});

    private static int a(int i, int i2) {
        int i3 = ((i ^ i2) ^ -1) & 255;
        int i4 = i3 & (i3 << 4);
        int i5 = i4 & (i4 << 2);
        return (i5 & (i5 + i5)) >> 7;
    }

    private static long b(byte[] bArr, int i) {
        return (((long) (bArr[i + 3] & 255)) << 24) | a(bArr, i);
    }

    private static apbv c(byte[] bArr) {
        int i;
        byte[] bArr2 = new byte[64];
        int i2 = 0;
        while (true) {
            if (i2 >= 32) {
                break;
            }
            int i3 = i2 + i2;
            bArr2[i3] = (byte) (bArr[i2] & 15);
            bArr2[i3 + 1] = (byte) ((bArr[i2] & 255) >> 4);
            i2++;
        }
        int i4 = 0;
        byte b2 = 0;
        while (i4 < 63) {
            byte b3 = (byte) (bArr2[i4] + b2);
            bArr2[i4] = b3;
            int i5 = (b3 + 8) >> 4;
            bArr2[i4] = (byte) (b3 - (i5 << 4));
            i4++;
            b2 = i5;
        }
        bArr2[63] = (byte) (bArr2[63] + b2);
        apbu apbu = new apbu(c);
        apbw apbw = new apbw();
        for (i = 1; i < 64; i += 2) {
            apbt apbt = new apbt(b);
            a(apbt, i / 2, bArr2[i]);
            apbw.a(apbw, apbu);
            a(apbu, apbw, apbt);
        }
        apbv apbv = new apbv();
        apbv.a(apbv, apbu);
        a(apbu, apbv);
        apbv.a(apbv, apbu);
        a(apbu, apbv);
        apbv.a(apbv, apbu);
        a(apbu, apbv);
        apbv.a(apbv, apbu);
        a(apbu, apbv);
        for (int i6 = 0; i6 < 64; i6 += 2) {
            apbt apbt2 = new apbt(b);
            a(apbt2, i6 / 2, bArr2[i6]);
            apbw.a(apbw, apbu);
            a(apbu, apbw, apbt2);
        }
        apbv apbv2 = new apbv(apbu);
        long[] jArr = new long[10];
        apcp.b(jArr, apbv2.a);
        long[] jArr2 = new long[10];
        apcp.b(jArr2, apbv2.b);
        long[] jArr3 = new long[10];
        apcp.b(jArr3, apbv2.c);
        long[] jArr4 = new long[10];
        apcp.b(jArr4, jArr3);
        long[] jArr5 = new long[10];
        apcp.b(jArr5, jArr2, jArr);
        apcp.c(jArr5, jArr5, jArr3);
        long[] jArr6 = new long[10];
        apcp.c(jArr6, jArr, jArr2);
        apcp.c(jArr6, jArr6, apbz.a);
        apcp.a(jArr6, jArr6, jArr4);
        apcp.a(jArr6, jArr6);
        if (apbg.a(apcp.a(jArr5), apcp.a(jArr6))) {
            return apbv2;
        }
        throw new IllegalStateException("arithmetic error in scalar multiplication");
    }

    private static void d(byte[] bArr) {
        byte[] bArr2 = bArr;
        long a2 = a(bArr2, 0);
        long b2 = b(bArr2, 2);
        long a3 = a(bArr2, 5);
        long b3 = b(bArr2, 7);
        long b4 = b(bArr2, 10);
        long a4 = a(bArr2, 13);
        long b5 = b(bArr2, 15);
        long a5 = a(bArr2, 18);
        long a6 = a(bArr2, 21);
        long b6 = b(bArr2, 23);
        long a7 = a(bArr2, 26);
        long b7 = b(bArr2, 28);
        long b8 = b(bArr2, 31);
        long a8 = a(bArr2, 34);
        long b9 = b(bArr2, 36);
        long a9 = a(bArr2, 39);
        long a10 = a(bArr2, 42);
        long b10 = b(bArr2, 44);
        long a11 = (a(bArr2, 47) >> 2) & 2097151;
        long b11 = (b(bArr2, 49) >> 7) & 2097151;
        long b12 = (b(bArr2, 52) >> 4) & 2097151;
        long a12 = (a(bArr2, 55) >> 1) & 2097151;
        long b13 = (b(bArr2, 57) >> 6) & 2097151;
        long b14 = b(bArr2, 60) >> 3;
        long j = (a10 & 2097151) - (b14 * 683901);
        long j2 = ((((b9 >> 6) & 2097151) - (b14 * 997805)) + (b13 * 136657)) - (a12 * 683901);
        long j3 = ((((((b8 >> 4) & 2097151) + (b14 * 470296)) + (b13 * 654183)) - (a12 * 997805)) + (b12 * 136657)) - (b11 * 683901);
        long j4 = ((b5 >> 6) & 2097151) + (a11 * 666643);
        long j5 = (a6 & 2097151) + (b12 * 666643) + (b11 * 470296) + (a11 * 654183);
        long j6 = ((((((a7 >> 2) & 2097151) + (b13 * 666643)) + (a12 * 470296)) + (b12 * 654183)) - (b11 * 997805)) + (a11 * 136657);
        long j7 = (j4 + 1048576) >> 21;
        long j8 = (a5 >> 3) + (b11 * 666643) + (a11 * 470296) + j7;
        long j9 = (j5 + 1048576) >> 21;
        long j10 = ((((((b6 >> 5) & 2097151) + (a12 * 666643)) + (b12 * 470296)) + (b11 * 654183)) - (a11 * 997805)) + j9;
        long j11 = (j6 + 1048576) >> 21;
        long j12 = ((((((((b7 >> 7) & 2097151) + (b14 * 666643)) + (b13 * 470296)) + (a12 * 654183)) - (b12 * 997805)) + (b11 * 136657)) - (a11 * 683901)) + j11;
        long j13 = (j3 + 1048576) >> 21;
        long j14 = ((((((a8 >> 1) & 2097151) + (b14 * 654183)) - (b13 * 997805)) + (a12 * 136657)) - (b12 * 683901)) + j13;
        long j15 = (j2 + 1048576) >> 21;
        long j16 = (((a9 >> 3) + (b14 * 136657)) - (b13 * 683901)) + j15;
        long j17 = (j + 1048576) >> 21;
        long j18 = ((b10 >> 5) & 2097151) + j17;
        long j19 = (j8 + 1048576) >> 21;
        long j20 = (j10 + 1048576) >> 21;
        long j21 = (j12 + 1048576) >> 21;
        long j22 = (j3 - (j13 << 21)) + j21;
        long j23 = (j14 + 1048576) >> 21;
        long j24 = (j2 - (j15 << 21)) + j23;
        long j25 = j14 - (j23 << 21);
        long j26 = (j16 + 1048576) >> 21;
        long j27 = (j - (j17 << 21)) + j26;
        long j28 = j16 - (j26 << 21);
        long j29 = ((j6 - (j11 << 21)) + j20) - (j18 * 683901);
        long j30 = ((((j5 - (j9 << 21)) + j19) - (j18 * 997805)) + (j27 * 136657)) - (j28 * 683901);
        long j31 = (((((j4 - (j7 << 21)) + (j18 * 470296)) + (j27 * 654183)) - (j28 * 997805)) + (j24 * 136657)) - (j25 * 683901);
        long j32 = (a2 & 2097151) + (j22 * 666643);
        long j33 = ((a3 >> 2) & 2097151) + (j24 * 666643) + (j25 * 470296) + (j22 * 654183);
        long j34 = ((((((b4 >> 4) & 2097151) + (j27 * 666643)) + (j28 * 470296)) + (j24 * 654183)) - (j25 * 997805)) + (j22 * 136657);
        long j35 = (j32 + 1048576) >> 21;
        long j36 = ((b2 >> 5) & 2097151) + (j25 * 666643) + (j22 * 470296) + j35;
        long j37 = (j33 + 1048576) >> 21;
        long j38 = ((((((b3 >> 7) & 2097151) + (j28 * 666643)) + (j24 * 470296)) + (j25 * 654183)) - (j22 * 997805)) + j37;
        long j39 = (j34 + 1048576) >> 21;
        long j40 = ((((((((a4 >> 1) & 2097151) + (j18 * 666643)) + (j27 * 470296)) + (j28 * 654183)) - (j24 * 997805)) + (j25 * 136657)) - (j22 * 683901)) + j39;
        long j41 = (j31 + 1048576) >> 21;
        long j42 = (((((j8 - (j19 << 21)) + (j18 * 654183)) - (j27 * 997805)) + (j28 * 136657)) - (j24 * 683901)) + j41;
        long j43 = (j30 + 1048576) >> 21;
        long j44 = (((j10 - (j20 << 21)) + (j18 * 136657)) - (j27 * 683901)) + j43;
        long j45 = (j29 + 1048576) >> 21;
        long j46 = (j12 - (j21 << 21)) + j45;
        long j47 = (j36 + 1048576) >> 21;
        long j48 = (j38 + 1048576) >> 21;
        long j49 = (j40 + 1048576) >> 21;
        long j50 = (j42 + 1048576) >> 21;
        long j51 = (j44 + 1048576) >> 21;
        long j52 = (j46 + 1048576) >> 21;
        long j53 = (j32 - (j35 << 21)) + (j52 * 666643);
        long j54 = j53 >> 21;
        long j55 = (j36 - (j47 << 21)) + (j52 * 470296) + j54;
        long j56 = j55 >> 21;
        long j57 = (j33 - (j37 << 21)) + j47 + (j52 * 654183) + j56;
        long j58 = j57 >> 21;
        long j59 = ((j38 - (j48 << 21)) - (j52 * 997805)) + j58;
        long j60 = j59 >> 21;
        long j61 = (j34 - (j39 << 21)) + j48 + (j52 * 136657) + j60;
        long j62 = j61 >> 21;
        long j63 = ((j40 - (j49 << 21)) - (j52 * 683901)) + j62;
        long j64 = j63 >> 21;
        long j65 = (j31 - (j41 << 21)) + j49 + j64;
        long j66 = j65 >> 21;
        long j67 = (j42 - (j50 << 21)) + j66;
        long j68 = j67 >> 21;
        long j69 = (j30 - (j43 << 21)) + j50 + j68;
        long j70 = j69 >> 21;
        long j71 = (j44 - (j51 << 21)) + j70;
        long j72 = j71 >> 21;
        long j73 = (j29 - (j45 << 21)) + j51 + j72;
        long j74 = j73 >> 21;
        long j75 = (j46 - (j52 << 21)) + j74;
        long j76 = j75 >> 21;
        long j77 = (j53 - (j54 << 21)) + (666643 * j76);
        long j78 = j77 >> 21;
        long j79 = (j55 - (j56 << 21)) + (470296 * j76) + j78;
        long j80 = j77 - (j78 << 21);
        long j81 = j79 >> 21;
        long j82 = (j57 - (j58 << 21)) + (654183 * j76) + j81;
        long j83 = j79 - (j81 << 21);
        long j84 = j82 >> 21;
        long j85 = ((j59 - (j60 << 21)) - (997805 * j76)) + j84;
        long j86 = j82 - (j84 << 21);
        long j87 = j85 >> 21;
        long j88 = (j61 - (j62 << 21)) + (136657 * j76) + j87;
        long j89 = j85 - (j87 << 21);
        long j90 = j88 >> 21;
        long j91 = ((j63 - (j64 << 21)) - (683901 * j76)) + j90;
        long j92 = j88 - (j90 << 21);
        long j93 = j91 >> 21;
        long j94 = (j65 - (j66 << 21)) + j93;
        long j95 = j91 - (j93 << 21);
        long j96 = j94 >> 21;
        long j97 = (j67 - (j68 << 21)) + j96;
        long j98 = j94 - (j96 << 21);
        long j99 = j97 >> 21;
        long j100 = (j69 - (j70 << 21)) + j99;
        long j101 = j97 - (j99 << 21);
        long j102 = j100 >> 21;
        long j103 = (j71 - (j72 << 21)) + j102;
        long j104 = j89;
        long j105 = j100 - (j102 << 21);
        long j106 = j103 >> 21;
        long j107 = (j73 - (j74 << 21)) + j106;
        long j108 = j103 - (j106 << 21);
        long j109 = j107 >> 21;
        long j110 = (j75 - (j76 << 21)) + j109;
        long j111 = j107 - (j109 << 21);
        bArr2[0] = (byte) ((int) j80);
        long j112 = j92;
        bArr2[1] = (byte) ((int) (j80 >> 8));
        bArr2[2] = (byte) ((int) ((j80 >> 16) | (j83 << 5)));
        bArr2[3] = (byte) ((int) (j83 >> 3));
        bArr2[4] = (byte) ((int) (j83 >> 11));
        bArr2[5] = (byte) ((int) ((j83 >> 19) | (j86 << 2)));
        bArr2[6] = (byte) ((int) (j86 >> 6));
        bArr2[7] = (byte) ((int) ((j86 >> 14) | (j104 << 7)));
        bArr2[8] = (byte) ((int) (j104 >> 1));
        bArr2[9] = (byte) ((int) (j104 >> 9));
        bArr2[10] = (byte) ((int) ((j104 >> 17) | (j112 << 4)));
        bArr2[11] = (byte) ((int) (j112 >> 4));
        bArr2[12] = (byte) ((int) (j112 >> 12));
        bArr2[13] = (byte) ((int) ((j112 >> 20) | (j95 + j95)));
        bArr2[14] = (byte) ((int) (j95 >> 7));
        bArr2[15] = (byte) ((int) ((j95 >> 15) | (j98 << 6)));
        bArr2[16] = (byte) ((int) (j98 >> 2));
        bArr2[17] = (byte) ((int) (j98 >> 10));
        bArr2[18] = (byte) ((int) ((j98 >> 18) | (j101 << 3)));
        bArr2[19] = (byte) ((int) (j101 >> 5));
        bArr2[20] = (byte) ((int) (j101 >> 13));
        bArr2[21] = (byte) ((int) j105);
        bArr2[22] = (byte) ((int) (j105 >> 8));
        bArr2[23] = (byte) ((int) ((j105 >> 16) | (j108 << 5)));
        bArr2[24] = (byte) ((int) (j108 >> 3));
        bArr2[25] = (byte) ((int) (j108 >> 11));
        bArr2[26] = (byte) ((int) ((j108 >> 19) | (j111 << 2)));
        bArr2[27] = (byte) ((int) (j111 >> 6));
        bArr2[28] = (byte) ((int) ((j111 >> 14) | (j110 << 7)));
        bArr2[29] = (byte) ((int) (j110 >> 1));
        bArr2[30] = (byte) ((int) (j110 >> 9));
        bArr2[31] = (byte) ((int) (j110 >> 17));
    }

    private static long a(byte[] bArr, int i) {
        return (((long) (bArr[i + 2] & 255)) << 16) | (((long) bArr[i]) & 255) | (((long) (bArr[i + 1] & 255)) << 8);
    }

    public static byte[] b(byte[] bArr) {
        MessageDigest messageDigest = (MessageDigest) apcf.d.a("SHA-512");
        messageDigest.update(bArr, 0, 32);
        byte[] digest = messageDigest.digest();
        digest[0] = (byte) (digest[0] & 248);
        byte b2 = digest[31] & Byte.MAX_VALUE;
        digest[31] = (byte) b2;
        digest[31] = (byte) (b2 | 64);
        return digest;
    }

    private static void a(apbt apbt, int i, byte b2) {
        int i2 = (b2 & 255) >> 7;
        byte b3 = (-i2) & b2;
        int i3 = b2 - (b3 + b3);
        apbt.a(apbz.b[i][0], a(i3, 1));
        apbt.a(apbz.b[i][1], a(i3, 2));
        apbt.a(apbz.b[i][2], a(i3, 3));
        apbt.a(apbz.b[i][3], a(i3, 4));
        apbt.a(apbz.b[i][4], a(i3, 5));
        apbt.a(apbz.b[i][5], a(i3, 6));
        apbt.a(apbz.b[i][6], a(i3, 7));
        apbt.a(apbz.b[i][7], a(i3, 8));
        long[] copyOf = Arrays.copyOf(apbt.b, 10);
        long[] copyOf2 = Arrays.copyOf(apbt.a, 10);
        long[] copyOf3 = Arrays.copyOf(apbt.c, 10);
        for (int i4 = 0; i4 < copyOf3.length; i4++) {
            copyOf3[i4] = -copyOf3[i4];
        }
        apbt.a(new apbt(copyOf, copyOf2, copyOf3), i2);
    }

    private static void a(apbu apbu, apbv apbv) {
        long[] jArr = new long[10];
        apcp.b(apbu.a.a, apbv.a);
        apcp.b(apbu.a.c, apbv.b);
        apcp.b(apbu.b, apbv.c);
        long[] jArr2 = apbu.b;
        apcp.a(jArr2, jArr2, jArr2);
        apcp.a(apbu.a.b, apbv.a, apbv.b);
        apcp.b(jArr, apbu.a.b);
        apbv apbv2 = apbu.a;
        apcp.a(apbv2.b, apbv2.c, apbv2.a);
        apbv apbv3 = apbu.a;
        long[] jArr3 = apbv3.c;
        apcp.b(jArr3, jArr3, apbv3.a);
        apbv apbv4 = apbu.a;
        apcp.b(apbv4.a, jArr, apbv4.b);
        long[] jArr4 = apbu.b;
        apcp.b(jArr4, jArr4, apbu.a.c);
    }

    private static void a(apbu apbu, apbw apbw, apbt apbt) {
        long[] jArr = new long[10];
        long[] jArr2 = apbu.a.a;
        apbv apbv = apbw.a;
        apcp.a(jArr2, apbv.b, apbv.a);
        long[] jArr3 = apbu.a.b;
        apbv apbv2 = apbw.a;
        apcp.b(jArr3, apbv2.b, apbv2.a);
        long[] jArr4 = apbu.a.b;
        apcp.c(jArr4, jArr4, apbt.b);
        apbv apbv3 = apbu.a;
        apcp.c(apbv3.c, apbv3.a, apbt.a);
        apcp.c(apbu.b, apbw.b, apbt.c);
        System.arraycopy(apbw.a.c, 0, apbu.a.a, 0, 10);
        long[] jArr5 = apbu.a.a;
        apcp.a(jArr, jArr5, jArr5);
        apbv apbv4 = apbu.a;
        apcp.b(apbv4.a, apbv4.c, apbv4.b);
        apbv apbv5 = apbu.a;
        long[] jArr6 = apbv5.b;
        apcp.a(jArr6, apbv5.c, jArr6);
        apcp.a(apbu.a.c, jArr, apbu.b);
        long[] jArr7 = apbu.b;
        apcp.b(jArr7, jArr, jArr7);
    }

    public static byte[] a(byte[] bArr) {
        return c(bArr).a();
    }

    static byte[] a(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        byte[] bArr4 = bArr;
        byte[] bArr5 = bArr3;
        byte[] copyOfRange = Arrays.copyOfRange(bArr4, 0, bArr4.length);
        MessageDigest messageDigest = (MessageDigest) apcf.d.a("SHA-512");
        messageDigest.update(bArr5, 32, 32);
        messageDigest.update(copyOfRange);
        byte[] digest = messageDigest.digest();
        d(digest);
        byte[] copyOfRange2 = Arrays.copyOfRange(c(digest).a(), 0, 32);
        messageDigest.reset();
        messageDigest.update(copyOfRange2);
        messageDigest.update(bArr2);
        messageDigest.update(copyOfRange);
        byte[] digest2 = messageDigest.digest();
        d(digest2);
        long a2 = a(digest2, 0) & 2097151;
        long b2 = (b(digest2, 2) >> 5) & 2097151;
        long a3 = (a(digest2, 5) >> 2) & 2097151;
        long b3 = (b(digest2, 7) >> 7) & 2097151;
        long b4 = (b(digest2, 10) >> 4) & 2097151;
        long a4 = (a(digest2, 13) >> 1) & 2097151;
        long b5 = (b(digest2, 15) >> 6) & 2097151;
        long a5 = a(digest2, 18) >> 3;
        long a6 = a(digest2, 21) & 2097151;
        long b6 = (b(digest2, 23) >> 5) & 2097151;
        long a7 = (a(digest2, 26) >> 2) & 2097151;
        long b7 = b(digest2, 28) >> 7;
        long a8 = a(bArr5, 0) & 2097151;
        long b8 = (b(bArr5, 2) >> 5) & 2097151;
        long a9 = (a(bArr5, 5) >> 2) & 2097151;
        long b9 = (b(bArr5, 7) >> 7) & 2097151;
        long b10 = (b(bArr5, 10) >> 4) & 2097151;
        long a10 = (a(bArr5, 13) >> 1) & 2097151;
        long b11 = (b(bArr5, 15) >> 6) & 2097151;
        long a11 = a(bArr5, 18) >> 3;
        long a12 = a(bArr5, 21) & 2097151;
        long b12 = (b(bArr5, 23) >> 5) & 2097151;
        long a13 = (a(bArr5, 26) >> 2) & 2097151;
        long b13 = b(bArr5, 28) >> 7;
        long a14 = a(digest, 0);
        long b14 = b(digest, 2);
        long a15 = a(digest, 5);
        long b15 = b(digest, 7);
        long b16 = b(digest, 10);
        long a16 = a(digest, 13);
        long b17 = b(digest, 15);
        long a17 = a(digest, 18);
        long a18 = a(digest, 21);
        long b18 = b(digest, 23);
        long j = (a14 & 2097151) + (a2 * a8);
        long j2 = ((a15 >> 2) & 2097151) + (a2 * a9) + (b2 * b8) + (a3 * a8);
        long j3 = ((b16 >> 4) & 2097151) + (a2 * b10) + (b2 * b9) + (a3 * a9) + (b3 * b8) + (b4 * a8);
        long j4 = ((b17 >> 6) & 2097151) + (a2 * b11) + (b2 * a10) + (a3 * b10) + (b3 * b9) + (b4 * a9) + (a4 * b8) + (b5 * a8);
        long j5 = (a18 & 2097151) + (a2 * a12) + (b2 * a11) + (a3 * b11) + (b3 * a10) + (b4 * b10) + (a4 * b9) + (b5 * a9) + (a5 * b8) + (a6 * a8);
        long a19 = ((a(digest, 26) >> 2) & 2097151) + (a2 * a13) + (b2 * b12) + (a3 * a12) + (b3 * a11) + (b4 * b11) + (a4 * a10) + (b5 * b10) + (a5 * b9) + (a6 * a9) + (b6 * b8) + (a7 * a8);
        long j6 = (b2 * b13) + (a3 * a13) + (b3 * b12) + (b4 * a12) + (a4 * a11) + (b5 * b11) + (a5 * a10) + (a6 * b10) + (b6 * b9) + (a7 * a9) + (b7 * b8);
        long j7 = (b3 * b13) + (b4 * a13) + (a4 * b12) + (b5 * a12) + (a5 * a11) + (a6 * b11) + (b6 * a10) + (a7 * b10) + (b7 * b9);
        long j8 = (a4 * b13) + (b5 * a13) + (a5 * b12) + (a6 * a12) + (b6 * a11) + (a7 * b11) + (b7 * a10);
        long j9 = (a5 * b13) + (a6 * a13) + (b6 * b12) + (a7 * a12) + (b7 * a11);
        long j10 = (b6 * b13) + (a7 * a13) + (b7 * b12);
        long j11 = b7 * b13;
        long j12 = (j + 1048576) >> 21;
        long j13 = ((b14 >> 5) & 2097151) + (a2 * b8) + (b2 * a8) + j12;
        long j14 = (j2 + 1048576) >> 21;
        long j15 = ((b15 >> 7) & 2097151) + (a2 * b9) + (b2 * a9) + (a3 * b8) + (b3 * a8) + j14;
        long j16 = (j3 + 1048576) >> 21;
        long j17 = ((a16 >> 1) & 2097151) + (a2 * a10) + (b2 * b10) + (a3 * b9) + (b3 * a9) + (b4 * b8) + (a4 * a8) + j16;
        long j18 = (j4 + 1048576) >> 21;
        long j19 = (a17 >> 3) + (a2 * a11) + (b2 * b11) + (a3 * a10) + (b3 * b10) + (b4 * b9) + (a4 * a9) + (b5 * b8) + (a5 * a8) + j18;
        long j20 = (j5 + 1048576) >> 21;
        long j21 = ((b18 >> 5) & 2097151) + (a2 * b12) + (b2 * a12) + (a3 * a11) + (b3 * b11) + (b4 * a10) + (a4 * b10) + (b5 * b9) + (a5 * a9) + (a6 * b8) + (b6 * a8) + j20;
        long j22 = (a19 + 1048576) >> 21;
        long b19 = (b(digest, 28) >> 7) + (a2 * b13) + (b2 * a13) + (a3 * b12) + (b3 * a12) + (b4 * a11) + (a4 * b11) + (b5 * a10) + (a5 * b10) + (a6 * b9) + (b6 * a9) + (b8 * a7) + (a8 * b7) + j22;
        long j23 = (j6 + 1048576) >> 21;
        long j24 = (a3 * b13) + (b3 * a13) + (b4 * b12) + (a4 * a12) + (b5 * a11) + (a5 * b11) + (a6 * a10) + (b6 * b10) + (b9 * a7) + (a9 * b7) + j23;
        long j25 = (j7 + 1048576) >> 21;
        long j26 = (b4 * b13) + (a4 * a13) + (b5 * b12) + (a5 * a12) + (a6 * a11) + (b6 * b11) + (a10 * a7) + (b10 * b7) + j25;
        long j27 = (j8 + 1048576) >> 21;
        long j28 = (b5 * b13) + (a5 * a13) + (a6 * b12) + (b6 * a12) + (a11 * a7) + (b11 * b7) + j27;
        long j29 = (j9 + 1048576) >> 21;
        long j30 = (a6 * b13) + (b6 * a13) + (b12 * a7) + (a12 * b7) + j29;
        long j31 = (j10 + 1048576) >> 21;
        long j32 = (a7 * b13) + (b7 * a13) + j31;
        long j33 = (j11 + 1048576) >> 21;
        long j34 = (j13 + 1048576) >> 21;
        long j35 = (j15 + 1048576) >> 21;
        long j36 = (j17 + 1048576) >> 21;
        long j37 = (j19 + 1048576) >> 21;
        long j38 = (j21 + 1048576) >> 21;
        long j39 = (b19 + 1048576) >> 21;
        long j40 = (j24 + 1048576) >> 21;
        long j41 = (j26 + 1048576) >> 21;
        long j42 = (j28 + 1048576) >> 21;
        long j43 = (j9 - (j29 << 21)) + j42;
        long j44 = (j30 + 1048576) >> 21;
        long j45 = (j10 - (j31 << 21)) + j44;
        long j46 = j30 - (j44 << 21);
        long j47 = (j32 + 1048576) >> 21;
        long j48 = (j11 - (j33 << 21)) + j47;
        long j49 = j32 - (j47 << 21);
        long j50 = ((j8 - (j27 << 21)) + j41) - (j33 * 683901);
        long j51 = ((((j7 - (j25 << 21)) + j40) - (j33 * 997805)) + (j48 * 136657)) - (j49 * 683901);
        long j52 = ((((((j6 - (j23 << 21)) + j39) + (j33 * 470296)) + (j48 * 654183)) - (j49 * 997805)) + (j45 * 136657)) - (j46 * 683901);
        long j53 = (j4 - (j18 << 21)) + j36 + (j43 * 666643);
        long j54 = (j5 - (j20 << 21)) + j37 + (j45 * 666643) + (j46 * 470296) + (j43 * 654183);
        long j55 = ((((((a19 - (j22 << 21)) + j38) + (j48 * 666643)) + (j49 * 470296)) + (j45 * 654183)) - (j46 * 997805)) + (j43 * 136657);
        long j56 = (j53 + 1048576) >> 21;
        long j57 = (j19 - (j37 << 21)) + (j46 * 666643) + (j43 * 470296) + j56;
        long j58 = (j54 + 1048576) >> 21;
        long j59 = (((((j21 - (j38 << 21)) + (j49 * 666643)) + (j45 * 470296)) + (j46 * 654183)) - (j43 * 997805)) + j58;
        long j60 = (j55 + 1048576) >> 21;
        long j61 = (((((((b19 - (j39 << 21)) + (j33 * 666643)) + (j48 * 470296)) + (j49 * 654183)) - (j45 * 997805)) + (j46 * 136657)) - (j43 * 683901)) + j60;
        long j62 = (j52 + 1048576) >> 21;
        long j63 = (((((j24 - (j40 << 21)) + (j33 * 654183)) - (j48 * 997805)) + (j49 * 136657)) - (j45 * 683901)) + j62;
        long j64 = (j51 + 1048576) >> 21;
        long j65 = (((j26 - (j41 << 21)) + (j33 * 136657)) - (j48 * 683901)) + j64;
        long j66 = (j50 + 1048576) >> 21;
        long j67 = (j28 - (j42 << 21)) + j66;
        long j68 = (j57 + 1048576) >> 21;
        long j69 = (j59 + 1048576) >> 21;
        long j70 = (j61 + 1048576) >> 21;
        long j71 = (j52 - (j62 << 21)) + j70;
        long j72 = (j63 + 1048576) >> 21;
        long j73 = (j51 - (j64 << 21)) + j72;
        long j74 = j63 - (j72 << 21);
        long j75 = (j65 + 1048576) >> 21;
        long j76 = (j50 - (j66 << 21)) + j75;
        long j77 = j65 - (j75 << 21);
        long j78 = ((j55 - (j60 << 21)) + j69) - (j67 * 683901);
        long j79 = ((((j54 - (j58 << 21)) + j68) - (j67 * 997805)) + (j76 * 136657)) - (j77 * 683901);
        long j80 = (((((j53 - (j56 << 21)) + (j67 * 470296)) + (j76 * 654183)) - (j77 * 997805)) + (j73 * 136657)) - (j74 * 683901);
        long j81 = (j - (j12 << 21)) + (j71 * 666643);
        long j82 = (j2 - (j14 << 21)) + j34 + (j73 * 666643) + (j74 * 470296) + (j71 * 654183);
        long j83 = ((((((j3 - (j16 << 21)) + j35) + (j76 * 666643)) + (j77 * 470296)) + (j73 * 654183)) - (j74 * 997805)) + (j71 * 136657);
        long j84 = (j81 + 1048576) >> 21;
        long j85 = (j13 - (j34 << 21)) + (j74 * 666643) + (j71 * 470296) + j84;
        long j86 = (j82 + 1048576) >> 21;
        long j87 = (((((j15 - (j35 << 21)) + (j77 * 666643)) + (j73 * 470296)) + (j74 * 654183)) - (j71 * 997805)) + j86;
        long j88 = (j83 + 1048576) >> 21;
        long j89 = (((((((j17 - (j36 << 21)) + (j67 * 666643)) + (j76 * 470296)) + (j77 * 654183)) - (j73 * 997805)) + (j74 * 136657)) - (j71 * 683901)) + j88;
        long j90 = (j80 + 1048576) >> 21;
        long j91 = (((((j57 - (j68 << 21)) + (j67 * 654183)) - (j76 * 997805)) + (j77 * 136657)) - (j73 * 683901)) + j90;
        long j92 = (j79 + 1048576) >> 21;
        long j93 = (((j59 - (j69 << 21)) + (j67 * 136657)) - (j76 * 683901)) + j92;
        long j94 = (j78 + 1048576) >> 21;
        long j95 = (j61 - (j70 << 21)) + j94;
        long j96 = (j85 + 1048576) >> 21;
        long j97 = (j87 + 1048576) >> 21;
        long j98 = (j89 + 1048576) >> 21;
        long j99 = (j91 + 1048576) >> 21;
        long j100 = (j93 + 1048576) >> 21;
        long j101 = (j95 + 1048576) >> 21;
        long j102 = (j81 - (j84 << 21)) + (j101 * 666643);
        long j103 = j102 >> 21;
        long j104 = (j85 - (j96 << 21)) + (j101 * 470296) + j103;
        long j105 = j104 >> 21;
        long j106 = (j82 - (j86 << 21)) + j96 + (j101 * 654183) + j105;
        long j107 = j106 >> 21;
        long j108 = ((j87 - (j97 << 21)) - (j101 * 997805)) + j107;
        long j109 = j108 >> 21;
        long j110 = (j83 - (j88 << 21)) + j97 + (j101 * 136657) + j109;
        long j111 = j110 >> 21;
        long j112 = ((j89 - (j98 << 21)) - (j101 * 683901)) + j111;
        long j113 = j112 >> 21;
        long j114 = (j80 - (j90 << 21)) + j98 + j113;
        long j115 = j114 >> 21;
        long j116 = (j91 - (j99 << 21)) + j115;
        long j117 = j116 >> 21;
        long j118 = (j79 - (j92 << 21)) + j99 + j117;
        long j119 = j118 >> 21;
        long j120 = (j93 - (j100 << 21)) + j119;
        long j121 = j120 >> 21;
        long j122 = (j78 - (j94 << 21)) + j100 + j121;
        long j123 = j122 >> 21;
        long j124 = (j95 - (j101 << 21)) + j123;
        long j125 = j124 >> 21;
        long j126 = (j102 - (j103 << 21)) + (666643 * j125);
        long j127 = j126 >> 21;
        long j128 = (j104 - (j105 << 21)) + (470296 * j125) + j127;
        long j129 = j126 - (j127 << 21);
        long j130 = j128 >> 21;
        long j131 = (j106 - (j107 << 21)) + (654183 * j125) + j130;
        long j132 = j128 - (j130 << 21);
        long j133 = j131 >> 21;
        long j134 = ((j108 - (j109 << 21)) - (997805 * j125)) + j133;
        long j135 = j131 - (j133 << 21);
        long j136 = j134 >> 21;
        long j137 = (j110 - (j111 << 21)) + (136657 * j125) + j136;
        long j138 = j134 - (j136 << 21);
        long j139 = j137 >> 21;
        long j140 = ((j112 - (j113 << 21)) - (683901 * j125)) + j139;
        long j141 = j137 - (j139 << 21);
        long j142 = j140 >> 21;
        long j143 = (j114 - (j115 << 21)) + j142;
        long j144 = j140 - (j142 << 21);
        long j145 = j143 >> 21;
        long j146 = (j116 - (j117 << 21)) + j145;
        long j147 = j143 - (j145 << 21);
        long j148 = j146 >> 21;
        long j149 = (j118 - (j119 << 21)) + j148;
        long j150 = j146 - (j148 << 21);
        long j151 = j149 >> 21;
        long j152 = (j120 - (j121 << 21)) + j151;
        long j153 = j149 - (j151 << 21);
        long j154 = j152 >> 21;
        long j155 = (j122 - (j123 << 21)) + j154;
        long j156 = j152 - (j154 << 21);
        long j157 = j155 >> 21;
        long j158 = (j124 - (j125 << 21)) + j157;
        long j159 = j155 - (j157 << 21);
        return apbg.a(copyOfRange2, new byte[]{(byte) ((int) j129), (byte) ((int) (j129 >> 8)), (byte) ((int) ((j129 >> 16) | (j132 << 5))), (byte) ((int) (j132 >> 3)), (byte) ((int) (j132 >> 11)), (byte) ((int) ((j132 >> 19) | (j135 << 2))), (byte) ((int) (j135 >> 6)), (byte) ((int) ((j135 >> 14) | (j138 << 7))), (byte) ((int) (j138 >> 1)), (byte) ((int) (j138 >> 9)), (byte) ((int) ((j138 >> 17) | (j141 << 4))), (byte) ((int) (j141 >> 4)), (byte) ((int) (j141 >> 12)), (byte) ((int) ((j141 >> 20) | (j144 + j144))), (byte) ((int) (j144 >> 7)), (byte) ((int) ((j144 >> 15) | (j147 << 6))), (byte) ((int) (j147 >> 2)), (byte) ((int) (j147 >> 10)), (byte) ((int) ((j147 >> 18) | (j150 << 3))), (byte) ((int) (j150 >> 5)), (byte) ((int) (j150 >> 13)), (byte) ((int) j153), (byte) ((int) (j153 >> 8)), (byte) ((int) ((j153 >> 16) | (j156 << 5))), (byte) ((int) (j156 >> 3)), (byte) ((int) (j156 >> 11)), (byte) ((int) ((j156 >> 19) | (j159 << 2))), (byte) ((int) (j159 >> 6)), (byte) ((int) ((j159 >> 14) | (j158 << 7))), (byte) ((int) (j158 >> 1)), (byte) ((int) (j158 >> 9)), (byte) ((int) (j158 >> 17))});
    }
}
