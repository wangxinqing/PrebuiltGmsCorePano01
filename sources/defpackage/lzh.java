package defpackage;

/* renamed from: lzh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lzh {
    public final int[] a = new int[16];
    public final byte[] b;
    public final byte[] c;

    public lzh(byte[] bArr, byte[] bArr2) {
        if (bArr.length != 16) {
            throw new IllegalArgumentException();
        } else if (bArr2.length == 16) {
            this.b = bArr;
            this.c = bArr2;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public static int a(int i) {
        return i + 1;
    }

    public static int a(int i, int i2) {
        return (i >>> (32 - i2)) | (i << i2);
    }

    public static int a(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }
}
