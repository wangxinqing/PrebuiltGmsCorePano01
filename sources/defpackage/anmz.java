package defpackage;

import java.io.FilterOutputStream;
import java.io.OutputStream;

/* renamed from: anmz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class anmz extends FilterOutputStream {
    public long a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public anmz(OutputStream outputStream) {
        super(outputStream);
        amrl.a((Object) outputStream);
    }

    public final void close() {
        this.out.close();
    }

    public final void write(int i) {
        this.out.write(i);
        this.a++;
    }

    public final void write(byte[] bArr, int i, int i2) {
        this.out.write(bArr, i, i2);
        this.a += (long) i2;
    }
}
