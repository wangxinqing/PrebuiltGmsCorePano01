package defpackage;

/* renamed from: lsc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class lsc implements Runnable {
    final /* synthetic */ lsf a;

    public lsc(lsf lsf) {
        this.a = lsf;
    }

    public final void run() {
        this.a.c.run();
        synchronized (this.a) {
            lsf lsf = this.a;
            int i = lsf.h;
            if (i != 0) {
                lsf.h = 1;
                if (i == 3) {
                    lsf.b.run();
                }
            } else {
                throw null;
            }
        }
    }
}
