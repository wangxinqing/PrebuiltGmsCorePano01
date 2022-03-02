package defpackage;

/* renamed from: bahy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class bahy implements Runnable {
    final /* synthetic */ baic a;

    public bahy(baic baic) {
        this.a = baic;
    }

    public final void run() {
        boolean z;
        synchronized (this.a) {
            baic baic = this.a;
            if (baic.i != 6) {
                baic.i = 6;
                z = true;
            } else {
                z = false;
            }
        }
        if (z) {
            this.a.j.a.b(babj.o.a("Keepalive failed. The connection is likely gone"));
        }
    }
}
