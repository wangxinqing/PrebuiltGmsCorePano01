package defpackage;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* renamed from: afgi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class afgi {
    public static long a(auay auay) {
        return auay.e().getLong();
    }

    public static Long b(auay auay) {
        if (auay != null) {
            return Long.valueOf(a(auay));
        }
        return null;
    }

    public static long a(auay auay, long j) {
        return auay != null ? a(auay) : j;
    }

    public static auay a(long j) {
        ByteBuffer putLong = ByteBuffer.allocate(8).putLong(j);
        putLong.flip();
        return auay.b(putLong);
    }

    public static byte[] a(byte[] bArr) {
        for (int length = bArr.length - 1; length >= 0; length--) {
            if ((bArr[length] & 255) != 255) {
                byte[] copyOf = Arrays.copyOf(bArr, length + 1);
                copyOf[length] = (byte) (copyOf[length] + 1);
                return copyOf;
            }
        }
        return null;
    }
}
