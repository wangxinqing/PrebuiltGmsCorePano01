package defpackage;

import java.io.FilterInputStream;
import java.io.InputStream;

/* renamed from: auaa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class auaa extends FilterInputStream {
    private int a;

    public auaa(InputStream inputStream, int i) {
        super(inputStream);
        this.a = i;
    }

    public final int available() {
        return Math.min(super.available(), this.a);
    }

    public final int read() {
        if (this.a <= 0) {
            return -1;
        }
        int read = super.read();
        if (read >= 0) {
            this.a--;
        }
        return read;
    }

    public final long skip(long j) {
        long skip = super.skip(Math.min(j, (long) this.a));
        if (skip >= 0) {
            this.a = (int) (((long) this.a) - skip);
        }
        return skip;
    }

    public final int read(byte[] bArr, int i, int i2) {
        int i3 = this.a;
        if (i3 <= 0) {
            return -1;
        }
        int read = super.read(bArr, i, Math.min(i2, i3));
        if (read >= 0) {
            this.a -= read;
        }
        return read;
    }
}
