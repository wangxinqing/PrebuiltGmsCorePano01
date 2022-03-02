package defpackage;

/* renamed from: jkd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jkd {
    public static int a(byte[] bArr, int i, int i2) {
        int i3 = i & -4;
        int i4 = 0;
        for (int i5 = 0; i5 < i3; i5 += 4) {
            int i6 = ((bArr[i5] & 255) | ((bArr[i5 + 1] & 255) << 8) | ((bArr[i5 + 2] & 255) << 16) | (bArr[i5 + 3] << 24)) * -862048943;
            int i7 = i2 ^ (((i6 << 15) | (i6 >>> 17)) * 461845907);
            i2 = (((i7 >>> 19) | (i7 << 13)) * 5) - 430675100;
        }
        int i8 = i & 3;
        if (i8 != 1) {
            if (i8 != 2) {
                if (i8 == 3) {
                    i4 = (bArr[i3 + 2] & 255) << 16;
                }
                int i9 = i2 ^ i;
                int i10 = (i9 ^ (i9 >>> 16)) * -2048144789;
                int i11 = (i10 ^ (i10 >>> 13)) * -1028477387;
                return i11 ^ (i11 >>> 16);
            }
            i4 |= (bArr[i3 + 1] & 255) << 8;
        }
        int i12 = ((bArr[i3] & 255) | i4) * -862048943;
        i2 ^= ((i12 >>> 17) | (i12 << 15)) * 461845907;
        int i92 = i2 ^ i;
        int i102 = (i92 ^ (i92 >>> 16)) * -2048144789;
        int i112 = (i102 ^ (i102 >>> 13)) * -1028477387;
        return i112 ^ (i112 >>> 16);
    }
}
