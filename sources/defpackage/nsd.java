package defpackage;

/* renamed from: nsd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class nsd implements Runnable {
    private final nsg a;
    private final ntx b;

    public nsd(nsg nsg, ntx ntx) {
        this.a = nsg;
        this.b = ntx;
    }

    public final void run() {
        this.a.b(this.b);
    }
}
