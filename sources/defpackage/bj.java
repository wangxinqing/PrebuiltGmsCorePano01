package defpackage;

/* renamed from: bj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class bj implements ax {
    as a;
    final /* synthetic */ o b;
    final /* synthetic */ au c;

    public bj(o oVar, au auVar) {
        this.b = oVar;
        this.c = auVar;
    }

    public final void a(Object obj) {
        as asVar = (as) this.b.a(obj);
        as asVar2 = this.a;
        if (asVar2 != asVar) {
            if (asVar2 != null) {
                this.c.a(asVar2);
            }
            this.a = asVar;
            if (asVar != null) {
                this.c.a(asVar, new bi(this));
            }
        }
    }
}
