package defpackage;

/* renamed from: dgo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class dgo implements ax {
    private final dgr a;

    public dgo(dgr dgr) {
        this.a = dgr;
    }

    public final void a(Object obj) {
        dgr dgr = this.a;
        cso cso = (cso) obj;
        if (dgr.e.b() != dgq.SPLASH) {
            return;
        }
        if (((csh) dgr.f.b()).c == 3) {
            dgr.e.b(dgq.ONBOARDING);
        } else {
            dgr.e.b(dgq.NAVIGATION);
        }
    }
}
