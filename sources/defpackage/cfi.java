package defpackage;

/* renamed from: cfi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class cfi implements Runnable {
    final /* synthetic */ cfj a;

    public cfi(cfj cfj) {
        this.a = cfj;
    }

    public final void run() {
        this.a.c();
        cfj cfj = this.a;
        gra.b(cfj.d, cfj.g).d().a(this.a.a.a(bvq.a("SunStateProducer_getLocationSnapshot")), (acvp) this.a.j);
    }
}
