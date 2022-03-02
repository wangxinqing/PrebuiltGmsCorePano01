package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: ammn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ammn extends InputStream {
    public final InputStream a;
    public Runnable b = null;
    public boolean c = true;

    public ammn(InputStream inputStream) {
        this.a = inputStream;
    }

    private final void a() {
        if (!this.c) {
            throw new IOException("InputStream is closed.");
        }
    }

    public final int available() {
        a();
        return this.a.available();
    }

    public final void close() {
        if (this.c) {
            this.c = false;
            Runnable runnable = this.b;
            if (runnable != null) {
                runnable.run();
                this.b = null;
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void finalize() {
        close();
    }

    public final synchronized void mark(int i) {
        this.a.mark(i);
    }

    public final boolean markSupported() {
        return true;
    }

    public final int read() {
        a();
        return this.a.read();
    }

    public final synchronized void reset() {
        a();
        this.a.reset();
    }

    public final long skip(long j) {
        a();
        return this.a.skip(j);
    }

    public final int read(byte[] bArr) {
        a();
        return this.a.read(bArr);
    }

    public final int read(byte[] bArr, int i, int i2) {
        a();
        return this.a.read(bArr, i, i2);
    }
}
