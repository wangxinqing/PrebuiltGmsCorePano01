package defpackage;

import java.net.ProtocolException;

/* renamed from: awcj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class awcj implements batz {
    final /* synthetic */ awcm a;
    private final batk b = new batk(this.a.c.bu());
    private boolean c;
    private long d;

    public awcj(awcm awcm, long j) {
        this.a = awcm;
        this.d = j;
    }

    public final void a(batd batd, long j) {
        if (!this.c) {
            awaj.a(batd.b, j);
            long j2 = this.d;
            if (j <= j2) {
                this.a.c.a(batd, j);
                this.d -= j;
                return;
            }
            StringBuilder sb = new StringBuilder(69);
            sb.append("expected ");
            sb.append(j2);
            sb.append(" bytes but received ");
            sb.append(j);
            throw new ProtocolException(sb.toString());
        }
        throw new IllegalStateException("closed");
    }

    public final bauc bu() {
        return this.b;
    }

    public final void close() {
        if (!this.c) {
            this.c = true;
            if (this.d <= 0) {
                awcm.a(this.b);
                this.a.d = 3;
                return;
            }
            throw new ProtocolException("unexpected end of stream");
        }
    }

    public final void flush() {
        if (!this.c) {
            this.a.c.flush();
        }
    }
}
