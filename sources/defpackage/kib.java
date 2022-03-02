package defpackage;

import java.io.FilterInputStream;
import java.io.InputStream;
import java.security.MessageDigest;

/* renamed from: kib  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kib extends FilterInputStream {
    public MessageDigest a;
    private boolean b;
    private MessageDigest c;

    public kib(InputStream inputStream, String str) {
        super(inputStream);
        MessageDigest b2 = jhg.b(str);
        this.a = b2;
        iva.a((Object) b2, (Object) str.length() == 0 ? new String("Unable to create message digest for ") : "Unable to create message digest for ".concat(str));
        if (inputStream.markSupported()) {
            this.b = true;
            a();
        }
    }

    private final void a() {
        try {
            this.c = (MessageDigest) this.a.clone();
        } catch (CloneNotSupportedException e) {
            this.b = false;
            this.c = null;
        }
    }

    public final synchronized void mark(int i) {
        iva.a(this.b);
        a();
        super.mark(i);
    }

    public final boolean markSupported() {
        return this.b;
    }

    public final int read() {
        int read = super.read();
        if (read >= 0) {
            this.a.update((byte) (read & 255));
        }
        return read;
    }

    public final synchronized void reset() {
        iva.a(this.b);
        this.a = this.c;
        a();
        super.reset();
    }

    public final long skip(long j) {
        int read;
        byte[] bArr = new byte[1024];
        long j2 = 0;
        while (j > 0 && (read = super.read(bArr, 0, (int) Math.min(j, 1024))) >= 0) {
            this.a.update(bArr, 0, read);
            long j3 = (long) read;
            j -= j3;
            j2 += j3;
        }
        return j2;
    }

    public final int read(byte[] bArr, int i, int i2) {
        int read = super.read(bArr, i, i2);
        if (read > 0) {
            this.a.update(bArr, i, read);
        }
        return read;
    }
}
