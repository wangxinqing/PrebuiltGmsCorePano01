package defpackage;

/* renamed from: apzs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class apzs extends baaz {
    final /* synthetic */ apzt a;
    private baaf b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public apzs(apzt apzt, azxk azxk) {
        super(azxk);
        this.a = apzt;
    }

    public final void a(baaf baaf) {
        this.b = baaf;
    }

    public final void a(babj babj, baaf baaf) {
        babg babg = babj.r;
        if (!babg.equals(babg.UNAUTHENTICATED) && !babg.equals(babg.PERMISSION_DENIED)) {
            baaf baaf2 = this.b;
            if (baaf2 != null) {
                this.j.a(baaf2);
                this.b = null;
            }
            this.j.a(babj, baaf);
            return;
        }
        apzt apzt = this.a;
        synchronized (apzt.a) {
            apzt.c = apzt.d.a(apzt.e, apzt.f.a(apzm.a, (Object) true));
            for (Runnable run : apzt.b) {
                run.run();
            }
        }
    }

    public final void a(Object obj) {
        baaf baaf = this.b;
        if (baaf != null) {
            this.j.a(baaf);
            this.b = null;
        }
        this.j.a(obj);
    }
}
