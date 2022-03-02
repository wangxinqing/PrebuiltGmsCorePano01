package defpackage;

/* renamed from: aeeu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aeeu {
    static byte[] a(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        int i;
        if (bArr.length != 16) {
            throw new IllegalArgumentException("Incorrect key length for encryption, only supports 16-byte AES Key.");
        } else if (bArr3.length == 8) {
            int length = bArr2.length;
            byte[] bArr4 = new byte[length];
            System.arraycopy(bArr2, 0, bArr4, 0, length);
            byte[] a = aooa.a(new byte[8], bArr3);
            int i2 = length >> 4;
            if ((length & 15) == 0) {
                i = 0;
            } else {
                i = 1;
            }
            int i3 = i2 + i;
            if (i3 <= 4) {
                for (int i4 = 0; i4 < i3; i4++) {
                    a[0] = (byte) i4;
                    byte[] a2 = aeev.a(bArr, a);
                    int i5 = i4 * 16;
                    int min = Math.min(i5 + 16, bArr2.length);
                    int i6 = 0;
                    while (i5 < min) {
                        bArr4[i5] = (byte) (bArr4[i5] ^ a2[i6]);
                        i6++;
                        i5++;
                    }
                }
                return bArr4;
            }
            throw new IllegalArgumentException("Incorrect data size, Fast Pair naming scheme only supports 4 blocks.");
        } else {
            throw new IllegalArgumentException("Incorrect nonce length for encryption, Fast Pair naming scheme only supports 8-byte nonce.");
        }
    }
}
