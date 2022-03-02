package defpackage;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;

/* renamed from: ammh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ammh extends InputStream {
    private final RandomAccessFile a;
    private long b = -1;
    private long c;
    private long d;
    private final long e;
    private long f;

    public ammh(File file) {
        long length = file.length();
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
        this.a = randomAccessFile;
        this.e = randomAccessFile.length();
        a(0, length);
    }

    public final void a(long j, long j2) {
        if (j < 0) {
            throw new IllegalArgumentException("rangeOffset must be >= 0");
        } else if (j2 >= 0) {
            long j3 = j + j2;
            if (j3 > this.e) {
                throw new IllegalArgumentException("Read range exceeds file length");
            } else if (j3 >= 0) {
                this.c = j;
                this.d = j2;
                if (j != this.f) {
                    this.a.seek(j);
                    this.f = j;
                }
                this.b = -1;
            } else {
                throw new IllegalArgumentException("Insane input size not supported");
            }
        } else {
            throw new IllegalArgumentException("rangeLength must be >= 0");
        }
    }

    public final int available() {
        long j = this.d - (this.f - this.c);
        if (j <= 2147483647L) {
            return (int) j;
        }
        return Integer.MAX_VALUE;
    }

    public final void close() {
        this.a.close();
    }

    /* access modifiers changed from: protected */
    public final void finalize() {
        close();
    }

    public final void mark(int i) {
        this.b = this.f;
    }

    public final boolean markSupported() {
        return true;
    }

    public final int read() {
        if (available() <= 0) {
            return -1;
        }
        this.f++;
        return this.a.read();
    }

    public final void reset() {
        long j = this.b;
        if (j >= 0) {
            this.a.seek(j);
            this.f = this.b;
            return;
        }
        throw new IOException("mark not set");
    }

    public final long skip(long j) {
        int available;
        if (j <= 0 || (available = available()) <= 0) {
            return 0;
        }
        long min = (long) ((int) Math.min((long) available, j));
        long j2 = this.f + min;
        this.f = j2;
        this.a.seek(j2);
        return min;
    }

    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public final int read(byte[] bArr, int i, int i2) {
        if (i2 <= 0) {
            return 0;
        }
        int available = available();
        if (available <= 0) {
            return -1;
        }
        int read = this.a.read(bArr, i, Math.min(i2, available));
        this.f += (long) read;
        return read;
    }
}
