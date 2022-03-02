package defpackage;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: ammg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ammg {
    public static void a(byte[] bArr, ammi ammi, OutputStream outputStream, long j, int i, long j2) {
        InputStream b;
        if (i < 0) {
            throw new IOException("copyLength negative");
        } else if (j >= 0) {
            long j3 = (long) i;
            if (j3 <= j2) {
                try {
                    b = new ammo(ammi, j, Math.min(j3, ((ammk) ammi).b)).b();
                    while (i > 0) {
                        int min = Math.min(i, 16384);
                        ammj.a(b, bArr, min);
                        outputStream.write(bArr, 0, min);
                        i -= min;
                    }
                    if (b != null) {
                        b.close();
                        return;
                    }
                    return;
                } catch (EOFException e) {
                    throw new IOException("patch underrun", e);
                } catch (Throwable th) {
                    apev.a(th, th);
                }
            } else {
                throw new IOException("Output length overrun");
            }
        } else {
            throw new IOException("inputOffset negative");
        }
        throw th;
    }

    public static void a(byte[] bArr, DataInputStream dataInputStream, OutputStream outputStream, int i, long j) {
        if (i < 0) {
            throw new IOException("copyLength negative");
        } else if (((long) i) <= j) {
            while (i > 0) {
                try {
                    int min = Math.min(i, 16384);
                    dataInputStream.readFully(bArr, 0, min);
                    outputStream.write(bArr, 0, min);
                    i -= min;
                } catch (EOFException e) {
                    throw new IOException("patch underrun");
                }
            }
        } else {
            throw new IOException("Output length overrun");
        }
    }
}
