package defpackage;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: atn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class atn extends FilterInputStream {
    final /* synthetic */ atp a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public atn(atp atp, InputStream inputStream) {
        super(inputStream);
        this.a = atp;
    }

    public final int read() {
        atp atp = this.a;
        int i = atp.e;
        if (i == -1 || atp.d < i) {
            int read = super.read();
            this.a.d++;
            return read;
        }
        throw new IOException();
    }

    public final long skip(long j) {
        atp atp = this.a;
        int i = atp.e;
        if (i == -1 || atp.d < i) {
            long skip = super.skip(j);
            if (skip > 0) {
                this.a.d += (int) skip;
            }
            return skip;
        }
        throw new IOException();
    }

    public final int read(byte[] bArr, int i, int i2) {
        atp atp = this.a;
        int i3 = atp.e;
        if (i3 == -1 || atp.d < i3) {
            int read = super.read(bArr, i, i2);
            if (read > 0) {
                this.a.d += read;
            }
            return read;
        }
        throw new IOException();
    }
}
