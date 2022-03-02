package defpackage;

/* renamed from: qoe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class qoe implements Runnable {
    final /* synthetic */ aorr a;
    final /* synthetic */ qof b;

    public qoe(qof qof, aorr aorr) {
        this.b = qof;
        this.a = aorr;
    }

    public final void run() {
        if (this.a.isCancelled()) {
            this.b.b();
        }
    }
}
