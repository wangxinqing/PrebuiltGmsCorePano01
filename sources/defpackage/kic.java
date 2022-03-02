package defpackage;

import java.io.FilterOutputStream;
import java.io.OutputStream;
import java.security.MessageDigest;

/* renamed from: kic  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kic extends FilterOutputStream {
    public final MessageDigest a = jhg.b("SHA-256");
    public long b;

    public kic(OutputStream outputStream) {
        super(outputStream);
    }

    public final void write(int i) {
        this.out.write(i);
        this.b++;
        this.a.update((byte) i);
    }

    public final void write(byte[] bArr) {
        this.out.write(bArr);
        this.b += (long) bArr.length;
        this.a.update(bArr);
    }

    public final void write(byte[] bArr, int i, int i2) {
        this.out.write(bArr, i, i2);
        this.b += (long) i2;
        this.a.update(bArr, i, i2);
    }
}
