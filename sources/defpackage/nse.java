package defpackage;

/* renamed from: nse  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class nse implements Runnable {
    private final nsg a;
    private final int b;

    public nse(nsg nsg, int i) {
        this.a = nsg;
        this.b = i;
    }

    public final void run() {
        this.a.a(this.b);
    }
}
