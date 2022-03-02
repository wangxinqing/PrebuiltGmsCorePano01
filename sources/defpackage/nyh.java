package defpackage;

/* renamed from: nyh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class nyh implements Runnable {
    private final nyi a;
    private final nyn b;
    private final ntx c;

    public nyh(nyi nyi, nyn nyn, ntx ntx) {
        this.a = nyi;
        this.b = nyn;
        this.c = ntx;
    }

    public final void run() {
        this.a.a(this.b, this.c);
    }
}
