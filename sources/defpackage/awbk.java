package defpackage;

import java.util.logging.Level;

/* renamed from: awbk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class awbk implements baua {
    int a;
    byte b;
    int c;
    int d;
    short e;
    private final batf f;

    public awbk(batf batf) {
        this.f = batf;
    }

    public final bauc bu() {
        return this.f.bu();
    }

    public final long c(batd batd, long j) {
        int i;
        int g;
        do {
            int i2 = this.d;
            if (i2 == 0) {
                this.f.h((long) this.e);
                this.e = 0;
                if ((this.b & 4) != 0) {
                    return -1;
                }
                i = this.c;
                int a2 = awbo.a(this.f);
                this.d = a2;
                this.a = a2;
                byte e2 = (byte) (this.f.e() & 255);
                this.b = (byte) (this.f.e() & 255);
                if (awbo.a.isLoggable(Level.FINE)) {
                    awbo.a.logp(Level.FINE, "com.squareup.okhttp.internal.framed.Http2$ContinuationSource", "readContinuationHeader", awbl.a(true, this.c, this.a, e2, this.b));
                }
                g = this.f.g() & Integer.MAX_VALUE;
                this.c = g;
                if (e2 != 9) {
                    throw awbo.b("%s != TYPE_CONTINUATION", Byte.valueOf(e2));
                }
            } else {
                long c2 = this.f.c(batd, Math.min(j, (long) i2));
                if (c2 == -1) {
                    return -1;
                }
                this.d = (int) (((long) this.d) - c2);
                return c2;
            }
        } while (g == i);
        throw awbo.b("TYPE_CONTINUATION streamId changed", new Object[0]);
    }

    public final void close() {
    }
}
