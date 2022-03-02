package defpackage;

import java.io.FilterOutputStream;
import java.io.OutputStream;

/* renamed from: kiy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class kiy extends FilterOutputStream {
    private final OutputStream a;
    private final kip b;
    private final long c;
    private final long d;
    private final lho e;
    private long f;
    private long g = 0;

    public kiy(OutputStream outputStream, kip kip, long j, long j2, lho lho) {
        super(outputStream);
        this.a = outputStream;
        this.b = kip;
        this.c = j;
        this.f = j2;
        long j3 = 0;
        this.d = j > 0 ? j / 200 : j3;
        this.e = lho;
    }

    private final void a() {
        this.e.a("Interrupted");
    }

    public final void write(int i) {
        a();
        this.a.write(i);
        a(1);
    }

    private final void a(long j) {
        long j2 = this.f + j;
        this.f = j2;
        if (j2 - this.g > this.d || j2 >= this.c) {
            this.a.flush();
            this.b.a(this.f, this.c);
            this.g = this.f;
        }
    }

    public final void write(byte[] bArr, int i, int i2) {
        a();
        this.a.write(bArr, i, i2);
        a((long) i2);
    }
}
