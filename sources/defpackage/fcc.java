package defpackage;

/* renamed from: fcc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class fcc implements aora {
    final /* synthetic */ fce a;

    public fcc(fce fce) {
        this.a = fce;
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        amri amri = (amri) obj;
        fce fce = this.a;
        fce.a(fce.c, true);
        if (amri.a()) {
            this.a.c = amri.b();
            this.a.e();
            return;
        }
        this.a.a.run();
    }

    public final void a(Throwable th) {
        fce fce = this.a;
        fce.a(fce.c, false);
        this.a.b.a(th);
    }
}
