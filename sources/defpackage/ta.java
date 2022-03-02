package defpackage;

/* renamed from: ta  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ta implements Runnable {
    final /* synthetic */ tn a;

    public ta(tn tnVar) {
        this.a = tnVar;
    }

    public final void run() {
        tn tnVar = this.a;
        tnVar.m.showAtLocation(tnVar.l, 55, 0, 0);
        this.a.u();
        if (this.a.t()) {
            this.a.l.setAlpha(0.0f);
            tn tnVar2 = this.a;
            qg m = qb.m(tnVar2.l);
            m.a(1.0f);
            tnVar2.o = m;
            this.a.o.a((qh) new sz(this));
            return;
        }
        this.a.l.setAlpha(1.0f);
        this.a.l.setVisibility(0);
    }
}
