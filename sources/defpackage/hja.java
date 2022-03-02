package defpackage;

import javax.crypto.Mac;

/* renamed from: hja  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hja {
    private static int a(int i, int i2) {
        return (i >>> (32 - i2)) | (i << i2);
    }

    private static void b(int[] iArr) {
        int[] iArr2 = iArr;
        int[] iArr3 = new int[16];
        System.arraycopy(iArr2, 0, iArr3, 0, 16);
        for (int i = 0; i < 8; i += 2) {
            int a = iArr3[4] ^ a(iArr3[0] + iArr3[12], 7);
            iArr3[4] = a;
            int a2 = a(a + iArr3[0], 9) ^ iArr3[8];
            iArr3[8] = a2;
            int a3 = a(a2 + iArr3[4], 13) ^ iArr3[12];
            iArr3[12] = a3;
            iArr3[0] = a(a3 + iArr3[8], 18) ^ iArr3[0];
            int a4 = iArr3[9] ^ a(iArr3[5] + iArr3[1], 7);
            iArr3[9] = a4;
            int a5 = a(a4 + iArr3[5], 9) ^ iArr3[13];
            iArr3[13] = a5;
            int a6 = a(a5 + iArr3[9], 13) ^ iArr3[1];
            iArr3[1] = a6;
            iArr3[5] = a(a6 + iArr3[13], 18) ^ iArr3[5];
            int a7 = a(iArr3[10] + iArr3[6], 7) ^ iArr3[14];
            iArr3[14] = a7;
            int a8 = iArr3[2] ^ a(a7 + iArr3[10], 9);
            iArr3[2] = a8;
            int a9 = iArr3[6] ^ a(a8 + iArr3[14], 13);
            iArr3[6] = a9;
            iArr3[10] = iArr3[10] ^ a(a9 + iArr3[2], 18);
            int a10 = iArr3[3] ^ a(iArr3[15] + iArr3[11], 7);
            iArr3[3] = a10;
            int a11 = iArr3[7] ^ a(a10 + iArr3[15], 9);
            iArr3[7] = a11;
            int a12 = iArr3[11] ^ a(a11 + iArr3[3], 13);
            iArr3[11] = a12;
            iArr3[15] = iArr3[15] ^ a(a12 + iArr3[7], 18);
            int a13 = iArr3[1] ^ a(iArr3[0] + iArr3[3], 7);
            iArr3[1] = a13;
            int a14 = a(a13 + iArr3[0], 9) ^ iArr3[2];
            iArr3[2] = a14;
            int a15 = a(a14 + iArr3[1], 13) ^ iArr3[3];
            iArr3[3] = a15;
            iArr3[0] = iArr3[0] ^ a(a15 + iArr3[2], 18);
            int a16 = iArr3[6] ^ a(iArr3[5] + iArr3[4], 7);
            iArr3[6] = a16;
            int a17 = a(a16 + iArr3[5], 9) ^ iArr3[7];
            iArr3[7] = a17;
            int a18 = a(a17 + iArr3[6], 13) ^ iArr3[4];
            iArr3[4] = a18;
            iArr3[5] = a(a18 + iArr3[7], 18) ^ iArr3[5];
            int a19 = iArr3[11] ^ a(iArr3[10] + iArr3[9], 7);
            iArr3[11] = a19;
            int a20 = a(a19 + iArr3[10], 9) ^ iArr3[8];
            iArr3[8] = a20;
            int a21 = a(a20 + iArr3[11], 13) ^ iArr3[9];
            iArr3[9] = a21;
            iArr3[10] = a(a21 + iArr3[8], 18) ^ iArr3[10];
            int a22 = iArr3[12] ^ a(iArr3[15] + iArr3[14], 7);
            iArr3[12] = a22;
            int a23 = a(a22 + iArr3[15], 9) ^ iArr3[13];
            iArr3[13] = a23;
            int a24 = a(a23 + iArr3[12], 13) ^ iArr3[14];
            iArr3[14] = a24;
            iArr3[15] = a(a24 + iArr3[13], 18) ^ iArr3[15];
        }
        for (int i2 = 0; i2 < 16; i2++) {
            iArr2[i2] = iArr2[i2] + iArr3[i2];
        }
    }

    public static long a(int[] iArr) {
        return (((long) iArr[241]) << 32) + ((long) iArr[240]);
    }

    public static void a(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[16];
        System.arraycopy(iArr, 240, iArr3, 0, 16);
        for (int i = 0; i < 16; i += 2) {
            int i2 = i * 16;
            a(iArr3, iArr, i2, 16);
            b(iArr3);
            int i3 = i * 8;
            System.arraycopy(iArr3, 0, iArr2, i3, 16);
            a(iArr3, iArr, i2 + 16, 16);
            b(iArr3);
            System.arraycopy(iArr3, 0, iArr2, i3 + 128, 16);
        }
    }

    public static void a(int[] iArr, int[] iArr2, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            iArr[i3] = iArr[i3] ^ iArr2[i + i3];
        }
    }

    public static byte[] a(Mac mac, byte[] bArr, int i) {
        int macLength = mac.getMacLength();
        int length = bArr.length;
        byte[] bArr2 = new byte[i];
        byte[] bArr3 = new byte[(length + 4)];
        System.arraycopy(bArr, 0, bArr3, 0, length);
        int i2 = 1;
        int i3 = 0;
        while (i > 0) {
            bArr3[length] = (byte) (i2 >> 24);
            bArr3[length + 1] = (byte) (i2 >> 16);
            bArr3[length + 2] = (byte) (i2 >> 8);
            bArr3[length + 3] = (byte) i2;
            byte[] doFinal = mac.doFinal(bArr3);
            int min = Math.min(i, macLength);
            System.arraycopy(doFinal, 0, bArr2, i3, min);
            i3 += min;
            i -= min;
            i2++;
        }
        return bArr2;
    }
}
