package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: aotd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aotd {
    public static final byte[] a = new byte[1024];
    public static final int[] b = new int[1024];

    static int a(InputStream inputStream, byte[] bArr, int i, int i2) {
        try {
            return inputStream.read(bArr, i, i2);
        } catch (IOException e) {
            throw new aosv("Failed to read input", e);
        }
    }

    static void a(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(bArr, i2, bArr, i, i3 - i2);
    }
}
