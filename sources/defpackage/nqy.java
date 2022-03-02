package defpackage;

/* renamed from: nqy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class nqy implements Runnable {
    private final nrj a;

    public nqy(nrj nrj) {
        this.a = nrj;
    }

    public final void run() {
        nrj nrj = this.a;
        try {
            nrj.c();
        } finally {
            nrj.a();
        }
    }
}
