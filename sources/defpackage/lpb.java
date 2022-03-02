package defpackage;

/* renamed from: lpb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class lpb implements icm {
    public final icf a;
    final /* synthetic */ lpc b;
    private final icm c;

    public lpb(lpc lpc, icf icf, icm icm) {
        this.b = lpc;
        this.a = icf;
        this.c = icm;
    }

    public final void a(icl icl) {
        lpc lpc = this.b;
        if (this == lpc.a) {
            lpc.a = null;
            this.c.a(icl);
        } else if (icl instanceof ici) {
            ((ici) icl).c();
        }
    }
}
