package defpackage;

import com.google.android.chimera.FragmentTransaction;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

/* renamed from: anmr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class anmr {
    public static final OutputStream a = new anmp();

    public static long a(InputStream inputStream, OutputStream outputStream) {
        amrl.a((Object) inputStream);
        amrl.a((Object) outputStream);
        byte[] a2 = a();
        long j = 0;
        while (true) {
            int read = inputStream.read(a2);
            if (read == -1) {
                return j;
            }
            outputStream.write(a2, 0, read);
            j += (long) read;
        }
    }

    public static anmq a(int i) {
        if (i >= 0) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i);
            amrl.a((Object) byteArrayOutputStream);
            return new anmq(byteArrayOutputStream);
        }
        throw new IllegalArgumentException(String.format("Invalid size: %s", new Object[]{Integer.valueOf(i)}));
    }

    public static void a(InputStream inputStream, byte[] bArr) {
        a(inputStream, bArr, 0, bArr.length);
    }

    public static void a(InputStream inputStream, byte[] bArr, int i, int i2) {
        amrl.a((Object) inputStream);
        amrl.a((Object) bArr);
        int i3 = 0;
        if (i2 >= 0) {
            amrl.a(i, i + i2, bArr.length);
            while (i3 < i2) {
                int read = inputStream.read(bArr, i + i3, i2 - i3);
                if (read == -1) {
                    break;
                }
                i3 += read;
            }
            if (i3 != i2) {
                StringBuilder sb = new StringBuilder(81);
                sb.append("reached end of stream after reading ");
                sb.append(i3);
                sb.append(" bytes; ");
                sb.append(i2);
                sb.append(" bytes expected");
                throw new EOFException(sb.toString());
            }
            return;
        }
        throw new IndexOutOfBoundsException(String.format("len (%s) cannot be negative", new Object[]{Integer.valueOf(i2)}));
    }

    public static byte[] a() {
        return new byte[FragmentTransaction.TRANSIT_EXIT_MASK];
    }

    public static byte[] a(InputStream inputStream) {
        amrl.a((Object) inputStream);
        return a(inputStream, new ArrayDeque(20), 0);
    }

    static byte[] a(InputStream inputStream, long j) {
        boolean z;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        amrl.a(z, "expectedSize (%s) must be non-negative", j);
        if (j <= 2147483639) {
            int i = (int) j;
            byte[] bArr = new byte[i];
            int i2 = i;
            while (i2 > 0) {
                int i3 = i - i2;
                int read = inputStream.read(bArr, i3, i2);
                if (read == -1) {
                    return Arrays.copyOf(bArr, i3);
                }
                i2 -= read;
            }
            int read2 = inputStream.read();
            if (read2 == -1) {
                return bArr;
            }
            ArrayDeque arrayDeque = new ArrayDeque(22);
            arrayDeque.add(bArr);
            arrayDeque.add(new byte[]{(byte) read2});
            return a(inputStream, arrayDeque, i + 1);
        }
        StringBuilder sb = new StringBuilder(62);
        sb.append(j);
        sb.append(" bytes is too large to fit in a byte array");
        throw new OutOfMemoryError(sb.toString());
    }

    private static byte[] a(InputStream inputStream, Deque deque, int i) {
        int i2 = FragmentTransaction.TRANSIT_EXIT_MASK;
        while (i < 2147483639) {
            int min = Math.min(i2, 2147483639 - i);
            byte[] bArr = new byte[min];
            deque.add(bArr);
            int i3 = 0;
            while (i3 < min) {
                int read = inputStream.read(bArr, i3, min - i3);
                if (read == -1) {
                    return a(deque, i);
                }
                i3 += read;
                i += read;
            }
            long j = (long) i2;
            i2 = aoog.b(j + j);
        }
        if (inputStream.read() == -1) {
            return a(deque, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

    private static byte[] a(Deque deque, int i) {
        byte[] bArr = new byte[i];
        int i2 = i;
        while (i2 > 0) {
            byte[] bArr2 = (byte[]) deque.removeFirst();
            int min = Math.min(i2, bArr2.length);
            System.arraycopy(bArr2, 0, bArr, i - i2, min);
            i2 -= min;
        }
        return bArr;
    }
}
