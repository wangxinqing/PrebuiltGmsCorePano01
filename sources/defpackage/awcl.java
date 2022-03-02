package defpackage;

/* renamed from: awcl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class awcl extends awcg {
    final /* synthetic */ awcm d;
    private boolean e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public awcl(awcm awcm) {
        super(awcm);
        this.d = awcm;
    }

    public final long c(batd batd, long j) {
        if (j < 0) {
            StringBuilder sb = new StringBuilder(35);
            sb.append("byteCount < 0: ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString());
        } else if (this.b) {
            throw new IllegalStateException("closed");
        } else if (this.e) {
            return -1;
        } else {
            long c = this.d.b.c(batd, j);
            if (c != -1) {
                return c;
            }
            this.e = true;
            b();
            return -1;
        }
    }

    public final void close() {
        if (!this.b) {
            if (!this.e) {
                c();
            }
            this.b = true;
        }
    }
}
