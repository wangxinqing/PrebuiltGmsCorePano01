package defpackage;

import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;

/* renamed from: awck  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class awck extends awcg {
    final /* synthetic */ awcm d;
    private long e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public awck(awcm awcm, long j) {
        super(awcm);
        this.d = awcm;
        this.e = j;
        if (j == 0) {
            b();
        }
    }

    public final long c(batd batd, long j) {
        if (j < 0) {
            StringBuilder sb = new StringBuilder(35);
            sb.append("byteCount < 0: ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString());
        } else if (!this.b) {
            long j2 = this.e;
            if (j2 == 0) {
                return -1;
            }
            long c = this.d.b.c(batd, Math.min(j2, j));
            if (c != -1) {
                long j3 = this.e - c;
                this.e = j3;
                if (j3 == 0) {
                    b();
                }
                return c;
            }
            c();
            throw new ProtocolException("unexpected end of stream");
        } else {
            throw new IllegalStateException("closed");
        }
    }

    public final void close() {
        if (!this.b) {
            if (this.e != 0 && !awaj.a((baua) this, TimeUnit.MILLISECONDS)) {
                c();
            }
            this.b = true;
        }
    }
}
