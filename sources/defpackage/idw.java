package defpackage;

/* renamed from: idw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class idw implements Runnable {
    final /* synthetic */ idz a;

    public idw(idz idz) {
        this.a = idz;
    }

    public final void run() {
        this.a.g.lock();
        try {
            this.a.h();
        } finally {
            this.a.g.unlock();
        }
    }
}
