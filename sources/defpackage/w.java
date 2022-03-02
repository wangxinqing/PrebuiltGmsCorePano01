package defpackage;

/* renamed from: w  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class w implements Runnable {
    final /* synthetic */ x a;

    public w(x xVar) {
        this.a = xVar;
    }

    public final void run() {
        boolean d = this.a.b.d();
        if (this.a.c.compareAndSet(false, true) && d) {
            x xVar = this.a;
            xVar.a.execute(xVar.e);
        }
    }
}
