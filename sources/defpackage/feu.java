package defpackage;

/* renamed from: feu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class feu implements Runnable {
    private final long a;
    private final aosh b;

    public feu(long j, aosh aosh) {
        this.a = j;
        this.b = aosh;
    }

    public final void run() {
        new few(this.a, this.b).start();
    }
}
