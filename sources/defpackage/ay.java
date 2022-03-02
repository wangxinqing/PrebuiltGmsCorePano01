package defpackage;

/* renamed from: ay  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ay implements Runnable {
    final /* synthetic */ bc a;

    public ay(bc bcVar) {
        this.a = bcVar;
    }

    public final void run() {
        bc bcVar = this.a;
        if (bcVar.b == 0) {
            bcVar.c = true;
            bcVar.e.a(ac.ON_PAUSE);
        }
        this.a.c();
    }
}
