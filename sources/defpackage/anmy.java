package defpackage;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: anmy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class anmy extends FilterInputStream {
    public long a;
    private long b = -1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public anmy(InputStream inputStream) {
        super(inputStream);
        amrl.a((Object) inputStream);
    }

    public final synchronized void mark(int i) {
        this.in.mark(i);
        this.b = this.a;
    }

    public final int read() {
        int read = this.in.read();
        if (read != -1) {
            this.a++;
        }
        return read;
    }

    public final synchronized void reset() {
        if (!this.in.markSupported()) {
            throw new IOException("Mark not supported");
        } else if (this.b != -1) {
            this.in.reset();
            this.a = this.b;
        } else {
            throw new IOException("Mark not set");
        }
    }

    public final long skip(long j) {
        long skip = this.in.skip(j);
        this.a += skip;
        return skip;
    }

    public final int read(byte[] bArr, int i, int i2) {
        int read = this.in.read(bArr, i, i2);
        if (read != -1) {
            this.a += (long) read;
        }
        return read;
    }
}
