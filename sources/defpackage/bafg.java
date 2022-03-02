package defpackage;

/* renamed from: bafg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class bafg implements Runnable {
    final /* synthetic */ azyf a;
    final /* synthetic */ bafs b;

    public bafg(bafs bafs, azyf azyf) {
        this.b = bafs;
        this.a = azyf;
    }

    public final void run() {
        this.b.d.a(this.a);
    }
}
