package defpackage;

/* renamed from: dgn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class dgn implements ax {
    private final dgr a;

    public dgn(dgr dgr) {
        this.a = dgr;
    }

    public final void a(Object obj) {
        dgr dgr = this.a;
        csh csh = (csh) obj;
        if (dgr.e.b() == dgq.PENDING) {
            int i = csh.c;
            if (i == 2) {
                dgr.e.b(dgq.SPLASH);
            } else if (i == 3) {
                dgr.e.b(dgq.ONBOARDING);
            } else if (i == 4) {
                dgr.e.b(dgq.NAVIGATION);
            }
        }
    }
}
