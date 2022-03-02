package defpackage;

import java.io.FilterOutputStream;
import java.io.OutputStream;

/* renamed from: lhb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lhb extends FilterOutputStream {
    public long a;
    private final lho b;

    public lhb(OutputStream outputStream, lho lho) {
        super(outputStream);
        iva.a((Object) lho);
        this.b = lho;
    }

    public final void a(String str) {
        write(str.getBytes());
    }

    /* access modifiers changed from: protected */
    public final void b(String str) {
        this.b.a(str);
    }

    public final void write(int i) {
        b("Interrupted");
        this.out.write(i);
        this.a++;
    }

    public final void write(byte[] bArr, int i, int i2) {
        b("Interrupted");
        this.out.write(bArr, i, i2);
        this.a += (long) i2;
    }
}
