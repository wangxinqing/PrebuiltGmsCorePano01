package defpackage;

import java.io.InputStream;

/* renamed from: batc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class batc extends InputStream {
    final /* synthetic */ batd a;

    public batc(batd batd) {
        this.a = batd;
    }

    public final int available() {
        return (int) Math.min(this.a.b, 2147483647L);
    }

    public final void close() {
    }

    public final int read() {
        batd batd = this.a;
        if (batd.b > 0) {
            return batd.e() & 255;
        }
        return -1;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 14);
        sb.append(valueOf);
        sb.append(".inputStream()");
        return sb.toString();
    }

    public final int read(byte[] bArr, int i, int i2) {
        return this.a.a(bArr, i, i2);
    }
}
