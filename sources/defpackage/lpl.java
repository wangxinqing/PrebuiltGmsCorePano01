package defpackage;

/* renamed from: lpl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lpl {
    final /* synthetic */ lpq a;

    public lpl(lpq lpq) {
        this.a = lpq;
    }

    public final void a() {
        lpq lpq = this.a;
        lpq.m.removeCallbacks(lpq.b);
        this.a.m.a(false);
    }

    public final void a(boolean z) {
        if (z) {
            this.a.n.scrollToPosition(0);
        }
        this.a.n.setEnabled(true);
        this.a.l.p();
        lpq lpq = this.a;
        if (lpq.k != null && (lpq.j.a() > 1 || !this.a.j.h)) {
            lfq lfq = this.a.k;
            lfq.h();
            lfq.a();
            this.a.k = null;
        }
        a();
        lpq lpq2 = this.a;
        lpq2.n.setAdapter(lpq2.j);
        lpq lpq3 = this.a;
        lpq3.n.b = lpq3.c;
    }
}
