package defpackage;

/* renamed from: dzi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class dzi implements icm {
    public boolean a;
    final /* synthetic */ dzj b;

    public dzi(dzj dzj) {
        this.b = dzj;
    }

    public final /* bridge */ /* synthetic */ void a(icl icl) {
        wlm wlm = (wlm) icl;
        if (!this.a) {
            if (wlm.aO().c()) {
                dzj dzj = this.b;
                ilg ilg = dzj.c;
                if (ilg == null) {
                    dzj.c = new ilg(wlm.b());
                } else {
                    dzj.c = ilg.a(ilg, wlm.b());
                }
            }
            this.b.b = wlm.d();
            dzj dzj2 = this.b;
            dzj2.d = null;
            dzj2.b(wlm.aO(), this.b.c);
        }
    }
}
