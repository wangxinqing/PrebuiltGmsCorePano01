package defpackage;

import java.nio.charset.Charset;

/* renamed from: baud  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class baud {
    public static final Charset a = Charset.forName("UTF-8");

    public static int a(int i) {
        return ((i & 255) << 24) | (i >>> 24) | ((16711680 & i) >>> 8) | ((65280 & i) << 8);
    }

    public static short a(short s) {
        return (short) (((s & 255) << 8) | ((s >>> 8) & 255));
    }

    public static void a(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new ArrayIndexOutOfBoundsException(String.format("size=%s offset=%s byteCount=%s", new Object[]{Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3)}));
        }
    }

    public static boolean a(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            if (bArr[i4 + i] != bArr2[i4 + i2]) {
                return false;
            }
        }
        return true;
    }
}
