package defpackage;

/* renamed from: dmh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class dmh implements Runnable {
    final /* synthetic */ dpf a;
    final /* synthetic */ dmj b;

    public dmh(dmj dmj, dpf dpf) {
        this.b = dmj;
        this.a = dpf;
    }

    public final void run() {
        if (!this.b.c.b()) {
            this.b.c.c("Connected to service after a timeout");
            dmk dmk = this.b.c;
            dpf dpf = this.a;
            dkw.a();
            dmk.b = dpf;
            dmk.s();
            dly i = dmk.i();
            dkw.a();
            i.a.b();
        }
    }
}
