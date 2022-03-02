package defpackage;

/* renamed from: nrf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class nrf implements Runnable {
    private final nrj a;
    private final amnc b;

    public nrf(nrj nrj, amnc amnc) {
        this.a = nrj;
        this.b = amnc;
    }

    public final void run() {
        this.a.b(this.b);
    }
}
