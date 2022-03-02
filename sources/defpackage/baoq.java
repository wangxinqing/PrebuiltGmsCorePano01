package defpackage;

import com.google.android.chimera.FragmentTransaction;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: baoq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class baoq {
    static volatile aubs a = aubs.b();

    public static long a(InputStream inputStream, OutputStream outputStream) {
        amrl.a((Object) inputStream, (Object) "inputStream cannot be null!");
        amrl.a((Object) outputStream, (Object) "outputStream cannot be null!");
        byte[] bArr = new byte[FragmentTransaction.TRANSIT_EXIT_MASK];
        long j = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return j;
            }
            outputStream.write(bArr, 0, read);
            j += (long) read;
        }
    }

    public static baah a(audx audx) {
        return new baop(audx);
    }
}
