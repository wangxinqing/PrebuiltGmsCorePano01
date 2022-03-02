package defpackage;

import java.net.ProtocolException;

/* renamed from: awda  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class awda implements batz {
    public final batd a;
    private boolean b;
    private final int c;

    public awda() {
        this(-1);
    }

    public final void a(batd batd, long j) {
        if (!this.b) {
            awaj.a(batd.b, j);
            int i = this.c;
            if (i == -1 || this.a.b <= ((long) i) - j) {
                this.a.a(batd, j);
                return;
            }
            StringBuilder sb = new StringBuilder(50);
            sb.append("exceeded content-length limit of ");
            sb.append(i);
            sb.append(" bytes");
            throw new ProtocolException(sb.toString());
        }
        throw new IllegalStateException("closed");
    }

    public final bauc bu() {
        return bauc.f;
    }

    public final void close() {
        if (!this.b) {
            this.b = true;
            long j = this.a.b;
            int i = this.c;
            if (j < ((long) i)) {
                StringBuilder sb = new StringBuilder(76);
                sb.append("content-length promised ");
                sb.append(i);
                sb.append(" bytes, but received ");
                sb.append(j);
                throw new ProtocolException(sb.toString());
            }
        }
    }

    public final void flush() {
    }

    public awda(int i) {
        this.a = new batd();
        this.c = i;
    }

    public final void a(batz batz) {
        batd batd = new batd();
        batd batd2 = this.a;
        batd2.b(batd, batd2.b);
        batz.a(batd, batd.b);
    }
}
