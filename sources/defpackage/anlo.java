package defpackage;

import java.io.FilterOutputStream;
import java.io.OutputStream;

/* renamed from: anlo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class anlo extends FilterOutputStream {
    public final anlj a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public anlo(anli anli, OutputStream outputStream) {
        super(outputStream);
        amrl.a((Object) outputStream);
        anlj a2 = anli.a();
        amrl.a((Object) a2);
        this.a = a2;
    }

    public final void close() {
        this.out.close();
    }

    public final void write(int i) {
        this.a.b((byte) i);
        this.out.write(i);
    }

    public final void write(byte[] bArr, int i, int i2) {
        this.a.b(bArr, i, i2);
        this.out.write(bArr, i, i2);
    }
}
