package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: ammj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ammj {
    public static void a(InputStream inputStream, byte[] bArr, int i) {
        int i2 = 0;
        while (i2 < i) {
            int read = inputStream.read(bArr, i2, i - i2);
            if (read != -1) {
                i2 += read;
            } else {
                throw new IOException("truncated input stream");
            }
        }
    }
}
