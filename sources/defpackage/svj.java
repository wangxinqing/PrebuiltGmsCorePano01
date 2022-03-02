package defpackage;

/* renamed from: svj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class svj implements Runnable {
    final /* synthetic */ svv a;
    final /* synthetic */ sut b;

    public svj(svv svv, sut sut) {
        this.a = svv;
        this.b = sut;
    }

    public final void run() {
        svi svi = this.a.r;
        if (svi != null) {
            svi.a.s();
            svi.a(svi.a.a.getPackageName());
            return;
        }
        this.b.c.a("Install Referrer Reporter is null");
    }
}
