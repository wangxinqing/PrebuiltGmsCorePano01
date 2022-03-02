package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: batu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class batu extends InputStream {
    final /* synthetic */ batv a;

    public batu(batv batv) {
        this.a = batv;
    }

    public final int available() {
        batv batv = this.a;
        if (!batv.c) {
            return (int) Math.min(batv.a.b, 2147483647L);
        }
        throw new IOException("closed");
    }

    public final void close() {
        this.a.close();
    }

    public final int read() {
        batv batv = this.a;
        if (!batv.c) {
            batd batd = batv.a;
            if (batd.b == 0 && batv.b.c(batd, 8192) == -1) {
                return -1;
            }
            return this.a.a.e() & 255;
        }
        throw new IOException("closed");
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 14);
        sb.append(valueOf);
        sb.append(".inputStream()");
        return sb.toString();
    }

    public final int read(byte[] bArr, int i, int i2) {
        if (!this.a.c) {
            baud.a((long) bArr.length, (long) i, (long) i2);
            batv batv = this.a;
            batd batd = batv.a;
            if (batd.b == 0 && batv.b.c(batd, 8192) == -1) {
                return -1;
            }
            return this.a.a.a(bArr, i, i2);
        }
        throw new IOException("closed");
    }
}
