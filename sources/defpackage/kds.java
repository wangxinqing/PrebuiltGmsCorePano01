package defpackage;

/* renamed from: kds  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class kds implements Runnable {
    final /* synthetic */ kdv a;

    public kds(kdv kdv) {
        this.a = kdv;
    }

    public final void run() {
        synchronized (this.a) {
            kdv kdv = this.a;
            kdv.c = null;
            kdv.d();
            this.a.e();
        }
    }
}
