package defpackage;

/* renamed from: bahi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class bahi implements Runnable {
    final /* synthetic */ bahv a;

    public bahi(bahv bahv) {
        this.a = bahv;
    }

    public final void run() {
        this.a.d.a(2, "Terminated");
        bahv bahv = this.a;
        baho baho = bahv.a;
        baho.a.i.u.remove(bahv);
        azyv.b(baho.a.i.F.d, bahv);
        baho.a.i.n();
    }
}
