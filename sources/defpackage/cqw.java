package defpackage;

import java.io.FilterOutputStream;
import java.io.OutputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: cqw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class cqw extends FilterOutputStream {
    public final MessageDigest a;
    public long b;
    private final OutputStream c;

    public cqw(OutputStream outputStream) {
        super(outputStream);
        this.c = outputStream;
        try {
            this.a = MessageDigest.getInstance("SHA-256");
            this.b = 0;
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    public final void write(int i) {
        this.a.update((byte) i);
        this.b++;
        this.c.write(i);
    }

    public final void write(byte[] bArr, int i, int i2) {
        this.a.update(bArr, i, i2);
        this.b += (long) i2;
        this.c.write(bArr, i, i2);
    }
}
