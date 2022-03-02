package defpackage;

import java.io.FilterInputStream;
import java.io.InputStream;

/* renamed from: bff  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bff extends FilterInputStream {
    private final long a;
    private long b;

    public bff(InputStream inputStream, long j) {
        super(inputStream);
        this.a = j;
    }

    public final long a() {
        return this.a - this.b;
    }

    public final int read() {
        int read = super.read();
        if (read != -1) {
            this.b++;
        }
        return read;
    }

    public final int read(byte[] bArr, int i, int i2) {
        int read = super.read(bArr, i, i2);
        if (read != -1) {
            this.b += (long) read;
        }
        return read;
    }
}
