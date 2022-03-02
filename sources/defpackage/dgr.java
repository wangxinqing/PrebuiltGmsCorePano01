package defpackage;

/* renamed from: dgr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dgr {
    public final dhe a;
    public final dfd b;
    public final dhl c;
    public final dgk d;
    public final au e = new au();
    public final as f;

    public dgr(dfd dfd, dhe dhe, dhl dhl, dfy dfy, dgk dgk) {
        this.b = dfd;
        this.a = dhe;
        this.c = dhl;
        this.d = dgk;
        this.f = dgk.b;
        if (dhl.b().b == 1 || dhl.b().b == 11100) {
            this.e.b(dgq.PENDING);
            this.e.a(this.f, new dgn(this));
            csg.a(this.e, dfy.b, new dgo(this));
            csg.a(this.e, dfy.c, new dgp(this));
            return;
        }
        this.e.b(dgq.NAVIGATION);
    }
}
