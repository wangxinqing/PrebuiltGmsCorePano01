package defpackage;

import com.android.volley.toolbox.ImageRequest;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.io.IOException;
import java.io.InputStream;
import java.util.Random;

/* renamed from: aazz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aazz {
    private static final Random a = new Random();

    public static double a(long j) {
        double d = (double) j;
        Double.isNaN(d);
        return d / 8.64E7d;
    }

    public static int a(int i) {
        return i * ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS;
    }

    public static int b(int i) {
        return i * 60000;
    }

    static void a(byte[] bArr, InputStream inputStream) {
        int i = 0;
        while (true) {
            int length = bArr.length;
            if (i < length) {
                int read = inputStream.read(bArr, i, length - i);
                if (read >= 0) {
                    i += read;
                } else {
                    throw new IOException("Attempted to read past end of stream");
                }
            } else {
                return;
            }
        }
    }

    public static byte[] a() {
        byte[] bArr = new byte[PSKKeyManager.MAX_KEY_LENGTH_BYTES];
        a.nextBytes(bArr);
        return bArr;
    }
}
