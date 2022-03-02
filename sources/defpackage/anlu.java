package defpackage;

import java.nio.ByteOrder;

/* renamed from: anlu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class anlu {
    private static final anlr a;

    static {
        anlr anlr = anlq.a;
        try {
            if ("amd64".equals(System.getProperty("os.arch"))) {
                anlr = !ByteOrder.nativeOrder().equals(ByteOrder.LITTLE_ENDIAN) ? anlt.UNSAFE_BIG_ENDIAN : anlt.UNSAFE_LITTLE_ENDIAN;
            }
        } catch (Throwable th) {
        }
        a = anlr;
    }

    static long a(byte[] bArr, int i) {
        return a.a(bArr, i);
    }

    static int b(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }
}
