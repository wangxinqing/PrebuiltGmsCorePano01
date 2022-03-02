package defpackage;

/* renamed from: bakb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class bakb {
    final /* synthetic */ azzl a;
    final /* synthetic */ bakf b;

    public bakb(bakf bakf, azzl azzl) {
        this.b = bakf;
        this.a = azzl;
    }

    public final void a(azya azya) {
        azzm azzm;
        bakf bakf = this.b;
        azzl azzl = this.a;
        azxz azxz = azya.a;
        if (azxz != azxz.SHUTDOWN) {
            int ordinal = azxz.ordinal();
            if (ordinal == 0) {
                azzm = new bakc(azzh.a);
            } else if (ordinal == 1) {
                azzm = new bakc(azzh.a(azzl));
            } else if (ordinal == 2) {
                azzm = new bakc(azzh.a(azya.b));
            } else if (ordinal == 3) {
                azzm = new bake(bakf, azzl);
            } else {
                String valueOf = String.valueOf(azxz);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 18);
                sb.append("Unsupported state:");
                sb.append(valueOf);
                throw new IllegalArgumentException(sb.toString());
            }
            bakf.c.a(azxz, azzm);
        }
    }
}
