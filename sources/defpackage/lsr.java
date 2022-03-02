package defpackage;

import java.io.FilterInputStream;
import java.io.InputStream;

/* renamed from: lsr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lsr extends FilterInputStream {
    private final long a;

    public lsr(InputStream inputStream, long j) {
        super(new anmy(inputStream));
        iva.b(j >= 0);
        this.a = j;
    }

    public final void a() {
        if (((anmy) this.in).a != this.a) {
            throw new lsq();
        }
    }
}
