package defpackage;

/* renamed from: yrk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class yrk implements icm {
    public boolean a;
    final /* synthetic */ yrl b;

    public yrk(yrl yrl) {
        this.b = yrl;
    }

    public final /* bridge */ /* synthetic */ void a(icl icl) {
        wlm wlm = (wlm) icl;
        if (!this.a) {
            if (wlm.aO().c()) {
                yrl yrl = this.b;
                ilg ilg = yrl.c;
                if (ilg == null) {
                    yrl.c = new ilg(wlm.b());
                } else {
                    yrl.c = ilg.a(ilg, wlm.b());
                }
            }
            this.b.b = wlm.d();
            yrl yrl2 = this.b;
            yrl2.d = null;
            yrl2.b(wlm.aO(), this.b.c);
        }
    }
}
