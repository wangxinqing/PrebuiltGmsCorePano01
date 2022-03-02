package defpackage;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: bajr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class bajr extends FilterInputStream {
    private final int a;
    private final balm b;
    private long c;
    private long d;
    private long e = -1;

    public bajr(InputStream inputStream, int i, balm balm) {
        super(inputStream);
        this.a = i;
        this.b = balm;
    }

    private final void a() {
        if (this.d > this.c) {
            this.b.b();
            this.c = this.d;
        }
    }

    private final void b() {
        if (this.d > ((long) this.a)) {
            throw babj.k.a(String.format("Compressed gRPC message exceeds maximum size %d: %d bytes read", new Object[]{Integer.valueOf(this.a), Long.valueOf(this.d)})).b();
        }
    }

    public final synchronized void mark(int i) {
        this.in.mark(i);
        this.e = this.d;
    }

    public final int read() {
        int read = this.in.read();
        if (read != -1) {
            this.d++;
        }
        b();
        a();
        return read;
    }

    public final synchronized void reset() {
        if (!this.in.markSupported()) {
            throw new IOException("Mark not supported");
        } else if (this.e != -1) {
            this.in.reset();
            this.d = this.e;
        } else {
            throw new IOException("Mark not set");
        }
    }

    public final long skip(long j) {
        long skip = this.in.skip(j);
        this.d += skip;
        b();
        a();
        return skip;
    }

    public final int read(byte[] bArr, int i, int i2) {
        int read = this.in.read(bArr, i, i2);
        if (read != -1) {
            this.d += (long) read;
        }
        b();
        a();
        return read;
    }
}
