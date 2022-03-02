package defpackage;

/* renamed from: awch  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class awch implements batz {
    final /* synthetic */ awcm a;
    private final batk b = new batk(this.a.c.bu());
    private boolean c;

    public awch(awcm awcm) {
        this.a = awcm;
    }

    public final void a(batd batd, long j) {
        if (this.c) {
            throw new IllegalStateException("closed");
        } else if (j != 0) {
            batt batt = (batt) this.a.c;
            if (!batt.c) {
                batt.a.j(j);
                batt.p();
                this.a.c.b("\r\n");
                this.a.c.a(batd, j);
                this.a.c.b("\r\n");
                return;
            }
            throw new IllegalStateException("closed");
        }
    }

    public final bauc bu() {
        return this.b;
    }

    public final synchronized void close() {
        if (!this.c) {
            this.c = true;
            this.a.c.b("0\r\n\r\n");
            awcm.a(this.b);
            this.a.d = 3;
        }
    }

    public final synchronized void flush() {
        if (!this.c) {
            this.a.c.flush();
        }
    }
}
