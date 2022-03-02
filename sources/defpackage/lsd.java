package defpackage;

/* renamed from: lsd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class lsd implements Runnable {
    final /* synthetic */ lsf a;

    public lsd(lsf lsf) {
        this.a = lsf;
    }

    public final void run() {
        synchronized (this.a) {
            this.a.f = System.currentTimeMillis();
            lsf lsf = this.a;
            lsf.g = false;
            int i = lsf.h;
            if (i == 0) {
                throw null;
            } else if (i == 1) {
                lsf.h = 2;
                lsf.e.execute(lsf.a);
            } else {
                lsf.h = 3;
            }
        }
    }
}
