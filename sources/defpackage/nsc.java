package defpackage;

/* renamed from: nsc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class nsc implements Runnable {
    private final nsg a;
    private final ntx b;

    public nsc(nsg nsg, ntx ntx) {
        this.a = nsg;
        this.b = ntx;
    }

    public final void run() {
        this.a.a(this.b);
    }
}
