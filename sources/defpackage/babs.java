package defpackage;

/* renamed from: babs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class babs implements Runnable {
    final /* synthetic */ babu a;
    final /* synthetic */ babw b;

    public babs(babw babw, babu babu) {
        this.b = babw;
        this.a = babu;
    }

    public final void run() {
        this.b.c.unregisterNetworkCallback(this.a);
    }
}
