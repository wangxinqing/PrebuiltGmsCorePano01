package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: bato  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class bato implements baua {
    final /* synthetic */ bauc a;
    final /* synthetic */ InputStream b;

    public bato(bauc bauc, InputStream inputStream) {
        this.a = bauc;
        this.b = inputStream;
    }

    public final bauc bu() {
        return this.a;
    }

    public final long c(batd batd, long j) {
        if (j < 0) {
            StringBuilder sb = new StringBuilder(35);
            sb.append("byteCount < 0: ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString());
        } else if (j == 0) {
            return 0;
        } else {
            try {
                this.a.e();
                batw a2 = batd.a(1);
                int read = this.b.read(a2.a, a2.c, (int) Math.min(j, (long) (8192 - a2.c)));
                if (read == -1) {
                    return -1;
                }
                a2.c += read;
                long j2 = (long) read;
                batd.b += j2;
                return j2;
            } catch (AssertionError e) {
                if (batq.a(e)) {
                    throw new IOException(e);
                }
                throw e;
            }
        }
    }

    public final void close() {
        this.b.close();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 8);
        sb.append("source(");
        sb.append(valueOf);
        sb.append(")");
        return sb.toString();
    }
}
