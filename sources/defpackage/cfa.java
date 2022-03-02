package defpackage;

/* renamed from: cfa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class cfa implements Runnable {
    final /* synthetic */ cfd a;

    public cfa(cfd cfd) {
        this.a = cfd;
    }

    public final void run() {
        cfd cfd = this.a;
        if (cfd.l) {
            cfd.c();
            this.a.j();
        }
    }
}
